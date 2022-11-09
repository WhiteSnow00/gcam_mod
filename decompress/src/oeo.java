import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oeo implements Runnable
{
    final /* synthetic */ Future a;
    
    public oeo(final Future a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.cancel(false);
    }
}
