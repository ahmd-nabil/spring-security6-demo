package nabil.springsecuritydemo.controllers;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import nabil.springsecuritydemo.config.AuthService;
import nabil.springsecuritydemo.entities.AuthRequest;
import nabil.springsecuritydemo.entities.AuthResponse;
import nabil.springsecuritydemo.entities.RegisterRequest;
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
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody @NonNull AuthRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

}
