// 
// Decompiled by Procyon v0.6.0
// 

public final class ghv extends kxc
{
    public final eyt a;
    private final kjm b;
    
    public ghv(final eyt a, final kjm b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void aO(final lem lem) {
        if (lem != null && lem.a() != 0) {
            return;
        }
        this.b.execute(new ghu(this));
    }
}
