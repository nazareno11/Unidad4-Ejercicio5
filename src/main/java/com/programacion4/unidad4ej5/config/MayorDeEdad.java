package com.programacion4.unidad4ej5.config;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = MayorDeEdadValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MayorDeEdad {

    String message() default "El socio debe ser mayor de 18 años";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
