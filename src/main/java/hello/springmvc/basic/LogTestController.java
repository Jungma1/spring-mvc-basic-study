package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        // + 연산자를 쓰면 불필요한 연산이 발생하므로 log.trace({}, name); 형식으로 쓰는게 좋음
//        log.trace("trace log=" + name);

        log.trace("trace log={}", name); // trace log=Spring
        log.debug("debug log={}", name); // 개발시
        log.info("info log={}", name); // 운영시
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
