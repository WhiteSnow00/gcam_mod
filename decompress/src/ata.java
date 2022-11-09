import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ata implements asy
{
    public final asy a;
    private final Handler b;
    
    public ata(final Handler b, final asy a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.b.post((Runnable)new asz(this));
    }
}
