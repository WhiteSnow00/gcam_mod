import android.opengl.Matrix;
import java.util.Vector;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eta extends erx
{
    public final esy f;
    public final Vector g;
    private final float[] h;
    private final float[] i;
    private final float[] j;
    private final float[] k;
    private final jdl l;
    private ets m;
    private double n;
    
    public eta(final esy f) {
        this.h = new float[16];
        this.i = new float[16];
        this.j = new float[16];
        this.k = new float[16];
        this.l = new jdl();
        this.n = -1.0;
        this.g = new Vector();
        this.f = f;
        try {
            this.m = new ets();
            erz.a("photo collection");
        }
        catch (final erz erz) {
            erz.printStackTrace();
        }
        Matrix.setIdentityM(this.j, 0);
        Matrix.rotateM(this.j, 0, 180.0f, 1.0f, 0.0f, 0.0f);
    }
    
    public final int b(float[] a) {
        final esz esz = new esz();
        esz.b = a.clone();
        final float[] b = esz.b;
        a = esz.a;
        final float[] i = this.i;
        i[0] = b[0];
        i[1] = b[1];
        i[2] = b[2];
        i[3] = 0.0f;
        i[4] = b[3];
        i[5] = b[4];
        i[6] = b[5];
        i[7] = 0.0f;
        i[8] = b[6];
        i[9] = b[7];
        i[10] = b[8];
        i[13] = (i[14] = 0.0f);
        i[11] = (i[12] = 0.0f);
        i[15] = 1.0f;
        Matrix.multiplyMM(this.h, 0, this.j, 0, i, 0);
        Matrix.transposeM(a, 0, this.h, 0);
        esz.e = 0.1f;
        esz.i = new ery(null);
        esh.h(esz.i.a);
        esz.j = new ery(null);
        this.g.add(esz);
        return esz.j.a;
    }
    
    @Override
    public final void c(final float[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        eta.f:Lesy;
        //     4: astore_2       
        //     5: aload_2        
        //     6: getfield        erx.e:Lesa;
        //     9: astore_3       
        //    10: aload_2        
        //    11: getfield        esy.l:Z
        //    14: istore          4
        //    16: aload_2        
        //    17: getfield        esy.m:Z
        //    20: istore          5
        //    22: iconst_0       
        //    23: istore          6
        //    25: aload_2        
        //    26: iconst_0       
        //    27: putfield        esy.l:Z
        //    30: aload_2        
        //    31: iconst_1       
        //    32: putfield        esy.m:Z
        //    35: aload_2        
        //    36: aload_0        
        //    37: getfield        eta.m:Lets;
        //    40: putfield        erx.e:Lesa;
        //    43: aload_0        
        //    44: getfield        eta.n:D
        //    47: dstore          7
        //    49: ldc2_w          -4616189618054758400
        //    52: lstore          9
        //    54: dconst_0       
        //    55: dstore          11
        //    57: ldc2_w          4607182418800017408
        //    60: lstore          13
        //    62: dload           7
        //    64: dconst_0       
        //    65: dcmpl          
        //    66: iflt            110
        //    69: dload           7
        //    71: dconst_1       
        //    72: dload           7
        //    74: dsub           
        //    75: ldc2_w          0.05
        //    78: dmul           
        //    79: dadd           
        //    80: dstore          7
        //    82: aload_0        
        //    83: dload           7
        //    85: putfield        eta.n:D
        //    88: dload           7
        //    90: ldc2_w          0.95
        //    93: dcmpl          
        //    94: iflt            110
        //    97: aload_0        
        //    98: ldc2_w          -1.0
        //   101: putfield        eta.n:D
        //   104: iconst_1       
        //   105: istore          15
        //   107: goto            113
        //   110: iconst_0       
        //   111: istore          15
        //   113: aload_0        
        //   114: getfield        eta.g:Ljava/util/Vector;
        //   117: astore_2       
        //   118: aload_2        
        //   119: monitorenter   
        //   120: iload           6
        //   122: aload_0        
        //   123: getfield        eta.g:Ljava/util/Vector;
        //   126: invokevirtual   java/util/Vector.size:()I
        //   129: if_icmpge       859
        //   132: aload_0        
        //   133: getfield        eta.g:Ljava/util/Vector;
        //   136: iload           6
        //   138: invokevirtual   java/util/Vector.get:(I)Ljava/lang/Object;
        //   141: checkcast       Lesz;
        //   144: astore          16
        //   146: aload           16
        //   148: getfield        esz.g:Z
        //   151: ifne            169
        //   154: lload           9
        //   156: lstore          17
        //   158: lload           13
        //   160: lstore          9
        //   162: lload           17
        //   164: lstore          13
        //   166: goto            841
        //   169: aload           16
        //   171: getfield        esz.e:F
        //   174: fstore          19
        //   176: aload           16
        //   178: getfield        esz.h:I
        //   181: istore          20
        //   183: aload           16
        //   185: getfield        esz.i:Lery;
        //   188: getfield        ery.a:I
        //   191: iconst_m1      
        //   192: if_icmpeq       207
        //   195: iload           15
        //   197: ifeq            207
        //   200: aload           16
        //   202: getfield        esz.f:Z
        //   205: istore          21
        //   207: aload           16
        //   209: getfield        esz.a:[F
        //   212: astore          22
        //   214: aload_0        
        //   215: getfield        eta.n:D
        //   218: dstore          23
        //   220: dload           23
        //   222: dload           11
        //   224: dcmpl          
        //   225: iflt            594
        //   228: aload           16
        //   230: getfield        esz.c:Ljdl;
        //   233: astore          25
        //   235: aload           16
        //   237: getfield        esz.d:Ljdl;
        //   240: astore          26
        //   242: aload_0        
        //   243: getfield        eta.l:Ljdl;
        //   246: astore          22
        //   248: aload           25
        //   250: getfield        jdl.a:D
        //   253: dstore          27
        //   255: aload           26
        //   257: getfield        jdl.a:D
        //   260: dstore          7
        //   262: aload           25
        //   264: getfield        jdl.b:D
        //   267: dstore          11
        //   269: aload_2        
        //   270: astore          29
        //   272: aload           29
        //   274: astore          30
        //   276: dload           27
        //   278: dload           7
        //   280: dmul           
        //   281: dload           11
        //   283: aload           26
        //   285: getfield        jdl.b:D
        //   288: dmul           
        //   289: dadd           
        //   290: aload           25
        //   292: getfield        jdl.c:D
        //   295: aload           26
        //   297: getfield        jdl.c:D
        //   300: dmul           
        //   301: dadd           
        //   302: aload           25
        //   304: getfield        jdl.d:D
        //   307: aload           26
        //   309: getfield        jdl.d:D
        //   312: dmul           
        //   313: dadd           
        //   314: dstore          7
        //   316: dload           7
        //   318: dconst_1       
        //   319: dcmpl          
        //   320: ifgt            335
        //   323: dload           7
        //   325: ldc2_w          -1.0
        //   328: dcmpg          
        //   329: ifge            346
        //   332: goto            335
        //   335: aload           29
        //   337: astore          30
        //   339: aload           22
        //   341: aload           26
        //   343: invokevirtual   jdl.a:(Ljdl;)V
        //   346: dconst_0       
        //   347: dstore          27
        //   349: dload           7
        //   351: dconst_0       
        //   352: dcmpg          
        //   353: ifge            369
        //   356: dload           7
        //   358: dneg           
        //   359: dstore          7
        //   361: ldc2_w          -1.0
        //   364: dstore          11
        //   366: goto            372
        //   369: dconst_1       
        //   370: dstore          11
        //   372: aload           29
        //   374: astore          30
        //   376: dload           7
        //   378: invokestatic    java/lang/Math.acos:(D)D
        //   381: dstore          31
        //   383: dload           31
        //   385: ldc2_w          1.0E-6
        //   388: dcmpg          
        //   389: ifgt            406
        //   392: aload           29
        //   394: astore          30
        //   396: aload           22
        //   398: aload           26
        //   400: invokevirtual   jdl.a:(Ljdl;)V
        //   403: goto            562
        //   406: aload           29
        //   408: astore          30
        //   410: dconst_1       
        //   411: dload           31
        //   413: invokestatic    java/lang/Math.sin:(D)D
        //   416: ddiv           
        //   417: dstore          33
        //   419: aload           29
        //   421: astore          30
        //   423: dconst_1       
        //   424: dload           23
        //   426: dsub           
        //   427: dload           31
        //   429: dmul           
        //   430: invokestatic    java/lang/Math.sin:(D)D
        //   433: dload           33
        //   435: dmul           
        //   436: dstore          7
        //   438: aload           29
        //   440: astore          30
        //   442: dload           11
        //   444: dload           23
        //   446: dload           31
        //   448: dmul           
        //   449: invokestatic    java/lang/Math.sin:(D)D
        //   452: dmul           
        //   453: dload           33
        //   455: dmul           
        //   456: dstore          11
        //   458: aload           29
        //   460: astore          30
        //   462: aload           22
        //   464: aload           25
        //   466: getfield        jdl.a:D
        //   469: dload           7
        //   471: dmul           
        //   472: aload           26
        //   474: getfield        jdl.a:D
        //   477: dload           11
        //   479: dmul           
        //   480: dadd           
        //   481: putfield        jdl.a:D
        //   484: aload           29
        //   486: astore          30
        //   488: aload           22
        //   490: aload           25
        //   492: getfield        jdl.b:D
        //   495: dload           7
        //   497: dmul           
        //   498: aload           26
        //   500: getfield        jdl.b:D
        //   503: dload           11
        //   505: dmul           
        //   506: dadd           
        //   507: putfield        jdl.b:D
        //   510: aload           29
        //   512: astore          30
        //   514: aload           22
        //   516: aload           25
        //   518: getfield        jdl.c:D
        //   521: dload           7
        //   523: dmul           
        //   524: aload           26
        //   526: getfield        jdl.c:D
        //   529: dload           11
        //   531: dmul           
        //   532: dadd           
        //   533: putfield        jdl.c:D
        //   536: aload           29
        //   538: astore          30
        //   540: aload           22
        //   542: aload           25
        //   544: getfield        jdl.d:D
        //   547: dload           7
        //   549: dmul           
        //   550: aload           26
        //   552: getfield        jdl.d:D
        //   555: dload           11
        //   557: dmul           
        //   558: dadd           
        //   559: putfield        jdl.d:D
        //   562: aload           29
        //   564: astore          30
        //   566: aload_0        
        //   567: getfield        eta.l:Ljdl;
        //   570: aload_0        
        //   571: getfield        eta.i:[F
        //   574: invokevirtual   jdl.b:([F)V
        //   577: aload           29
        //   579: astore          30
        //   581: aload_0        
        //   582: getfield        eta.i:[F
        //   585: astore          22
        //   587: dload           27
        //   589: dstore          11
        //   591: goto            594
        //   594: aload_2        
        //   595: astore          29
        //   597: ldc2_w          4607182418800017408
        //   600: lstore          9
        //   602: ldc2_w          -4616189618054758400
        //   605: lstore          13
        //   607: aload           29
        //   609: astore          30
        //   611: aload_0        
        //   612: getfield        eta.k:[F
        //   615: iconst_0       
        //   616: aload_1        
        //   617: iconst_0       
        //   618: aload           22
        //   620: iconst_0       
        //   621: invokestatic    android/opengl/Matrix.multiplyMM:([FI[FI[FI)V
        //   624: aload           29
        //   626: astore          30
        //   628: aload_0        
        //   629: getfield        eta.m:Lets;
        //   632: invokevirtual   esa.c:()V
        //   635: aload           29
        //   637: astore          30
        //   639: aload           16
        //   641: getfield        esz.i:Lery;
        //   644: getfield        ery.a:I
        //   647: istore          35
        //   649: aload           29
        //   651: astore          30
        //   653: aload           16
        //   655: getfield        esz.j:Lery;
        //   658: getfield        ery.a:I
        //   661: istore          36
        //   663: iload           35
        //   665: iconst_m1      
        //   666: if_icmpeq       724
        //   669: aload           29
        //   671: astore          30
        //   673: aload           16
        //   675: getfield        esz.f:Z
        //   678: istore          21
        //   680: aload           29
        //   682: astore          30
        //   684: aload_0        
        //   685: getfield        eta.f:Lesy;
        //   688: iload           35
        //   690: invokevirtual   esy.e:(I)V
        //   693: aload           29
        //   695: astore          30
        //   697: aload_0        
        //   698: getfield        eta.m:Lets;
        //   701: fload           19
        //   703: invokevirtual   ets.j:(F)V
        //   706: aload           29
        //   708: astore          30
        //   710: aload_0        
        //   711: getfield        eta.f:Lesy;
        //   714: aload_0        
        //   715: getfield        eta.k:[F
        //   718: invokevirtual   erx.a:([F)V
        //   721: goto            764
        //   724: aload           29
        //   726: astore          30
        //   728: aload_0        
        //   729: getfield        eta.f:Lesy;
        //   732: iload           36
        //   734: invokevirtual   esy.e:(I)V
        //   737: aload           29
        //   739: astore          30
        //   741: aload_0        
        //   742: getfield        eta.m:Lets;
        //   745: fconst_1       
        //   746: invokevirtual   ets.j:(F)V
        //   749: aload           29
        //   751: astore          30
        //   753: aload_0        
        //   754: getfield        eta.f:Lesy;
        //   757: aload_0        
        //   758: getfield        eta.k:[F
        //   761: invokevirtual   erx.a:([F)V
        //   764: fload           19
        //   766: fconst_1       
        //   767: fcmpg          
        //   768: ifge            814
        //   771: fload           19
        //   773: ldc             0.99
        //   775: fcmpl          
        //   776: ifle            792
        //   779: aload           29
        //   781: astore          30
        //   783: aload           16
        //   785: fconst_1       
        //   786: putfield        esz.e:F
        //   789: goto            814
        //   792: aload           29
        //   794: astore          30
        //   796: aload           16
        //   798: aload           16
        //   800: getfield        esz.e:F
        //   803: fconst_1       
        //   804: fload           19
        //   806: fsub           
        //   807: ldc             0.05
        //   809: fmul           
        //   810: fadd           
        //   811: putfield        esz.e:F
        //   814: iload           20
        //   816: sipush          500
        //   819: if_icmpge       841
        //   822: aload           29
        //   824: astore          30
        //   826: aload           16
        //   828: aload           16
        //   830: getfield        esz.h:I
        //   833: iconst_1       
        //   834: iadd           
        //   835: putfield        esz.h:I
        //   838: goto            841
        //   841: lload           9
        //   843: lstore          17
        //   845: iinc            6, 1
        //   848: lload           13
        //   850: lstore          9
        //   852: lload           17
        //   854: lstore          13
        //   856: goto            120
        //   859: aload_2        
        //   860: astore          30
        //   862: aload_2        
        //   863: monitorexit    
        //   864: aload_0        
        //   865: getfield        eta.f:Lesy;
        //   868: astore_1       
        //   869: aload_1        
        //   870: iload           4
        //   872: putfield        esy.l:Z
        //   875: aload_1        
        //   876: iload           5
        //   878: putfield        esy.m:Z
        //   881: aload_1        
        //   882: aload_3        
        //   883: putfield        erx.e:Lesa;
        //   886: return         
        //   887: astore_1       
        //   888: aload_2        
        //   889: astore          30
        //   891: aload_2        
        //   892: monitorexit    
        //   893: aload_1        
        //   894: athrow         
        //   895: astore_1       
        //   896: aload           30
        //   898: astore_2       
        //   899: goto            888
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  120    154    887    888    Any
        //  169    195    887    888    Any
        //  200    207    887    888    Any
        //  207    220    887    888    Any
        //  228    269    887    888    Any
        //  276    316    895    902    Any
        //  339    346    895    902    Any
        //  376    383    895    902    Any
        //  396    403    895    902    Any
        //  410    419    895    902    Any
        //  423    438    895    902    Any
        //  442    458    895    902    Any
        //  462    484    895    902    Any
        //  488    510    895    902    Any
        //  514    536    895    902    Any
        //  540    562    895    902    Any
        //  566    577    895    902    Any
        //  581    587    895    902    Any
        //  611    624    895    902    Any
        //  628    635    895    902    Any
        //  639    649    895    902    Any
        //  653    663    895    902    Any
        //  673    680    895    902    Any
        //  684    693    895    902    Any
        //  697    706    895    902    Any
        //  710    721    895    902    Any
        //  728    737    895    902    Any
        //  741    749    895    902    Any
        //  753    764    895    902    Any
        //  783    789    895    902    Any
        //  796    814    895    902    Any
        //  826    838    895    902    Any
        //  862    864    895    902    Any
        //  891    893    895    902    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0335:
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
    
    public final int e() {
        return this.g.size();
    }
    
    public final void f(final int n, final boolean g) {
        if (n < this.g.size()) {
            this.g.get(n).g = g;
        }
    }
}
