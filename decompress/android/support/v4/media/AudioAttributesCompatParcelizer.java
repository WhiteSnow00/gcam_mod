// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import androidx.media.AudioAttributesCompat;

public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer
{
    public static AudioAttributesCompat read(final agb agb) {
        return androidx.media.AudioAttributesCompatParcelizer.read(agb);
    }
    
    public static void write(final AudioAttributesCompat audioAttributesCompat, final agb agb) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, agb);
    }
}
