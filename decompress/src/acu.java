import android.util.Log;
import java.io.EOFException;
import java.util.zip.CRC32;
import java.io.IOException;
import android.system.OsConstants;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.regex.Pattern;
import j$.util.DesugarTimeZone;
import java.util.Locale;
import java.util.Collection;
import java.util.Arrays;
import java.nio.ByteOrder;
import java.util.Set;
import android.content.res.AssetManager$AssetInputStream;
import java.io.FileDescriptor;
import java.text.SimpleDateFormat;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acu
{
    private static final acs[] A;
    private static final acs[] B;
    private static final acs[] C;
    private static final acs D;
    private static final acs[] E;
    private static final acs[] F;
    private static final acs[] G;
    private static final acs[] H;
    private static final acs[] I;
    private static final HashMap[] J;
    private static final HashMap[] K;
    private static final HashSet L;
    private static final HashMap M;
    private static final byte[] N;
    public static final int[] a;
    public static final int[] b;
    static final byte[] c;
    static final String[] d;
    static final int[] e;
    static final byte[] f;
    static final acs[][] g;
    static final Charset h;
    static final byte[] i;
    private static final byte[] k;
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private static final byte[] t;
    private static final byte[] u;
    private static final byte[] v;
    private static SimpleDateFormat w;
    private static SimpleDateFormat x;
    private static final acs[] y;
    private static final acs[] z;
    private final FileDescriptor O;
    private final AssetManager$AssetInputStream P;
    private int Q;
    private final HashMap[] R;
    private final Set S;
    private boolean T;
    private int U;
    private int V;
    private int W;
    private int X;
    public ByteOrder j;
    
    static {
        final Integer value = 1;
        final Integer value2 = 3;
        final Integer value3 = 2;
        final Integer value4 = 8;
        Arrays.asList(value, 6, value2, value4);
        final Integer value5 = 7;
        final Integer value6 = 5;
        Arrays.asList(value3, value5, 4, value6);
        a = new int[] { 8, 8, 8 };
        b = new int[] { 8 };
        c = new byte[] { -1, -40, -1 };
        k = new byte[] { 102, 116, 121, 112 };
        l = new byte[] { 109, 105, 102, 49 };
        m = new byte[] { 104, 101, 105, 99 };
        n = new byte[] { 79, 76, 89, 77, 80, 0 };
        o = new byte[] { 79, 76, 89, 77, 80, 85, 83, 0, 73, 73 };
        p = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
        q = new byte[] { 101, 88, 73, 102 };
        r = new byte[] { 73, 72, 68, 82 };
        s = new byte[] { 73, 69, 78, 68 };
        t = new byte[] { 82, 73, 70, 70 };
        u = new byte[] { 87, 69, 66, 80 };
        v = new byte[] { 69, 88, 73, 70 };
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        d = new String[] { "", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD" };
        e = new int[] { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1 };
        f = new byte[] { 65, 83, 67, 73, 73, 0, 0, 0 };
        final acs[] array = y = new acs[] { new acs("NewSubfileType", 254, 4), new acs("SubfileType", 255, 4), new acs("ImageWidth", 256, 3, 4), new acs("ImageLength", 257, 3, 4), new acs("BitsPerSample", 258, 3), new acs("Compression", 259, 3), new acs("PhotometricInterpretation", 262, 3), new acs("ImageDescription", 270, 2), new acs("Make", 271, 2), new acs("Model", 272, 2), new acs("StripOffsets", 273, 3, 4), new acs("Orientation", 274, 3), new acs("SamplesPerPixel", 277, 3), new acs("RowsPerStrip", 278, 3, 4), new acs("StripByteCounts", 279, 3, 4), new acs("XResolution", 282, 5), new acs("YResolution", 283, 5), new acs("PlanarConfiguration", 284, 3), new acs("ResolutionUnit", 296, 3), new acs("TransferFunction", 301, 3), new acs("Software", 305, 2), new acs("DateTime", 306, 2), new acs("Artist", 315, 2), new acs("WhitePoint", 318, 5), new acs("PrimaryChromaticities", 319, 5), new acs("SubIFDPointer", 330, 4), new acs("JPEGInterchangeFormat", 513, 4), new acs("JPEGInterchangeFormatLength", 514, 4), new acs("YCbCrCoefficients", 529, 5), new acs("YCbCrSubSampling", 530, 3), new acs("YCbCrPositioning", 531, 3), new acs("ReferenceBlackWhite", 532, 5), new acs("Copyright", 33432, 2), new acs("ExifIFDPointer", 34665, 4), new acs("GPSInfoIFDPointer", 34853, 4), new acs("SensorTopBorder", 4, 4), new acs("SensorLeftBorder", 5, 4), new acs("SensorBottomBorder", 6, 4), new acs("SensorRightBorder", 7, 4), new acs("ISO", 23, 3), new acs("JpgFromRaw", 46, 7), new acs("Xmp", 700, 1) };
        final acs[] array2 = z = new acs[] { new acs("ExposureTime", 33434, 5), new acs("FNumber", 33437, 5), new acs("ExposureProgram", 34850, 3), new acs("SpectralSensitivity", 34852, 2), new acs("PhotographicSensitivity", 34855, 3), new acs("OECF", 34856, 7), new acs("SensitivityType", 34864, 3), new acs("StandardOutputSensitivity", 34865, 4), new acs("RecommendedExposureIndex", 34866, 4), new acs("ISOSpeed", 34867, 4), new acs("ISOSpeedLatitudeyyy", 34868, 4), new acs("ISOSpeedLatitudezzz", 34869, 4), new acs("ExifVersion", 36864, 2), new acs("DateTimeOriginal", 36867, 2), new acs("DateTimeDigitized", 36868, 2), new acs("OffsetTime", 36880, 2), new acs("OffsetTimeOriginal", 36881, 2), new acs("OffsetTimeDigitized", 36882, 2), new acs("ComponentsConfiguration", 37121, 7), new acs("CompressedBitsPerPixel", 37122, 5), new acs("ShutterSpeedValue", 37377, 10), new acs("ApertureValue", 37378, 5), new acs("BrightnessValue", 37379, 10), new acs("ExposureBiasValue", 37380, 10), new acs("MaxApertureValue", 37381, 5), new acs("SubjectDistance", 37382, 5), new acs("MeteringMode", 37383, 3), new acs("LightSource", 37384, 3), new acs("Flash", 37385, 3), new acs("FocalLength", 37386, 5), new acs("SubjectArea", 37396, 3), new acs("MakerNote", 37500, 7), new acs("UserComment", 37510, 7), new acs("SubSecTime", 37520, 2), new acs("SubSecTimeOriginal", 37521, 2), new acs("SubSecTimeDigitized", 37522, 2), new acs("FlashpixVersion", 40960, 7), new acs("ColorSpace", 40961, 3), new acs("PixelXDimension", 40962, 3, 4), new acs("PixelYDimension", 40963, 3, 4), new acs("RelatedSoundFile", 40964, 2), new acs("InteroperabilityIFDPointer", 40965, 4), new acs("FlashEnergy", 41483, 5), new acs("SpatialFrequencyResponse", 41484, 7), new acs("FocalPlaneXResolution", 41486, 5), new acs("FocalPlaneYResolution", 41487, 5), new acs("FocalPlaneResolutionUnit", 41488, 3), new acs("SubjectLocation", 41492, 3), new acs("ExposureIndex", 41493, 5), new acs("SensingMethod", 41495, 3), new acs("FileSource", 41728, 7), new acs("SceneType", 41729, 7), new acs("CFAPattern", 41730, 7), new acs("CustomRendered", 41985, 3), new acs("ExposureMode", 41986, 3), new acs("WhiteBalance", 41987, 3), new acs("DigitalZoomRatio", 41988, 5), new acs("FocalLengthIn35mmFilm", 41989, 3), new acs("SceneCaptureType", 41990, 3), new acs("GainControl", 41991, 3), new acs("Contrast", 41992, 3), new acs("Saturation", 41993, 3), new acs("Sharpness", 41994, 3), new acs("DeviceSettingDescription", 41995, 7), new acs("SubjectDistanceRange", 41996, 3), new acs("ImageUniqueID", 42016, 2), new acs("CameraOwnerName", 42032, 2), new acs("BodySerialNumber", 42033, 2), new acs("LensSpecification", 42034, 5), new acs("LensMake", 42035, 2), new acs("LensModel", 42036, 2), new acs("Gamma", 42240, 5), new acs("DNGVersion", 50706, 1), new acs("DefaultCropSize", 50720, 3, 4) };
        final acs[] array3 = A = new acs[] { new acs("GPSVersionID", 0, 1), new acs("GPSLatitudeRef", 1, 2), new acs("GPSLatitude", 2, 5, 10), new acs("GPSLongitudeRef", 3, 2), new acs("GPSLongitude", 4, 5, 10), new acs("GPSAltitudeRef", 5, 1), new acs("GPSAltitude", 6, 5), new acs("GPSTimeStamp", 7, 5), new acs("GPSSatellites", 8, 2), new acs("GPSStatus", 9, 2), new acs("GPSMeasureMode", 10, 2), new acs("GPSDOP", 11, 5), new acs("GPSSpeedRef", 12, 2), new acs("GPSSpeed", 13, 5), new acs("GPSTrackRef", 14, 2), new acs("GPSTrack", 15, 5), new acs("GPSImgDirectionRef", 16, 2), new acs("GPSImgDirection", 17, 5), new acs("GPSMapDatum", 18, 2), new acs("GPSDestLatitudeRef", 19, 2), new acs("GPSDestLatitude", 20, 5), new acs("GPSDestLongitudeRef", 21, 2), new acs("GPSDestLongitude", 22, 5), new acs("GPSDestBearingRef", 23, 2), new acs("GPSDestBearing", 24, 5), new acs("GPSDestDistanceRef", 25, 2), new acs("GPSDestDistance", 26, 5), new acs("GPSProcessingMethod", 27, 7), new acs("GPSAreaInformation", 28, 7), new acs("GPSDateStamp", 29, 2), new acs("GPSDifferential", 30, 3), new acs("GPSHPositioningError", 31, 5) };
        final acs[] array4 = B = new acs[] { new acs("InteroperabilityIndex", 1, 2) };
        final acs[] array5 = C = new acs[] { new acs("NewSubfileType", 254, 4), new acs("SubfileType", 255, 4), new acs("ThumbnailImageWidth", 256, 3, 4), new acs("ThumbnailImageLength", 257, 3, 4), new acs("BitsPerSample", 258, 3), new acs("Compression", 259, 3), new acs("PhotometricInterpretation", 262, 3), new acs("ImageDescription", 270, 2), new acs("Make", 271, 2), new acs("Model", 272, 2), new acs("StripOffsets", 273, 3, 4), new acs("ThumbnailOrientation", 274, 3), new acs("SamplesPerPixel", 277, 3), new acs("RowsPerStrip", 278, 3, 4), new acs("StripByteCounts", 279, 3, 4), new acs("XResolution", 282, 5), new acs("YResolution", 283, 5), new acs("PlanarConfiguration", 284, 3), new acs("ResolutionUnit", 296, 3), new acs("TransferFunction", 301, 3), new acs("Software", 305, 2), new acs("DateTime", 306, 2), new acs("Artist", 315, 2), new acs("WhitePoint", 318, 5), new acs("PrimaryChromaticities", 319, 5), new acs("SubIFDPointer", 330, 4), new acs("JPEGInterchangeFormat", 513, 4), new acs("JPEGInterchangeFormatLength", 514, 4), new acs("YCbCrCoefficients", 529, 5), new acs("YCbCrSubSampling", 530, 3), new acs("YCbCrPositioning", 531, 3), new acs("ReferenceBlackWhite", 532, 5), new acs("Copyright", 33432, 2), new acs("ExifIFDPointer", 34665, 4), new acs("GPSInfoIFDPointer", 34853, 4), new acs("DNGVersion", 50706, 1), new acs("DefaultCropSize", 50720, 3, 4) };
        D = new acs("StripOffsets", 273, 3);
        g = new acs[][] { array, array2, array3, array4, array5, array, E = new acs[] { new acs("ThumbnailImage", 256, 7), new acs("CameraSettingsIFDPointer", 8224, 4), new acs("ImageProcessingIFDPointer", 8256, 4) }, F = new acs[] { new acs("PreviewImageStart", 257, 4), new acs("PreviewImageLength", 258, 4) }, G = new acs[] { new acs("AspectFrame", 4371, 3) }, H = new acs[] { new acs("ColorSpace", 55, 3) } };
        I = new acs[] { new acs("SubIFDPointer", 330, 4), new acs("ExifIFDPointer", 34665, 4), new acs("GPSInfoIFDPointer", 34853, 4), new acs("InteroperabilityIFDPointer", 40965, 4), new acs("CameraSettingsIFDPointer", 8224, 1), new acs("ImageProcessingIFDPointer", 8256, 1) };
        new acs("JPEGInterchangeFormat", 513, 4);
        new acs("JPEGInterchangeFormatLength", 514, 4);
        J = new HashMap[10];
        K = new HashMap[10];
        L = new HashSet((Collection<? extends E>)Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap();
        final Charset charset = h = Charset.forName("US-ASCII");
        i = "Exif\u0000\u0000".getBytes(charset);
        N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charset);
        (acu.w = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US)).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        (acu.x = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int n2 = 0;
        while (true) {
            final acs[][] g2 = acu.g;
            final int length = g2.length;
            if (n2 >= 10) {
                break;
            }
            acu.J[n2] = new HashMap();
            acu.K[n2] = new HashMap();
            for (final acs acs : g2[n2]) {
                acu.J[n2].put(acs.a, acs);
                acu.K[n2].put(acs.b, acs);
            }
            ++n2;
        }
        final HashMap m2 = acu.M;
        final acs[] i2 = acu.I;
        m2.put(i2[0].a, value6);
        m2.put(i2[1].a, value);
        m2.put(i2[2].a, value3);
        m2.put(i2[3].a, value2);
        m2.put(i2[4].a, value5);
        m2.put(i2[5].a, value4);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }
    
    public acu(final InputStream inputStream) {
        final acs[][] g = acu.g;
        final int length = g.length;
        this.R = new HashMap[10];
        final int length2 = g.length;
        this.S = new HashSet(10);
        this.j = ByteOrder.BIG_ENDIAN;
        Label_0121: {
            if (inputStream instanceof AssetManager$AssetInputStream) {
                this.P = (AssetManager$AssetInputStream)inputStream;
                this.O = null;
            }
            else {
                if (inputStream instanceof FileInputStream) {
                    final FileInputStream fileInputStream = (FileInputStream)inputStream;
                    final FileDescriptor fd = fileInputStream.getFD();
                    try {
                        acv.a(fd, 0L, OsConstants.SEEK_CUR);
                        this.P = null;
                        this.O = fileInputStream.getFD();
                        break Label_0121;
                    }
                    catch (final Exception ex) {}
                }
                this.P = null;
                this.O = null;
            }
        }
        this.h(inputStream);
    }
    
    private final void c() {
        final String b = this.b("DateTimeOriginal");
        if (b != null && this.b("DateTime") == null) {
            this.R[0].put("DateTime", acr.b(b));
        }
        if (this.b("ImageWidth") == null) {
            this.R[0].put("ImageWidth", acr.c(0L, this.j));
        }
        if (this.b("ImageLength") == null) {
            this.R[0].put("ImageLength", acr.c(0L, this.j));
        }
        if (this.b("Orientation") == null) {
            this.R[0].put("Orientation", acr.c(0L, this.j));
        }
        if (this.b("LightSource") == null) {
            this.R[1].put("LightSource", acr.c(0L, this.j));
        }
    }
    
    private final void d(final acq acq, final int n, final int n2) {
        acq.b = ByteOrder.BIG_ENDIAN;
        final byte byte1 = acq.readByte();
        if (byte1 != -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid marker: ");
            sb.append(Integer.toHexString(byte1 & 0xFF));
            throw new IOException(sb.toString());
        }
        if (acq.readByte() != -40) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid marker: ");
            sb2.append(Integer.toHexString(255));
            throw new IOException(sb2.toString());
        }
        int n3 = 2;
        while (true) {
            final byte byte2 = acq.readByte();
            if (byte2 != -1) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Invalid marker:");
                sb3.append(Integer.toHexString(0xFF & byte2));
                throw new IOException(sb3.toString());
            }
            final byte byte3 = acq.readByte();
            if (byte3 == -39 || byte3 == -38) {
                acq.b = this.j;
                return;
            }
            final int n4 = acq.readUnsignedShort() - 2;
            int n5 = n3 + 4;
            if (n4 < 0) {
                throw new IOException("Invalid length");
            }
            int n6 = 0;
            switch (byte3) {
                default: {
                    n6 = n4;
                    break;
                }
                case -2: {
                    final byte[] array = new byte[n4];
                    if (acq.read(array) == n4) {
                        if (this.b("UserComment") == null) {
                            this.R[1].put("UserComment", acr.b(new String(array, acu.h)));
                        }
                        n6 = 0;
                        break;
                    }
                    throw new IOException("Invalid exif");
                }
                case -31: {
                    final byte[] array2 = new byte[n4];
                    acq.readFully(array2);
                    final int n7 = n5 + n4;
                    final byte[] i = acu.i;
                    if (aaj.m(array2, i)) {
                        final byte[] copyOfRange = Arrays.copyOfRange(array2, i.length, n4);
                        this.U = n + n5 + i.length;
                        this.j(copyOfRange, n2);
                        this.k(new acq(copyOfRange));
                        final int n8 = 0;
                        n5 = n7;
                        n6 = n8;
                        break;
                    }
                    final byte[] n9 = acu.N;
                    if (aaj.m(array2, n9)) {
                        final int length = n9.length;
                        final byte[] copyOfRange2 = Arrays.copyOfRange(array2, n9.length, n4);
                        if (this.b("Xmp") == null) {
                            this.R[0].put("Xmp", new acr(1, copyOfRange2.length, n5 + length, copyOfRange2));
                        }
                        final int n10 = 0;
                        n5 = n7;
                        n6 = n10;
                        break;
                    }
                    final int n11 = 0;
                    n5 = n7;
                    n6 = n11;
                    break;
                }
                case -64:
                case -63:
                case -62:
                case -61:
                case -59:
                case -58:
                case -57:
                case -55:
                case -54:
                case -53:
                case -51:
                case -50:
                case -49: {
                    acq.b(1);
                    this.R[n2].put("ImageLength", acr.c(acq.readUnsignedShort(), this.j));
                    this.R[n2].put("ImageWidth", acr.c(acq.readUnsignedShort(), this.j));
                    n6 = n4 - 5;
                    break;
                }
            }
            if (n6 < 0) {
                throw new IOException("Invalid length");
            }
            acq.b(n6);
            n3 = n5 + n6;
        }
    }
    
    private final void e(final acq acq) {
        acq.b = ByteOrder.BIG_ENDIAN;
        final byte[] p = acu.p;
        final int length = p.length;
        acq.b(8);
        final int length2 = p.length;
        int n = 8;
        try {
            while (true) {
                final int int1 = acq.readInt();
                final byte[] array = new byte[4];
                if (acq.read(array) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int u;
                if ((u = n + 8) == 16) {
                    if (!Arrays.equals(array, acu.r)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    u = 16;
                }
                if (Arrays.equals(array, acu.s)) {
                    return;
                }
                if (Arrays.equals(array, acu.q)) {
                    final byte[] array2 = new byte[int1];
                    if (acq.read(array2) != int1) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Failed to read given length for given PNG chunk type: ");
                        sb.append(aaj.l(array));
                        throw new IOException(sb.toString());
                    }
                    final int int2 = acq.readInt();
                    final CRC32 crc32 = new CRC32();
                    crc32.update(array);
                    crc32.update(array2);
                    if ((int)crc32.getValue() == int2) {
                        this.U = u;
                        this.j(array2, 0);
                        this.m();
                        this.k(new acq(array2));
                        return;
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                    sb2.append(int2);
                    sb2.append(", calculated CRC value: ");
                    sb2.append(crc32.getValue());
                    throw new IOException(sb2.toString());
                }
                else {
                    final int n2 = int1 + 4;
                    acq.b(n2);
                    n = u + n2;
                }
            }
        }
        catch (final EOFException ex) {
            throw new IOException("Encountered corrupt PNG file.");
        }
    }
    
    private final void f(final acq acq) {
        acq.b = ByteOrder.LITTLE_ENDIAN;
        final int length = acu.t.length;
        acq.b(4);
        final int n = acq.readInt() + 8;
        final byte[] u = acu.u;
        final int length2 = u.length;
        acq.b(4);
        final int length3 = u.length;
        int n2 = 12;
        try {
            while (true) {
                final byte[] array = new byte[4];
                if (acq.read(array) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                final int int1 = acq.readInt();
                final int u2 = n2 + 8;
                if (Arrays.equals(acu.v, array)) {
                    final byte[] array2 = new byte[int1];
                    if (acq.read(array2) == int1) {
                        this.U = u2;
                        this.j(array2, 0);
                        this.k(new acq(array2));
                        return;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to read given length for given PNG chunk type: ");
                    sb.append(aaj.l(array));
                    throw new IOException(sb.toString());
                }
                else {
                    int n3;
                    if (int1 % 2 == 1) {
                        n3 = int1 + 1;
                    }
                    else {
                        n3 = int1;
                    }
                    final int n4 = u2 + n3;
                    if (n4 == n) {
                        return;
                    }
                    if (n4 > n) {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                    acq.b(n3);
                    n2 = n4;
                }
            }
        }
        catch (final EOFException ex) {
            throw new IOException("Encountered corrupt WebP file.");
        }
    }
    
    private final void g(final acq acq, final HashMap hashMap) {
        final acr acr = hashMap.get("JPEGInterchangeFormat");
        final acr acr2 = hashMap.get("JPEGInterchangeFormatLength");
        if (acr != null && acr2 != null) {
            int a = acr.a(this.j);
            final int a2 = acr2.a(this.j);
            if (this.Q == 7) {
                a += this.V;
            }
            if (a > 0 && a2 > 0 && this.P == null && this.O == null) {
                final byte[] array = new byte[a2];
                acq.skip(a);
                acq.read(array);
            }
        }
    }
    
    private final void h(final InputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_2       
        //     2: getstatic       acu.g:[[Lacs;
        //     5: arraylength    
        //     6: istore_3       
        //     7: iload_2        
        //     8: bipush          10
        //    10: if_icmpge       32
        //    13: aload_0        
        //    14: getfield        acu.R:[Ljava/util/HashMap;
        //    17: iload_2        
        //    18: new             Ljava/util/HashMap;
        //    21: dup            
        //    22: invokespecial   java/util/HashMap.<init>:()V
        //    25: aastore        
        //    26: iinc            2, 1
        //    29: goto            2
        //    32: new             Ljava/io/BufferedInputStream;
        //    35: astore          4
        //    37: aload           4
        //    39: aload_1        
        //    40: sipush          5000
        //    43: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;I)V
        //    46: aload           4
        //    48: sipush          5000
        //    51: invokevirtual   java/io/BufferedInputStream.mark:(I)V
        //    54: sipush          5000
        //    57: newarray        B
        //    59: astore          5
        //    61: aload           4
        //    63: aload           5
        //    65: invokevirtual   java/io/BufferedInputStream.read:([B)I
        //    68: pop            
        //    69: aload           4
        //    71: invokevirtual   java/io/BufferedInputStream.reset:()V
        //    74: iconst_0       
        //    75: istore_2       
        //    76: getstatic       acu.c:[B
        //    79: astore_1       
        //    80: aload_1        
        //    81: arraylength    
        //    82: istore_3       
        //    83: iload_2        
        //    84: iconst_3       
        //    85: if_icmpge       769
        //    88: aload           5
        //    90: iload_2        
        //    91: baload         
        //    92: aload_1        
        //    93: iload_2        
        //    94: baload         
        //    95: if_icmpeq       763
        //    98: ldc_w           "FUJIFILMCCD-RAW"
        //   101: invokestatic    java/nio/charset/Charset.defaultCharset:()Ljava/nio/charset/Charset;
        //   104: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //   107: astore_1       
        //   108: iconst_0       
        //   109: istore_2       
        //   110: iload_2        
        //   111: aload_1        
        //   112: arraylength    
        //   113: if_icmpge       757
        //   116: aload           5
        //   118: iload_2        
        //   119: baload         
        //   120: istore_3       
        //   121: aload_1        
        //   122: iload_2        
        //   123: baload         
        //   124: istore          6
        //   126: iload_3        
        //   127: iload           6
        //   129: if_icmpeq       751
        //   132: new             Lacq;
        //   135: astore_1       
        //   136: aload_1        
        //   137: aload           5
        //   139: invokespecial   acq.<init>:([B)V
        //   142: aload_1        
        //   143: invokevirtual   acq.readInt:()I
        //   146: i2l            
        //   147: lstore          7
        //   149: iconst_4       
        //   150: newarray        B
        //   152: astore          9
        //   154: aload_1        
        //   155: aload           9
        //   157: invokevirtual   acq.read:([B)I
        //   160: pop            
        //   161: aload           9
        //   163: getstatic       acu.k:[B
        //   166: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   169: ifne            175
        //   172: goto            430
        //   175: ldc2_w          16
        //   178: lstore          10
        //   180: lload           7
        //   182: lconst_1       
        //   183: lcmp           
        //   184: ifne            216
        //   187: aload_1        
        //   188: invokevirtual   acq.readLong:()J
        //   191: lstore          7
        //   193: lload           7
        //   195: ldc2_w          16
        //   198: lcmp           
        //   199: ifge            213
        //   202: aload_1        
        //   203: astore          9
        //   205: aload           9
        //   207: invokevirtual   acq.close:()V
        //   210: goto            436
        //   213: goto            221
        //   216: ldc2_w          8
        //   219: lstore          10
        //   221: lload           7
        //   223: lstore          12
        //   225: lload           7
        //   227: ldc2_w          5000
        //   230: lcmp           
        //   231: ifle            239
        //   234: ldc2_w          5000
        //   237: lstore          12
        //   239: lload           12
        //   241: lload           10
        //   243: lsub           
        //   244: lstore          10
        //   246: lload           10
        //   248: ldc2_w          8
        //   251: lcmp           
        //   252: ifge            258
        //   255: goto            430
        //   258: iconst_4       
        //   259: newarray        B
        //   261: astore          14
        //   263: lconst_0       
        //   264: lstore          7
        //   266: iconst_0       
        //   267: istore          6
        //   269: iconst_0       
        //   270: istore_2       
        //   271: aload_1        
        //   272: astore          9
        //   274: lload           7
        //   276: lload           10
        //   278: ldc2_w          4
        //   281: ldiv           
        //   282: lcmp           
        //   283: ifge            205
        //   286: aload_1        
        //   287: aload           14
        //   289: invokevirtual   acq.read:([B)I
        //   292: iconst_4       
        //   293: if_icmpeq       302
        //   296: aload_1        
        //   297: astore          9
        //   299: goto            205
        //   302: lload           7
        //   304: lconst_1       
        //   305: lcmp           
        //   306: ifne            316
        //   309: iload           6
        //   311: istore          15
        //   313: goto            385
        //   316: aload           14
        //   318: getstatic       acu.l:[B
        //   321: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   324: ifeq            332
        //   327: iconst_1       
        //   328: istore_3       
        //   329: goto            354
        //   332: aload           14
        //   334: getstatic       acu.m:[B
        //   337: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   340: istore          16
        //   342: iload_2        
        //   343: istore_3       
        //   344: iload           16
        //   346: ifeq            354
        //   349: iconst_1       
        //   350: istore          6
        //   352: iload_2        
        //   353: istore_3       
        //   354: iload           6
        //   356: istore          15
        //   358: iload_3        
        //   359: istore_2       
        //   360: iload_3        
        //   361: ifeq            385
        //   364: iload           6
        //   366: istore          15
        //   368: iload_3        
        //   369: istore_2       
        //   370: iload           6
        //   372: ifeq            385
        //   375: aload_1        
        //   376: invokevirtual   acq.close:()V
        //   379: bipush          12
        //   381: istore_2       
        //   382: goto            771
        //   385: lload           7
        //   387: lconst_1       
        //   388: ladd           
        //   389: lstore          7
        //   391: iload           15
        //   393: istore          6
        //   395: goto            271
        //   398: astore          9
        //   400: goto            412
        //   403: astore          9
        //   405: goto            426
        //   408: astore          9
        //   410: aconst_null    
        //   411: astore_1       
        //   412: aload_1        
        //   413: ifnull          420
        //   416: aload_1        
        //   417: invokevirtual   acq.close:()V
        //   420: aload           9
        //   422: athrow         
        //   423: astore_1       
        //   424: aconst_null    
        //   425: astore_1       
        //   426: aload_1        
        //   427: ifnull          436
        //   430: aload_1        
        //   431: astore          9
        //   433: goto            205
        //   436: new             Lacq;
        //   439: astore_1       
        //   440: aload_1        
        //   441: aload           5
        //   443: invokespecial   acq.<init>:([B)V
        //   446: aload_1        
        //   447: invokestatic    acu.r:(Lacq;)Ljava/nio/ByteOrder;
        //   450: astore          9
        //   452: aload_0        
        //   453: aload           9
        //   455: putfield        acu.j:Ljava/nio/ByteOrder;
        //   458: aload_1        
        //   459: aload           9
        //   461: putfield        acq.b:Ljava/nio/ByteOrder;
        //   464: aload_1        
        //   465: invokevirtual   acq.readShort:()S
        //   468: istore_2       
        //   469: iload_2        
        //   470: sipush          20306
        //   473: if_icmpeq       493
        //   476: iload_2        
        //   477: sipush          21330
        //   480: if_icmpne       488
        //   483: iconst_1       
        //   484: istore_2       
        //   485: goto            495
        //   488: iconst_0       
        //   489: istore_2       
        //   490: goto            495
        //   493: iconst_1       
        //   494: istore_2       
        //   495: aload_1        
        //   496: invokevirtual   acq.close:()V
        //   499: iload_2        
        //   500: ifeq            545
        //   503: bipush          7
        //   505: istore_2       
        //   506: goto            771
        //   509: astore          9
        //   511: goto            523
        //   514: astore          9
        //   516: goto            537
        //   519: astore          9
        //   521: aconst_null    
        //   522: astore_1       
        //   523: aload_1        
        //   524: ifnull          531
        //   527: aload_1        
        //   528: invokevirtual   acq.close:()V
        //   531: aload           9
        //   533: athrow         
        //   534: astore_1       
        //   535: aconst_null    
        //   536: astore_1       
        //   537: aload_1        
        //   538: ifnull          545
        //   541: aload_1        
        //   542: invokevirtual   acq.close:()V
        //   545: new             Lacq;
        //   548: astore_1       
        //   549: aload_1        
        //   550: aload           5
        //   552: invokespecial   acq.<init>:([B)V
        //   555: aload_1        
        //   556: invokestatic    acu.r:(Lacq;)Ljava/nio/ByteOrder;
        //   559: astore          9
        //   561: aload_0        
        //   562: aload           9
        //   564: putfield        acu.j:Ljava/nio/ByteOrder;
        //   567: aload_1        
        //   568: aload           9
        //   570: putfield        acq.b:Ljava/nio/ByteOrder;
        //   573: aload_1        
        //   574: invokevirtual   acq.readShort:()S
        //   577: istore_2       
        //   578: aload_1        
        //   579: invokevirtual   acq.close:()V
        //   582: iload_2        
        //   583: bipush          85
        //   585: if_icmpne       630
        //   588: bipush          10
        //   590: istore_2       
        //   591: goto            771
        //   594: astore          9
        //   596: goto            608
        //   599: astore          9
        //   601: goto            622
        //   604: astore          9
        //   606: aconst_null    
        //   607: astore_1       
        //   608: aload_1        
        //   609: ifnull          616
        //   612: aload_1        
        //   613: invokevirtual   acq.close:()V
        //   616: aload           9
        //   618: athrow         
        //   619: astore_1       
        //   620: aconst_null    
        //   621: astore_1       
        //   622: aload_1        
        //   623: ifnull          630
        //   626: aload_1        
        //   627: invokevirtual   acq.close:()V
        //   630: iconst_0       
        //   631: istore_2       
        //   632: getstatic       acu.p:[B
        //   635: astore_1       
        //   636: aload_1        
        //   637: arraylength    
        //   638: istore_3       
        //   639: iload_2        
        //   640: bipush          8
        //   642: if_icmpge       745
        //   645: aload           5
        //   647: iload_2        
        //   648: baload         
        //   649: aload_1        
        //   650: iload_2        
        //   651: baload         
        //   652: if_icmpeq       739
        //   655: iconst_0       
        //   656: istore_2       
        //   657: getstatic       acu.t:[B
        //   660: astore_1       
        //   661: aload_1        
        //   662: arraylength    
        //   663: istore_3       
        //   664: iload_2        
        //   665: iconst_4       
        //   666: if_icmpge       690
        //   669: aload           5
        //   671: iload_2        
        //   672: baload         
        //   673: aload_1        
        //   674: iload_2        
        //   675: baload         
        //   676: if_icmpeq       684
        //   679: iconst_0       
        //   680: istore_2       
        //   681: goto            771
        //   684: iinc            2, 1
        //   687: goto            657
        //   690: iconst_0       
        //   691: istore_2       
        //   692: getstatic       acu.u:[B
        //   695: astore_1       
        //   696: aload_1        
        //   697: arraylength    
        //   698: istore_3       
        //   699: iload_2        
        //   700: iconst_4       
        //   701: if_icmpge       733
        //   704: getstatic       acu.t:[B
        //   707: arraylength    
        //   708: istore_3       
        //   709: aload           5
        //   711: iload_2        
        //   712: bipush          8
        //   714: iadd           
        //   715: baload         
        //   716: aload_1        
        //   717: iload_2        
        //   718: baload         
        //   719: if_icmpeq       727
        //   722: iconst_0       
        //   723: istore_2       
        //   724: goto            771
        //   727: iinc            2, 1
        //   730: goto            692
        //   733: bipush          14
        //   735: istore_2       
        //   736: goto            771
        //   739: iinc            2, 1
        //   742: goto            632
        //   745: bipush          13
        //   747: istore_2       
        //   748: goto            771
        //   751: iinc            2, 1
        //   754: goto            110
        //   757: bipush          9
        //   759: istore_2       
        //   760: goto            771
        //   763: iinc            2, 1
        //   766: goto            76
        //   769: iconst_4       
        //   770: istore_2       
        //   771: aload_0        
        //   772: iload_2        
        //   773: putfield        acu.Q:I
        //   776: iload_2        
        //   777: iconst_4       
        //   778: if_icmpeq       1861
        //   781: iload_2        
        //   782: bipush          9
        //   784: if_icmpeq       1861
        //   787: iload_2        
        //   788: bipush          13
        //   790: if_icmpeq       1861
        //   793: iload_2        
        //   794: bipush          14
        //   796: if_icmpne       802
        //   799: goto            1861
        //   802: new             Lacq;
        //   805: astore          5
        //   807: aload           5
        //   809: aload           4
        //   811: aconst_null    
        //   812: invokespecial   acq.<init>:(Ljava/io/InputStream;[B)V
        //   815: aload_0        
        //   816: getfield        acu.Q:I
        //   819: istore_2       
        //   820: iload_2        
        //   821: bipush          12
        //   823: if_icmpne       1295
        //   826: new             Landroid/media/MediaMetadataRetriever;
        //   829: astore          14
        //   831: aload           14
        //   833: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //   836: new             Lacp;
        //   839: astore_1       
        //   840: aload_1        
        //   841: aload           5
        //   843: invokespecial   acp.<init>:(Lacq;)V
        //   846: aload           14
        //   848: aload_1        
        //   849: invokestatic    acw.a:(Landroid/media/MediaMetadataRetriever;Landroid/media/MediaDataSource;)V
        //   852: aload           14
        //   854: bipush          33
        //   856: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   859: astore          17
        //   861: aload           14
        //   863: bipush          34
        //   865: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   868: astore          18
        //   870: aload           14
        //   872: bipush          26
        //   874: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   877: astore_1       
        //   878: aload           14
        //   880: bipush          17
        //   882: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   885: astore          9
        //   887: ldc_w           "yes"
        //   890: aload_1        
        //   891: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   894: ifeq            926
        //   897: aload           14
        //   899: bipush          29
        //   901: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   904: astore_1       
        //   905: aload           14
        //   907: bipush          30
        //   909: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   912: astore          9
        //   914: aload           14
        //   916: bipush          31
        //   918: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   921: astore          4
        //   923: goto            974
        //   926: ldc_w           "yes"
        //   929: aload           9
        //   931: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   934: ifeq            966
        //   937: aload           14
        //   939: bipush          18
        //   941: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   944: astore_1       
        //   945: aload           14
        //   947: bipush          19
        //   949: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   952: astore          9
        //   954: aload           14
        //   956: bipush          24
        //   958: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   961: astore          4
        //   963: goto            974
        //   966: aconst_null    
        //   967: astore_1       
        //   968: aconst_null    
        //   969: astore          9
        //   971: aconst_null    
        //   972: astore          4
        //   974: aload_1        
        //   975: ifnull          1001
        //   978: aload_0        
        //   979: getfield        acu.R:[Ljava/util/HashMap;
        //   982: iconst_0       
        //   983: aaload         
        //   984: ldc             "ImageWidth"
        //   986: aload_1        
        //   987: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   990: aload_0        
        //   991: getfield        acu.j:Ljava/nio/ByteOrder;
        //   994: invokestatic    acr.e:(ILjava/nio/ByteOrder;)Lacr;
        //   997: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1000: pop            
        //  1001: aload           9
        //  1003: ifnull          1030
        //  1006: aload_0        
        //  1007: getfield        acu.R:[Ljava/util/HashMap;
        //  1010: iconst_0       
        //  1011: aaload         
        //  1012: ldc             "ImageLength"
        //  1014: aload           9
        //  1016: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1019: aload_0        
        //  1020: getfield        acu.j:Ljava/nio/ByteOrder;
        //  1023: invokestatic    acr.e:(ILjava/nio/ByteOrder;)Lacr;
        //  1026: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1029: pop            
        //  1030: aload           4
        //  1032: ifnull          1115
        //  1035: aload           4
        //  1037: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1040: lookupswitch {
        //               90: 1092
        //              180: 1087
        //              270: 1081
        //          default: 1076
        //        }
        //  1076: iconst_1       
        //  1077: istore_2       
        //  1078: goto            1095
        //  1081: bipush          8
        //  1083: istore_2       
        //  1084: goto            1095
        //  1087: iconst_3       
        //  1088: istore_2       
        //  1089: goto            1095
        //  1092: bipush          6
        //  1094: istore_2       
        //  1095: aload_0        
        //  1096: getfield        acu.R:[Ljava/util/HashMap;
        //  1099: iconst_0       
        //  1100: aaload         
        //  1101: ldc             "Orientation"
        //  1103: iload_2        
        //  1104: aload_0        
        //  1105: getfield        acu.j:Ljava/nio/ByteOrder;
        //  1108: invokestatic    acr.e:(ILjava/nio/ByteOrder;)Lacr;
        //  1111: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1114: pop            
        //  1115: aload           17
        //  1117: ifnull          1262
        //  1120: aload           18
        //  1122: ifnull          1262
        //  1125: aload           17
        //  1127: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1130: istore_2       
        //  1131: aload           18
        //  1133: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1136: istore_3       
        //  1137: iload_3        
        //  1138: bipush          6
        //  1140: if_icmple       1249
        //  1143: aload           5
        //  1145: iload_2        
        //  1146: i2l            
        //  1147: invokevirtual   acq.c:(J)V
        //  1150: bipush          6
        //  1152: newarray        B
        //  1154: astore_1       
        //  1155: aload           5
        //  1157: aload_1        
        //  1158: invokevirtual   acq.read:([B)I
        //  1161: bipush          6
        //  1163: if_icmpne       1236
        //  1166: iinc            3, -6
        //  1169: aload_1        
        //  1170: getstatic       acu.i:[B
        //  1173: invokestatic    java/util/Arrays.equals:([B[B)Z
        //  1176: ifeq            1223
        //  1179: iload_3        
        //  1180: newarray        B
        //  1182: astore_1       
        //  1183: aload           5
        //  1185: aload_1        
        //  1186: invokevirtual   acq.read:([B)I
        //  1189: iload_3        
        //  1190: if_icmpne       1210
        //  1193: aload_0        
        //  1194: iload_2        
        //  1195: bipush          6
        //  1197: iadd           
        //  1198: putfield        acu.U:I
        //  1201: aload_0        
        //  1202: aload_1        
        //  1203: iconst_0       
        //  1204: invokespecial   acu.j:([BI)V
        //  1207: goto            1262
        //  1210: new             Ljava/io/IOException;
        //  1213: astore_1       
        //  1214: aload_1        
        //  1215: ldc_w           "Can't read exif"
        //  1218: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1221: aload_1        
        //  1222: athrow         
        //  1223: new             Ljava/io/IOException;
        //  1226: astore_1       
        //  1227: aload_1        
        //  1228: ldc_w           "Invalid identifier"
        //  1231: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1234: aload_1        
        //  1235: athrow         
        //  1236: new             Ljava/io/IOException;
        //  1239: astore_1       
        //  1240: aload_1        
        //  1241: ldc_w           "Can't read identifier"
        //  1244: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1247: aload_1        
        //  1248: athrow         
        //  1249: new             Ljava/io/IOException;
        //  1252: astore_1       
        //  1253: aload_1        
        //  1254: ldc_w           "Invalid exif length"
        //  1257: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1260: aload_1        
        //  1261: athrow         
        //  1262: aload           14
        //  1264: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //  1267: goto            1842
        //  1270: astore_1       
        //  1271: goto            1288
        //  1274: astore_1       
        //  1275: new             Ljava/lang/UnsupportedOperationException;
        //  1278: astore_1       
        //  1279: aload_1        
        //  1280: ldc_w           "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
        //  1283: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //  1286: aload_1        
        //  1287: athrow         
        //  1288: aload           14
        //  1290: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //  1293: aload_1        
        //  1294: athrow         
        //  1295: iload_2        
        //  1296: bipush          7
        //  1298: if_icmpne       1718
        //  1301: aload_0        
        //  1302: aload           5
        //  1304: invokespecial   acu.o:(Lacq;)V
        //  1307: aload_0        
        //  1308: getfield        acu.R:[Ljava/util/HashMap;
        //  1311: iconst_1       
        //  1312: aaload         
        //  1313: ldc_w           "MakerNote"
        //  1316: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1319: checkcast       Lacr;
        //  1322: astore          9
        //  1324: aload           9
        //  1326: ifnull          1842
        //  1329: new             Lacq;
        //  1332: astore_1       
        //  1333: aload_1        
        //  1334: aload           9
        //  1336: getfield        acr.d:[B
        //  1339: aconst_null    
        //  1340: invokespecial   acq.<init>:([B[B)V
        //  1343: aload_1        
        //  1344: aload_0        
        //  1345: getfield        acu.j:Ljava/nio/ByteOrder;
        //  1348: putfield        acq.b:Ljava/nio/ByteOrder;
        //  1351: getstatic       acu.n:[B
        //  1354: astore          14
        //  1356: aload           14
        //  1358: arraylength    
        //  1359: istore_2       
        //  1360: bipush          6
        //  1362: newarray        B
        //  1364: astore          4
        //  1366: aload_1        
        //  1367: aload           4
        //  1369: invokevirtual   acq.readFully:([B)V
        //  1372: aload_1        
        //  1373: lconst_0       
        //  1374: invokevirtual   acq.c:(J)V
        //  1377: getstatic       acu.o:[B
        //  1380: astore          9
        //  1382: aload           9
        //  1384: arraylength    
        //  1385: istore_2       
        //  1386: bipush          10
        //  1388: newarray        B
        //  1390: astore          17
        //  1392: aload_1        
        //  1393: aload           17
        //  1395: invokevirtual   acq.readFully:([B)V
        //  1398: aload           4
        //  1400: aload           14
        //  1402: invokestatic    java/util/Arrays.equals:([B[B)Z
        //  1405: ifeq            1418
        //  1408: aload_1        
        //  1409: ldc2_w          8
        //  1412: invokevirtual   acq.c:(J)V
        //  1415: goto            1435
        //  1418: aload           17
        //  1420: aload           9
        //  1422: invokestatic    java/util/Arrays.equals:([B[B)Z
        //  1425: ifeq            1435
        //  1428: aload_1        
        //  1429: ldc2_w          12
        //  1432: invokevirtual   acq.c:(J)V
        //  1435: aload_0        
        //  1436: aload_1        
        //  1437: bipush          6
        //  1439: invokespecial   acu.p:(Lacq;I)V
        //  1442: aload_0        
        //  1443: getfield        acu.R:[Ljava/util/HashMap;
        //  1446: bipush          7
        //  1448: aaload         
        //  1449: ldc_w           "PreviewImageStart"
        //  1452: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1455: checkcast       Lacr;
        //  1458: astore_1       
        //  1459: aload_0        
        //  1460: getfield        acu.R:[Ljava/util/HashMap;
        //  1463: bipush          7
        //  1465: aaload         
        //  1466: ldc_w           "PreviewImageLength"
        //  1469: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1472: checkcast       Lacr;
        //  1475: astore          9
        //  1477: aload_1        
        //  1478: ifnull          1515
        //  1481: aload           9
        //  1483: ifnull          1515
        //  1486: aload_0        
        //  1487: getfield        acu.R:[Ljava/util/HashMap;
        //  1490: iconst_5       
        //  1491: aaload         
        //  1492: ldc_w           "JPEGInterchangeFormat"
        //  1495: aload_1        
        //  1496: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1499: pop            
        //  1500: aload_0        
        //  1501: getfield        acu.R:[Ljava/util/HashMap;
        //  1504: iconst_5       
        //  1505: aaload         
        //  1506: ldc_w           "JPEGInterchangeFormatLength"
        //  1509: aload           9
        //  1511: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1514: pop            
        //  1515: aload_0        
        //  1516: getfield        acu.R:[Ljava/util/HashMap;
        //  1519: bipush          8
        //  1521: aaload         
        //  1522: ldc_w           "AspectFrame"
        //  1525: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1528: checkcast       Lacr;
        //  1531: astore_1       
        //  1532: aload_1        
        //  1533: ifnull          1842
        //  1536: aload_1        
        //  1537: aload_0        
        //  1538: getfield        acu.j:Ljava/nio/ByteOrder;
        //  1541: invokevirtual   acr.f:(Ljava/nio/ByteOrder;)Ljava/lang/Object;
        //  1544: checkcast       [I
        //  1547: astore_1       
        //  1548: aload_1        
        //  1549: ifnull          1674
        //  1552: aload_1        
        //  1553: arraylength    
        //  1554: iconst_4       
        //  1555: if_icmpeq       1561
        //  1558: goto            1674
        //  1561: aload_1        
        //  1562: iconst_2       
        //  1563: iaload         
        //  1564: istore_2       
        //  1565: aload_1        
        //  1566: iconst_0       
        //  1567: iaload         
        //  1568: istore          15
        //  1570: iload_2        
        //  1571: iload           15
        //  1573: if_icmple       1842
        //  1576: aload_1        
        //  1577: iconst_3       
        //  1578: iaload         
        //  1579: istore_3       
        //  1580: aload_1        
        //  1581: iconst_1       
        //  1582: iaload         
        //  1583: istore          6
        //  1585: iload_3        
        //  1586: iload           6
        //  1588: if_icmple       1842
        //  1591: iload_2        
        //  1592: iload           15
        //  1594: isub           
        //  1595: iconst_1       
        //  1596: iadd           
        //  1597: istore_2       
        //  1598: iload_3        
        //  1599: iload           6
        //  1601: isub           
        //  1602: iconst_1       
        //  1603: iadd           
        //  1604: istore_3       
        //  1605: iload_2        
        //  1606: iload_3        
        //  1607: if_icmpge       1625
        //  1610: iload_2        
        //  1611: iload_3        
        //  1612: iadd           
        //  1613: istore_2       
        //  1614: iload_2        
        //  1615: iload_3        
        //  1616: isub           
        //  1617: istore_3       
        //  1618: iload_2        
        //  1619: iload_3        
        //  1620: isub           
        //  1621: istore_2       
        //  1622: goto            1625
        //  1625: iload_2        
        //  1626: aload_0        
        //  1627: getfield        acu.j:Ljava/nio/ByteOrder;
        //  1630: invokestatic    acr.e:(ILjava/nio/ByteOrder;)Lacr;
        //  1633: astore_1       
        //  1634: iload_3        
        //  1635: aload_0        
        //  1636: getfield        acu.j:Ljava/nio/ByteOrder;
        //  1639: invokestatic    acr.e:(ILjava/nio/ByteOrder;)Lacr;
        //  1642: astore          9
        //  1644: aload_0        
        //  1645: getfield        acu.R:[Ljava/util/HashMap;
        //  1648: iconst_0       
        //  1649: aaload         
        //  1650: ldc             "ImageWidth"
        //  1652: aload_1        
        //  1653: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1656: pop            
        //  1657: aload_0        
        //  1658: getfield        acu.R:[Ljava/util/HashMap;
        //  1661: iconst_0       
        //  1662: aaload         
        //  1663: ldc             "ImageLength"
        //  1665: aload           9
        //  1667: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1670: pop            
        //  1671: goto            1842
        //  1674: new             Ljava/lang/StringBuilder;
        //  1677: astore          9
        //  1679: aload           9
        //  1681: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1684: aload           9
        //  1686: ldc_w           "Invalid aspect frame values. frame="
        //  1689: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1692: pop            
        //  1693: aload           9
        //  1695: aload_1        
        //  1696: invokestatic    java/util/Arrays.toString:([I)Ljava/lang/String;
        //  1699: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1702: pop            
        //  1703: ldc_w           "ExifInterface"
        //  1706: aload           9
        //  1708: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1711: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  1714: pop            
        //  1715: goto            1842
        //  1718: iload_2        
        //  1719: bipush          10
        //  1721: if_icmpne       1836
        //  1724: aload_0        
        //  1725: aload           5
        //  1727: invokespecial   acu.o:(Lacq;)V
        //  1730: aload_0        
        //  1731: getfield        acu.R:[Ljava/util/HashMap;
        //  1734: iconst_0       
        //  1735: aaload         
        //  1736: ldc_w           "JpgFromRaw"
        //  1739: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1742: checkcast       Lacr;
        //  1745: astore_1       
        //  1746: aload_1        
        //  1747: ifnull          1776
        //  1750: new             Lacq;
        //  1753: astore          9
        //  1755: aload           9
        //  1757: aload_1        
        //  1758: getfield        acr.d:[B
        //  1761: invokespecial   acq.<init>:([B)V
        //  1764: aload_0        
        //  1765: aload           9
        //  1767: aload_1        
        //  1768: getfield        acr.c:J
        //  1771: l2i            
        //  1772: iconst_5       
        //  1773: invokespecial   acu.d:(Lacq;II)V
        //  1776: aload_0        
        //  1777: getfield        acu.R:[Ljava/util/HashMap;
        //  1780: iconst_0       
        //  1781: aaload         
        //  1782: ldc_w           "ISO"
        //  1785: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1788: checkcast       Lacr;
        //  1791: astore          9
        //  1793: aload_0        
        //  1794: getfield        acu.R:[Ljava/util/HashMap;
        //  1797: iconst_1       
        //  1798: aaload         
        //  1799: ldc_w           "PhotographicSensitivity"
        //  1802: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1805: checkcast       Lacr;
        //  1808: astore_1       
        //  1809: aload           9
        //  1811: ifnull          1842
        //  1814: aload_1        
        //  1815: ifnonnull       1842
        //  1818: aload_0        
        //  1819: getfield        acu.R:[Ljava/util/HashMap;
        //  1822: iconst_1       
        //  1823: aaload         
        //  1824: ldc_w           "PhotographicSensitivity"
        //  1827: aload           9
        //  1829: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1832: pop            
        //  1833: goto            1842
        //  1836: aload_0        
        //  1837: aload           5
        //  1839: invokespecial   acu.o:(Lacq;)V
        //  1842: aload           5
        //  1844: aload_0        
        //  1845: getfield        acu.U:I
        //  1848: i2l            
        //  1849: invokevirtual   acq.c:(J)V
        //  1852: aload_0        
        //  1853: aload           5
        //  1855: invokespecial   acu.k:(Lacq;)V
        //  1858: goto            2159
        //  1861: new             Lacq;
        //  1864: astore_1       
        //  1865: aload_1        
        //  1866: aload           4
        //  1868: invokespecial   acq.<init>:(Ljava/io/InputStream;)V
        //  1871: aload_0        
        //  1872: getfield        acu.Q:I
        //  1875: istore_2       
        //  1876: iload_2        
        //  1877: iconst_4       
        //  1878: if_icmpne       1891
        //  1881: aload_0        
        //  1882: aload_1        
        //  1883: iconst_0       
        //  1884: iconst_0       
        //  1885: invokespecial   acu.d:(Lacq;II)V
        //  1888: goto            2159
        //  1891: iload_2        
        //  1892: bipush          13
        //  1894: if_icmpne       1905
        //  1897: aload_0        
        //  1898: aload_1        
        //  1899: invokespecial   acu.e:(Lacq;)V
        //  1902: goto            2159
        //  1905: iload_2        
        //  1906: bipush          9
        //  1908: if_icmpne       2148
        //  1911: aload_1        
        //  1912: bipush          84
        //  1914: invokevirtual   acq.b:(I)V
        //  1917: iconst_4       
        //  1918: newarray        B
        //  1920: astore          4
        //  1922: iconst_4       
        //  1923: newarray        B
        //  1925: astore          5
        //  1927: iconst_4       
        //  1928: newarray        B
        //  1930: astore          9
        //  1932: aload_1        
        //  1933: aload           4
        //  1935: invokevirtual   acq.read:([B)I
        //  1938: pop            
        //  1939: aload_1        
        //  1940: aload           5
        //  1942: invokevirtual   acq.read:([B)I
        //  1945: pop            
        //  1946: aload_1        
        //  1947: aload           9
        //  1949: invokevirtual   acq.read:([B)I
        //  1952: pop            
        //  1953: aload           4
        //  1955: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //  1958: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //  1961: istore          6
        //  1963: aload           5
        //  1965: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //  1968: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //  1971: istore_3       
        //  1972: aload           9
        //  1974: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //  1977: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //  1980: istore_2       
        //  1981: iload_3        
        //  1982: newarray        B
        //  1984: astore          4
        //  1986: aload_1        
        //  1987: iload           6
        //  1989: aload_1        
        //  1990: getfield        acq.c:I
        //  1993: isub           
        //  1994: invokevirtual   acq.b:(I)V
        //  1997: aload_1        
        //  1998: aload           4
        //  2000: invokevirtual   acq.read:([B)I
        //  2003: pop            
        //  2004: new             Lacq;
        //  2007: astore          9
        //  2009: aload           9
        //  2011: aload           4
        //  2013: invokespecial   acq.<init>:([B)V
        //  2016: aload_0        
        //  2017: aload           9
        //  2019: iload           6
        //  2021: iconst_5       
        //  2022: invokespecial   acu.d:(Lacq;II)V
        //  2025: aload_1        
        //  2026: iload_2        
        //  2027: aload_1        
        //  2028: getfield        acq.c:I
        //  2031: isub           
        //  2032: invokevirtual   acq.b:(I)V
        //  2035: aload_1        
        //  2036: getstatic       java/nio/ByteOrder.BIG_ENDIAN:Ljava/nio/ByteOrder;
        //  2039: putfield        acq.b:Ljava/nio/ByteOrder;
        //  2042: aload_1        
        //  2043: invokevirtual   acq.readInt:()I
        //  2046: istore_3       
        //  2047: iconst_0       
        //  2048: istore_2       
        //  2049: iload_2        
        //  2050: iload_3        
        //  2051: if_icmpge       2159
        //  2054: aload_1        
        //  2055: invokevirtual   acq.readUnsignedShort:()I
        //  2058: istore          6
        //  2060: aload_1        
        //  2061: invokevirtual   acq.readUnsignedShort:()I
        //  2064: istore          15
        //  2066: iload           6
        //  2068: getstatic       acu.D:Lacs;
        //  2071: getfield        acs.a:I
        //  2074: if_icmpne       2136
        //  2077: aload_1        
        //  2078: invokevirtual   acq.readShort:()S
        //  2081: istore_2       
        //  2082: aload_1        
        //  2083: invokevirtual   acq.readShort:()S
        //  2086: istore_3       
        //  2087: iload_2        
        //  2088: aload_0        
        //  2089: getfield        acu.j:Ljava/nio/ByteOrder;
        //  2092: invokestatic    acr.e:(ILjava/nio/ByteOrder;)Lacr;
        //  2095: astore          9
        //  2097: iload_3        
        //  2098: aload_0        
        //  2099: getfield        acu.j:Ljava/nio/ByteOrder;
        //  2102: invokestatic    acr.e:(ILjava/nio/ByteOrder;)Lacr;
        //  2105: astore_1       
        //  2106: aload_0        
        //  2107: getfield        acu.R:[Ljava/util/HashMap;
        //  2110: iconst_0       
        //  2111: aaload         
        //  2112: ldc             "ImageLength"
        //  2114: aload           9
        //  2116: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2119: pop            
        //  2120: aload_0        
        //  2121: getfield        acu.R:[Ljava/util/HashMap;
        //  2124: iconst_0       
        //  2125: aaload         
        //  2126: ldc             "ImageWidth"
        //  2128: aload_1        
        //  2129: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2132: pop            
        //  2133: goto            2159
        //  2136: aload_1        
        //  2137: iload           15
        //  2139: invokevirtual   acq.b:(I)V
        //  2142: iinc            2, 1
        //  2145: goto            2049
        //  2148: iload_2        
        //  2149: bipush          14
        //  2151: if_icmpne       2159
        //  2154: aload_0        
        //  2155: aload_1        
        //  2156: invokespecial   acu.f:(Lacq;)V
        //  2159: aload_0        
        //  2160: invokespecial   acu.c:()V
        //  2163: return         
        //  2164: astore_1       
        //  2165: aload_0        
        //  2166: invokespecial   acu.c:()V
        //  2169: aload_1        
        //  2170: athrow         
        //  2171: astore_1       
        //  2172: goto            2159
        //  2175: astore_1       
        //  2176: goto            2159
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  2      7      2175   2179   Ljava/io/IOException;
        //  2      7      2171   2175   Ljava/lang/UnsupportedOperationException;
        //  2      7      2164   2171   Any
        //  13     26     2175   2179   Ljava/io/IOException;
        //  13     26     2171   2175   Ljava/lang/UnsupportedOperationException;
        //  13     26     2164   2171   Any
        //  32     74     2175   2179   Ljava/io/IOException;
        //  32     74     2171   2175   Ljava/lang/UnsupportedOperationException;
        //  32     74     2164   2171   Any
        //  76     83     2175   2179   Ljava/io/IOException;
        //  76     83     2171   2175   Ljava/lang/UnsupportedOperationException;
        //  76     83     2164   2171   Any
        //  98     108    2175   2179   Ljava/io/IOException;
        //  98     108    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  98     108    2164   2171   Any
        //  110    116    2175   2179   Ljava/io/IOException;
        //  110    116    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  110    116    2164   2171   Any
        //  132    142    423    426    Ljava/lang/Exception;
        //  132    142    408    412    Any
        //  142    172    403    408    Ljava/lang/Exception;
        //  142    172    398    403    Any
        //  187    193    403    408    Ljava/lang/Exception;
        //  187    193    398    403    Any
        //  205    210    2175   2179   Ljava/io/IOException;
        //  205    210    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  205    210    2164   2171   Any
        //  258    263    403    408    Ljava/lang/Exception;
        //  258    263    398    403    Any
        //  274    296    403    408    Ljava/lang/Exception;
        //  274    296    398    403    Any
        //  316    327    403    408    Ljava/lang/Exception;
        //  316    327    398    403    Any
        //  332    342    403    408    Ljava/lang/Exception;
        //  332    342    398    403    Any
        //  375    379    2175   2179   Ljava/io/IOException;
        //  375    379    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  375    379    2164   2171   Any
        //  416    420    2175   2179   Ljava/io/IOException;
        //  416    420    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  416    420    2164   2171   Any
        //  420    423    2175   2179   Ljava/io/IOException;
        //  420    423    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  420    423    2164   2171   Any
        //  436    446    534    537    Ljava/lang/Exception;
        //  436    446    519    523    Any
        //  446    469    514    519    Ljava/lang/Exception;
        //  446    469    509    514    Any
        //  495    499    2175   2179   Ljava/io/IOException;
        //  495    499    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  495    499    2164   2171   Any
        //  527    531    2175   2179   Ljava/io/IOException;
        //  527    531    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  527    531    2164   2171   Any
        //  531    534    2175   2179   Ljava/io/IOException;
        //  531    534    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  531    534    2164   2171   Any
        //  541    545    2175   2179   Ljava/io/IOException;
        //  541    545    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  541    545    2164   2171   Any
        //  545    555    619    622    Ljava/lang/Exception;
        //  545    555    604    608    Any
        //  555    578    599    604    Ljava/lang/Exception;
        //  555    578    594    599    Any
        //  578    582    2175   2179   Ljava/io/IOException;
        //  578    582    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  578    582    2164   2171   Any
        //  612    616    2175   2179   Ljava/io/IOException;
        //  612    616    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  612    616    2164   2171   Any
        //  616    619    2175   2179   Ljava/io/IOException;
        //  616    619    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  616    619    2164   2171   Any
        //  626    630    2175   2179   Ljava/io/IOException;
        //  626    630    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  626    630    2164   2171   Any
        //  632    639    2175   2179   Ljava/io/IOException;
        //  632    639    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  632    639    2164   2171   Any
        //  657    664    2175   2179   Ljava/io/IOException;
        //  657    664    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  657    664    2164   2171   Any
        //  692    699    2175   2179   Ljava/io/IOException;
        //  692    699    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  692    699    2164   2171   Any
        //  704    709    2175   2179   Ljava/io/IOException;
        //  704    709    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  704    709    2164   2171   Any
        //  771    776    2175   2179   Ljava/io/IOException;
        //  771    776    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  771    776    2164   2171   Any
        //  802    820    2175   2179   Ljava/io/IOException;
        //  802    820    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  802    820    2164   2171   Any
        //  826    836    2175   2179   Ljava/io/IOException;
        //  826    836    2171   2175   Ljava/lang/UnsupportedOperationException;
        //  826    836    2164   2171   Any
        //  836    923    1274   1288   Ljava/lang/RuntimeException;
        //  836    923    1270   1274   Any
        //  926    963    1274   1288   Ljava/lang/RuntimeException;
        //  926    963    1270   1274   Any
        //  978    1001   1274   1288   Ljava/lang/RuntimeException;
        //  978    1001   1270   1274   Any
        //  1006   1030   1274   1288   Ljava/lang/RuntimeException;
        //  1006   1030   1270   1274   Any
        //  1035   1076   1274   1288   Ljava/lang/RuntimeException;
        //  1035   1076   1270   1274   Any
        //  1095   1115   1274   1288   Ljava/lang/RuntimeException;
        //  1095   1115   1270   1274   Any
        //  1125   1137   1274   1288   Ljava/lang/RuntimeException;
        //  1125   1137   1270   1274   Any
        //  1143   1166   1274   1288   Ljava/lang/RuntimeException;
        //  1143   1166   1270   1274   Any
        //  1169   1207   1274   1288   Ljava/lang/RuntimeException;
        //  1169   1207   1270   1274   Any
        //  1210   1223   1274   1288   Ljava/lang/RuntimeException;
        //  1210   1223   1270   1274   Any
        //  1223   1236   1274   1288   Ljava/lang/RuntimeException;
        //  1223   1236   1270   1274   Any
        //  1236   1249   1274   1288   Ljava/lang/RuntimeException;
        //  1236   1249   1270   1274   Any
        //  1249   1262   1274   1288   Ljava/lang/RuntimeException;
        //  1249   1262   1270   1274   Any
        //  1262   1267   2175   2179   Ljava/io/IOException;
        //  1262   1267   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1262   1267   2164   2171   Any
        //  1275   1288   1270   1274   Any
        //  1288   1295   2175   2179   Ljava/io/IOException;
        //  1288   1295   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1288   1295   2164   2171   Any
        //  1301   1324   2175   2179   Ljava/io/IOException;
        //  1301   1324   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1301   1324   2164   2171   Any
        //  1329   1415   2175   2179   Ljava/io/IOException;
        //  1329   1415   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1329   1415   2164   2171   Any
        //  1418   1435   2175   2179   Ljava/io/IOException;
        //  1418   1435   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1418   1435   2164   2171   Any
        //  1435   1477   2175   2179   Ljava/io/IOException;
        //  1435   1477   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1435   1477   2164   2171   Any
        //  1486   1515   2175   2179   Ljava/io/IOException;
        //  1486   1515   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1486   1515   2164   2171   Any
        //  1515   1532   2175   2179   Ljava/io/IOException;
        //  1515   1532   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1515   1532   2164   2171   Any
        //  1536   1548   2175   2179   Ljava/io/IOException;
        //  1536   1548   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1536   1548   2164   2171   Any
        //  1552   1558   2175   2179   Ljava/io/IOException;
        //  1552   1558   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1552   1558   2164   2171   Any
        //  1625   1671   2175   2179   Ljava/io/IOException;
        //  1625   1671   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1625   1671   2164   2171   Any
        //  1674   1715   2175   2179   Ljava/io/IOException;
        //  1674   1715   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1674   1715   2164   2171   Any
        //  1724   1746   2175   2179   Ljava/io/IOException;
        //  1724   1746   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1724   1746   2164   2171   Any
        //  1750   1776   2175   2179   Ljava/io/IOException;
        //  1750   1776   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1750   1776   2164   2171   Any
        //  1776   1809   2175   2179   Ljava/io/IOException;
        //  1776   1809   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1776   1809   2164   2171   Any
        //  1818   1833   2175   2179   Ljava/io/IOException;
        //  1818   1833   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1818   1833   2164   2171   Any
        //  1836   1842   2175   2179   Ljava/io/IOException;
        //  1836   1842   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1836   1842   2164   2171   Any
        //  1842   1858   2175   2179   Ljava/io/IOException;
        //  1842   1858   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1842   1858   2164   2171   Any
        //  1861   1876   2175   2179   Ljava/io/IOException;
        //  1861   1876   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1861   1876   2164   2171   Any
        //  1881   1888   2175   2179   Ljava/io/IOException;
        //  1881   1888   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1881   1888   2164   2171   Any
        //  1897   1902   2175   2179   Ljava/io/IOException;
        //  1897   1902   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1897   1902   2164   2171   Any
        //  1911   2047   2175   2179   Ljava/io/IOException;
        //  1911   2047   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  1911   2047   2164   2171   Any
        //  2054   2133   2175   2179   Ljava/io/IOException;
        //  2054   2133   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  2054   2133   2164   2171   Any
        //  2136   2142   2175   2179   Ljava/io/IOException;
        //  2136   2142   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  2136   2142   2164   2171   Any
        //  2154   2159   2175   2179   Ljava/io/IOException;
        //  2154   2159   2171   2175   Ljava/lang/UnsupportedOperationException;
        //  2154   2159   2164   2171   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1210:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void i(final acq acq) {
        final ByteOrder r = r(acq);
        this.j = r;
        acq.b = r;
        final int unsignedShort = acq.readUnsignedShort();
        final int q = this.Q;
        if (q != 7 && q != 10 && unsignedShort != 42) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid start code: ");
            sb.append(Integer.toHexString(unsignedShort));
            throw new IOException(sb.toString());
        }
        int int1 = acq.readInt();
        if (int1 < 8) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid first Ifd offset: ");
            sb2.append(int1);
            throw new IOException(sb2.toString());
        }
        int1 -= 8;
        if (int1 > 0) {
            acq.b(int1);
        }
    }
    
    private final void j(final byte[] array, final int n) {
        final acq acq = new acq(array, null);
        this.i(acq);
        this.p(acq, n);
    }
    
    private final void k(final acq acq) {
        final HashMap hashMap = this.R[4];
        final acr acr = hashMap.get("Compression");
        if (acr != null) {
            Label_0516: {
                switch (acr.a(this.j)) {
                    case 6: {
                        this.g(acq, hashMap);
                        return;
                    }
                    case 1:
                    case 7: {
                        final acr acr2 = hashMap.get("BitsPerSample");
                        if (acr2 == null) {
                            break;
                        }
                        final int[] array = (int[])acr2.f(this.j);
                        final int[] a = acu.a;
                        if (!Arrays.equals(a, array)) {
                            if (this.Q != 3) {
                                break;
                            }
                            final acr acr3 = hashMap.get("PhotometricInterpretation");
                            if (acr3 == null) {
                                break;
                            }
                            final int a2 = acr3.a(this.j);
                            if (a2 == 1) {
                                if (!Arrays.equals(array, acu.b)) {
                                    break;
                                }
                            }
                            else if (a2 != 6 || !Arrays.equals(array, a)) {
                                break;
                            }
                        }
                        final acr acr4 = hashMap.get("StripOffsets");
                        final acr acr5 = hashMap.get("StripByteCounts");
                        if (acr4 != null && acr5 != null) {
                            final long[] n = aaj.n(acr4.f(this.j));
                            final long[] n2 = aaj.n(acr5.f(this.j));
                            if (n != null) {
                                final int length = n.length;
                                if (length != 0) {
                                    if (n2 != null) {
                                        final int length2 = n2.length;
                                        if (length2 != 0) {
                                            if (length != length2) {
                                                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                                return;
                                            }
                                            long n3 = 0L;
                                            for (int i = 0; i < length2; ++i) {
                                                n3 += n2[i];
                                            }
                                            final byte[] array2 = new byte[(int)n3];
                                            this.T = true;
                                            int n4 = 0;
                                            int n5 = 0;
                                            int n6 = 0;
                                            while (true) {
                                                final int length3 = n.length;
                                                if (n4 < length3) {
                                                    final int n7 = (int)n[n4];
                                                    final int n8 = (int)n2[n4];
                                                    if (n4 < length3 - 1 && n7 + n8 != n[n4 + 1]) {
                                                        this.T = false;
                                                    }
                                                    final int n9 = n7 - n5;
                                                    if (n9 < 0) {
                                                        break Label_0516;
                                                    }
                                                    final long n10 = n9;
                                                    if (acq.skip(n10) != n10) {
                                                        break Label_0516;
                                                    }
                                                    final byte[] array3 = new byte[n8];
                                                    if (acq.read(array3) != n8) {
                                                        break Label_0516;
                                                    }
                                                    n5 = n5 + n9 + n8;
                                                    System.arraycopy(array3, 0, array2, n6, n8);
                                                    n6 += n8;
                                                    ++n4;
                                                }
                                                else {
                                                    if (this.T) {
                                                        final long n11 = n[0];
                                                        return;
                                                    }
                                                    break Label_0516;
                                                }
                                            }
                                        }
                                    }
                                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                                    return;
                                }
                            }
                            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                            return;
                        }
                        break;
                    }
                }
            }
            return;
        }
        this.g(acq, hashMap);
    }
    
    private final void l(final int n, final int n2) {
        if (!this.R[n].isEmpty() && !this.R[n2].isEmpty()) {
            final acr acr = this.R[n].get("ImageLength");
            final acr acr2 = this.R[n].get("ImageWidth");
            final acr acr3 = this.R[n2].get("ImageLength");
            final acr acr4 = this.R[n2].get("ImageWidth");
            if (acr != null) {
                if (acr2 != null) {
                    if (acr3 != null && acr4 != null) {
                        final int a = acr.a(this.j);
                        final int a2 = acr2.a(this.j);
                        final int a3 = acr3.a(this.j);
                        final int a4 = acr4.a(this.j);
                        if (a < a3 && a2 < a4) {
                            final HashMap[] r = this.R;
                            final HashMap hashMap = r[n];
                            r[n] = r[n2];
                            r[n2] = hashMap;
                        }
                    }
                }
            }
        }
    }
    
    private final void m() {
        this.l(0, 5);
        this.l(0, 4);
        this.l(5, 4);
        final acr acr = this.R[1].get("PixelXDimension");
        final acr acr2 = this.R[1].get("PixelYDimension");
        if (acr != null && acr2 != null) {
            this.R[0].put("ImageWidth", acr);
            this.R[0].put("ImageLength", acr2);
        }
        if (this.R[4].isEmpty() && this.n(this.R[5])) {
            final HashMap[] r = this.R;
            r[4] = r[5];
            r[5] = new HashMap();
        }
        this.n(this.R[4]);
    }
    
    private final boolean n(final HashMap hashMap) {
        final acr acr = hashMap.get("ImageLength");
        final acr acr2 = hashMap.get("ImageWidth");
        if (acr != null && acr2 != null) {
            final int a = acr.a(this.j);
            final int a2 = acr2.a(this.j);
            if (a <= 512 && a2 <= 512) {
                return true;
            }
        }
        return false;
    }
    
    private final void o(acq acq) {
        this.i(acq);
        this.p(acq, 0);
        this.q(acq, 0);
        this.q(acq, 5);
        this.q(acq, 4);
        this.m();
        if (this.Q == 8) {
            final acr acr = this.R[1].get("MakerNote");
            if (acr != null) {
                acq = new acq(acr.d, null);
                acq.b = this.j;
                acq.b(6);
                this.p(acq, 9);
                final acr acr2 = this.R[9].get("ColorSpace");
                if (acr2 != null) {
                    this.R[1].put("ColorSpace", acr2);
                }
            }
        }
    }
    
    private final void p(final acq acq, int int1) {
        this.S.add(acq.c);
        final short short1 = acq.readShort();
        if (short1 > 0) {
            short n = 0;
            while (true) {
                final int n2 = int1;
                if (n >= short1) {
                    break;
                }
                final int unsignedShort = acq.readUnsignedShort();
                int unsignedShort2 = acq.readUnsignedShort();
                final int int2 = acq.readInt();
                final long n3 = acq.c + 4L;
                final HashMap hashMap = acu.J[n2];
                final Integer value = unsignedShort;
                final acs acs = hashMap.get(value);
                long n4 = 0L;
                int n6 = 0;
                int n7 = 0;
                Label_0349: {
                    if (acs == null) {
                        n4 = 0L;
                        final int n5 = 0;
                        n6 = unsignedShort2;
                        n7 = n5;
                    }
                    else {
                        Label_0346: {
                            Label_0339: {
                                if (unsignedShort2 > 0) {
                                    final int[] e = acu.e;
                                    final int length = e.length;
                                    if (unsignedShort2 >= 14) {
                                        n4 = 0L;
                                        final int n8 = 0;
                                        n6 = unsignedShort2;
                                        n7 = n8;
                                        break Label_0349;
                                    }
                                    final int c = acs.c;
                                    if (c != 7) {
                                        if (unsignedShort2 != 7) {
                                            Label_0253: {
                                                if (c != unsignedShort2) {
                                                    final int d = acs.d;
                                                    if (d != unsignedShort2) {
                                                        int n9 = d;
                                                        Label_0229: {
                                                            if (c != 4) {
                                                                if ((n9 = d) != 4) {
                                                                    break Label_0229;
                                                                }
                                                                n9 = 4;
                                                            }
                                                            if (unsignedShort2 == 3) {
                                                                break Label_0253;
                                                            }
                                                        }
                                                        if (c != 9 && n9 != 9) {
                                                            break Label_0339;
                                                        }
                                                        if (unsignedShort2 != 8) {
                                                            break Label_0339;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (unsignedShort2 == 7) {
                                        unsignedShort2 = c;
                                    }
                                    final long n10 = n4 = e[unsignedShort2] * (long)int2;
                                    n6 = unsignedShort2;
                                    if (n10 < 0L) {
                                        break Label_0346;
                                    }
                                    if (n10 > 2147483647L) {
                                        n4 = n10;
                                        n6 = unsignedShort2;
                                        break Label_0346;
                                    }
                                    final int n11 = 1;
                                    n4 = n10;
                                    n6 = unsignedShort2;
                                    n7 = n11;
                                    break Label_0349;
                                }
                            }
                            n4 = 0L;
                            n6 = unsignedShort2;
                        }
                        n7 = 0;
                    }
                }
                if (n7 == 0) {
                    acq.c(n3);
                }
                else {
                    int n12;
                    if (n4 > 4L) {
                        final int int3 = acq.readInt();
                        Label_0555: {
                            if (this.Q == 7) {
                                if ("MakerNote".equals(acs.b)) {
                                    this.V = int3;
                                }
                                else if (n2 == 6) {
                                    if ("ThumbnailImage".equals(acs.b)) {
                                        this.W = int3;
                                        this.X = int2;
                                        final acr e2 = acr.e(6, this.j);
                                        final acr c2 = acr.c(this.W, this.j);
                                        final acr c3 = acr.c(this.X, this.j);
                                        this.R[4].put("Compression", e2);
                                        this.R[4].put("JPEGInterchangeFormat", c2);
                                        this.R[4].put("JPEGInterchangeFormatLength", c3);
                                    }
                                    n12 = 6;
                                    break Label_0555;
                                }
                            }
                            n12 = int1;
                        }
                        acq.c(int3);
                    }
                    else {
                        n12 = int1;
                    }
                    final Integer n13 = acu.M.get(value);
                    if (n13 != null) {
                        long a = 0L;
                        switch (n6) {
                            default: {
                                a = -1L;
                                break;
                            }
                            case 9:
                            case 13: {
                                a = acq.readInt();
                                break;
                            }
                            case 8: {
                                a = acq.readShort();
                                break;
                            }
                            case 4: {
                                a = acq.a();
                                break;
                            }
                            case 3: {
                                a = acq.readUnsignedShort();
                                break;
                            }
                        }
                        if (a > 0L && !this.S.contains((int)a)) {
                            acq.c(a);
                            this.p(acq, n13);
                        }
                        acq.c(n3);
                    }
                    else {
                        final int c4 = acq.c;
                        final int u = this.U;
                        final byte[] array = new byte[(int)n4];
                        acq.readFully(array);
                        final acr acr = new acr(n6, int2, c4 + u, array);
                        this.R[n12].put(acs.b, acr);
                        if ("DNGVersion".equals(acs.b)) {
                            this.Q = 3;
                        }
                        if ((("Make".equals(acs.b) || "Model".equals(acs.b)) && acr.g(this.j).contains("PENTAX")) || ("Compression".equals(acs.b) && acr.a(this.j) == 65535)) {
                            this.Q = 8;
                        }
                        if (acq.c != n3) {
                            acq.c(n3);
                        }
                    }
                }
                ++n;
            }
            int1 = acq.readInt();
            final long n14 = int1;
            if (n14 > 0L && !this.S.contains(int1)) {
                acq.c(n14);
                if (this.R[4].isEmpty()) {
                    this.p(acq, 4);
                    return;
                }
                if (this.R[5].isEmpty()) {
                    this.p(acq, 5);
                }
            }
        }
    }
    
    private final void q(final acq acq, final int n) {
        final acr acr = this.R[n].get("DefaultCropSize");
        final acr acr2 = this.R[n].get("SensorTopBorder");
        final acr acr3 = this.R[n].get("SensorLeftBorder");
        final acr acr4 = this.R[n].get("SensorBottomBorder");
        final acr acr5 = this.R[n].get("SensorRightBorder");
        if (acr != null) {
            acr acr6;
            acr acr7;
            if (acr.a == 5) {
                final act[] array = (act[])acr.f(this.j);
                if (array == null || array.length != 2) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    sb.append(Arrays.toString(array));
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                acr6 = acr.d(array[0], this.j);
                acr7 = acr.d(array[1], this.j);
            }
            else {
                final int[] array2 = (int[])acr.f(this.j);
                if (array2 == null || array2.length != 2) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid crop size values. cropSize=");
                    sb2.append(Arrays.toString(array2));
                    Log.w("ExifInterface", sb2.toString());
                    return;
                }
                acr6 = acr.e(array2[0], this.j);
                acr7 = acr.e(array2[1], this.j);
            }
            this.R[n].put("ImageWidth", acr6);
            this.R[n].put("ImageLength", acr7);
            return;
        }
        if (acr2 != null && acr3 != null && acr4 != null && acr5 != null) {
            final int a = acr2.a(this.j);
            final int a2 = acr4.a(this.j);
            final int a3 = acr5.a(this.j);
            final int a4 = acr3.a(this.j);
            if (a2 > a && a3 > a4) {
                final acr e = acr.e(a2 - a, this.j);
                final acr e2 = acr.e(a3 - a4, this.j);
                this.R[n].put("ImageLength", e);
                this.R[n].put("ImageWidth", e2);
            }
        }
        else {
            final acr acr8 = this.R[n].get("ImageLength");
            final acr acr9 = this.R[n].get("ImageWidth");
            if (acr8 == null || acr9 == null) {
                final acr acr10 = this.R[n].get("JPEGInterchangeFormat");
                final acr acr11 = this.R[n].get("JPEGInterchangeFormatLength");
                if (acr10 != null && acr11 != null) {
                    final int a5 = acr10.a(this.j);
                    final int a6 = acr10.a(this.j);
                    acq.c(a5);
                    final byte[] array3 = new byte[a6];
                    acq.read(array3);
                    this.d(new acq(array3), a5, n);
                }
            }
        }
    }
    
    private static final ByteOrder r(final acq acq) {
        final short short1 = acq.readShort();
        switch (short1) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid byte order: ");
                sb.append(Integer.toHexString(short1));
                throw new IOException(sb.toString());
            }
            case 19789: {
                return ByteOrder.BIG_ENDIAN;
            }
            case 18761: {
                return ByteOrder.LITTLE_ENDIAN;
            }
        }
    }
    
    public final acr a(final String s) {
        String s2 = s;
        if ("ISOSpeedRatings".equals(s)) {
            s2 = "PhotographicSensitivity";
        }
        int n = 0;
        while (true) {
            final int length = acu.g.length;
            if (n >= 10) {
                return null;
            }
            final acr acr = this.R[n].get(s2);
            if (acr != null) {
                return acr;
            }
            ++n;
        }
    }
    
    public final String b(final String s) {
        final acr a = this.a(s);
        if (a != null) {
            if (!acu.L.contains(s)) {
                return a.g(this.j);
            }
            if (s.equals("GPSTimeStamp")) {
                final int a2 = a.a;
                if (a2 != 5 && a2 != 10) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("GPS Timestamp format is not rational. format=");
                    sb.append(a.a);
                    Log.w("ExifInterface", sb.toString());
                    return null;
                }
                final act[] array = (act[])a.f(this.j);
                if (array != null && array.length == 3) {
                    final act act = array[0];
                    final int n = (int)(act.a / (float)act.b);
                    final act act2 = array[1];
                    final int n2 = (int)(act2.a / (float)act2.b);
                    final act act3 = array[2];
                    return String.format("%02d:%02d:%02d", n, n2, (int)(act3.a / (float)act3.b));
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid GPS Timestamp array. array=");
                sb2.append(Arrays.toString(array));
                Log.w("ExifInterface", sb2.toString());
                return null;
            }
            else {
                try {
                    final Object f = a.f(this.j);
                    if (f != null) {
                        double double1;
                        if (f instanceof String) {
                            double1 = Double.parseDouble((String)f);
                        }
                        else if (f instanceof long[]) {
                            final long[] array2 = (long[])f;
                            if (array2.length != 1) {
                                throw new NumberFormatException("There are more than one component");
                            }
                            double1 = (double)array2[0];
                        }
                        else if (f instanceof int[]) {
                            final int[] array3 = (int[])f;
                            if (array3.length != 1) {
                                throw new NumberFormatException("There are more than one component");
                            }
                            double1 = array3[0];
                        }
                        else if (f instanceof double[]) {
                            final double[] array4 = (double[])f;
                            if (array4.length != 1) {
                                throw new NumberFormatException("There are more than one component");
                            }
                            double1 = array4[0];
                        }
                        else {
                            if (!(f instanceof act[])) {
                                throw new NumberFormatException("Couldn't find a double value");
                            }
                            final act[] array5 = (act[])f;
                            if (array5.length != 1) {
                                throw new NumberFormatException("There are more than one component");
                            }
                            final act act4 = array5[0];
                            final double n3 = (double)act4.a;
                            final double n4 = (double)act4.b;
                            Double.isNaN(n3);
                            Double.isNaN(n4);
                            double1 = n3 / n4;
                        }
                        return Double.toString(double1);
                    }
                    throw new NumberFormatException("NULL can't be converted to a double value");
                }
                catch (final NumberFormatException ex) {
                    return null;
                }
            }
        }
        return null;
    }
}
