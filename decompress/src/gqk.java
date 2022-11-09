// 
// Decompiled by Procyon v0.6.0
// 

public final class gqk implements gfg
{
    public static final nsd a;
    public final kwz b;
    public final gdg c;
    private final kwd d;
    private final fzr e;
    private final kzl f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/commands/PckSingleImageCaptureCommand");
    }
    
    public gqk(final kwd d, final kwz b, final kzl f, final gdg c, final fzr e) {
        this.d = d;
        this.b = b;
        this.f = f;
        this.c = c;
        this.e = e;
    }
    
    @Override
    public final klj a() {
        return klq.g(true);
    }
    
    @Override
    public final klj b() {
        return klq.g(this.e);
    }
    
    @Override
    public final void c(final gff gff, final gen gen) {
        final kwd d = this.d;
        final kzl f = this.f;
        if (d != null && f != null) {
            final kvs q = d.q(f);
            q.j(new gqj(this, q, gen));
        }
        gff.close();
    }
}
