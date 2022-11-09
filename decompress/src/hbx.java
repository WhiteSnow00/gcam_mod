import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbx implements jds
{
    private final /* synthetic */ int a;
    
    public hbx() {
    }
    
    public hbx(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final nra nra) {
        final int a = this.a;
        boolean b = false;
        switch (a) {
            default: {
                return false;
            }
            case 0: {
                if (!nra.isEmpty()) {
                    final long longValue = (long)nra.k().b();
                    final long longValue2 = (long)nra.j().b();
                    if (nra.size() > 150) {
                        b = true;
                    }
                    else {
                        if (longValue - longValue2 <= TimeUnit.SECONDS.toNanos(5L)) {
                            return false;
                        }
                        b = true;
                    }
                }
                return b;
            }
        }
    }
}
