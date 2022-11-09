import com.google.android.libraries.microvideo.gcamuxer.AnnexBToAvcc;
import android.util.Pair;
import android.media.MediaFormat;
import java.util.Iterator;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Arrays;
import java.util.LinkedHashMap;
import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.nio.channels.FileChannel;
import java.io.FileOutputStream;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lty implements AutoCloseable
{
    final List a;
    private FileOutputStream b;
    private FileChannel c;
    private final AtomicBoolean d;
    private long e;
    private long f;
    private long g;
    private nqe h;
    private final ltw i;
    private final ltt j;
    private final ltp k;
    
    public lty(final FileOutputStream b, final ltw i, final ltt j, final ltp k) {
        this.d = new AtomicBoolean(false);
        this.a = new ArrayList();
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        final Long value = 0L;
        this.h = nqe.e(value, value);
        this.i = i;
        this.b = b;
        this.c = b.getChannel();
        this.j = j;
        this.k = k;
    }
    
    private final ByteBuffer b() {
        final Iterator iterator = this.a.iterator();
        long min = Long.MAX_VALUE;
        while (iterator.hasNext()) {
            final ltx ltx = (ltx)iterator.next();
            if (!ltx.c.isEmpty()) {
                min = Math.min(((MediaCodec$BufferInfo)ltx.c.get(0)).presentationTimeUs, min);
            }
        }
        String s = "hdlr";
        String s4;
        ByteBuffer byteBuffer14;
        if (min != Long.MAX_VALUE) {
            final ltw i = this.i;
            final List a = this.a;
            List<ByteBuffer> list = new ArrayList<ByteBuffer>();
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i.a.c.g()) {
                linkedHashMap.put("com.android.capture.fps", i.a.c.c());
            }
            Iterator iterator2 = a.iterator();
            long max = 0L;
            int n = 1;
            while (iterator2.hasNext()) {
                final ltx ltx2 = (ltx)iterator2.next();
                List<ByteBuffer> list6;
                Iterator iterator12;
                if (!ltx2.b().isEmpty()) {
                    final MediaFormat a2 = ltx2.a;
                    niz niz;
                    if (a2.containsKey("language")) {
                        niz = niz.i(a2.getString("language"));
                    }
                    else {
                        niz = nii.a;
                    }
                    final boolean e = lue.e(ltx2.a);
                    final boolean d = lue.d(ltx2.a);
                    long presentationTimeUs = ltx2.b().get(0).presentationTimeUs;
                    ByteBuffer byteBuffer;
                    if (presentationTimeUs > min && i.b.a) {
                        final int n2 = (int)lue.b(presentationTimeUs - min, 10000L);
                        final Integer value = 0;
                        final nns n3 = nns.n(n2, value);
                        final nns n4 = nns.n(-1, value);
                        final Integer value2 = 65536;
                        byteBuffer = ltl.i("edts", Arrays.asList(ltl.c(n3, n4, nns.n(value2, value2))));
                    }
                    else {
                        byteBuffer = ByteBuffer.allocate(0);
                        presentationTimeUs = min;
                    }
                    final nns b = ltx2.b();
                    final int a3 = ltx2.a();
                    final int c = i.b.c;
                    final ArrayList list2 = new ArrayList();
                    final Iterator iterator3 = iterator2;
                    int j = 0;
                    long n5 = 0L;
                    while (j < b.size()) {
                        long n6 = b.get(j).presentationTimeUs;
                        if (j != b.size() - 1) {
                            n6 = b.get(j + 1).presentationTimeUs;
                        }
                        final long b2 = lue.b(n6 - presentationTimeUs, a3);
                        final long n7 = b2 - n5;
                        if (n7 >= 2147483647L) {
                            throw new IllegalArgumentException(String.format(Locale.US, "Timestamp delta %d doesn't fit into an int", n7));
                        }
                        list2.add(n7);
                        ++j;
                        n5 = b2;
                    }
                    final String s2 = s;
                    if (list2.size() > 2) {
                        if (c == 0) {
                            throw null;
                        }
                        switch (c - 1) {
                            case 1: {
                                njo.o((long)nov.d(list2) == 0L);
                                break;
                            }
                            case 0: {
                                list2.set(list2.size() - 1, list2.get(list2.size() - 2));
                                break;
                            }
                        }
                    }
                    final Iterator iterator4 = list2.iterator();
                    long n8 = 0L;
                    while (iterator4.hasNext()) {
                        n8 += (long)iterator4.next();
                    }
                    final long n9 = 1000000L * n8 / ltx2.a();
                    final ltu a4 = i.a;
                    final ByteBuffer g = ltl.g(n, (int)lue.b(n9, 10000L), a4.d, a4.a, a2);
                    final ByteBuffer f = ltl.f(n8, ltx2.a(), i.a.d, niz);
                    final ByteBuffer h = ltl.h(ltx2);
                    ByteBuffer byteBuffer2;
                    if (e) {
                        final ByteBuffer allocate = ByteBuffer.allocate(200);
                        allocate.putInt(0);
                        allocate.putShort((short)0);
                        allocate.putShort((short)0);
                        allocate.putShort((short)0);
                        allocate.putShort((short)0);
                        allocate.flip();
                        byteBuffer2 = ltl.j("vmhd", allocate);
                    }
                    else if (d) {
                        final ByteBuffer allocate2 = ByteBuffer.allocate(200);
                        allocate2.putInt(0);
                        allocate2.putShort((short)0);
                        allocate2.putShort((short)0);
                        allocate2.flip();
                        byteBuffer2 = ltl.j("smhd", allocate2);
                    }
                    else {
                        final ByteBuffer allocate3 = ByteBuffer.allocate(200);
                        allocate3.putInt(0);
                        allocate3.flip();
                        byteBuffer2 = ltl.j("nmhd", allocate3);
                    }
                    final ByteBuffer allocate4 = ByteBuffer.allocate(4);
                    allocate4.putInt(1);
                    allocate4.flip();
                    final ByteBuffer k = ltl.j("url ", allocate4);
                    final ByteBuffer allocate5 = ByteBuffer.allocate(8);
                    allocate5.putInt(0);
                    allocate5.putInt(1);
                    allocate5.flip();
                    final ArrayList list3 = new ArrayList();
                    list3.add(allocate5);
                    Collections.addAll(list3, k);
                    final ByteBuffer l = ltl.j("dinf", ltl.i("dref", list3));
                    ByteBuffer byteBuffer10;
                    if (e) {
                        final String string = a2.getString("mime");
                        int n10 = 0;
                        Label_1153: {
                            switch (string.hashCode()) {
                                case 1331836730: {
                                    if (string.equals("video/avc")) {
                                        n10 = 0;
                                        break Label_1153;
                                    }
                                    break;
                                }
                                case -1662541442: {
                                    if (string.equals("video/hevc")) {
                                        n10 = 1;
                                        break Label_1153;
                                    }
                                    break;
                                }
                                case -1662735862: {
                                    if (string.equals("video/av01")) {
                                        n10 = 2;
                                        break Label_1153;
                                    }
                                    break;
                                }
                            }
                            n10 = -1;
                        }
                        ByteBuffer byteBuffer4 = null;
                        switch (n10) {
                            default: {
                                final String value3 = String.valueOf(a2.getString("mime"));
                                String concat;
                                if (value3.length() != 0) {
                                    concat = "Unsupported video format: ".concat(value3);
                                }
                                else {
                                    concat = new String("Unsupported video format: ");
                                }
                                throw new UnsupportedOperationException(concat);
                            }
                            case 2: {
                                final ByteBuffer byteBuffer3 = a2.getByteBuffer("csd-0");
                                byteBuffer3.getClass();
                                byteBuffer4 = ltl.j("av1C", byteBuffer3.duplicate());
                                break;
                            }
                            case 1: {
                                final ByteBuffer byteBuffer5 = a2.getByteBuffer("csd-0");
                                byteBuffer5.getClass();
                                final ByteBuffer allocate6 = ByteBuffer.allocate(byteBuffer5.limit() + 200);
                                final List b3 = lsp.b(byteBuffer5);
                                final ArrayList list4 = new ArrayList();
                                final Iterator iterator5 = b3.iterator();
                                while (iterator5.hasNext()) {
                                    list4.add(lsp.a((ByteBuffer)iterator5.next()));
                                }
                                allocate6.put((byte)1);
                                final ByteBuffer byteBuffer6 = (ByteBuffer)list4.get(0);
                                if (byteBuffer6.get(byteBuffer6.position()) == 64) {
                                    allocate6.put(byteBuffer6.get(6));
                                    allocate6.putInt(byteBuffer6.getInt(7));
                                    allocate6.putInt(byteBuffer6.getInt(11));
                                    allocate6.putShort(byteBuffer6.getShort(15));
                                    allocate6.put(byteBuffer6.get(17));
                                    allocate6.putShort((short)(-4096));
                                    allocate6.put((byte)(-4));
                                    allocate6.put((byte)(-4));
                                    allocate6.put((byte)(-8));
                                    allocate6.put((byte)(-8));
                                    allocate6.putShort((short)0);
                                    allocate6.put((byte)15);
                                    allocate6.put((byte)b3.size());
                                    for (final ByteBuffer byteBuffer7 : b3) {
                                        allocate6.put((byte)(byteBuffer7.get(0) >> 1 & 0x3F));
                                        allocate6.putShort((short)1);
                                        allocate6.putShort((short)byteBuffer7.limit());
                                        allocate6.put(byteBuffer7);
                                    }
                                    allocate6.flip();
                                    byteBuffer4 = ltl.j("hvcC", allocate6);
                                    break;
                                }
                                throw new UnsupportedOperationException("first NALU in csr-0 is not the VPS");
                            }
                            case 0: {
                                final ByteBuffer byteBuffer8 = a2.getByteBuffer("csd-0");
                                final ByteBuffer byteBuffer9 = a2.getByteBuffer("csd-1");
                                byteBuffer8.getClass();
                                byteBuffer9.getClass();
                                final ByteBuffer allocate7 = ByteBuffer.allocate(byteBuffer8.limit() + byteBuffer9.limit() + 200);
                                allocate7.put((byte)1);
                                njo.e(byteBuffer8.limit() > 3, "SPS too small");
                                allocate7.put(byteBuffer8.get(5));
                                allocate7.put(byteBuffer8.get(6));
                                allocate7.put(byteBuffer8.get(7));
                                allocate7.put((byte)(-1));
                                allocate7.put((byte)(-31));
                                byteBuffer8.position(4);
                                allocate7.putShort((short)(byteBuffer8.limit() - 4));
                                allocate7.put(byteBuffer8);
                                byteBuffer8.rewind();
                                allocate7.put((byte)1);
                                allocate7.putShort((short)(byteBuffer9.limit() - 4));
                                byteBuffer9.position(4);
                                allocate7.put(byteBuffer9);
                                byteBuffer9.rewind();
                                allocate7.flip();
                                byteBuffer4 = ltl.j("avcC", allocate7);
                                break;
                            }
                        }
                        final String string2 = a2.getString("mime");
                        int n11 = 0;
                        Label_1949: {
                            switch (string2.hashCode()) {
                                case 1331836730: {
                                    if (string2.equals("video/avc")) {
                                        n11 = 0;
                                        break Label_1949;
                                    }
                                    break;
                                }
                                case -1662541442: {
                                    if (string2.equals("video/hevc")) {
                                        n11 = 1;
                                        break Label_1949;
                                    }
                                    break;
                                }
                                case -1662735862: {
                                    if (string2.equals("video/av01")) {
                                        n11 = 2;
                                        break Label_1949;
                                    }
                                    break;
                                }
                            }
                            n11 = -1;
                        }
                        String s3 = null;
                        switch (n11) {
                            default: {
                                final String value4 = String.valueOf(a2.getString("mime"));
                                String concat2;
                                if (value4.length() != 0) {
                                    concat2 = "Unsupported video format: ".concat(value4);
                                }
                                else {
                                    concat2 = new String("Unsupported video format: ");
                                }
                                throw new UnsupportedOperationException(concat2);
                            }
                            case 2: {
                                s3 = "av01";
                                break;
                            }
                            case 1: {
                                s3 = "hvc1";
                                break;
                            }
                            case 0: {
                                s3 = "avc1";
                                break;
                            }
                        }
                        final ByteBuffer allocate8 = ByteBuffer.allocate(byteBuffer4.limit() + 200);
                        allocate8.putInt(0);
                        allocate8.putShort((short)0);
                        allocate8.putShort((short)1);
                        allocate8.putShort((short)0);
                        allocate8.putShort((short)0);
                        allocate8.putInt(0);
                        allocate8.putInt(0);
                        allocate8.putInt(0);
                        int integer;
                        if (a2.containsKey("width")) {
                            integer = a2.getInteger("width");
                        }
                        else {
                            integer = 0;
                        }
                        int integer2;
                        if (a2.containsKey("height")) {
                            integer2 = a2.getInteger("height");
                        }
                        else {
                            integer2 = 0;
                        }
                        allocate8.putShort((short)integer);
                        allocate8.putShort((short)integer2);
                        allocate8.putInt(4718592);
                        allocate8.putInt(4718592);
                        allocate8.putInt(0);
                        allocate8.putShort((short)1);
                        allocate8.put((byte)0);
                        for (int n12 = 0; n12 < 31; ++n12) {
                            allocate8.put((byte)32);
                        }
                        allocate8.putShort((short)24);
                        allocate8.putShort((short)(-1));
                        allocate8.put(byteBuffer4);
                        final ByteBuffer allocate9 = ByteBuffer.allocate(200);
                        allocate9.putInt(65536);
                        allocate9.putInt(65536);
                        allocate9.flip();
                        allocate8.put(ltl.j("pasp", allocate9));
                        if (ltz.a(a2, "color-standard") != 0 || ltz.a(a2, "color-transfer") != 0 || ltz.a(a2, "color-range") != 0) {
                            final ByteBuffer allocate10 = ByteBuffer.allocate(20);
                            allocate10.put((byte)110);
                            allocate10.put((byte)99);
                            allocate10.put((byte)108);
                            allocate10.put((byte)120);
                            short n14;
                            short n15;
                            if (a2.containsKey("color-standard")) {
                                final int integer3 = a2.getInteger("color-standard");
                                if (integer3 < 0 || integer3 >= 10) {
                                    final StringBuilder sb = new StringBuilder(43);
                                    sb.append("Color standard not implemented: ");
                                    sb.append(integer3);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                final short n13 = ltz.a[integer3][0];
                                n14 = ltz.a[integer3][1];
                                n15 = n13;
                            }
                            else {
                                final short n16 = 0;
                                n15 = 0;
                                n14 = n16;
                            }
                            short n17;
                            if (a2.containsKey("color-transfer")) {
                                final int integer4 = a2.getInteger("color-transfer");
                                if (integer4 < 0 || integer4 >= 8) {
                                    final StringBuilder sb2 = new StringBuilder(43);
                                    sb2.append("Color transfer not implemented: ");
                                    sb2.append(integer4);
                                    throw new IllegalArgumentException(sb2.toString());
                                }
                                n17 = ltz.b[integer4];
                            }
                            else {
                                n17 = 0;
                            }
                            byte b4 = 0;
                            Label_2677: {
                                if (a2.containsKey("color-range")) {
                                    final int integer5 = a2.getInteger("color-range");
                                    if (integer5 < 0 || integer5 > 2) {
                                        final StringBuilder sb3 = new StringBuilder(40);
                                        sb3.append("Color range not implemented: ");
                                        sb3.append(integer5);
                                        throw new IllegalArgumentException(sb3.toString());
                                    }
                                    if (integer5 == 1) {
                                        b4 = -128;
                                        break Label_2677;
                                    }
                                }
                                b4 = 0;
                            }
                            allocate10.putShort(n15);
                            allocate10.putShort(n17);
                            allocate10.putShort(n14);
                            allocate10.put(b4);
                            allocate10.flip();
                            allocate8.put(ltl.j("colr", allocate10));
                        }
                        allocate8.flip();
                        byteBuffer10 = ltl.j(s3, allocate8);
                    }
                    else if (d) {
                        byteBuffer10 = ltl.l(a2);
                    }
                    else {
                        final ByteBuffer allocate11 = ByteBuffer.allocate(200);
                        final byte[] bytes = a2.getString("mime").getBytes(StandardCharsets.UTF_8);
                        allocate11.put(bytes);
                        allocate11.put((byte)0);
                        allocate11.put(bytes);
                        allocate11.put((byte)0);
                        allocate11.flip();
                        byteBuffer10 = ltl.j("mett", allocate11);
                    }
                    final ByteBuffer allocate12 = ByteBuffer.allocate(byteBuffer10.limit() + 200);
                    allocate12.putInt(0);
                    allocate12.putInt(1);
                    allocate12.put(byteBuffer10);
                    allocate12.flip();
                    final ByteBuffer m = ltl.j("stsd", allocate12);
                    final ByteBuffer allocate13 = ByteBuffer.allocate(list2.size() * 8 + 200);
                    allocate13.putInt(0);
                    final int position = allocate13.position();
                    allocate13.putInt(0);
                    final Iterator iterator7 = list2.iterator();
                    long n18 = -1L;
                    int position2 = -1;
                    int n19 = 0;
                    while (iterator7.hasNext()) {
                        final long longValue = (long)iterator7.next();
                        if (n18 != longValue) {
                            position2 = allocate13.position();
                            allocate13.putInt(1);
                            allocate13.putInt((int)longValue);
                            ++n19;
                            n18 = longValue;
                        }
                        else {
                            allocate13.putInt(position2, allocate13.getInt(position2) + 1);
                        }
                    }
                    allocate13.putInt(position, n19);
                    allocate13.flip();
                    final ByteBuffer j2 = ltl.j("stts", allocate13);
                    final nns b5 = ltx2.b();
                    final ByteBuffer allocate14 = ByteBuffer.allocate(b5.size() * 4 + 200);
                    allocate14.putInt(0);
                    allocate14.putInt(0);
                    allocate14.putInt(b5.size());
                    final Iterator<Object> iterator8 = b5.iterator();
                    while (iterator8.hasNext()) {
                        allocate14.putInt(iterator8.next().size);
                    }
                    allocate14.flip();
                    final ByteBuffer j3 = ltl.j("stsz", allocate14);
                    final nns j4 = nns.j(ltx2.e);
                    final ByteBuffer allocate15 = ByteBuffer.allocate(j4.size() * 12 + 200);
                    allocate15.putInt(0);
                    allocate15.putInt(j4.size());
                    final Iterator<Object> iterator9 = j4.iterator();
                    int n20 = 1;
                    while (iterator9.hasNext()) {
                        final int intValue = iterator9.next();
                        allocate15.putInt(n20);
                        allocate15.putInt(intValue);
                        allocate15.putInt(1);
                        ++n20;
                    }
                    allocate15.flip();
                    final ByteBuffer j5 = ltl.j("stsc", allocate15);
                    final nns j6 = nns.j(ltx2.d);
                    final ByteBuffer allocate16 = ByteBuffer.allocate(j6.size() * 8 + 200);
                    allocate16.putInt(0);
                    allocate16.putInt(j6.size());
                    final Iterator<Object> iterator10 = j6.iterator();
                    while (iterator10.hasNext()) {
                        allocate16.putLong(iterator10.next());
                    }
                    allocate16.flip();
                    final ByteBuffer j7 = ltl.j("co64", allocate16);
                    ByteBuffer j8;
                    if (e) {
                        final nns b6 = ltx2.b();
                        final ByteBuffer allocate17 = ByteBuffer.allocate(b6.size() * 4 + 200);
                        allocate17.putInt(0);
                        final int position3 = allocate17.position();
                        allocate17.putInt(b6.size());
                        final Iterator<Object> iterator11 = b6.iterator();
                        int n21 = 0;
                        int n22 = 1;
                        while (iterator11.hasNext()) {
                            int n23 = n21;
                            if ((iterator11.next().flags & 0x1) > 0) {
                                allocate17.putInt(n22);
                                n23 = n21 + 1;
                            }
                            ++n22;
                            n21 = n23;
                        }
                        allocate17.putInt(position3, n21);
                        allocate17.flip();
                        j8 = ltl.j("stss", allocate17);
                    }
                    else {
                        j8 = null;
                    }
                    final ArrayList list5 = new ArrayList();
                    for (int n24 = 0; n24 < 6; ++n24) {
                        final ByteBuffer byteBuffer11 = (new ByteBuffer[] { m, j2, j3, j5, j7, j8 })[n24];
                        if (byteBuffer11 != null) {
                            list5.add(byteBuffer11);
                        }
                    }
                    list.add(ltl.i("trak", Arrays.asList(g, byteBuffer, ltl.i("mdia", Arrays.asList(f, h, ltl.i("minf", Arrays.asList(byteBuffer2, l, ltl.i("stbl", list5))))))));
                    max = Math.max(max, n9);
                    ++n;
                    list6 = list;
                    iterator12 = iterator3;
                    s = s2;
                }
                else {
                    final List<ByteBuffer> list7 = list;
                    iterator12 = iterator2;
                    list6 = list7;
                }
                final List<ByteBuffer> list8 = list6;
                iterator2 = iterator12;
                list = list8;
            }
            final long d2 = i.a.d;
            final ByteBuffer allocate18 = ByteBuffer.allocate(200);
            allocate18.putInt(0);
            allocate18.putInt(ltl.b(d2));
            allocate18.putInt(ltl.b(d2));
            allocate18.putInt(10000);
            allocate18.putInt((int)lue.b(max, 10000L));
            allocate18.putInt(65536);
            allocate18.putShort((short)256);
            allocate18.putShort((short)0);
            allocate18.putInt(0);
            allocate18.putInt(0);
            for (int n25 = 0; n25 < 9; ++n25) {
                allocate18.putInt((new int[] { 65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824 })[n25]);
            }
            for (int n26 = 0; n26 < 6; ++n26) {
                allocate18.putInt(0);
            }
            allocate18.putInt(n);
            allocate18.flip();
            final ByteBuffer j9 = ltl.j("mvhd", allocate18);
            final niz b7 = i.a.b;
            ByteBuffer byteBuffer12;
            if (!b7.g()) {
                byteBuffer12 = ByteBuffer.allocate(0);
            }
            else {
                final String format = String.format(Locale.US, "%+.4f%+.4f/", ((ltv)b7.c()).a, ((ltv)b7.c()).b);
                final ByteBuffer allocate19 = ByteBuffer.allocate(format.length() + 4);
                allocate19.putShort((short)(allocate19.capacity() - 4));
                allocate19.putShort((short)5575);
                allocate19.put(format.getBytes(StandardCharsets.UTF_8));
                njo.o(allocate19.limit() == allocate19.capacity());
                allocate19.flip();
                byteBuffer12 = ltl.j("udta", ltl.k(new byte[] { -87, 120, 121, 122 }, allocate19));
            }
            ByteBuffer byteBuffer13;
            if (linkedHashMap.isEmpty()) {
                byteBuffer13 = ByteBuffer.allocate(0);
            }
            else {
                final ByteBuffer allocate20 = ByteBuffer.allocate(200);
                allocate20.putInt(0);
                allocate20.putInt(0);
                allocate20.put("mdta".getBytes(StandardCharsets.UTF_8));
                allocate20.putInt(0);
                allocate20.putInt(0);
                allocate20.putInt(0);
                allocate20.put((byte)0);
                allocate20.flip();
                byteBuffer13 = ltl.i("meta", Arrays.asList(ltl.j(s, allocate20), ltl.e(nqb.n(linkedHashMap.keySet())), ltl.d(nqb.n(linkedHashMap.values()))));
            }
            s4 = s;
            final ArrayList list9 = new ArrayList();
            list9.add(j9);
            list9.add(byteBuffer12);
            list9.add(byteBuffer13);
            list9.addAll(list);
            byteBuffer14 = ltl.i("moov", list9);
        }
        else {
            s4 = "hdlr";
            byteBuffer14 = ByteBuffer.allocate(0);
        }
        final ltt j10 = this.j;
        ByteBuffer byteBuffer17 = null;
        Label_5536: {
            if (!j10.a.isEmpty()) {
                final ByteBuffer allocate21 = ByteBuffer.allocate(200);
                allocate21.putInt(0);
                allocate21.putInt(0);
                allocate21.put("pict".getBytes(StandardCharsets.UTF_8));
                allocate21.putInt(0);
                allocate21.putInt(0);
                allocate21.putInt(0);
                allocate21.put((byte)0);
                allocate21.flip();
                final ByteBuffer j11 = ltl.j(s4, allocate21);
                final ByteBuffer allocate22 = ByteBuffer.allocate(0);
                final List a5 = j10.a;
                final List c2 = j10.c;
                final List d3 = j10.d;
                final List e2 = j10.e;
                final ByteBuffer allocate23 = ByteBuffer.allocate(a5.size() * 16 + 200);
                final Iterator iterator13 = c2.iterator();
                while (true) {
                    while (iterator13.hasNext()) {
                        if (!((lts)iterator13.next()).equals(lts.a)) {
                            final byte b8 = 1;
                            allocate23.put(b8);
                            allocate23.put((byte)0);
                            allocate23.put((byte)0);
                            allocate23.put((byte)0);
                            allocate23.put((byte)68);
                            allocate23.put((byte)0);
                            if (a5.size() != d3.size()) {
                                final int size = a5.size();
                                final int size2 = d3.size();
                                final StringBuilder sb4 = new StringBuilder(62);
                                sb4.append("Items size ");
                                sb4.append(size);
                                sb4.append(" does not match offsets size ");
                                sb4.append(size2);
                                throw new IllegalArgumentException(sb4.toString());
                            }
                            if (d3.size() != e2.size()) {
                                final int size3 = d3.size();
                                final int size4 = e2.size();
                                final StringBuilder sb5 = new StringBuilder(64);
                                sb5.append("Offsets size ");
                                sb5.append(size3);
                                sb5.append(" does not match lengths size ");
                                sb5.append(size4);
                                throw new IllegalArgumentException(sb5.toString());
                            }
                            allocate23.putShort((short)a5.size());
                            for (int n27 = 0; n27 < a5.size(); ++n27) {
                                allocate23.putShort((short)(int)a5.get(n27));
                                if (b8 > 0) {
                                    allocate23.putShort(((lts)c2.get(n27)).d);
                                }
                                allocate23.putShort((short)0);
                                allocate23.putShort((short)1);
                                allocate23.putInt((int)(long)d3.get(n27));
                                allocate23.putInt((int)(long)e2.get(n27));
                            }
                            allocate23.flip();
                            final ByteBuffer j12 = ltl.j("iloc", allocate23);
                            final ByteBuffer i2 = ltl.i("ipco", j10.g);
                            final List a6 = j10.a;
                            final List f2 = j10.f;
                            final ByteBuffer allocate24 = ByteBuffer.allocate(200);
                            allocate24.putInt(0);
                            if (a6.size() == f2.size()) {
                                final Iterator iterator14 = f2.iterator();
                                int n28 = 0;
                                while (iterator14.hasNext()) {
                                    if (!((List)iterator14.next()).isEmpty()) {
                                        ++n28;
                                    }
                                }
                                allocate24.putInt(n28);
                                for (int n29 = 0; n29 < a6.size(); ++n29) {
                                    if (!((List)f2.get(n29)).isEmpty()) {
                                        allocate24.putShort((short)(int)a6.get(n29));
                                        final List list10 = f2.get(n29);
                                        if (list10.size() > 127) {
                                            throw new IllegalArgumentException("Too many properties");
                                        }
                                        allocate24.put((byte)list10.size());
                                        for (final int intValue2 : list10) {
                                            if (intValue2 > 255) {
                                                throw new IllegalArgumentException("Association does not fit into byte");
                                            }
                                            allocate24.put((byte)intValue2);
                                        }
                                    }
                                }
                                allocate24.flip();
                                final ByteBuffer j13 = ltl.j("ipma", allocate24);
                                final ArrayList list11 = new ArrayList<Object>();
                                Collections.addAll(list11, i2, j13);
                                final ByteBuffer i3 = ltl.i("iprp", list11);
                                final List b9 = j10.b;
                                final ByteBuffer allocate25 = ByteBuffer.allocate(200);
                                allocate25.putInt(0);
                                allocate25.putShort((short)b9.size());
                                final Iterator iterator16 = b9.iterator();
                                while (iterator16.hasNext()) {
                                    allocate25.put((ByteBuffer)iterator16.next());
                                }
                                allocate25.flip();
                                final ByteBuffer j14 = ltl.j("iinf", allocate25);
                                ByteBuffer byteBuffer15;
                                if (j10.h.isEmpty()) {
                                    byteBuffer15 = ByteBuffer.allocate(0);
                                }
                                else {
                                    final List h2 = j10.h;
                                    final ArrayList list12 = new ArrayList();
                                    list12.add(ByteBuffer.allocate(4));
                                    list12.addAll(h2);
                                    byteBuffer15 = ltl.i("iref", list12);
                                }
                                ByteBuffer byteBuffer16;
                                if (j10.i.isEmpty()) {
                                    byteBuffer16 = ByteBuffer.allocate(0);
                                }
                                else {
                                    byteBuffer16 = ltl.i("idat", j10.i);
                                }
                                final ArrayList list13 = new ArrayList();
                                list13.add(ByteBuffer.allocate(4));
                                Collections.addAll(list13, j11, allocate22, j12, i3, j14, byteBuffer15, byteBuffer16);
                                byteBuffer17 = ltl.i("meta", list13);
                                break Label_5536;
                            }
                            final int size5 = a6.size();
                            final int size6 = f2.size();
                            final StringBuilder sb6 = new StringBuilder(54);
                            sb6.append("From ids count ");
                            sb6.append(size5);
                            sb6.append(" is not equal to ");
                            sb6.append(size6);
                            throw new IllegalArgumentException(sb6.toString());
                        }
                    }
                    final byte b8 = 0;
                    continue;
                }
            }
            byteBuffer17 = ByteBuffer.allocate(0);
        }
        if (byteBuffer17.remaining() > 0) {
            final ByteBuffer allocate26 = ByteBuffer.allocate(byteBuffer14.remaining() + byteBuffer17.remaining());
            allocate26.put(byteBuffer14);
            allocate26.put(byteBuffer17);
            allocate26.flip();
            return allocate26;
        }
        return byteBuffer14;
    }
    
    private final void c(final long n, final ByteBuffer byteBuffer) {
        final long longValue = (long)this.h.j();
        final boolean b = true;
        njo.o(n >= longValue);
        njo.o(n >= this.g && b);
        this.c.position(n);
        this.c.write(ltl.j("free", byteBuffer.duplicate()));
        this.g = 8L + n;
        this.d();
        this.h = nqe.e(n, n + byteBuffer.limit());
    }
    
    private final void d() {
        this.c.position(this.e + 8L);
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(this.g - this.e);
        allocate.flip();
        this.c.write(allocate);
    }
    
    final void a(final ltx ltx) {
        if (ltx.f.isEmpty()) {
            return;
        }
        final AtomicBoolean d = this.d;
        final boolean b = true;
        if (!d.getAndSet(true)) {
            this.c.position(0L);
            this.c.write(this.k.a());
            this.e = this.c.position();
            final ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putInt(1);
            allocate.put("mdat".getBytes(StandardCharsets.UTF_8));
            allocate.putLong(16L);
            allocate.flip();
            this.c.write(allocate);
            final long n = this.e + 16L;
            this.f = n;
            this.g = n;
        }
        final Iterator iterator = ltx.f.iterator();
        long n2 = 0L;
        while (iterator.hasNext()) {
            n2 += ((ByteBuffer)((Pair)iterator.next()).second).limit();
        }
        njo.o(n2 > 0L);
        final long f = this.f;
        if (f + n2 >= this.g) {
            this.c(Math.max(this.g + (Math.max(500000L, (long)(f * 0.2f)) + n2), (long)this.h.j()), this.b());
        }
        ltx.d.add(this.f);
        ltx.e.add(ltx.f.size());
        do {
            final Pair pair = ltx.f.removeFirst();
            final MediaCodec$BufferInfo mediaCodec$BufferInfo = (MediaCodec$BufferInfo)pair.first;
            final ByteBuffer byteBuffer = (ByteBuffer)pair.second;
            ltx.c.add(mediaCodec$BufferInfo);
            if (lue.e(ltx.a)) {
                AnnexBToAvcc.a(byteBuffer);
            }
            byteBuffer.rewind();
            final long f2 = this.f;
            this.f = f2 + this.c.write(byteBuffer, f2);
        } while (!ltx.f.isEmpty());
        njo.o(this.f <= this.g && b);
    }
    
    @Override
    public final void close() {
        try {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                this.a((ltx)iterator.next());
            }
            if (this.d.get()) {
                final ByteBuffer b = this.b();
                final int limit = b.limit();
                final long g = this.g;
                final long f = this.f;
                final long n = limit + 8;
                final boolean b2 = true;
                if (g - f < n) {
                    this.c((long)this.h.j() + n, b);
                    njo.o(this.g - this.f >= n);
                }
                final long f2 = this.f;
                this.c.position(f2);
                this.c.write(b);
                final long longValue = (long)this.h.j();
                final long n2 = limit + f2;
                final long n3 = longValue - n2;
                njo.o(n3 < 2147483647L && b2);
                final ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.putInt((int)n3);
                allocate.put((byte)102);
                allocate.put((byte)114);
                allocate.put((byte)101);
                allocate.put((byte)101);
                allocate.flip();
                this.c.write(allocate);
                this.g = f2;
                this.d();
                this.h = nqe.e(f2, f2 + b.limit());
                this.c.truncate(n2);
            }
            this.c.close();
            this.b.close();
            this.c = null;
            this.b = null;
        }
        finally {
            this.c.close();
            this.b.close();
            this.c = null;
            this.b = null;
            while (true) {}
        }
    }
}
