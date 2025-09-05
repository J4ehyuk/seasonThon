package org.example.seasonthon.controller;


import lombok.AllArgsConstructor;
import org.example.seasonthon.dto.HospitalLocRequestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class HospitalController {

  @GetMapping("/api/hospitals")
  public List<HospitalLocRequestDto> getNearbyHospitals(
          @RequestParam double lat,
          @RequestParam double lng
  ) {
//    return hospitalService.findNearby(lat, lng);
    return null;
  }


}
