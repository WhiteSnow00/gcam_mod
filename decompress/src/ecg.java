// 
// Decompiled by Procyon v0.6.0
// 

public final class ecg implements oun
{
    private final pii a;
    private final pii b;
    
    public ecg(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public final ecf a() {
        final ecb ecb = (ecb)this.a.get();
        return new ecf((cxl)this.b.get());
    }
}
