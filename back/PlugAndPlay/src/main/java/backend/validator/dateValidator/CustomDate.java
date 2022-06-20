package backend.validator.dateValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = CustomDateValidator.class)
@Documented
public @interface CustomDate {
    String message() default "Date format is not valid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
