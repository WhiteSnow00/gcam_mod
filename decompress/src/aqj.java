// 
// Decompiled by Procyon v0.6.0
// 

public final class aqj extends aqh
{
    public aqj() {
    }
    
    public aqj(final int n) {
        super(n);
    }
    
    @Override
    protected final int a() {
        return -2147475470;
    }
    
    public final void b(final aqj aqj) {
        if (aqj != null) {
            this.g(aqj.a | super.a);
        }
    }
    
    public final boolean c() {
        return this.h(64);
    }
    
    public final boolean d() {
        return this.h(512);
    }
    
    public final void e(final int n) {
        if ((n & 0x100) > 0 && (n & 0x200) > 0) {
            throw new ape("IsStruct and IsArray options are mutually exclusive", 103);
        }
        if ((n & 0x2) > 0 && (n & 0x300) > 0) {
            throw new ape("Structs and arrays can't have \"value\" options", 103);
        }
    }
    
    public final boolean i() {
        return this.h(4096);
    }
    
    public final boolean j() {
        return this.h(2048);
    }
    
    public final boolean k() {
        return this.h(1024);
    }
    
    public final boolean l() {
        return (super.a & 0x300) > 0;
    }
    
    public final boolean m() {
        return this.h(32);
    }
    
    public final boolean n() {
        return this.h(Integer.MIN_VALUE);
    }
    
    public final boolean o() {
        return this.h(256);
    }
    
    public final boolean p() {
        return this.h(2);
    }
    
    public final void q() {
        this.f(512, true);
    }
    
    public final void r() {
        this.f(4096, true);
    }
    
    public final void s() {
        this.f(2048, true);
    }
    
    public final void t() {
        this.f(1024, true);
    }
    
    public final void u(final boolean b) {
        this.f(64, b);
    }
    
    public final void v(final boolean b) {
        this.f(16, b);
    }
    
    public final void w(final boolean b) {
        this.f(128, b);
    }
    
    public final void x(final boolean b) {
        this.f(256, b);
    }
}
