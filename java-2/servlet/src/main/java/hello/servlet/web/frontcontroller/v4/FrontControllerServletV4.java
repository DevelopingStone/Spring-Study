package hello.servlet.web.frontcontroller.v4;

import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.v4.controller.MemberFormControllerV4;
import hello.servlet.web.frontcontroller.v4.controller.MemberListControllerV4;
import hello.servlet.web.frontcontroller.v4.controller.MemberSaveControllerV4;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "frontControllerServletV4" , urlPatterns = "/front-controller/v4/*")
public class FrontControllerServletV4 extends HttpServlet {

    private Map<String , ControllerV4> controllerMap = new HashMap<>();

    public FrontControllerServletV4() {
        controllerMap.put("/front-controller/v4/members/new-form", new MemberFormControllerV4());
        controllerMap.put("/front-controller/v4/members/save", new MemberSaveControllerV4());
        controllerMap.put("/front-controller/v4/members", new MemberListControllerV4());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String requestURI = request.getRequestURI(); // URI 정보를 받는다.

        ControllerV4 controller = controllerMap.get(requestURI);

        if (controller == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        // paramMap 을 넘겨주어야 함

        Map<String, String> paraMap = createParamMap(request);

        Map<String, Object> model = new HashMap<>(); // 추가

        String viewName = controller.process(paraMap, model);

        MyView view = viewResolver(viewName);

        view.render(model , request, response);

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
