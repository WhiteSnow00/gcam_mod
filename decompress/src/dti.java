// 
// Decompiled by Procyon v0.6.0
// 

public final class dti
{
    private final nmj a;
    
    public dti(final dug dug) {
        this.a = nmj.c(dug.c);
    }
    
    public final void a(final long n) {
        synchronized (this) {
            this.a.add(n);
            this.a.toArray();
        }
    }
    
    public final boolean b(final long n) {
        synchronized (this) {
            return this.a.contains(n);
        }
    }
}
