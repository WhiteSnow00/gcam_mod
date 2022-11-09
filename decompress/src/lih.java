// 
// Decompiled by Procyon v0.6.0
// 

public final class lih
{
    public final lin a;
    public lil b;
    
    public lih() {
        this.a = new lin();
        this.b = null;
        System.nanoTime();
    }
    
    public final void a(final lhz lhz) {
        final lin a = this.a;
        final String a2 = ((lia)lhz).a;
        final lil lil = a.a.get(a2);
        lil b;
        if (lil == null) {
            b = new lil(lhz);
            a.a.put(a2, b);
        }
        else {
            b = lil;
        }
        this.b = b;
    }
}
