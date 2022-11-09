// 
// Decompiled by Procyon v0.6.0
// 

public final class bjd
{
    public volatile boolean a;
    
    public static bjd a() {
        return new bjd();
    }
    
    public final void b() {
        if (!this.a) {
            return;
        }
        throw new IllegalStateException("Already released");
    }
}
