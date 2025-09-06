package org.example.seasonthon.service;


import lombok.RequiredArgsConstructor;
import org.example.seasonthon.dto.HospitalLocResponseDto;
import org.example.seasonthon.entity.Hospital;
import org.example.seasonthon.repository.HospitalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HospitalService {

  private final HospitalRepository hospitalRepository;

  public List<HospitalLocResponseDto> findHospitalsNearby(double userLat, double userLng) {
    List<Hospital> all = hospitalRepository.findAll();

    return all.stream()
            .filter(h -> distance(userLat, userLng,
                    h.getLatitude(),
                    h.getLongitude()) <= 1.0)
            .map(h -> new HospitalLocResponseDto(
                    h.getNameKorean(),
                    h.getAddressKorean(),
                    h.getSpecialtyKorean(),
                    h.getPNumber(),
                    h.getLanguage(),
                    h.getLatitude(),
                    h.getLongitude(),
                    h.getYkiho()
            ))
            .collect(Collectors.toList());
  }

  /**
   * 두 지점(위도, 경도) 사이의 거리(km)를 계산하는 메서드
   * Haversine 공식을 사용하여 구면 거리(Great-circle distance)를 구함
   *
   * @param lat1 사용자 위도
   * @param lon1 사용자 경도
   * @param lat2 병원 위도
   * @param lon2 병원 경도
   * @return 두 위치 사이의 거리 (단위: km)
   */
  private double distance(double lat1, double lon1, double lat2, double lon2) {
    // 지구 반지름 (단위: km)
    double R = 6371;

    // 위도, 경도 차이를 라디안 단위로 변환
    double dLat = Math.toRadians(lat2 - lat1);
    double dLng = Math.toRadians(lon2 - lon1);

    // Haversine 공식 적용
    double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
            + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
            * Math.sin(dLng / 2) * Math.sin(dLng / 2);

    // 최종 거리 계산 (단위: km)
    return R * (2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a)));
  }
}
