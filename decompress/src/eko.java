// 
// Decompiled by Procyon v0.6.0
// 

final class eko implements hrk
{
    final /* synthetic */ ekw a;
    
    public eko(final ekw a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        final ekw a = this.a;
        if (a.C) {
            a.C = false;
            a.e.post((Runnable)new ekb(a));
        }
        this.a.e.post((Runnable)new ekn(this));
    }
}
