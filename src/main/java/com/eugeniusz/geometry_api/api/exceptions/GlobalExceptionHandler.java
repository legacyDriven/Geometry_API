package com.eugeniusz.geometry_api.api.exceptions;

public class GlobalExceptionHandler {
    //todo zamienic gowno na cos sensownego

    /*
    a to gowno: zwroc uwage na exception handling
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .exceptionHandling().authenticationEntryPoint(userAuthenticationEntryPoint)
                .and()
                .addFilterBefore(new UsernamePasswordAuthFilter(userAuthenticationProvider), BasicAuthenticationFilter.class)
                .addFilterBefore(new JwtAuthFilter(userAuthenticationProvider), UsernamePasswordAuthFilter.class)
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeHttpRequests(authz -> authz
                                .requestMatchers(HttpMethod.POST, "/api/v1/auth/signIn").permitAll()
                                .anyRequest().authenticated());
        return http.build();
//                        .antMatchers("/api/v1/geometry/**").authenticated() // http://localhost:8080/api/v1/geometry/point
//                        .antMatchers("/api/v1/user/**").permitAll()   // http://localhost:8080/api/v1/user/signIn
//                        .antMatchers("/api/v1/auth/**").permitAll()  // http://localhost:8080/api/v1/auth/signIn
//                        .anyReque
    to cos sensownego
    package com.sergio.socialnetwork.exception;

import com.sergio.socialnetwork.dto.ErrorDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<ErrorDto> handleAuthenticationException(AuthenticationException ex) {
        ErrorDto errorDto = new ErrorDto("Unauthorized path");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(errorDto, headers, HttpStatus.UNAUTHORIZED);
    }
}

     */
}
