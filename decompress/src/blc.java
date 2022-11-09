import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blc extends kxc
{
    public volatile jbm a;
    ljm b;
    private final klj c;
    private final klj d;
    private final Set e;
    private final bjo f;
    
    public blc(final bjo f, final klv c, final klv d, final cxl cxl) {
        this.a = jbm.a;
        this.c = c;
        this.d = d;
        this.e = new HashSet();
        final cxm a = cxk.a;
        cxl.b();
        this.f = f;
        this.b = null;
    }
    
    public final void a(final Runnable runnable) {
        synchronized (this) {
            this.e.add(runnable);
        }
    }
    
    @Override
    public final void b(final ljm b) {
        monitorenter(this);
        try {
            this.b = b;
            monitorexit(this);
            if (jlg.b != null) {
                final Integer n = (Integer)b.d(jlg.b);
                if (n != null && n == 1) {
                    if (!this.f.a()) {
                        if (!(boolean)this.c.aQ() && !(boolean)this.d.aQ()) {
                            synchronized (this) {
                                final HashSet set = new HashSet(this.e);
                                monitorexit(this);
                                final Iterator iterator = set.iterator();
                                while (iterator.hasNext()) {
                                    ((Runnable)iterator.next()).run();
                                }
                            }
                        }
                    }
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c(final Runnable runnable) {
        synchronized (this) {
            this.e.remove(runnable);
        }
    }
    
    public final boolean d(final jcx jcx) {
        synchronized (this) {
            final String s = (String)this.b.d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
            if (s == null) {
                return true;
            }
            final lfg a = jcx.a(s);
            return a == null || a.C();
        }
    }
}
