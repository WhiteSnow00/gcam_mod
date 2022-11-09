import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import android.os.Handler;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioRouting;

// 
// Decompiled by Procyon v0.6.0
// 

final class kpl implements AutoCloseable, AudioRouting
{
    public final max a;
    
    public kpl(final max a) {
        this.a = a;
    }
    
    public final int a() {
        return ((may)this.a).a.getRecordingState();
    }
    
    public final void addOnRoutingChangedListener(final AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener, final Handler handler) {
        this.a.addOnRoutingChangedListener(audioRouting$OnRoutingChangedListener, handler);
    }
    
    public final kpk b(final ByteBuffer byteBuffer, final int n) {
        final maw b = this.a.b(byteBuffer, n);
        if (b == null) {
            return null;
        }
        return new kpk(b);
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
    
    public final AudioDeviceInfo getPreferredDevice() {
        return this.a.getPreferredDevice();
    }
    
    public final AudioDeviceInfo getRoutedDevice() {
        return this.a.getRoutedDevice();
    }
    
    public final void removeOnRoutingChangedListener(final AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener) {
        this.a.removeOnRoutingChangedListener(audioRouting$OnRoutingChangedListener);
    }
    
    public final boolean setPreferredDevice(final AudioDeviceInfo preferredDevice) {
        return this.a.setPreferredDevice(preferredDevice);
    }
}
