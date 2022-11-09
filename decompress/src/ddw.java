import android.widget.Toast;

// 
// Decompiled by Procyon v0.6.0
// 

final class ddw implements Runnable
{
    final /* synthetic */ String a;
    final /* synthetic */ ddx b;
    
    public ddw(final ddx b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        Toast.makeText(this.b.a, (CharSequence)this.a, 1).show();
    }
}
