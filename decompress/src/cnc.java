// 
// Decompiled by Procyon v0.6.0
// 

public final class cnc
{
    private final oui a;
    private final oui b;
    private final oui c;
    
    public cnc(final oui a, final oui b, final oui c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final cnb a(final jbm jbm) {
        final jbm a = jbm.a;
        switch (jbm.ordinal()) {
            default: {
                return (cnb)this.b.get();
            }
            case 8: {
                return (cnb)this.c.get();
            }
            case 5: {
                return (cnb)this.a.get();
            }
        }
    }
}
