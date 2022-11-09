import android.widget.TextView;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.view.ViewStub;
import com.google.android.apps.camera.ui.remotecontrol.RemoteControlView;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ith implements exn, exl, exm
{
    public final Context a;
    final Handler b;
    public RemoteControlView c;
    public ViewStub d;
    public efm e;
    public itc f;
    public Intent g;
    public boolean h;
    public boolean i;
    public final BroadcastReceiver j;
    private final hbm k;
    private final itf l;
    
    public ith(final Context a, final hbm k) {
        this.h = false;
        this.i = false;
        this.l = new itf(this);
        this.j = new itg(this);
        this.a = a;
        this.k = k;
        this.b = new Handler(a.getMainLooper());
    }
    
    public final void a(final Intent intent) {
        final int n = (int)(intent.getIntExtra("level", -1) * 100 / (float)intent.getIntExtra("scale", -1));
        final RemoteControlView c = this.c;
        if (c != null) {
            if (n >= 0 && n <= 100) {
                final TextView b = c.b;
                final StringBuilder sb = new StringBuilder(12);
                sb.append(n);
                sb.append("%");
                b.setText((CharSequence)sb.toString());
                return;
            }
            c.b.setText((CharSequence)"--");
        }
    }
    
    public final void b(final int n) {
        this.b.post((Runnable)new ite(this, n));
    }
    
    @Override
    public final void bk() {
        final RemoteControlView c = this.c;
        if (c != null) {
            c.a();
        }
        this.k.h.add(this.l);
        final hbm k = this.k;
        if (k.a) {
            this.i = k.b;
            this.b(k.c);
            if (this.k.b()) {
                this.c(this.k.d);
            }
            if (this.k.b()) {
                this.f(this.k.f);
            }
        }
    }
    
    public final void c(final float n) {
        this.b.post((Runnable)new itd(this, n, 1));
    }
    
    @Override
    public final void e() {
        if (this.c != null && this.h) {
            this.e.h(this.f);
            this.a.unregisterReceiver(this.j);
            this.h = false;
        }
        this.k.h.remove(this.l);
        this.e.l(efo.c);
    }
    
    public final void f(final float n) {
        this.b.post((Runnable)new itd(this, n));
    }
}
