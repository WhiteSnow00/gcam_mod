import android.media.AudioDeviceInfo;
import android.media.AudioManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ciw
{
    private final AudioManager a;
    
    public ciw(final AudioManager a) {
        this.a = a;
    }
    
    public static void c(final AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo != null) {
            final String value = String.valueOf(audioDeviceInfo.getProductName());
            audioDeviceInfo.getType();
            audioDeviceInfo.getId();
            String.valueOf(value).length();
        }
    }
    
    public final AudioDeviceInfo a() {
        for (final AudioDeviceInfo audioDeviceInfo : this.a.getDevices(1)) {
            if (audioDeviceInfo.getType() == 7) {
                c(audioDeviceInfo);
                return audioDeviceInfo;
            }
        }
        return null;
    }
    
    public final AudioDeviceInfo b() {
        final AudioDeviceInfo[] devices = this.a.getDevices(1);
        final int length = devices.length;
        AudioDeviceInfo audioDeviceInfo = null;
        AudioDeviceInfo audioDeviceInfo2 = null;
        AudioDeviceInfo audioDeviceInfo4 = null;
        AudioDeviceInfo audioDeviceInfo5;
        for (int i = 0; i < length; ++i, audioDeviceInfo = audioDeviceInfo4, audioDeviceInfo2 = audioDeviceInfo5) {
            final AudioDeviceInfo audioDeviceInfo3 = devices[i];
            c(audioDeviceInfo3);
            Label_0076: {
                if (audioDeviceInfo3.getType() != 11) {
                    audioDeviceInfo4 = audioDeviceInfo;
                    if (audioDeviceInfo3.getType() != 22) {
                        break Label_0076;
                    }
                }
                c(audioDeviceInfo3);
                if ((audioDeviceInfo4 = audioDeviceInfo) == null) {
                    audioDeviceInfo4 = audioDeviceInfo3;
                }
            }
            audioDeviceInfo5 = audioDeviceInfo2;
            if (audioDeviceInfo3.getType() == 3) {
                c(audioDeviceInfo3);
                if ((audioDeviceInfo5 = audioDeviceInfo2) == null) {
                    audioDeviceInfo5 = audioDeviceInfo3;
                }
            }
        }
        if (audioDeviceInfo != null) {
            return audioDeviceInfo;
        }
        return audioDeviceInfo2;
    }
}
