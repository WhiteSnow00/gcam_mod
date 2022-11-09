// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public class Type$Builder
{
    boolean mDimFaces;
    boolean mDimMipmaps;
    int mDimX;
    int mDimY;
    int mDimZ;
    Element mElement;
    RenderScript mRS;
    int mYuv;
    
    public Type$Builder(final RenderScript mrs, final Element mElement) {
        this.mDimX = 1;
        mElement.checkValid();
        this.mRS = mrs;
        this.mElement = mElement;
    }
    
    public Type create() {
        final int mDimZ = this.mDimZ;
        if (mDimZ > 0) {
            if (this.mDimX <= 0 || this.mDimY <= 0) {
                throw new RSInvalidStateException("Both X and Y dimension required when Z is present.");
            }
            if (this.mDimFaces) {
                throw new RSInvalidStateException("Cube maps not supported with 3D types.");
            }
        }
        final int mDimY = this.mDimY;
        if (mDimY > 0 && this.mDimX <= 0) {
            throw new RSInvalidStateException("X dimension required when Y is present.");
        }
        final boolean mDimFaces = this.mDimFaces;
        if (mDimFaces && mDimY <= 0) {
            throw new RSInvalidStateException("Cube maps require 2D Types.");
        }
        if (this.mYuv != 0 && (mDimZ != 0 || mDimFaces || this.mDimMipmaps)) {
            throw new RSInvalidStateException("YUV only supports basic 2D.");
        }
        final RenderScript mrs = this.mRS;
        final Type type = new Type(mrs.nTypeCreate(this.mElement.getID(mrs), this.mDimX, this.mDimY, this.mDimZ, this.mDimMipmaps, this.mDimFaces, this.mYuv), this.mRS);
        type.mElement = this.mElement;
        type.mDimX = this.mDimX;
        type.mDimY = this.mDimY;
        type.mDimZ = this.mDimZ;
        type.mDimMipmaps = this.mDimMipmaps;
        type.mDimFaces = this.mDimFaces;
        type.mDimYuv = this.mYuv;
        type.calcElementCount();
        return type;
    }
    
    public Type$Builder setFaces(final boolean mDimFaces) {
        this.mDimFaces = mDimFaces;
        return this;
    }
    
    public Type$Builder setMipmaps(final boolean mDimMipmaps) {
        this.mDimMipmaps = mDimMipmaps;
        return this;
    }
    
    public Type$Builder setX(final int mDimX) {
        if (mDimX > 0) {
            this.mDimX = mDimX;
            return this;
        }
        throw new RSIllegalArgumentException("Values of less than 1 for Dimension X are not valid.");
    }
    
    public Type$Builder setY(final int mDimY) {
        if (mDimY > 0) {
            this.mDimY = mDimY;
            return this;
        }
        throw new RSIllegalArgumentException("Values of less than 1 for Dimension Y are not valid.");
    }
    
    public Type$Builder setYuvFormat(final int mYuv) {
        switch (mYuv) {
            default: {
                throw new RSIllegalArgumentException("Only NV21 and YV12 are supported..");
            }
            case 17:
            case 842094169: {
                this.mYuv = mYuv;
                return this;
            }
        }
    }
    
    public Type$Builder setZ(final int mDimZ) {
        if (mDimZ > 0) {
            this.mDimZ = mDimZ;
            return this;
        }
        throw new RSIllegalArgumentException("Values of less than 1 for Dimension Z are not valid.");
    }
}
