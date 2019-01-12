package com.initstudios.annotations;

import java.lang.annotation.*;

/**
 * Functionality annotated with {@code Incubating} might change very soon in a future update or snapshot.
 *
 * @author iBuyMountainDew
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR})
public @interface Incubating
{

}
