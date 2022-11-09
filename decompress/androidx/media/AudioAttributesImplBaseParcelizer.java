// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

public class AudioAttributesImplBaseParcelizer
{
    public static AudioAttributesImplBase read(final agb agb) {
        final AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = agb.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = agb.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = agb.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = agb.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }
    
    public static void write(final AudioAttributesImplBase audioAttributesImplBase, final agb agb) {
        agb.h(audioAttributesImplBase.a, 1);
        agb.h(audioAttributesImplBase.b, 2);
        agb.h(audioAttributesImplBase.c, 3);
        agb.h(audioAttributesImplBase.d, 4);
    }
}
