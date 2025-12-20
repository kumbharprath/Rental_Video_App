package com.pdk.rentvideoapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class VideoResponse {
    private Long id;
    private String title;
    private String director;
    private String genre;
    private boolean available;
}
