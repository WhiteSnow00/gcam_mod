import android.os.AsyncTask$Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class lpa implements Runnable
{
    final /* synthetic */ lpb a;
    
    public lpa(final lpb a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        if (this.a.getStatus() != AsyncTask$Status.FINISHED) {
            this.a.cancel(true);
            this.a.a(15, 15);
        }
    }
}
