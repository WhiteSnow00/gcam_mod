import android.text.TextUtils;
import android.app.Notification;
import java.util.List;
import java.util.Iterator;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import android.content.Intent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import android.content.Context;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amc implements ale, ajm
{
    public static final String a;
    public final akh b;
    final Object c;
    String d;
    final Map e;
    final Map f;
    final Set g;
    final alf h;
    public amb i;
    public final apa j;
    private final Context k;
    
    static {
        a = aiy.b("SystemFgDispatcher");
    }
    
    public amc(final Context k) {
        this.k = k;
        this.c = new Object();
        final akh e = akh.e(k);
        this.b = e;
        final apa j = e.j;
        this.j = j;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashSet();
        this.f = new HashMap();
        this.h = new alf(k, j, this);
        e.f.b(this);
    }
    
    public static Intent b(final Context context, final String s, final ais ais) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", ais.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ais.b);
        intent.putExtra("KEY_NOTIFICATION", (Parcelable)ais.c);
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    public static Intent c(final Context context, final String s, final ais ais) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        intent.putExtra("KEY_NOTIFICATION_ID", ais.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ais.b);
        intent.putExtra("KEY_NOTIFICATION", (Parcelable)ais.c);
        intent.putExtra("KEY_WORKSPEC_ID", s);
        return intent;
    }
    
    public static Intent d(final Context context) {
        final Intent intent = new Intent(context, (Class)SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }
    
    @Override
    public final void a(final String s, final boolean b) {
        Object o = this.c;
        monitorenter(o);
        try {
            final ana ana = this.f.remove(s);
            if (ana != null && this.g.remove(ana)) {
                this.h.a(this.g);
            }
            monitorexit(o);
            final ais ais = this.e.remove(s);
            if (s.equals(this.d) && this.e.size() > 0) {
                final Iterator iterator = this.e.entrySet().iterator();
                o = iterator.next();
                while (iterator.hasNext()) {
                    o = iterator.next();
                }
                this.d = ((Map.Entry<String, ais>)o).getKey();
                if (this.i != null) {
                    o = ((Map.Entry<String, ais>)o).getValue();
                    this.i.c(((ais)o).a, ((ais)o).b, ((ais)o).c);
                    this.i.a(((ais)o).a);
                }
            }
            o = this.i;
            if (ais != null && o != null) {
                final aiy a = aiy.a();
                String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", ais.a, s, ais.b);
                a.d(new Throwable[0]);
                ((amb)o).a(ais.a);
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    @Override
    public final void e(final List list) {
    }
    
    @Override
    public final void f(final List list) {
        if (!list.isEmpty()) {
            for (final String s : list) {
                final aiy a = aiy.a();
                String.format("Constraints unmet for WorkSpec %s", s);
                a.d(new Throwable[0]);
                final akh b = this.b;
                b.j.a(new aoc(b, s, true));
            }
        }
    }
    
    public final void g(final Intent intent) {
        int n = 0;
        final int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        final int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        final String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        final Notification notification = (Notification)intent.getParcelableExtra("KEY_NOTIFICATION");
        final aiy a = aiy.a();
        String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", intExtra, stringExtra, intExtra2);
        a.d(new Throwable[0]);
        if (notification != null && this.i != null) {
            this.e.put(stringExtra, new ais(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty((CharSequence)this.d)) {
                this.d = stringExtra;
                this.i.c(intExtra, intExtra2, notification);
                return;
            }
            this.i.b(intExtra, notification);
            if (intExtra2 != 0) {
                final Iterator iterator = this.e.entrySet().iterator();
                while (iterator.hasNext()) {
                    n |= ((Map.Entry<K, ais>)iterator.next()).getValue().b;
                }
                final ais ais = this.e.get(this.d);
                if (ais != null) {
                    this.i.c(ais.a, n, ais.c);
                }
            }
        }
    }
    
    public final void h() {
        this.i = null;
        synchronized (this.c) {
            this.h.b();
            monitorexit(this.c);
            this.b.f.c(this);
        }
    }
}
