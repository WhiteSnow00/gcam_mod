import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lhu
{
    public static final lhu a;
    public final Object[] b;
    private final int c;
    
    static {
        a = new lhu(new Object[0]);
    }
    
    private lhu(final Object[] b) {
        this.b = b;
        this.c = Arrays.hashCode(b);
    }
    
    public static lhu a(final Object... array) {
        if (array.length == 0) {
            return lhu.a;
        }
        return new lhu(array);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof lhu) {
            final int c = this.c;
            final lhu lhu = (lhu)o;
            if (c == lhu.c && Arrays.equals(this.b, lhu.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.c;
    }
    
    @Override
    public final String toString() {
        return Arrays.toString(this.b);
    }
}
