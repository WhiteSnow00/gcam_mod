import java.io.Serializable;
import android.content.Intent;
import android.content.IntentSender$SendIntentException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wc implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ IntentSender$SendIntentException b;
    final /* synthetic */ wp c;
    
    public wc(final wp c, final int a, final IntentSender$SendIntentException b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.c.c(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable)this.b));
    }
}
