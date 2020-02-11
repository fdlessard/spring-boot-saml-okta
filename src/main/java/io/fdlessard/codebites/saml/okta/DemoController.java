package io.fdlessard.codebites.saml.okta;

import java.security.Principal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @RequestMapping("/")
    public String helloWorld(Principal principal) {
        log.info("Principal : " + principal);
        return "Hello World";
    }
}