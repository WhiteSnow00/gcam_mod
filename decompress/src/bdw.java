import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace$Named;
import java.io.IOException;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;
import java.util.EnumSet;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.Set;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import android.util.DisplayMetrics;
import java.util.List;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdw
{
    public static final awf a;
    public static final awf b;
    public static final awf c;
    public static final awf d;
    public static final bdv e;
    private static final Queue h;
    public final azi f;
    public final List g;
    private final azk i;
    private final DisplayMetrics j;
    private final bec k;
    
    static {
        a = awf.c("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", avq.c);
        b = awf.b("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
        final bdt a2 = bdt.a;
        final Boolean value = false;
        c = awf.c("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", value);
        d = awf.c("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", value);
        Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        e = new bdu();
        Collections.unmodifiableSet((Set<?>)EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        h = biv.h(0);
    }
    
    public bdw(final List g, final DisplayMetrics j, final azk i, final azi f) {
        this.k = bec.a();
        this.g = g;
        bit.a(j);
        this.j = j;
        bit.a(i);
        this.i = i;
        bit.a(f);
        this.f = f;
    }
    
    private static int b(double n) {
        if (n > 1.0) {
            n = 1.0 / n;
        }
        return (int)Math.round(n * 2.147483647E9);
    }
    
    private static int c(final double n) {
        return (int)(n + 0.5);
    }
    
    private static Bitmap d(final beg p0, final BitmapFactory$Options p1, final bdv p2, final azk p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //     4: ifne            19
        //     7: aload_2        
        //     8: invokeinterface bdv.b:()V
        //    13: aload_0        
        //    14: invokeinterface beg.d:()V
        //    19: aload_1        
        //    20: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //    23: istore          4
        //    25: aload_1        
        //    26: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //    29: istore          5
        //    31: aload_1        
        //    32: getfield        android/graphics/BitmapFactory$Options.outMimeType:Ljava/lang/String;
        //    35: astore          6
        //    37: getstatic       beq.a:Ljava/util/concurrent/locks/Lock;
        //    40: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //    45: aload_0        
        //    46: aload_1        
        //    47: invokeinterface beg.b:(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //    52: astore          7
        //    54: getstatic       beq.a:Ljava/util/concurrent/locks/Lock;
        //    57: astore_0       
        //    58: aload           7
        //    60: astore_1       
        //    61: aload_0        
        //    62: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    67: aload_1        
        //    68: areturn        
        //    69: astore_0       
        //    70: goto            437
        //    73: astore          8
        //    75: new             Ljava/io/IOException;
        //    78: astore          9
        //    80: aload_1        
        //    81: getfield        android/graphics/BitmapFactory$Options.inBitmap:Landroid/graphics/Bitmap;
        //    84: astore          10
        //    86: aload           10
        //    88: ifnonnull       97
        //    91: aconst_null    
        //    92: astore          7
        //    94: goto            272
        //    97: aload           10
        //    99: invokevirtual   android/graphics/Bitmap.getAllocationByteCount:()I
        //   102: istore          11
        //   104: new             Ljava/lang/StringBuilder;
        //   107: astore          7
        //   109: aload           7
        //   111: bipush          14
        //   113: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   116: aload           7
        //   118: ldc             " ("
        //   120: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   123: pop            
        //   124: aload           7
        //   126: iload           11
        //   128: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   131: pop            
        //   132: aload           7
        //   134: ldc             ")"
        //   136: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   139: pop            
        //   140: aload           7
        //   142: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   145: astore          7
        //   147: aload           10
        //   149: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   152: istore          12
        //   154: aload           10
        //   156: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   159: istore          13
        //   161: aload           10
        //   163: invokevirtual   android/graphics/Bitmap.getConfig:()Landroid/graphics/Bitmap$Config;
        //   166: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   169: astore          14
        //   171: aload           14
        //   173: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   176: invokevirtual   java/lang/String.length:()I
        //   179: istore          15
        //   181: aload           7
        //   183: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   186: invokevirtual   java/lang/String.length:()I
        //   189: istore          11
        //   191: new             Ljava/lang/StringBuilder;
        //   194: astore          10
        //   196: aload           10
        //   198: iload           15
        //   200: bipush          26
        //   202: iadd           
        //   203: iload           11
        //   205: iadd           
        //   206: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   209: aload           10
        //   211: ldc             "["
        //   213: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   216: pop            
        //   217: aload           10
        //   219: iload           12
        //   221: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   224: pop            
        //   225: aload           10
        //   227: ldc             "x"
        //   229: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   232: pop            
        //   233: aload           10
        //   235: iload           13
        //   237: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   240: pop            
        //   241: aload           10
        //   243: ldc             "] "
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   248: pop            
        //   249: aload           10
        //   251: aload           14
        //   253: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   256: pop            
        //   257: aload           10
        //   259: aload           7
        //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   264: pop            
        //   265: aload           10
        //   267: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   270: astore          7
        //   272: aload           6
        //   274: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   277: invokevirtual   java/lang/String.length:()I
        //   280: istore          12
        //   282: aload           7
        //   284: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   287: invokevirtual   java/lang/String.length:()I
        //   290: istore          11
        //   292: new             Ljava/lang/StringBuilder;
        //   295: astore          10
        //   297: aload           10
        //   299: iload           12
        //   301: bipush          99
        //   303: iadd           
        //   304: iload           11
        //   306: iadd           
        //   307: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   310: aload           10
        //   312: ldc             "Exception decoding bitmap, outWidth: "
        //   314: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   317: pop            
        //   318: aload           10
        //   320: iload           4
        //   322: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   325: pop            
        //   326: aload           10
        //   328: ldc_w           ", outHeight: "
        //   331: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   334: pop            
        //   335: aload           10
        //   337: iload           5
        //   339: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   342: pop            
        //   343: aload           10
        //   345: ldc_w           ", outMimeType: "
        //   348: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   351: pop            
        //   352: aload           10
        //   354: aload           6
        //   356: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   359: pop            
        //   360: aload           10
        //   362: ldc_w           ", inBitmap: "
        //   365: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   368: pop            
        //   369: aload           10
        //   371: aload           7
        //   373: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   376: pop            
        //   377: aload           9
        //   379: aload           10
        //   381: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   384: aload           8
        //   386: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   389: aload_1        
        //   390: getfield        android/graphics/BitmapFactory$Options.inBitmap:Landroid/graphics/Bitmap;
        //   393: astore          7
        //   395: aload           7
        //   397: ifnull          434
        //   400: aload_3        
        //   401: aload_1        
        //   402: getfield        android/graphics/BitmapFactory$Options.inBitmap:Landroid/graphics/Bitmap;
        //   405: invokeinterface azk.d:(Landroid/graphics/Bitmap;)V
        //   410: aload_1        
        //   411: aconst_null    
        //   412: putfield        android/graphics/BitmapFactory$Options.inBitmap:Landroid/graphics/Bitmap;
        //   415: aload_0        
        //   416: aload_1        
        //   417: aload_2        
        //   418: aload_3        
        //   419: invokestatic    bdw.d:(Lbeg;Landroid/graphics/BitmapFactory$Options;Lbdv;Lazk;)Landroid/graphics/Bitmap;
        //   422: astore_1       
        //   423: getstatic       beq.a:Ljava/util/concurrent/locks/Lock;
        //   426: astore_0       
        //   427: goto            61
        //   430: astore_0       
        //   431: aload           9
        //   433: athrow         
        //   434: aload           9
        //   436: athrow         
        //   437: getstatic       beq.a:Ljava/util/concurrent/locks/Lock;
        //   440: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   445: goto            450
        //   448: aload_0        
        //   449: athrow         
        //   450: goto            448
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  45     54     73     437    Ljava/lang/IllegalArgumentException;
        //  45     54     69     453    Any
        //  75     86     69     453    Any
        //  97     272    69     453    Any
        //  272    395    69     453    Any
        //  400    423    430    434    Ljava/io/IOException;
        //  400    423    69     453    Any
        //  431    434    69     453    Any
        //  434    437    69     453    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 210, Size: 210
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    private static BitmapFactory$Options e() {
        synchronized (bdw.class) {
            Object h = bdw.h;
            synchronized (h) {
                final BitmapFactory$Options bitmapFactory$Options = ((Queue<BitmapFactory$Options>)h).poll();
                monitorexit(h);
                if (bitmapFactory$Options == null) {
                    h = new BitmapFactory$Options();
                    g((BitmapFactory$Options)h);
                    return (BitmapFactory$Options)h;
                }
                return bitmapFactory$Options;
            }
        }
    }
    
    private static void f(final BitmapFactory$Options bitmapFactory$Options) {
        g(bitmapFactory$Options);
        final Queue h = bdw.h;
        synchronized (h) {
            h.offer(bitmapFactory$Options);
        }
    }
    
    private static void g(final BitmapFactory$Options bitmapFactory$Options) {
        bitmapFactory$Options.inTempStorage = null;
        bitmapFactory$Options.inDither = false;
        bitmapFactory$Options.inScaled = false;
        bitmapFactory$Options.inSampleSize = 1;
        bitmapFactory$Options.inPreferredConfig = null;
        bitmapFactory$Options.inJustDecodeBounds = false;
        bitmapFactory$Options.inDensity = 0;
        bitmapFactory$Options.inTargetDensity = 0;
        bitmapFactory$Options.inPreferredColorSpace = null;
        bitmapFactory$Options.outColorSpace = null;
        bitmapFactory$Options.outConfig = null;
        bitmapFactory$Options.outWidth = 0;
        bitmapFactory$Options.outHeight = 0;
        bitmapFactory$Options.outMimeType = null;
        bitmapFactory$Options.inBitmap = null;
        bitmapFactory$Options.inMutable = true;
    }
    
    private static boolean h(final int n) {
        return n == 90 || n == 270;
    }
    
    private static boolean i(final BitmapFactory$Options bitmapFactory$Options) {
        return bitmapFactory$Options.inTargetDensity > 0 && bitmapFactory$Options.inDensity > 0 && bitmapFactory$Options.inTargetDensity != bitmapFactory$Options.inDensity;
    }
    
    private static int[] j(final beg beg, final BitmapFactory$Options bitmapFactory$Options, final bdv bdv, final azk azk) {
        bitmapFactory$Options.inJustDecodeBounds = true;
        d(beg, bitmapFactory$Options, bdv, azk);
        bitmapFactory$Options.inJustDecodeBounds = false;
        return new int[] { bitmapFactory$Options.outWidth, bitmapFactory$Options.outHeight };
    }
    
    public final aza a(final beg beg, int n, int n2, final awg awg, bdv bdv) {
        final byte[] inTempStorage = (byte[])this.f.a(65536, byte[].class);
        final BitmapFactory$Options e = e();
        e.inTempStorage = inTempStorage;
        final avq avq = (avq)awg.b(bdw.a);
        final awh awh = (awh)awg.b(bdw.b);
        final bdt bdt = (bdt)awg.b(bdt.f);
        final boolean booleanValue = (boolean)awg.b(bdw.c);
        final awf d = bdw.d;
        if (awg.b(d) != null && (boolean)awg.b(d)) {
            final boolean b = true;
        }
        else {
            final boolean b = false;
        }
        try {
            bio.b();
            final int[] j = j(beg, e, bdv, this.i);
            final int n3 = j[0];
            int n4 = j[1];
            final String outMimeType = e.outMimeType;
            if (n3 != -1) {
                if (n4 == -1) {
                    final boolean b = false;
                    n4 = -1;
                }
            }
            else {
                final boolean b = false;
            }
            final int a = beg.a();
            final int a2 = beq.a(a);
            final boolean i = beq.i(a);
            int n5 = n;
            int round;
            while (true) {
                if (n != Integer.MIN_VALUE) {
                    break Label_0246;
                }
                try {
                    if (h(a2)) {
                        n5 = n4;
                        break Label_0246;
                    }
                    n5 = n3;
                    break Label_0246;
                }
                finally {}
                if ((round = n2) == Integer.MIN_VALUE) {
                    if (h(a2)) {
                        round = n3;
                    }
                    else {
                        round = n4;
                    }
                }
                final ImageHeaderParser$ImageType c = beg.c();
                final azk k = this.i;
                if (n3 > 0) {
                    if (n4 > 0) {
                        try {
                            final boolean h = h(a2);
                            if (!h) {
                                n = n4;
                            }
                            else {
                                n = n3;
                            }
                            if (!h) {
                                n2 = n3;
                            }
                            else {
                                n2 = n4;
                            }
                            final float a3 = bdt.a(n2, n, n5, round);
                            if (a3 <= 0.0f) {
                                final String value = String.valueOf(bdt);
                                n = String.valueOf(value).length();
                                bdv = (bdv)new StringBuilder(n + 118);
                                ((StringBuilder)bdv).append("Cannot scale with factor: ");
                                ((StringBuilder)bdv).append(a3);
                                ((StringBuilder)bdv).append(" from: ");
                                ((StringBuilder)bdv).append(value);
                                ((StringBuilder)bdv).append(", source: [");
                                ((StringBuilder)bdv).append(n3);
                                ((StringBuilder)bdv).append("x");
                                ((StringBuilder)bdv).append(n4);
                                ((StringBuilder)bdv).append("], target: [");
                                ((StringBuilder)bdv).append(n5);
                                ((StringBuilder)bdv).append("x");
                                ((StringBuilder)bdv).append(round);
                                ((StringBuilder)bdv).append("]");
                                throw new IllegalArgumentException(((StringBuilder)bdv).toString());
                            }
                            final int b2 = bdt.b(n2, n, n5, round);
                            final float n6 = (float)n2;
                            final int c2 = c(a3 * n6);
                            final float n7 = (float)n;
                            final double n8 = a3 * n7;
                            final int n9 = n2 / c2;
                            final int n10 = n / c(n8);
                            int n11;
                            if (b2 == 1) {
                                n11 = Math.max(n9, n10);
                            }
                            else {
                                n11 = Math.min(n9, n10);
                            }
                            int max;
                            final int n12 = max = Math.max(1, Integer.highestOneBit(n11));
                            if (b2 == 1) {
                                max = n12;
                                if (n12 < 1.0f / a3) {
                                    max = n12 + n12;
                                }
                            }
                            e.inSampleSize = max;
                            if (c == ImageHeaderParser$ImageType.JPEG) {
                                final float n13 = (float)Math.min(max, 8);
                                n = (int)Math.ceil(n6 / n13);
                                n2 = (int)Math.ceil(n7 / n13);
                                final int n14 = max / 8;
                                if (n14 > 0) {
                                    n /= n14;
                                    n2 /= n14;
                                }
                                final int n15 = n2;
                                n2 = n;
                                n = n15;
                            }
                            else if (c != ImageHeaderParser$ImageType.PNG && c != ImageHeaderParser$ImageType.PNG_A) {
                                if (c != ImageHeaderParser$ImageType.WEBP && c != ImageHeaderParser$ImageType.WEBP_A) {
                                    if (n2 % max == 0 && n % max == 0) {
                                        n2 /= max;
                                        n /= max;
                                    }
                                    else {
                                        final int[] l = j(beg, e, bdv, k);
                                        n2 = l[0];
                                        n = l[1];
                                    }
                                }
                                else {
                                    final float n16 = (float)max;
                                    n2 = Math.round(n6 / n16);
                                    n = Math.round(n7 / n16);
                                }
                            }
                            else {
                                final float n17 = (float)max;
                                n2 = (int)Math.floor(n6 / n17);
                                n = (int)Math.floor(n7 / n17);
                            }
                            final double n18 = bdt.a(n2, n, n5, round);
                            n = b(n18);
                            final double n19 = n;
                            Double.isNaN(n19);
                            Double.isNaN(n18);
                            n2 = c(n19 * n18);
                            final double n20 = n2 / (float)n;
                            Double.isNaN(n18);
                            Double.isNaN(n20);
                            final double n21 = n18 / n20;
                            final double n22 = n2;
                            Double.isNaN(n22);
                            e.inTargetDensity = c(n21 * n22);
                            e.inDensity = b(n18);
                            if (i(e)) {
                                e.inScaled = true;
                            }
                            else {
                                e.inTargetDensity = 0;
                                e.inDensity = 0;
                            }
                        }
                        finally {
                            continue;
                        }
                    }
                }
                break;
            }
            final bdv bdv2 = bdv;
            bdv = (bdv)this;
            try {
                final boolean b;
                if (((bdw)bdv).k.b(n5, round, b, i)) {
                    e.inPreferredConfig = Bitmap$Config.HARDWARE;
                    e.inMutable = false;
                }
                else if (avq != avq.a) {
                    Bitmap$Config inPreferredConfig = null;
                    Label_1097: {
                        try {
                            if (beg.c().hasAlpha()) {
                                inPreferredConfig = Bitmap$Config.ARGB_8888;
                                break Label_1097;
                            }
                        }
                        catch (final IOException ex) {}
                        inPreferredConfig = Bitmap$Config.RGB_565;
                    }
                    e.inPreferredConfig = inPreferredConfig;
                    if (e.inPreferredConfig == Bitmap$Config.RGB_565) {
                        e.inDither = true;
                    }
                }
                else {
                    e.inPreferredConfig = Bitmap$Config.ARGB_8888;
                }
                n = e.inSampleSize;
                if (n3 >= 0 && n4 >= 0 && booleanValue) {
                    n = n5;
                }
                else {
                    float n23;
                    if (i(e)) {
                        n23 = e.inTargetDensity / (float)e.inDensity;
                    }
                    else {
                        n23 = 1.0f;
                    }
                    n = e.inSampleSize;
                    final float n24 = (float)n3;
                    final float n25 = (float)n;
                    n = (int)Math.ceil(n24 / n25);
                    n2 = (int)Math.ceil(n4 / n25);
                    n = Math.round(n * n23);
                    round = Math.round(n2 * n23);
                }
                if (n > 0 && round > 0) {
                    final azk m = ((bdw)bdv).i;
                    if (e.inPreferredConfig != Bitmap$Config.HARDWARE) {
                        Bitmap$Config bitmap$Config;
                        if ((bitmap$Config = e.outConfig) == null) {
                            bitmap$Config = e.inPreferredConfig;
                        }
                        e.inBitmap = m.b(n, round, bitmap$Config);
                    }
                }
                if (awh != null) {
                    ColorSpace$Named colorSpace$Named;
                    if (awh == awh.b && e.outColorSpace != null && e.outColorSpace.isWideGamut()) {
                        colorSpace$Named = ColorSpace$Named.DISPLAY_P3;
                    }
                    else {
                        colorSpace$Named = ColorSpace$Named.SRGB;
                    }
                    e.inPreferredColorSpace = ColorSpace.get(colorSpace$Named);
                }
                final Bitmap d2 = d(beg, e, bdv2, ((bdw)bdv).i);
                bdv2.a(((bdw)bdv).i, d2);
                Bitmap bitmap;
                if (d2 != null) {
                    d2.setDensity(((bdw)bdv).j.densityDpi);
                    final azk i2 = ((bdw)bdv).i;
                    Bitmap a4;
                    if (!beq.i(a)) {
                        a4 = d2;
                    }
                    else {
                        final Matrix matrix = new Matrix();
                        switch (a) {
                            case 8: {
                                matrix.setRotate(-90.0f);
                                break;
                            }
                            case 7: {
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            }
                            case 6: {
                                matrix.setRotate(90.0f);
                                break;
                            }
                            case 5: {
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            }
                            case 4: {
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            }
                            case 3: {
                                matrix.setRotate(180.0f);
                                break;
                            }
                            case 2: {
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            }
                        }
                        final RectF rectF = new RectF(0.0f, 0.0f, (float)d2.getWidth(), (float)d2.getHeight());
                        matrix.mapRect(rectF);
                        a4 = i2.a(Math.round(rectF.width()), Math.round(rectF.height()), beq.b(d2));
                        matrix.postTranslate(-rectF.left, -rectF.top);
                        a4.setHasAlpha(d2.hasAlpha());
                        beq.g(d2, a4, matrix);
                    }
                    bitmap = a4;
                    if (!d2.equals(a4)) {
                        ((bdw)bdv).i.d(d2);
                        bitmap = a4;
                    }
                }
                else {
                    bitmap = null;
                }
                final bdf f = bdf.f(bitmap, ((bdw)bdv).i);
                f(e);
                ((bdw)bdv).f.c(inTempStorage);
                return f;
            }
            finally {}
        }
        finally {}
        f(e);
        this.f.c(inTempStorage);
        throw;
    }
}
