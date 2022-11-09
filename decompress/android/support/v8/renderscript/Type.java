// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class Type extends BaseObj
{
    boolean mDimFaces;
    boolean mDimMipmaps;
    int mDimX;
    int mDimY;
    int mDimYuv;
    int mDimZ;
    Element mElement;
    int mElementCount;
    
    public Type(final long n, final RenderScript renderScript) {
        super(n, renderScript);
    }
    
    public static Type createX(final RenderScript renderScript, final Element mElement, final int mDimX) {
        if (mDimX > 0) {
            final Type type = new Type(renderScript.nTypeCreate(mElement.getID(renderScript), mDimX, 0, 0, false, false, 0), renderScript);
            type.mElement = mElement;
            type.mDimX = mDimX;
            type.calcElementCount();
            return type;
        }
        throw new RSInvalidStateException("Dimension must be >= 1.");
    }
    
    public static Type createXY(final RenderScript renderScript, final Element mElement, final int mDimX, final int mDimY) {
        if (mDimX > 0 && mDimY > 0) {
            final Type type = new Type(renderScript.nTypeCreate(mElement.getID(renderScript), mDimX, mDimY, 0, false, false, 0), renderScript);
            type.mElement = mElement;
            type.mDimX = mDimX;
            type.mDimY = mDimY;
            type.calcElementCount();
            return type;
        }
        throw new RSInvalidStateException("Dimension must be >= 1.");
    }
    
    public static Type createXYZ(final RenderScript renderScript, final Element mElement, final int mDimX, final int mDimY, final int mDimZ) {
        if (mDimX > 0 && mDimY > 0 && mDimZ > 0) {
            final Type type = new Type(renderScript.nTypeCreate(mElement.getID(renderScript), mDimX, mDimY, mDimZ, false, false, 0), renderScript);
            type.mElement = mElement;
            type.mDimX = mDimX;
            type.mDimY = mDimY;
            type.mDimZ = mDimZ;
            type.calcElementCount();
            return type;
        }
        throw new RSInvalidStateException("Dimension must be >= 1.");
    }
    
    public void calcElementCount() {
        final boolean hasMipmaps = this.hasMipmaps();
        final int x = this.getX();
        final int y = this.getY();
        final int z = this.getZ();
        int n;
        if (!this.hasFaces()) {
            n = 1;
        }
        else {
            n = 6;
        }
        int n2 = x;
        if (x == 0) {
            n2 = 1;
        }
        int n3;
        if ((n3 = y) == 0) {
            n3 = 1;
        }
        int n4;
        if ((n4 = z) == 0) {
            n4 = 1;
        }
        int mElementCount = n2 * n3 * n4 * n;
        int n6;
        int n7;
        int n8;
        for (int n5 = n2; hasMipmaps && (n5 > 1 || n3 > 1 || n4 > 1); n5 = n6, n3 = n7, n4 = n8) {
            if ((n6 = n5) > 1) {
                n6 = n5 >> 1;
            }
            if ((n7 = n3) > 1) {
                n7 = n3 >> 1;
            }
            if ((n8 = n4) > 1) {
                n8 = n4 >> 1;
            }
            mElementCount += n6 * n7 * n8 * n;
        }
        this.mElementCount = mElementCount;
    }
    
    public int getCount() {
        return this.mElementCount;
    }
    
    public long getDummyType(final RenderScript renderScript, final long n) {
        return renderScript.nIncTypeCreate(n, this.mDimX, this.mDimY, this.mDimZ, this.mDimMipmaps, this.mDimFaces, this.mDimYuv);
    }
    
    public Element getElement() {
        return this.mElement;
    }
    
    public int getX() {
        return this.mDimX;
    }
    
    public int getY() {
        return this.mDimY;
    }
    
    public int getYuv() {
        return this.mDimYuv;
    }
    
    public int getZ() {
        return this.mDimZ;
    }
    
    public boolean hasFaces() {
        return this.mDimFaces;
    }
    
    public boolean hasMipmaps() {
        return this.mDimMipmaps;
    }
}
