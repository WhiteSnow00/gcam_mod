import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ety implements Runnable
{
    final /* synthetic */ TextView a;
    
    public ety(final TextView a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.setVisibility(4);
    }
}
