import android.graphics.Bitmap;
import java.util.concurrent.Callable;
import com.google.googlex.gcam.DebugParams;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public class hfx implements hhy
{
    public static final nsd a;
    public final hfl b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/session/DelegatingCaptureSession");
    }
    
    protected hfx(final hfl b) {
        this.b = b;
    }
    
    @Override
    public final void A() {
        this.b.A();
    }
    
    @Override
    public void B() {
        hhx.b();
    }
    
    @Override
    public final void C(final iwv iwv, final Throwable t) {
        this.b.C(iwv, t);
    }
    
    final ofn E() {
        return this.b.n;
    }
    
    final Executor F() {
        return this.b.f;
    }
    
    public final void G() {
        this.b.z();
    }
    
    public final void H(final String s) {
        this.b.T(s);
    }
    
    final void I(final String s) {
        hfx.a.c().E(2284).x("[%s] %s", this.h(), s);
    }
    
    final void J(final hgz e) {
        this.b.e = e;
    }
    
    @Override
    public final void L(final ljm ljm) {
        this.b.L(ljm);
    }
    
    @Override
    public final void M(final DebugParams debugParams) {
        this.b.M(debugParams);
    }
    
    @Override
    public final void O(final iwv iwv) {
        this.b.O(iwv);
    }
    
    @Override
    public void P(final kre kre) {
        final hfl b = this.b;
        b.b.h(b.g, b.c);
        b.T("startEmpty");
        if (!b.c.equals(hio.o) && !b.c.equals(hio.s)) {
            b.s = b.r.a("jpg");
        }
        else {
            b.s = b.r.a("mp4");
        }
        b.r.e(new hfi(b));
        b.m.e(ofi.q(new hfh(b), b.f));
        if (b.c != hio.l && b.c != hio.g && b.c != hio.f) {
            b.z();
        }
    }
    
    @Override
    public final void Q(final long n) {
        this.b.Q(n);
    }
    
    @Override
    public final void S(final Integer n) {
        this.b.S(null);
    }
    
    @Override
    public final void U(final Bitmap bitmap, final int n) {
        this.b.U(bitmap, n);
    }
    
    @Override
    public final void V(final Bitmap bitmap) {
        this.b.V(bitmap);
    }
    
    @Override
    public final void W(final Bitmap bitmap) {
        this.b.W(bitmap);
    }
    
    @Override
    public final void Y(final int n) {
        this.b.Y(n);
    }
    
    @Override
    public final krd a() {
        return this.b.d;
    }
    
    @Override
    public final void b(final krd krd) {
        this.b.b(krd);
    }
    
    @Override
    public final void c(final gxd gxd) {
        this.b.c(gxd);
    }
    
    @Override
    public final long d() {
        return this.b.d();
    }
    
    final btl e() {
        return this.b.j;
    }
    
    @Override
    public final hia f() {
        return this.b.f();
    }
    
    @Override
    public final hie g() {
        return this.b.r;
    }
    
    @Override
    public final him h() {
        return this.b.h();
    }
    
    @Override
    public final hio i() {
        return this.b.c;
    }
    
    @Override
    public final hip j() {
        return this.b.j();
    }
    
    @Override
    public final huz k() {
        return this.b.l;
    }
    
    @Override
    public final ljm l() {
        return this.b.p;
    }
    
    @Override
    public final niz m() {
        return this.b.u;
    }
    
    @Override
    public final niz n() {
        return this.b.q;
    }
    
    public final hfu o() {
        return this.b.h;
    }
    
    @Override
    public final oey p() {
        return this.b.t;
    }
    
    @Override
    public final oey q() {
        return this.b.q();
    }
    
    @Override
    public oey r(final byte[] array, final hwr hwr) {
        return hhx.c();
    }
    
    @Override
    public final String s() {
        return this.b.s();
    }
    
    final hfw t() {
        return this.b.a;
    }
    
    @Override
    public final void u(final hik hik) {
        this.b.u(hik);
    }
    
    final hha v() {
        return this.b.i;
    }
    
    @Override
    public final void w(final Throwable t) {
        this.b.w(t);
    }
    
    final hie x() {
        return this.b.r;
    }
    
    @Override
    public final void y() {
        this.b.y();
    }
    
    final niz z(final hwr hwr) {
        return this.b.o(hwr, null);
    }
}
