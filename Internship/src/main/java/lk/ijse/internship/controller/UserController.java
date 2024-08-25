package lk.ijse.internship.controller;

import lk.ijse.internship.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
@CrossOrigin("http://localhost:63342")
@RequiredArgsConstructor
public class UserController {
    private final AuthenticationService authenticationService;

}
