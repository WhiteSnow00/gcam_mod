// 
// Decompiled by Procyon v0.6.0
// 

public final class fvz implements kri
{
    private final kkz a;
    private fvy b;
    
    public fvz() {
        this.a = new kkz(fwc.a(fvy.b(), fvy.b()));
        this.b = fvy.b();
    }
    
    public final void b(final fvy b) {
        if (!b.equals(this.b)) {
            this.a.aR(fwc.a(this.b, b));
            this.b = b;
        }
    }
}
