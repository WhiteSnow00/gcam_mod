// 
// Decompiled by Procyon v0.6.0
// 

public final class ado extends t
{
    public final int j;
    public final adu k;
    public adp l;
    private k m;
    
    public ado(final int n, final adu k) {
        this.j = n;
        this.k = k;
        if (k.h == null) {
            k.h = this;
            k.b = n;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }
    
    @Override
    protected final void d() {
        if (adn.c(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("  Starting: ");
            sb.append(this);
            sb.toString();
        }
        final adu k = this.k;
        k.d = true;
        k.f = false;
        k.e = false;
        k.h();
    }
    
    @Override
    protected final void e() {
        if (adn.c(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("  Stopping: ");
            sb.append(this);
            sb.toString();
        }
        final adu k = this.k;
        k.d = false;
        k.i();
    }
    
    @Override
    public final void f(final u u) {
        super.f(u);
        this.m = null;
        this.l = null;
    }
    
    public final void i() {
        final k m = this.m;
        final adp l = this.l;
        if (m != null && l != null) {
            super.f(l);
            this.c(m, l);
        }
    }
    
    public final void j() {
        if (adn.c(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("  Destroying: ");
            sb.append(this);
            sb.toString();
        }
        this.k.f();
        this.k.e = true;
        final adp l = this.l;
        if (l != null) {
            this.f(l);
            if (l.c) {
                if (adn.c(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Resetting: ");
                    sb2.append(l.a);
                    sb2.toString();
                }
                l.b.c();
            }
        }
        final adu k = this.k;
        final ado h = k.h;
        if (h == null) {
            throw new IllegalStateException("No listener register");
        }
        if (h == this) {
            k.h = null;
            k.f = true;
            k.d = false;
            k.e = false;
            k.g = false;
            return;
        }
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    
    final void k(final k m, final adm adm) {
        final adp l = new adp(this.k, adm);
        this.c(m, l);
        final adp i = this.l;
        if (i != null) {
            this.f(i);
        }
        this.m = m;
        this.l = l;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.j);
        sb.append(" : ");
        sb.append(this.k.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.k)));
        sb.append("}}");
        return sb.toString();
    }
}
