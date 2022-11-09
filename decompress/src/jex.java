// 
// Decompiled by Procyon v0.6.0
// 

final class jex implements Runnable
{
    final /* synthetic */ jey a;
    
    public jex(final jey a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final jey a = this.a;
        if (!a.d) {
            return;
        }
        nov.z(a.b);
        nov.z(this.a.a);
        final jey a2 = this.a;
        a2.a.b(a2.b.getCurrentPosition());
        this.a.b.postDelayed((Runnable)this, 10L);
    }
}
