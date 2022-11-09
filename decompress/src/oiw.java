import android.content.Intent;
import android.content.Context;
import com.google.lullaby.modules.audio.DeviceInfo;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oiw extends BroadcastReceiver
{
    final /* synthetic */ DeviceInfo a;
    
    public oiw(final DeviceInfo a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
            switch (intent.getIntExtra("state", -1)) {
                default: {
                    final DeviceInfo a = this.a;
                    a.nativeUpdateHeadphoneStateChange(a.a, 0);
                    return;
                }
                case 1: {
                    final DeviceInfo a2 = this.a;
                    a2.nativeUpdateHeadphoneStateChange(a2.a, 1);
                    return;
                }
                case 0: {
                    final DeviceInfo a3 = this.a;
                    a3.nativeUpdateHeadphoneStateChange(a3.a, 2);
                    break;
                }
            }
        }
    }
}
