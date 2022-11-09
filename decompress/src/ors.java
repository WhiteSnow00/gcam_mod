import android.os.Environment;
import java.io.File;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ors
{
    private static final String a;
    
    static {
        a = ors.class.getSimpleName();
    }
    
    public static osx a() {
        return (osx)e(osx.a.m(), "current_device_params", 894990891, true);
    }
    
    public static osy b() {
        return (osy)e(osy.e.m(), "phone_params", 779508118, false);
    }
    
    public static boolean c() {
        boolean b;
        try {
            final File f = f("current_device_params");
            b = (!f.exists() || f.delete());
        }
        catch (final IllegalStateException ex) {
            final String a = ors.a;
            final String value = String.valueOf(ex);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 34);
            sb.append("Error clearing device parameters: ");
            sb.append(value);
            Log.w(a, sb.toString());
            b = false;
        }
        if (!b) {
            Log.e(ors.a, "Could not clear Cardboard parameters from external storage.");
        }
        return b;
    }
    
    public static boolean d(final osx p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokeinterface omj.g:()[B
        //     6: astore_1       
        //     7: aconst_null    
        //     8: astore_2       
        //     9: aconst_null    
        //    10: astore_3       
        //    11: aconst_null    
        //    12: astore          4
        //    14: iconst_0       
        //    15: istore          5
        //    17: iconst_0       
        //    18: istore          6
        //    20: iconst_0       
        //    21: istore          7
        //    23: iconst_0       
        //    24: istore          8
        //    26: new             Ljava/io/BufferedOutputStream;
        //    29: astore_0       
        //    30: new             Ljava/io/FileOutputStream;
        //    33: astore          9
        //    35: aload           9
        //    37: ldc             "current_device_params"
        //    39: invokestatic    ors.f:(Ljava/lang/String;)Ljava/io/File;
        //    42: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    45: aload_0        
        //    46: aload           9
        //    48: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    51: bipush          8
        //    53: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        //    56: astore          4
        //    58: aload           4
        //    60: ldc             894990891
        //    62: invokevirtual   java/nio/ByteBuffer.putInt:(I)Ljava/nio/ByteBuffer;
        //    65: pop            
        //    66: aload           4
        //    68: aload_1        
        //    69: arraylength    
        //    70: invokevirtual   java/nio/ByteBuffer.putInt:(I)Ljava/nio/ByteBuffer;
        //    73: pop            
        //    74: aload_0        
        //    75: aload           4
        //    77: invokevirtual   java/nio/ByteBuffer.array:()[B
        //    80: invokevirtual   java/io/OutputStream.write:([B)V
        //    83: aload_0        
        //    84: aload_1        
        //    85: invokevirtual   java/io/OutputStream.write:([B)V
        //    88: iconst_1       
        //    89: istore          8
        //    91: goto            157
        //    94: astore          4
        //    96: goto            176
        //    99: astore_3       
        //   100: goto            179
        //   103: astore          4
        //   105: getstatic       ors.a:Ljava/lang/String;
        //   108: astore_3       
        //   109: aload           4
        //   111: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   114: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   117: astore          4
        //   119: aload           4
        //   121: invokevirtual   java/lang/String.length:()I
        //   124: ifeq            139
        //   127: ldc             "Error writing parameters: "
        //   129: aload           4
        //   131: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   134: astore          4
        //   136: goto            150
        //   139: new             Ljava/lang/String;
        //   142: dup            
        //   143: ldc             "Error writing parameters: "
        //   145: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   148: astore          4
        //   150: aload_3        
        //   151: aload           4
        //   153: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   156: pop            
        //   157: iload           8
        //   159: istore          5
        //   161: aload_0        
        //   162: invokevirtual   java/io/OutputStream.close:()V
        //   165: goto            400
        //   168: astore_0       
        //   169: iload           5
        //   171: istore          8
        //   173: goto            400
        //   176: goto            419
        //   179: aload_0        
        //   180: astore          4
        //   182: goto            200
        //   185: astore_3       
        //   186: aload_0        
        //   187: astore          4
        //   189: goto            302
        //   192: astore          4
        //   194: aload_3        
        //   195: astore_0       
        //   196: goto            419
        //   199: astore_3       
        //   200: aload           4
        //   202: astore_0       
        //   203: getstatic       ors.a:Ljava/lang/String;
        //   206: astore_2       
        //   207: aload           4
        //   209: astore_0       
        //   210: aload_3        
        //   211: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   214: astore_3       
        //   215: aload           4
        //   217: astore_0       
        //   218: aload_3        
        //   219: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   222: invokevirtual   java/lang/String.length:()I
        //   225: istore          10
        //   227: aload           4
        //   229: astore_0       
        //   230: new             Ljava/lang/StringBuilder;
        //   233: astore_1       
        //   234: aload           4
        //   236: astore_0       
        //   237: aload_1        
        //   238: iload           10
        //   240: bipush          26
        //   242: iadd           
        //   243: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   246: aload           4
        //   248: astore_0       
        //   249: aload_1        
        //   250: ldc             "Error writing parameters: "
        //   252: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   255: pop            
        //   256: aload           4
        //   258: astore_0       
        //   259: aload_1        
        //   260: aload_3        
        //   261: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   264: pop            
        //   265: aload           4
        //   267: astore_0       
        //   268: aload_2        
        //   269: aload_1        
        //   270: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   273: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   276: pop            
        //   277: iload           6
        //   279: istore          8
        //   281: aload           4
        //   283: ifnull          400
        //   286: aload           4
        //   288: invokevirtual   java/io/OutputStream.close:()V
        //   291: iload           7
        //   293: istore          8
        //   295: goto            400
        //   298: astore_3       
        //   299: aload_2        
        //   300: astore          4
        //   302: aload           4
        //   304: astore_0       
        //   305: getstatic       ors.a:Ljava/lang/String;
        //   308: astore_2       
        //   309: aload           4
        //   311: astore_0       
        //   312: aload_3        
        //   313: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   316: astore_1       
        //   317: aload           4
        //   319: astore_0       
        //   320: aload_1        
        //   321: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   324: invokevirtual   java/lang/String.length:()I
        //   327: istore          10
        //   329: aload           4
        //   331: astore_0       
        //   332: new             Ljava/lang/StringBuilder;
        //   335: astore_3       
        //   336: aload           4
        //   338: astore_0       
        //   339: aload_3        
        //   340: iload           10
        //   342: bipush          39
        //   344: iadd           
        //   345: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   348: aload           4
        //   350: astore_0       
        //   351: aload_3        
        //   352: ldc             "Parameters file not found for writing: "
        //   354: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   357: pop            
        //   358: aload           4
        //   360: astore_0       
        //   361: aload_3        
        //   362: aload_1        
        //   363: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   366: pop            
        //   367: aload           4
        //   369: astore_0       
        //   370: aload_2        
        //   371: aload_3        
        //   372: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   375: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   378: pop            
        //   379: iload           6
        //   381: istore          8
        //   383: aload           4
        //   385: ifnull          400
        //   388: aload           4
        //   390: invokevirtual   java/io/OutputStream.close:()V
        //   393: iload           7
        //   395: istore          8
        //   397: goto            400
        //   400: iload           8
        //   402: ifne            414
        //   405: getstatic       ors.a:Ljava/lang/String;
        //   408: ldc             "Could not write Cardboard parameters to external storage."
        //   410: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   413: pop            
        //   414: iload           8
        //   416: ireturn        
        //   417: astore          4
        //   419: aload_0        
        //   420: ifnull          431
        //   423: aload_0        
        //   424: invokevirtual   java/io/OutputStream.close:()V
        //   427: goto            431
        //   430: astore_0       
        //   431: aload           4
        //   433: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  26     51     298    302    Ljava/io/FileNotFoundException;
        //  26     51     199    200    Ljava/lang/IllegalStateException;
        //  26     51     192    199    Any
        //  51     88     103    157    Ljava/io/IOException;
        //  51     88     99     103    Ljava/lang/IllegalStateException;
        //  51     88     94     99     Any
        //  105    136    185    192    Ljava/io/FileNotFoundException;
        //  105    136    99     103    Ljava/lang/IllegalStateException;
        //  105    136    94     99     Any
        //  139    150    185    192    Ljava/io/FileNotFoundException;
        //  139    150    99     103    Ljava/lang/IllegalStateException;
        //  139    150    94     99     Any
        //  150    157    185    192    Ljava/io/FileNotFoundException;
        //  150    157    99     103    Ljava/lang/IllegalStateException;
        //  150    157    94     99     Any
        //  161    165    168    176    Ljava/io/IOException;
        //  203    207    417    419    Any
        //  210    215    417    419    Any
        //  218    227    417    419    Any
        //  230    234    417    419    Any
        //  237    246    417    419    Any
        //  249    256    417    419    Any
        //  259    265    417    419    Any
        //  268    277    417    419    Any
        //  286    291    168    176    Ljava/io/IOException;
        //  305    309    417    419    Any
        //  312    317    417    419    Any
        //  320    329    417    419    Any
        //  332    336    417    419    Any
        //  339    348    417    419    Any
        //  351    358    417    419    Any
        //  361    367    417    419    Any
        //  370    379    417    419    Any
        //  388    393    168    176    Ljava/io/IOException;
        //  423    427    430    431    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0139:
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
    
    private static omj e(final omi p0, final String p1, final int p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          4
        //     5: new             Ljava/io/FileInputStream;
        //     8: astore          5
        //    10: aload           5
        //    12: aload_1        
        //    13: invokestatic    ors.f:(Ljava/lang/String;)Ljava/io/File;
        //    16: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    19: aload           4
        //    21: aload           5
        //    23: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //    26: bipush          8
        //    28: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        //    31: astore_1       
        //    32: aload           4
        //    34: aload_1        
        //    35: invokevirtual   java/nio/ByteBuffer.array:()[B
        //    38: iconst_0       
        //    39: aload_1        
        //    40: invokevirtual   java/nio/ByteBuffer.array:()[B
        //    43: arraylength    
        //    44: invokevirtual   java/io/InputStream.read:([BII)I
        //    47: istore          6
        //    49: iload           6
        //    51: iconst_m1      
        //    52: if_icmpne       69
        //    55: getstatic       ors.a:Ljava/lang/String;
        //    58: ldc             "Error parsing param record: end of stream."
        //    60: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    63: pop            
        //    64: aconst_null    
        //    65: astore_1       
        //    66: goto            192
        //    69: aload_1        
        //    70: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //    73: istore          7
        //    75: aload_1        
        //    76: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //    79: istore          6
        //    81: iload           7
        //    83: iload_2        
        //    84: if_icmpeq       101
        //    87: getstatic       ors.a:Ljava/lang/String;
        //    90: ldc             "Error parsing param record: incorrect sentinel."
        //    92: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    95: pop            
        //    96: aconst_null    
        //    97: astore_1       
        //    98: goto            192
        //   101: iload           6
        //   103: newarray        B
        //   105: astore          5
        //   107: aload           5
        //   109: astore_1       
        //   110: aload           4
        //   112: aload           5
        //   114: iconst_0       
        //   115: iload           6
        //   117: invokevirtual   java/io/InputStream.read:([BII)I
        //   120: iconst_m1      
        //   121: if_icmpne       192
        //   124: getstatic       ors.a:Ljava/lang/String;
        //   127: ldc             "Error parsing param record: end of stream."
        //   129: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   132: pop            
        //   133: aconst_null    
        //   134: astore_1       
        //   135: goto            192
        //   138: astore_1       
        //   139: goto            209
        //   142: astore_1       
        //   143: getstatic       ors.a:Ljava/lang/String;
        //   146: astore          5
        //   148: aload_1        
        //   149: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   152: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   155: astore_1       
        //   156: aload_1        
        //   157: invokevirtual   java/lang/String.length:()I
        //   160: ifeq            173
        //   163: ldc             "Error reading parameters: "
        //   165: aload_1        
        //   166: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   169: astore_1       
        //   170: goto            183
        //   173: new             Ljava/lang/String;
        //   176: dup            
        //   177: ldc             "Error reading parameters: "
        //   179: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   182: astore_1       
        //   183: aload           5
        //   185: aload_1        
        //   186: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   189: pop            
        //   190: aconst_null    
        //   191: astore_1       
        //   192: aload           4
        //   194: invokevirtual   java/io/InputStream.close:()V
        //   197: goto            313
        //   200: astore          4
        //   202: goto            313
        //   205: astore_1       
        //   206: aconst_null    
        //   207: astore          4
        //   209: aload           4
        //   211: ifnull          224
        //   214: aload           4
        //   216: invokevirtual   java/io/InputStream.close:()V
        //   219: goto            224
        //   222: astore          4
        //   224: aload_1        
        //   225: athrow         
        //   226: astore          4
        //   228: getstatic       ors.a:Ljava/lang/String;
        //   231: astore_1       
        //   232: aload           4
        //   234: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   237: astore          5
        //   239: new             Ljava/lang/StringBuilder;
        //   242: dup            
        //   243: aload           5
        //   245: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   248: invokevirtual   java/lang/String.length:()I
        //   251: bipush          26
        //   253: iadd           
        //   254: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   257: astore          4
        //   259: aload           4
        //   261: ldc             "Error reading parameters: "
        //   263: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   266: pop            
        //   267: aload           4
        //   269: aload           5
        //   271: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   274: pop            
        //   275: aload_1        
        //   276: aload           4
        //   278: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   281: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   284: pop            
        //   285: aconst_null    
        //   286: astore_1       
        //   287: goto            313
        //   290: astore_1       
        //   291: iload_3        
        //   292: ifeq            311
        //   295: aload_1        
        //   296: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   299: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   302: invokevirtual   java/lang/String.length:()I
        //   305: pop            
        //   306: aconst_null    
        //   307: astore_1       
        //   308: goto            313
        //   311: aconst_null    
        //   312: astore_1       
        //   313: aload_1        
        //   314: ifnonnull       319
        //   317: aconst_null    
        //   318: areturn        
        //   319: aload_0        
        //   320: aload_1        
        //   321: invokeinterface omi.d:([B)Lomi;
        //   326: invokeinterface omi.j:()Lomj;
        //   331: astore_0       
        //   332: aload_0        
        //   333: areturn        
        //   334: astore_0       
        //   335: getstatic       ors.a:Ljava/lang/String;
        //   338: ldc             "Error reading params from ContentProvider"
        //   340: aload_0        
        //   341: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   344: pop            
        //   345: aconst_null    
        //   346: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      26     205    209    Any
        //  26     49     142    192    Ljava/io/IOException;
        //  26     49     138    142    Any
        //  55     64     142    192    Ljava/io/IOException;
        //  55     64     138    142    Any
        //  69     81     142    192    Ljava/io/IOException;
        //  69     81     138    142    Any
        //  87     96     142    192    Ljava/io/IOException;
        //  87     96     138    142    Any
        //  101    107    142    192    Ljava/io/IOException;
        //  101    107    138    142    Any
        //  110    133    142    192    Ljava/io/IOException;
        //  110    133    138    142    Any
        //  143    170    138    142    Any
        //  173    183    138    142    Any
        //  183    190    138    142    Any
        //  192    197    200    205    Ljava/io/IOException;
        //  192    197    290    313    Ljava/io/FileNotFoundException;
        //  192    197    226    290    Ljava/lang/IllegalStateException;
        //  214    219    222    224    Ljava/io/IOException;
        //  214    219    290    313    Ljava/io/FileNotFoundException;
        //  214    219    226    290    Ljava/lang/IllegalStateException;
        //  224    226    290    313    Ljava/io/FileNotFoundException;
        //  224    226    226    290    Ljava/lang/IllegalStateException;
        //  319    332    334    347    Lolm;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0192:
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
    
    private static File f(final String s) {
        final File file = new File(Environment.getExternalStorageDirectory(), "Cardboard");
        if (!file.exists()) {
            file.mkdirs();
        }
        else if (!file.isDirectory()) {
            final String value = String.valueOf(file);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 61);
            sb.append(value);
            sb.append(" already exists as a file, but is expected to be a directory.");
            throw new IllegalStateException(sb.toString());
        }
        return new File(file, s);
    }
}
