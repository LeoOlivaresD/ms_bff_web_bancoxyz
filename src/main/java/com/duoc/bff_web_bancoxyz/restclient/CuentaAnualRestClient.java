package com.duoc.bff_web_bancoxyz.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.duoc.bff_web_bancoxyz.dtos.DtoCuentaAnual;

@FeignClient(name = "bancoxyz", url = "http://localhost:8081/banco/api")
public interface CuentaAnualRestClient {

    @GetMapping("/cuentas-anuales")
    List<DtoCuentaAnual> listarCuentasAnuales();

}
