// 
// Decompiled by Procyon v0.6.0
// 

final class bpu implements bor
{
    private final klv a;
    private final klv b;
    
    public bpu(final klv a) {
        this.a = a;
        this.b = new kkz(15);
    }
    
    @Override
    public final klj a() {
        return this.a;
    }
    
    @Override
    public final klv b() {
        return this.b;
    }
    
    @Override
    public final boolean c() {
        boolean b = false;
        try {
            if (jli.a != null) {
                b = true;
            }
            return b;
        }
        catch (final NoSuchFieldError noSuchFieldError) {
            return false;
        }
    }
}
