import androidx.work.impl.WorkDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anu
{
    private final WorkDatabase a;
    
    public anu(final WorkDatabase a) {
        this.a = a;
    }
    
    public final int a(final String s) {
        this.a.h();
        try {
            final Long a = this.a.v().a(s);
            int n = 0;
            int intValue;
            if (a != null) {
                intValue = a.intValue();
            }
            else {
                intValue = 0;
            }
            if (intValue != Integer.MAX_VALUE) {
                n = intValue + 1;
            }
            this.b(s, n);
            this.a.j();
            return intValue;
        }
        finally {
            this.a.i();
        }
    }
    
    public final void b(final String s, final int n) {
        this.a.v().b(new amj(s, n));
    }
}
