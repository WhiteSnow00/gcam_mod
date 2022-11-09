import android.hardware.camera2.CaptureRequest$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzh
{
    public static void a(final CaptureRequest$Key captureRequest$Key, final Object o, final nog nog) {
        if (captureRequest$Key != null) {
            nog.g(kxc.p(captureRequest$Key, o));
        }
    }
    
    public static void b(final cxl cxl, final kyh kyh) {
        if (jli.g != null) {
            final niz a = cxl.a(cxs.a);
            if (a.g()) {
                final int n = cyw.a()[(int)a.c()];
                if (n == 0) {
                    throw null;
                }
                switch (n - 1) {
                    case 1:
                    case 2:
                    case 3: {
                        kyh.d(jli.g, 2);
                    }
                }
            }
        }
    }
    
    public static boolean c() {
        return jli.g != null && jli.h != null && jli.i != null && jli.j != null;
    }
}
