import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eew
{
    public float a;
    public Object b;
    public Object c;
    private final Object d;
    private long e;
    private int f;
    
    public eew(final Object c) {
        this.a = 0.0f;
        this.f = 4;
        this.d = c;
        this.b = c;
        this.c = c;
        this.e = SystemClock.elapsedRealtime();
    }
    
    public final void a() {
        this.a = 0.0f;
        this.f = 4;
        final Object d = this.d;
        this.b = d;
        this.c = d;
        this.e = SystemClock.elapsedRealtime();
    }
    
    public final void b() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final long n = elapsedRealtime - this.e;
        this.e = elapsedRealtime;
        final int f = this.f;
        if (f == 0) {
            throw null;
        }
        switch (f - 1) {
            default: {
                String s = null;
                switch (f) {
                    default: {
                        s = "FADED_OUT";
                        break;
                    }
                    case 3: {
                        s = "FADING_OUT";
                        break;
                    }
                    case 2: {
                        s = "FADED_IN";
                        break;
                    }
                    case 1: {
                        s = "FADING_IN";
                        break;
                    }
                }
                final StringBuilder sb = new StringBuilder(s.length() + 21);
                sb.append("Unhandled FadeState: ");
                sb.append(s);
                throw new RuntimeException(sb.toString());
            }
            case 3: {
                final Object c = this.c;
                if (c != this.d) {
                    this.b = c;
                    this.f = 1;
                    final float a = this.a + n / 200.0f;
                    this.a = a;
                    if (a >= 1.0f) {
                        this.a = 1.0f;
                    }
                }
                return;
            }
            case 2: {
                final float a2 = this.a - n / 200.0f;
                this.a = a2;
                final Object c2 = this.c;
                if (c2 == this.b) {
                    this.f = 1;
                    return;
                }
                if (a2 <= 0.0f) {
                    this.a = 0.0f;
                    this.f = 4;
                    this.b = c2;
                }
                return;
            }
            case 1: {
                if (this.c != this.b) {
                    this.f = 3;
                }
                return;
            }
            case 0: {
                final float a3 = this.a + n / 200.0f;
                this.a = a3;
                if (a3 >= 1.0f) {
                    this.a = 1.0f;
                    if (this.c != this.b) {
                        this.f = 3;
                        return;
                    }
                    this.f = 2;
                }
            }
        }
    }
}
