import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cid
{
    public final Map a;
    
    public cid() {
        this.a = new HashMap();
    }
    
    public final kjk a(final cic cic) {
        if (this.a.containsKey(cic)) {
            return this.a.get(cic);
        }
        final kjk kjk = new kjk();
        this.a.put(cic, kjk);
        return kjk;
    }
    
    public final void b(final cic cic) {
        try (final kjk kjk = this.a.remove(cic)) {}
    }
}
