import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class oct
{
    static final oct a;
    final Runnable b;
    final Executor c;
    oct next;
    
    static {
        a = new oct();
    }
    
    public oct() {
        this.b = null;
        this.c = null;
    }
    
    public oct(final Runnable b, final Executor c) {
        this.b = b;
        this.c = c;
    }
}
