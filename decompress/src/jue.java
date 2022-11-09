import android.app.PendingIntent;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class jue extends jug
{
    public final int a;
    public final Bundle b;
    final /* synthetic */ jum c;
    
    protected jue(final jum c, final int a, final Bundle b) {
        this.c = c;
        super(c, true);
        this.a = a;
        this.b = b;
    }
    
    protected abstract void a(final jps p0);
    
    @Override
    protected final void b() {
    }
    
    protected abstract boolean c();
}
