package lk.ijse.internship.service;

import lk.ijse.internship.reqAndresp.response.JwtAuthResponse;
import lk.ijse.internship.reqAndresp.secure.SignIn;
import lk.ijse.internship.reqAndresp.secure.SignUp;

public interface AuthenticationService {
    JwtAuthResponse signIn(SignIn signIn);
    JwtAuthResponse signUp(SignUp signUp);
    JwtAuthResponse refreshToken(String accessToken);

}
