package com.example.mockservice.annotations;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE,ElementType.CONSTRUCTOR,ElementType.PARAMETER,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface CcbHttpHeaders {

    String message() default "must contain valid CCB headers";
    Class<?>[] groups() default {};
}
