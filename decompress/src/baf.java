import java.io.IOException;
import android.util.Log;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class baf implements azz
{
    private final ban a;
    private final File b;
    private final bad c;
    private avg d;
    
    @Deprecated
    public baf(final File b) {
        this.c = new bad();
        this.b = b;
        this.a = new ban();
    }
    
    private final avg c() {
        synchronized (this) {
            if (this.d == null) {
                this.d = avg.g(this.b, 262144000L);
            }
            return this.d;
        }
    }
    
    @Override
    public final File a(final awc awc) {
        final String a = this.a.a(awc);
        final File file = null;
        Label_0048: {
            File a3;
            try {
                final avf a2 = this.c().a(a);
                a3 = file;
                if (a2 != null) {
                    a3 = a2.a();
                }
            }
            catch (final IOException ex) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    break Label_0048;
                }
                a3 = file;
            }
            return a3;
        }
        final IOException ex;
        Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", (Throwable)ex);
        return null;
    }
    
    @Override
    public final void b(awc awc, final axu axu) {
        final String a = this.a.a(awc);
        final bad c = this.c;
        monitorenter(c);
        try {
            if ((awc = (awc)c.a.get(a)) == null) {
                final bac b = c.b;
                awc = (awc)b.a;
                synchronized (awc) {
                    final Object o = b.a.poll();
                    monitorexit(awc);
                    awc = (awc)o;
                    if (o == null) {
                        awc = (awc)new bab();
                    }
                    c.a.put(a, awc);
                }
            }
            while (true) {
                ++((bab)awc).b;
                monitorexit(c);
                ((bab)awc).a.lock();
                while (true) {
                    try {
                        try {
                            final avg c2 = this.c();
                            if (c2.a(a) == null) {
                                awc = (awc)c2.f(a);
                                if (awc == null) {
                                    String concat;
                                    if (a.length() != 0) {
                                        concat = "Had two simultaneous puts for: ".concat(a);
                                    }
                                    else {
                                        concat = new String("Had two simultaneous puts for: ");
                                    }
                                    throw new IllegalStateException(concat);
                                }
                                try {
                                    if (axu.a.a(axu.b, ((avd)awc).d(), axu.c)) {
                                        ((avd)awc).c();
                                    }
                                }
                                finally {
                                    ((avd)awc).b();
                                }
                            }
                            final bad bad = this.c;
                            bad.a(a);
                            return;
                        }
                        finally {}
                    }
                    catch (final IOException ex) {
                        if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                            Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", (Throwable)ex);
                        }
                    }
                    final bad bad = this.c;
                    continue;
                }
            }
            this.c.a(a);
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
}
