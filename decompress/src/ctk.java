// 
// Decompiled by Procyon v0.6.0
// 

public final class ctk
{
    public final ctq a;
    public int b;
    public int c;
    public int d;
    
    public ctk(final ctq a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.b("Reason", this.a);
        c.e("Impressions before reboot", this.b);
        c.e("Impressions after reboot", this.c);
        c.e("Reboot count", this.d);
        return c.toString();
    }
}
