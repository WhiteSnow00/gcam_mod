import android.os.Bundle;
import android.content.pm.PackageManager$NameNotFoundException;
import android.app.PendingIntent;
import android.net.Uri;
import android.content.Intent;
import android.util.Log;
import android.os.IInterface;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kim extends jva
{
    private final khn A;
    private final kip B;
    public final khn a;
    private final khn t;
    private final khn u;
    private final khn v;
    private final khn w;
    private final khn x;
    private final khn y;
    private final khn z;
    
    public kim(final Context context, final Looper looper, final jqu jqu, final jqv jqv, final juq juq) {
        final ltl a = kaw.a;
        final ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        final kip a2 = kip.a(context);
        super(context, looper, 14, juq, jqu, jqv);
        this.t = new khn();
        this.u = new khn();
        this.v = new khn();
        this.w = new khn();
        this.a = new khn();
        this.x = new khn();
        this.y = new khn();
        this.z = new khn();
        this.A = new khn();
        jvu.a(unconfigurableExecutorService);
        this.B = a2;
    }
    
    @Override
    public final boolean D() {
        return true;
    }
    
    @Override
    public final int a() {
        return 8600000;
    }
    
    @Override
    protected final String d() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }
    
    @Override
    protected final String e() {
        return "com.google.android.gms.wearable.BIND";
    }
    
    @Override
    public final jpu[] f() {
        return kfh.e;
    }
    
    @Override
    public final void i(final juh juh) {
        if (!this.n()) {
            try {
                final Bundle metaData = super.c.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int int1 = 0;
                if (metaData != null) {
                    int1 = metaData.getInt("com.google.android.wearable.api.version", 0);
                }
                if (int1 < 8600000) {
                    final StringBuilder sb = new StringBuilder(82);
                    sb.append("The Wear OS app is out of date. Requires API version 8600000 but found ");
                    sb.append(int1);
                    Log.w("WearableClient", sb.toString());
                    final Context c = super.c;
                    Intent setPackage;
                    if (c.getPackageManager().resolveActivity(setPackage = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn"), 65536) == null) {
                        setPackage = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    this.z(juh, 6, kau.a(c, setPackage, kau.a));
                    return;
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {
                this.z(juh, 16, null);
                return;
            }
        }
        super.i(juh);
    }
    
    @Override
    public final boolean n() {
        return !this.B.b();
    }
    
    @Override
    protected final String w() {
        if (this.B.b()) {
            return "com.google.android.wearable.app.cn";
        }
        return "com.google.android.gms";
    }
    
    @Override
    protected final void y(final int n, final IBinder binder, final Bundle bundle, final int n2) {
        int n3 = n;
        if (n == 0) {
            this.t.a(binder);
            this.u.a(binder);
            this.v.a(binder);
            this.w.a(binder);
            this.a.a(binder);
            this.x.a(binder);
            this.y.a(binder);
            this.z.a(binder);
            this.A.a(binder);
            n3 = 0;
        }
        super.y(n3, binder, bundle, n2);
    }
}
