import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmg
{
    public final Context a;
    public final Context b;
    
    public jmg(Context applicationContext) {
        jvu.a(applicationContext);
        applicationContext = applicationContext.getApplicationContext();
        jvu.j(applicationContext, "Application context can't be null");
        this.a = applicationContext;
        this.b = applicationContext;
    }
}
