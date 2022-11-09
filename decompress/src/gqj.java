// 
// Decompiled by Procyon v0.6.0
// 

final class gqj extends kwp
{
    final /* synthetic */ gqk a;
    private final kvs b;
    private final gen c;
    private final gem d;
    private final gel e;
    
    public gqj(final gqk a, final kvs b, final gen c) {
        this.a = a;
        this.b = b;
        this.c = c;
        final gem c2 = c.c;
        this.d = c2;
        this.e = c2.c();
    }
    
    @Override
    public final void b() {
        final gqk a = this.a;
        final kvs b = this.b;
        final kwz b2 = a.b;
        final gen c = this.c;
        final lju d = b.d(b2);
        ljm c2;
        if ((c2 = b.c()) == null) {
            c2 = new gsc();
        }
        b.close();
        if (d == null) {
            a.k(gqk.a.b(), "Image available for %s but the image was null!", b, '\u07b9');
        }
        else {
            try {
                final gdf a2 = a.c.a(c);
                try {
                    a2.a(d, ofi.n(c2));
                    if (a2 != null) {
                        a2.close();
                    }
                    return;
                }
                finally {
                    if (a2 != null) {
                        try {
                            a2.close();
                        }
                        finally {
                            final Throwable t;
                            ((Throwable)c2).addSuppressed(t);
                        }
                    }
                }
            }
            catch (final kuw c2) {}
            catch (final InterruptedException ex) {}
            a.m(gqk.a.b(), "Error saving image.", '\u07b8', (Throwable)c2);
        }
        this.d.f();
        this.c.b.C(iwx.a, new dgi("Image capture failed. Aborting capture!"));
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final void d(final ljm ljm) {
    }
    
    @Override
    public final void e() {
        this.e.e();
    }
}
