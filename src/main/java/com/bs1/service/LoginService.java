package com.bs1.service;

import com.bs1.model.email.EmailAuth;
import com.bs1.response.ResponseObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class LoginService {
    public ResponseObject doLogin(EmailAuth token) {
        ResponseObject responseObject = new ResponseObject();
        responseObject.putResult(token);
        return responseObject;
    }
}
