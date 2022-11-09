import java.util.Set;
import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtb
{
    private static final nsd a;
    private final lgr b;
    private final dtf c;
    private final dtd d;
    private final int e;
    private final boolean f;
    private lgq g;
    private boolean h;
    private volatile dte i;
    private final int j;
    
    static {
        a = nsd.g("com/google/android/apps/camera/gyro/motionestimator/GyroBasedMotionEstimator");
    }
    
    public dtb(final lgr b, final dtf c, final dtd d, final int e, int n, final int j) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.j = j;
        this.i = null;
        boolean f = true;
        if (n != 1) {
            n = 2;
        }
        njo.d(true);
        if (n != 1 || d.c) {
            f = false;
        }
        this.f = f;
        this.h = false;
    }
    
    public final float a(final gzn gzn, final gzn gzn2) {
        monitorenter(this);
        try {
            final dte i = this.i;
            if (this.h && i != null) {
                final long c = gzn.c;
                final float g = gzn.g;
                final float h = gzn.h;
                final float[] f = i.f(gzn.n);
                final long b = gzn.b;
                final long d = gzn.d;
                final long m = gzn.m;
                final long c2 = gzn2.c;
                final float g2 = gzn2.g;
                final float h2 = gzn2.h;
                final float[] f2 = i.f(gzn2.n);
                final long b2 = gzn2.b;
                final long d2 = gzn2.d;
                final long j = gzn2.m;
                final long c3 = i.c(b, d, f);
                final long c4 = i.c(m, d, f);
                final long b3 = i.b(d, f);
                final long c5 = i.c(b2, d2, f2);
                final long c6 = i.c(j, d2, f2);
                final long b4 = i.b(d2, f2);
                final float a = i.a(g, h, f);
                final float a2 = i.a(g2, h2, f2);
                final float[] e = i.e(gzn.a, c4, b3, c, i.d, f, false);
                final float[] e2 = i.e(gzn2.a, c6, b4, c2, i.d, f2, false);
                final lyb a3 = lyb.a(i.b.d(dte.d(c3, b3, c), a, e[0], e[1], dte.d(c5, b4, c2), a2, e2[0], e2[1]));
                final ArrayList list = new ArrayList();
                float n = 0.0f;
                list.add(new float[] { 0.0f, 0.0f });
                list.add(new float[] { (float)i.d.a, 0.0f });
                list.add(new float[] { 0.0f, (float)i.d.b });
                final kre d3 = i.d;
                list.add(new float[] { (float)d3.a, (float)d3.b });
                for (int size = list.size(), k = 0; k < size; ++k) {
                    final float[] array = (float[])list.get(k);
                    final float[] e3 = a3.e(array);
                    n = (float)Math.max(n, Math.hypot(e3[0] - array[0], e3[1] - array[1]));
                }
                monitorexit(this);
                return n;
            }
            monitorexit(this);
            return -1.0f;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final List b(final long p0, final gzn p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dtb.i:Ldte;
        //     4: astore          4
        //     6: aload_3        
        //     7: ifnull          1107
        //    10: aload           4
        //    12: ifnull          1107
        //    15: aload_0        
        //    16: invokevirtual   dtb.d:()V
        //    19: new             Ljava/util/ArrayList;
        //    22: dup            
        //    23: invokespecial   java/util/ArrayList.<init>:()V
        //    26: astore          5
        //    28: new             Ljava/util/ArrayList;
        //    31: dup            
        //    32: invokespecial   java/util/ArrayList.<init>:()V
        //    35: astore          6
        //    37: aload_3        
        //    38: getfield        gzn.c:J
        //    41: lstore          7
        //    43: aload_3        
        //    44: getfield        gzn.g:F
        //    47: fstore          9
        //    49: aload_3        
        //    50: getfield        gzn.h:F
        //    53: fstore          10
        //    55: aload           4
        //    57: aload_3        
        //    58: getfield        gzn.n:Landroid/graphics/Rect;
        //    61: invokevirtual   dte.f:(Landroid/graphics/Rect;)[F
        //    64: astore          11
        //    66: aload           4
        //    68: fload           9
        //    70: fload           10
        //    72: aload           11
        //    74: invokevirtual   dte.a:(FF[F)F
        //    77: fstore          10
        //    79: aload_3        
        //    80: getfield        gzn.b:J
        //    83: lstore          12
        //    85: aload_3        
        //    86: getfield        gzn.d:J
        //    89: lstore          14
        //    91: aload_3        
        //    92: getfield        gzn.m:J
        //    95: lstore_1       
        //    96: aload           4
        //    98: lload           12
        //   100: lload           14
        //   102: aload           11
        //   104: invokevirtual   dte.c:(JJ[F)J
        //   107: lstore          12
        //   109: aload           4
        //   111: lload_1        
        //   112: lload           14
        //   114: aload           11
        //   116: invokevirtual   dte.c:(JJ[F)J
        //   119: lstore_1       
        //   120: aload           4
        //   122: lload           14
        //   124: aload           11
        //   126: invokevirtual   dte.b:(J[F)J
        //   129: lstore          14
        //   131: iconst_0       
        //   132: istore          16
        //   134: aconst_null    
        //   135: astore          17
        //   137: iconst_0       
        //   138: istore          18
        //   140: aload           4
        //   142: getfield        dte.c:I
        //   145: istore          19
        //   147: iload           18
        //   149: iload           19
        //   151: if_icmpge       320
        //   154: iload           18
        //   156: i2l            
        //   157: lload           14
        //   159: lmul           
        //   160: lstore          20
        //   162: iload           19
        //   164: i2l            
        //   165: lstore          22
        //   167: lload           20
        //   169: lload           22
        //   171: ldiv           
        //   172: lstore          24
        //   174: lload           14
        //   176: lload           22
        //   178: ldiv           
        //   179: lstore          26
        //   181: aload_3        
        //   182: getfield        gzn.a:Ljava/lang/String;
        //   185: astore          28
        //   187: aload           4
        //   189: getfield        dte.c:I
        //   192: i2l            
        //   193: lstore          22
        //   195: aload           4
        //   197: aload           28
        //   199: lload           20
        //   201: lload           22
        //   203: ldiv           
        //   204: lload_1        
        //   205: ladd           
        //   206: lload           14
        //   208: lload           22
        //   210: ldiv           
        //   211: lload           7
        //   213: aload           4
        //   215: getfield        dte.d:Lkre;
        //   218: aload           11
        //   220: iconst_1       
        //   221: invokevirtual   dte.e:(Ljava/lang/String;JJJLkre;[FZ)[F
        //   224: astore          29
        //   226: bipush          9
        //   228: newarray        F
        //   230: astore          28
        //   232: iconst_1       
        //   233: aload           4
        //   235: getfield        dte.b:Leha;
        //   238: lload           12
        //   240: lload           24
        //   242: ladd           
        //   243: lload           26
        //   245: lload           7
        //   247: invokestatic    dte.d:(JJJ)J
        //   250: fload           10
        //   252: aload           29
        //   254: iconst_0       
        //   255: faload         
        //   256: aload           29
        //   258: iconst_1       
        //   259: faload         
        //   260: aload           28
        //   262: invokeinterface eha.c:(JFFF[F)Z
        //   267: if_icmpeq       277
        //   270: aload           17
        //   272: astore          28
        //   274: goto            277
        //   277: aload           28
        //   279: ifnull          302
        //   282: aload           5
        //   284: aload           28
        //   286: invokestatic    lyb.a:([F)Llyb;
        //   289: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   294: pop            
        //   295: aload           28
        //   297: astore          17
        //   299: goto            311
        //   302: aload           5
        //   304: aconst_null    
        //   305: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   310: pop            
        //   311: iinc            18, 1
        //   314: iconst_0       
        //   315: istore          16
        //   317: goto            140
        //   320: aload           4
        //   322: getfield        dte.e:Ljava/lang/Object;
        //   325: astore_3       
        //   326: aload_3        
        //   327: monitorenter   
        //   328: aload_3        
        //   329: astore          17
        //   331: aload           4
        //   333: getfield        dte.f:Ljava/util/concurrent/atomic/AtomicReference;
        //   336: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //   339: checkcast       Ljava/util/List;
        //   342: astore          29
        //   344: iconst_0       
        //   345: istore          18
        //   347: aload_3        
        //   348: astore          17
        //   350: iload           18
        //   352: aload           4
        //   354: getfield        dte.c:I
        //   357: if_icmpge       1065
        //   360: aload_3        
        //   361: astore          17
        //   363: aload           29
        //   365: iload           18
        //   367: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   372: checkcast       Llyb;
        //   375: astore          28
        //   377: aload_3        
        //   378: astore          17
        //   380: aload           5
        //   382: iload           18
        //   384: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   389: checkcast       Llyb;
        //   392: astore          30
        //   394: aload           28
        //   396: ifnull          1010
        //   399: aload           30
        //   401: ifnonnull       407
        //   404: goto            1010
        //   407: aload_3        
        //   408: astore          17
        //   410: aload           28
        //   412: getfield        lyb.c:[F
        //   415: astore          11
        //   417: aload           11
        //   419: iconst_0       
        //   420: faload         
        //   421: fstore          31
        //   423: aload           11
        //   425: iconst_4       
        //   426: faload         
        //   427: fstore          32
        //   429: aload           11
        //   431: bipush          8
        //   433: faload         
        //   434: fstore          33
        //   436: aload           11
        //   438: iconst_5       
        //   439: faload         
        //   440: fstore          34
        //   442: aload           11
        //   444: bipush          7
        //   446: faload         
        //   447: fstore          9
        //   449: fload           32
        //   451: fload           33
        //   453: fmul           
        //   454: fload           34
        //   456: fload           9
        //   458: fmul           
        //   459: fsub           
        //   460: fstore          10
        //   462: aload_3        
        //   463: astore          28
        //   465: fload           31
        //   467: fload           10
        //   469: fmul           
        //   470: f2d            
        //   471: dstore          35
        //   473: dload           35
        //   475: invokestatic    java/lang/Double.isNaN:(D)Z
        //   478: pop            
        //   479: aload           11
        //   481: iconst_1       
        //   482: faload         
        //   483: fstore          37
        //   485: aload           11
        //   487: iconst_3       
        //   488: faload         
        //   489: fstore          31
        //   491: aload           11
        //   493: bipush          6
        //   495: faload         
        //   496: fstore          38
        //   498: fload           37
        //   500: fload           33
        //   502: fload           31
        //   504: fmul           
        //   505: fload           34
        //   507: fload           38
        //   509: fmul           
        //   510: fsub           
        //   511: fmul           
        //   512: f2d            
        //   513: dstore          39
        //   515: dload           39
        //   517: invokestatic    java/lang/Double.isNaN:(D)Z
        //   520: pop            
        //   521: aload           11
        //   523: iconst_2       
        //   524: faload         
        //   525: fstore          33
        //   527: fload           33
        //   529: fload           31
        //   531: fload           9
        //   533: fmul           
        //   534: fload           32
        //   536: fload           38
        //   538: fmul           
        //   539: fsub           
        //   540: fmul           
        //   541: f2d            
        //   542: dstore          41
        //   544: dload           41
        //   546: invokestatic    java/lang/Double.isNaN:(D)Z
        //   549: pop            
        //   550: dload           35
        //   552: dconst_0       
        //   553: dadd           
        //   554: dload           39
        //   556: dsub           
        //   557: dload           41
        //   559: dadd           
        //   560: dstore          39
        //   562: dload           39
        //   564: dconst_0       
        //   565: dcmpl          
        //   566: ifne            575
        //   569: aconst_null    
        //   570: astore          11
        //   572: goto            820
        //   575: dconst_1       
        //   576: dload           39
        //   578: ddiv           
        //   579: d2f            
        //   580: fstore          9
        //   582: aload           28
        //   584: astore          17
        //   586: bipush          9
        //   588: newarray        F
        //   590: dup            
        //   591: iconst_0       
        //   592: fload           10
        //   594: fload           9
        //   596: fmul           
        //   597: fastore        
        //   598: dup            
        //   599: iconst_1       
        //   600: aload           11
        //   602: iconst_1       
        //   603: faload         
        //   604: aload           11
        //   606: bipush          8
        //   608: faload         
        //   609: fmul           
        //   610: aload           11
        //   612: iconst_2       
        //   613: faload         
        //   614: aload           11
        //   616: bipush          7
        //   618: faload         
        //   619: fmul           
        //   620: fsub           
        //   621: fneg           
        //   622: fload           9
        //   624: fmul           
        //   625: fastore        
        //   626: dup            
        //   627: iconst_2       
        //   628: aload           11
        //   630: iconst_1       
        //   631: faload         
        //   632: aload           11
        //   634: iconst_5       
        //   635: faload         
        //   636: fmul           
        //   637: aload           11
        //   639: iconst_2       
        //   640: faload         
        //   641: aload           11
        //   643: iconst_4       
        //   644: faload         
        //   645: fmul           
        //   646: fsub           
        //   647: fload           9
        //   649: fmul           
        //   650: fastore        
        //   651: dup            
        //   652: iconst_3       
        //   653: aload           11
        //   655: iconst_3       
        //   656: faload         
        //   657: aload           11
        //   659: bipush          8
        //   661: faload         
        //   662: fmul           
        //   663: aload           11
        //   665: iconst_5       
        //   666: faload         
        //   667: aload           11
        //   669: bipush          6
        //   671: faload         
        //   672: fmul           
        //   673: fsub           
        //   674: fneg           
        //   675: fload           9
        //   677: fmul           
        //   678: fastore        
        //   679: dup            
        //   680: iconst_4       
        //   681: aload           11
        //   683: iconst_0       
        //   684: faload         
        //   685: aload           11
        //   687: bipush          8
        //   689: faload         
        //   690: fmul           
        //   691: aload           11
        //   693: iconst_2       
        //   694: faload         
        //   695: aload           11
        //   697: bipush          6
        //   699: faload         
        //   700: fmul           
        //   701: fsub           
        //   702: fload           9
        //   704: fmul           
        //   705: fastore        
        //   706: dup            
        //   707: iconst_5       
        //   708: aload           11
        //   710: iconst_0       
        //   711: faload         
        //   712: aload           11
        //   714: iconst_5       
        //   715: faload         
        //   716: fmul           
        //   717: aload           11
        //   719: iconst_2       
        //   720: faload         
        //   721: aload           11
        //   723: iconst_3       
        //   724: faload         
        //   725: fmul           
        //   726: fsub           
        //   727: fneg           
        //   728: fload           9
        //   730: fmul           
        //   731: fastore        
        //   732: dup            
        //   733: bipush          6
        //   735: aload           11
        //   737: iconst_3       
        //   738: faload         
        //   739: aload           11
        //   741: bipush          7
        //   743: faload         
        //   744: fmul           
        //   745: aload           11
        //   747: iconst_4       
        //   748: faload         
        //   749: aload           11
        //   751: bipush          6
        //   753: faload         
        //   754: fmul           
        //   755: fsub           
        //   756: fload           9
        //   758: fmul           
        //   759: fastore        
        //   760: dup            
        //   761: bipush          7
        //   763: aload           11
        //   765: iconst_0       
        //   766: faload         
        //   767: aload           11
        //   769: bipush          7
        //   771: faload         
        //   772: fmul           
        //   773: aload           11
        //   775: iconst_1       
        //   776: faload         
        //   777: aload           11
        //   779: bipush          6
        //   781: faload         
        //   782: fmul           
        //   783: fsub           
        //   784: fneg           
        //   785: fload           9
        //   787: fmul           
        //   788: fastore        
        //   789: dup            
        //   790: bipush          8
        //   792: aload           11
        //   794: iconst_0       
        //   795: faload         
        //   796: aload           11
        //   798: iconst_4       
        //   799: faload         
        //   800: fmul           
        //   801: aload           11
        //   803: iconst_1       
        //   804: faload         
        //   805: aload           11
        //   807: iconst_3       
        //   808: faload         
        //   809: fmul           
        //   810: fsub           
        //   811: fload           9
        //   813: fmul           
        //   814: fastore        
        //   815: invokestatic    lyb.a:([F)Llyb;
        //   818: astore          11
        //   820: aload           11
        //   822: ifnonnull       874
        //   825: aload           28
        //   827: astore          17
        //   829: getstatic       dte.a:Lnsd;
        //   832: invokevirtual   nry.c:()Lnsu;
        //   835: checkcast       Lnsa;
        //   838: sipush          926
        //   841: invokeinterface nsa.E:(I)Lnsu;
        //   846: checkcast       Lnsa;
        //   849: ldc             "Inverse cannot be computed. Defaulting to identity"
        //   851: invokeinterface nsa.o:(Ljava/lang/String;)V
        //   856: aload           28
        //   858: astore          17
        //   860: aload           6
        //   862: invokestatic    lyb.b:()Llyb;
        //   865: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   870: pop            
        //   871: goto            1059
        //   874: aload           28
        //   876: astore          17
        //   878: aload           11
        //   880: invokevirtual   lyb.d:()[F
        //   883: astore          11
        //   885: aload           28
        //   887: astore          17
        //   889: bipush          9
        //   891: newarray        F
        //   893: astore          43
        //   895: iconst_0       
        //   896: istore          19
        //   898: iload           19
        //   900: iconst_3       
        //   901: if_icmpge       990
        //   904: iconst_0       
        //   905: istore          44
        //   907: iload           44
        //   909: iconst_3       
        //   910: if_icmpge       984
        //   913: iconst_0       
        //   914: istore          45
        //   916: iload           45
        //   918: iconst_3       
        //   919: if_icmpge       978
        //   922: iload           19
        //   924: iconst_3       
        //   925: imul           
        //   926: istore          46
        //   928: iload           46
        //   930: iload           44
        //   932: iadd           
        //   933: istore          47
        //   935: aload           28
        //   937: astore          17
        //   939: aload           43
        //   941: iload           47
        //   943: aload           43
        //   945: iload           47
        //   947: faload         
        //   948: aload           30
        //   950: getfield        lyb.c:[F
        //   953: iload           46
        //   955: iload           45
        //   957: iadd           
        //   958: faload         
        //   959: aload           11
        //   961: iload           45
        //   963: iconst_3       
        //   964: imul           
        //   965: iload           44
        //   967: iadd           
        //   968: faload         
        //   969: fmul           
        //   970: fadd           
        //   971: fastore        
        //   972: iinc            45, 1
        //   975: goto            916
        //   978: iinc            44, 1
        //   981: goto            907
        //   984: iinc            19, 1
        //   987: goto            898
        //   990: aload           28
        //   992: astore          17
        //   994: aload           6
        //   996: aload           43
        //   998: invokestatic    lyb.a:([F)Llyb;
        //  1001: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1006: pop            
        //  1007: goto            1059
        //  1010: aload_3        
        //  1011: astore          28
        //  1013: aload           28
        //  1015: astore          17
        //  1017: getstatic       dte.a:Lnsd;
        //  1020: invokevirtual   nry.c:()Lnsu;
        //  1023: checkcast       Lnsa;
        //  1026: sipush          925
        //  1029: invokeinterface nsa.E:(I)Lnsu;
        //  1034: checkcast       Lnsa;
        //  1037: ldc             "Previous or current projection matrix cannot be computed. Defaulting to identity"
        //  1039: invokeinterface nsa.o:(Ljava/lang/String;)V
        //  1044: aload           28
        //  1046: astore          17
        //  1048: aload           6
        //  1050: invokestatic    lyb.b:()Llyb;
        //  1053: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1058: pop            
        //  1059: iinc            18, 1
        //  1062: goto            347
        //  1065: aload_3        
        //  1066: astore          17
        //  1068: aload           4
        //  1070: getfield        dte.f:Ljava/util/concurrent/atomic/AtomicReference;
        //  1073: aload           5
        //  1075: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //  1078: aload_3        
        //  1079: astore          17
        //  1081: aload_3        
        //  1082: monitorexit    
        //  1083: aload           6
        //  1085: areturn        
        //  1086: astore          28
        //  1088: aload           17
        //  1090: astore_3       
        //  1091: aload_3        
        //  1092: astore          17
        //  1094: aload_3        
        //  1095: monitorexit    
        //  1096: aload           28
        //  1098: athrow         
        //  1099: astore          28
        //  1101: aload           17
        //  1103: astore_3       
        //  1104: goto            1091
        //  1107: aload_3        
        //  1108: ifnonnull       1142
        //  1111: getstatic       dtb.a:Lnsd;
        //  1114: invokevirtual   nry.b:()Lnsu;
        //  1117: checkcast       Lnsa;
        //  1120: sipush          919
        //  1123: invokeinterface nsa.E:(I)Lnsu;
        //  1128: checkcast       Lnsa;
        //  1131: ldc             "Camera metadata not valid at : %d"
        //  1133: lload_1        
        //  1134: invokeinterface nsa.q:(Ljava/lang/String;J)V
        //  1139: goto            1170
        //  1142: getstatic       dtb.a:Lnsd;
        //  1145: invokevirtual   nry.b:()Lnsu;
        //  1148: checkcast       Lnsa;
        //  1151: sipush          918
        //  1154: invokeinterface nsa.E:(I)Lnsu;
        //  1159: checkcast       Lnsa;
        //  1162: ldc             "Gyro transform calculator not valid at : %d"
        //  1164: lload_1        
        //  1165: invokeinterface nsa.q:(Ljava/lang/String;J)V
        //  1170: new             Ljava/util/ArrayList;
        //  1173: dup            
        //  1174: invokespecial   java/util/ArrayList.<init>:()V
        //  1177: astore          17
        //  1179: aload_0        
        //  1180: getfield        dtb.i:Ldte;
        //  1183: astore_3       
        //  1184: aload_3        
        //  1185: ifnull          1221
        //  1188: aload_3        
        //  1189: getfield        dte.c:I
        //  1192: istore          19
        //  1194: iconst_0       
        //  1195: istore          18
        //  1197: iload           18
        //  1199: iload           19
        //  1201: if_icmpge       1235
        //  1204: aload           17
        //  1206: invokestatic    lyb.b:()Llyb;
        //  1209: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1214: pop            
        //  1215: iinc            18, 1
        //  1218: goto            1197
        //  1221: getstatic       dtb.a:Lnsd;
        //  1224: invokevirtual   nry.b:()Lnsu;
        //  1227: ldc             "Gyro transform calculator not valid."
        //  1229: sipush          917
        //  1232: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //  1235: aload           17
        //  1237: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  331    344    1086   1091   Any
        //  350    360    1086   1091   Any
        //  363    377    1086   1091   Any
        //  380    394    1086   1091   Any
        //  410    417    1086   1091   Any
        //  586    820    1099   1107   Any
        //  829    856    1099   1107   Any
        //  860    871    1099   1107   Any
        //  878    885    1099   1107   Any
        //  889    895    1099   1107   Any
        //  939    972    1099   1107   Any
        //  994    1007   1099   1107   Any
        //  1017   1044   1099   1107   Any
        //  1048   1059   1099   1107   Any
        //  1068   1078   1099   1107   Any
        //  1081   1083   1099   1107   Any
        //  1094   1096   1099   1107   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0820:
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
    
    public final void c() {
        synchronized (this) {
            this.h = false;
            final lgq g = this.g;
            if (g != null) {
                nvb.g(new dta(g));
            }
            try (final lgq g2 = this.g) {}
            this.i = null;
        }
    }
    
    public final void d() {
        synchronized (this) {
            final lgq g = this.g;
            if (this.h && g != null) {
                this.d.a(g);
            }
        }
    }
    
    public final boolean e() {
        synchronized (this) {
            return this.h;
        }
    }
    
    public final void f(final kre kre, final String s) {
        synchronized (this) {
            if (this.f) {
                return;
            }
            final dtf c = this.c;
            final int e = this.e;
            final int j = this.j;
            final SizeF sizeF = (SizeF)c.a.m(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            sizeF.getClass();
            int n;
            if ((n = j) != 1) {
                n = 2;
            }
            njo.d(true);
            noi noi;
            if (c.e.g()) {
                noi = noi.H(((lfj)c.e.c()).a);
            }
            else {
                noi = nqr.a;
            }
            final kre b = c.d.b();
            final eha b2 = c.b;
            Object o;
            if (n == 1) {
                o = c.c.get();
            }
            else {
                o = new ehd();
            }
            this.i = new dte(sizeF, kre, b, e, b2, (ehf)o, noi);
            final lgq a = this.b.a(s);
            this.g = a;
            if (a != null) {
                this.h = true;
            }
        }
    }
}
