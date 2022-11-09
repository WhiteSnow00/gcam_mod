import android.opengl.GLES30;
import java.math.RoundingMode;

// 
// Decompiled by Procyon v0.6.0
// 

public class maj extends maf implements mae
{
    public final map a;
    public final int c;
    public final int d;
    public final lzp e;
    public boolean f;
    public final lxx g;
    
    public maj(final map a, int n, int a2, final lxx g) {
        super(n);
        this.f = false;
        njo.d(true);
        this.a = a;
        this.g = g;
        this.c = a2;
        this.e = lzp.a();
        if (lzp.b()) {
            final lvk a3 = g.a;
            int a4 = a3.a.a(0);
            n = 1;
            while (true) {
                final oci a5 = a3.a;
                if (n >= a5.a) {
                    break;
                }
                if (a5.a(n) > (a2 = a4)) {
                    a2 = a3.a.a(n);
                }
                ++n;
                a4 = a2;
            }
            this.d = och.o(a4, RoundingMode.DOWN) + 1;
            return;
        }
        this.d = 1;
    }
    
    public static int b() {
        final int[] array = { 0 };
        GLES30.glGenTextures(1, array, 0);
        return array[0];
    }
    
    @Override
    protected void c() {
        GLES30.glDeleteTextures(1, new int[] { this.b }, 0);
    }
    
    public final void d() {
        GLES30.glBindTexture(this.c, super.b);
    }
}
