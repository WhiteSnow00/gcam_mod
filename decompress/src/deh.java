// 
// Decompiled by Procyon v0.6.0
// 

public final class deh
{
    public final Object a;
    public lfj b;
    
    public deh() {
        this.a = new Object();
    }
    
    public final void a(final lfj b) {
        synchronized (this.a) {
            final lfj b2 = this.b;
            if (b2 != null) {
                b2.equals(b);
            }
            this.b = b;
        }
    }
}
