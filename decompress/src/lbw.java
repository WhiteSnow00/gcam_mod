import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lbw implements ktb, krc
{
    public final kjk a;
    private final lcc b;
    private final lfj c;
    private final Handler d;
    private final kse e;
    private final krr f;
    private lcd g;
    private ljg h;
    private boolean i;
    
    public lbw(final lfj c, final lcd g, final lcc b, final Handler d, final kse e, final krr krr) {
        this.h = null;
        this.i = false;
        this.c = c;
        this.g = g;
        this.b = b;
        this.d = d;
        this.e = e;
        this.a = new kjk();
        this.f = krr.a("CameraDeviceState");
    }
    
    @Override
    public final void a() {
        synchronized (this) {
            if (this.i) {
                return;
            }
            this.i = true;
            monitorexit(this);
            final krr f = this.f;
            final String a = this.c.a;
            final String value = String.valueOf(this.g);
            final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 26 + String.valueOf(value).length());
            sb.append("Camera device ");
            sb.append(a);
            sb.append(" closed for ");
            sb.append(value);
            f.b(sb.toString());
            this.close();
        }
    }
    
    @Override
    public final void b() {
        synchronized (this) {
            final boolean i = this.i;
            this.i = true;
            monitorexit(this);
            if (i ^ true) {
                final krr f = this.f;
                final String a = this.c.a;
                final String value = String.valueOf(this.g);
                final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 32 + String.valueOf(value).length());
                sb.append("Camera device ");
                sb.append(a);
                sb.append(" disconnected for ");
                sb.append(value);
                f.b(sb.toString());
                this.close();
            }
        }
    }
    
    @Override
    public final void c(final kst kst) {
        synchronized (this) {
            final boolean i = this.i;
            this.i = true;
            monitorexit(this);
            if (i ^ true) {
                final krr f = this.f;
                final String a = this.c.a;
                final int t = kst.t;
                final String b = ksc.b();
                final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 33 + String.valueOf(b).length());
                sb.append("Camera device ");
                sb.append(a);
                sb.append(" error ");
                sb.append(t);
                sb.append("\n");
                sb.append(b);
                f.d(sb.toString());
                this.close();
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.i = true;
            monitorexit(this);
            this.e.f("cameraDeviceState#close");
            this.g.h();
            this.a.close();
            this.e.g();
        }
    }
    
    @Override
    public final void d(final ljg h) {
        synchronized (this) {
            final boolean i = this.i;
            if (!i) {
                this.e.f("CameraDevice#onOpened");
                final krr f = this.f;
                final String b = h.b();
                final String value = String.valueOf(this.g);
                final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 25 + String.valueOf(value).length());
                sb.append("Camera ");
                sb.append(b);
                sb.append(" opened. Creating ");
                sb.append(value);
                f.f(sb.toString());
                nov.C(this.h == null, "onOpened was invoked more than once!", new Object[0]);
                this.h = h;
                try {
                    final lcc b2 = this.b;
                    final lcd g = this.g;
                    b2.d(h, g, g.a(), this.d);
                    this.g.g();
                }
                finally {
                    this.e.g();
                }
            }
            monitorexit(this);
            if (i) {
                h.close();
            }
        }
    }
    
    final void e(final lcd g) {
        synchronized (this) {
            final krr f = this.f;
            final String value = String.valueOf(this.g);
            final String value2 = String.valueOf(g);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 25 + String.valueOf(value2).length());
            sb.append("Closing ");
            sb.append(value);
            sb.append(" and configuring ");
            sb.append(value2);
            f.f(sb.toString());
            this.g.b();
            this.g = g;
            final ljg h = this.h;
            if (h == null) {
                this.f.f("CameraDevice is not open yet. Waiting for onOpened.");
                return;
            }
            this.b.d(h, g, g.a(), this.d);
            g.g();
        }
    }
    
    public final boolean f() {
        synchronized (this) {
            return this.a.a();
        }
    }
}
