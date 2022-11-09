import java.util.Queue;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ate
{
    private static final aub a;
    private static final String b;
    private static atd c;
    private static atd d;
    private static int e;
    private static int f;
    
    static {
        a = new aub("CamAgntFact");
        b = aud.a();
    }
    
    public static atd a(final Context context) {
        synchronized (ate.class) {
            if (c() == 2) {
                if (ate.c == null) {
                    ate.c = new asa();
                    ate.e = 1;
                }
                else {
                    ++ate.e;
                }
                return ate.c;
            }
            if (ate.d == null) {
                ate.d = new ard(context);
                ate.f = 1;
            }
            else {
                ++ate.f;
            }
            return ate.d;
        }
    }
    
    public static void b() {
        monitorenter(ate.class);
        try {
            while (true) {
                Label_0106: {
                    if (c() != 2) {
                        break Label_0106;
                    }
                    if (--ate.e != 0) {
                        break Label_0092;
                    }
                    final atd c = ate.c;
                    if (c == null) {
                        break Label_0092;
                    }
                    c.g(true);
                    final atx f = ((asa)c).f;
                    synchronized (f.b) {
                        monitorexit(f.b = true);
                        final Queue a = f.a;
                        synchronized (f.b) {
                            f.a.notifyAll();
                            monitorexit(f.b);
                            ((asa)c).e.b();
                            ate.c = null;
                            monitorexit(ate.class);
                            return;
                        }
                    }
                }
                if (--ate.f == 0 && ate.d != null) {
                    ate.d = null;
                    continue;
                }
                continue;
            }
        }
        finally {
            monitorexit(ate.class);
            while (true) {}
        }
    }
    
    private static int c() {
        final String b = ate.b;
        if (b.equals("1")) {
            auc.e(ate.a);
            return 2;
        }
        if (b.equals("2")) {
            auc.e(ate.a);
            return 3;
        }
        return 2;
    }
}
