// 
// Decompiled by Procyon v0.6.0
// 

public final class jou
{
    public int a;
    
    public jou() {
        this.a = 1;
    }
    
    public final void a(final boolean b) {
        this.a = this.a * 31 + (b ? 1 : 0);
    }
    
    public final void b(final Object o) {
        final int a = this.a;
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        this.a = a * 31 + hashCode;
    }
}
