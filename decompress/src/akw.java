import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

final class akw implements Runnable
{
    private final akz a;
    private final Intent b;
    private final int c;
    
    public akw(final akz a, final Intent b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        this.a.f(this.b, this.c);
    }
}
