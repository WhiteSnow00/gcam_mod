import j$.util.Objects;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lxj
{
    private final int a;
    private final int[] b;
    private final int[] c;
    private final lxk d;
    private final boolean e;
    
    public lxj(final lxk d, int i, final int[] b) {
        this.a = i;
        this.b = b;
        this.c = new int[2];
        this.d = d;
        boolean e = false;
        Label_0067: {
            if ((i & 0x7) == 0x0) {
                for (i = 0; i < 2; ++i) {
                    if (b[i] % 8 != 0) {
                        break Label_0067;
                    }
                }
                e = true;
            }
        }
        this.e = e;
        Arrays.fill(this.c, 1);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lxj)) {
            return false;
        }
        final lxj lxj = (lxj)o;
        return this.a == lxj.a && this.e == lxj.e && Arrays.equals(this.b, lxj.b) && Arrays.equals(this.c, lxj.c) && Objects.equals((Object)this.d, (Object)lxj.d);
    }
    
    @Override
    public final int hashCode() {
        return (((this.a * 31 + Arrays.hashCode(this.b)) * 31 + Arrays.hashCode(this.c)) * 31 + this.d.hashCode()) * 31 + (this.e ? 1 : 0);
    }
    
    @Override
    public final String toString() {
        return "Channel[Norm8]";
    }
}
