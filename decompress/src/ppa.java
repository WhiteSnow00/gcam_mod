import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class ppa implements por
{
    public final pnc a;
    public final ppd b;
    private final pnf c;
    private final pnf d;
    
    public ppa(final ppd b, final Throwable t) {
        this.b = b;
        this.a = plv.i();
        this.c = plv.g(t);
        this.d = plv.g(null);
    }
    
    public static final ArrayList i() {
        return new ArrayList(4);
    }
    
    public final Object c() {
        return this.d.a;
    }
    
    @Override
    public final ppd ck() {
        return this.b;
    }
    
    @Override
    public final boolean cl() {
        return this.d() == null;
    }
    
    public final Throwable d() {
        return (Throwable)this.c.a;
    }
    
    public final void e(final Throwable a) {
        final Throwable d = this.d();
        if (d == null) {
            final pnf c = this.c;
            final int a2 = png.a;
            c.a = a;
            return;
        }
        if (a == d) {
            return;
        }
        final Object c2 = this.c();
        if (c2 == null) {
            this.f(a);
            return;
        }
        if (c2 instanceof Throwable) {
            if (a == c2) {
                return;
            }
            final ArrayList i = i();
            i.add(c2);
            i.add(a);
            this.f(i);
        }
        else {
            if (c2 instanceof ArrayList) {
                ((ArrayList<Throwable>)c2).add(a);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("State is ");
            sb.append(c2);
            throw new IllegalStateException(sb.toString().toString());
        }
    }
    
    public final void f(final Object a) {
        final pnf d = this.d;
        final int a2 = png.a;
        d.a = a;
    }
    
    public final boolean g() {
        return this.d() != null;
    }
    
    public final boolean h() {
        return this.a.a();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Finishing[cancelling=");
        sb.append(this.g());
        sb.append(", completing=");
        sb.append(this.h());
        sb.append(", rootCause=");
        sb.append(this.d());
        sb.append(", exceptions=");
        sb.append(this.c());
        sb.append(", list=");
        sb.append(this.b);
        sb.append(']');
        return sb.toString();
    }
}
