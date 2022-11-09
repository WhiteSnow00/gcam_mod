import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gri extends kxc
{
    private final lfh a;
    private final lfg b;
    private final grh c;
    private final liy d;
    private String e;
    
    public gri(final lfh a, final lfg b, final grh c, final liy d) {
        this.e = "";
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void b(final ljm ljm) {
        synchronized (this) {
            if (jlj.b == null) {
                return;
            }
            final float[] array = (float[])ljm.d(jlj.b);
            if (array != null) {
                final int length = array.length;
                if (length >= 13) {
                    final float n = array[11];
                    final float n2 = array[12];
                    float n3;
                    if (length > 16) {
                        n3 = array[16];
                    }
                    else if (length > 15) {
                        n3 = array[15];
                    }
                    else {
                        n3 = 0.0f;
                    }
                    final boolean f = this.d.f;
                    final lfj lfj = null;
                    lfj d = null;
                    Label_0152: {
                        if (f) {
                            final String e = (String)ljm.d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                            if (e != null && !this.e.equals(e)) {
                                this.e = e;
                                d = this.a.d(e);
                                break Label_0152;
                            }
                        }
                        d = lfj;
                    }
                    if (d == null) {
                        this.c.i(this.b, n, n2, n3);
                        return;
                    }
                    this.c.i(this.a.a(d), n, n2, n3);
                }
            }
        }
    }
}
