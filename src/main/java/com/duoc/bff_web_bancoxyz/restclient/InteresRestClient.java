package com.duoc.bff_web_bancoxyz.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.duoc.bff_web_bancoxyz.dtos.DtoInteres;

@FeignClient(name = "ms-interes-bancoxyz")
public interface InteresRestClient {
    @GetMapping("/banco/api/intereses")
    List<DtoInteres> listarIntereses();
}
