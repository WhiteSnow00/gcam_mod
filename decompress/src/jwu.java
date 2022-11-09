import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwu
{
    private static final jwu a;
    private jwt b;
    
    static {
        a = new jwu();
    }
    
    public jwu() {
        this.b = null;
    }
    
    public static jwt b(final Context context) {
        return jwu.a.a(context);
    }
    
    public final jwt a(final Context context) {
        synchronized (this) {
            if (this.b == null) {
                Context applicationContext = context;
                if (context.getApplicationContext() != null) {
                    applicationContext = context.getApplicationContext();
                }
                this.b = new jwt(applicationContext);
            }
            return this.b;
        }
    }
}
