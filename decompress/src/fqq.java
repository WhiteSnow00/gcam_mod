// 
// Decompiled by Procyon v0.6.0
// 

public final class fqq implements frl
{
    private static final nsd a;
    private final ftk b;
    private final lup c;
    private final kra d;
    private frl e;
    private boolean f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/moments/EncoderStartingImageSink");
    }
    
    public fqq(final ftk b, final lup c, final kra d) {
        this.e = null;
        this.f = false;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final lju lju) {
        synchronized (this) {
            if (this.f) {
                lju.d();
                lju.close();
                return;
            }
            if (this.e == null) {
                this.e = this.b.a(this.c, this.d);
            }
            final frl e = this.e;
            e.getClass();
            e.a(lju);
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (this.f) {
                a.l(fqq.a.c(), "Closing sink more than once", '\u06f1');
                return;
            }
            final frl e = this.e;
            if (e != null) {
                e.close();
            }
            else {
                this.c.close();
            }
            this.f = true;
        }
    }
}
