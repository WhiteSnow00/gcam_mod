import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfx extends RuntimeException
{
    public final List a;
    public final kst b;
    
    public dfx(final String s, final kst b, final lfu... array) {
        super(s);
        this.a = Arrays.asList(array);
        this.b = b;
    }
}
