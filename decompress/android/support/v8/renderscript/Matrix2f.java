// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class Matrix2f
{
    final float[] mMat;
    
    public Matrix2f() {
        this.mMat = new float[4];
        this.loadIdentity();
    }
    
    public Matrix2f(final float[] array) {
        final float[] mMat = new float[4];
        System.arraycopy(array, 0, this.mMat = mMat, 0, mMat.length);
    }
    
    public float get(final int n, final int n2) {
        return this.mMat[n + n + n2];
    }
    
    public float[] getArray() {
        return this.mMat;
    }
    
    public void load(final Matrix2f matrix2f) {
        final float[] array = matrix2f.getArray();
        final float[] mMat = this.mMat;
        System.arraycopy(array, 0, mMat, 0, mMat.length);
    }
    
    public void loadIdentity() {
        final float[] mMat = this.mMat;
        mMat[0] = 1.0f;
        mMat[2] = (mMat[1] = 0.0f);
        mMat[3] = 1.0f;
    }
    
    public void loadMultiply(final Matrix2f matrix2f, final Matrix2f matrix2f2) {
        for (int i = 0; i < 2; ++i) {
            float n = 0.0f;
            float n2 = 0.0f;
            for (int j = 0; j < 2; ++j) {
                final float value = matrix2f2.get(i, j);
                n += matrix2f.get(j, 0) * value;
                n2 += matrix2f.get(j, 1) * value;
            }
            this.set(i, 0, n);
            this.set(i, 1, n2);
        }
    }
    
    public void loadRotate(float n) {
        final double n2 = n * 0.017453292f;
        n = (float)Math.cos(n2);
        final float n3 = (float)Math.sin(n2);
        final float[] mMat = this.mMat;
        mMat[0] = n;
        mMat[1] = -n3;
        mMat[2] = n3;
        mMat[3] = n;
    }
    
    public void loadScale(final float n, final float n2) {
        this.loadIdentity();
        final float[] mMat = this.mMat;
        mMat[0] = n;
        mMat[3] = n2;
    }
    
    public void multiply(final Matrix2f matrix2f) {
        final Matrix2f matrix2f2 = new Matrix2f();
        matrix2f2.loadMultiply(this, matrix2f);
        this.load(matrix2f2);
    }
    
    public void rotate(final float n) {
        final Matrix2f matrix2f = new Matrix2f();
        matrix2f.loadRotate(n);
        this.multiply(matrix2f);
    }
    
    public void scale(final float n, final float n2) {
        final Matrix2f matrix2f = new Matrix2f();
        matrix2f.loadScale(n, n2);
        this.multiply(matrix2f);
    }
    
    public void set(final int n, final int n2, final float n3) {
        this.mMat[n + n + n2] = n3;
    }
    
    public void transpose() {
        final float[] mMat = this.mMat;
        final float n = mMat[1];
        mMat[1] = mMat[2];
        mMat[2] = n;
    }
}
