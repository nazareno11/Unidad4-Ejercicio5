package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class PagoRequestDTO {

    @NotNull(message = "El monto es obligatorio")
    @DecimalMin(value = "1000.00", message = "El monto minimo es 1000.00")
    @Digits(integer = 10, fraction = 2,
            message = "El monto debe tener hasta 2 decimales")
    private BigDecimal monto;

    @NotBlank(message = "El código de transaccion es obligatorio")
    @Pattern(
        regexp = "^PAY-[A-Z0-9]{4}-[A-Z0-9]{4}$",
        message = "El codigo debe tener el formato PAY-XXXX-XXXX"
    )
    private String codigoTransaccion;

    @NotNull(message = "La fecha de vencimiento es obligatoria")
    @Future(message = "La fecha de vencimiento debe ser futura")
    private LocalDate fechaVencimiento;

    @NotBlank(message = "El tipo de pago es obligatorio")
    @Pattern(
        regexp = "EFECTIVO|DEBITO|CREDITO|TRANSFERENCIA",
        message = "Tipo de pago invalido"
    )
    private String tipoPago;

}
