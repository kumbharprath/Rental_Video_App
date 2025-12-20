package com.pdk.rentvideoapi.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String director;

    @Column(nullable = false)
    private String genre;

    @Column(name = "availability", nullable = false)
    private boolean isAvailable = true;

    public boolean getIsAvailable() {
        return this.isAvailable;
    }
}
