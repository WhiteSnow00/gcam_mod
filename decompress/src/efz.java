import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efz implements oun
{
    private final efs a;
    
    public efz(final efs a) {
        this.a = a;
    }
    
    public static efz a(final efs efs) {
        return new efz(efs);
    }
    
    public final WeakReference b() {
        return new WeakReference((T)this.a.a);
    }
}
