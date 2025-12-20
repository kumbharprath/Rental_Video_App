package com.pdk.rentvideoapi.controller;

import com.pdk.rentvideoapi.controller.endpoints.ApiEndpoints;
import com.pdk.rentvideoapi.dto.VideoRequest;
import com.pdk.rentvideoapi.dto.VideoResponse;
import com.pdk.rentvideoapi.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(ApiEndpoints.VIDEO_ADMIN_API_ENDPOINT)
public class AdminVideoController {

    private final VideoService videoService;

    @GetMapping
    public ResponseEntity<List<VideoResponse>> getAllVideos() {
        return ResponseEntity.ok(videoService.getAll());
    }

    @PostMapping
    public ResponseEntity<VideoResponse> create(@RequestBody VideoRequest request) {
        return new ResponseEntity<>(videoService.create(request), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public VideoResponse update(@PathVariable Long id,
                                @RequestBody VideoRequest request) {
        return videoService.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        videoService.delete(id);
    }
}
