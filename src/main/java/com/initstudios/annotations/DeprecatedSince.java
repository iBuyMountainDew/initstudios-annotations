package com.initstudios.annotations;

import java.lang.annotation.*;

/**
 * In combination with {@link Deprecated}, this annotation specifies when this feature was marked as deprecated.
 *
 * @author iBuyMountainDew
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.PACKAGE})
public @interface DeprecatedSince
{
    String date();
}
