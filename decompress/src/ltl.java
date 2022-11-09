import android.text.TextUtils;
import android.os.Parcel;
import java.util.ArrayList;
import android.media.MediaFormat;
import java.util.Iterator;
import java.nio.charset.StandardCharsets;
import java.nio.ByteBuffer;
import java.util.List;
import java.io.FileOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ltl
{
    public static ltk a(final FileOutputStream fileOutputStream, final lto lto) {
        final ltu ltu = new ltu();
        final ltw ltw = new ltw(ltu, lto);
        final ltt ltt = new ltt();
        niz niz;
        if (lto.b) {
            niz = niz.i(5);
        }
        else {
            niz = nii.a;
        }
        final ltp ltp = new ltp(niz);
        final int d = lto.d;
        if (d != 0) {
            switch (d - 1) {
                case 0: {
                    ltp.c();
                    ltp.b("isom");
                    ltp.b("iso2");
                    ltp.b("mp41");
                    break;
                }
            }
            final lty lty = new lty(fileOutputStream, ltw, ltt, ltp);
            new lue();
            return new ltm(lty, ltu);
        }
        throw null;
    }
    
    public static int b(final long n) {
        return (int)(n / 1000L + 2082844800L);
    }
    
    static final ByteBuffer c(final List list, final List list2, final List list3) {
        final int c = ((nql)list).c;
        final int c2 = ((nql)list2).c;
        final boolean b = true;
        int i = 0;
        njo.d(c2 == c);
        njo.d(((nql)list3).c == c && b);
        final ByteBuffer allocate = ByteBuffer.allocate(200);
        allocate.putInt(0);
        allocate.putInt(c);
        while (i < c) {
            allocate.putInt(list.get(i));
            allocate.putInt(list2.get(i));
            allocate.putInt(list3.get(i));
            ++i;
        }
        allocate.flip();
        return j("elst", allocate);
    }
    
    static final ByteBuffer d(final List list) {
        final ByteBuffer allocate = ByteBuffer.allocate(200);
        int n;
        for (int i = 0; i < list.size(); i = n) {
            n = i + 1;
            final Object value = list.get(i);
            ByteBuffer byteBuffer;
            if (value instanceof String) {
                final byte[] bytes = ((String)value).getBytes(StandardCharsets.UTF_8);
                byteBuffer = ByteBuffer.allocate(bytes.length + 8);
                byteBuffer.putInt(1);
                byteBuffer.putInt(0);
                byteBuffer.put(bytes);
            }
            else {
                if (!(value instanceof Float)) {
                    final String value2 = String.valueOf(((Float)value).getClass());
                    final StringBuilder sb = new StringBuilder(String.valueOf(value2).length() + 23);
                    sb.append("Unknown metadata type: ");
                    sb.append(value2);
                    throw new IllegalArgumentException(sb.toString());
                }
                byteBuffer = ByteBuffer.allocate(12);
                byteBuffer.putInt(23);
                byteBuffer.putInt(0);
                byteBuffer.putFloat((float)value);
            }
            byteBuffer.flip();
            final ByteBuffer j = j("data", byteBuffer);
            allocate.putInt(j.remaining() + 8);
            allocate.putInt(n);
            allocate.put(j);
        }
        allocate.flip();
        return j("ilst", allocate);
    }
    
    static final ByteBuffer e(final List list) {
        final ByteBuffer allocate = ByteBuffer.allocate(200);
        allocate.putInt(0);
        allocate.putInt(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            allocate.put(j("mdta", ByteBuffer.wrap(((String)iterator.next()).getBytes(StandardCharsets.UTF_8))));
        }
        allocate.flip();
        return j("keys", allocate);
    }
    
    static final ByteBuffer f(final long n, int n2, final long n3, final niz niz) {
        final ByteBuffer allocate = ByteBuffer.allocate(200);
        allocate.putInt(0);
        allocate.putInt(b(n3));
        allocate.putInt(b(n3));
        allocate.putInt(n2);
        allocate.putInt((int)n);
        if (!niz.g()) {
            n2 = 0;
        }
        else {
            final byte[] bytes = ((String)niz.c()).getBytes(StandardCharsets.UTF_8);
            if (bytes.length != 3) {
                final String value = String.valueOf(niz);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 28);
                sb.append("Non-length-3 language code: ");
                sb.append(value);
                throw new IllegalArgumentException(sb.toString());
            }
            n2 = (bytes[2] & 0x1F) + ((bytes[1] & 0x1F) << 5) + ((bytes[0] & 0x1F) << 10);
            njo.o(true);
        }
        allocate.putShort((short)n2);
        allocate.putShort((short)0);
        allocate.flip();
        return j("mdhd", allocate);
    }
    
    static final ByteBuffer g(int integer, int integer2, final long n, final int n2, final MediaFormat mediaFormat) {
        final ByteBuffer allocate = ByteBuffer.allocate(200);
        allocate.putInt(7);
        allocate.putInt(b(n));
        allocate.putInt(b(n));
        allocate.putInt(integer);
        final int n3 = 0;
        allocate.putInt(0);
        allocate.putInt(integer2);
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.putShort((short)256);
        allocate.putShort((short)0);
        byte[] array = null;
        switch (n2) {
            default: {
                final StringBuilder sb = new StringBuilder(31);
                sb.append("invalid orientation ");
                sb.append(n2);
                throw new IllegalArgumentException(sb.toString());
            }
            case 270: {
                final byte[] array2;
                array = (array2 = new byte[36]);
                array2[1] = (array2[0] = 0);
                array2[3] = (array2[2] = 0);
                array2[5] = (array2[4] = -1);
                array2[6] = 0;
                array2[8] = (array2[7] = 0);
                array2[10] = (array2[9] = 0);
                array2[12] = (array2[11] = 0);
                array2[13] = 1;
                array2[15] = (array2[14] = 0);
                array2[17] = (array2[16] = 0);
                array2[19] = (array2[18] = 0);
                array2[21] = (array2[20] = 0);
                array2[23] = (array2[22] = 0);
                array2[25] = (array2[24] = 0);
                array2[27] = (array2[26] = 0);
                array2[29] = (array2[28] = 0);
                array2[31] = (array2[30] = 0);
                array2[32] = 64;
                array2[33] = 0;
                array2[35] = (array2[34] = 0);
                break;
            }
            case 180: {
                final byte[] array3;
                array = (array3 = new byte[36]);
                array3[1] = (array3[0] = -1);
                array3[3] = (array3[2] = 0);
                array3[5] = (array3[4] = 0);
                array3[7] = (array3[6] = 0);
                array3[9] = (array3[8] = 0);
                array3[11] = (array3[10] = 0);
                array3[13] = (array3[12] = 0);
                array3[15] = (array3[14] = 0);
                array3[17] = (array3[16] = -1);
                array3[19] = (array3[18] = 0);
                array3[21] = (array3[20] = 0);
                array3[23] = (array3[22] = 0);
                array3[25] = (array3[24] = 0);
                array3[27] = (array3[26] = 0);
                array3[29] = (array3[28] = 0);
                array3[31] = (array3[30] = 0);
                array3[32] = 64;
                array3[33] = 0;
                array3[35] = (array3[34] = 0);
                break;
            }
            case 90: {
                final byte[] array4;
                array = (array4 = new byte[36]);
                array4[0] = 0;
                array4[2] = (array4[1] = 0);
                array4[4] = (array4[3] = 0);
                array4[5] = 1;
                array4[7] = (array4[6] = 0);
                array4[9] = (array4[8] = 0);
                array4[11] = (array4[10] = 0);
                array4[13] = (array4[12] = -1);
                array4[15] = (array4[14] = 0);
                array4[17] = (array4[16] = 0);
                array4[19] = (array4[18] = 0);
                array4[21] = (array4[20] = 0);
                array4[23] = (array4[22] = 0);
                array4[25] = (array4[24] = 0);
                array4[27] = (array4[26] = 0);
                array4[29] = (array4[28] = 0);
                array4[31] = (array4[30] = 0);
                array4[32] = 64;
                array4[33] = 0;
                array4[35] = (array4[34] = 0);
                break;
            }
            case 0: {
                final byte[] array5;
                array = (array5 = new byte[36]);
                array5[0] = 0;
                array5[1] = 1;
                array5[2] = 0;
                array5[4] = (array5[3] = 0);
                array5[6] = (array5[5] = 0);
                array5[8] = (array5[7] = 0);
                array5[10] = (array5[9] = 0);
                array5[12] = (array5[11] = 0);
                array5[14] = (array5[13] = 0);
                array5[16] = (array5[15] = 0);
                array5[17] = 1;
                array5[19] = (array5[18] = 0);
                array5[21] = (array5[20] = 0);
                array5[23] = (array5[22] = 0);
                array5[25] = (array5[24] = 0);
                array5[27] = (array5[26] = 0);
                array5[29] = (array5[28] = 0);
                array5[31] = (array5[30] = 0);
                array5[32] = 64;
                array5[33] = 0;
                array5[35] = (array5[34] = 0);
                break;
            }
        }
        allocate.put(array);
        if (mediaFormat.containsKey("width")) {
            integer = mediaFormat.getInteger("width");
        }
        else {
            integer = 0;
        }
        if (mediaFormat.containsKey("height")) {
            integer2 = mediaFormat.getInteger("height");
        }
        else {
            integer2 = n3;
        }
        allocate.putInt(integer << 16);
        allocate.putInt(integer2 << 16);
        allocate.flip();
        return j("tkhd", allocate);
    }
    
    static final ByteBuffer h(final ltx ltx) {
        final ByteBuffer allocate = ByteBuffer.allocate(200);
        allocate.putInt(0);
        allocate.putInt(0);
        if (lue.e(ltx.a)) {
            allocate.put("vide".getBytes(StandardCharsets.UTF_8));
            allocate.putInt(0);
            allocate.putInt(0);
            allocate.putInt(0);
            allocate.put("VideoHandle".getBytes(StandardCharsets.UTF_8));
        }
        else if (lue.d(ltx.a)) {
            allocate.put("soun".getBytes(StandardCharsets.UTF_8));
            allocate.putInt(0);
            allocate.putInt(0);
            allocate.putInt(0);
            allocate.put("SoundHandle".getBytes(StandardCharsets.UTF_8));
        }
        else {
            allocate.put("meta".getBytes(StandardCharsets.UTF_8));
            allocate.putInt(0);
            allocate.putInt(0);
            allocate.putInt(0);
            allocate.put("MetaHandle".getBytes(StandardCharsets.UTF_8));
        }
        allocate.put((byte)0);
        allocate.flip();
        return j("hdlr", allocate);
    }
    
    static ByteBuffer i(final String s, final List list) {
        final Iterator iterator = list.iterator();
        int n = 8;
        while (iterator.hasNext()) {
            n += ((ByteBuffer)iterator.next()).limit();
        }
        final ByteBuffer allocate = ByteBuffer.allocate(n);
        allocate.putInt(n);
        allocate.put(s.getBytes(StandardCharsets.UTF_8), 0, 4);
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            allocate.put((ByteBuffer)iterator2.next());
        }
        allocate.flip();
        return allocate;
    }
    
    static ByteBuffer j(final String s, final ByteBuffer byteBuffer) {
        return k(s.getBytes(StandardCharsets.UTF_8), byteBuffer);
    }
    
    static ByteBuffer k(final byte[] array, final ByteBuffer byteBuffer) {
        final ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit() + 8);
        allocate.putInt(byteBuffer.limit() + 8);
        allocate.put(array, 0, 4);
        allocate.put(byteBuffer);
        allocate.flip();
        return allocate;
    }
    
    static final ByteBuffer l(final MediaFormat mediaFormat) {
        final String string = mediaFormat.getString("mime");
        int n = 0;
        Label_0052: {
            switch (string.hashCode()) {
                case -53558318: {
                    if (string.equals("audio/mp4a-latm")) {
                        n = 0;
                        break Label_0052;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                final String value = String.valueOf(mediaFormat.getString("mime"));
                String concat;
                if (value.length() != 0) {
                    concat = "Unsupported audio format: ".concat(value);
                }
                else {
                    concat = new String("Unsupported audio format: ");
                }
                throw new UnsupportedOperationException(concat);
            }
            case 0: {
                final ByteBuffer allocate = ByteBuffer.allocate(mediaFormat.getByteBuffer("csd-0").limit() + 200);
                allocate.putInt(0);
                allocate.putShort((short)0);
                allocate.putShort((short)1);
                allocate.putInt(0);
                allocate.putInt(0);
                allocate.putShort((short)mediaFormat.getInteger("channel-count"));
                allocate.putShort((short)16);
                allocate.putShort((short)0);
                allocate.putShort((short)0);
                allocate.putInt(mediaFormat.getInteger("sample-rate") << 16);
                final ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                final int limit = byteBuffer.limit();
                final ByteBuffer allocate2 = ByteBuffer.allocate(limit + 200);
                allocate2.putInt(0);
                allocate2.put((byte)3);
                njo.e(limit + 21 < 127, "CSD too long; we might need variable-length encoding?");
                allocate2.put((byte)(limit + 23));
                allocate2.putShort((short)0);
                allocate2.put((byte)0);
                allocate2.put((byte)4);
                allocate2.put((byte)(limit + 15));
                allocate2.put((byte)64);
                allocate2.put((byte)21);
                allocate2.putShort((short)3);
                allocate2.put((byte)0);
                allocate2.putInt(mediaFormat.getInteger("max-bitrate"));
                allocate2.putInt(mediaFormat.getInteger("bitrate"));
                allocate2.put((byte)5);
                allocate2.put((byte)limit);
                allocate2.put(byteBuffer);
                byteBuffer.rewind();
                allocate2.put((byte)6);
                allocate2.put((byte)1);
                allocate2.put((byte)2);
                allocate2.flip();
                allocate.put(j("esds", allocate2));
                allocate.flip();
                return j("mp4a", allocate);
            }
        }
    }
    
    public static final String[] m(final ArrayList list) {
        return list.toArray(new String[0]);
    }
    
    public static void n(final jxs jxs) {
        if (!(boolean)jxz.c.a()) {
            return;
        }
        final Parcel obtain = Parcel.obtain();
        jxt.a(jxs, obtain, 0);
        final int dataSize = obtain.dataSize();
        obtain.recycle();
        if (dataSize <= (int)jxz.b.a()) {
            return;
        }
        final String value = String.valueOf(jxz.b.a());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 104);
        sb.append("Max allowed feedback options size of ");
        sb.append(value);
        sb.append(" exceeded, you are passing in feedback options of ");
        sb.append(dataSize);
        sb.append(" size.");
        throw new IllegalStateException(sb.toString());
    }
    
    public static final jxs o(final jxr jxr) {
        jvu.a(jxr.d.crashInfo.exceptionClassName);
        jvu.a(jxr.d.crashInfo.throwClassName);
        jvu.a(jxr.d.crashInfo.throwMethodName);
        jvu.a(jxr.d.crashInfo.stackTrace);
        if (TextUtils.isEmpty((CharSequence)jxr.d.crashInfo.throwFileName)) {
            jxr.d.crashInfo.throwFileName = "unknown";
        }
        final jxs a = jxr.a();
        a.d.crashInfo = jxr.d.crashInfo;
        a.g = null;
        return a;
    }
}
