import com.google.android.gms.common.data.DataHolder;
import android.util.Log;
import android.content.Context;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

final class kft extends khi
{
    final /* synthetic */ kfu a;
    private volatile int b;
    
    public kft(final kfu a) {
        this.a = a;
        this.b = -1;
    }
    
    private final boolean l(final Runnable runnable) {
        final int callingUid = Binder.getCallingUid();
        Label_0112: {
            if (callingUid != this.b) {
                if (kip.a((Context)this.a).b() && jxc.c((Context)this.a, callingUid, "com.google.android.wearable.app.cn")) {
                    this.b = callingUid;
                }
                else {
                    if (!jxc.b((Context)this.a, callingUid)) {
                        break Label_0112;
                    }
                    this.b = callingUid;
                }
            }
            synchronized (this.a.c) {
                final kfu a = this.a;
                if (a.d) {
                    return false;
                }
                a.a.post(runnable);
                return true;
            }
        }
        final StringBuilder sb = new StringBuilder(57);
        sb.append("Caller is not GooglePlayServices; caller UID: ");
        sb.append(callingUid);
        Log.e("WearableLS", sb.toString());
        return false;
    }
    
    @Override
    public final void b(final kgf kgf) {
        this.l(new kfs(this, kgf));
    }
    
    @Override
    public final void c(final DataHolder dataHolder) {
        final kfq kfq = new kfq(dataHolder);
        try {
            final String value = String.valueOf(dataHolder);
            final int h = dataHolder.h;
            String.valueOf(value).length();
            if (!this.l(kfq)) {
                return;
            }
        }
        finally {
            dataHolder.close();
        }
    }
    
    @Override
    public final void d(final kht kht) {
        this.l(new kfr(this, kht));
    }
    
    @Override
    public final void e(final kht kht, final khe khe) {
        this.l(new kfp(kht, khe));
    }
    
    @Override
    public final void f() {
        this.l(new iey(13));
    }
    
    @Override
    public final void g() {
        this.l(new iey(12));
    }
    
    @Override
    public final void h() {
        this.l(new iey(15));
    }
    
    @Override
    public final void i() {
        this.l(new iey(14));
    }
    
    @Override
    public final void j() {
        this.l(new iey(10));
    }
    
    @Override
    public final void k() {
        this.l(new iey(11));
    }
}
