package com.pdk.rentvideoapi.controller;

import com.pdk.rentvideoapi.controller.endpoints.ApiEndpoints;
import com.pdk.rentvideoapi.dto.UserRegistrationRequest;
import com.pdk.rentvideoapi.dto.UserResponse;
import com.pdk.rentvideoapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(ApiEndpoints.RENTVIDEOAPP_API_ENDPOINT)
public class UserController {

    private final UserService userService;

    @PostMapping(ApiEndpoints.USER_API_ENDPOINT)
    public ResponseEntity<UserResponse> register(@RequestBody UserRegistrationRequest request) {
        UserResponse response = userService.register(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
