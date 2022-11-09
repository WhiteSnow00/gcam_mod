// 
// Decompiled by Procyon v0.6.0
// 

public final class gqf implements gfg
{
    private static final nsd a;
    private final kwd b;
    private final gsh c;
    private final klj d;
    private final glv e;
    private final gqr f;
    private final kse g;
    private final kwx h;
    private final cxl i;
    private final kjk j;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/commands/PckSingleFlashHdrPlusImageCaptureCommand");
    }
    
    public gqf(final kwd b, final gsh c, final klj d, final glv e, final kse g, final gqr f, final cxl i, final kjk j) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = f;
        this.i = i;
        this.j = j;
        final kww a = kwx.a();
        a.b(3);
        a.c(4);
        a.e(1);
        a.d(true);
        this.h = a.a();
    }
    
    @Override
    public final klj a() {
        return this.d;
    }
    
    @Override
    public final klj b() {
        return klq.g(fzu.e());
    }
    
    @Override
    public final void c(final gff p0, final gen p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gqf.c:Lgsh;
        //     4: invokeinterface gsh.a:()Ljava/lang/Object;
        //     9: astore_3       
        //    10: aload_0        
        //    11: getfield        gqf.g:Lkse;
        //    14: ldc             "pckFlashHdr#sessionAnd3A"
        //    16: invokeinterface kse.f:(Ljava/lang/String;)V
        //    21: iconst_0       
        //    22: istore          4
        //    24: iconst_0       
        //    25: istore          5
        //    27: iconst_0       
        //    28: istore          6
        //    30: iconst_0       
        //    31: istore          7
        //    33: aload_0        
        //    34: getfield        gqf.b:Lkwd;
        //    37: invokeinterface kwd.c:()Lkwh;
        //    42: astore          8
        //    44: aload_0        
        //    45: getfield        gqf.e:Lglv;
        //    48: aload           8
        //    50: aload_0        
        //    51: getfield        gqf.h:Lkwx;
        //    54: invokevirtual   glv.a:(Lkwh;Lkwx;)Lfwt;
        //    57: astore          9
        //    59: aload_2        
        //    60: getfield        gen.a:Lfvn;
        //    63: getfield        fvn.g:Lklv;
        //    66: iconst_0       
        //    67: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    70: invokeinterface klv.aR:(Ljava/lang/Object;)V
        //    75: aload_0        
        //    76: getfield        gqf.g:Lkse;
        //    79: ldc             "pckFlashHdr#submitCaptureRequest"
        //    81: invokeinterface kse.h:(Ljava/lang/String;)V
        //    86: aload           8
        //    88: invokeinterface kwh.f:()Lkyh;
        //    93: astore          10
        //    95: aload           10
        //    97: aload_3        
        //    98: checkcast       Lkzl;
        //   101: invokevirtual   kyh.f:(Lkzl;)V
        //   104: aload_0        
        //   105: getfield        gqf.i:Lcxl;
        //   108: aload           10
        //   110: invokestatic    dzh.b:(Lcxl;Lkyh;)V
        //   113: aload           8
        //   115: aload           10
        //   117: invokevirtual   kyh.b:()Lkyi;
        //   120: invokeinterface kwh.d:(Lkyi;)Lkzh;
        //   125: astore          10
        //   127: aload_2        
        //   128: getfield        gen.c:Lgem;
        //   131: invokeinterface gem.c:()Lgel;
        //   136: invokeinterface gel.e:()V
        //   141: aload_1        
        //   142: invokeinterface gff.close:()V
        //   147: aload           9
        //   149: invokeinterface fwt.close:()V
        //   154: aload           8
        //   156: invokeinterface kwh.close:()V
        //   161: aload_0        
        //   162: getfield        gqf.g:Lkse;
        //   165: ldc             "pckFlashHdr#getFrame"
        //   167: invokeinterface kse.h:(Ljava/lang/String;)V
        //   172: aload           10
        //   174: aload_3        
        //   175: checkcast       Lkzl;
        //   178: invokevirtual   kzh.a:(Lkzl;)Lkvs;
        //   181: astore_3       
        //   182: aload           10
        //   184: invokevirtual   kzh.close:()V
        //   187: aload_3        
        //   188: ifnull          227
        //   191: aload_3        
        //   192: invokestatic    kwp.j:(Lkvs;)V
        //   195: aload_0        
        //   196: getfield        gqf.g:Lkse;
        //   199: ldc             "pckFlashHdr#process"
        //   201: invokeinterface kse.h:(Ljava/lang/String;)V
        //   206: aload_0        
        //   207: getfield        gqf.f:Lgqr;
        //   210: aload_3        
        //   211: invokestatic    nns.m:(Ljava/lang/Object;)Lnns;
        //   214: getstatic       gqe.a:Lgqe;
        //   217: aload_2        
        //   218: invokevirtual   gqr.g:(Ljava/util/List;Lgff;Lgen;)V
        //   221: iconst_1       
        //   222: istore          7
        //   224: goto            227
        //   227: aload           9
        //   229: invokeinterface fwt.close:()V
        //   234: iload           7
        //   236: istore          5
        //   238: iload           7
        //   240: istore          4
        //   242: aload           8
        //   244: invokeinterface kwh.close:()V
        //   249: iload           7
        //   251: ifne            328
        //   254: getstatic       gqf.a:Lnsd;
        //   257: invokevirtual   nry.b:()Lnsu;
        //   260: ldc             "Error capturing image."
        //   262: sipush          1964
        //   265: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //   268: aload_2        
        //   269: getfield        gen.c:Lgem;
        //   272: invokeinterface gem.f:()V
        //   277: aload_2        
        //   278: getfield        gen.b:Lhhy;
        //   281: astore_2       
        //   282: aload_0        
        //   283: getfield        gqf.j:Lkjk;
        //   286: invokevirtual   kjk.a:()Z
        //   289: ifeq            309
        //   292: aload_2        
        //   293: new             Ldgg;
        //   296: dup            
        //   297: aconst_null    
        //   298: invokespecial   dgg.<init>:(Ljava/lang/Throwable;)V
        //   301: invokeinterface hhy.w:(Ljava/lang/Throwable;)V
        //   306: goto            328
        //   309: aload_2        
        //   310: getstatic       iwx.a:Liwv;
        //   313: new             Ldgi;
        //   316: dup            
        //   317: ldc_w           "Image capture failed. Aborting capture!"
        //   320: invokespecial   dgi.<init>:(Ljava/lang/String;)V
        //   323: invokeinterface hhy.C:(Liwv;Ljava/lang/Throwable;)V
        //   328: aload_1        
        //   329: invokeinterface gff.close:()V
        //   334: aload_0        
        //   335: getfield        gqf.g:Lkse;
        //   338: invokeinterface kse.g:()V
        //   343: return         
        //   344: astore          9
        //   346: goto            376
        //   349: astore_3       
        //   350: aload           9
        //   352: invokeinterface fwt.close:()V
        //   357: goto            368
        //   360: astore          9
        //   362: aload_3        
        //   363: aload           9
        //   365: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   368: aload_3        
        //   369: athrow         
        //   370: astore          9
        //   372: iload           4
        //   374: istore          7
        //   376: aload           8
        //   378: invokeinterface kwh.close:()V
        //   383: goto            403
        //   386: astore          8
        //   388: iload           7
        //   390: istore          5
        //   392: iload           7
        //   394: istore          4
        //   396: aload           9
        //   398: aload           8
        //   400: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   403: iload           7
        //   405: istore          5
        //   407: iload           7
        //   409: istore          4
        //   411: aload           9
        //   413: athrow         
        //   414: astore          9
        //   416: goto            426
        //   419: astore          9
        //   421: goto            529
        //   424: astore          9
        //   426: iload           5
        //   428: ifne            505
        //   431: getstatic       gqf.a:Lnsd;
        //   434: invokevirtual   nry.b:()Lnsu;
        //   437: ldc             "Error capturing image."
        //   439: sipush          1966
        //   442: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //   445: aload_2        
        //   446: getfield        gen.c:Lgem;
        //   449: invokeinterface gem.f:()V
        //   454: aload_2        
        //   455: getfield        gen.b:Lhhy;
        //   458: astore_2       
        //   459: aload_0        
        //   460: getfield        gqf.j:Lkjk;
        //   463: invokevirtual   kjk.a:()Z
        //   466: ifeq            486
        //   469: aload_2        
        //   470: new             Ldgg;
        //   473: dup            
        //   474: aconst_null    
        //   475: invokespecial   dgg.<init>:(Ljava/lang/Throwable;)V
        //   478: invokeinterface hhy.w:(Ljava/lang/Throwable;)V
        //   483: goto            505
        //   486: aload_2        
        //   487: getstatic       iwx.a:Liwv;
        //   490: new             Ldgi;
        //   493: dup            
        //   494: ldc_w           "Image capture failed. Aborting capture!"
        //   497: invokespecial   dgi.<init>:(Ljava/lang/String;)V
        //   500: invokeinterface hhy.C:(Liwv;Ljava/lang/Throwable;)V
        //   505: aload_1        
        //   506: invokeinterface gff.close:()V
        //   511: aload_0        
        //   512: getfield        gqf.g:Lkse;
        //   515: invokeinterface kse.g:()V
        //   520: aload           9
        //   522: athrow         
        //   523: astore          9
        //   525: iload           6
        //   527: istore          4
        //   529: iload           4
        //   531: ifne            328
        //   534: getstatic       gqf.a:Lnsd;
        //   537: invokevirtual   nry.b:()Lnsu;
        //   540: ldc             "Error capturing image."
        //   542: sipush          1965
        //   545: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //   548: aload_2        
        //   549: getfield        gen.c:Lgem;
        //   552: invokeinterface gem.f:()V
        //   557: aload_2        
        //   558: getfield        gen.b:Lhhy;
        //   561: astore_2       
        //   562: aload_0        
        //   563: getfield        gqf.j:Lkjk;
        //   566: invokevirtual   kjk.a:()Z
        //   569: ifeq            590
        //   572: aload_2        
        //   573: new             Ldgg;
        //   576: dup            
        //   577: aload           9
        //   579: invokespecial   dgg.<init>:(Ljava/lang/Throwable;)V
        //   582: invokeinterface hhy.w:(Ljava/lang/Throwable;)V
        //   587: goto            328
        //   590: aload_2        
        //   591: getstatic       iwx.a:Liwv;
        //   594: aload           9
        //   596: invokeinterface hhy.C:(Liwv;Ljava/lang/Throwable;)V
        //   601: goto            328
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type 
        //  -----  -----  -----  -----  -----
        //  33     44     523    529    Ldgi;
        //  33     44     424    426    Any
        //  44     59     370    376    Any
        //  59     187    349    370    Any
        //  191    221    349    370    Any
        //  227    234    344    349    Any
        //  242    249    419    424    Ldgi;
        //  242    249    414    419    Any
        //  350    357    360    368    Any
        //  362    368    370    376    Any
        //  368    370    370    376    Any
        //  376    383    386    403    Any
        //  396    403    419    424    Ldgi;
        //  396    403    414    419    Any
        //  411    414    419    424    Ldgi;
        //  411    414    414    419    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0309:
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
}
