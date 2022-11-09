import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dus implements kri
{
    public volatile kvs a;
    public final int b;
    private final Handler c;
    
    public dus(final Handler c, final cxl cxl) {
        this.c = c;
        this.b = (int)cxl.a(cxs.i).e(615);
    }
    
    public final void b(final kvs a) {
        if (a != null && !a.e()) {
            if (this.a != null && !this.a.e()) {
                this.a.close();
            }
            this.a = a;
            this.c.postDelayed((Runnable)new dur(a), (long)this.b);
        }
    }
}
