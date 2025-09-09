package com.duoc.bff_web_bancoxyz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.bff_web_bancoxyz.dtos.DtoCuentaAnual;
import com.duoc.bff_web_bancoxyz.dtos.DtoInteres;
import com.duoc.bff_web_bancoxyz.dtos.DtoTransaccion;
import com.duoc.bff_web_bancoxyz.service.BffServiceWeb;

@RestController
@CrossOrigin
@RequestMapping("/bff-web")
public class BffRestControllerWeb {
    @Autowired
    private BffServiceWeb bffServiceWeb;

    public BffRestControllerWeb(BffServiceWeb bffServiceWeb) {
        this.bffServiceWeb = bffServiceWeb;
    }

    @GetMapping("/cuenta_anual")
    public ResponseEntity<List<DtoCuentaAnual>> verCuentasAnuales() {
        return ResponseEntity.ok(bffServiceWeb.verCuentasAnuales());
    }

    @GetMapping("/interes")
    public ResponseEntity<List<DtoInteres>> verIntereses() {
        return ResponseEntity.ok(bffServiceWeb.verInteresesAplicados());
    }

    @GetMapping("/transaccion")
    public ResponseEntity<List<DtoTransaccion>> verTransacciones() {
        return ResponseEntity.ok(bffServiceWeb.verTransacciones());
    }
}
