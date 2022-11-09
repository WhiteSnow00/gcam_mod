import android.net.ConnectivityManager$NetworkCallback;
import android.os.Handler;
import android.os.Looper;
import android.net.ConnectivityManager;
import android.net.TrafficStats;
import android.app.Activity;
import android.view.View$OnClickListener;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imp
{
    public final Context a;
    final /* synthetic */ EduImageView b;
    int c;
    private final String d;
    private final String e;
    private krc f;
    private final cqa g;
    
    public imp(final EduImageView b, final Context a, final String d, final String e, final cqa g) {
        this.b = b;
        this.a = a;
        this.d = d;
        this.e = e;
        this.g = g;
    }
    
    public final void a() {
        this.b.a.setContentDescription((CharSequence)this.e);
        final cqa g = this.g;
        if (g != null) {
            g.a.u.setVisibility(0);
        }
    }
    
    public final void b(final boolean b) {
        this.b.a.setOnClickListener((View$OnClickListener)null);
        this.b.b.setVisibility(8);
        final krc f = this.f;
        if (f != null) {
            f.close();
            this.f = null;
        }
        final Context context = this.b.getContext();
        if (context != null) {
            if (context instanceof Activity) {
                final Activity activity = (Activity)context;
                if (activity.isDestroyed() || activity.isFinishing()) {
                    return;
                }
            }
            final int b2 = nrr.B(context);
            this.c = b2;
            try {
                TrafficStats.setThreadStatsTag(256);
                if (b2 != 3 && !b) {
                    if (b2 == 2) {
                        ((auw)auf.c(context).d(this.d).F().J().l()).a(new imn(this)).j(this.b.a);
                    }
                    else {
                        ((auw)auf.c(context).d(this.d).F().J().l()).a(new imo(this, context)).j(this.b.a);
                    }
                }
                else {
                    ((auw)auf.c(context).d(this.d).l()).a(new imn(this, 1)).j(this.b.a);
                }
            }
            finally {
                TrafficStats.clearThreadStatsTag();
            }
        }
    }
    
    public final void c() {
        final iml iml = new iml(this);
        final Context a = this.a;
        final ConnectivityManager connectivityManager = (ConnectivityManager)a.getSystemService("connectivity");
        connectivityManager.getClass();
        njo.o(a.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        connectivityManager.registerDefaultNetworkCallback((ConnectivityManager$NetworkCallback)iml, new Handler(Looper.getMainLooper()));
        this.f = new jdg(connectivityManager, iml);
    }
}
