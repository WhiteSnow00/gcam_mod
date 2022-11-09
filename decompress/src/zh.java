import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class zh
{
    static final zh a;
    final Runnable b;
    final Executor c;
    zh next;
    
    static {
        a = new zh(null, null);
    }
    
    public zh(final Runnable b, final Executor c) {
        this.b = b;
        this.c = c;
    }
}
