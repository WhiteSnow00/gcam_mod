// 
// Decompiled by Procyon v0.6.0
// 

public class ols
{
    protected volatile omj a;
    public volatile ojw b;
    
    static {
        okm.a();
    }
    
    public final ojw a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = ojw.b;
            }
            else {
                this.b = this.a.d();
            }
            return this.b;
        }
    }
    
    public final omj b(final omj omj) {
        Label_0054: {
            if (this.a != null) {
                break Label_0054;
            }
            synchronized (this) {
                if (this.a != null) {
                    monitorexit(this);
                }
                else {
                    try {
                        this.a = omj;
                        this.b = ojw.b;
                    }
                    catch (final olm olm) {
                        this.a = omj;
                        this.b = ojw.b;
                    }
                    monitorexit(this);
                }
                return this.a;
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ols)) {
            return false;
        }
        final ols ols = (ols)o;
        final omj a = this.a;
        final omj a2 = ols.a;
        if (a == null && a2 == null) {
            return this.a().equals(ols.a());
        }
        if (a != null && a2 != null) {
            return a.equals(a2);
        }
        if (a != null) {
            return a.equals(ols.b(a.l()));
        }
        return this.b(a2.l()).equals(a2);
    }
    
    @Override
    public int hashCode() {
        return 1;
    }
}
