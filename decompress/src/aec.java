import java.util.Set;
import android.net.Uri;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aec
{
    private static final Object d;
    private static aec e;
    public final Context a;
    public final HashMap b;
    public final ArrayList c;
    private final HashMap f;
    private final Handler g;
    
    static {
        d = new Object();
    }
    
    private aec(final Context a) {
        this.b = new HashMap();
        this.f = new HashMap();
        this.c = new ArrayList();
        this.a = a;
        this.g = new adz(this, a.getMainLooper());
    }
    
    public static aec a(final Context context) {
        synchronized (aec.d) {
            if (aec.e == null) {
                aec.e = new aec(context.getApplicationContext());
            }
            return aec.e;
        }
    }
    
    public final void b(final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        final HashMap b = this.b;
        monitorenter(b);
        try {
            final aeb aeb = new aeb(intentFilter, broadcastReceiver);
            final ArrayList list = this.b.get(broadcastReceiver);
            ArrayList list3;
            if (list == null) {
                final ArrayList list2 = new ArrayList(1);
                this.b.put(broadcastReceiver, list2);
                list3 = list2;
            }
            else {
                list3 = list;
            }
            list3.add(aeb);
            for (int i = 0; i < intentFilter.countActions(); ++i) {
                final String action = intentFilter.getAction(i);
                ArrayList<?> list4 = this.f.get(action);
                if (list4 == null) {
                    list4 = new ArrayList<Object>(1);
                    this.f.put(action, list4);
                }
                list4.add(aeb);
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    public final void c(final BroadcastReceiver broadcastReceiver) {
        final HashMap b = this.b;
        monitorenter(b);
        try {
            final ArrayList list = this.b.remove(broadcastReceiver);
            if (list == null) {
                monitorexit(b);
                return;
            }
            for (int i = list.size() - 1; i >= 0; --i) {
                final aeb aeb = (aeb)list.get(i);
                aeb.d = true;
                for (int j = 0; j < aeb.a.countActions(); ++j) {
                    final String action = aeb.a.getAction(j);
                    final ArrayList list2 = this.f.get(action);
                    if (list2 != null) {
                        for (int k = list2.size() - 1; k >= 0; --k) {
                            final aeb aeb2 = (aeb)list2.get(k);
                            if (aeb2.b == broadcastReceiver) {
                                aeb2.d = true;
                                list2.remove(k);
                            }
                        }
                        if (list2.size() <= 0) {
                            this.f.remove(action);
                        }
                    }
                }
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    public final void d(final Intent intent) {
        final HashMap b = this.b;
        monitorenter(b);
        try {
            final String action = intent.getAction();
            final String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
            final Uri data = intent.getData();
            final String scheme = intent.getScheme();
            final Set categories = intent.getCategories();
            final int n = intent.getFlags() & 0x8;
            if (n != 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Resolving type ");
                sb.append(resolveTypeIfNeeded);
                sb.append(" scheme ");
                sb.append(scheme);
                sb.append(" of intent ");
                sb.append(intent);
                sb.toString();
            }
            final ArrayList list = this.f.get(intent.getAction());
            if (list != null) {
                ArrayList<aeb> list2;
                int i;
                if (n != 0) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Action list: ");
                    sb2.append(list);
                    sb2.toString();
                    list2 = null;
                    i = 0;
                }
                else {
                    list2 = null;
                    i = 0;
                }
                while (i < list.size()) {
                    final aeb aeb = (aeb)list.get(i);
                    if (n != 0) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Matching against filter ");
                        sb3.append(aeb.a);
                        sb3.toString();
                    }
                    if (!aeb.c) {
                        final IntentFilter a = aeb.a;
                        final ArrayList<aeb> list3 = list2;
                        final int match = a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (n != 0) {
                                Integer.toHexString(match);
                            }
                            if (list3 == null) {
                                list2 = new ArrayList<aeb>();
                            }
                            else {
                                list2 = list3;
                            }
                            list2.add(aeb);
                            aeb.c = true;
                        }
                    }
                    ++i;
                }
                if (list2 != null) {
                    for (int j = 0; j < list2.size(); ++j) {
                        list2.get(j).c = false;
                    }
                    this.c.add(new aea(intent, list2));
                    if (!this.g.hasMessages(1)) {
                        this.g.sendEmptyMessage(1);
                    }
                    monitorexit(b);
                    return;
                }
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
}
