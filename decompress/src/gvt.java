import java.util.TimerTask;

// 
// Decompiled by Procyon v0.6.0
// 

final class gvt extends TimerTask
{
    final /* synthetic */ gvu a;
    
    public gvt(final gvu a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.c.execute(new gvs(this));
    }
}
