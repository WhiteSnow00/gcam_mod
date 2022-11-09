import android.graphics.Typeface;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

final class pr implements Runnable
{
    final /* synthetic */ TextView a;
    final /* synthetic */ Typeface b;
    final /* synthetic */ int c;
    
    public pr(final TextView a, final Typeface b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        this.a.setTypeface(this.b, this.c);
    }
}
