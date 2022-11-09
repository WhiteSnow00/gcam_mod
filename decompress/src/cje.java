import android.media.MediaRecorder$OnInfoListener;
import android.media.MediaRecorder$OnErrorListener;
import java.io.FileDescriptor;
import android.view.Surface;
import android.media.MediaRecorder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cje implements kpz
{
    private final kpz a;
    private final hwn b;
    
    public cje(final kpz a, final hwn b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void A(final int n) {
        synchronized (this) {
            this.a.A(n);
        }
    }
    
    @Override
    public final void B(final int n, final int n2) {
        synchronized (this) {
            this.a.B(n, n2);
        }
    }
    
    @Override
    public final void C() {
        synchronized (this) {
            this.a.C();
        }
    }
    
    @Override
    public final void D() {
        synchronized (this) {
            this.a.D();
        }
    }
    
    @Override
    public final void E() {
        synchronized (this) {
            this.a.E();
        }
    }
    
    @Override
    public final MediaRecorder a() {
        return ((kpw)this.a).a;
    }
    
    @Override
    public final Surface b() {
        synchronized (this) {
            return this.a.b();
        }
    }
    
    @Override
    public final void c() {
        synchronized (this) {
            this.a.c();
        }
    }
    
    @Override
    public final void d() {
        monitorenter(this);
        try {
            this.b.i(hwm.a);
            this.a.d();
            return;
        }
        finally {
            this.b.c();
        }
        try {}
        finally {
            monitorexit(this);
        }
    }
    
    @Override
    public final void e() {
        synchronized (this) {
            this.a.e();
        }
    }
    
    @Override
    public final void f() {
        synchronized (this) {
            this.a.f();
        }
    }
    
    @Override
    public final void g() {
        synchronized (this) {
            this.a.g();
        }
    }
    
    @Override
    public final void h(final int n) {
        synchronized (this) {
            this.a.h(n);
        }
    }
    
    @Override
    public final void i(final int n) {
        synchronized (this) {
            this.a.i(n);
        }
    }
    
    @Override
    public final void j(final int n) {
        synchronized (this) {
            this.a.j(n);
        }
    }
    
    @Override
    public final void k(final int n) {
        synchronized (this) {
            this.a.k(n);
        }
    }
    
    @Override
    public final void l(final int n) {
        synchronized (this) {
            this.a.l(n);
        }
    }
    
    @Override
    public final void m(final double n) {
        synchronized (this) {
            this.a.m(n);
        }
    }
    
    @Override
    public final void n(final Surface surface) {
        synchronized (this) {
            this.a.n(surface);
        }
    }
    
    @Override
    public final void o(final float n, final float n2) {
        synchronized (this) {
            this.a.o(n, n2);
        }
    }
    
    @Override
    public final void p(final int n) {
        synchronized (this) {
            this.a.p(n);
        }
    }
    
    @Override
    public final void q(final long n) {
        synchronized (this) {
            this.a.q(n);
        }
    }
    
    @Override
    public final void r(final FileDescriptor fileDescriptor) {
        this.a.r(fileDescriptor);
    }
    
    @Override
    public final void s(final MediaRecorder$OnErrorListener mediaRecorder$OnErrorListener) {
        synchronized (this) {
            this.a.s(mediaRecorder$OnErrorListener);
        }
    }
    
    @Override
    public final void t(final MediaRecorder$OnInfoListener mediaRecorder$OnInfoListener) {
        synchronized (this) {
            this.a.t(mediaRecorder$OnInfoListener);
        }
    }
    
    @Override
    public final void u(final int n) {
        synchronized (this) {
            this.a.u(n);
        }
    }
    
    @Override
    public final void v(final FileDescriptor fileDescriptor) {
        synchronized (this) {
            this.a.v(fileDescriptor);
        }
    }
    
    @Override
    public final void w(final String s) {
        synchronized (this) {
            this.a.w(s);
        }
    }
    
    @Override
    public final void x(final int n) {
        synchronized (this) {
            this.a.x(n);
        }
    }
    
    @Override
    public final void y(final int n) {
        synchronized (this) {
            this.a.y(n);
        }
    }
    
    @Override
    public final void z(final int n) {
        synchronized (this) {
            this.a.z(n);
        }
    }
}
