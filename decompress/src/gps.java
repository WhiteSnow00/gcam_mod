import com.google.android.libraries.camera.exif.ExifInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gps implements gfg
{
    private final gfg a;
    
    public gps(final gfg a) {
        this.a = a;
    }
    
    @Override
    public final klj a() {
        return this.a.a();
    }
    
    @Override
    public final klj b() {
        return this.a.b();
    }
    
    @Override
    public final void c(final gff gff, final gen gen) {
        if (gen.b.i() == hio.o) {
            new kre(0, 0);
            final hwr hwr = new hwr(llk.c);
            hwr.a(new ExifInterface());
            hwr.b(kra.b(gen.a.a));
            gen.b.r(null, hwr);
            return;
        }
        this.a.c(gff, gen);
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.b("delegate", this.a);
        return c.toString();
    }
}
