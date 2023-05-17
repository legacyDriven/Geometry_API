//package com.eugeniusz.geometry_api.service;
//
//import com.eugeniusz.geometry_api.api.model.AuthenticationRequest;
//import com.eugeniusz.geometry_api.api.model.AuthenticationResponse;
//import com.eugeniusz.geometry_api.api.model.RegisterRequest;
//import com.eugeniusz.geometry_api.config.security.JwtService;
//import com.eugeniusz.geometry_api.model.Role;
//import com.eugeniusz.geometry_api.model.User;
//import com.eugeniusz.geometry_api.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.experimental.FieldDefaults;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//// amigoscode/springboot-jwt
//@Service
//@RequiredArgsConstructor
//@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
//public class AuthenticationService {
//
//    UserRepository userRepository;
//
//    PasswordEncoder passwordEncoder;
//
//    JwtService jwtService;
//
////    public UserDto findByLogin(String issuer) {
////    }
//
//
//    public AuthenticationResponse register(RegisterRequest request) {
//        var user = User.builder()
//                .firstName(request.getFirstName())
//                .lastName(request.getLastName())
//                .email(request.getEmail())
//                .password(passwordEncoder.encode(request.getPassword()))
//                .role(Role.USER)
//                .build();
//        userRepository.save(user);
//        var jwtToken = jwtService.generateToken(user);
//
//        return new AuthenticationResponse(jwtToken);
//    }
//
//    public AuthenticationResponse authenticate(AuthenticationRequest request) {
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(
//                        request.getEmail(),
//                        request.getPassword()
//                )
//        );
//        var user = userRepository.findByEmail(request.getEmail())
//                .orElseThrow();
//        var jwtToken = jwtService.generateToken(user);
//        var refreshToken = jwtService.generateRefreshToken(user);
//        revokeAllUserTokens(user);
//        saveUserToken(user, jwtToken);
//        return AuthenticationResponse.builder()
//                .accessToken(jwtToken)
//                .refreshToken(refreshToken)
//                .build();
//    }
//}
