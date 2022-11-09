import android.media.MediaCodecInfo;
import android.util.Log;
import java.util.HashMap;
import android.media.MediaCodecList;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmw
{
    public final Map a;
    
    public kmw() {
        final MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        this.a = new HashMap();
        for (final MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo.isEncoder()) {
                final String name = mediaCodecInfo.getName();
                final String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                final int length2 = supportedTypes.length;
                if (length2 <= 0) {
                    Log.w("CdrCodecMgr", String.valueOf(name).concat(" contains empty supported type"));
                }
                else {
                    for (final String s : supportedTypes) {
                        if (!this.a.containsKey(s)) {
                            this.a.put(s, mediaCodecInfo);
                        }
                    }
                }
            }
        }
    }
    
    public final boolean a() {
        final MediaCodecInfo mediaCodecInfo = this.a.get("video/hevc");
        return mediaCodecInfo != null && mediaCodecInfo.isHardwareAccelerated();
    }
}
