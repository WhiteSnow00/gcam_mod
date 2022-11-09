// 
// Decompiled by Procyon v0.6.0
// 

class kih extends khf
{
    private jrt a;
    
    public kih(final jrt a) {
        this.a = a;
    }
    
    public final void f(final Object o) {
        final jrt a = this.a;
        if (a != null) {
            a.c(o);
            this.a = null;
        }
    }
}
