// 
// Decompiled by Procyon v0.6.0
// 

public final class zn
{
    public Object a;
    public zq b;
    public zr c;
    private boolean d;
    
    public zn() {
        this.c = new zr();
    }
    
    public final void a(final Object o) {
        this.d = true;
        final zq b = this.b;
        if (b != null && b.b.f(o)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }
    
    @Override
    protected final void finalize() {
        final zq b = this.b;
        if (b != null && !b.isDone()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            sb.append(this.a);
            b.a(new zo(sb.toString()));
        }
        if (!this.d) {
            final zr c = this.c;
            if (c != null) {
                c.f(null);
            }
        }
    }
}
