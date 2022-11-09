import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

final class ftd
{
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    
    public ftd() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }
    
    @Override
    public final String toString() {
        return String.format(Locale.US, "Counts: has %d ready, %d in-flight, %d failed. In the frame buffer: %d not connected, %d main shots (ignored), %d not qualified, %d already started and %d waiting to launch", this.f, this.a, this.h, this.d, this.g, this.c, this.e, this.b);
    }
}
