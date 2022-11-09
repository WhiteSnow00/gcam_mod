import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bsx implements krc
{
    public final kjk a;
    private final bsv b;
    private final AtomicBoolean c;
    
    public bsx(final bsv b, final kjk a) {
        this.b = b;
        this.a = a;
        this.c = new AtomicBoolean(false);
    }
    
    @Override
    public final void close() {
        if (this.c.getAndSet(true)) {
            return;
        }
        this.b.execute(new bsw(this));
        this.b.close();
    }
}
