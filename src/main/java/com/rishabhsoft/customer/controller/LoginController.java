package com.rishabhsoft.customer.controller;

import com.rishabhsoft.customer.dto.LoginRequestDTO;
import com.rishabhsoft.customer.dto.LoginResponseDTO;
import com.rishabhsoft.customer.service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers/authenticate")
public class LoginController
{

    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public ResponseEntity<LoginResponseDTO> performLogin(@RequestBody LoginRequestDTO requestDTO)
    {
        return ResponseEntity.ok(loginService.checkLogin(requestDTO));
    }
}
