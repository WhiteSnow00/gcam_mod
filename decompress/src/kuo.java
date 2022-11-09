// 
// Decompiled by Procyon v0.6.0
// 

final class kuo extends ljk
{
    final /* synthetic */ ljg a;
    final /* synthetic */ kup b;
    
    public kuo(final kup b, final ljg ljg, final ljg a) {
        this.b = b;
        this.a = a;
        super(ljg);
    }
    
    @Override
    public final void close() {
        this.b.a();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a.b());
        String concat;
        if (value.length() != 0) {
            concat = "Virtual Camera ".concat(value);
        }
        else {
            concat = new String("Virtual Camera ");
        }
        return concat;
    }
}
