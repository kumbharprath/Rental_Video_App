package com.pdk.rentvideoapi.service;


import com.pdk.rentvideoapi.dto.VideoRequest;
import com.pdk.rentvideoapi.dto.VideoResponse;

import java.util.List;

public interface VideoService {

    VideoResponse create(VideoRequest request);

    VideoResponse update(Long id, VideoRequest request);

    void delete(Long id);

    List<VideoResponse> getAll();
}
