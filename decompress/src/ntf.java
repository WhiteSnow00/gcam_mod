import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

// 
// Decompiled by Procyon v0.6.0
// 

@Retention(RetentionPolicy.SOURCE)
@Target({ ElementType.FIELD })
public @interface ntf {
    public static final nsx a = nsx.c("android_log_tag", String.class);
}
