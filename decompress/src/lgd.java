// 
// Decompiled by Procyon v0.6.0
// 

final class lgd implements ljw
{
    final /* synthetic */ lgf a;
    private final ljw b;
    
    public lgd(final lgf a, final ljw b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        synchronized (this.a.a) {
            final lgf a = this.a;
            if (a.b) {
                a.j();
                return;
            }
            monitorexit(this.a.a);
            this.b.a();
        }
    }
}
