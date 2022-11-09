// 
// Decompiled by Procyon v0.6.0
// 

final class dw extends dv
{
    public final Object c;
    public final Object d;
    
    public dw(final ge ge, final aan aan, final boolean b, final boolean b2) {
        super(ge, aan);
        final int e = ge.e;
        final Object o = null;
        if (e == 2) {
            Object j;
            if (b) {
                final ei a = ge.a;
                final ef r = a.R;
                if (r == null) {
                    j = null;
                }
                else if (r.j == ei.g) {
                    a.T();
                    j = null;
                }
                else {
                    j = a.R.j;
                }
            }
            else {
                ge.a.S();
                j = null;
            }
            this.c = j;
            if (b) {
                final ef r2 = ge.a.R;
            }
            else {
                final ef r3 = ge.a.R;
            }
        }
        else {
            Object i;
            if (b) {
                final ei a2 = ge.a;
                final ef r4 = a2.R;
                if (r4 == null) {
                    i = null;
                }
                else if (r4.i == ei.g) {
                    a2.S();
                    i = null;
                }
                else {
                    i = a2.R.i;
                }
            }
            else {
                ge.a.T();
                i = null;
            }
            this.c = i;
        }
        if (b2) {
            if (b) {
                final ei a3 = ge.a;
                final ef r5 = a3.R;
                Object k;
                if (r5 == null) {
                    k = o;
                }
                else if (r5.k == ei.g) {
                    a3.V();
                    k = o;
                }
                else {
                    k = a3.R.k;
                }
                this.d = k;
                return;
            }
            ge.a.V();
        }
        this.d = null;
    }
    
    public final void a(final Object o) {
        if (o == null) {
            return;
        }
        final int b = fs.b;
        if (fs.a != null) {
            fs.a.a();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Transition ");
        sb.append(o);
        sb.append(" for fragment ");
        sb.append(super.a.a);
        sb.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb.toString());
    }
}
