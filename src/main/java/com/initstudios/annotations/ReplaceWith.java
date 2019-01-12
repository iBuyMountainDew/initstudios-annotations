package com.initstudios.annotations;

import java.lang.annotation.*;

/**
 * Functionality annotated with {@code ReplaceWith} should be replaced immediately
 * with the mentioned code fragment. This can be used for things like naming changes. :)
 *
 * @author iBuyMountainDew
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface ReplaceWith
{
    String value();
}