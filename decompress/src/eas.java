import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eas
{
    public float a;
    private float b;
    private int c;
    private long d;
    private long e;
    private int f;
    
    public eas() {
        this.f = 1;
    }
    
    public final void a() {
        this.a = 0.0f;
        this.b = 0.0015f;
        this.c = 0;
        this.d = 0L;
        this.f = 1;
        this.e = SystemClock.elapsedRealtime();
    }
    
    public final void b() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final long n = elapsedRealtime - this.e;
        this.e = elapsedRealtime;
        final int f = this.f;
        if (f != 0) {
            switch (f - 1) {
                case 1: {
                    final long d = this.d + n;
                    this.d = d;
                    if (d >= 800L) {
                        this.f = 1;
                        return;
                    }
                    break;
                }
                case 0: {
                    final float n2 = (float)n;
                    final float b = this.b + -7.0E-6f * n2;
                    this.b = b;
                    final float a = this.a + n2 * b;
                    this.a = a;
                    if (a >= 0.0f) {
                        break;
                    }
                    final int c = this.c + 1;
                    this.c = c;
                    this.a = 0.0f;
                    this.b = -(b * 0.55f);
                    if (c >= 2) {
                        this.f = 2;
                        this.b = 0.0015f;
                        this.c = 0;
                        this.d = 0L;
                        return;
                    }
                    break;
                }
            }
            return;
        }
        throw null;
    }
}
