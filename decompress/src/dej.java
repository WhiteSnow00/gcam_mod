import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dej
{
    public final kue a;
    public final Handler b;
    public krc c;
    public krc d;
    
    public dej(final kue a, final Handler b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final krc d = this.d;
        if (d != null) {
            d.close();
            this.d = null;
        }
    }
}
