// 
// Decompiled by Procyon v0.6.0
// 

public final class cxn
{
    public String a;
    public String b;
    public noi c;
    
    public final cxo a() {
        final String a = this.a;
        final String b = this.b;
        noi noi;
        if ((noi = this.c) == null) {
            noi = nqr.a;
        }
        return new cxo(a, b, noi);
    }
    
    public final cxm b() {
        return new cxm(this.a, this.b, (byte[])null);
    }
    
    public final cxm c() {
        return new cxm(this.a, this.b, (char[])null);
    }
    
    public final cxm d() {
        return new cxm(this.a, this.b, (int[])null);
    }
    
    public final cxm e() {
        return new cxm(this.a, this.b, (boolean[])null);
    }
    
    public final cxm f() {
        return new cxm(this.a, this.b, (short[])null);
    }
    
    public final cxm g() {
        return new cxm(this.a, this.b, (byte[][])null);
    }
    
    public final cxm h() {
        return new cxm(this.a);
    }
}
