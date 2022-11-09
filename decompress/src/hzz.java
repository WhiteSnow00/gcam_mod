import java.util.TimerTask;

// 
// Decompiled by Procyon v0.6.0
// 

final class hzz extends TimerTask
{
    final /* synthetic */ iaa a;
    
    public hzz(final iaa a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final iaa a = this.a;
        a.o.set(a.K.f);
    }
}
