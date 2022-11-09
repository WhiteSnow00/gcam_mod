// 
// Decompiled by Procyon v0.6.0
// 

final class qk implements Runnable
{
    final /* synthetic */ ql a;
    
    public qk(final ql a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final ql a = this.a;
        a.b = null;
        a.drawableStateChanged();
    }
}
