import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mny
{
    public static volatile boolean a;
    public static volatile Exception b;
    public static volatile boolean c;
    public static volatile Exception d;
    private static volatile mny f;
    private static final njp g;
    public final Context e;
    private final njp h;
    private final njp i;
    
    static {
        mny.a = false;
        mny.b = null;
        mny.c = false;
        mny.d = null;
        mny.f = null;
        g = nov.F(fdh.h);
    }
    
    public mny(Context applicationContext) {
        final njp g = mny.g;
        final njp f = nov.F(new mii(applicationContext, 4));
        applicationContext = applicationContext.getApplicationContext();
        applicationContext.getClass();
        g.getClass();
        f.getClass();
        this.e = applicationContext.getApplicationContext();
        this.h = nov.F(g);
        this.i = nov.F(f);
    }
    
    public static mny a(final Context context) {
        final Context applicationContext = context.getApplicationContext();
        mnx mnx = null;
        Label_0119: {
            try {
                final Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 instanceof ouj) {
                    final Object a = ((ouj)applicationContext2).a();
                    try {
                        mnx = mnx.class.cast(a);
                        break Label_0119;
                    }
                    catch (final ClassCastException ex) {
                        throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", ex);
                    }
                }
                final String value = String.valueOf(((ouj)applicationContext2).getClass());
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 72);
                sb.append("Given application context does not implement GeneratedComponentManager: ");
                sb.append(value);
                throw new IllegalStateException(sb.toString());
            }
            catch (final IllegalStateException ex2) {
                mnx = null;
            }
        }
        if (mnx != null) {
            final niz a2 = mnx.a();
            if (a2.g()) {
                return (mny)a2.c();
            }
        }
        if (applicationContext instanceof mnx) {
            final niz a3 = ((mnx)applicationContext).a();
            if (a3.g()) {
                return (mny)a3.c();
            }
        }
        return (mny)nov.F(new mii(context, 3)).a();
    }
    
    public final ofb b() {
        return (ofb)this.h.a();
    }
    
    public final moo c() {
        return (moo)this.i.a();
    }
}
