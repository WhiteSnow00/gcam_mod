import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

class iw
{
    static final ix d;
    final ix e;
    
    static {
        d = hh.e(new iq((byte[])null)).g().h().i();
    }
    
    public iw(final ix e) {
        this.e = e;
    }
    
    public gw a() {
        return gw.a;
    }
    
    public ix b(final int n, final int n2, final int n3, final int n4) {
        return iw.d;
    }
    
    public boolean c() {
        return false;
    }
    
    public void d() {
    }
    
    public void e() {
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof iw)) {
            return false;
        }
        final iw iw = (iw)o;
        return this.c() == iw.c() && this.j() == iw.j() && Objects.equals((Object)this.a(), (Object)iw.a()) && Objects.equals((Object)this.g(), (Object)iw.g()) && Objects.equals((Object)this.k(), (Object)iw.k());
    }
    
    public void f() {
    }
    
    public gw g() {
        return gw.a;
    }
    
    public ix h() {
        return this.e;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(new Object[] { this.c(), this.j(), this.a(), this.g(), this.k() });
    }
    
    public ix i() {
        return this.e;
    }
    
    public boolean j() {
        return false;
    }
    
    public hx k() {
        return null;
    }
    
    public ix l() {
        return this.e;
    }
    
    public gw m() {
        return this.a();
    }
}
