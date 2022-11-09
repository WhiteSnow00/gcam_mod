import android.support.v7.widget.Toolbar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tq implements Runnable
{
    final /* synthetic */ Toolbar a;
    
    public tq(final Toolbar a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.t();
    }
}
