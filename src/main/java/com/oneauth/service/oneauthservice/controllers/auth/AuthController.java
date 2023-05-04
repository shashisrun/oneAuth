package com.oneauth.service.oneauthservice.controllers.auth;

import com.oneauth.service.oneauthservice.models.User;
import com.oneauth.service.oneauthservice.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationService service;

    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<AuthenticationResponse> Login(@RequestBody LoginRequest request){
        return ResponseEntity.ok(service.authenticate(request));
    }

    @PostMapping("/register")
    @ResponseBody
    public ResponseEntity<AuthenticationResponse> Register(@RequestBody RegisterRequest request){

        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/logout")
    @ResponseBody
    public String Logout(@RequestBody HashMap body){
        var context = new AnnotationConfigApplicationContext(User.class);
        System.out.println(context);
        System.out.println(context.getBean((String) body.get("method")));
        System.out.println(body.get("method"));
//        System.out.println(data);
        return "Logging In";
    }

    @PostMapping("/forgot-password")
    @ResponseBody
    public String ForgotPassword(@RequestBody HashMap body){
        var context = new AnnotationConfigApplicationContext(User.class);
        System.out.println(context);
        System.out.println(context.getBean((String) body.get("method")));
        System.out.println(body.get("method"));
//        System.out.println(data);
        return "Logging In";
    }
}
