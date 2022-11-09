// 
// Decompiled by Procyon v0.6.0
// 

public final class ayz implements aza, bja
{
    private static final hp a;
    private final bjd b;
    private aza c;
    private boolean d;
    private boolean e;
    
    static {
        a = bjc.b(20, new bal(1));
    }
    
    public ayz() {
        this.b = bjd.a();
    }
    
    static ayz d(final aza c) {
        final ayz ayz = (ayz)ayz.a.a();
        bit.a(ayz);
        ayz.e = false;
        ayz.d = true;
        ayz.c = c;
        return ayz;
    }
    
    @Override
    public final int a() {
        return this.c.a();
    }
    
    @Override
    public final bjd aK() {
        return this.b;
    }
    
    @Override
    public final Class b() {
        return this.c.b();
    }
    
    @Override
    public final Object c() {
        return this.c.c();
    }
    
    @Override
    public final void e() {
        synchronized (this) {
            this.b.b();
            this.e = true;
            if (!this.d) {
                this.c.e();
                this.c = null;
                ayz.a.b(this);
            }
        }
    }
    
    final void f() {
        synchronized (this) {
            this.b.b();
            if (this.d) {
                this.d = false;
                if (this.e) {
                    this.e();
                }
                return;
            }
            throw new IllegalStateException("Already unlocked");
        }
    }
}
