import java.nio.Buffer;
import android.opengl.GLES20;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esw extends erx
{
    public esb f;
    private int g;
    
    public esw() {
        this.g = 0;
        try {
            (this.f = new esb()).j(err.d);
            super.a = ByteBuffer.allocateDirect(58800).order(ByteOrder.nativeOrder()).asFloatBuffer();
            super.c = ByteBuffer.allocateDirect(9800).order(ByteOrder.nativeOrder()).asShortBuffer();
            super.b = ByteBuffer.allocateDirect(39200).order(ByteOrder.nativeOrder()).asFloatBuffer();
            int i = 0;
            int g = 0;
            float n = -5.1000004f;
            int n2 = 0;
            while (i < 35) {
                int j = 0;
                float n3 = -5.1000004f;
                while (j < 35) {
                    final short n4 = (short)(n2 + 1);
                    this.d(n2, n - 0.030000001f, n3);
                    final short n5 = (short)(n4 + 1);
                    this.d(n4, n + 0.030000001f, n3);
                    final short n6 = (short)(n5 + 1);
                    this.d(n5, n, -0.030000001f + n3);
                    final short n7 = (short)(n6 + 1);
                    this.d(n6, n, 0.030000001f + n3);
                    short n8;
                    for (int k = 0; k < 4; ++k, g = n8) {
                        n8 = (short)(g + 1);
                        super.c.put(g, (short)(n2 + k));
                    }
                    n3 += 0.3f;
                    ++j;
                    n2 = n7;
                }
                n += 0.3f;
                ++i;
            }
            this.g = g;
        }
        catch (final erz erz) {
            erz.printStackTrace();
        }
    }
    
    @Override
    public final void c(final float[] array) {
        this.f.c();
        this.f.j(err.d);
        this.f.g(this.a);
        this.f.e(this.b);
        this.f.f(array);
        this.c.position(0);
        GLES20.glDrawElements(1, this.g, 5123, (Buffer)this.c);
    }
}
