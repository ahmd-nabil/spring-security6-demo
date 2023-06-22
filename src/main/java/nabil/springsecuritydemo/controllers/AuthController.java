package nabil.springsecuritydemo.controllers;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import nabil.springsecuritydemo.config.AuthService;
import nabil.springsecuritydemo.entities.AuthResponse;
import nabil.springsecuritydemo.entities.LoginRequest;
import nabil.springsecuritydemo.entities.RegisterRequest;
import nabil.springsecuritydemo.exceptions.EmailTakenException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ahmed Nabil
 */
@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody @NonNull RegisterRequest request) {
        try {
            return ResponseEntity.ok(authService.register(request));
        } catch (DataIntegrityViolationException e) {
            throw new EmailTakenException();
        }
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody @NonNull LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

}
