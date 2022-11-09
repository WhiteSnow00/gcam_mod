import android.net.Uri;
import android.content.Intent;
import android.database.ContentObserver;
import java.util.HashMap;
import android.content.ContentResolver;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lkh
{
    public final llb a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public final krr d;
    public final Object e;
    public final Map f;
    public final Map g;
    private final Context h;
    private final ContentResolver i;
    
    public lkh(final Context h, final ContentResolver i, final llb a, final ScheduledExecutorService b, final ExecutorService c, final krr krr) {
        this.e = new Object();
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = h;
        this.i = i;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = krr.a("PublishNotifier");
    }
    
    public final void a(final lkp lkp) {
        final nrv bn = lkp.e.bN();
        while (bn.hasNext()) {
            final lkd lkd = bn.next();
            final Uri h = lkd.e.h();
            if (h != null && !njb.d(h.getAuthority())) {
                this.i.notifyChange(h, (ContentObserver)null);
                final krr d = this.d;
                final String value = String.valueOf(lkp.a);
                final String value2 = String.valueOf(h);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 15 + String.valueOf(value2).length());
                sb.append(value);
                sb.append(" NotifyChange: ");
                sb.append(value2);
                d.f(sb.toString());
                final llw e = lkd.e;
                final llk a = llk.a(e.i().e);
                if (!a.b() && !a.c()) {
                    continue;
                }
                String s;
                if (!a.b()) {
                    s = "android.hardware.action.NEW_VIDEO";
                }
                else {
                    s = "android.hardware.action.NEW_PICTURE";
                }
                final Uri h2 = e.h();
                final krr d2 = this.d;
                final String value3 = String.valueOf(h2);
                final StringBuilder sb2 = new StringBuilder(s.length() + 18 + String.valueOf(value3).length());
                sb2.append("Broadcasting: ");
                sb2.append(s);
                sb2.append(" -> ");
                sb2.append(value3);
                d2.f(sb2.toString());
                final Intent intent = new Intent(s, h2);
                intent.addFlags(1073741824);
                intent.addFlags(1);
                this.h.sendBroadcast(intent);
            }
        }
        this.f.remove(lkp.a);
    }
}
