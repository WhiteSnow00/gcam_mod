// 
// Decompiled by Procyon v0.6.0
// 

public final class frd implements frl
{
    private final frc a;
    private final lup b;
    private final frb c;
    private boolean d;
    
    public frd(final frc a, final lup b, final frb c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = false;
    }
    
    @Override
    public final void a(final lju p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        frd.a:Lfrc;
        //     6: astore_2       
        //     7: aload_0        
        //     8: getfield        frd.c:Lfrb;
        //    11: astore_3       
        //    12: aload_2        
        //    13: checkcast       Lfre;
        //    16: getfield        fre.a:Lfrc;
        //    19: astore          4
        //    21: iconst_0       
        //    22: istore          5
        //    24: iload           5
        //    26: iconst_3       
        //    27: if_icmpge       493
        //    30: aload           4
        //    32: checkcast       Lfre;
        //    35: getfield        fre.a:Lfrc;
        //    38: astore_2       
        //    39: aload_2        
        //    40: checkcast       Lfrf;
        //    43: getfield        frf.a:Ljava/util/concurrent/atomic/AtomicInteger;
        //    46: invokevirtual   java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        //    49: i2l            
        //    50: lstore          6
        //    52: aload_1        
        //    53: invokeinterface lju.d:()J
        //    58: lstore          8
        //    60: new             Lfrj;
        //    63: astore          10
        //    65: aload           10
        //    67: aload_1        
        //    68: lload           6
        //    70: ldc2_w          1000000
        //    73: lmul           
        //    74: invokespecial   frj.<init>:(Llju;J)V
        //    77: aload_2        
        //    78: checkcast       Lfrf;
        //    81: getfield        frf.b:Lfrc;
        //    84: aload           10
        //    86: aload_3        
        //    87: invokeinterface frc.a:(Llju;Lfrb;)Lfra;
        //    92: astore          10
        //    94: getstatic       java/util/concurrent/TimeUnit.MICROSECONDS:Ljava/util/concurrent/TimeUnit;
        //    97: lload           8
        //    99: getstatic       java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
        //   102: invokevirtual   java/util/concurrent/TimeUnit.convert:(JLjava/util/concurrent/TimeUnit;)J
        //   105: lstore          8
        //   107: aload           10
        //   109: checkcast       Lfrg;
        //   112: getfield        frg.a:Landroid/media/MediaCodec$BufferInfo;
        //   115: astore_2       
        //   116: new             Landroid/media/MediaCodec$BufferInfo;
        //   119: astore          11
        //   121: aload           11
        //   123: invokespecial   android/media/MediaCodec$BufferInfo.<init>:()V
        //   126: aload           11
        //   128: lload           8
        //   130: putfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   133: aload           11
        //   135: aload_2        
        //   136: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   139: putfield        android/media/MediaCodec$BufferInfo.size:I
        //   142: aload           11
        //   144: aload_2        
        //   145: getfield        android/media/MediaCodec$BufferInfo.offset:I
        //   148: putfield        android/media/MediaCodec$BufferInfo.offset:I
        //   151: aload           11
        //   153: aload_2        
        //   154: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   157: putfield        android/media/MediaCodec$BufferInfo.flags:I
        //   160: new             Lfri;
        //   163: astore_2       
        //   164: aload_2        
        //   165: aload           11
        //   167: aload           10
        //   169: invokespecial   fri.<init>:(Landroid/media/MediaCodec$BufferInfo;Lfra;)V
        //   172: aload_2        
        //   173: getfield        fri.b:Lfra;
        //   176: checkcast       Lfrg;
        //   179: getfield        frg.b:Landroid/media/MediaCodec;
        //   182: invokevirtual   android/media/MediaCodec.getOutputFormat:()Landroid/media/MediaFormat;
        //   185: astore_3       
        //   186: aload_2        
        //   187: getfield        fri.a:Landroid/media/MediaCodec$BufferInfo;
        //   190: astore          10
        //   192: new             Landroid/media/MediaCodec$BufferInfo;
        //   195: astore          4
        //   197: aload           4
        //   199: invokespecial   android/media/MediaCodec$BufferInfo.<init>:()V
        //   202: aload           4
        //   204: aload           10
        //   206: getfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   209: putfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   212: aload           4
        //   214: aload           10
        //   216: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   219: putfield        android/media/MediaCodec$BufferInfo.flags:I
        //   222: aload           4
        //   224: aload           10
        //   226: getfield        android/media/MediaCodec$BufferInfo.offset:I
        //   229: putfield        android/media/MediaCodec$BufferInfo.offset:I
        //   232: aload           4
        //   234: aload           10
        //   236: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   239: putfield        android/media/MediaCodec$BufferInfo.size:I
        //   242: aload           4
        //   244: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   247: invokestatic    java/nio/ByteBuffer.allocateDirect:(I)Ljava/nio/ByteBuffer;
        //   250: astore          10
        //   252: aload_2        
        //   253: getfield        fri.b:Lfra;
        //   256: astore          11
        //   258: aload           11
        //   260: checkcast       Lfrg;
        //   263: getfield        frg.b:Landroid/media/MediaCodec;
        //   266: aload           11
        //   268: checkcast       Lfrg;
        //   271: getfield        frg.c:I
        //   274: invokevirtual   android/media/MediaCodec.getOutputBuffer:(I)Ljava/nio/ByteBuffer;
        //   277: astore          12
        //   279: aload           12
        //   281: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   284: pop            
        //   285: aload           12
        //   287: invokevirtual   java/nio/ByteBuffer.duplicate:()Ljava/nio/ByteBuffer;
        //   290: astore          12
        //   292: aload           12
        //   294: aload           11
        //   296: checkcast       Lfrg;
        //   299: getfield        frg.a:Landroid/media/MediaCodec$BufferInfo;
        //   302: getfield        android/media/MediaCodec$BufferInfo.offset:I
        //   305: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //   308: pop            
        //   309: aload           12
        //   311: aload           11
        //   313: checkcast       Lfrg;
        //   316: getfield        frg.a:Landroid/media/MediaCodec$BufferInfo;
        //   319: getfield        android/media/MediaCodec$BufferInfo.offset:I
        //   322: aload           11
        //   324: checkcast       Lfrg;
        //   327: getfield        frg.a:Landroid/media/MediaCodec$BufferInfo;
        //   330: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   333: iadd           
        //   334: invokevirtual   java/nio/ByteBuffer.limit:(I)Ljava/nio/Buffer;
        //   337: pop            
        //   338: aload           10
        //   340: aload           12
        //   342: invokevirtual   java/nio/ByteBuffer.slice:()Ljava/nio/ByteBuffer;
        //   345: invokevirtual   java/nio/ByteBuffer.put:(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
        //   348: pop            
        //   349: aload           10
        //   351: invokevirtual   java/nio/ByteBuffer.rewind:()Ljava/nio/Buffer;
        //   354: pop            
        //   355: new             Lfrh;
        //   358: astore          11
        //   360: aload           11
        //   362: aload           4
        //   364: aload_3        
        //   365: aload           10
        //   367: invokespecial   frh.<init>:(Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaFormat;Ljava/nio/ByteBuffer;)V
        //   370: aload_2        
        //   371: invokeinterface fra.close:()V
        //   376: aload           11
        //   378: getfield        frh.a:Landroid/media/MediaCodec$BufferInfo;
        //   381: astore_2       
        //   382: aload_0        
        //   383: getfield        frd.d:Z
        //   386: ifne            411
        //   389: aload_0        
        //   390: getfield        frd.b:Llup;
        //   393: aload           11
        //   395: getfield        frh.b:Landroid/media/MediaFormat;
        //   398: invokestatic    ofi.n:(Ljava/lang/Object;)Loey;
        //   401: invokeinterface lup.a:(Loey;)V
        //   406: aload_0        
        //   407: iconst_1       
        //   408: putfield        frd.d:Z
        //   411: aload_2        
        //   412: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   415: iconst_4       
        //   416: iand           
        //   417: ifne            444
        //   420: aload_2        
        //   421: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   424: iconst_2       
        //   425: iand           
        //   426: ifne            444
        //   429: aload_0        
        //   430: getfield        frd.b:Llup;
        //   433: aload           11
        //   435: getfield        frh.c:Ljava/nio/ByteBuffer;
        //   438: aload_2        
        //   439: invokeinterface lup.b:(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
        //   444: aload_1        
        //   445: invokeinterface lju.close:()V
        //   450: aload_0        
        //   451: monitorexit    
        //   452: return         
        //   453: astore_3       
        //   454: aload_2        
        //   455: invokeinterface fra.close:()V
        //   460: goto            469
        //   463: astore_2       
        //   464: aload_3        
        //   465: aload_2        
        //   466: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   469: aload_3        
        //   470: athrow         
        //   471: astore_2       
        //   472: getstatic       frk.a:Lnsd;
        //   475: invokevirtual   nry.c:()Lnsu;
        //   478: ldc             "Encoding failed. Retrying..."
        //   480: sipush          1783
        //   483: aload_2        
        //   484: invokestatic    a.m:(Lnsu;Ljava/lang/String;CLjava/lang/Throwable;)V
        //   487: iinc            5, 1
        //   490: goto            24
        //   493: new             Ljava/lang/IllegalStateException;
        //   496: astore_2       
        //   497: aload_2        
        //   498: ldc             "Max attempts to encode reached! Encoding failed!"
        //   500: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   503: aload_2        
        //   504: athrow         
        //   505: astore_2       
        //   506: aload_1        
        //   507: invokeinterface lju.close:()V
        //   512: aload_2        
        //   513: athrow         
        //   514: astore_1       
        //   515: aload_0        
        //   516: monitorexit    
        //   517: goto            522
        //   520: aload_1        
        //   521: athrow         
        //   522: goto            520
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  2      21     505    514    Any
        //  30     172    471    493    Ljava/lang/IllegalStateException;
        //  30     172    505    514    Any
        //  172    370    453    471    Any
        //  370    411    505    514    Any
        //  411    444    505    514    Any
        //  444    450    514    525    Any
        //  454    460    463    469    Any
        //  464    469    505    514    Any
        //  469    471    505    514    Any
        //  472    487    505    514    Any
        //  493    505    505    514    Any
        //  506    514    514    525    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0444:
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
    
    @Override
    public final void close() {
        synchronized (this) {
            this.b.close();
        }
    }
}
