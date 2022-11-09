// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

public class AudioAttributesCompatParcelizer
{
    public static AudioAttributesCompat read(final agb agb) {
        final AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl)agb.t(audioAttributesCompat.a);
        return audioAttributesCompat;
    }
    
    public static void write(final AudioAttributesCompat audioAttributesCompat, final agb agb) {
        agb.u(audioAttributesCompat.a);
    }
}
