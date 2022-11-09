import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class duv
{
    private static final List a;
    
    static {
        a = new ArrayList();
    }
    
    public static void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: getstatic       duv.a:Ljava/util/List;
        //     6: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    11: astore_0       
        //    12: aload_0        
        //    13: invokeinterface java/util/Iterator.hasNext:()Z
        //    18: ifeq            411
        //    21: aload_0        
        //    22: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    27: checkcast       Lduu;
        //    30: astore_1       
        //    31: aload_1        
        //    32: getfield        duu.a:Ljava/lang/String;
        //    35: astore_2       
        //    36: aload_1        
        //    37: getfield        duu.b:I
        //    40: istore_3       
        //    41: aload_1        
        //    42: getfield        duu.c:Llji;
        //    45: astore_1       
        //    46: new             Ljava/lang/StringBuilder;
        //    49: astore          4
        //    51: aload           4
        //    53: bipush          26
        //    55: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    58: aload           4
        //    60: ldc             "  Result frame "
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: pop            
        //    66: aload           4
        //    68: iload_3        
        //    69: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    72: pop            
        //    73: aload           4
        //    75: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    78: astore          5
        //    80: new             Ljava/io/File;
        //    83: astore          4
        //    85: aload           4
        //    87: aload_2        
        //    88: ldc             "payload_burst_actual_hal3.txt"
        //    90: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    93: new             Ljava/io/FileWriter;
        //    96: astore_2       
        //    97: aload_2        
        //    98: aload           4
        //   100: iconst_1       
        //   101: invokespecial   java/io/FileWriter.<init>:(Ljava/io/File;Z)V
        //   104: new             Ljava/io/BufferedWriter;
        //   107: astore          4
        //   109: aload           4
        //   111: aload_2        
        //   112: invokespecial   java/io/BufferedWriter.<init>:(Ljava/io/Writer;)V
        //   115: aload_1        
        //   116: invokeinterface lji.f:()Ljava/util/List;
        //   121: astore          6
        //   123: aload           5
        //   125: iconst_0       
        //   126: anewarray       Ljava/lang/Object;
        //   129: invokestatic    ksc.c:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   132: astore          5
        //   134: aload           5
        //   136: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   139: invokevirtual   java/lang/String.length:()I
        //   142: istore_3       
        //   143: new             Ljava/lang/StringBuilder;
        //   146: astore          7
        //   148: aload           7
        //   150: iload_3        
        //   151: iconst_1       
        //   152: iadd           
        //   153: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   156: aload           7
        //   158: aload           5
        //   160: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   163: pop            
        //   164: aload           7
        //   166: bipush          10
        //   168: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   171: pop            
        //   172: aload           4
        //   174: aload           7
        //   176: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   179: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   182: aload           6
        //   184: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   189: astore          5
        //   191: aload           5
        //   193: invokeinterface java/util/Iterator.hasNext:()Z
        //   198: ifeq            266
        //   201: aload           5
        //   203: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   208: checkcast       Landroid/hardware/camera2/CaptureResult$Key;
        //   211: astore          6
        //   213: aload           4
        //   215: ldc             "    %s\n"
        //   217: iconst_1       
        //   218: anewarray       Ljava/lang/Object;
        //   221: dup            
        //   222: iconst_0       
        //   223: aload           6
        //   225: invokevirtual   android/hardware/camera2/CaptureResult$Key.getName:()Ljava/lang/String;
        //   228: aastore        
        //   229: invokestatic    ksc.c:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   232: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   235: aload           4
        //   237: ldc             "        %s\n"
        //   239: iconst_1       
        //   240: anewarray       Ljava/lang/Object;
        //   243: dup            
        //   244: iconst_0       
        //   245: aload_1        
        //   246: aload           6
        //   248: invokeinterface lji.d:(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;
        //   253: invokestatic    bnw.a:(Ljava/lang/Object;)Ljava/lang/String;
        //   256: aastore        
        //   257: invokestatic    ksc.c:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   260: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   263: goto            191
        //   266: aload           4
        //   268: invokevirtual   java/io/Writer.close:()V
        //   271: goto            355
        //   274: astore_1       
        //   275: getstatic       bnw.a:Lnsd;
        //   278: invokevirtual   nry.b:()Lnsu;
        //   281: ldc             "dumpMetadata - Failed to close writer."
        //   283: bipush          50
        //   285: aload_1        
        //   286: invokestatic    a.m:(Lnsu;Ljava/lang/String;CLjava/lang/Throwable;)V
        //   289: goto            355
        //   292: astore_2       
        //   293: goto            362
        //   296: astore_1       
        //   297: getstatic       bnw.a:Lnsd;
        //   300: invokevirtual   nry.b:()Lnsu;
        //   303: checkcast       Lnsa;
        //   306: aload_1        
        //   307: invokeinterface nsa.h:(Ljava/lang/Throwable;)Lnsu;
        //   312: checkcast       Lnsa;
        //   315: bipush          51
        //   317: invokeinterface nsa.E:(I)Lnsu;
        //   322: checkcast       Lnsa;
        //   325: ldc             "dumpMetadata - Failed to dump metadata"
        //   327: invokeinterface nsa.o:(Ljava/lang/String;)V
        //   332: aload           4
        //   334: invokevirtual   java/io/Writer.close:()V
        //   337: goto            355
        //   340: astore_1       
        //   341: getstatic       bnw.a:Lnsd;
        //   344: invokevirtual   nry.b:()Lnsu;
        //   347: ldc             "dumpMetadata - Failed to close writer."
        //   349: bipush          52
        //   351: aload_1        
        //   352: invokestatic    a.m:(Lnsu;Ljava/lang/String;CLjava/lang/Throwable;)V
        //   355: aload_2        
        //   356: invokevirtual   java/io/FileWriter.close:()V
        //   359: goto            402
        //   362: aload           4
        //   364: invokevirtual   java/io/Writer.close:()V
        //   367: goto            385
        //   370: astore_1       
        //   371: getstatic       bnw.a:Lnsd;
        //   374: invokevirtual   nry.b:()Lnsu;
        //   377: ldc             "dumpMetadata - Failed to close writer."
        //   379: bipush          53
        //   381: aload_1        
        //   382: invokestatic    a.m:(Lnsu;Ljava/lang/String;CLjava/lang/Throwable;)V
        //   385: aload_2        
        //   386: athrow         
        //   387: astore_2       
        //   388: getstatic       bnw.a:Lnsd;
        //   391: invokevirtual   nry.b:()Lnsu;
        //   394: ldc             "Could not write capture data to file."
        //   396: bipush          54
        //   398: aload_2        
        //   399: invokestatic    a.m:(Lnsu;Ljava/lang/String;CLjava/lang/Throwable;)V
        //   402: aload_0        
        //   403: invokeinterface java/util/Iterator.remove:()V
        //   408: goto            12
        //   411: ldc             Lduv;.class
        //   413: monitorexit    
        //   414: return         
        //   415: astore_0       
        //   416: ldc             Lduv;.class
        //   418: monitorexit    
        //   419: goto            424
        //   422: aload_0        
        //   423: athrow         
        //   424: goto            422
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      12     415    427    Any
        //  12     93     415    427    Any
        //  93     115    387    402    Ljava/io/IOException;
        //  93     115    415    427    Any
        //  115    191    296    355    Ljava/io/IOException;
        //  115    191    292    387    Any
        //  191    263    296    355    Ljava/io/IOException;
        //  191    263    292    387    Any
        //  266    271    274    292    Ljava/io/IOException;
        //  266    271    415    427    Any
        //  275    289    387    402    Ljava/io/IOException;
        //  275    289    415    427    Any
        //  297    332    292    387    Any
        //  332    337    340    355    Ljava/io/IOException;
        //  332    337    415    427    Any
        //  341    355    387    402    Ljava/io/IOException;
        //  341    355    415    427    Any
        //  355    359    387    402    Ljava/io/IOException;
        //  355    359    415    427    Any
        //  362    367    370    385    Ljava/io/IOException;
        //  362    367    415    427    Any
        //  371    385    387    402    Ljava/io/IOException;
        //  371    385    415    427    Any
        //  385    387    387    402    Ljava/io/IOException;
        //  385    387    415    427    Any
        //  388    402    415    427    Any
        //  402    408    415    427    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 190, Size: 190
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
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
    
    public static void b(final String s, final int n, final lji lji) {
        synchronized (duv.class) {
            duv.a.add(new duu(s, n, lji));
        }
    }
}
