package org.example.seasonthon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Hospital {

  @Id
  @GeneratedValue
  private Long id;

  private String name_korean;                // 병원명 국문
  private String name_english;               // 병원명 영문

  private String address_korean;             // 주소 국문
  private String address_english;            // 주소 영문

  private String specialty_korean;           // 진료 과목 국문
  private String specialty_english;          // 진료 과목 영문

  private String p_number;                   // 전화번호
  private String language;                   // 지원 가능 언어

  private Double latitude;                   // 위도
  private Double longitude;                  // 경도
}