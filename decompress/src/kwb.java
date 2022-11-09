// 
// Decompiled by Procyon v0.6.0
// 

class kwb extends kxc
{
    private final kri a;
    
    public kwb(final kri a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this.a.equals(o);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
