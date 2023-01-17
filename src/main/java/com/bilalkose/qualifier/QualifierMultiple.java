package com.bilalkose.qualifier;

import javax.inject.Qualifier;
import java.lang.annotation.*;

@Qualifier
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface QualifierMultiple {
}
