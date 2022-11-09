import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class jqc extends jvl
{
    private final byte[] a;
    
    public jqc(final byte[] a) {
        super(Arrays.copyOfRange(a, 0, 25));
        this.a = a;
    }
    
    @Override
    public final byte[] w() {
        return this.a;
    }
}
