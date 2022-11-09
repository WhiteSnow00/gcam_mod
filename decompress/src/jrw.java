import android.content.DialogInterface;
import android.os.Parcelable;
import android.os.Bundle;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;
import android.content.DialogInterface$OnCancelListener;
import com.google.android.gms.common.api.internal.LifecycleCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jrw extends LifecycleCallback implements DialogInterface$OnCancelListener
{
    protected volatile boolean a;
    protected final AtomicReference b;
    public final Handler c;
    protected final jpw d;
    
    public jrw(final jsx jsx, final jpw d) {
        super(jsx);
        this.b = new AtomicReference(null);
        this.c = new kax(Looper.getMainLooper());
        this.d = d;
    }
    
    private static final int k(final jru jru) {
        if (jru == null) {
            return -1;
        }
        return jru.a;
    }
    
    public final void a(final jps jps, final int n) {
        this.b.set(null);
        this.e(jps, n);
    }
    
    public final void b() {
        this.b.set(null);
        this.f();
    }
    
    @Override
    public final void c(int n, final int n2, final Intent intent) {
        final jru jru = this.b.get();
        switch (n) {
            case 2: {
                n = this.d.e((Context)this.l());
                if (n == 0) {
                    this.b();
                    return;
                }
                if (jru == null) {
                    return;
                }
                if (jru.b.c == 18 && n == 18) {
                    return;
                }
                break;
            }
            case 1: {
                if (n2 == -1) {
                    this.b();
                    return;
                }
                if (n2 != 0) {
                    break;
                }
                if (jru == null) {
                    return;
                }
                n = 13;
                if (intent != null) {
                    n = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                this.a(new jps(n, null, jru.b.toString()), k(jru));
                return;
            }
        }
        if (jru != null) {
            this.a(jru.b, jru.a);
        }
    }
    
    @Override
    public final void d(final Bundle bundle) {
        if (bundle != null) {
            final AtomicReference b = this.b;
            jru jru;
            if (bundle.getBoolean("resolving_error", false)) {
                jru = new jru(new jps(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            }
            else {
                jru = null;
            }
            b.set(jru);
        }
    }
    
    protected abstract void e(final jps p0, final int p1);
    
    protected abstract void f();
    
    @Override
    public final void g(final Bundle bundle) {
        final jru jru = this.b.get();
        if (jru == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", jru.a);
        bundle.putInt("failed_status", jru.b.c);
        bundle.putParcelable("failed_resolution", (Parcelable)jru.b.d);
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        this.a(new jps(13, null), k(this.b.get()));
    }
}
