// 
// Decompiled by Procyon v0.6.0
// 

final class ocv implements Runnable
{
    final odc a;
    final oey b;
    
    public ocv(final odc a, final oey b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final odc a = this.a;
        final boolean d = odc.d;
        if (a.value != this) {
            return;
        }
        if (odc.e.d(this.a, this, odc.j(this.b))) {
            odc.l(this.a);
        }
    }
}
