package com.pdk.rentvideoapi.service.impl;

import com.pdk.rentvideoapi.entity.User;
import com.pdk.rentvideoapi.mapper.UserMapper;
import com.pdk.rentvideoapi.repository.UserRepository;
import com.pdk.rentvideoapi.service.UserService;
import com.pdk.rentvideoapi.dto.UserResponse;
import com.pdk.rentvideoapi.dto.UserRegistrationRequest;
import com.pdk.rentvideoapi.enums.UserRole;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @Override
    public UserResponse register(UserRegistrationRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already registered");
        }

        User user = User.builder()
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .role(request.getRole() != null ? request.getRole() : UserRole.CUSTOMER)
                .build();

        User savedUser = userRepository.save(user);
        return UserMapper.toResponse(savedUser);
    }

//    public UserResponse login(User)
}
