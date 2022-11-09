import android.media.AudioRecord;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqd
{
    public static final int a;
    
    static {
        a = AudioRecord.getMinBufferSize(48000, 12, 2);
    }
}
