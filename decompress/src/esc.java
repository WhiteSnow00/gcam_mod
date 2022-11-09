import java.util.Vector;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import android.graphics.Bitmap;
import android.opengl.GLUtils;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import android.content.Context;
import java.nio.Buffer;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.ArrayList;
import android.graphics.Point;

// 
// Decompiled by Procyon v0.6.0
// 

public class esc extends erx
{
    public static final nsd f;
    public final Point g;
    public float h;
    public float i;
    public final float[] j;
    public int k;
    public boolean l;
    private final float[] m;
    private int n;
    private final ArrayList o;
    
    static {
        f = nsd.g("com/google/android/apps/camera/legacy/lightcycle/opengl/Sprite");
    }
    
    public esc() {
        this.g = new Point();
        this.j = new float[16];
        this.m = new float[16];
        this.l = false;
        this.o = new ArrayList();
    }
    
    @Override
    public final void c(final float[] array) {
    }
    
    public final void e() {
        final ArrayList o = this.o;
        for (int size = o.size(), i = 0; i < size; ++i) {
            final ery ery = (ery)o.get(i);
            if (ery != null) {
                ery.c();
            }
        }
        this.o.clear();
    }
    
    public final void f(final float[] array, final float n, final float n2, final float n3) {
        if (!this.l) {
            a.l(esc.f.b(), "Sprite not initialized.", '\u0571');
            return;
        }
        final esa e = this.e;
        if (e == null) {
            return;
        }
        e.c();
        this.a.position(0);
        this.b.position(0);
        this.e.g(this.a);
        this.e.e(this.b);
        Matrix.translateM(this.j, 0, array, 0, n, n2, 0.0f);
        Matrix.rotateM(this.j, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        if (n3 != 1.0f) {
            Matrix.scaleM(this.j, 0, n3, n3, n3);
        }
        this.e.f(this.j);
        if (this.d.size() == 0) {
            return;
        }
        this.d.get(0).d();
        this.c.position(0);
        GLES20.glDrawElements(4, this.k, 5123, (Buffer)this.c);
    }
    
    public final void g(Context decodeResource, int i, final float n) {
        final ery ery = new ery();
        final Vector d = this.d;
        final int n2 = 0;
        d.add(0, ery);
        this.o.add(ery);
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inScaled = false;
        decodeResource = (Context)BitmapFactory.decodeResource(decodeResource.getResources(), i, bitmapFactory$Options);
        if (decodeResource == null) {
            return;
        }
        this.g.set(((Bitmap)decodeResource).getWidth(), ((Bitmap)decodeResource).getHeight());
        try {
            final ery ery2 = this.d.get(0);
            final int[] array = { 0 };
            GLES20.glGenTextures(1, array, 0);
            i = array[0];
            GLES20.glBindTexture(3553, ery2.a = i);
            GLES20.glTexParameterf(3553, 10241, 9728.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, (Bitmap)decodeResource, 0);
            erz.a("Texture : loadBitmap");
            ((Bitmap)decodeResource).recycle();
        }
        catch (final erz erz) {
            erz.printStackTrace();
        }
        ((Bitmap)decodeResource).recycle();
        this.k = 6;
        this.n = 4;
        this.a = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        i = this.n;
        this.b = ByteBuffer.allocateDirect((i + i) * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        i = this.k;
        this.c = ByteBuffer.allocateDirect(i + i).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.h = this.g.x / 2.0f;
        this.i = this.g.y / 2.0f;
        for (i = 0; i < 8; ++i) {
            this.b.put(i, (new float[] { 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f })[i]);
        }
        for (i = 0; i < 6; ++i) {
            this.c.put(i, (new short[] { 0, 1, 2, 0, 2, 3 })[i]);
        }
        Matrix.setIdentityM(this.m, 0);
        final float h = this.h;
        final float j = this.i;
        final float n3 = -h;
        final float n4 = -j;
        for (i = n2; i < 12; ++i) {
            this.a.put(i, (new float[] { n3, j, n, h, j, n, h, n4, n, n3, n4, n })[i]);
        }
        this.l = true;
    }
}
