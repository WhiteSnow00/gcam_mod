import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glc
{
    private static final AtomicBoolean a;
    
    static {
        a = new AtomicBoolean(false);
    }
    
    public static void a(final Context context) {
        final jqt b = kcs.b(context);
        final String value = String.valueOf(context.getPackageName());
        String concat;
        if (value.length() != 0) {
            concat = "com.google.android.apps.camera#".concat(value);
        }
        else {
            concat = new String("com.google.android.apps.camera#");
        }
        new glb(b, concat).b();
    }
    
    public static void b(final Context context) {
        moh.h(context);
    }
    
    public static void c(final Context context) {
        if (!glc.a.compareAndSet(false, true)) {
            return;
        }
        moh.h(context);
        new mof(mnw.a("com.google.android.apps.camera")).a().c("DummyFlag", false).e();
    }
}
