// 
// Decompiled by Procyon v0.6.0
// 

public final class ger implements geo
{
    public final hhy a;
    private final kjm b;
    private final Object c;
    private final jcz d;
    
    public ger(final hhy a, final kjm b) {
        this.c = new Object();
        this.d = new jcz();
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final jcy jcy, float a) {
        synchronized (this.c) {
            a = this.d.a(jcy, a);
            this.b.execute(new geq(this, a));
        }
    }
}
