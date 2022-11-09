import java.io.Serializable;
import android.os.Parcelable;
import android.app.KeyguardManager$KeyguardDismissCallback;
import android.content.Intent;
import android.app.KeyguardManager;
import android.app.Activity;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdr implements hdo
{
    public final Context a;
    public final pii b;
    public final Class c;
    public hdn d;
    private final boolean e;
    private final Activity f;
    private final KeyguardManager g;
    private final hkc h;
    private final bmq i;
    
    public hdr(final bmq i, final Activity f, final pii b, final boolean e, final Class c, final KeyguardManager g, final hkc h) {
        this.i = i;
        this.a = f.getApplicationContext();
        this.e = e;
        this.f = f;
        this.c = c;
        this.b = b;
        this.g = g;
        this.h = h;
    }
    
    private final void h(final Intent intent, final boolean b) {
        if (this.e) {
            this.b(this.f, new hdq(this, b, intent));
            return;
        }
        this.i.b(intent);
    }
    
    @Override
    public final void a() {
        this.d = null;
    }
    
    @Override
    public final void b(final Activity activity, final KeyguardManager$KeyguardDismissCallback keyguardManager$KeyguardDismissCallback) {
        if (!this.e) {
            return;
        }
        final hdn d = this.d;
        if (d != null) {
            d.B();
        }
        final int f = ((eiq)this.b.get()).f;
        ((eiq)this.b.get()).g(3);
        this.g.requestDismissKeyguard(activity, (KeyguardManager$KeyguardDismissCallback)new hdp(this, f, keyguardManager$KeyguardDismissCallback));
    }
    
    @Override
    public final void c(final hdn d) {
        this.d = d;
    }
    
    @Override
    public final void d(final Parcelable parcelable, final Serializable s) {
        final Intent intent = new Intent(this.a, this.c);
        intent.putExtra("open_socialshare", true);
        intent.putExtra("filmstrip_item_data", parcelable);
        intent.putExtra("filmstrip_item_type", s);
        this.h(intent, false);
    }
    
    @Override
    public final void e() {
        final Intent intent = new Intent(this.a, this.c);
        intent.putExtra("open_empty_vault", true);
        this.h(intent, false);
    }
    
    @Override
    public final void f() {
        final Intent intent = new Intent(this.a, this.c);
        intent.putExtra("open_filmstrip", true);
        if (this.h.c(hjq.R)) {
            intent.putExtra("open_mars", true);
        }
        this.h(intent, false);
    }
    
    @Override
    public final void g(final Intent intent) {
        this.h(intent, true);
    }
}
