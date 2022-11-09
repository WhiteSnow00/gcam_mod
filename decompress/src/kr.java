import android.content.IntentFilter;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class kr
{
    private BroadcastReceiver a;
    final /* synthetic */ kw c;
    
    public kr(final kw c) {
        this.c = c;
    }
    
    public abstract IntentFilter a();
    
    public abstract void b();
    
    final void c() {
        final BroadcastReceiver a = this.a;
        if (a != null) {
            try {
                this.c.f.unregisterReceiver(a);
            }
            catch (final IllegalArgumentException ex) {}
            this.a = null;
        }
    }
    
    final void d() {
        this.c();
        final IntentFilter a = this.a();
        if (a.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new kq(this);
        }
        this.c.f.registerReceiver(this.a, a);
    }
}
