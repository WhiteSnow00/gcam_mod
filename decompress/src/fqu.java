import android.media.MediaFormat;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqu implements fut
{
    private static final AtomicInteger b;
    public final fsj a;
    private final fqv c;
    private final ful d;
    private final krr e;
    private final cxl f;
    private final MediaFormat g;
    private final MediaFormat h;
    private final long i;
    private final gry j;
    
    static {
        b = new AtomicInteger(0);
    }
    
    public fqu(final fqv c, final ful d, final krr krr, final cxl f, final fsj a, final MediaFormat g, final MediaFormat h, final long i, final gry j) {
        this.c = c;
        this.d = d;
        this.e = krr.a(fsh.class.getSimpleName());
        this.f = f;
        this.a = a;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    private static int d(final boolean b, final boolean b2) {
        if (!b) {
            return 0;
        }
        if (b2) {
            return 2;
        }
        return 1;
    }
    
    @Override
    public final int a() {
        return 1;
    }
    
    @Override
    public final void b(final kvs p0, final fvn p1, final fvd p2, final fus p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   java/util/concurrent/atomic/AtomicInteger.getAndIncrement:()I
        //     6: istore          5
        //     8: new             Ljava/lang/StringBuilder;
        //    11: dup            
        //    12: bipush          31
        //    14: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    17: astore          6
        //    19: aload           6
        //    21: ldc             "fast launcher shot "
        //    23: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    26: pop            
        //    27: aload           6
        //    29: iload           5
        //    31: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    34: pop            
        //    35: aload           6
        //    37: ldc             " "
        //    39: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    42: pop            
        //    43: aload           6
        //    45: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    48: aload_0        
        //    49: getfield        fqu.e:Lkrr;
        //    52: invokestatic    krv.j:(Ljava/lang/String;Lkrr;)Lkrv;
        //    55: astore          7
        //    57: aload           7
        //    59: ldc             "launcher got a HDR+ burst"
        //    61: invokeinterface krr.b:(Ljava/lang/String;)V
        //    66: aload_1        
        //    67: invokeinterface kvs.b:()Lkvx;
        //    72: astore          6
        //    74: aload           6
        //    76: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    79: pop            
        //    80: aload           6
        //    82: getfield        kvx.a:J
        //    85: lstore          8
        //    87: new             Ljava/lang/StringBuilder;
        //    90: dup            
        //    91: bipush          36
        //    93: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    96: astore          6
        //    98: aload           6
        //   100: ldc             "    with frame: "
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: pop            
        //   106: aload           6
        //   108: lload           8
        //   110: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   113: pop            
        //   114: aload           7
        //   116: aload           6
        //   118: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   121: invokeinterface krr.b:(Ljava/lang/String;)V
        //   126: aload_1        
        //   127: invokestatic    com/google/android/apps/camera/moments/MomentsUtils.a:(Lkvs;)Loey;
        //   130: ldc2_w          5000
        //   133: getstatic       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //   136: invokeinterface oey.get:(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
        //   141: checkcast       Lljm;
        //   144: astore          10
        //   146: aload_1        
        //   147: invokeinterface kvs.b:()Lkvx;
        //   152: astore          6
        //   154: aload           6
        //   156: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   159: pop            
        //   160: aload           6
        //   162: getfield        kvx.a:J
        //   165: lstore          8
        //   167: aload_0        
        //   168: getfield        fqu.j:Lgry;
        //   171: aload_1        
        //   172: invokevirtual   gry.a:(Lkvs;)Lgrx;
        //   175: astore_1       
        //   176: aload_1        
        //   177: invokevirtual   grx.e:()Llju;
        //   180: astore          6
        //   182: aload_1        
        //   183: invokevirtual   grx.d:()Llju;
        //   186: astore_1       
        //   187: aload_1        
        //   188: ifnonnull       204
        //   191: new             Llga;
        //   194: dup            
        //   195: lload           8
        //   197: invokespecial   lga.<init>:(J)V
        //   200: astore_1       
        //   201: goto            204
        //   204: aload           6
        //   206: ifnonnull       226
        //   209: aload           4
        //   211: new             Ljava/lang/RuntimeException;
        //   214: dup            
        //   215: ldc             "Could not get a raw image from input frame"
        //   217: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   220: invokeinterface fus.b:(Ljava/lang/Throwable;)V
        //   225: return         
        //   226: new             Llgb;
        //   229: dup            
        //   230: aload           6
        //   232: iconst_1       
        //   233: invokespecial   lgb.<init>:(Llju;I)V
        //   236: astore          6
        //   238: new             Llgb;
        //   241: astore          11
        //   243: aload           11
        //   245: aload_1        
        //   246: iconst_1       
        //   247: invokespecial   lgb.<init>:(Llju;I)V
        //   250: aload           7
        //   252: ldc             "Acquired frame metadata successfully."
        //   254: invokeinterface krr.b:(Ljava/lang/String;)V
        //   259: aload           11
        //   261: invokevirtual   lgb.k:()Llju;
        //   264: astore          12
        //   266: aload           12
        //   268: ifnonnull       299
        //   271: aload           7
        //   273: ldc             "Failed to fork PD image"
        //   275: invokeinterface krr.d:(Ljava/lang/String;)V
        //   280: aload           11
        //   282: invokevirtual   lgb.l:()V
        //   285: aload           6
        //   287: invokevirtual   lgb.l:()V
        //   290: return         
        //   291: astore_1       
        //   292: goto            795
        //   295: astore_1       
        //   296: goto            774
        //   299: new             Lfqt;
        //   302: astore          13
        //   304: aload           11
        //   306: astore          14
        //   308: aload           6
        //   310: astore          15
        //   312: aload           13
        //   314: aload_0        
        //   315: aload           6
        //   317: aload_3        
        //   318: lload           8
        //   320: aload           10
        //   322: aload_1        
        //   323: aload           12
        //   325: aload           4
        //   327: aload           7
        //   329: invokespecial   fqt.<init>:(Lfqu;Llgb;Lfvd;JLljm;Llju;Llju;Lfus;Lkrr;)V
        //   332: aload_0        
        //   333: getfield        fqu.c:Lfqv;
        //   336: aload           10
        //   338: aload_2        
        //   339: getfield        fvn.a:I
        //   342: invokevirtual   fqv.a:(Lljm;I)Lfum;
        //   345: astore          4
        //   347: aload_2        
        //   348: getfield        fvn.i:Z
        //   351: istore          16
        //   353: iload           16
        //   355: ifeq            387
        //   358: new             Lkre;
        //   361: astore_1       
        //   362: aload_1        
        //   363: aload_0        
        //   364: getfield        fqu.h:Landroid/media/MediaFormat;
        //   367: ldc             "width"
        //   369: invokevirtual   android/media/MediaFormat.getInteger:(Ljava/lang/String;)I
        //   372: aload_0        
        //   373: getfield        fqu.h:Landroid/media/MediaFormat;
        //   376: ldc             "height"
        //   378: invokevirtual   android/media/MediaFormat.getInteger:(Ljava/lang/String;)I
        //   381: invokespecial   kre.<init>:(II)V
        //   384: goto            413
        //   387: new             Lkre;
        //   390: dup            
        //   391: aload_0        
        //   392: getfield        fqu.g:Landroid/media/MediaFormat;
        //   395: ldc             "width"
        //   397: invokevirtual   android/media/MediaFormat.getInteger:(Ljava/lang/String;)I
        //   400: aload_0        
        //   401: getfield        fqu.g:Landroid/media/MediaFormat;
        //   404: ldc             "height"
        //   406: invokevirtual   android/media/MediaFormat.getInteger:(Ljava/lang/String;)I
        //   409: invokespecial   kre.<init>:(II)V
        //   412: astore_1       
        //   413: aload_2        
        //   414: getfield        fvn.i:Z
        //   417: istore          17
        //   419: iconst_0       
        //   420: istore          16
        //   422: iload           17
        //   424: ifeq            495
        //   427: aload_0        
        //   428: getfield        fqu.f:Lcxl;
        //   431: getstatic       cxx.n:Lcxm;
        //   434: invokeinterface cxl.k:(Lcxm;)Z
        //   439: istore          17
        //   441: aload_0        
        //   442: getfield        fqu.f:Lcxl;
        //   445: getstatic       cxx.p:Lcxm;
        //   448: invokeinterface cxl.k:(Lcxm;)Z
        //   453: ifne            480
        //   456: aload_0        
        //   457: getfield        fqu.f:Lcxl;
        //   460: getstatic       cxx.o:Lcxm;
        //   463: invokeinterface cxl.k:(Lcxm;)Z
        //   468: ifeq            477
        //   471: iconst_1       
        //   472: istore          16
        //   474: goto            483
        //   477: goto            483
        //   480: iconst_1       
        //   481: istore          16
        //   483: iload           17
        //   485: iload           16
        //   487: invokestatic    fqu.d:(ZZ)I
        //   490: istore          18
        //   492: goto            527
        //   495: aload_0        
        //   496: getfield        fqu.f:Lcxl;
        //   499: astore_2       
        //   500: getstatic       cxx.a:Lcxm;
        //   503: astore          10
        //   505: aload_2        
        //   506: invokeinterface cxl.e:()V
        //   511: aload_0        
        //   512: getfield        fqu.f:Lcxl;
        //   515: invokeinterface cxl.e:()V
        //   520: iconst_0       
        //   521: iconst_0       
        //   522: invokestatic    fqu.d:(ZZ)I
        //   525: istore          18
        //   527: aload_0        
        //   528: getfield        fqu.f:Lcxl;
        //   531: getstatic       cxx.u:Lcxm;
        //   534: invokeinterface cxl.k:(Lcxm;)Z
        //   539: istore          16
        //   541: iconst_3       
        //   542: istore          19
        //   544: iload           16
        //   546: ifeq            576
        //   549: aload_0        
        //   550: getfield        fqu.f:Lcxl;
        //   553: getstatic       cxx.M:Lcxm;
        //   556: invokeinterface cxl.k:(Lcxm;)Z
        //   561: ifeq            570
        //   564: iconst_2       
        //   565: istore          5
        //   567: goto            579
        //   570: iconst_1       
        //   571: istore          5
        //   573: goto            579
        //   576: iconst_3       
        //   577: istore          5
        //   579: iconst_1       
        //   580: aload_3        
        //   581: getfield        fvd.b:Z
        //   584: if_icmpeq       590
        //   587: goto            594
        //   590: iload           19
        //   592: istore          5
        //   594: new             Lfuk;
        //   597: astore_2       
        //   598: iload           16
        //   600: ifeq            609
        //   603: lconst_0       
        //   604: lstore          8
        //   606: goto            615
        //   609: aload_0        
        //   610: getfield        fqu.i:J
        //   613: lstore          8
        //   615: aload_2        
        //   616: aload_1        
        //   617: iload           18
        //   619: iload           5
        //   621: lload           8
        //   623: invokespecial   fuk.<init>:(Lkre;IIJ)V
        //   626: aload           15
        //   628: invokevirtual   lgb.k:()Llju;
        //   631: astore_1       
        //   632: aload_1        
        //   633: ifnonnull       657
        //   636: aload           7
        //   638: ldc_w           "Failed to fork raw image"
        //   641: invokeinterface krr.d:(Ljava/lang/String;)V
        //   646: aload           14
        //   648: invokevirtual   lgb.l:()V
        //   651: aload           15
        //   653: invokevirtual   lgb.l:()V
        //   656: return         
        //   657: aload_0        
        //   658: getfield        fqu.d:Lful;
        //   661: aload_1        
        //   662: aload           4
        //   664: aload_2        
        //   665: aload           13
        //   667: invokeinterface ful.b:(Llju;Lfum;Lfuk;Lfuj;)V
        //   672: iload           5
        //   674: tableswitch {
        //                2: 710
        //                3: 703
        //          default: 696
        //        }
        //   696: ldc_w           "YUV_IMAGE"
        //   699: astore_1       
        //   700: goto            714
        //   703: ldc_w           "YUV_HARDWARE_BUFFER"
        //   706: astore_1       
        //   707: goto            714
        //   710: ldc_w           "RGBA_HARDWARE_BUFFER"
        //   713: astore_1       
        //   714: aload_1        
        //   715: invokevirtual   java/lang/String.length:()I
        //   718: istore          5
        //   720: new             Ljava/lang/StringBuilder;
        //   723: astore_2       
        //   724: aload_2        
        //   725: iload           5
        //   727: bipush          45
        //   729: iadd           
        //   730: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   733: aload_2        
        //   734: ldc_w           "launched FastMomentsHdr shot, outputFormat = "
        //   737: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   740: pop            
        //   741: aload_2        
        //   742: aload_1        
        //   743: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   746: pop            
        //   747: aload           7
        //   749: aload_2        
        //   750: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   753: invokeinterface krr.b:(Ljava/lang/String;)V
        //   758: aload           14
        //   760: invokevirtual   lgb.l:()V
        //   763: aload           15
        //   765: invokevirtual   lgb.l:()V
        //   768: return         
        //   769: astore_1       
        //   770: goto            774
        //   773: astore_1       
        //   774: aload           11
        //   776: invokevirtual   lgb.l:()V
        //   779: goto            788
        //   782: astore_2       
        //   783: aload_1        
        //   784: aload_2        
        //   785: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   788: aload_1        
        //   789: athrow         
        //   790: astore_1       
        //   791: goto            795
        //   794: astore_1       
        //   795: aload           6
        //   797: invokevirtual   lgb.l:()V
        //   800: goto            809
        //   803: astore_2       
        //   804: aload_1        
        //   805: aload_2        
        //   806: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   809: aload_1        
        //   810: athrow         
        //   811: astore_1       
        //   812: aload           7
        //   814: ldc_w           "Timed out waiting for metadata."
        //   817: invokeinterface krr.d:(Ljava/lang/String;)V
        //   822: aload           4
        //   824: aload_1        
        //   825: invokeinterface fus.b:(Ljava/lang/Throwable;)V
        //   830: return         
        //   831: astore_1       
        //   832: aload           7
        //   834: ldc_w           "metadata get interrupted"
        //   837: invokeinterface krr.d:(Ljava/lang/String;)V
        //   842: aload           4
        //   844: aload_1        
        //   845: invokeinterface fus.b:(Ljava/lang/Throwable;)V
        //   850: return         
        //   851: astore_1       
        //   852: aload           7
        //   854: ldc_w           "Failed to acquire metadata from the first frame."
        //   857: invokeinterface krr.d:(Ljava/lang/String;)V
        //   862: aload           4
        //   864: aload_1        
        //   865: invokeinterface fus.b:(Ljava/lang/Throwable;)V
        //   870: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  126    146    851    871    Ljava/util/concurrent/ExecutionException;
        //  126    146    831    851    Ljava/lang/InterruptedException;
        //  126    146    811    831    Ljava/util/concurrent/TimeoutException;
        //  238    250    794    795    Any
        //  250    266    773    774    Any
        //  271    280    295    299    Any
        //  280    285    291    295    Any
        //  299    304    773    774    Any
        //  312    353    769    773    Any
        //  358    384    769    773    Any
        //  387    413    769    773    Any
        //  413    419    769    773    Any
        //  427    471    769    773    Any
        //  483    492    769    773    Any
        //  495    527    769    773    Any
        //  527    541    769    773    Any
        //  549    564    769    773    Any
        //  579    587    769    773    Any
        //  594    598    769    773    Any
        //  609    615    769    773    Any
        //  615    632    769    773    Any
        //  636    646    769    773    Any
        //  646    651    790    794    Any
        //  657    672    769    773    Any
        //  714    758    769    773    Any
        //  758    763    790    794    Any
        //  774    779    782    788    Any
        //  783    788    790    794    Any
        //  788    790    790    794    Any
        //  795    800    803    809    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0657:
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
    public final boolean c(final kvs kvs, final gry gry) {
        return this.d.c(kvs, gry);
    }
}
