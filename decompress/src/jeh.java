// 
// Decompiled by Procyon v0.6.0
// 

class jeh extends jeg
{
    final /* synthetic */ jej a;
    
    public jeh(final jej a) {
        this.a = a;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public final void f() {
        final jfl jfl = (jfl)this.a.a.get();
        jfl.n = false;
        jfl.l.animate().alpha(0.0f).setDuration((long)jfl.e).withEndAction((Runnable)new jfj(jfl, 1)).start();
        jfl.g.animate().alpha(0.0f).setDuration((long)jfl.e).withEndAction((Runnable)new jfj(jfl)).start();
        jfl.h.animate().alpha(0.0f).setDuration((long)jfl.e).withEndAction((Runnable)new jfj(jfl, 2)).start();
    }
}
