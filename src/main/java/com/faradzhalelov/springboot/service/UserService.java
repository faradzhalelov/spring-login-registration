package com.faradzhalelov.springboot.service;

import com.faradzhalelov.springboot.model.User;
import com.faradzhalelov.springboot.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
