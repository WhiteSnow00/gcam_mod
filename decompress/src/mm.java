import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mm implements Runnable
{
    final /* synthetic */ mo a;
    final /* synthetic */ MenuItem b;
    final /* synthetic */ mv c;
    final /* synthetic */ mn d;
    
    public mm(final mn d, final mo a, final MenuItem b, final mv c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final mo a = this.a;
        if (a != null) {
            this.d.a.f = true;
            a.b.i(false);
            this.d.a.f = false;
        }
        if (this.b.isEnabled() && this.b.hasSubMenu()) {
            this.c.z(this.b, 4);
        }
    }
}
