package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.v3.controller.MemberFormControllerV3;
import hello.servlet.web.frontcontroller.v3.controller.MemberListControllerV3;
import hello.servlet.web.frontcontroller.v3.controller.MemberSaveControllerV3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "frontControllerServletV3" , urlPatterns = "/front-controller/v3/*")
public class FrontControllerServletV3 extends HttpServlet {

    private Map<String , ControllerV3> controllerMap = new HashMap<>();

    public FrontControllerServletV3() {
        controllerMap.put("/front-controller/v3/members/new-form", new MemberFormControllerV3());
        controllerMap.put("/front-controller/v3/members/save", new MemberSaveControllerV3());
        controllerMap.put("/front-controller/v3/members", new MemberListControllerV3());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String requestURI = request.getRequestURI(); // URI 정보를 받는다.

        ControllerV3 controller = controllerMap.get(requestURI);

        if (controller == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        // paramMap 을 넘겨주어야 함

        Map<String, String> paraMap = createParamMap(request);
        ModelView mv = controller.process(paraMap);

        // 논리적 주소를 물리적 주소로 반환해야한다.
        String viewName = mv.getViewName();

        // 아래 코드를 통해 파일의 경로나 확장자를 유연하게 대처할 수 있다.
        MyView view = viewResolver(viewName);
        view.render(mv.getModel() , request, response); // 추가된 코드

    }

    private static MyView viewResolver(String viewName) {
        // 객체를 생성하는것은 service 클래스에 준위가 맞지 않기 때문에 따로 클래스를 뽑아 주는게 좋다.
        return new MyView("/WEB-INF/views/" + viewName + ".jsp");
    }

    private static Map<String, String> createParamMap(HttpServletRequest request) { // ctrl+alt+M - 람다식 메서드 반환
        Map<String, String> paraMap = new HashMap<>();
        request.getParameterNames().asIterator()
            .forEachRemaining(paramName -> paraMap.put(paramName, request.getParameter(paramName)));
        // paramMap 에 request 에 있는 모든 파라미터를 넣어준다.
        return paraMap;
    }
}
