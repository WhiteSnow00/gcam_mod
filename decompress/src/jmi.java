// 
// Decompiled by Procyon v0.6.0
// 

final class jmi implements Runnable
{
    final /* synthetic */ jmk a;
    final /* synthetic */ jnh b;
    
    public jmi(final jmk a, final jnh b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        if (!this.a.b.D()) {
            this.a.b.w(3, "Connected to service after a timeout", null, null, null);
            final jml b = this.a.b;
            final jnh b2 = this.b;
            jlw.a();
            b.c = b2;
            b.C();
            final jma f = b.f();
            jlw.a();
            f.a.D();
        }
    }
}
