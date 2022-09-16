package com.rishabhsoft.customer.service;


import com.rishabhsoft.customer.dto.LoginRequestDTO;
import com.rishabhsoft.customer.dto.LoginResponseDTO;
import com.rishabhsoft.customer.entity.Customer;
import com.rishabhsoft.customer.exception.InvalidUserLoginException;
import com.rishabhsoft.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    private CustomerRepository customerRepository;

    public LoginService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public LoginResponseDTO checkLogin(LoginRequestDTO requestDTO)
    {
        Optional<Customer> optionalCustomer = customerRepository.findCustomerByUserNameAndPassword(requestDTO.getUserName(), requestDTO.getPassword());
        if(optionalCustomer.isPresent())
        {

           LoginResponseDTO loginResponseDTO =  new LoginResponseDTO(requestDTO.getUserName(), "token12345");
           return loginResponseDTO;
        }
        else
        {
            throw new InvalidUserLoginException();
        }
    }
}
