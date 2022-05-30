package com.faradzhalelov.springboot.service;

import com.faradzhalelov.springboot.model.User;
import com.faradzhalelov.springboot.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
