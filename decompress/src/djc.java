// 
// Decompiled by Procyon v0.6.0
// 

public final class djc implements jgb, krc
{
    private final klj a;
    private niz b;
    private jgd c;
    
    public djc(final klj a) {
        this.b = nii.a;
        this.a = a;
    }
    
    @Override
    public final jfy a(final jgd c) {
        synchronized (this) {
            if (!this.b.g() || this.c != c) {
                if (this.b.g()) {
                    ((dje)this.b.c()).close();
                }
                (this.c = c).b();
                this.b = niz.i(new dje(((jfr)c).b, this.a));
            }
            return (jfy)this.b.c();
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.c = null;
            this.b = nii.a;
        }
    }
}
