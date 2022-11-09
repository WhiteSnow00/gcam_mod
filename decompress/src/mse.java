import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mse implements Closeable
{
    public final Closeable a;
    
    public mse(final Closeable a) {
        this.a = a;
    }
    
    @Override
    public final void close() {
        try (final Closeable a = this.a) {}
    }
}
