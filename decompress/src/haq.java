// 
// Decompiled by Procyon v0.6.0
// 

public final class haq
{
    private static final nsd a;
    private gzn b;
    private final fjo c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/qualityscore/GlobalMotionSharpnessFrameQualityScorer");
    }
    
    public haq(final fjo c) {
        this.c = c;
    }
    
    private final boolean b(final long n) {
        monitorenter(this);
        try {
            final gzn b = this.b;
            while (true) {
                Label_0043: {
                    if (b == null) {
                        break Label_0043;
                    }
                    final long b2 = b.b;
                    if (b2 >= n || b2 < n - 99999999L) {
                        break Label_0043;
                    }
                    final boolean b3 = true;
                    monitorexit(this);
                    return b3;
                }
                final boolean b3 = false;
                continue;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final float a(final gzn b) {
        synchronized (this) {
            float n;
            if (this.b(b.b)) {
                n = (float)Math.exp(this.c.a(this.b, b) / (b.b - this.b.b) * -0.05f * b.c);
            }
            else {
                haq.a.c().E(2203).q("Could not find previous metadata for frame at %d", b.b);
                n = 0.0f;
            }
            this.b = b;
            return n;
        }
    }
}
