import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class ark implements Runnable
{
    final /* synthetic */ Handler a;
    final /* synthetic */ arr b;
    final /* synthetic */ esl c;
    private final /* synthetic */ int d;
    
    public ark(final arr b, final Handler a, final esl c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public ark(final arr b, final Handler a, final esl c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void run() {
        switch (this.d) {
            default: {
                this.b.a.d.obtainMessage(107, (Object)arx.a(this.a, this.c)).sendToTarget();
                return;
            }
            case 0: {
                this.b.a.d.obtainMessage(104, (Object)arx.a(this.a, this.c)).sendToTarget();
            }
        }
    }
}
