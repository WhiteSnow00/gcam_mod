// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import android.view.Surface;
import java.lang.reflect.Array;
import android.graphics.BitmapFactory;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.util.Log;
import java.nio.ByteBuffer;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;

public class Allocation extends BaseObj
{
    public static final int USAGE_GRAPHICS_TEXTURE = 2;
    public static final int USAGE_IO_INPUT = 32;
    public static final int USAGE_IO_OUTPUT = 64;
    public static final int USAGE_SCRIPT = 1;
    public static final int USAGE_SHARED = 128;
    static BitmapFactory$Options mBitmapOptions;
    Allocation mAdaptedAllocation;
    boolean mAutoPadding;
    Bitmap mBitmap;
    ByteBuffer mByteBuffer;
    long mByteBufferStride;
    boolean mConstrainedFace;
    boolean mConstrainedLOD;
    boolean mConstrainedY;
    boolean mConstrainedZ;
    int mCurrentCount;
    int mCurrentDimX;
    int mCurrentDimY;
    int mCurrentDimZ;
    boolean mIncAllocDestroyed;
    long mIncCompatAllocation;
    boolean mReadAllowed;
    Type$CubemapFace mSelectedFace;
    int mSelectedLOD;
    int mSelectedY;
    int mSelectedZ;
    int mSize;
    Type mType;
    int mUsage;
    boolean mWriteAllowed;
    
    static {
        (Allocation.mBitmapOptions = new BitmapFactory$Options()).inScaled = false;
    }
    
    public Allocation(final long n, final RenderScript renderScript, final Type mType, final int mUsage) {
        super(n, renderScript);
        this.mByteBuffer = null;
        this.mByteBufferStride = 0L;
        this.mReadAllowed = true;
        this.mWriteAllowed = true;
        this.mAutoPadding = false;
        this.mSelectedFace = Type$CubemapFace.POSITIVE_X;
        if ((mUsage & 0xFFFFFF1C) == 0x0) {
            if ((mUsage & 0x20) != 0x0) {
                this.mWriteAllowed = false;
                if ((mUsage & 0xFFFFFFDC) != 0x0) {
                    throw new RSIllegalArgumentException("Invalid usage combination.");
                }
            }
            this.mType = mType;
            this.mUsage = mUsage;
            this.mIncCompatAllocation = 0L;
            this.mIncAllocDestroyed = false;
            if (mType != null) {
                this.mSize = mType.getCount() * this.mType.getElement().getBytesSize();
                this.updateCacheInfo(mType);
            }
            if (RenderScript.sUseGCHooks) {
                try {
                    RenderScript.registerNativeAllocation.invoke(RenderScript.sRuntime, this.mSize);
                }
                catch (final Exception ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Couldn't invoke registerNativeAllocation:");
                    sb.append(ex);
                    Log.e("RenderScript_jni", sb.toString());
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Couldn't invoke registerNativeAllocation:");
                    sb2.append(ex);
                    throw new RSRuntimeException(sb2.toString());
                }
            }
            return;
        }
        throw new RSIllegalArgumentException("Unknown usage specified.");
    }
    
    private void copy1DRangeFromUnchecked(final int n, final int n2, final Object o, final Element$DataType element$DataType, final int n3) {
        final int n4 = this.mType.mElement.getBytesSize() * n2;
        final boolean b = this.mAutoPadding && this.mType.getElement().getVectorSize() == 3;
        this.data1DChecks(n, n2, n3 * element$DataType.mSize, n4, b);
        this.mRS.nAllocationData1D(this.getIDSafe(), n, this.mSelectedLOD, n2, o, n4, element$DataType, this.mType.mElement.mType.mSize, b);
    }
    
    private void copy1DRangeToUnchecked(final int n, final int n2, final Object o, final Element$DataType element$DataType, final int n3) {
        final int n4 = this.mType.mElement.getBytesSize() * n2;
        final boolean b = this.mAutoPadding && this.mType.getElement().getVectorSize() == 3;
        this.data1DChecks(n, n2, n3 * element$DataType.mSize, n4, b);
        this.mRS.nAllocationRead1D(this.getIDSafe(), n, this.mSelectedLOD, n2, o, n4, element$DataType, this.mType.mElement.mType.mSize, b);
    }
    
    private void copy3DRangeFromUnchecked(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Object o, final Element$DataType element$DataType, int n7) {
        this.mRS.validate();
        this.validate3DRange(n, n2, n3, n4, n5, n6);
        final int n8 = this.mType.mElement.getBytesSize() * n4 * n5 * n6;
        n7 *= element$DataType.mSize;
        boolean b;
        if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
            if (n8 / 4 * 3 > n7) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            n7 = n8;
            b = true;
        }
        else {
            if (n8 > n7) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            b = false;
        }
        this.mRS.nAllocationData3D(this.getIDSafe(), n, n2, n3, this.mSelectedLOD, n4, n5, n6, o, n7, element$DataType, this.mType.mElement.mType.mSize, b);
    }
    
    private void copyFromUnchecked(final Object o, final Element$DataType element$DataType, final int n) {
        this.mRS.validate();
        final int mCurrentDimZ = this.mCurrentDimZ;
        if (mCurrentDimZ > 0) {
            this.copy3DRangeFromUnchecked(0, 0, 0, this.mCurrentDimX, this.mCurrentDimY, mCurrentDimZ, o, element$DataType, n);
            return;
        }
        final int mCurrentDimY = this.mCurrentDimY;
        if (mCurrentDimY > 0) {
            this.copy2DRangeFromUnchecked(0, 0, this.mCurrentDimX, mCurrentDimY, o, element$DataType, n);
            return;
        }
        this.copy1DRangeFromUnchecked(0, this.mCurrentCount, o, element$DataType, n);
    }
    
    private void copyTo(final Object o, final Element$DataType element$DataType, final int n) {
        this.mRS.validate();
        final boolean b = this.mAutoPadding && this.mType.getElement().getVectorSize() == 3;
        if (b) {
            if (element$DataType.mSize * n < this.mSize / 4 * 3) {
                throw new RSIllegalArgumentException("Size of output array cannot be smaller than size of allocation.");
            }
        }
        else if (element$DataType.mSize * n < this.mSize) {
            throw new RSIllegalArgumentException("Size of output array cannot be smaller than size of allocation.");
        }
        final RenderScript mrs = this.mRS;
        mrs.nAllocationRead(this.getID(mrs), o, element$DataType, this.mType.mElement.mType.mSize, b);
    }
    
    public static Allocation createCubemapFromBitmap(final RenderScript renderScript, final Bitmap bitmap) {
        return createCubemapFromBitmap(renderScript, bitmap, Allocation$MipmapControl.MIPMAP_NONE, 2);
    }
    
    public static Allocation createCubemapFromBitmap(final RenderScript renderScript, final Bitmap bitmap, final Allocation$MipmapControl allocation$MipmapControl, final int n) {
        renderScript.validate();
        final int height = bitmap.getHeight();
        final int width = bitmap.getWidth();
        if (width % 6 != 0) {
            throw new RSIllegalArgumentException("Cubemap height must be multiple of 6");
        }
        if (width / 6 != height) {
            throw new RSIllegalArgumentException("Only square cube map faces supported");
        }
        if ((height - 1 & height) != 0x0) {
            throw new RSIllegalArgumentException("Only power of 2 cube faces supported");
        }
        final Element elementFromBitmap = elementFromBitmap(renderScript, bitmap);
        final Type$Builder type$Builder = new Type$Builder(renderScript, elementFromBitmap);
        type$Builder.setX(height);
        type$Builder.setY(height);
        boolean mipmaps = true;
        type$Builder.setFaces(true);
        if (allocation$MipmapControl != Allocation$MipmapControl.MIPMAP_FULL) {
            mipmaps = false;
        }
        type$Builder.setMipmaps(mipmaps);
        final Type create = type$Builder.create();
        final long nAllocationCubeCreateFromBitmap = renderScript.nAllocationCubeCreateFromBitmap(create.getID(renderScript), allocation$MipmapControl.mID, bitmap, n);
        if (nAllocationCubeCreateFromBitmap != 0L) {
            return new Allocation(nAllocationCubeCreateFromBitmap, renderScript, create, n);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Load failed for bitmap ");
        sb.append(bitmap);
        sb.append(" element ");
        sb.append(elementFromBitmap);
        throw new RSRuntimeException(sb.toString());
    }
    
    public static Allocation createCubemapFromCubeFaces(final RenderScript renderScript, final Bitmap bitmap, final Bitmap bitmap2, final Bitmap bitmap3, final Bitmap bitmap4, final Bitmap bitmap5, final Bitmap bitmap6) {
        final Allocation$MipmapControl mipmap_NONE = Allocation$MipmapControl.MIPMAP_NONE;
        return null;
    }
    
    public static Allocation createCubemapFromCubeFaces(final RenderScript renderScript, final Bitmap bitmap, final Bitmap bitmap2, final Bitmap bitmap3, final Bitmap bitmap4, final Bitmap bitmap5, final Bitmap bitmap6, final Allocation$MipmapControl allocation$MipmapControl, final int n) {
        return null;
    }
    
    public static Allocation createFromBitmap(final RenderScript renderScript, final Bitmap bitmap) {
        return createFromBitmap(renderScript, bitmap, Allocation$MipmapControl.MIPMAP_NONE, 131);
    }
    
    public static Allocation createFromBitmap(final RenderScript renderScript, final Bitmap bitmap, final Allocation$MipmapControl allocation$MipmapControl, final int n) {
        renderScript.validate();
        if (bitmap.getConfig() == null) {
            if ((n & 0x80) == 0x0) {
                final Bitmap bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap$Config.ARGB_8888);
                new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint)null);
                return createFromBitmap(renderScript, bitmap2, allocation$MipmapControl, n);
            }
            throw new RSIllegalArgumentException("USAGE_SHARED cannot be used with a Bitmap that has a null config.");
        }
        else {
            final Type typeFromBitmap = typeFromBitmap(renderScript, bitmap, allocation$MipmapControl);
            if (allocation$MipmapControl == Allocation$MipmapControl.MIPMAP_NONE && typeFromBitmap.getElement().isCompatible(Element.RGBA_8888(renderScript)) && n == 131) {
                final long nAllocationCreateBitmapBackedAllocation = renderScript.nAllocationCreateBitmapBackedAllocation(typeFromBitmap.getID(renderScript), allocation$MipmapControl.mID, bitmap, 131);
                if (nAllocationCreateBitmapBackedAllocation != 0L) {
                    final Allocation allocation = new Allocation(nAllocationCreateBitmapBackedAllocation, renderScript, typeFromBitmap, 131);
                    allocation.setBitmap(bitmap);
                    return allocation;
                }
                throw new RSRuntimeException("Load failed.");
            }
            else {
                final long nAllocationCreateFromBitmap = renderScript.nAllocationCreateFromBitmap(typeFromBitmap.getID(renderScript), allocation$MipmapControl.mID, bitmap, n);
                if (nAllocationCreateFromBitmap != 0L) {
                    return new Allocation(nAllocationCreateFromBitmap, renderScript, typeFromBitmap, n);
                }
                throw new RSRuntimeException("Load failed.");
            }
        }
    }
    
    public static Allocation createFromBitmapResource(final RenderScript renderScript, final Resources resources, final int n) {
        return createFromBitmapResource(renderScript, resources, n, Allocation$MipmapControl.MIPMAP_NONE, 3);
    }
    
    public static Allocation createFromBitmapResource(final RenderScript renderScript, final Resources resources, final int n, final Allocation$MipmapControl allocation$MipmapControl, final int n2) {
        renderScript.validate();
        if ((n2 & 0xE0) == 0x0) {
            final Bitmap decodeResource = BitmapFactory.decodeResource(resources, n);
            final Allocation fromBitmap = createFromBitmap(renderScript, decodeResource, allocation$MipmapControl, n2);
            decodeResource.recycle();
            return fromBitmap;
        }
        throw new RSIllegalArgumentException("Unsupported usage specified.");
    }
    
    public static Allocation createFromString(final RenderScript renderScript, final String s, final int n) {
        renderScript.validate();
        try {
            final byte[] bytes = s.getBytes("UTF-8");
            final Allocation sized = createSized(renderScript, Element.U8(renderScript), bytes.length, n);
            sized.copyFrom(bytes);
            return sized;
        }
        catch (final Exception ex) {
            throw new RSRuntimeException("Could not convert string to utf-8.");
        }
    }
    
    public static Allocation createSized(final RenderScript renderScript, final Element element, final int n) {
        return createSized(renderScript, element, n, 1);
    }
    
    public static Allocation createSized(final RenderScript renderScript, final Element element, final int x, final int n) {
        renderScript.validate();
        final Type$Builder type$Builder = new Type$Builder(renderScript, element);
        type$Builder.setX(x);
        final Type create = type$Builder.create();
        final long nAllocationCreateTyped = renderScript.nAllocationCreateTyped(create.getID(renderScript), Allocation$MipmapControl.MIPMAP_NONE.mID, n, 0L);
        if (nAllocationCreateTyped != 0L) {
            return new Allocation(nAllocationCreateTyped, renderScript, create, n);
        }
        throw new RSRuntimeException("Allocation creation failed.");
    }
    
    public static Allocation createTyped(final RenderScript renderScript, final Type type) {
        return createTyped(renderScript, type, Allocation$MipmapControl.MIPMAP_NONE, 1);
    }
    
    public static Allocation createTyped(final RenderScript renderScript, final Type type, final int n) {
        return createTyped(renderScript, type, Allocation$MipmapControl.MIPMAP_NONE, n);
    }
    
    public static Allocation createTyped(final RenderScript renderScript, final Type type, final Allocation$MipmapControl allocation$MipmapControl, final int n) {
        renderScript.validate();
        if (type.getID(renderScript) == 0L) {
            throw new RSInvalidStateException("Bad Type");
        }
        if (!renderScript.usingIO() && (n & 0x20) != 0x0) {
            throw new RSRuntimeException("USAGE_IO not supported, Allocation creation failed.");
        }
        final long nAllocationCreateTyped = renderScript.nAllocationCreateTyped(type.getID(renderScript), allocation$MipmapControl.mID, n, 0L);
        if (nAllocationCreateTyped != 0L) {
            return new Allocation(nAllocationCreateTyped, renderScript, type, n);
        }
        throw new RSRuntimeException("Allocation creation failed.");
    }
    
    private void data1DChecks(final int n, final int n2, final int n3, final int n4, final boolean b) {
        this.mRS.validate();
        if (n < 0) {
            throw new RSIllegalArgumentException("Offset must be >= 0.");
        }
        if (n2 <= 0) {
            throw new RSIllegalArgumentException("Count must be >= 1.");
        }
        if (n + n2 <= this.mCurrentCount) {
            if (b) {
                if (n3 < n4 / 4 * 3) {
                    throw new RSIllegalArgumentException("Array too small for allocation type.");
                }
            }
            else if (n3 < n4) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Overflow, Available count ");
        sb.append(this.mCurrentCount);
        sb.append(", got ");
        sb.append(n2);
        sb.append(" at offset ");
        sb.append(n);
        sb.append(".");
        throw new RSIllegalArgumentException(sb.toString());
    }
    
    static Element elementFromBitmap(final RenderScript renderScript, final Bitmap bitmap) {
        final Bitmap$Config config = bitmap.getConfig();
        if (config == Bitmap$Config.ALPHA_8) {
            return Element.A_8(renderScript);
        }
        if (config == Bitmap$Config.ARGB_4444) {
            return Element.RGBA_4444(renderScript);
        }
        if (config == Bitmap$Config.ARGB_8888) {
            return Element.RGBA_8888(renderScript);
        }
        if (config == Bitmap$Config.RGB_565) {
            return Element.RGB_565(renderScript);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Bad bitmap type: ");
        sb.append(config);
        throw new RSInvalidStateException(sb.toString());
    }
    
    private long getIDSafe() {
        final Allocation mAdaptedAllocation = this.mAdaptedAllocation;
        if (mAdaptedAllocation != null) {
            return mAdaptedAllocation.getID(this.mRS);
        }
        return this.getID(this.mRS);
    }
    
    private void setBitmap(final Bitmap mBitmap) {
        this.mBitmap = mBitmap;
    }
    
    static Type typeFromBitmap(final RenderScript renderScript, final Bitmap bitmap, final Allocation$MipmapControl allocation$MipmapControl) {
        final Type$Builder type$Builder = new Type$Builder(renderScript, elementFromBitmap(renderScript, bitmap));
        type$Builder.setX(bitmap.getWidth());
        type$Builder.setY(bitmap.getHeight());
        type$Builder.setMipmaps(allocation$MipmapControl == Allocation$MipmapControl.MIPMAP_FULL);
        return type$Builder.create();
    }
    
    private void updateCacheInfo(final Type type) {
        this.mCurrentDimX = type.getX();
        this.mCurrentDimY = type.getY();
        final int z = type.getZ();
        this.mCurrentDimZ = z;
        final int mCurrentDimX = this.mCurrentDimX;
        this.mCurrentCount = mCurrentDimX;
        final int mCurrentDimY = this.mCurrentDimY;
        int mCurrentCount = mCurrentDimX;
        if (mCurrentDimY > 1) {
            mCurrentCount = mCurrentDimX * mCurrentDimY;
            this.mCurrentCount = mCurrentCount;
        }
        if (z > 1) {
            this.mCurrentCount = mCurrentCount * z;
        }
    }
    
    private void validate2DRange(final int n, final int n2, final int n3, final int n4) {
        if (this.mAdaptedAllocation == null) {
            if (n < 0 || n2 < 0) {
                throw new RSIllegalArgumentException("Offset cannot be negative.");
            }
            if (n4 < 0 || n3 < 0) {
                throw new RSIllegalArgumentException("Height or width cannot be negative.");
            }
            if (n + n3 > this.mCurrentDimX || n2 + n4 > this.mCurrentDimY) {
                throw new RSIllegalArgumentException("Updated region larger than allocation.");
            }
        }
    }
    
    private void validate3DRange(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (this.mAdaptedAllocation == null) {
            if (n < 0 || n2 < 0 || n3 < 0) {
                throw new RSIllegalArgumentException("Offset cannot be negative.");
            }
            if (n5 < 0 || n4 < 0 || n6 < 0) {
                throw new RSIllegalArgumentException("Height or width cannot be negative.");
            }
            if (n + n4 > this.mCurrentDimX || n2 + n5 > this.mCurrentDimY || n3 + n6 > this.mCurrentDimZ) {
                throw new RSIllegalArgumentException("Updated region larger than allocation.");
            }
        }
    }
    
    private void validateBitmapFormat(final Bitmap bitmap) {
        final Bitmap$Config config = bitmap.getConfig();
        if (config != null) {
            switch (Allocation$1.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()]) {
                case 4: {
                    if (this.mType.getElement().mKind == Element$DataKind.PIXEL_RGBA && this.mType.getElement().getBytesSize() == 2) {
                        break;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Allocation kind is ");
                    sb.append(this.mType.getElement().mKind);
                    sb.append(", type ");
                    sb.append(this.mType.getElement().mType);
                    sb.append(" of ");
                    sb.append(this.mType.getElement().getBytesSize());
                    sb.append(" bytes, passed bitmap was ");
                    sb.append(config);
                    throw new RSIllegalArgumentException(sb.toString());
                }
                case 3: {
                    if (this.mType.getElement().mKind == Element$DataKind.PIXEL_RGB && this.mType.getElement().getBytesSize() == 2) {
                        break;
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Allocation kind is ");
                    sb2.append(this.mType.getElement().mKind);
                    sb2.append(", type ");
                    sb2.append(this.mType.getElement().mType);
                    sb2.append(" of ");
                    sb2.append(this.mType.getElement().getBytesSize());
                    sb2.append(" bytes, passed bitmap was ");
                    sb2.append(config);
                    throw new RSIllegalArgumentException(sb2.toString());
                }
                case 2: {
                    if (this.mType.getElement().mKind == Element$DataKind.PIXEL_RGBA && this.mType.getElement().getBytesSize() == 4) {
                        break;
                    }
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Allocation kind is ");
                    sb3.append(this.mType.getElement().mKind);
                    sb3.append(", type ");
                    sb3.append(this.mType.getElement().mType);
                    sb3.append(" of ");
                    sb3.append(this.mType.getElement().getBytesSize());
                    sb3.append(" bytes, passed bitmap was ");
                    sb3.append(config);
                    throw new RSIllegalArgumentException(sb3.toString());
                }
                case 1: {
                    if (this.mType.getElement().mKind == Element$DataKind.PIXEL_A) {
                        break;
                    }
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Allocation kind is ");
                    sb4.append(this.mType.getElement().mKind);
                    sb4.append(", type ");
                    sb4.append(this.mType.getElement().mType);
                    sb4.append(" of ");
                    sb4.append(this.mType.getElement().getBytesSize());
                    sb4.append(" bytes, passed bitmap was ");
                    sb4.append(config);
                    throw new RSIllegalArgumentException(sb4.toString());
                }
            }
            return;
        }
        throw new RSIllegalArgumentException("Bitmap has an unsupported format for this operation");
    }
    
    private void validateBitmapSize(final Bitmap bitmap) {
        if (this.mCurrentDimX == bitmap.getWidth() && this.mCurrentDimY == bitmap.getHeight()) {
            return;
        }
        throw new RSIllegalArgumentException("Cannot update allocation from bitmap, sizes mismatch");
    }
    
    private void validateIsFloat32() {
        if (this.mType.mElement.mType == Element$DataType.FLOAT_32) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("32 bit float source does not match allocation type ");
        sb.append(this.mType.mElement.mType);
        throw new RSIllegalArgumentException(sb.toString());
    }
    
    private void validateIsFloat64() {
        if (this.mType.mElement.mType == Element$DataType.FLOAT_64) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("64 bit float source does not match allocation type ");
        sb.append(this.mType.mElement.mType);
        throw new RSIllegalArgumentException(sb.toString());
    }
    
    private void validateIsInt16() {
        if (this.mType.mElement.mType != Element$DataType.SIGNED_16 && this.mType.mElement.mType != Element$DataType.UNSIGNED_16) {
            final StringBuilder sb = new StringBuilder();
            sb.append("16 bit integer source does not match allocation type ");
            sb.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(sb.toString());
        }
    }
    
    private void validateIsInt32() {
        if (this.mType.mElement.mType != Element$DataType.SIGNED_32 && this.mType.mElement.mType != Element$DataType.UNSIGNED_32) {
            final StringBuilder sb = new StringBuilder();
            sb.append("32 bit integer source does not match allocation type ");
            sb.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(sb.toString());
        }
    }
    
    private void validateIsInt64() {
        if (this.mType.mElement.mType != Element$DataType.SIGNED_64 && this.mType.mElement.mType != Element$DataType.UNSIGNED_64) {
            final StringBuilder sb = new StringBuilder();
            sb.append("64 bit integer source does not match allocation type ");
            sb.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(sb.toString());
        }
    }
    
    private void validateIsInt8() {
        if (this.mType.mElement.mType != Element$DataType.SIGNED_8 && this.mType.mElement.mType != Element$DataType.UNSIGNED_8) {
            final StringBuilder sb = new StringBuilder();
            sb.append("8 bit integer source does not match allocation type ");
            sb.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(sb.toString());
        }
    }
    
    private void validateIsObject() {
        if (this.mType.mElement.mType != Element$DataType.RS_ELEMENT && this.mType.mElement.mType != Element$DataType.RS_TYPE && this.mType.mElement.mType != Element$DataType.RS_ALLOCATION && this.mType.mElement.mType != Element$DataType.RS_SAMPLER && this.mType.mElement.mType != Element$DataType.RS_SCRIPT) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Object source does not match allocation type ");
            sb.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(sb.toString());
        }
    }
    
    private Element$DataType validateObjectIsPrimitiveArray(final Object o, final boolean b) {
        final Class<?> class1 = o.getClass();
        if (!class1.isArray()) {
            throw new RSIllegalArgumentException("Object passed is not an array of primitives.");
        }
        final Class<?> componentType = class1.getComponentType();
        if (!componentType.isPrimitive()) {
            throw new RSIllegalArgumentException("Object passed is not an Array of primitives.");
        }
        if (componentType == Long.TYPE) {
            if (b) {
                this.validateIsInt64();
                return this.mType.mElement.mType;
            }
            return Element$DataType.SIGNED_64;
        }
        else if (componentType == Integer.TYPE) {
            if (b) {
                this.validateIsInt32();
                return this.mType.mElement.mType;
            }
            return Element$DataType.SIGNED_32;
        }
        else if (componentType == Short.TYPE) {
            if (b) {
                this.validateIsInt16();
                return this.mType.mElement.mType;
            }
            return Element$DataType.SIGNED_16;
        }
        else if (componentType == Byte.TYPE) {
            if (b) {
                this.validateIsInt8();
                return this.mType.mElement.mType;
            }
            return Element$DataType.SIGNED_8;
        }
        else {
            if (componentType == Float.TYPE) {
                if (b) {
                    this.validateIsFloat32();
                }
                return Element$DataType.FLOAT_32;
            }
            if (componentType == Double.TYPE) {
                if (b) {
                    this.validateIsFloat64();
                }
                return Element$DataType.FLOAT_64;
            }
            return null;
        }
    }
    
    public void copy1DRangeFrom(final int n, final int n2, final Allocation allocation, final int n3) {
        this.mRS.nAllocationData2D(this.getIDSafe(), n, 0, this.mSelectedLOD, this.mSelectedFace.mID, n2, 1, allocation.getID(this.mRS), n3, 0, allocation.mSelectedLOD, allocation.mSelectedFace.mID);
    }
    
    public void copy1DRangeFrom(final int n, final int n2, final Object o) {
        this.copy1DRangeFromUnchecked(n, n2, o, this.validateObjectIsPrimitiveArray(o, true), Array.getLength(o));
    }
    
    public void copy1DRangeFrom(final int n, final int n2, final byte[] array) {
        this.validateIsInt8();
        this.copy1DRangeFromUnchecked(n, n2, array, Element$DataType.SIGNED_8, array.length);
    }
    
    public void copy1DRangeFrom(final int n, final int n2, final float[] array) {
        this.validateIsFloat32();
        this.copy1DRangeFromUnchecked(n, n2, array, Element$DataType.FLOAT_32, array.length);
    }
    
    public void copy1DRangeFrom(final int n, final int n2, final int[] array) {
        this.validateIsInt32();
        this.copy1DRangeFromUnchecked(n, n2, array, Element$DataType.SIGNED_32, array.length);
    }
    
    public void copy1DRangeFrom(final int n, final int n2, final short[] array) {
        this.validateIsInt16();
        this.copy1DRangeFromUnchecked(n, n2, array, Element$DataType.SIGNED_16, array.length);
    }
    
    public void copy1DRangeFromUnchecked(final int n, final int n2, final Object o) {
        this.copy1DRangeFromUnchecked(n, n2, o, this.validateObjectIsPrimitiveArray(o, false), Array.getLength(o));
    }
    
    public void copy1DRangeFromUnchecked(final int n, final int n2, final byte[] array) {
        this.copy1DRangeFromUnchecked(n, n2, array, Element$DataType.SIGNED_8, array.length);
    }
    
    public void copy1DRangeFromUnchecked(final int n, final int n2, final float[] array) {
        this.copy1DRangeFromUnchecked(n, n2, array, Element$DataType.FLOAT_32, array.length);
    }
    
    public void copy1DRangeFromUnchecked(final int n, final int n2, final int[] array) {
        this.copy1DRangeFromUnchecked(n, n2, array, Element$DataType.SIGNED_32, array.length);
    }
    
    public void copy1DRangeFromUnchecked(final int n, final int n2, final short[] array) {
        this.copy1DRangeFromUnchecked(n, n2, array, Element$DataType.SIGNED_16, array.length);
    }
    
    public void copy1DRangeTo(final int n, final int n2, final Object o) {
        this.copy1DRangeToUnchecked(n, n2, o, this.validateObjectIsPrimitiveArray(o, true), Array.getLength(o));
    }
    
    public void copy1DRangeTo(final int n, final int n2, final byte[] array) {
        this.validateIsInt8();
        this.copy1DRangeToUnchecked(n, n2, array, Element$DataType.SIGNED_8, array.length);
    }
    
    public void copy1DRangeTo(final int n, final int n2, final float[] array) {
        this.validateIsFloat32();
        this.copy1DRangeToUnchecked(n, n2, array, Element$DataType.FLOAT_32, array.length);
    }
    
    public void copy1DRangeTo(final int n, final int n2, final int[] array) {
        this.validateIsInt32();
        this.copy1DRangeToUnchecked(n, n2, array, Element$DataType.SIGNED_32, array.length);
    }
    
    public void copy1DRangeTo(final int n, final int n2, final short[] array) {
        this.validateIsInt16();
        this.copy1DRangeToUnchecked(n, n2, array, Element$DataType.SIGNED_16, array.length);
    }
    
    public void copy1DRangeToUnchecked(final int n, final int n2, final Object o) {
        this.copy1DRangeToUnchecked(n, n2, o, this.validateObjectIsPrimitiveArray(o, false), Array.getLength(o));
    }
    
    public void copy1DRangeToUnchecked(final int n, final int n2, final byte[] array) {
        this.copy1DRangeToUnchecked(n, n2, array, Element$DataType.SIGNED_8, array.length);
    }
    
    public void copy1DRangeToUnchecked(final int n, final int n2, final float[] array) {
        this.copy1DRangeToUnchecked(n, n2, array, Element$DataType.FLOAT_32, array.length);
    }
    
    public void copy1DRangeToUnchecked(final int n, final int n2, final int[] array) {
        this.copy1DRangeToUnchecked(n, n2, array, Element$DataType.SIGNED_32, array.length);
    }
    
    public void copy1DRangeToUnchecked(final int n, final int n2, final short[] array) {
        this.copy1DRangeToUnchecked(n, n2, array, Element$DataType.SIGNED_16, array.length);
    }
    
    public void copy2DRangeFrom(final int n, final int n2, final int n3, final int n4, final Allocation allocation, final int n5, final int n6) {
        this.mRS.validate();
        this.validate2DRange(n, n2, n3, n4);
        this.mRS.nAllocationData2D(this.getIDSafe(), n, n2, this.mSelectedLOD, this.mSelectedFace.mID, n3, n4, allocation.getID(this.mRS), n5, n6, allocation.mSelectedLOD, allocation.mSelectedFace.mID);
    }
    
    public void copy2DRangeFrom(final int n, final int n2, final int n3, final int n4, final Object o) {
        this.copy2DRangeFromUnchecked(n, n2, n3, n4, o, this.validateObjectIsPrimitiveArray(o, true), Array.getLength(o));
    }
    
    public void copy2DRangeFrom(final int n, final int n2, final int n3, final int n4, final byte[] array) {
        this.validateIsInt8();
        this.copy2DRangeFromUnchecked(n, n2, n3, n4, array, Element$DataType.SIGNED_8, array.length);
    }
    
    public void copy2DRangeFrom(final int n, final int n2, final int n3, final int n4, final float[] array) {
        this.validateIsFloat32();
        this.copy2DRangeFromUnchecked(n, n2, n3, n4, array, Element$DataType.FLOAT_32, array.length);
    }
    
    public void copy2DRangeFrom(final int n, final int n2, final int n3, final int n4, final int[] array) {
        this.validateIsInt32();
        this.copy2DRangeFromUnchecked(n, n2, n3, n4, array, Element$DataType.SIGNED_32, array.length);
    }
    
    public void copy2DRangeFrom(final int n, final int n2, final int n3, final int n4, final short[] array) {
        this.validateIsInt16();
        this.copy2DRangeFromUnchecked(n, n2, n3, n4, array, Element$DataType.SIGNED_16, array.length);
    }
    
    public void copy2DRangeFrom(final int n, final int n2, final Bitmap bitmap) {
        this.mRS.validate();
        if (bitmap.getConfig() == null) {
            final Bitmap bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap$Config.ARGB_8888);
            new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint)null);
            this.copy2DRangeFrom(n, n2, bitmap2);
            return;
        }
        this.validateBitmapFormat(bitmap);
        this.validate2DRange(n, n2, bitmap.getWidth(), bitmap.getHeight());
        this.mRS.nAllocationData2D(this.getIDSafe(), n, n2, this.mSelectedLOD, this.mSelectedFace.mID, bitmap);
    }
    
    public void copy2DRangeFromUnchecked(final int n, final int n2, final int n3, final int n4, final Object o, final Element$DataType element$DataType, int n5) {
        this.mRS.validate();
        this.validate2DRange(n, n2, n3, n4);
        final int n6 = this.mType.mElement.getBytesSize() * n3 * n4;
        n5 *= element$DataType.mSize;
        boolean b;
        if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
            if (n6 / 4 * 3 > n5) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            n5 = n6;
            b = true;
        }
        else {
            if (n6 > n5) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            b = false;
        }
        this.mRS.nAllocationData2D(this.getIDSafe(), n, n2, this.mSelectedLOD, this.mSelectedFace.mID, n3, n4, o, n5, element$DataType, this.mType.mElement.mType.mSize, b);
    }
    
    public void copy2DRangeTo(final int n, final int n2, final int n3, final int n4, final Object o) {
        this.copy2DRangeToUnchecked(n, n2, n3, n4, o, this.validateObjectIsPrimitiveArray(o, true), Array.getLength(o));
    }
    
    public void copy2DRangeTo(final int n, final int n2, final int n3, final int n4, final byte[] array) {
        this.validateIsInt8();
        this.copy2DRangeToUnchecked(n, n2, n3, n4, array, Element$DataType.SIGNED_8, array.length);
    }
    
    public void copy2DRangeTo(final int n, final int n2, final int n3, final int n4, final float[] array) {
        this.validateIsFloat32();
        this.copy2DRangeToUnchecked(n, n2, n3, n4, array, Element$DataType.FLOAT_32, array.length);
    }
    
    public void copy2DRangeTo(final int n, final int n2, final int n3, final int n4, final int[] array) {
        this.validateIsInt32();
        this.copy2DRangeToUnchecked(n, n2, n3, n4, array, Element$DataType.SIGNED_32, array.length);
    }
    
    public void copy2DRangeTo(final int n, final int n2, final int n3, final int n4, final short[] array) {
        this.validateIsInt16();
        this.copy2DRangeToUnchecked(n, n2, n3, n4, array, Element$DataType.SIGNED_16, array.length);
    }
    
    public void copy2DRangeToUnchecked(final int n, final int n2, final int n3, final int n4, final Object o, final Element$DataType element$DataType, int n5) {
        this.mRS.validate();
        this.validate2DRange(n, n2, n3, n4);
        final int n6 = this.mType.mElement.getBytesSize() * n3 * n4;
        n5 *= element$DataType.mSize;
        boolean b;
        if (this.mAutoPadding && this.mType.getElement().getVectorSize() == 3) {
            if (n6 / 4 * 3 > n5) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            n5 = n6;
            b = true;
        }
        else {
            if (n6 > n5) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
            b = false;
        }
        this.mRS.nAllocationRead2D(this.getIDSafe(), n, n2, this.mSelectedLOD, this.mSelectedFace.mID, n3, n4, o, n5, element$DataType, this.mType.mElement.mType.mSize, b);
    }
    
    public void copy3DRangeFrom(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Allocation allocation, final int n7, final int n8, final int n9) {
        this.mRS.validate();
        this.validate3DRange(n, n2, n3, n4, n5, n6);
        this.mRS.nAllocationData3D(this.getIDSafe(), n, n2, n3, this.mSelectedLOD, n4, n5, n6, allocation.getID(this.mRS), n7, n8, n9, allocation.mSelectedLOD);
    }
    
    public void copy3DRangeFrom(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Object o) {
        this.copy3DRangeFromUnchecked(n, n2, n3, n4, n5, n6, o, this.validateObjectIsPrimitiveArray(o, true), Array.getLength(o));
    }
    
    public void copyFrom(final Bitmap bitmap) {
        this.mRS.validate();
        if (bitmap.getConfig() == null) {
            final Bitmap bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap$Config.ARGB_8888);
            new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint)null);
            this.copyFrom(bitmap2);
            return;
        }
        this.validateBitmapSize(bitmap);
        this.validateBitmapFormat(bitmap);
        final RenderScript mrs = this.mRS;
        mrs.nAllocationCopyFromBitmap(this.getID(mrs), bitmap);
    }
    
    public void copyFrom(final Allocation allocation) {
        this.mRS.validate();
        if (this.mType.equals(allocation.getType())) {
            this.copy2DRangeFrom(0, 0, this.mCurrentDimX, this.mCurrentDimY, allocation, 0, 0);
            return;
        }
        throw new RSIllegalArgumentException("Types of allocations must match.");
    }
    
    public void copyFrom(final Object o) {
        this.copyFromUnchecked(o, this.validateObjectIsPrimitiveArray(o, true), Array.getLength(o));
    }
    
    public void copyFrom(final byte[] array) {
        this.validateIsInt8();
        this.copyFromUnchecked(array, Element$DataType.SIGNED_8, array.length);
    }
    
    public void copyFrom(final float[] array) {
        this.validateIsFloat32();
        this.copyFromUnchecked(array, Element$DataType.FLOAT_32, array.length);
    }
    
    public void copyFrom(final int[] array) {
        this.validateIsInt32();
        this.copyFromUnchecked(array, Element$DataType.SIGNED_32, array.length);
    }
    
    public void copyFrom(final BaseObj[] array) {
        this.mRS.validate();
        this.validateIsObject();
        final int length = array.length;
        if (length != this.mCurrentCount) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Array size mismatch, allocation sizeX = ");
            sb.append(this.mCurrentCount);
            sb.append(", array length = ");
            sb.append(length);
            throw new RSIllegalArgumentException(sb.toString());
        }
        if (RenderScript.sPointerSize == 8) {
            final long[] array2 = new long[length * 4];
            for (int i = 0; i < array.length; ++i) {
                array2[i * 4] = array[i].getID(this.mRS);
            }
            this.copy1DRangeFromUnchecked(0, this.mCurrentCount, array2);
            return;
        }
        final int[] array3 = new int[length];
        for (int j = 0; j < array.length; ++j) {
            array3[j] = (int)array[j].getID(this.mRS);
        }
        this.copy1DRangeFromUnchecked(0, this.mCurrentCount, array3);
    }
    
    public void copyFrom(final short[] array) {
        this.validateIsInt16();
        this.copyFromUnchecked(array, Element$DataType.SIGNED_16, array.length);
    }
    
    public void copyFromUnchecked(final Object o) {
        this.copyFromUnchecked(o, this.validateObjectIsPrimitiveArray(o, false), Array.getLength(o));
    }
    
    public void copyFromUnchecked(final byte[] array) {
        this.copyFromUnchecked(array, Element$DataType.SIGNED_8, array.length);
    }
    
    public void copyFromUnchecked(final float[] array) {
        this.copyFromUnchecked(array, Element$DataType.FLOAT_32, array.length);
    }
    
    public void copyFromUnchecked(final int[] array) {
        this.copyFromUnchecked(array, Element$DataType.SIGNED_32, array.length);
    }
    
    public void copyFromUnchecked(final short[] array) {
        this.copyFromUnchecked(array, Element$DataType.SIGNED_16, array.length);
    }
    
    public void copyTo(final Bitmap bitmap) {
        this.mRS.validate();
        this.validateBitmapFormat(bitmap);
        this.validateBitmapSize(bitmap);
        final RenderScript mrs = this.mRS;
        mrs.nAllocationCopyToBitmap(this.getID(mrs), bitmap);
    }
    
    public void copyTo(final Object o) {
        this.copyTo(o, this.validateObjectIsPrimitiveArray(o, true), Array.getLength(o));
    }
    
    public void copyTo(final byte[] array) {
        this.validateIsInt8();
        this.copyTo(array, Element$DataType.SIGNED_8, array.length);
    }
    
    public void copyTo(final float[] array) {
        this.validateIsFloat32();
        this.copyTo(array, Element$DataType.FLOAT_32, array.length);
    }
    
    public void copyTo(final int[] array) {
        this.validateIsInt32();
        this.copyTo(array, Element$DataType.SIGNED_32, array.length);
    }
    
    public void copyTo(final short[] array) {
        this.validateIsInt16();
        this.copyTo(array, Element$DataType.SIGNED_16, array.length);
    }
    
    @Override
    public void destroy() {
        if (this.mIncCompatAllocation != 0L) {
            synchronized (this) {
                final boolean mIncAllocDestroyed = this.mIncAllocDestroyed;
                boolean b = true;
                if (!mIncAllocDestroyed) {
                    this.mIncAllocDestroyed = true;
                }
                else {
                    b = false;
                }
                monitorexit(this);
                if (b) {
                    final ReentrantReadWriteLock.ReadLock lock = this.mRS.mRWLock.readLock();
                    lock.lock();
                    if (this.mRS.isAlive()) {
                        this.mRS.nIncObjDestroy(this.mIncCompatAllocation);
                    }
                    lock.unlock();
                    this.mIncCompatAllocation = 0L;
                }
            }
        }
        if ((this.mUsage & 0x60) != 0x0) {
            this.setSurface(null);
        }
        super.destroy();
    }
    
    @Override
    protected void finalize() {
        if (RenderScript.sUseGCHooks) {
            RenderScript.registerNativeFree.invoke(RenderScript.sRuntime, this.mSize);
        }
        super.finalize();
    }
    
    public void generateMipmaps() {
        final RenderScript mrs = this.mRS;
        mrs.nAllocationGenerateMipmaps(this.getID(mrs));
    }
    
    public ByteBuffer getByteBuffer() {
        final int n = this.mType.getX() * this.mType.getElement().getBytesSize();
        if (this.mRS.getDispatchAPILevel() >= 21) {
            if (this.mByteBuffer == null || (this.mUsage & 0x20) != 0x0) {
                final RenderScript mrs = this.mRS;
                this.mByteBuffer = mrs.nAllocationGetByteBuffer(this.getID(mrs), n, this.mType.getY(), this.mType.getZ());
            }
            return this.mByteBuffer;
        }
        if (this.mType.getZ() > 0) {
            return null;
        }
        byte[] array;
        if (this.mType.getY() > 0) {
            array = new byte[this.mType.getY() * n];
            this.copy2DRangeToUnchecked(0, 0, this.mType.getX(), this.mType.getY(), array, Element$DataType.SIGNED_8, n * this.mType.getY());
        }
        else {
            array = new byte[n];
            this.copy1DRangeToUnchecked(0, this.mType.getX(), array);
        }
        final ByteBuffer readOnlyBuffer = ByteBuffer.wrap(array).asReadOnlyBuffer();
        this.mByteBufferStride = n;
        return readOnlyBuffer;
    }
    
    public int getBytesSize() {
        final Type mType = this.mType;
        if (mType.mDimYuv != 0) {
            final double n = mType.getCount() * this.mType.getElement().getBytesSize();
            Double.isNaN(n);
            return (int)Math.ceil(n * 1.5);
        }
        return mType.getCount() * this.mType.getElement().getBytesSize();
    }
    
    public Element getElement() {
        return this.mType.getElement();
    }
    
    public long getIncAllocID() {
        return this.mIncCompatAllocation;
    }
    
    public long getStride() {
        long n = this.mByteBufferStride;
        if (n == 0L) {
            if (this.mRS.getDispatchAPILevel() > 21) {
                final RenderScript mrs = this.mRS;
                n = mrs.nAllocationGetStride(this.getID(mrs));
                this.mByteBufferStride = n;
            }
            else {
                n = this.mType.getX() * this.mType.getElement().getBytesSize();
                this.mByteBufferStride = n;
            }
        }
        return n;
    }
    
    public Type getType() {
        return this.mType;
    }
    
    public int getUsage() {
        return this.mUsage;
    }
    
    public void ioReceive() {
        if ((this.mUsage & 0x20) != 0x0) {
            this.mRS.validate();
            final RenderScript mrs = this.mRS;
            mrs.nAllocationIoReceive(this.getID(mrs));
            return;
        }
        throw new RSIllegalArgumentException("Can only receive if IO_INPUT usage specified.");
    }
    
    public void ioSend() {
        if ((this.mUsage & 0x40) != 0x0) {
            this.mRS.validate();
            final RenderScript mrs = this.mRS;
            mrs.nAllocationIoSend(this.getID(mrs));
            return;
        }
        throw new RSIllegalArgumentException("Can only send buffer if IO_OUTPUT usage specified.");
    }
    
    public void ioSendOutput() {
        this.ioSend();
    }
    
    public void setAutoPadding(final boolean mAutoPadding) {
        this.mAutoPadding = mAutoPadding;
    }
    
    public void setFromFieldPacker(final int n, final int n2, final FieldPacker fieldPacker) {
        this.mRS.validate();
        if (n2 >= this.mType.mElement.mElements.length) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Component_number ");
            sb.append(n2);
            sb.append(" out of range.");
            throw new RSIllegalArgumentException(sb.toString());
        }
        if (n < 0) {
            throw new RSIllegalArgumentException("Offset must be >= 0.");
        }
        final byte[] data = fieldPacker.getData();
        final int pos = fieldPacker.getPos();
        final int n3 = this.mType.mElement.mElements[n2].getBytesSize() * this.mType.mElement.mArraySizes[n2];
        if (pos == n3) {
            this.mRS.nAllocationElementData1D(this.getIDSafe(), n, this.mSelectedLOD, n2, data, pos);
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Field packer sizelength ");
        sb2.append(pos);
        sb2.append(" does not match component size ");
        sb2.append(n3);
        sb2.append(".");
        throw new RSIllegalArgumentException(sb2.toString());
    }
    
    public void setFromFieldPacker(final int n, final FieldPacker fieldPacker) {
        this.mRS.validate();
        final int bytesSize = this.mType.mElement.getBytesSize();
        final byte[] data = fieldPacker.getData();
        final int pos = fieldPacker.getPos();
        final int n2 = pos / bytesSize;
        if (bytesSize * n2 == pos) {
            this.copy1DRangeFromUnchecked(n, n2, data);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Field packer length ");
        sb.append(pos);
        sb.append(" not divisible by element size ");
        sb.append(bytesSize);
        sb.append(".");
        throw new RSIllegalArgumentException(sb.toString());
    }
    
    public void setIncAllocID(final long mIncCompatAllocation) {
        this.mIncCompatAllocation = mIncCompatAllocation;
    }
    
    public void setSurface(final Surface surface) {
        this.mRS.validate();
        if ((this.mUsage & 0x40) != 0x0) {
            final RenderScript mrs = this.mRS;
            mrs.nAllocationSetSurface(this.getID(mrs), surface);
            return;
        }
        throw new RSInvalidStateException("Allocation is not USAGE_IO_OUTPUT.");
    }
    
    public void syncAll(final int n) {
        switch (n) {
            default: {
                throw new RSIllegalArgumentException("Source must be exactly one usage type.");
            }
            case 1:
            case 2: {
                this.mRS.validate();
                this.mRS.nAllocationSyncAll(this.getIDSafe(), n);
            }
        }
    }
}
