import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cjo implements cek
{
    private final cxl a;
    private final bmq b;
    
    public cjo(final bmq b, final cxl a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final jbm a() {
        return jbm.i;
    }
    
    @Override
    public final niz b() {
        final Intent a = this.b.a();
        if (a == null) {
            return nii.a;
        }
        if (bmx.i(a) && bmx.m(a)) {
            return niz.i(lfu.a);
        }
        return nii.a;
    }
    
    @Override
    public final boolean c() {
        return this.a.k(cxr.H);
    }
    
    @Override
    public final boolean d() {
        return false;
    }
    
    @Override
    public final boolean e() {
        return true;
    }
    
    @Override
    public final boolean f() {
        return true;
    }
    
    @Override
    public final boolean g() {
        return true;
    }
    
    @Override
    public final boolean h() {
        return false;
    }
    
    @Override
    public final boolean i() {
        return true;
    }
    
    @Override
    public final boolean j() {
        final Intent a = this.b.a();
        return a != null && a.getBooleanExtra("include_location_in_exif", false);
    }
    
    @Override
    public final boolean k() {
        return false;
    }
    
    @Override
    public final boolean l() {
        return false;
    }
    
    @Override
    public final void m() {
        final cxl a = this.a;
        final cxo a2 = cwv.a;
        a.e();
    }
    
    @Override
    public final void n() {
    }
    
    @Override
    public final void o() {
        final cxl a = this.a;
        final cxo a2 = cwv.a;
        a.b();
    }
}
