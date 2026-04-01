package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class PlanCreateDTO {

    @NotBlank(message = "El objetivo es obligatorio")
    @Size(min = 10, max = 200,
          message = "El objetivo debe tener entre 10 y 200 caracteres")
    private String objetivo;

    @NotNull(message = "La frecuencia semanal es obligatoria")
    @Min(value = 1, message = "La frecuencia debe ser entre 1 y 7")
    @Max(value = 7, message = "La frecuencia debe ser entre 1 y 7")
    private Integer frecuenciaSemanal;

    @NotNull(message = "El peso inicial es obligatorio")
    @DecimalMin(value = "30.0", message = "El peso minimo es 30.0 kg")
    @DecimalMax(value = "250.0", message = "El peso maximo es 250.0 kg")
    private Double pesoInicial;

    @NotNull(message = "La altura es obligatoria")
    @DecimalMin(value = "1.0", message = "La altura minima es 1.0 m")
    @DecimalMax(value = "2.5", message = "La altura maxima es 2.5 m")
    private Double altura;

    @NotEmpty(message = "Debe ingresar una lista de ejercicios")
    @Size(min = 3, message = "Debe haber al menos 3 ejercicios")
    private List<@NotBlank(message = "El nombre del ejercicio no puede estar vacío") String> ejercicios;

}
