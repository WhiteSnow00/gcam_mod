import java.io.InputStream;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdo implements avt
{
    static final byte[] a;
    private static final int[] b;
    
    static {
        a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
        b = new int[] { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8 };
    }
    
    private static final int e(final bdm bdm, final azi azi) {
        try {
            final int a = bdm.a();
            if ((a & 0xFFD8) != 0xFFD8 && a != 19789) {
                if (a != 18761) {
                    return -1;
                }
            }
            while (true) {
                while (bdm.d() == 255) {
                    final short d = bdm.d();
                    int n;
                    if (d != 218 && d != 217) {
                        n = bdm.a() - 2;
                        if (d != 225) {
                            final long n2 = n;
                            if (bdm.c(n2) == n2) {
                                continue;
                            }
                            n = -1;
                        }
                    }
                    else {
                        n = -1;
                    }
                    if (n == -1) {
                        return -1;
                    }
                    final byte[] array = (byte[])azi.a(n, byte[].class);
                    try {
                        int b;
                        if (bdm.b(array, n) != n) {
                            b = -1;
                        }
                        else {
                            if (n > bdo.a.length) {
                                final int n3 = 0;
                                int n4 = 0;
                                while (true) {
                                    final byte[] a2 = bdo.a;
                                    if (n4 >= a2.length) {
                                        final ByteBuffer byteBuffer = (ByteBuffer)ByteBuffer.wrap(array).order(ByteOrder.BIG_ENDIAN).limit(n);
                                        ByteOrder byteOrder = null;
                                        switch (bgh.b(6, byteBuffer)) {
                                            default: {
                                                byteOrder = ByteOrder.BIG_ENDIAN;
                                                break;
                                            }
                                            case 19789: {
                                                byteOrder = ByteOrder.BIG_ENDIAN;
                                                break;
                                            }
                                            case 18761: {
                                                byteOrder = ByteOrder.LITTLE_ENDIAN;
                                                break;
                                            }
                                        }
                                        byteBuffer.order(byteOrder);
                                        final int n5 = bgh.a(10, byteBuffer) + 6;
                                        for (short b2 = bgh.b(n5, byteBuffer), n6 = (short)n3; n6 < b2; ++n6) {
                                            int n7 = n5 + 2 + n6 * 12;
                                            if (bgh.b(n7, byteBuffer) == 274) {
                                                final short b3 = bgh.b(n7 + 2, byteBuffer);
                                                if (b3 > 0 && b3 <= 12) {
                                                    final int a3 = bgh.a(n7 + 4, byteBuffer);
                                                    if (a3 >= 0) {
                                                        final int n8 = a3 + bdo.b[b3];
                                                        if (n8 <= 4) {
                                                            n7 += 8;
                                                            if (n7 >= 0 && n7 <= byteBuffer.remaining() && n8 >= 0 && n8 + n7 <= byteBuffer.remaining()) {
                                                                b = bgh.b(n7, byteBuffer);
                                                                return b;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    if (array[n4] != a2[n4]) {
                                        b = -1;
                                        return b;
                                    }
                                    ++n4;
                                }
                            }
                            b = -1;
                        }
                        return b;
                    }
                    finally {
                        azi.c(array);
                    }
                }
                int n = -1;
                continue;
            }
        }
        catch (final bdl bdl) {
            return -1;
        }
    }
    
    private static final ImageHeaderParser$ImageType f(final bdm bdm) {
        try {
            final int a = bdm.a();
            if (a == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            final int n = a << 8 | bdm.d();
            if (n == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            final int n2 = n << 8 | bdm.d();
            if (n2 == -1991225785) {
                bdm.c(21L);
                try {
                    ImageHeaderParser$ImageType imageHeaderParser$ImageType;
                    if (bdm.d() >= 3) {
                        imageHeaderParser$ImageType = ImageHeaderParser$ImageType.PNG_A;
                    }
                    else {
                        imageHeaderParser$ImageType = ImageHeaderParser$ImageType.PNG;
                    }
                    return imageHeaderParser$ImageType;
                }
                catch (final bdl bdl) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (n2 != 1380533830) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            bdm.c(4L);
            if ((bdm.a() << 16 | bdm.a()) != 0x57454250) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            final int n3 = bdm.a() << 16 | bdm.a();
            if ((n3 & 0xFFFFFF00) != 0x56503800) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            final int n4 = n3 & 0xFF;
            if (n4 == 88) {
                bdm.c(4L);
                ImageHeaderParser$ImageType imageHeaderParser$ImageType2;
                if ((bdm.d() & 0x10) != 0x0) {
                    imageHeaderParser$ImageType2 = ImageHeaderParser$ImageType.WEBP_A;
                }
                else {
                    imageHeaderParser$ImageType2 = ImageHeaderParser$ImageType.WEBP;
                }
                return imageHeaderParser$ImageType2;
            }
            if (n4 == 76) {
                bdm.c(4L);
                ImageHeaderParser$ImageType imageHeaderParser$ImageType3;
                if ((bdm.d() & 0x8) != 0x0) {
                    imageHeaderParser$ImageType3 = ImageHeaderParser$ImageType.WEBP_A;
                }
                else {
                    imageHeaderParser$ImageType3 = ImageHeaderParser$ImageType.WEBP;
                }
                return imageHeaderParser$ImageType3;
            }
            return ImageHeaderParser$ImageType.WEBP;
        }
        catch (final bdl bdl2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }
    
    @Override
    public final int a(final InputStream inputStream, final azi azi) {
        bit.a(inputStream);
        final bdn bdn = new bdn(inputStream);
        bit.a(azi);
        return e(bdn, azi);
    }
    
    @Override
    public final int b(final ByteBuffer byteBuffer, final azi azi) {
        bit.a(byteBuffer);
        final bdk bdk = new bdk(byteBuffer);
        bit.a(azi);
        return e(bdk, azi);
    }
    
    @Override
    public final ImageHeaderParser$ImageType c(final InputStream inputStream) {
        bit.a(inputStream);
        return f(new bdn(inputStream));
    }
    
    @Override
    public final ImageHeaderParser$ImageType d(final ByteBuffer byteBuffer) {
        bit.a(byteBuffer);
        return f(new bdk(byteBuffer));
    }
}
