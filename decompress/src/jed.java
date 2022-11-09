import android.content.Intent;
import android.content.Context;
import com.google.android.apps.camera.videoplayer.VideoPlayerActivity;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jed extends BroadcastReceiver
{
    final /* synthetic */ VideoPlayerActivity a;
    
    public jed(final VideoPlayerActivity a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        this.a.finish();
    }
}
