package org.example.seasonthon.dto;

import lombok.Getter;
import lombok.Setter;

// 현재 사용자의 위치 전달
public record HospitalLocRequestDto(
        Double latitude,  // 위도
        Double longitude, // 경도
        String language   // 사용 언어
) {}
