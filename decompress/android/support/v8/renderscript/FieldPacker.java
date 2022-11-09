// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

import android.util.Log;
import java.util.BitSet;

public class FieldPacker
{
    private BitSet mAlignment;
    private byte[] mData;
    private int mLen;
    private int mPos;
    
    public FieldPacker(final int mLen) {
        this.mPos = 0;
        this.mLen = mLen;
        this.mData = new byte[mLen];
        this.mAlignment = new BitSet();
    }
    
    public FieldPacker(final byte[] mData) {
        final int length = mData.length;
        this.mPos = length;
        this.mLen = length;
        this.mData = mData;
        this.mAlignment = new BitSet();
    }
    
    private void addSafely(final Object o) {
        final int mPos = this.mPos;
        while (true) {
            try {
                addToPack(this, o);
            }
            catch (final ArrayIndexOutOfBoundsException ex) {
                this.mPos = mPos;
                final int mLen = this.mLen;
                this.resize(mLen + mLen);
                continue;
            }
            break;
        }
    }
    
    private static void addToPack(final FieldPacker fieldPacker, final Object o) {
        if (o instanceof Boolean) {
            fieldPacker.addBoolean((boolean)o);
            return;
        }
        if (o instanceof Byte) {
            fieldPacker.addI8((byte)o);
            return;
        }
        if (o instanceof Short) {
            fieldPacker.addI16((short)o);
            return;
        }
        if (o instanceof Integer) {
            fieldPacker.addI32((int)o);
            return;
        }
        if (o instanceof Long) {
            fieldPacker.addI64((long)o);
            return;
        }
        if (o instanceof Float) {
            fieldPacker.addF32((float)o);
            return;
        }
        if (o instanceof Double) {
            fieldPacker.addF64((double)o);
            return;
        }
        if (o instanceof Byte2) {
            fieldPacker.addI8((Byte2)o);
            return;
        }
        if (o instanceof Byte3) {
            fieldPacker.addI8((Byte3)o);
            return;
        }
        if (o instanceof Byte4) {
            fieldPacker.addI8((Byte4)o);
            return;
        }
        if (o instanceof Short2) {
            fieldPacker.addI16((Short2)o);
            return;
        }
        if (o instanceof Short3) {
            fieldPacker.addI16((Short3)o);
            return;
        }
        if (o instanceof Short4) {
            fieldPacker.addI16((Short4)o);
            return;
        }
        if (o instanceof Int2) {
            fieldPacker.addI32((Int2)o);
            return;
        }
        if (o instanceof Int3) {
            fieldPacker.addI32((Int3)o);
            return;
        }
        if (o instanceof Int4) {
            fieldPacker.addI32((Int4)o);
            return;
        }
        if (o instanceof Long2) {
            fieldPacker.addI64((Long2)o);
            return;
        }
        if (o instanceof Long3) {
            fieldPacker.addI64((Long3)o);
            return;
        }
        if (o instanceof Long4) {
            fieldPacker.addI64((Long4)o);
            return;
        }
        if (o instanceof Float2) {
            fieldPacker.addF32((Float2)o);
            return;
        }
        if (o instanceof Float3) {
            fieldPacker.addF32((Float3)o);
            return;
        }
        if (o instanceof Float4) {
            fieldPacker.addF32((Float4)o);
            return;
        }
        if (o instanceof Double2) {
            fieldPacker.addF64((Double2)o);
            return;
        }
        if (o instanceof Double3) {
            fieldPacker.addF64((Double3)o);
            return;
        }
        if (o instanceof Double4) {
            fieldPacker.addF64((Double4)o);
            return;
        }
        if (o instanceof Matrix2f) {
            fieldPacker.addMatrix((Matrix2f)o);
            return;
        }
        if (o instanceof Matrix3f) {
            fieldPacker.addMatrix((Matrix3f)o);
            return;
        }
        if (o instanceof Matrix4f) {
            fieldPacker.addMatrix((Matrix4f)o);
            return;
        }
        if (o instanceof BaseObj) {
            fieldPacker.addObj((BaseObj)o);
        }
    }
    
    static FieldPacker createFieldPack(final Object[] array) {
        final int length = array.length;
        final int n = 0;
        int i = 0;
        int n2 = 0;
        while (i < length) {
            n2 += getPackedSize(array[i]);
            ++i;
        }
        final FieldPacker fieldPacker = new FieldPacker(n2);
        for (int length2 = array.length, j = n; j < length2; ++j) {
            addToPack(fieldPacker, array[j]);
        }
        return fieldPacker;
    }
    
    static FieldPacker createFromArray(final Object[] array) {
        final FieldPacker fieldPacker = new FieldPacker(RenderScript.sPointerSize * 8);
        for (int length = array.length, i = 0; i < length; ++i) {
            fieldPacker.addSafely(array[i]);
        }
        fieldPacker.resize(fieldPacker.mPos);
        return fieldPacker;
    }
    
    private static int getPackedSize(final Object o) {
        if (o instanceof Boolean) {
            return 1;
        }
        if (o instanceof Byte) {
            return 1;
        }
        if (o instanceof Short) {
            return 2;
        }
        if (o instanceof Integer) {
            return 4;
        }
        if (o instanceof Long) {
            return 8;
        }
        if (o instanceof Float) {
            return 4;
        }
        if (o instanceof Double) {
            return 8;
        }
        if (o instanceof Byte2) {
            return 2;
        }
        if (o instanceof Byte3) {
            return 3;
        }
        if (o instanceof Byte4) {
            return 4;
        }
        if (o instanceof Short2) {
            return 4;
        }
        if (o instanceof Short3) {
            return 6;
        }
        if (o instanceof Short4) {
            return 8;
        }
        if (o instanceof Int2) {
            return 8;
        }
        if (o instanceof Int3) {
            return 12;
        }
        if (o instanceof Int4) {
            return 16;
        }
        if (o instanceof Long2) {
            return 16;
        }
        if (o instanceof Long3) {
            return 24;
        }
        if (o instanceof Long4) {
            return 32;
        }
        if (o instanceof Float2) {
            return 8;
        }
        if (o instanceof Float3) {
            return 12;
        }
        if (o instanceof Float4) {
            return 16;
        }
        if (o instanceof Double2) {
            return 16;
        }
        if (o instanceof Double3) {
            return 24;
        }
        if (o instanceof Double4) {
            return 32;
        }
        if (o instanceof Matrix2f) {
            return 16;
        }
        if (o instanceof Matrix3f) {
            return 36;
        }
        if (o instanceof Matrix4f) {
            return 64;
        }
        if (!(o instanceof BaseObj)) {
            return 0;
        }
        if (RenderScript.sPointerSize == 8) {
            return 32;
        }
        return 4;
    }
    
    private boolean resize(final int mLen) {
        if (mLen == this.mLen) {
            return false;
        }
        final byte[] mData = new byte[mLen];
        System.arraycopy(this.mData, 0, mData, 0, this.mPos);
        this.mData = mData;
        this.mLen = mLen;
        return true;
    }
    
    public void addBoolean(final boolean b) {
        this.addI8((byte)(b ? 1 : 0));
    }
    
    public void addF32(final float n) {
        this.addI32(Float.floatToRawIntBits(n));
    }
    
    public void addF32(final Float2 float2) {
        this.addF32(float2.x);
        this.addF32(float2.y);
    }
    
    public void addF32(final Float3 float3) {
        this.addF32(float3.x);
        this.addF32(float3.y);
        this.addF32(float3.z);
    }
    
    public void addF32(final Float4 float4) {
        this.addF32(float4.x);
        this.addF32(float4.y);
        this.addF32(float4.z);
        this.addF32(float4.w);
    }
    
    public void addF64(final double n) {
        this.addI64(Double.doubleToRawLongBits(n));
    }
    
    public void addF64(final Double2 double2) {
        this.addF64(double2.x);
        this.addF64(double2.y);
    }
    
    public void addF64(final Double3 double3) {
        this.addF64(double3.x);
        this.addF64(double3.y);
        this.addF64(double3.z);
    }
    
    public void addF64(final Double4 double4) {
        this.addF64(double4.x);
        this.addF64(double4.y);
        this.addF64(double4.z);
        this.addF64(double4.w);
    }
    
    public void addI16(final Short2 short2) {
        this.addI16(short2.x);
        this.addI16(short2.y);
    }
    
    public void addI16(final Short3 short3) {
        this.addI16(short3.x);
        this.addI16(short3.y);
        this.addI16(short3.z);
    }
    
    public void addI16(final Short4 short4) {
        this.addI16(short4.x);
        this.addI16(short4.y);
        this.addI16(short4.z);
        this.addI16(short4.w);
    }
    
    public void addI16(final short n) {
        this.align(2);
        final byte[] mData = this.mData;
        final int mPos = this.mPos;
        final int mPos2 = mPos + 1;
        this.mPos = mPos2;
        mData[mPos] = (byte)(n & 0xFF);
        this.mPos = mPos2 + 1;
        mData[mPos2] = (byte)(n >> 8);
    }
    
    public void addI32(final int n) {
        this.align(4);
        final byte[] mData = this.mData;
        final int mPos = this.mPos;
        final int mPos2 = mPos + 1;
        this.mPos = mPos2;
        mData[mPos] = (byte)(n & 0xFF);
        final int mPos3 = mPos2 + 1;
        this.mPos = mPos3;
        mData[mPos2] = (byte)(n >> 8 & 0xFF);
        final int mPos4 = mPos3 + 1;
        this.mPos = mPos4;
        mData[mPos3] = (byte)(n >> 16 & 0xFF);
        this.mPos = mPos4 + 1;
        mData[mPos4] = (byte)(n >> 24 & 0xFF);
    }
    
    public void addI32(final Int2 int2) {
        this.addI32(int2.x);
        this.addI32(int2.y);
    }
    
    public void addI32(final Int3 int3) {
        this.addI32(int3.x);
        this.addI32(int3.y);
        this.addI32(int3.z);
    }
    
    public void addI32(final Int4 int4) {
        this.addI32(int4.x);
        this.addI32(int4.y);
        this.addI32(int4.z);
        this.addI32(int4.w);
    }
    
    public void addI64(final long n) {
        this.align(8);
        final byte[] mData = this.mData;
        final int mPos = this.mPos;
        final int mPos2 = mPos + 1;
        this.mPos = mPos2;
        mData[mPos] = (byte)(n & 0xFFL);
        final int mPos3 = mPos2 + 1;
        this.mPos = mPos3;
        mData[mPos2] = (byte)(n >> 8 & 0xFFL);
        final int mPos4 = mPos3 + 1;
        this.mPos = mPos4;
        mData[mPos3] = (byte)(n >> 16 & 0xFFL);
        final int mPos5 = mPos4 + 1;
        this.mPos = mPos5;
        mData[mPos4] = (byte)(n >> 24 & 0xFFL);
        final int mPos6 = mPos5 + 1;
        this.mPos = mPos6;
        mData[mPos5] = (byte)(n >> 32 & 0xFFL);
        final int mPos7 = mPos6 + 1;
        this.mPos = mPos7;
        mData[mPos6] = (byte)(n >> 40 & 0xFFL);
        final int mPos8 = mPos7 + 1;
        this.mPos = mPos8;
        mData[mPos7] = (byte)(n >> 48 & 0xFFL);
        this.mPos = mPos8 + 1;
        mData[mPos8] = (byte)(n >> 56 & 0xFFL);
    }
    
    public void addI64(final Long2 long2) {
        this.addI64(long2.x);
        this.addI64(long2.y);
    }
    
    public void addI64(final Long3 long3) {
        this.addI64(long3.x);
        this.addI64(long3.y);
        this.addI64(long3.z);
    }
    
    public void addI64(final Long4 long4) {
        this.addI64(long4.x);
        this.addI64(long4.y);
        this.addI64(long4.z);
        this.addI64(long4.w);
    }
    
    public void addI8(final byte b) {
        this.mData[this.mPos++] = b;
    }
    
    public void addI8(final Byte2 byte2) {
        this.addI8(byte2.x);
        this.addI8(byte2.y);
    }
    
    public void addI8(final Byte3 byte3) {
        this.addI8(byte3.x);
        this.addI8(byte3.y);
        this.addI8(byte3.z);
    }
    
    public void addI8(final Byte4 byte4) {
        this.addI8(byte4.x);
        this.addI8(byte4.y);
        this.addI8(byte4.z);
        this.addI8(byte4.w);
    }
    
    public void addMatrix(final Matrix2f matrix2f) {
        int n = 0;
        while (true) {
            final float[] mMat = matrix2f.mMat;
            if (n >= mMat.length) {
                break;
            }
            this.addF32(mMat[n]);
            ++n;
        }
    }
    
    public void addMatrix(final Matrix3f matrix3f) {
        int n = 0;
        while (true) {
            final float[] mMat = matrix3f.mMat;
            if (n >= mMat.length) {
                break;
            }
            this.addF32(mMat[n]);
            ++n;
        }
    }
    
    public void addMatrix(final Matrix4f matrix4f) {
        int n = 0;
        while (true) {
            final float[] mMat = matrix4f.mMat;
            if (n >= mMat.length) {
                break;
            }
            this.addF32(mMat[n]);
            ++n;
        }
    }
    
    public void addObj(final BaseObj baseObj) {
        if (baseObj != null) {
            if (RenderScript.sPointerSize == 8) {
                this.addI64(baseObj.getID(null));
                this.addI64(0L);
                this.addI64(0L);
                this.addI64(0L);
                return;
            }
            this.addI32((int)baseObj.getID(null));
        }
        else {
            if (RenderScript.sPointerSize == 8) {
                this.addI64(0L);
                this.addI64(0L);
                this.addI64(0L);
                this.addI64(0L);
                return;
            }
            this.addI32(0);
        }
    }
    
    public void addU16(final int n) {
        if (n >= 0 && n <= 65535) {
            this.align(2);
            final byte[] mData = this.mData;
            final int mPos = this.mPos;
            final int mPos2 = mPos + 1;
            this.mPos = mPos2;
            mData[mPos] = (byte)(n & 0xFF);
            this.mPos = mPos2 + 1;
            mData[mPos2] = (byte)(n >> 8);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("FieldPacker.addU16( ");
        sb.append(n);
        sb.append(" )");
        Log.e("rs", sb.toString());
        throw new IllegalArgumentException("Saving value out of range for type");
    }
    
    public void addU16(final Int2 int2) {
        this.addU16(int2.x);
        this.addU16(int2.y);
    }
    
    public void addU16(final Int3 int3) {
        this.addU16(int3.x);
        this.addU16(int3.y);
        this.addU16(int3.z);
    }
    
    public void addU16(final Int4 int4) {
        this.addU16(int4.x);
        this.addU16(int4.y);
        this.addU16(int4.z);
        this.addU16(int4.w);
    }
    
    public void addU32(final long n) {
        if (n >= 0L && n <= 4294967295L) {
            this.align(4);
            final byte[] mData = this.mData;
            final int mPos = this.mPos;
            final int mPos2 = mPos + 1;
            this.mPos = mPos2;
            mData[mPos] = (byte)(n & 0xFFL);
            final int mPos3 = mPos2 + 1;
            this.mPos = mPos3;
            mData[mPos2] = (byte)(n >> 8 & 0xFFL);
            final int mPos4 = mPos3 + 1;
            this.mPos = mPos4;
            mData[mPos3] = (byte)(n >> 16 & 0xFFL);
            this.mPos = mPos4 + 1;
            mData[mPos4] = (byte)(n >> 24 & 0xFFL);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("FieldPacker.addU32( ");
        sb.append(n);
        sb.append(" )");
        Log.e("rs", sb.toString());
        throw new IllegalArgumentException("Saving value out of range for type");
    }
    
    public void addU32(final Long2 long2) {
        this.addU32(long2.x);
        this.addU32(long2.y);
    }
    
    public void addU32(final Long3 long3) {
        this.addU32(long3.x);
        this.addU32(long3.y);
        this.addU32(long3.z);
    }
    
    public void addU32(final Long4 long4) {
        this.addU32(long4.x);
        this.addU32(long4.y);
        this.addU32(long4.z);
        this.addU32(long4.w);
    }
    
    public void addU64(final long n) {
        if (n >= 0L) {
            this.align(8);
            final byte[] mData = this.mData;
            final int mPos = this.mPos;
            final int mPos2 = mPos + 1;
            this.mPos = mPos2;
            mData[mPos] = (byte)(n & 0xFFL);
            final int mPos3 = mPos2 + 1;
            this.mPos = mPos3;
            mData[mPos2] = (byte)(n >> 8 & 0xFFL);
            final int mPos4 = mPos3 + 1;
            this.mPos = mPos4;
            mData[mPos3] = (byte)(n >> 16 & 0xFFL);
            final int mPos5 = mPos4 + 1;
            this.mPos = mPos5;
            mData[mPos4] = (byte)(n >> 24 & 0xFFL);
            final int mPos6 = mPos5 + 1;
            this.mPos = mPos6;
            mData[mPos5] = (byte)(n >> 32 & 0xFFL);
            final int mPos7 = mPos6 + 1;
            this.mPos = mPos7;
            mData[mPos6] = (byte)(n >> 40 & 0xFFL);
            final int mPos8 = mPos7 + 1;
            this.mPos = mPos8;
            mData[mPos7] = (byte)(n >> 48 & 0xFFL);
            this.mPos = mPos8 + 1;
            mData[mPos8] = (byte)(n >> 56 & 0xFFL);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("FieldPacker.addU64( ");
        sb.append(n);
        sb.append(" )");
        Log.e("rs", sb.toString());
        throw new IllegalArgumentException("Saving value out of range for type");
    }
    
    public void addU64(final Long2 long2) {
        this.addU64(long2.x);
        this.addU64(long2.y);
    }
    
    public void addU64(final Long3 long3) {
        this.addU64(long3.x);
        this.addU64(long3.y);
        this.addU64(long3.z);
    }
    
    public void addU64(final Long4 long4) {
        this.addU64(long4.x);
        this.addU64(long4.y);
        this.addU64(long4.z);
        this.addU64(long4.w);
    }
    
    public void addU8(final Short2 short2) {
        this.addU8(short2.x);
        this.addU8(short2.y);
    }
    
    public void addU8(final Short3 short3) {
        this.addU8(short3.x);
        this.addU8(short3.y);
        this.addU8(short3.z);
    }
    
    public void addU8(final Short4 short4) {
        this.addU8(short4.x);
        this.addU8(short4.y);
        this.addU8(short4.z);
        this.addU8(short4.w);
    }
    
    public void addU8(final short n) {
        if (n >= 0 && n <= 255) {
            this.mData[this.mPos++] = (byte)n;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("FieldPacker.addU8( ");
        sb.append(n);
        sb.append(" )");
        Log.e("rs", sb.toString());
        throw new IllegalArgumentException("Saving value out of range for type");
    }
    
    public void align(int mPos) {
        if (mPos > 0) {
            final int n = mPos - 1;
            if ((mPos & n) == 0x0) {
                while (true) {
                    mPos = this.mPos;
                    if ((mPos & n) == 0x0) {
                        break;
                    }
                    this.mAlignment.flip(mPos);
                    final byte[] mData = this.mData;
                    mPos = this.mPos++;
                    mData[mPos] = 0;
                }
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("argument must be a non-negative non-zero power of 2: ");
        sb.append(mPos);
        throw new RSIllegalArgumentException(sb.toString());
    }
    
    public final byte[] getData() {
        return this.mData;
    }
    
    public int getPos() {
        return this.mPos;
    }
    
    public void reset() {
        this.mPos = 0;
    }
    
    public void reset(final int mPos) {
        if (mPos >= 0 && mPos <= this.mLen) {
            this.mPos = mPos;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("out of range argument: ");
        sb.append(mPos);
        throw new RSIllegalArgumentException(sb.toString());
    }
    
    public void skip(final int n) {
        final int mPos = this.mPos + n;
        if (mPos >= 0 && mPos <= this.mLen) {
            this.mPos = mPos;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("out of range argument: ");
        sb.append(n);
        throw new RSIllegalArgumentException(sb.toString());
    }
    
    public boolean subBoolean() {
        return this.subI8() == 1;
    }
    
    public Byte2 subByte2() {
        final Byte2 byte2 = new Byte2();
        byte2.y = this.subI8();
        byte2.x = this.subI8();
        return byte2;
    }
    
    public Byte3 subByte3() {
        final Byte3 byte3 = new Byte3();
        byte3.z = this.subI8();
        byte3.y = this.subI8();
        byte3.x = this.subI8();
        return byte3;
    }
    
    public Byte4 subByte4() {
        final Byte4 byte4 = new Byte4();
        byte4.w = this.subI8();
        byte4.z = this.subI8();
        byte4.y = this.subI8();
        byte4.x = this.subI8();
        return byte4;
    }
    
    public Double2 subDouble2() {
        final Double2 double2 = new Double2();
        double2.y = this.subF64();
        double2.x = this.subF64();
        return double2;
    }
    
    public Double3 subDouble3() {
        final Double3 double3 = new Double3();
        double3.z = this.subF64();
        double3.y = this.subF64();
        double3.x = this.subF64();
        return double3;
    }
    
    public Double4 subDouble4() {
        final Double4 double4 = new Double4();
        double4.w = this.subF64();
        double4.z = this.subF64();
        double4.y = this.subF64();
        double4.x = this.subF64();
        return double4;
    }
    
    public float subF32() {
        return Float.intBitsToFloat(this.subI32());
    }
    
    public double subF64() {
        return Double.longBitsToDouble(this.subI64());
    }
    
    public Float2 subFloat2() {
        final Float2 float2 = new Float2();
        float2.y = this.subF32();
        float2.x = this.subF32();
        return float2;
    }
    
    public Float3 subFloat3() {
        final Float3 float3 = new Float3();
        float3.z = this.subF32();
        float3.y = this.subF32();
        float3.x = this.subF32();
        return float3;
    }
    
    public Float4 subFloat4() {
        final Float4 float4 = new Float4();
        float4.w = this.subF32();
        float4.z = this.subF32();
        float4.y = this.subF32();
        float4.x = this.subF32();
        return float4;
    }
    
    public short subI16() {
        this.subalign(2);
        final byte[] mData = this.mData;
        int n = this.mPos - 1;
        this.mPos = n;
        final byte b = mData[n];
        --n;
        this.mPos = n;
        return (short)((mData[n] & 0xFF) | (short)((b & 0xFF) << 8));
    }
    
    public int subI32() {
        this.subalign(4);
        final byte[] mData = this.mData;
        final int mPos = this.mPos - 1;
        this.mPos = mPos;
        final byte b = mData[mPos];
        final int mPos2 = mPos - 1;
        this.mPos = mPos2;
        final byte b2 = mData[mPos2];
        int n = mPos2 - 1;
        this.mPos = n;
        final byte b3 = mData[n];
        --n;
        this.mPos = n;
        return (mData[n] & 0xFF) | ((b & 0xFF) << 24 | (b2 & 0xFF) << 16 | (b3 & 0xFF) << 8);
    }
    
    public long subI64() {
        this.subalign(8);
        final byte[] mData = this.mData;
        final int mPos = this.mPos - 1;
        this.mPos = mPos;
        final byte b = mData[mPos];
        final int mPos2 = mPos - 1;
        this.mPos = mPos2;
        final byte b2 = mData[mPos2];
        final int mPos3 = mPos2 - 1;
        this.mPos = mPos3;
        final byte b3 = mData[mPos3];
        final int mPos4 = mPos3 - 1;
        this.mPos = mPos4;
        final byte b4 = mData[mPos4];
        final int mPos5 = mPos4 - 1;
        this.mPos = mPos5;
        final byte b5 = mData[mPos5];
        final int mPos6 = mPos5 - 1;
        this.mPos = mPos6;
        final byte b6 = mData[mPos6];
        int n = mPos6 - 1;
        this.mPos = n;
        final byte b7 = mData[n];
        --n;
        this.mPos = n;
        return ((long)mData[n] & 0xFFL) | (((long)b2 & 0xFFL) << 48 | ((long)b & 0xFFL) << 56 | ((long)b3 & 0xFFL) << 40 | ((long)b4 & 0xFFL) << 32 | ((long)b5 & 0xFFL) << 24 | ((long)b6 & 0xFFL) << 16 | ((long)b7 & 0xFFL) << 8);
    }
    
    public byte subI8() {
        this.subalign(1);
        final byte[] mData = this.mData;
        final int mPos = this.mPos - 1;
        this.mPos = mPos;
        return mData[mPos];
    }
    
    public Int2 subInt2() {
        final Int2 int2 = new Int2();
        int2.y = this.subI32();
        int2.x = this.subI32();
        return int2;
    }
    
    public Int3 subInt3() {
        final Int3 int3 = new Int3();
        int3.z = this.subI32();
        int3.y = this.subI32();
        int3.x = this.subI32();
        return int3;
    }
    
    public Int4 subInt4() {
        final Int4 int4 = new Int4();
        int4.w = this.subI32();
        int4.z = this.subI32();
        int4.y = this.subI32();
        int4.x = this.subI32();
        return int4;
    }
    
    public Long2 subLong2() {
        final Long2 long2 = new Long2();
        long2.y = this.subI64();
        long2.x = this.subI64();
        return long2;
    }
    
    public Long3 subLong3() {
        final Long3 long3 = new Long3();
        long3.z = this.subI64();
        long3.y = this.subI64();
        long3.x = this.subI64();
        return long3;
    }
    
    public Long4 subLong4() {
        final Long4 long4 = new Long4();
        long4.w = this.subI64();
        long4.z = this.subI64();
        long4.y = this.subI64();
        long4.x = this.subI64();
        return long4;
    }
    
    public Matrix2f subMatrix2f() {
        final Matrix2f matrix2f = new Matrix2f();
        for (int i = matrix2f.mMat.length - 1; i >= 0; --i) {
            matrix2f.mMat[i] = this.subF32();
        }
        return matrix2f;
    }
    
    public Matrix3f subMatrix3f() {
        final Matrix3f matrix3f = new Matrix3f();
        for (int i = matrix3f.mMat.length - 1; i >= 0; --i) {
            matrix3f.mMat[i] = this.subF32();
        }
        return matrix3f;
    }
    
    public Matrix4f subMatrix4f() {
        final Matrix4f matrix4f = new Matrix4f();
        for (int i = matrix4f.mMat.length - 1; i >= 0; --i) {
            matrix4f.mMat[i] = this.subF32();
        }
        return matrix4f;
    }
    
    public Short2 subShort2() {
        final Short2 short2 = new Short2();
        short2.y = this.subI16();
        short2.x = this.subI16();
        return short2;
    }
    
    public Short3 subShort3() {
        final Short3 short3 = new Short3();
        short3.z = this.subI16();
        short3.y = this.subI16();
        short3.x = this.subI16();
        return short3;
    }
    
    public Short4 subShort4() {
        final Short4 short4 = new Short4();
        short4.w = this.subI16();
        short4.z = this.subI16();
        short4.y = this.subI16();
        short4.x = this.subI16();
        return short4;
    }
    
    public void subalign(int mPos) {
        final int n = mPos - 1;
        if ((mPos & n) == 0x0) {
            while (true) {
                mPos = this.mPos;
                if ((mPos & n) == 0x0) {
                    break;
                }
                this.mPos = mPos - 1;
            }
            if (mPos > 0) {
                while (this.mAlignment.get(this.mPos - 1)) {
                    mPos = this.mPos - 1;
                    this.mPos = mPos;
                    this.mAlignment.flip(mPos);
                }
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("argument must be a non-negative non-zero power of 2: ");
        sb.append(mPos);
        throw new RSIllegalArgumentException(sb.toString());
    }
}
