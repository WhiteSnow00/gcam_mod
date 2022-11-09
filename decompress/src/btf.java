import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btf implements krc
{
    private final AtomicBoolean a;
    
    public btf() {
        this.a = new AtomicBoolean(false);
    }
    
    public final boolean a() {
        return this.a.get();
    }
    
    @Override
    public final void close() {
        this.a.set(true);
    }
}
