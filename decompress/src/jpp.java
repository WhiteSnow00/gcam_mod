import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpp implements jpe
{
    public static final Charset a;
    public static final mof b;
    public static final ConcurrentHashMap c;
    static Boolean d;
    static Long e;
    public final Context f;
    
    static {
        a = Charset.forName("UTF-8");
        final mof mof = new mof(kcs.a());
        if (!mof.e) {
            final mof mof2 = new mof(mof.b, "gms:playlog:service:samplingrules_", mof.d, false, mof.h);
            b = new mof(mof2.b, mof2.c, "LogSamplingRulesV2__", mof2.e, mof2.h);
            c = new ConcurrentHashMap();
            jpp.d = null;
            jpp.e = null;
            return;
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }
    
    public jpp(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        this.f = applicationContext;
        if (applicationContext != null) {
            moh.h(applicationContext);
        }
    }
}
