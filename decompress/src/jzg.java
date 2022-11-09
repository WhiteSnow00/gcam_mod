import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jzg extends jyx
{
    protected abstract jzm a(final Context p0);
    
    @Override
    public final void c(final String p0, final byte[] p1, final byte[] p2, final jzu p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          5
        //     5: getstatic       ojk.c:Lojk;
        //     8: aload_2        
        //     9: aload           5
        //    11: invokestatic    oky.t:(Loky;[BLokm;)Loky;
        //    14: checkcast       Lojk;
        //    17: astore_2       
        //    18: aload_2        
        //    19: getfield        ojk.a:Ljava/lang/String;
        //    22: invokevirtual   java/lang/String.isEmpty:()Z
        //    25: istore          6
        //    27: iload           6
        //    29: ifne            78
        //    32: ldc             "type.googleapis.com/intelligence.brella.proto.examplestore.SelectionCriteria"
        //    34: aload_2        
        //    35: getfield        ojk.a:Ljava/lang/String;
        //    38: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    41: ifeq            47
        //    44: goto            78
        //    47: new             Lolm;
        //    50: astore_1       
        //    51: aload_1        
        //    52: ldc             "Incorrect type url: %s, expected: %s"
        //    54: iconst_2       
        //    55: anewarray       Ljava/lang/Object;
        //    58: dup            
        //    59: iconst_0       
        //    60: aload_2        
        //    61: getfield        ojk.a:Ljava/lang/String;
        //    64: aastore        
        //    65: dup            
        //    66: iconst_1       
        //    67: ldc             "type.googleapis.com/intelligence.brella.proto.examplestore.SelectionCriteria"
        //    69: aastore        
        //    70: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    73: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //    76: aload_1        
        //    77: athrow         
        //    78: aload_2        
        //    79: getfield        ojk.b:Lojw;
        //    82: astore          5
        //    84: invokestatic    okm.b:()Lokm;
        //    87: astore_2       
        //    88: getstatic       oif.h:Loif;
        //    91: astore          7
        //    93: aload           5
        //    95: invokevirtual   ojw.l:()Lokb;
        //    98: astore          5
        //   100: aload           7
        //   102: iconst_4       
        //   103: invokevirtual   oky.H:(I)Ljava/lang/Object;
        //   106: checkcast       Loky;
        //   109: astore          8
        //   111: getstatic       omr.a:Lomr;
        //   114: aload           8
        //   116: invokevirtual   omr.b:(Ljava/lang/Object;)Lomy;
        //   119: astore          7
        //   121: aload           7
        //   123: aload           8
        //   125: aload           5
        //   127: invokestatic    okc.p:(Lokb;)Lokc;
        //   130: aload_2        
        //   131: invokeinterface omy.h:(Ljava/lang/Object;Lomu;Lokm;)V
        //   136: aload           7
        //   138: aload           8
        //   140: invokeinterface omy.f:(Ljava/lang/Object;)V
        //   145: aload           5
        //   147: iconst_0       
        //   148: invokevirtual   okb.z:(I)V
        //   151: aload           8
        //   153: invokestatic    oky.I:(Loky;)V
        //   156: aload           8
        //   158: checkcast       Loif;
        //   161: astore          7
        //   163: aload           7
        //   165: getfield        oif.e:Loni;
        //   168: astore          5
        //   170: aload           5
        //   172: astore_2       
        //   173: aload           5
        //   175: ifnonnull       182
        //   178: getstatic       oni.c:Loni;
        //   181: astore_2       
        //   182: aload_2        
        //   183: getfield        oni.a:J
        //   186: lconst_0       
        //   187: lcmp           
        //   188: iflt            788
        //   191: aload           7
        //   193: getfield        oif.e:Loni;
        //   196: astore          5
        //   198: aload           5
        //   200: astore_2       
        //   201: aload           5
        //   203: ifnonnull       210
        //   206: getstatic       oni.c:Loni;
        //   209: astore_2       
        //   210: aload_2        
        //   211: getfield        oni.b:I
        //   214: iflt            776
        //   217: aload           7
        //   219: getfield        oif.e:Loni;
        //   222: astore          5
        //   224: aload           5
        //   226: astore_2       
        //   227: aload           5
        //   229: ifnonnull       236
        //   232: getstatic       oni.c:Loni;
        //   235: astore_2       
        //   236: aload_2        
        //   237: getfield        oni.b:I
        //   240: ldc             999999999
        //   242: if_icmpgt       776
        //   245: aload           7
        //   247: getfield        oif.f:Loni;
        //   250: astore          5
        //   252: aload           5
        //   254: astore_2       
        //   255: aload           5
        //   257: ifnonnull       264
        //   260: getstatic       oni.c:Loni;
        //   263: astore_2       
        //   264: aload_2        
        //   265: getfield        oni.a:J
        //   268: lconst_0       
        //   269: lcmp           
        //   270: iflt            764
        //   273: aload           7
        //   275: getfield        oif.f:Loni;
        //   278: astore          5
        //   280: aload           5
        //   282: astore_2       
        //   283: aload           5
        //   285: ifnonnull       292
        //   288: getstatic       oni.c:Loni;
        //   291: astore_2       
        //   292: aload_2        
        //   293: getfield        oni.b:I
        //   296: iflt            752
        //   299: aload           7
        //   301: getfield        oif.f:Loni;
        //   304: astore          5
        //   306: aload           5
        //   308: astore_2       
        //   309: aload           5
        //   311: ifnonnull       318
        //   314: getstatic       oni.c:Loni;
        //   317: astore_2       
        //   318: aload_2        
        //   319: getfield        oni.b:I
        //   322: ldc             999999999
        //   324: if_icmpgt       752
        //   327: aload           7
        //   329: getfield        oif.f:Loni;
        //   332: astore          5
        //   334: aload           5
        //   336: astore_2       
        //   337: aload           5
        //   339: ifnonnull       346
        //   342: getstatic       oni.c:Loni;
        //   345: astore_2       
        //   346: aload_2        
        //   347: getfield        oni.a:J
        //   350: lstore          9
        //   352: aload           7
        //   354: getfield        oif.e:Loni;
        //   357: astore          5
        //   359: aload           5
        //   361: astore_2       
        //   362: aload           5
        //   364: ifnonnull       371
        //   367: getstatic       oni.c:Loni;
        //   370: astore_2       
        //   371: aload_2        
        //   372: getfield        oni.a:J
        //   375: lstore          11
        //   377: lload           9
        //   379: lload           11
        //   381: lcmp           
        //   382: iflt            740
        //   385: invokestatic    okm.b:()Lokm;
        //   388: astore_2       
        //   389: getstatic       ojk.c:Lojk;
        //   392: aload_3        
        //   393: aload_2        
        //   394: invokestatic    oky.t:(Loky;[BLokm;)Loky;
        //   397: checkcast       Lojk;
        //   400: astore_2       
        //   401: aload_2        
        //   402: getstatic       ojk.c:Lojk;
        //   405: invokevirtual   oky.equals:(Ljava/lang/Object;)Z
        //   408: ifne            457
        //   411: ldc             "type.googleapis.com/intelligence.brella.proto.examplestore.ResumptionPoint"
        //   413: aload_2        
        //   414: getfield        ojk.a:Ljava/lang/String;
        //   417: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   420: ifeq            426
        //   423: goto            457
        //   426: new             Lolm;
        //   429: astore_1       
        //   430: aload_1        
        //   431: ldc             "Incorrect type url: %s, expected: %s"
        //   433: iconst_2       
        //   434: anewarray       Ljava/lang/Object;
        //   437: dup            
        //   438: iconst_0       
        //   439: aload_2        
        //   440: getfield        ojk.a:Ljava/lang/String;
        //   443: aastore        
        //   444: dup            
        //   445: iconst_1       
        //   446: ldc             "type.googleapis.com/intelligence.brella.proto.examplestore.ResumptionPoint"
        //   448: aastore        
        //   449: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   452: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //   455: aload_1        
        //   456: athrow         
        //   457: aload_2        
        //   458: getfield        ojk.b:Lojw;
        //   461: astore_3       
        //   462: invokestatic    okm.b:()Lokm;
        //   465: astore_2       
        //   466: getstatic       oie.c:Loie;
        //   469: astore          5
        //   471: aload_3        
        //   472: invokevirtual   ojw.l:()Lokb;
        //   475: astore_3       
        //   476: aload           5
        //   478: iconst_4       
        //   479: invokevirtual   oky.H:(I)Ljava/lang/Object;
        //   482: checkcast       Loky;
        //   485: astore          8
        //   487: getstatic       omr.a:Lomr;
        //   490: aload           8
        //   492: invokevirtual   omr.b:(Ljava/lang/Object;)Lomy;
        //   495: astore          5
        //   497: aload           5
        //   499: aload           8
        //   501: aload_3        
        //   502: invokestatic    okc.p:(Lokb;)Lokc;
        //   505: aload_2        
        //   506: invokeinterface omy.h:(Ljava/lang/Object;Lomu;Lokm;)V
        //   511: aload           5
        //   513: aload           8
        //   515: invokeinterface omy.f:(Ljava/lang/Object;)V
        //   520: aload_3        
        //   521: iconst_0       
        //   522: invokevirtual   okb.z:(I)V
        //   525: aload           8
        //   527: invokestatic    oky.I:(Loky;)V
        //   530: aload           8
        //   532: checkcast       Loie;
        //   535: astore_2       
        //   536: aload_2        
        //   537: getfield        oie.a:I
        //   540: iconst_1       
        //   541: if_icmpne       559
        //   544: aload_2        
        //   545: getfield        oie.b:Ljava/lang/Object;
        //   548: checkcast       Ljava/lang/Long;
        //   551: invokevirtual   java/lang/Long.longValue:()J
        //   554: lstore          11
        //   556: goto            562
        //   559: lconst_0       
        //   560: lstore          11
        //   562: lload           11
        //   564: lconst_0       
        //   565: lcmp           
        //   566: iflt            604
        //   569: aload_0        
        //   570: aload_0        
        //   571: invokevirtual   jzg.a:(Landroid/content/Context;)Ljzm;
        //   574: astore_3       
        //   575: aload_1        
        //   576: invokestatic    jzm.a:(Ljava/lang/String;)V
        //   579: aload           4
        //   581: new             Ljzj;
        //   584: dup            
        //   585: aload_3        
        //   586: getfield        jzm.b:Ljzq;
        //   589: aload_1        
        //   590: aload           7
        //   592: aload_2        
        //   593: aload_3        
        //   594: getfield        jzm.c:Ljava/util/concurrent/ExecutorService;
        //   597: invokespecial   jzj.<init>:(Ljzq;Ljava/lang/String;Loif;Loie;Ljava/util/concurrent/ExecutorService;)V
        //   600: invokevirtual   jzu.a:(Ljyw;)V
        //   603: return         
        //   604: new             Lolm;
        //   607: astore_1       
        //   608: aload_1        
        //   609: ldc             "LastReturnedId less than zero"
        //   611: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //   614: aload_1        
        //   615: athrow         
        //   616: astore_1       
        //   617: aload_1        
        //   618: athrow         
        //   619: astore_1       
        //   620: aload_1        
        //   621: invokevirtual   java/lang/RuntimeException.getCause:()Ljava/lang/Throwable;
        //   624: instanceof      Lolm;
        //   627: ifeq            638
        //   630: aload_1        
        //   631: invokevirtual   java/lang/RuntimeException.getCause:()Ljava/lang/Throwable;
        //   634: checkcast       Lolm;
        //   637: athrow         
        //   638: aload_1        
        //   639: athrow         
        //   640: astore_1       
        //   641: aload_1        
        //   642: invokevirtual   java/io/IOException.getCause:()Ljava/lang/Throwable;
        //   645: instanceof      Lolm;
        //   648: ifeq            659
        //   651: aload_1        
        //   652: invokevirtual   java/io/IOException.getCause:()Ljava/lang/Throwable;
        //   655: checkcast       Lolm;
        //   658: athrow         
        //   659: new             Lolm;
        //   662: astore_2       
        //   663: aload_2        
        //   664: aload_1        
        //   665: invokespecial   olm.<init>:(Ljava/io/IOException;)V
        //   668: aload_2        
        //   669: athrow         
        //   670: astore_1       
        //   671: goto            696
        //   674: astore_1       
        //   675: aload_1        
        //   676: astore_2       
        //   677: aload_1        
        //   678: getfield        olm.a:Z
        //   681: ifeq            693
        //   684: new             Lolm;
        //   687: astore_2       
        //   688: aload_2        
        //   689: aload_1        
        //   690: invokespecial   olm.<init>:(Ljava/io/IOException;)V
        //   693: aload_2        
        //   694: athrow         
        //   695: astore_1       
        //   696: aload_1        
        //   697: athrow         
        //   698: astore_1       
        //   699: goto            703
        //   702: astore_1       
        //   703: ldc             "ExampleStoreSvc"
        //   705: aload_1        
        //   706: invokevirtual   olm.getMessage:()Ljava/lang/String;
        //   709: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   712: pop            
        //   713: aload           4
        //   715: aload_1        
        //   716: invokevirtual   olm.getMessage:()Ljava/lang/String;
        //   719: invokevirtual   jzu.b:(Ljava/lang/String;)V
        //   722: return         
        //   723: astore_1       
        //   724: ldc             "ExampleStoreSvc"
        //   726: ldc             "Error parsing Any proto from resumptionPoint"
        //   728: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   731: pop            
        //   732: aload           4
        //   734: ldc             "Error parsing Any proto from resumptionPoint"
        //   736: invokevirtual   jzu.b:(Ljava/lang/String;)V
        //   739: return         
        //   740: new             Lolm;
        //   743: astore_1       
        //   744: aload_1        
        //   745: ldc             "End date before start date"
        //   747: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //   750: aload_1        
        //   751: athrow         
        //   752: new             Lolm;
        //   755: astore_1       
        //   756: aload_1        
        //   757: ldc             "Invalid end date nanos"
        //   759: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //   762: aload_1        
        //   763: athrow         
        //   764: new             Lolm;
        //   767: astore_1       
        //   768: aload_1        
        //   769: ldc             "End date less than zero"
        //   771: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //   774: aload_1        
        //   775: athrow         
        //   776: new             Lolm;
        //   779: astore_1       
        //   780: aload_1        
        //   781: ldc             "Invalid start date nanos"
        //   783: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //   786: aload_1        
        //   787: athrow         
        //   788: new             Lolm;
        //   791: astore_1       
        //   792: aload_1        
        //   793: ldc             "Start date less than zero"
        //   795: invokespecial   olm.<init>:(Ljava/lang/String;)V
        //   798: aload_1        
        //   799: athrow         
        //   800: astore_1       
        //   801: aload_1        
        //   802: athrow         
        //   803: astore_1       
        //   804: aload_1        
        //   805: invokevirtual   java/lang/RuntimeException.getCause:()Ljava/lang/Throwable;
        //   808: instanceof      Lolm;
        //   811: ifeq            822
        //   814: aload_1        
        //   815: invokevirtual   java/lang/RuntimeException.getCause:()Ljava/lang/Throwable;
        //   818: checkcast       Lolm;
        //   821: athrow         
        //   822: aload_1        
        //   823: athrow         
        //   824: astore_2       
        //   825: aload_2        
        //   826: invokevirtual   java/io/IOException.getCause:()Ljava/lang/Throwable;
        //   829: instanceof      Lolm;
        //   832: ifeq            843
        //   835: aload_2        
        //   836: invokevirtual   java/io/IOException.getCause:()Ljava/lang/Throwable;
        //   839: checkcast       Lolm;
        //   842: athrow         
        //   843: new             Lolm;
        //   846: astore_1       
        //   847: aload_1        
        //   848: aload_2        
        //   849: invokespecial   olm.<init>:(Ljava/io/IOException;)V
        //   852: aload_1        
        //   853: athrow         
        //   854: astore_1       
        //   855: goto            880
        //   858: astore_1       
        //   859: aload_1        
        //   860: astore_2       
        //   861: aload_1        
        //   862: getfield        olm.a:Z
        //   865: ifeq            877
        //   868: new             Lolm;
        //   871: astore_2       
        //   872: aload_2        
        //   873: aload_1        
        //   874: invokespecial   olm.<init>:(Ljava/io/IOException;)V
        //   877: aload_2        
        //   878: athrow         
        //   879: astore_1       
        //   880: aload_1        
        //   881: athrow         
        //   882: astore_1       
        //   883: goto            887
        //   886: astore_1       
        //   887: aload_1        
        //   888: invokevirtual   olm.getMessage:()Ljava/lang/String;
        //   891: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   894: astore_1       
        //   895: aload_1        
        //   896: invokevirtual   java/lang/String.length:()I
        //   899: ifeq            912
        //   902: ldc             "Error parsing SelectionCriteria proto: "
        //   904: aload_1        
        //   905: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   908: astore_1       
        //   909: goto            922
        //   912: new             Ljava/lang/String;
        //   915: dup            
        //   916: ldc             "Error parsing SelectionCriteria proto: "
        //   918: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   921: astore_1       
        //   922: ldc             "ExampleStoreSvc"
        //   924: aload_1        
        //   925: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   928: pop            
        //   929: aload           4
        //   931: aload_1        
        //   932: invokevirtual   jzu.b:(Ljava/lang/String;)V
        //   935: return         
        //   936: astore_1       
        //   937: ldc             "ExampleStoreSvc"
        //   939: ldc             "Error parsing Any proto from criteria"
        //   941: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   944: pop            
        //   945: aload           4
        //   947: ldc             "Error parsing Any proto from criteria"
        //   949: invokevirtual   jzu.b:(Ljava/lang/String;)V
        //   952: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      18     936    953    Lolm;
        //  18     27     886    887    Lolm;
        //  32     44     886    887    Lolm;
        //  47     78     886    887    Lolm;
        //  78     93     886    887    Lolm;
        //  93     111    879    880    Lolm;
        //  111    145    858    879    Lolm;
        //  111    145    824    854    Ljava/io/IOException;
        //  111    145    803    824    Ljava/lang/RuntimeException;
        //  145    151    800    803    Lolm;
        //  151    170    886    887    Lolm;
        //  178    182    886    887    Lolm;
        //  182    198    886    887    Lolm;
        //  206    210    886    887    Lolm;
        //  210    224    886    887    Lolm;
        //  232    236    886    887    Lolm;
        //  236    252    886    887    Lolm;
        //  260    264    886    887    Lolm;
        //  264    280    886    887    Lolm;
        //  288    292    886    887    Lolm;
        //  292    306    886    887    Lolm;
        //  314    318    886    887    Lolm;
        //  318    334    886    887    Lolm;
        //  342    346    886    887    Lolm;
        //  346    359    886    887    Lolm;
        //  367    371    886    887    Lolm;
        //  371    377    886    887    Lolm;
        //  385    401    723    740    Lolm;
        //  401    423    702    703    Lolm;
        //  426    457    702    703    Lolm;
        //  457    471    702    703    Lolm;
        //  471    487    695    696    Lolm;
        //  487    520    674    695    Lolm;
        //  487    520    640    670    Ljava/io/IOException;
        //  487    520    619    640    Ljava/lang/RuntimeException;
        //  520    525    616    619    Lolm;
        //  525    556    702    703    Lolm;
        //  604    616    698    702    Lolm;
        //  617    619    670    674    Lolm;
        //  620    638    670    674    Lolm;
        //  638    640    670    674    Lolm;
        //  641    659    670    674    Lolm;
        //  659    670    670    674    Lolm;
        //  677    693    670    674    Lolm;
        //  693    695    670    674    Lolm;
        //  696    698    698    702    Lolm;
        //  740    752    882    886    Lolm;
        //  752    764    882    886    Lolm;
        //  764    776    882    886    Lolm;
        //  776    788    882    886    Lolm;
        //  788    800    882    886    Lolm;
        //  801    803    854    858    Lolm;
        //  804    822    854    858    Lolm;
        //  822    824    854    858    Lolm;
        //  825    843    854    858    Lolm;
        //  843    854    854    858    Lolm;
        //  861    877    854    858    Lolm;
        //  877    879    854    858    Lolm;
        //  880    882    882    886    Lolm;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0638:
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
