package org.example.seasonthon.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

// 현재 사용자의 위치 전달
public record HospitalLocRequestDto(

        @Schema(description = "현재 사용자의 위도", example = "37.49877474832768")
        Double latitude,  // 위도

        @Schema(description = "현재 사용자의 경도", example = "127.0278195920194")
        Double longitude  // 경도

//        @Schema(description = "선호하는 언어 (예: English, Japanese, Chinese)", example = "English")
//        String language   // 사용 언어
) {}