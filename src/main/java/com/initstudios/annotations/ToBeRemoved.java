package com.initstudios.annotations;

import java.lang.annotation.*;

/**
 * Functionality annotated with {@code ForRemoval} will no longer be supported
 * and should not be used anymore in new code. :D
 *
 * @author iBuyMountainDew
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface ToBeRemoved
{

}