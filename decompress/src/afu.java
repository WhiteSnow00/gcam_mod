import java.util.ArrayList;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

final class afu extends acv
{
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;
    
    public afu() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }
    
    public afu(afu afu, final yu yu) {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        final Matrix j = new Matrix();
        this.j = j;
        this.m = null;
        this.c = afu.c;
        this.d = afu.d;
        this.e = afu.e;
        this.f = afu.f;
        this.g = afu.g;
        this.h = afu.h;
        this.i = afu.i;
        final int[] l = afu.l;
        this.l = null;
        final String m = afu.m;
        this.m = m;
        final int k = afu.k;
        int i = 0;
        this.k = 0;
        if (m != null) {
            yu.put(m, this);
        }
        j.set(afu.j);
        for (ArrayList b = afu.b; i < b.size(); ++i) {
            final Object value = b.get(i);
            if (value instanceof afu) {
                afu = (afu)value;
                this.b.add(new afu(afu, yu));
            }
            else {
                afv afv;
                if (value instanceof aft) {
                    afv = new aft((aft)value);
                }
                else {
                    if (!(value instanceof afs)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    afv = new afs((afs)value);
                }
                this.b.add(afv);
                final String n = afv.n;
                if (n != null) {
                    yu.put(n, afv);
                }
            }
        }
    }
    
    @Override
    public final boolean b() {
        for (int i = 0; i < this.b.size(); ++i) {
            if (((acv)this.b.get(i)).b()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean c(final int[] array) {
        int i = 0;
        boolean b = false;
        while (i < this.b.size()) {
            b |= this.b.get(i).c(array);
            ++i;
        }
        return b;
    }
    
    public String getGroupName() {
        return this.m;
    }
    
    public Matrix getLocalMatrix() {
        return this.j;
    }
    
    public float getPivotX() {
        return this.d;
    }
    
    public float getPivotY() {
        return this.e;
    }
    
    public float getRotation() {
        return this.c;
    }
    
    public float getScaleX() {
        return this.f;
    }
    
    public float getScaleY() {
        return this.g;
    }
    
    public float getTranslateX() {
        return this.h;
    }
    
    public float getTranslateY() {
        return this.i;
    }
    
    public final void o() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }
    
    public void setPivotX(final float d) {
        if (d != this.d) {
            this.d = d;
            this.o();
        }
    }
    
    public void setPivotY(final float e) {
        if (e != this.e) {
            this.e = e;
            this.o();
        }
    }
    
    public void setRotation(final float c) {
        if (c != this.c) {
            this.c = c;
            this.o();
        }
    }
    
    public void setScaleX(final float f) {
        if (f != this.f) {
            this.f = f;
            this.o();
        }
    }
    
    public void setScaleY(final float g) {
        if (g != this.g) {
            this.g = g;
            this.o();
        }
    }
    
    public void setTranslateX(final float h) {
        if (h != this.h) {
            this.h = h;
            this.o();
        }
    }
    
    public void setTranslateY(final float i) {
        if (i != this.i) {
            this.i = i;
            this.o();
        }
    }
}
