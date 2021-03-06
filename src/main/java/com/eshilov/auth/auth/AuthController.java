package com.eshilov.auth.auth;

import static org.springframework.http.HttpStatus.OK;

import com.eshilov.auth.generated.api.AuthApi;
import com.eshilov.auth.generated.model.*;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController implements AuthApi {

    private final AuthService authService;

    @Override
    public ResponseEntity<SignUpResponse> signUp(@Valid SignUpRequest signUpRequest) {
        var response = authService.signUp(signUpRequest);
        return ResponseEntity.status(OK).body(response);
    }

    @Override
    public ResponseEntity<TokenPair> logIn(@Valid LogInRequest logInRequest) {
        var response = authService.logIn(logInRequest);
        return ResponseEntity.status(OK).body(response);
    }
}
