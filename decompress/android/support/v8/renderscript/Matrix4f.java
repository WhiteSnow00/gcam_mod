// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class Matrix4f
{
    final float[] mMat;
    
    public Matrix4f() {
        this.mMat = new float[16];
        this.loadIdentity();
    }
    
    public Matrix4f(final float[] array) {
        final float[] mMat = new float[16];
        System.arraycopy(array, 0, this.mMat = mMat, 0, mMat.length);
    }
    
    private float computeCofactor(final int n, final int n2) {
        final int n3 = (n + 1) % 4;
        final int n4 = (n + 2) % 4;
        final int n5 = (n + 3) % 4;
        final float[] mMat = this.mMat;
        final int n6 = (n2 + 1) % 4 * 4;
        final float n7 = mMat[n3 + n6];
        final int n8 = (n2 + 2) % 4 * 4;
        final float n9 = mMat[n4 + n8];
        final int n10 = (n2 + 3) % 4 * 4;
        final float n11 = mMat[n5 + n10];
        final float n12 = mMat[n4 + n10];
        final float n13 = mMat[n5 + n8];
        final float n14 = mMat[n8 + n3];
        final float n15 = mMat[n4 + n6];
        final float n16 = mMat[n5 + n6];
        final float n17 = n7 * (n9 * n11 - n12 * n13) - n14 * (n11 * n15 - n12 * n16) + mMat[n3 + n10] * (n15 * n13 - n9 * n16);
        if ((n + n2 & 0x1) != 0x0) {
            return -n17;
        }
        return n17;
    }
    
    public float get(final int n, final int n2) {
        return this.mMat[n * 4 + n2];
    }
    
    public float[] getArray() {
        return this.mMat;
    }
    
    public boolean inverse() {
        final Matrix4f matrix4f = new Matrix4f();
        final int n = 0;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                matrix4f.mMat[i * 4 + j] = this.computeCofactor(i, j);
            }
        }
        final float[] mMat = this.mMat;
        final float n2 = mMat[0];
        final float[] mMat2 = matrix4f.mMat;
        final float n3 = n2 * mMat2[0] + mMat[4] * mMat2[1] + mMat[8] * mMat2[2] + mMat[12] * mMat2[3];
        if (Math.abs(n3) < 1.0E-6) {
            return false;
        }
        final float n4 = 1.0f / n3;
        for (int k = n; k < 16; ++k) {
            this.mMat[k] = matrix4f.mMat[k] * n4;
        }
        return true;
    }
    
    public boolean inverseTranspose() {
        final Matrix4f matrix4f = new Matrix4f();
        final int n = 0;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                matrix4f.mMat[j * 4 + i] = this.computeCofactor(i, j);
            }
        }
        final float[] mMat = this.mMat;
        final float n2 = mMat[0];
        final float[] mMat2 = matrix4f.mMat;
        final float n3 = n2 * mMat2[0] + mMat[4] * mMat2[4] + mMat[8] * mMat2[8] + mMat[12] * mMat2[12];
        if (Math.abs(n3) < 1.0E-6) {
            return false;
        }
        final float n4 = 1.0f / n3;
        for (int k = n; k < 16; ++k) {
            this.mMat[k] = matrix4f.mMat[k] * n4;
        }
        return true;
    }
    
    public void load(final Matrix3f matrix3f) {
        final float[] mMat = this.mMat;
        final float[] mMat2 = matrix3f.mMat;
        mMat[0] = mMat2[0];
        mMat[1] = mMat2[1];
        mMat[2] = mMat2[2];
        mMat[3] = 0.0f;
        mMat[4] = mMat2[3];
        mMat[5] = mMat2[4];
        mMat[6] = mMat2[5];
        mMat[7] = 0.0f;
        mMat[8] = mMat2[6];
        mMat[9] = mMat2[7];
        mMat[10] = mMat2[8];
        mMat[12] = (mMat[11] = 0.0f);
        mMat[14] = (mMat[13] = 0.0f);
        mMat[15] = 1.0f;
    }
    
    public void load(final Matrix4f matrix4f) {
        final float[] array = matrix4f.getArray();
        final float[] mMat = this.mMat;
        System.arraycopy(array, 0, mMat, 0, mMat.length);
    }
    
    public void loadFrustum(float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.loadIdentity();
        final float[] mMat = this.mMat;
        final float n7 = n5 + n5;
        final float n8 = n2 - n;
        mMat[0] = n7 / n8;
        final float n9 = n4 - n3;
        mMat[5] = n7 / n9;
        mMat[8] = (n2 + n) / n8;
        mMat[9] = (n4 + n3) / n9;
        n = n6 - n5;
        mMat[10] = -(n6 + n5) / n;
        mMat[11] = -1.0f;
        mMat[14] = n6 * -2.0f * n5 / n;
        mMat[15] = 0.0f;
    }
    
    public void loadIdentity() {
        final float[] mMat = this.mMat;
        mMat[0] = 1.0f;
        mMat[2] = (mMat[1] = 0.0f);
        mMat[4] = (mMat[3] = 0.0f);
        mMat[5] = 1.0f;
        mMat[7] = (mMat[6] = 0.0f);
        mMat[9] = (mMat[8] = 0.0f);
        mMat[10] = 1.0f;
        mMat[12] = (mMat[11] = 0.0f);
        mMat[14] = (mMat[13] = 0.0f);
        mMat[15] = 1.0f;
    }
    
    public void loadMultiply(final Matrix4f matrix4f, final Matrix4f matrix4f2) {
        for (int i = 0; i < 4; ++i) {
            float n = 0.0f;
            float n2 = 0.0f;
            float n3 = 0.0f;
            float n4 = 0.0f;
            for (int j = 0; j < 4; ++j) {
                final float value = matrix4f2.get(i, j);
                n += matrix4f.get(j, 0) * value;
                n2 += matrix4f.get(j, 1) * value;
                n3 += matrix4f.get(j, 2) * value;
                n4 += matrix4f.get(j, 3) * value;
            }
            this.set(i, 0, n);
            this.set(i, 1, n2);
            this.set(i, 2, n3);
            this.set(i, 3, n4);
        }
    }
    
    public void loadOrtho(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.loadIdentity();
        final float[] mMat = this.mMat;
        final float n7 = n2 - n;
        mMat[0] = 2.0f / n7;
        final float n8 = n4 - n3;
        mMat[5] = 2.0f / n8;
        final float n9 = n6 - n5;
        mMat[10] = -2.0f / n9;
        mMat[12] = -(n2 + n) / n7;
        mMat[13] = -(n4 + n3) / n8;
        mMat[14] = -(n6 + n5) / n9;
    }
    
    public void loadOrthoWindow(final int n, final int n2) {
        this.loadOrtho(0.0f, (float)n, (float)n2, 0.0f, -1.0f, 1.0f);
    }
    
    public void loadPerspective(float n, final float n2, final float n3, final float n4) {
        final double n5 = n;
        Double.isNaN(n5);
        final float n6 = n3 * (float)Math.tan((float)(n5 * 3.141592653589793 / 360.0));
        n = -n6;
        this.loadFrustum(n * n2, n6 * n2, n, n6, n3, n4);
    }
    
    public void loadProjectionNormalized(final int n, final int n2) {
        final Matrix4f matrix4f = new Matrix4f();
        final Matrix4f matrix4f2 = new Matrix4f();
        if (n > n2) {
            final float n3 = n / (float)n2;
            matrix4f.loadFrustum(-n3, n3, -1.0f, 1.0f, 1.0f, 100.0f);
        }
        else {
            final float n4 = n2 / (float)n;
            matrix4f.loadFrustum(-1.0f, 1.0f, -n4, n4, 1.0f, 100.0f);
        }
        matrix4f2.loadRotate(180.0f, 0.0f, 1.0f, 0.0f);
        matrix4f.loadMultiply(matrix4f, matrix4f2);
        matrix4f2.loadScale(-2.0f, 2.0f, 1.0f);
        matrix4f.loadMultiply(matrix4f, matrix4f2);
        matrix4f2.loadTranslate(0.0f, 0.0f, 2.0f);
        matrix4f.loadMultiply(matrix4f, matrix4f2);
        this.load(matrix4f);
    }
    
    public void loadRotate(float n, float n2, float n3, float n4) {
        final float[] mMat = this.mMat;
        mMat[7] = (mMat[3] = 0.0f);
        mMat[12] = (mMat[11] = 0.0f);
        mMat[14] = (mMat[13] = 0.0f);
        mMat[15] = 1.0f;
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
        final float[] mMat2 = this.mMat;
        mMat2[0] = n2 * n2 * n9 + n;
        final float n13 = n2 * n3 * n9;
        mMat2[4] = n13 - n12;
        n2 = n2 * n4 * n9;
        mMat2[8] = n2 + n11;
        mMat2[1] = n13 + n12;
        mMat2[5] = n3 * n3 * n9 + n;
        n3 = n3 * n4 * n9;
        mMat2[9] = n3 - n10;
        mMat2[2] = n2 - n11;
        mMat2[6] = n3 + n10;
        mMat2[10] = n4 * n4 * n9 + n;
    }
    
    public void loadScale(final float n, final float n2, final float n3) {
        this.loadIdentity();
        final float[] mMat = this.mMat;
        mMat[0] = n;
        mMat[5] = n2;
        mMat[10] = n3;
    }
    
    public void loadTranslate(final float n, final float n2, final float n3) {
        this.loadIdentity();
        final float[] mMat = this.mMat;
        mMat[12] = n;
        mMat[13] = n2;
        mMat[14] = n3;
    }
    
    public void multiply(final Matrix4f matrix4f) {
        final Matrix4f matrix4f2 = new Matrix4f();
        matrix4f2.loadMultiply(this, matrix4f);
        this.load(matrix4f2);
    }
    
    public void rotate(final float n, final float n2, final float n3, final float n4) {
        final Matrix4f matrix4f = new Matrix4f();
        matrix4f.loadRotate(n, n2, n3, n4);
        this.multiply(matrix4f);
    }
    
    public void scale(final float n, final float n2, final float n3) {
        final Matrix4f matrix4f = new Matrix4f();
        matrix4f.loadScale(n, n2, n3);
        this.multiply(matrix4f);
    }
    
    public void set(final int n, final int n2, final float n3) {
        this.mMat[n * 4 + n2] = n3;
    }
    
    public void translate(final float n, final float n2, final float n3) {
        final Matrix4f matrix4f = new Matrix4f();
        matrix4f.loadTranslate(n, n2, n3);
        this.multiply(matrix4f);
    }
    
    public void transpose() {
        int n;
        for (int i = 0; i < 3; i = n) {
            int j;
            for (n = (j = i + 1); j < 4; ++j) {
                final float[] mMat = this.mMat;
                final int n2 = i * 4 + j;
                final float n3 = mMat[n2];
                final int n4 = j * 4 + i;
                mMat[n2] = mMat[n4];
                mMat[n4] = n3;
            }
        }
    }
}
