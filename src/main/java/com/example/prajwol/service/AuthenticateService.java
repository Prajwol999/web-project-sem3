package com.example.prajwol.service;

import com.example.prajwol.pojo.AuthenticateRequest;
import com.example.prajwol.pojo.AuthenticateResponse;

public interface AuthenticateService {

    AuthenticateResponse authenticate(AuthenticateRequest authenticateRequest);
}
