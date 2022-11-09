// 
// Decompiled by Procyon v0.6.0
// 

public final class exp implements Runnable
{
    private final ewn a;
    private final exn b;
    
    public exp(final ewn a, final exn b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.a.g(this.b);
    }
}
