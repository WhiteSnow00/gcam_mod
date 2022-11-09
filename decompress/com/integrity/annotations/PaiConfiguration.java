// 
// Decompiled by Procyon v0.6.0
// 

package com.integrity.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface PaiConfiguration {
    boolean addChecks() default true;
    
    boolean continueOnFailure() default true;
    
    boolean exclude() default false;
    
    boolean modeFallback() default true;
}
