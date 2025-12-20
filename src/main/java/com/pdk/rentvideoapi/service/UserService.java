package com.pdk.rentvideoapi.service;


import com.pdk.rentvideoapi.dto.UserRegistrationRequest;
import com.pdk.rentvideoapi.dto.UserResponse;


public interface UserService {

    UserResponse register(UserRegistrationRequest request);
}

