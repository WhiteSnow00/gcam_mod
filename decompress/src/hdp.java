import android.app.KeyguardManager$KeyguardDismissCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class hdp extends KeyguardManager$KeyguardDismissCallback
{
    final /* synthetic */ KeyguardManager$KeyguardDismissCallback a;
    final /* synthetic */ hdr b;
    final /* synthetic */ int c;
    
    public hdp(final hdr b, final int c, final KeyguardManager$KeyguardDismissCallback a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public final void onDismissCancelled() {
        final hdn d = this.b.d;
        if (d != null) {
            d.A();
        }
        ((eiq)this.b.b.get()).g(this.c);
        this.a.onDismissCancelled();
    }
    
    public final void onDismissError() {
        final hdn d = this.b.d;
        if (d != null) {
            d.A();
        }
        ((eiq)this.b.b.get()).g(this.c);
        this.a.onDismissError();
    }
    
    public final void onDismissSucceeded() {
        ((eiq)this.b.b.get()).g(this.c);
        this.a.onDismissSucceeded();
    }
}
