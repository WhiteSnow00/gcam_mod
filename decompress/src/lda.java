import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lda
{
    public final int a;
    public final Set b;
    public final Set c;
    public final Set d;
    private final int e;
    
    public lda(int f, final Set set, final Set set2, final Set set3) {
        this.a = f;
        this.b = noi.F(set);
        this.d = noi.F(set2);
        this.c = noi.F(set3);
        synchronized (lbi.class) {
            f = lbi.f;
            lbi.f = f + 1;
            monitorexit(lbi.class);
            this.e = f;
        }
    }
    
    @Override
    public final String toString() {
        final int e = this.e;
        final StringBuilder sb = new StringBuilder(19);
        sb.append("Request-");
        sb.append(e);
        return sb.toString();
    }
}
