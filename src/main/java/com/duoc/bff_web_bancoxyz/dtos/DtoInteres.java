package com.duoc.bff_web_bancoxyz.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class DtoInteres {
    private String idCuenta;
    private String nombreCliente;
    private Integer saldo;
    private Integer edadCliente;
    private String tipoInteres;
}
