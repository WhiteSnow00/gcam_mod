import com.google.googlex.gcam.Gcam;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwp implements oun
{
    private final pii a;
    
    public dwp(final pii a) {
        this.a = a;
    }
    
    public static dwp b(final pii pii) {
        return new dwp(pii);
    }
    
    public final dwn a() {
        return new dwn((Gcam)this.a.get());
    }
}
