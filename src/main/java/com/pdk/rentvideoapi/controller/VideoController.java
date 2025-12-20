package com.pdk.rentvideoapi.controller;



import com.pdk.rentvideoapi.controller.endpoints.ApiEndpoints;
import com.pdk.rentvideoapi.dto.VideoResponse;
import com.pdk.rentvideoapi.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(ApiEndpoints.VIDEO_API_ENDPOINT)
public class VideoController {

    private final VideoService videoService;

    // Accessible by CUSTOMER and ADMIN
    @GetMapping
    public ResponseEntity<List<VideoResponse>> getAllVideos() {
        return ResponseEntity.ok(videoService.getAll());
    }
}

