package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import java.time.LocalDate;

import com.programacion4.unidad4ej5.config.MayorDeEdad;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SocioCreateDTO {

    @NotBlank(message = "El nombre no puede estar vacio")
    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;

    @NotBlank(message = "El apellido no puede estar vacio")
    private String apellido;

    @NotBlank(message = "El email no puede estar vacio")
    @Email(message = "El email debe tener un formato válido")
    private String email;

    @NotBlank(message = "El DNI no puede estar vacio")
    @Pattern(regexp = "\\d{8}", message = "El DNI debe tener exactamente 8 digitos")
    private String dni;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    @Past(message = "La fecha de nacimiento debe ser pasada")
    @MayorDeEdad
    private LocalDate fechaNacimiento;

    @NotBlank(message = "El telefono no puede estar vacio")
    @Pattern(regexp = "^\\+\\d{10,15}$", message = "El teléfono debe tener formato internacional, ej: +549...")
    private String telefono;

}
