// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class Matrix3f
{
    final float[] mMat;
    
    public Matrix3f() {
        this.mMat = new float[9];
        this.loadIdentity();
    }
    
    public Matrix3f(final float[] array) {
        final float[] mMat = new float[9];
        System.arraycopy(array, 0, this.mMat = mMat, 0, mMat.length);
    }
    
    public float get(final int n, final int n2) {
        return this.mMat[n * 3 + n2];
    }
    
    public float[] getArray() {
        return this.mMat;
    }
    
    public void load(final Matrix3f matrix3f) {
        final float[] array = matrix3f.getArray();
        final float[] mMat = this.mMat;
        System.arraycopy(array, 0, mMat, 0, mMat.length);
    }
    
    public void loadIdentity() {
        final float[] mMat = this.mMat;
        mMat[0] = 1.0f;
        mMat[1] = 0.0f;
        mMat[3] = (mMat[2] = 0.0f);
        mMat[4] = 1.0f;
        mMat[5] = 0.0f;
        mMat[7] = (mMat[6] = 0.0f);
        mMat[8] = 1.0f;
    }
    
    public void loadMultiply(final Matrix3f matrix3f, final Matrix3f matrix3f2) {
        for (int i = 0; i < 3; ++i) {
            float n = 0.0f;
            float n2 = 0.0f;
            float n3 = 0.0f;
            for (int j = 0; j < 3; ++j) {
                final float value = matrix3f2.get(i, j);
                n += matrix3f.get(j, 0) * value;
                n2 += matrix3f.get(j, 1) * value;
                n3 += matrix3f.get(j, 2) * value;
            }
            this.set(i, 0, n);
            this.set(i, 1, n2);
            this.set(i, 2, n3);
        }
    }
    
    public void loadRotate(float n) {
        this.loadIdentity();
        final double n2 = n * 0.017453292f;
        n = (float)Math.cos(n2);
        final float n3 = (float)Math.sin(n2);
        final float[] mMat = this.mMat;
        mMat[0] = n;
        mMat[1] = -n3;
        mMat[3] = n3;
        mMat[4] = n;
    }
    
    public void loadRotate(float n, float n2, float n3, float n4) {
        final double n5 = n * 0.017453292f;
        n = (float)Math.cos(n5);
        final float n6 = (float)Math.sin(n5);
        final float n7 = (float)Math.sqrt(n2 * n2 + n3 * n3 + n4 * n4);
        if (n7 == 1.0f) {
            final float n8 = 1.0f / n7;
            n2 *= n8;
            n3 *= n8;
            n4 *= n8;
        }
        final float n9 = 1.0f - n;
        final float n10 = n2 * n6;
        final float n11 = n3 * n6;
        final float n12 = n6 * n4;
        final float[] mMat = this.mMat;
        mMat[0] = n2 * n2 * n9 + n;
        final float n13 = n2 * n3 * n9;
        mMat[3] = n13 - n12;
        n2 = n2 * n4 * n9;
        mMat[6] = n2 + n11;
        mMat[1] = n13 + n12;
        mMat[4] = n3 * n3 * n9 + n;
        n3 = n3 * n4 * n9;
        mMat[7] = n3 - n10;
        mMat[2] = n2 - n11;
        mMat[5] = n3 + n10;
        mMat[8] = n4 * n4 * n9 + n;
    }
    
    public void loadScale(final float n, final float n2) {
        this.loadIdentity();
        final float[] mMat = this.mMat;
        mMat[0] = n;
        mMat[4] = n2;
    }
    
    public void loadScale(final float n, final float n2, final float n3) {
        this.loadIdentity();
        final float[] mMat = this.mMat;
        mMat[0] = n;
        mMat[4] = n2;
        mMat[8] = n3;
    }
    
    public void loadTranslate(final float n, final float n2) {
        this.loadIdentity();
        final float[] mMat = this.mMat;
        mMat[6] = n;
        mMat[7] = n2;
    }
    
    public void multiply(final Matrix3f matrix3f) {
        final Matrix3f matrix3f2 = new Matrix3f();
        matrix3f2.loadMultiply(this, matrix3f);
        this.load(matrix3f2);
    }
    
    public void rotate(final float n) {
        final Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadRotate(n);
        this.multiply(matrix3f);
    }
    
    public void rotate(final float n, final float n2, final float n3, final float n4) {
        final Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadRotate(n, n2, n3, n4);
        this.multiply(matrix3f);
    }
    
    public void scale(final float n, final float n2) {
        final Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadScale(n, n2);
        this.multiply(matrix3f);
    }
    
    public void scale(final float n, final float n2, final float n3) {
        final Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadScale(n, n2, n3);
        this.multiply(matrix3f);
    }
    
    public void set(final int n, final int n2, final float n3) {
        this.mMat[n * 3 + n2] = n3;
    }
    
    public void translate(final float n, final float n2) {
        final Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadTranslate(n, n2);
        this.multiply(matrix3f);
    }
    
    public void transpose() {
        int n;
        for (int i = 0; i < 2; i = n) {
            int j;
            for (n = (j = i + 1); j < 3; ++j) {
                final float[] mMat = this.mMat;
                final int n2 = i * 3 + j;
                final float n3 = mMat[n2];
                final int n4 = j * 3 + i;
                mMat[n2] = mMat[n4];
                mMat[n4] = n3;
            }
        }
    }
}
