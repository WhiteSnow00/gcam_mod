import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hff
{
    public static void a(final UUID uuid, final boolean b, final String s, final boolean b2, final apf apf) {
        try {
            aph.a.c("http://ns.google.com/photos/1.0/creations/", "GCreations");
            aph.a.c("http://ns.google.com/photos/1.0/camera/", "GCamera");
            apf.c("http://ns.google.com/photos/1.0/creations/", "CameraBurstID", uuid.toString());
            apf.c("http://ns.google.com/photos/1.0/camera/", "BurstID", uuid.toString());
            if (b) {
                apf.c("http://ns.google.com/photos/1.0/camera/", "BurstPrimary", "1");
            }
            if (b2) {
                final String[] b3 = lmr.b;
                for (int i = 0; i < 2; ++i) {
                    apf.g("DisableAutoCreation", new aqj(512), b3[i], new aqj());
                }
            }
            if (!drk.a.c().equals(s)) {
                lmx.k(apf, s);
            }
        }
        catch (final ape ape) {
            throw new RuntimeException(ape);
        }
    }
    
    public static float b(final float n) {
        return 1.0f / ((float)Math.exp(-n) + 1.0f);
    }
}
