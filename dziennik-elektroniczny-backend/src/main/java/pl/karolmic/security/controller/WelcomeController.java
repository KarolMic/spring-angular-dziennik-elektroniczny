package pl.karolmic.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;
import pl.karolmic.security.entity.AuthRequest;
import pl.karolmic.security.util.JwtUtil;

@RestController
@CrossOrigin
public class WelcomeController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/elo")
    public String welcome() {
        return "Welcome to javatechie !!";
    }

    @PostMapping("authenticate")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("invalid username'password");
        }

        return jwtUtil.generateToken(authRequest.getUserName());
    }

}
