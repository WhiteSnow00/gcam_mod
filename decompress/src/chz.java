import java.util.TimerTask;

// 
// Decompiled by Procyon v0.6.0
// 

final class chz extends TimerTask
{
    final /* synthetic */ cia a;
    
    public chz(final cia a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final cia a = this.a;
        if (!a.d.a) {
            return;
        }
        a.c.execute(new chy(this));
    }
}
