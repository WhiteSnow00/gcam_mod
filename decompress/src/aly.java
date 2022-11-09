import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aly
{
    private static aly e;
    public final alp a;
    public final alq b;
    public final alw c;
    public final alx d;
    
    private aly(Context applicationContext, final apa apa) {
        applicationContext = applicationContext.getApplicationContext();
        this.a = new alp(applicationContext, apa);
        this.b = new alq(applicationContext, apa);
        this.c = new alw(applicationContext, apa);
        this.d = new alx(applicationContext, apa);
    }
    
    public static aly a(final Context context, final apa apa) {
        synchronized (aly.class) {
            if (aly.e == null) {
                aly.e = new aly(context, apa);
            }
            return aly.e;
        }
    }
}
