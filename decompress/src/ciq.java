import android.os.SystemClock;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class ciq extends BroadcastReceiver
{
    final /* synthetic */ cir a;
    
    public ciq(final cir a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        synchronized (this.a.b) {
            final String action = intent.getAction();
            if (!this.a.d && action != null) {
                if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                    switch (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)) {
                        case 2: {
                            this.a.e = 2;
                            break;
                        }
                        case 1: {
                            SystemClock.uptimeMillis();
                            final cir a = this.a;
                            a.e = 3;
                            final klv c = a.c;
                            c.getClass();
                            c.aR(true);
                            break;
                        }
                        case 0: {
                            final cir a2 = this.a;
                            a2.e = 1;
                            final klv c2 = a2.c;
                            c2.getClass();
                            c2.aR(false);
                            break;
                        }
                        case -1: {
                            cir.a.c().E(497).o("receive SCO_AUDIO_STATE_ERROR");
                            break;
                        }
                    }
                }
            }
        }
    }
}
