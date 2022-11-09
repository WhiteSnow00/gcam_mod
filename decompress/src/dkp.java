// 
// Decompiled by Procyon v0.6.0
// 

public final class dkp implements jgb
{
    private final dkj a;
    private dko b;
    private jgd c;
    
    public dkp(final dkj a) {
        this.b = null;
        this.c = null;
        this.a = a;
    }
    
    @Override
    public final jfy a(final jgd c) {
        synchronized (this) {
            if (this.c != c || this.b == null) {
                try (final dko b = this.b) {}
                this.b = new dko(c.b(), this.a);
                this.c = c;
            }
            return this.b;
        }
    }
}
