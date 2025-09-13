package com.duoc.bff_web_bancoxyz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.bff_web_bancoxyz.dtos.DtoCuentaAnual;
import com.duoc.bff_web_bancoxyz.dtos.DtoInteres;
import com.duoc.bff_web_bancoxyz.dtos.DtoTransaccion;
import com.duoc.bff_web_bancoxyz.restclient.CuentaAnualRestClient;
import com.duoc.bff_web_bancoxyz.restclient.InteresRestClient;
import com.duoc.bff_web_bancoxyz.restclient.TransaccionRestClient;

@Service
public class BffServiceWeb {
    @Autowired
    private CuentaAnualRestClient cuentaAnualRestClient;
    private InteresRestClient interesRestClient;
    private TransaccionRestClient transaccionRestClient;

    public BffServiceWeb(CuentaAnualRestClient cuentaAnualRestClient, InteresRestClient interesRestClient,
            TransaccionRestClient transaccionRestClient) {
        this.cuentaAnualRestClient = cuentaAnualRestClient;
        this.interesRestClient = interesRestClient;
        this.transaccionRestClient = transaccionRestClient;
    }

    public List<DtoInteres> verInteresesAplicados() {
        return interesRestClient.listarIntereses();
    }

    public List<DtoCuentaAnual> verCuentasAnuales() {
        return cuentaAnualRestClient.listarCuentasAnuales();
    }

    public List<DtoTransaccion> verTransacciones() {
        return transaccionRestClient.listarTransacciones();
    }
}
