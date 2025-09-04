package org.example.seasonthon.service;

import org.example.seasonthon.dto.TranslateRequest;
import org.example.seasonthon.dto.TranslateResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.HashMap;
import java.util.Map;

@Service
public class TranslateService {

  private final RestClient http;

  public TranslateService(@Value("${translate.base-url}") String baseUrl) {
    this.http = RestClient.builder()
            .baseUrl(baseUrl)
            .build();
  }

  public TranslateResponse translate(TranslateRequest req) {
    Map<String, Object> body = new HashMap<>();
    body.put("q", req.q());
    body.put("source", req.source() == null ? "auto" : req.source());
    body.put("target", req.target() == null ? "ko" : req.target());
    body.put("format", req.format() == null ? "text" : req.format());

    return http.post()
            .uri("/translate")
            .contentType(MediaType.APPLICATION_JSON)
            .body(body)
            .retrieve()
            .toEntity(TranslateResponse.class)
            .getBody();
  }
}