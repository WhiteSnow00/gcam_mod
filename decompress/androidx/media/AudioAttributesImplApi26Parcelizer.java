// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import android.os.Parcelable;
import android.media.AudioAttributes;

public class AudioAttributesImplApi26Parcelizer
{
    public static AudioAttributesImplApi26 read(final agb agb) {
        final AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes)agb.b((Parcelable)audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = agb.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }
    
    public static void write(final AudioAttributesImplApi26 audioAttributesImplApi26, final agb agb) {
        agb.i((Parcelable)audioAttributesImplApi26.a, 1);
        agb.h(audioAttributesImplApi26.b, 2);
    }
}
