package org.example.seasonthon.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.seasonthon.dto.TranslateRequest;
import org.example.seasonthon.dto.TranslateResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/api")
//@AllArgsConstructor
//public class TranslateController {
//
//  private final TranslateService service;
//
//  @PostMapping(value = "/translate",
//          consumes = MediaType.APPLICATION_JSON_VALUE,
//          produces = MediaType.APPLICATION_JSON_VALUE)
//  public TranslateResponse translate(@Valid @RequestBody TranslateRequest req) {
//    return service.translate(req);
//  }
//}