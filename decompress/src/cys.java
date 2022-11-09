import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cys
{
    protected final Object a;
    protected final moh b;
    private AtomicBoolean c;
    
    public cys(final Object a, final moh b) {
        this.c = new AtomicBoolean(false);
        this.a = a;
        this.b = b;
    }
    
    public cys(final boolean b, final moh moh) {
        this((Object)b, moh);
    }
    
    final Object a() {
        final moh b = this.b;
        b.getClass();
        if (this.c.getAndSet(Boolean.TRUE)) {
            return b.e();
        }
        try {
            final String value = String.valueOf(b.f());
            String concat;
            if (value.length() != 0) {
                concat = "Phenotype:".concat(value);
            }
            else {
                concat = new String("Phenotype:");
            }
            Trace.beginSection(concat);
            return b.e();
        }
        finally {
            Trace.endSection();
        }
    }
}
