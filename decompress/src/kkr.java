// 
// Decompiled by Procyon v0.6.0
// 

final class kkr implements krc, kkt
{
    private final krc a;
    private final String b;
    
    public kkr(final krc a) {
        this.a = a;
        this.b = "OneCameraLifetime";
    }
    
    @Override
    public final String c() {
        return this.b;
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
}
