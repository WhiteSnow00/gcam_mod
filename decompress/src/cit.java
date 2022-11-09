import android.media.AudioDeviceInfo;
import android.media.AudioDeviceCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class cit extends AudioDeviceCallback
{
    final /* synthetic */ ciu a;
    
    public cit(final ciu a) {
        this.a = a;
    }
    
    public final void onAudioDevicesAdded(final AudioDeviceInfo[] array) {
        this.a.b();
    }
    
    public final void onAudioDevicesRemoved(final AudioDeviceInfo[] array) {
        this.a.b();
    }
}
