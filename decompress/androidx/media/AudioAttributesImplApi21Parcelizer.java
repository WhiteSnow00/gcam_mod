// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import android.os.Parcelable;
import android.media.AudioAttributes;

public class AudioAttributesImplApi21Parcelizer
{
    public static AudioAttributesImplApi21 read(final agb agb) {
        final AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes)agb.b((Parcelable)audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = agb.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }
    
    public static void write(final AudioAttributesImplApi21 audioAttributesImplApi21, final agb agb) {
        agb.i((Parcelable)audioAttributesImplApi21.a, 1);
        agb.h(audioAttributesImplApi21.b, 2);
    }
}
