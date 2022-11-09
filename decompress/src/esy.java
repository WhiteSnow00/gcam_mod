import java.nio.Buffer;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.nio.ShortBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esy extends erx
{
    public int f;
    public int g;
    public boolean h;
    public ShortBuffer i;
    public esa j;
    public final ArrayList k;
    public boolean l;
    public boolean m;
    
    public esy() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.j = null;
        this.k = new ArrayList();
        this.l = true;
        this.m = true;
    }
    
    public final void b() {
        final ArrayList k = this.k;
        for (int size = k.size(), i = 0; i < size; ++i) {
            final ery ery = (ery)k.get(i);
            if (ery != null) {
                ery.c();
            }
        }
        this.k.clear();
    }
    
    @Override
    public final void c(final float[] array) {
        if (!this.h) {
            return;
        }
        if (this.m) {
            this.e.c();
            this.e.g(this.a);
            this.e.e(this.b);
            this.e.f(array);
            if (this.d.size() > 0) {
                this.d.get(0).d();
            }
            this.c.position(0);
            GLES20.glDrawElements(4, this.f, 5123, (Buffer)this.c);
        }
        if (this.l) {
            final esa j = this.j;
            if (j != null) {
                j.c();
                this.j.g(this.a);
                this.j.f(array);
                this.i.position(0);
                GLES20.glLineWidth(9.0f);
                GLES20.glDrawElements(2, this.g, 5123, (Buffer)this.i);
                GLES20.glDrawElements(0, this.g, 5123, (Buffer)this.i);
            }
        }
    }
    
    public final void e(final int a) {
        if (this.d.size() == 0) {
            return;
        }
        this.d.get(0).a = a;
    }
}
