// 
// Decompiled by Procyon v0.6.0
// 

final class lhp extends lhq
{
    lic a;
    private final pii b;
    
    public lhp(final pii b) {
        this.a = null;
        this.b = b;
    }
    
    @Override
    public final void a(final Object o, final lhu lhu) {
        synchronized (this) {
            if (this.a == null) {
                this.a = (lic)this.b.get();
            }
            this.a.a(o);
        }
    }
    
    @Override
    public final void b(final lih lih, final lhz lhz) {
        synchronized (this) {
            final lic a = this.a;
            this.a = null;
            monitorexit(this);
            if (a != null) {
                lih.a(lhz);
                a.b(lih, ((lia)lhz).b);
            }
        }
    }
}
