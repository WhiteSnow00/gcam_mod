import android.support.v7.widget.StaggeredGridLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tb implements Runnable
{
    final /* synthetic */ StaggeredGridLayoutManager a;
    
    public tb(final StaggeredGridLayoutManager a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.G();
    }
}
