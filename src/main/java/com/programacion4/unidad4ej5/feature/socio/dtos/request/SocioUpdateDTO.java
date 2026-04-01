package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import com.programacion4.unidad4ej5.config.OnCreate;
import com.programacion4.unidad4ej5.config.OnUpdate;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter


public class SocioUpdateDTO {

    @Null(groups = OnCreate.class,
          message = "El ID debe ser nulo en la creación")
    @NotNull(groups = OnUpdate.class,
             message = "El ID es obligatorio para actualizar")
    private Long id;

    @Pattern(
        regexp = "^(https?|ftp)://[^\\s/$.?#].[^\\s]*$",
        message = "La URL de la foto debe ser válida"
    )
    private String urlFoto;

    @Pattern(
        regexp = "^[^\\s]{3,15}$",
        message = "El alias debe tener entre 3 y 15 caracteres y sin espacios"
    )
    private String alias;

    
}
