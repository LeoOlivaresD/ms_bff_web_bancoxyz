package com.duoc.bff_web_bancoxyz.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.duoc.bff_web_bancoxyz.dtos.DtoTransaccion;

@FeignClient(name = "ms-transaccion-bancoxyz")
public interface TransaccionRestClient {
    @GetMapping("/banco/api/transacciones")
    List<DtoTransaccion> listarTransacciones();
}
