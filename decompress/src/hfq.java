import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfq implements oun
{
    private final pii a;
    
    public hfq(final pii a) {
        this.a = a;
    }
    
    public final File a() {
        final File cacheDir = ((egg)this.a).a().getCacheDir();
        pqf.k(cacheDir);
        return cacheDir;
    }
}
