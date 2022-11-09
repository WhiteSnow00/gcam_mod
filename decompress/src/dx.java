import android.content.DialogInterface;

// 
// Decompiled by Procyon v0.6.0
// 

final class dx implements Runnable
{
    final /* synthetic */ ec a;
    
    public dx(final ec a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final ec a = this.a;
        a.a.onDismiss((DialogInterface)a.c);
    }
}
