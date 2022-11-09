import android.util.Range;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cet implements cer
{
    private final Range a;
    private final niz b;
    private final boolean c;
    
    public cet(final Range a, final niz b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Range a() {
        if (this.c && this.b.g()) {
            return (Range)this.b.c();
        }
        return this.a;
    }
    
    @Override
    public final Range b() {
        if (this.c && this.b.g()) {
            return (Range)this.b.c();
        }
        return this.a;
    }
}
