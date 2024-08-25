package lk.ijse.internship.service.impl;

import lk.ijse.internship.dao.UserDAO;
import lk.ijse.internship.reqAndresp.response.JwtAuthResponse;
import lk.ijse.internship.reqAndresp.secure.SignIn;
import lk.ijse.internship.reqAndresp.secure.SignUp;
import lk.ijse.internship.service.AuthenticationService;
import lk.ijse.internship.util.Mapping;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceIMPL implements AuthenticationService {
    private final UserDAO userRepo;
    private final Mapping mapping;


    @Override
    public JwtAuthResponse signIn(SignIn signIn) {
        return null;
    }

    @Override
    public JwtAuthResponse signUp(SignUp signUp) {
        return null;
    }

    @Override
    public JwtAuthResponse refreshToken(String accessToken) {
        return null;
    }
}
