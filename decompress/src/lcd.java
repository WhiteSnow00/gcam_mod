import android.hardware.camera2.CameraAccessException;
import java.util.Collection;
import java.util.List;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class lcd implements lje
{
    private final lcq a;
    private final ldj b;
    private final kjk c;
    private final Handler d;
    private final kse e;
    private final krr f;
    private final lbk g;
    private final int h;
    private ljf i;
    private List j;
    private boolean k;
    private boolean l;
    
    public lcd(final lcq a, final ldj b, final Handler d, final kse e, final krr krr, final lbk g) {
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = krr.a("CaptureSessionState");
        this.c = new kjk();
        synchronized (lbi.class) {
            final int d2 = lbi.d;
            lbi.d = d2 + 1;
            monitorexit(lbi.class);
            this.h = d2;
        }
    }
    
    private final void l(final ljf ljf) {
        if (!this.k && !this.c.a()) {
            final boolean l = this.l;
            final boolean b = false;
            boolean b2 = false;
            if (l) {
                final ljf i = this.i;
                if (i != null) {
                    if (i == ljf) {
                        b2 = true;
                    }
                }
                else {
                    b2 = true;
                }
                nov.A(b2);
                this.i = ljf;
                final List j = this.j;
                if (j != null && !j.isEmpty()) {
                    this.c(j);
                }
                this.e.f("CaptureSessionState#setRequestProcessor");
                final lcq a = this.a;
                lcs lcs;
                if (ljf instanceof lek) {
                    lcs = new lce((lek)ljf);
                }
                else {
                    lcs = new ldb(ljf);
                }
                final ldh a2 = new ldh(lcs, this.b, this.d, this.e, this.f, this.g);
                synchronized (a) {
                    a.a = a2;
                    if (a.d) {
                        monitorexit(a);
                    }
                    else {
                        a.b = null;
                        final lal g = a.g();
                        monitorexit(a);
                        if (g != null) {
                            g.a();
                        }
                    }
                    this.e.g();
                    return;
                }
            }
            nov.A(this.i == null || b);
            this.i = ljf;
            return;
        }
        this.e.f("cameraCaptureSession#close");
        ljf.close();
        this.e.g();
    }
    
    final kjk a() {
        return this.c.b();
    }
    
    final void b() {
        synchronized (this) {
            final ljf i = this.i;
            this.i = null;
            this.j = null;
            this.k = true;
            monitorexit(this);
            if (i != null) {
                this.a.b();
            }
            this.c.close();
        }
    }
    
    final void c(final List j) {
        monitorenter(this);
        try {
            if (!this.k && !this.c.a()) {
                final ljf i = this.i;
                if (i == null) {
                    this.j = j;
                }
                else {
                    while (true) {
                        Object o = this.e;
                        final String value = String.valueOf(this);
                        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 29);
                        sb.append(value);
                        sb.append("#finalizeOutputConfigurations");
                        ((kse)o).f(sb.toString());
                        while (true) {
                            try {
                                try {
                                    i.c(j);
                                    o = this.f;
                                    final String value2 = String.valueOf(this);
                                    final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 22);
                                    sb2.append("Finalized outputs for ");
                                    sb2.append(value2);
                                    ((krr)o).f(sb2.toString());
                                    this.b.a(this, j);
                                    this.j = null;
                                    final kse kse = this.e;
                                    kse.g();
                                    monitorexit(this);
                                    return;
                                }
                                finally {}
                            }
                            catch (final IllegalStateException o) {}
                            catch (final NullPointerException o) {}
                            catch (final CameraAccessException o) {}
                            catch (final IllegalArgumentException ex) {}
                            final krr f = this.f;
                            final String value3 = String.valueOf(j);
                            o = ((Throwable)o).getMessage();
                            final StringBuilder sb3 = new StringBuilder(String.valueOf(value3).length() + 42 + String.valueOf(o).length());
                            sb3.append("WARNING: Failed to finalize outputs for ");
                            sb3.append(value3);
                            sb3.append(": ");
                            sb3.append((String)o);
                            f.h(sb3.toString());
                            this.j = null;
                            final kse kse = this.e;
                            continue;
                        }
                    }
                    this.j = null;
                    this.e.g();
                }
            }
            else {
                final krr f2 = this.f;
                final String value4 = String.valueOf(this);
                final StringBuilder sb4 = new StringBuilder(String.valueOf(value4).length() + 50);
                sb4.append("Ignoring finalizeOutputConfigurations. ");
                sb4.append(value4);
                sb4.append(" is closed.");
                f2.f(sb4.toString());
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void d(final ljf ljf) {
        synchronized (this) {
            final krr f = this.f;
            final String value = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 11);
            sb.append(value);
            sb.append(" is Closed.");
            f.b(sb.toString());
            this.c.c(ljf);
            this.h();
        }
    }
    
    @Override
    public final void e(final ljf ljf) {
        synchronized (this) {
            final krr f = this.f;
            final String value = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 21);
            sb.append(value);
            sb.append(" failed to configure.");
            f.h(sb.toString());
            this.c.c(ljf);
            this.h();
        }
    }
    
    @Override
    public final void f(final ljf ljf) {
        synchronized (this) {
            this.l(ljf);
        }
    }
    
    final void g() {
        synchronized (this) {
            nov.A(this.l ^ true);
            this.l = true;
            final ljf i = this.i;
            if (i != null) {
                this.l(i);
            }
        }
    }
    
    final void h() {
        synchronized (this) {
            final ljf i = this.i;
            this.i = null;
            this.j = null;
            this.k = true;
            monitorexit(this);
            Label_0277: {
                if (i != null) {
                    final kse e = this.e;
                    final String value = String.valueOf(this);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 9);
                    sb.append(value);
                    sb.append("#shutdown");
                    e.f(sb.toString());
                    try {
                        try {
                            this.f.f(String.valueOf(this.toString()).concat(" shutdown"));
                            this.e.f("RequestProcessor#disconnect");
                            this.a.b();
                            this.e.h("captureSession#stopRepeating");
                            i.d();
                            this.e.h("captureSession#abortCaptures");
                            i.b();
                            final kse e2 = this.e;
                        }
                        finally {}
                    }
                    catch (final ljd e3) {}
                    catch (final CameraAccessException ex) {}
                    final krr f = this.f;
                    final String value2 = String.valueOf(this);
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 41);
                    sb2.append("Encountered an error while shutting down ");
                    sb2.append(value2);
                    final kse e3;
                    f.i(sb2.toString(), (Throwable)e3);
                    e3 = this.e;
                    e3.g();
                    this.e.g();
                    break Label_0277;
                    this.e.g();
                    this.e.g();
                }
            }
            this.c.close();
        }
    }
    
    @Override
    public final void i() {
        synchronized (this) {
            final krr f = this.f;
            final String value = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 11);
            sb.append(value);
            sb.append(" is Active.");
            f.b(sb.toString());
        }
    }
    
    @Override
    public final void j() {
        synchronized (this) {
            final krr f = this.f;
            final String value = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 10);
            sb.append(value);
            sb.append(" is Ready.");
            f.b(sb.toString());
            final lcq a = this.a;
            synchronized (a) {
                if (a.d || !a.c) {
                    return;
                }
                final lcr b = a.b;
                if (b == null) {
                    a.c = false;
                    return;
                }
                a.a = b;
                a.b = null;
                a.c = false;
                a.g();
            }
        }
    }
    
    @Override
    public final void k() {
        monitorenter(this);
        monitorexit(this);
    }
    
    @Override
    public final String toString() {
        final int h = this.h;
        final StringBuilder sb = new StringBuilder(26);
        sb.append("CaptureSession-");
        sb.append(h);
        return sb.toString();
    }
}
