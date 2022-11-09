// 
// Decompiled by Procyon v0.6.0
// 

class dv
{
    public final ge a;
    public final aan b;
    
    public dv(final ge a, final aan b) {
        this.a = a;
        this.b = b;
    }
    
    final void b() {
        final ge a = this.a;
        if (a.b.remove(this.b) && a.b.isEmpty()) {
            a.a();
        }
    }
    
    final boolean c() {
        final int h = a.h(this.a.a.O);
        final int e = this.a.e;
        boolean b = false;
        if (h != e) {
            if (h == 2) {
                return b;
            }
            if (e == 2) {
                return false;
            }
        }
        b = true;
        return b;
    }
}
