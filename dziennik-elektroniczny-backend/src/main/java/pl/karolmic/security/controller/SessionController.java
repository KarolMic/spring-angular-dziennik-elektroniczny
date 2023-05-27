package pl.karolmic.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import pl.karolmic.security.util.JwtUtil;

@RestController
@CrossOrigin
public class SessionController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("authenticate")
    public AuthResponse generateToken(@RequestBody AuthRequest authRequest) throws Exception {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("invalid username'password");
        }

        return new AuthResponse(jwtUtil.generateToken(authRequest.getUserName()));
    }

    @GetMapping("logout")
    public ResponseEntity logout() {

        SecurityContextHolder.getContext().setAuthentication(null);

        return new ResponseEntity(HttpStatus.OK);
    }

}
