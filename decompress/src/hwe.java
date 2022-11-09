// 
// Decompiled by Procyon v0.6.0
// 

public final class hwe extends hwh
{
    public ksh a;
    private final kse b;
    
    public hwe(final lmp lmp, final kse b) {
        super(lmp, hwd.values());
        this.b = b;
    }
    
    public final long c() {
        return this.g(hwd.a);
    }
    
    public final long d() {
        return this.g(hwd.b);
    }
    
    public final void e() {
        this.i(hwd.a);
    }
    
    public final void f() {
        this.i(hwd.b);
        this.a = this.b.a("Shutter.FramesTaken");
    }
}
