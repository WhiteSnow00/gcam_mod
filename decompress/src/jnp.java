import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jnp
{
    public static final Object a;
    public static kdp b;
    static Boolean c;
    
    static {
        a = new Object();
    }
    
    public static boolean a(final Context context) {
        jvu.a(context);
        final Boolean c = jnp.c;
        if (c != null) {
            return c;
        }
        final boolean i = lfe.i(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        jnp.c = i;
        return i;
    }
}
