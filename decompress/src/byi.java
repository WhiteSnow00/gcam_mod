import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class byi extends jyx
{
    private static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/brella/examplestore/lib/CamExampleStoreService");
    }
    
    protected abstract bye a(final Context p0, final bza p1, final byx p2);
    
    @Override
    public final void c(final String p0, final byte[] p1, final byte[] p2, final jzu p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_1       
        //     4: getstatic       ojk.c:Lojk;
        //     7: aload_2        
        //     8: aload_1        
        //     9: invokestatic    oky.t:(Loky;[BLokm;)Loky;
        //    12: checkcast       Lojk;
        //    15: astore_1       
        //    16: aload_1        
        //    17: getfield        ojk.a:Ljava/lang/String;
        //    20: invokevirtual   java/lang/String.isEmpty:()Z
        //    23: ifne            72
        //    26: ldc             "type.googleapis.com/com.google.android.apps.camera.brella.examplestore.proto.SelectionCriteria"
        //    28: aload_1        
        //    29: getfield        ojk.a:Ljava/lang/String;
        //    32: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    35: ifeq            41
        //    38: goto            72
        //    41: new             Lolm;
        //    44: astore_2       
        //    45: aload_2        
        //    46: ldc             "Incorrect type url: %s, expected: %s"
        //    48: iconst_2       
        //    49: anewarray       Ljava/lang/Object;
        //    52: dup            
        //    53: iconst_0       
        //    54: aload_1        
        //    55: getfield        ojk.a:Ljava/lang/String;
        //    58: aastore        
        //    59: dup            
        //    60: iconst_1       
        //    61: ldc             "type.googleapis.com/com.google.android.apps.camera.brella.examplestore.proto.SelectionCriteria"
        //    63: aastore        
        //    64: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    67: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //    70: aload_2        
        //    71: athrow         
        //    72: aload_1        
        //    73: getfield        ojk.b:Lojw;
        //    76: astore_2       
        //    77: invokestatic    okm.b:()Lokm;
        //    80: astore_1       
        //    81: getstatic       bza.i:Lbza;
        //    84: astore          5
        //    86: aload_2        
        //    87: invokevirtual   ojw.l:()Lokb;
        //    90: astore_2       
        //    91: aload           5
        //    93: iconst_4       
        //    94: invokevirtual   oky.H:(I)Ljava/lang/Object;
        //    97: checkcast       Loky;
        //   100: astore          5
        //   102: getstatic       omr.a:Lomr;
        //   105: aload           5
        //   107: invokevirtual   omr.b:(Ljava/lang/Object;)Lomy;
        //   110: astore          6
        //   112: aload           6
        //   114: aload           5
        //   116: aload_2        
        //   117: invokestatic    okc.p:(Lokb;)Lokc;
        //   120: aload_1        
        //   121: invokeinterface omy.h:(Ljava/lang/Object;Lomu;Lokm;)V
        //   126: aload           6
        //   128: aload           5
        //   130: invokeinterface omy.f:(Ljava/lang/Object;)V
        //   135: aload_2        
        //   136: iconst_0       
        //   137: invokevirtual   okb.z:(I)V
        //   140: aload           5
        //   142: invokestatic    oky.I:(Loky;)V
        //   145: aload           5
        //   147: checkcast       Lbza;
        //   150: astore          5
        //   152: aload           5
        //   154: getfield        bza.e:Loni;
        //   157: astore_2       
        //   158: aload_2        
        //   159: astore_1       
        //   160: aload_2        
        //   161: ifnonnull       168
        //   164: getstatic       oni.c:Loni;
        //   167: astore_1       
        //   168: aload_1        
        //   169: getfield        oni.a:J
        //   172: lconst_0       
        //   173: lcmp           
        //   174: iflt            482
        //   177: aload           5
        //   179: getfield        bza.e:Loni;
        //   182: astore_2       
        //   183: aload_2        
        //   184: astore_1       
        //   185: aload_2        
        //   186: ifnonnull       193
        //   189: getstatic       oni.c:Loni;
        //   192: astore_1       
        //   193: aload_1        
        //   194: getfield        oni.b:I
        //   197: iflt            470
        //   200: aload           5
        //   202: getfield        bza.e:Loni;
        //   205: astore_2       
        //   206: aload_2        
        //   207: astore_1       
        //   208: aload_2        
        //   209: ifnonnull       216
        //   212: getstatic       oni.c:Loni;
        //   215: astore_1       
        //   216: aload_1        
        //   217: getfield        oni.b:I
        //   220: ldc             999999999
        //   222: if_icmpgt       470
        //   225: aload           5
        //   227: getfield        bza.f:Loni;
        //   230: astore_2       
        //   231: aload_2        
        //   232: astore_1       
        //   233: aload_2        
        //   234: ifnonnull       241
        //   237: getstatic       oni.c:Loni;
        //   240: astore_1       
        //   241: aload_1        
        //   242: getfield        oni.a:J
        //   245: lconst_0       
        //   246: lcmp           
        //   247: iflt            458
        //   250: aload           5
        //   252: getfield        bza.f:Loni;
        //   255: astore_2       
        //   256: aload_2        
        //   257: astore_1       
        //   258: aload_2        
        //   259: ifnonnull       266
        //   262: getstatic       oni.c:Loni;
        //   265: astore_1       
        //   266: aload_1        
        //   267: getfield        oni.b:I
        //   270: iflt            446
        //   273: aload           5
        //   275: getfield        bza.f:Loni;
        //   278: astore_2       
        //   279: aload_2        
        //   280: astore_1       
        //   281: aload_2        
        //   282: ifnonnull       289
        //   285: getstatic       oni.c:Loni;
        //   288: astore_1       
        //   289: aload_1        
        //   290: getfield        oni.b:I
        //   293: ldc             999999999
        //   295: if_icmpgt       446
        //   298: aload           5
        //   300: getfield        bza.f:Loni;
        //   303: astore_2       
        //   304: aload_2        
        //   305: astore_1       
        //   306: aload_2        
        //   307: ifnonnull       314
        //   310: getstatic       oni.c:Loni;
        //   313: astore_1       
        //   314: aload_1        
        //   315: getfield        oni.a:J
        //   318: lstore          7
        //   320: aload           5
        //   322: getfield        bza.e:Loni;
        //   325: astore_2       
        //   326: aload_2        
        //   327: astore_1       
        //   328: aload_2        
        //   329: ifnonnull       336
        //   332: getstatic       oni.c:Loni;
        //   335: astore_1       
        //   336: lload           7
        //   338: aload_1        
        //   339: getfield        oni.a:J
        //   342: lcmp           
        //   343: iflt            434
        //   346: aload           5
        //   348: getfield        bza.h:Lolj;
        //   351: invokeinterface java/util/List.isEmpty:()Z
        //   356: istore          9
        //   358: iload           9
        //   360: ifne            422
        //   363: invokestatic    okm.b:()Lokm;
        //   366: astore_1       
        //   367: getstatic       byx.c:Lbyx;
        //   370: aload_3        
        //   371: aload_1        
        //   372: invokestatic    oky.t:(Loky;[BLokm;)Loky;
        //   375: checkcast       Lbyx;
        //   378: astore_1       
        //   379: aload           4
        //   381: aload_0        
        //   382: aload_0        
        //   383: invokevirtual   byi.getApplicationContext:()Landroid/content/Context;
        //   386: aload           5
        //   388: aload_1        
        //   389: invokevirtual   byi.a:(Landroid/content/Context;Lbza;Lbyx;)Lbye;
        //   392: invokevirtual   jzu.a:(Ljyw;)V
        //   395: return         
        //   396: astore_1       
        //   397: getstatic       byi.a:Lnsd;
        //   400: invokevirtual   nry.c:()Lnsu;
        //   403: ldc             "Error parsing ResumptionPoint proto: "
        //   405: sipush          215
        //   408: aload_1        
        //   409: invokestatic    a.m:(Lnsu;Ljava/lang/String;CLjava/lang/Throwable;)V
        //   412: aload           4
        //   414: aload_1        
        //   415: invokevirtual   olm.getMessage:()Ljava/lang/String;
        //   418: invokevirtual   jzu.b:(Ljava/lang/String;)V
        //   421: return         
        //   422: new             Lolm;
        //   425: astore_1       
        //   426: aload_1        
        //   427: ldc             "No table specified to select examples."
        //   429: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //   432: aload_1        
        //   433: athrow         
        //   434: new             Lolm;
        //   437: astore_1       
        //   438: aload_1        
        //   439: ldc             "End date before start date"
        //   441: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //   444: aload_1        
        //   445: athrow         
        //   446: new             Lolm;
        //   449: astore_1       
        //   450: aload_1        
        //   451: ldc             "Invalid end date nanos"
        //   453: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //   456: aload_1        
        //   457: athrow         
        //   458: new             Lolm;
        //   461: astore_1       
        //   462: aload_1        
        //   463: ldc             "End date less than zero"
        //   465: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //   468: aload_1        
        //   469: athrow         
        //   470: new             Lolm;
        //   473: astore_1       
        //   474: aload_1        
        //   475: ldc             "Invalid start date nanos"
        //   477: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //   480: aload_1        
        //   481: athrow         
        //   482: new             Lolm;
        //   485: astore_1       
        //   486: aload_1        
        //   487: ldc             "Start date less than zero"
        //   489: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //   492: aload_1        
        //   493: athrow         
        //   494: astore_1       
        //   495: aload_1        
        //   496: athrow         
        //   497: astore_1       
        //   498: aload_1        
        //   499: invokevirtual   java/lang/RuntimeException.getCause:()Ljava/lang/Throwable;
        //   502: instanceof      Lolm;
        //   505: ifeq            516
        //   508: aload_1        
        //   509: invokevirtual   java/lang/RuntimeException.getCause:()Ljava/lang/Throwable;
        //   512: checkcast       Lolm;
        //   515: athrow         
        //   516: aload_1        
        //   517: athrow         
        //   518: astore_1       
        //   519: aload_1        
        //   520: invokevirtual   java/io/IOException.getCause:()Ljava/lang/Throwable;
        //   523: instanceof      Lolm;
        //   526: ifeq            537
        //   529: aload_1        
        //   530: invokevirtual   java/io/IOException.getCause:()Ljava/lang/Throwable;
        //   533: checkcast       Lolm;
        //   536: athrow         
        //   537: new             Lolm;
        //   540: astore_2       
        //   541: aload_2        
        //   542: aload_1        
        //   543: invokespecial   olm.<init>:(Ljava/io/IOException;)V
        //   546: aload_2        
        //   547: athrow         
        //   548: astore_1       
        //   549: aload_1        
        //   550: astore_2       
        //   551: aload_1        
        //   552: getfield        olm.a:Z
        //   555: ifeq            567
        //   558: new             Lolm;
        //   561: astore_2       
        //   562: aload_2        
        //   563: aload_1        
        //   564: invokespecial   olm.<init>:(Ljava/io/IOException;)V
        //   567: aload_2        
        //   568: athrow         
        //   569: astore_1       
        //   570: aload_1        
        //   571: athrow         
        //   572: astore_1       
        //   573: getstatic       byi.a:Lnsd;
        //   576: invokevirtual   nry.c:()Lnsu;
        //   579: ldc             "Error parsing SelectionCriteria proto: "
        //   581: sipush          216
        //   584: aload_1        
        //   585: invokestatic    a.m:(Lnsu;Ljava/lang/String;CLjava/lang/Throwable;)V
        //   588: aload_1        
        //   589: invokevirtual   olm.getMessage:()Ljava/lang/String;
        //   592: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   595: astore_1       
        //   596: aload_1        
        //   597: invokevirtual   java/lang/String.length:()I
        //   600: ifeq            613
        //   603: ldc             "Error parsing SelectionCriteria proto: "
        //   605: aload_1        
        //   606: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   609: astore_1       
        //   610: goto            623
        //   613: new             Ljava/lang/String;
        //   616: dup            
        //   617: ldc             "Error parsing SelectionCriteria proto: "
        //   619: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   622: astore_1       
        //   623: aload           4
        //   625: aload_1        
        //   626: invokevirtual   jzu.b:(Ljava/lang/String;)V
        //   629: return         
        //   630: astore_1       
        //   631: getstatic       byi.a:Lnsd;
        //   634: invokevirtual   nry.c:()Lnsu;
        //   637: ldc             "Error parsing Any proto from criteria"
        //   639: sipush          217
        //   642: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //   645: aload           4
        //   647: ldc             "Error parsing Any proto from criteria"
        //   649: invokevirtual   jzu.b:(Ljava/lang/String;)V
        //   652: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      16     630    653    Lolm;
        //  16     38     572    630    Lolm;
        //  41     72     572    630    Lolm;
        //  72     86     572    630    Lolm;
        //  86     102    569    572    Lolm;
        //  102    135    548    569    Lolm;
        //  102    135    518    548    Ljava/io/IOException;
        //  102    135    497    518    Ljava/lang/RuntimeException;
        //  135    140    494    497    Lolm;
        //  140    158    572    630    Lolm;
        //  164    168    572    630    Lolm;
        //  168    183    572    630    Lolm;
        //  189    193    572    630    Lolm;
        //  193    206    572    630    Lolm;
        //  212    216    572    630    Lolm;
        //  216    231    572    630    Lolm;
        //  237    241    572    630    Lolm;
        //  241    256    572    630    Lolm;
        //  262    266    572    630    Lolm;
        //  266    279    572    630    Lolm;
        //  285    289    572    630    Lolm;
        //  289    304    572    630    Lolm;
        //  310    314    572    630    Lolm;
        //  314    326    572    630    Lolm;
        //  332    336    572    630    Lolm;
        //  336    358    572    630    Lolm;
        //  363    379    396    422    Lolm;
        //  422    434    572    630    Lolm;
        //  434    446    572    630    Lolm;
        //  446    458    572    630    Lolm;
        //  458    470    572    630    Lolm;
        //  470    482    572    630    Lolm;
        //  482    494    572    630    Lolm;
        //  495    497    569    572    Lolm;
        //  498    516    569    572    Lolm;
        //  516    518    569    572    Lolm;
        //  519    537    569    572    Lolm;
        //  537    548    569    572    Lolm;
        //  551    567    569    572    Lolm;
        //  567    569    569    572    Lolm;
        //  570    572    572    630    Lolm;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0516:
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
