import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class jsn
{
    public final jrq a;
    public final jpu b;
    
    public jsn(final jrq a, final jpu b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o != null && o instanceof jsn) {
            final jsn jsn = (jsn)o;
            if (jvu.m(this.a, jsn.a) && jvu.m(this.b, jsn.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    @Override
    public final String toString() {
        final ArrayList list = new ArrayList();
        jvu.o("key", this.a, list);
        jvu.o("feature", this.b, list);
        return jvu.n(list, this);
    }
}
