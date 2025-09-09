package com.duoc.bff_web_bancoxyz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.bff_web_bancoxyz.dtos.DtoCuentaAnual;
import com.duoc.bff_web_bancoxyz.dtos.DtoInteres;
import com.duoc.bff_web_bancoxyz.dtos.DtoTransaccion;
import com.duoc.bff_web_bancoxyz.restclient.RestClientBancoXyzWeb;

@Service
public class BffServiceWeb {
    @Autowired
    private RestClientBancoXyzWeb restClientBancoXyzWeb;

    public BffServiceWeb(RestClientBancoXyzWeb restClientBancoXyzWeb) {
        this.restClientBancoXyzWeb = restClientBancoXyzWeb;
    }

    public List<DtoInteres> verInteresesAplicados() {
        return restClientBancoXyzWeb.listarIntereses();
    }

    public List<DtoCuentaAnual> verCuentasAnuales() {
        return restClientBancoXyzWeb.listarCuentasAnuales();
    }

    public List<DtoTransaccion> verTransacciones() {
        return restClientBancoXyzWeb.listarTransacciones();
    }
}
