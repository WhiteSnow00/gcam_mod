// 
// Decompiled by Procyon v0.6.0
// 

public final class lgi extends ljs
{
    public final Object a;
    public int b;
    
    public lgi(final ljx ljx) {
        super(ljx);
        this.a = new Object();
        this.b = 0;
    }
    
    private final lju j(final lju lju) {
        if (lju == null) {
            return null;
        }
        ++this.b;
        return new lgh(this, lju);
    }
    
    @Override
    public final lju f() {
        synchronized (this.a) {
            if (this.b == this.c()) {
                return null;
            }
            return this.j(super.f());
        }
    }
    
    @Override
    public final lju g() {
        synchronized (this.a) {
            if (this.b == this.c()) {
                return null;
            }
            return this.j(super.g());
        }
    }
}
