import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class koc implements Comparable
{
    public boolean a;
    public volatile boolean b;
    public boolean c;
    public MediaFormat d;
    private int e;
    private final int f;
    
    public koc(final int f) {
        this.f = f;
        this.a = false;
        this.b = false;
        this.e = -1;
        this.c = true;
        this.d = null;
    }
    
    public final int a() {
        if (this.a) {
            return this.e;
        }
        throw new IllegalStateException("Track is not yet added");
    }
    
    public final void b() {
        this.c = false;
    }
    
    public final void c(final int e) {
        if (this.f != 3) {
            this.e = e;
            this.a = true;
            this.b = false;
            return;
        }
        throw new IllegalStateException("This track is forbidden.");
    }
    
    public final boolean d() {
        return this.f == 3;
    }
    
    public final boolean e() {
        switch (this.f - 1) {
            default: {
                return true;
            }
            case 1: {
                return this.b || this.a;
            }
            case 0: {
                return this.a;
            }
        }
    }
}
