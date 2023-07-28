package hello.springmvc.basic.request;

import hello.springmvc.basic.HelloData;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class RequestParamController {

    @RequestMapping("/request-param-v1")
    public void requestParamV1(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        log.info("username = {} , age = {} ", username, age);
        response.getWriter().write("OK");
    }

    @ResponseBody // RestController 와 동일한 기능
    @RequestMapping("request-param-v2")
    public String requestParamV2(
        @RequestParam("username") String memberName,
        @RequestParam("age") int memberAge
    ) {
        log.info("username = {} , age = {} ", memberName, memberAge);
        return "ok";
    }

    @ResponseBody // RestController 와 동일한 기능
    @RequestMapping("request-param-v3")
    public String requestParamV3(
        @RequestParam String username,
        @RequestParam int age
    ) {
        log.info("username = {} , age = {} ", username, age);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("request-param-v4")
    public String requestParamV4(String username, int age) { // 파라미터와 변수이름이 같다면 @RequestParam 없어도 됨.
        log.info("username = {} , age = {} ", username, age);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("request-param-required")
    public String requestParamRequired(
        @RequestParam(required = true) String username,
        @RequestParam(required = false) Integer age) {
        log.info("username = {} , age = {} ", username, age);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("request-param-default")
    public String requestParamDefault(
        /**
         * defaultValue 는 빈 문자의 경우에도 설정한 기본 값이 적용된다.
         * /request-param-default?username=
         * 위처럼 요청시 defaultValue 적용됨.
         */
        @RequestParam(required = true, defaultValue = "guest") String username,
        @RequestParam(required = false, defaultValue = "-1") Integer age) {
        log.info("username = {} , age = {} ", username, age);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("request-param-map")
    public String requestParamMap(@RequestParam Map<String, Objects> paramMap) {
        log.info("username = {} , age = {} ", paramMap.get("username"), paramMap.get("age"));
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/model-attribute-v1")
    public String modelAttributeV1(@ModelAttribute HelloData helloData) {
        log.info("username = {} , age = {} ", helloData.getUsername(), helloData.getAge());
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/model-attribute-v2")
    public String modelAttributeV2(HelloData helloData) {
        log.info("username = {} , age = {} ", helloData.getUsername(), helloData.getAge());
        return "ok";
    }
}
