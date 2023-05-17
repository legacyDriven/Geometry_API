package com.eugeniusz.geometry_api.api;

import com.eugeniusz.geometry_api.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class AuthenticationEndpoint {

    UserService userService;

    @GetMapping
    public String hello() {
        log.info("Hello");
        return "Hello";
    }

//    AuthenticationService authenticationService;

//    @PostMapping("/register")
//    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) {
//        log.info("Registering user: {}", request);
//        return ResponseEntity.ok(authenticationService.register(request));
//
//    }
//
//    @PostMapping("/authenticate")
//    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request) {
//        log.info("Registering user: {}", request);
//        return ResponseEntity.ok(authenticationService.authenticate(request));
//    }
}
