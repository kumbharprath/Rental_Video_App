package com.pdk.rentvideoapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class VideoRequest {
    private String title;
    private String director;
    private String genre;
}
