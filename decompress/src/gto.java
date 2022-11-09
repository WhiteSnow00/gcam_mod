import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gto
{
    private static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/payloadprocessor/HdrPlusPayloadUtils");
    }
    
    public static ljm a(final grx grx, final boolean b) {
        final ljm c = grx.a.c();
        if (c == null) {
            a.l(gto.a.c(), "Couldn't acquire metadata from the frame.", '\u081d');
            return null;
        }
        ljm b3;
        if (grx.h()) {
            String s;
            if (b) {
                s = grx.a().c().a;
            }
            else {
                final kwz b2 = grx.b();
                if (b2 == null) {
                    return null;
                }
                s = b2.c().a;
            }
            b3 = b(c, s);
        }
        else {
            b3 = c;
        }
        return b3;
    }
    
    public static ljm b(final ljm ljm, final String s) {
        final Map h = ljm.h();
        ljm ljm2 = ljm;
        if (!h.isEmpty()) {
            final lji lji = h.get(s);
            if (lji != null) {
                ljm2 = new ljl(lji);
            }
            else {
                a.k(gto.a.c(), "Physical metadata is null for images from camera %s", s, '\u081e');
                ljm2 = ljm;
            }
        }
        return ljm2;
    }
}
