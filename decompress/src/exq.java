// 
// Decompiled by Procyon v0.6.0
// 

public final class exq implements Runnable
{
    private final ewy a;
    private final exn b;
    
    public exq(final ewy a, final exn b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.a.c(this.b);
    }
}
