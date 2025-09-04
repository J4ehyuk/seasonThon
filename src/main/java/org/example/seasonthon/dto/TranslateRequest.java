package org.example.seasonthon.dto;

import jakarta.validation.constraints.NotBlank;

public record TranslateRequest(
        @NotBlank String q,
        String source,   // "auto", "en", "ko" ...
        String target,   // "ko", "en", "ja" ...
        String format    // 보통 "text"
) {}