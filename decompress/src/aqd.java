import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqd
{
    private final List a;
    
    public aqd() {
        this.a = new ArrayList(5);
    }
    
    public final int a() {
        return this.a.size();
    }
    
    public final aqe b(final int n) {
        return this.a.get(n);
    }
    
    public final void c(final aqe aqe) {
        this.a.add(aqe);
    }
    
    @Override
    public final String toString() {
        final StringBuffer sb = new StringBuffer();
        for (int i = 1; i < this.a(); ++i) {
            sb.append(this.b(i));
            if (i < this.a() - 1) {
                final int b = this.b(i + 1).b;
                if (b == 1 || b == 2) {
                    sb.append('/');
                }
            }
        }
        return sb.toString();
    }
}
