// 
// Decompiled by Procyon v0.6.0
// 

public final class mva
{
    private final pik a;
    private final pik b;
    
    public mva(final byte[] array) {
        this(array, 16);
    }
    
    public mva(final byte[] array, final int n) {
        this.a = pip.c(new muz(array, 1));
        this.b = pip.c(new muz(array));
        final int length = array.length;
        if (length == 0) {
            throw new IllegalStateException("Decoded id is empty".toString());
        }
        if (length <= n) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(this.a());
        sb.append(" (encoded ");
        sb.append(this.b());
        sb.append(") is longer than ");
        sb.append(n);
        sb.append("-byte maximum");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public mva(final byte[] array, final byte[] array2) {
        this(array, 24);
    }
    
    public final String a() {
        return (String)this.a.a();
    }
    
    public final String b() {
        return (String)this.b.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof mva && plr.b(((mva)o).b(), this.b());
    }
    
    @Override
    public final int hashCode() {
        return this.b().hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("F250Id(decodedId=");
        sb.append(this.a());
        sb.append(", encodedId=");
        sb.append(this.b());
        sb.append(')');
        return sb.toString();
    }
}
