import android.graphics.ImageFormat;
import android.webkit.MimeTypeMap;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lou
{
    public static oey a(final keg keg) {
        final ofn f = ofn.f();
        keg.g(odx.a, new lot(f));
        return f;
    }
    
    public static String b(final String s) {
        int n = 0;
        Label_0199: {
            switch (s.hashCode()) {
                case 3268712: {
                    if (s.equals("jpeg")) {
                        n = 1;
                        break Label_0199;
                    }
                    break;
                }
                case 1621908: {
                    if (s.equals("3gpp")) {
                        n = 6;
                        break Label_0199;
                    }
                    break;
                }
                case 115312: {
                    if (s.equals("txt")) {
                        n = 7;
                        break Label_0199;
                    }
                    break;
                }
                case 111145: {
                    if (s.equals("png")) {
                        n = 3;
                        break Label_0199;
                    }
                    break;
                }
                case 108273: {
                    if (s.equals("mp4")) {
                        n = 5;
                        break Label_0199;
                    }
                    break;
                }
                case 105441: {
                    if (s.equals("jpg")) {
                        n = 0;
                        break Label_0199;
                    }
                    break;
                }
                case 102340: {
                    if (s.equals("gif")) {
                        n = 2;
                        break Label_0199;
                    }
                    break;
                }
                case 99613: {
                    if (s.equals("dng")) {
                        n = 4;
                        break Label_0199;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                return MimeTypeMap.getSingleton().getMimeTypeFromExtension(s);
            }
            case 7: {
                return "text/plain";
            }
            case 6: {
                return "video/3gpp";
            }
            case 5: {
                return "video/mp4";
            }
            case 4: {
                return "image/x-adobe-dng";
            }
            case 3: {
                return "image/png";
            }
            case 2: {
                return "image/gif";
            }
            case 0:
            case 1: {
                return "image/jpeg";
            }
        }
    }
    
    public static boolean c(final String s) {
        return s.startsWith("image/");
    }
    
    public static boolean d(final String s) {
        return s.startsWith("video/");
    }
    
    public static long e(final int n, final kre kre) {
        final int a = kre.a;
        final int b = kre.b;
        int n3;
        final int n2 = n3 = ImageFormat.getBitsPerPixel(n);
        int n4 = n;
        if (n2 <= 0) {
            n3 = n2;
            if ((n4 = n) == 257) {
                n3 = 16;
                n4 = 257;
            }
        }
        long n5;
        if (n3 <= 0 && n4 == 256) {
            n5 = a * 24 * (long)b / 8L / 4L;
        }
        else {
            if (n3 <= 0 && n4 == 34) {
                n3 = ImageFormat.getBitsPerPixel(35);
            }
            n5 = a * Math.max(n3, 0) * (long)b / 8L;
        }
        return n5;
    }
    
    public static String f(final int n) {
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        switch (n) {
                                            default: {
                                                return Integer.toString(n);
                                            }
                                            case 842094169: {
                                                return "YV12";
                                            }
                                            case 256: {
                                                return "JPEG";
                                            }
                                            case 35: {
                                                return "YUV_420_888";
                                            }
                                            case 34: {
                                                return "PRIVATE";
                                            }
                                            case 20: {
                                                return "YUY2";
                                            }
                                            case 17: {
                                                return "NV21";
                                            }
                                            case 16: {
                                                return "NV16";
                                            }
                                            case 4: {
                                                return "RGB_565";
                                            }
                                            case 0: {
                                                return "UNKNOWN";
                                            }
                                        }
                                        break;
                                    }
                                    case 35: {
                                        return "YUV_420_888";
                                    }
                                }
                                break;
                            }
                            case 37: {
                                return "RAW10";
                            }
                            case 32: {
                                return "RAW_SENSOR";
                            }
                        }
                        break;
                    }
                    case 1144402265: {
                        return "DEPTH16";
                    }
                    case 4098: {
                        return "RAW_PD";
                    }
                    case 257: {
                        return "POINT_CLOUD";
                    }
                    case 42: {
                        return "FLEX_RGBA_8888";
                    }
                    case 41: {
                        return "FLEX_RGB_888";
                    }
                    case 40: {
                        return "YUV_444_888";
                    }
                    case 39: {
                        return "YUV_422_888";
                    }
                    case 38: {
                        return "RAW12";
                    }
                    case 34: {
                        return "PRIVATE";
                    }
                }
                break;
            }
            case 1768253795: {
                return "DEPTH_JPEG";
            }
            case 1212500294: {
                return "HEIC";
            }
            case 540422489: {
                return "Y16";
            }
            case 538982489: {
                return "Y8";
            }
        }
    }
}
