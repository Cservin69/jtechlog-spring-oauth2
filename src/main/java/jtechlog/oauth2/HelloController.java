package jtechlog.oauth2;

import org.springframework.security.oauth2.core.oidc.StandardClaimNames;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public HelloResponse sayHello(JwtAuthenticationToken jwtAuthenticationToken) {
        System.out.println(jwtAuthenticationToken.getName());
        System.out.println(jwtAuthenticationToken.getAuthorities());
        System.out.println(jwtAuthenticationToken.getTokenAttributes().get(StandardClaimNames.PREFERRED_USERNAME));

        return new HelloResponse("Hello JWT!");
    }
}
