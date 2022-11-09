import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class dtu implements dvt
{
    final /* synthetic */ gen a;
    final /* synthetic */ dtv b;
    
    public dtu(final dtv b, final gen a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final dtj dtj) {
        this.b.k.f("DngCallback");
        final gba c = ((gbb)this.b.f.b()).c(this.a);
        final ByteBuffer duplicate = dtj.a.duplicate();
        if (duplicate == null) {
            c.b.f();
            c.a.h();
        }
        else {
            duplicate.capacity();
            c.c.a.execute(new gaz(c, duplicate));
        }
        this.b.k.g();
    }
}
