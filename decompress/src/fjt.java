import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjt implements oun
{
    private final pii a;
    
    public fjt(final pii a) {
        this.a = a;
    }
    
    public final fjr a() {
        return new fjr((Executor)this.a.get());
    }
}
