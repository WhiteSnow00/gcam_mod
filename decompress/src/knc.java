// 
// Decompiled by Procyon v0.6.0
// 

public final class knc
{
    public final kmu a;
    public final kmv b;
    public final kmt c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    private final int h;
    
    public knc() {
    }
    
    public knc(final kmu a, final kmv b, final int h, final kmt c, final int d, final int e, final int f, final int g) {
        if (a == null) {
            throw new NullPointerException("Null videoFileFormat");
        }
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null videoResolution");
        }
        this.b = b;
        this.h = h;
        if (c != null) {
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            return;
        }
        throw new NullPointerException("Null camcorderCaptureRate");
    }
    
    public final int a() {
        return this.c.i;
    }
    
    public final int b() {
        if (this.c.g()) {
            return this.h;
        }
        return this.h / this.c.a();
    }
    
    public final int c() {
        return this.c.j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof knc) {
            final knc knc = (knc)o;
            if (this.a.equals(knc.a) && this.b.equals(knc.b) && this.h == knc.h && this.c.equals(knc.c) && this.d == knc.d && this.e == knc.e && this.f == knc.f && this.g == knc.g) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.h) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d) * 1000003 ^ this.e) * 1000003 ^ this.f) * 1000003 ^ this.g;
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.b("camcorderVideoFileFormat", this.a);
        c.b("camcorderVideoResolution", this.b);
        c.e("videoCaptureBitRate", this.h);
        c.e("videoCaptureFrameRate", this.a());
        c.e("videoEncoder", this.d);
        c.e("videoEncodingFrameRate", this.c());
        c.e("videoKeyFrameInterval", this.g);
        return c.toString();
    }
}
