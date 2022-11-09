import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdc
{
    public final AtomicInteger a;
    
    public jdc() {
        this.a = new AtomicInteger(0);
    }
    
    public final int a() {
        return this.a.get();
    }
    
    public final jdb b() {
        return new jdb(this);
    }
}
