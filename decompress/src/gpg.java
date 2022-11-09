// 
// Decompiled by Procyon v0.6.0
// 

public final class gpg implements gfg
{
    private final liy A;
    private final liz B;
    public final klj a;
    private final krr b;
    private final kse c;
    private final gij d;
    private final ght e;
    private final kwd f;
    private final njp g;
    private final dvj h;
    private final int i;
    private final gpc j;
    private final gpl k;
    private final dwh l;
    private final dty m;
    private final dtv n;
    private final dwn o;
    private final glk p;
    private final njp q;
    private final duq r;
    private final gna s;
    private final dva t;
    private final lfg u;
    private final gue v;
    private final boolean w;
    private final pii x;
    private final niz y;
    private final cxl z;
    
    public gpg(final kse c, final krq krq, final gij d, final ght e, final kwd f, final gsh g, final dvj h, final gpc j, final dwh l, final dty m, final dtv n, final dwn o, final klj a, final njp q, final duq r, final gpl k, final dva t, final lfg u, final gue v, final cxl z, final liy a2, final liz b, final pii x, final niz y, final glk p26, final gna s) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.a = a;
        this.p = p26;
        this.q = q;
        this.r = r;
        this.u = u;
        this.v = v;
        this.s = s;
        this.t = t;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a2;
        this.B = b;
        final Object a3 = g.a();
        (this.b = krq.a("PckHdrPImgCapCmd")).g("Creating PckHdrPlusImageCaptureCommand.");
        final int b2 = h.b().b;
        this.i = b2;
        this.w = z.k(cxs.A);
        njo.o(((kzl)a3).e >= b2);
    }
    
    private final void d(final String s) {
        this.b.d(s);
        throw new kuw(s);
    }
    
    @Override
    public final klj a() {
        return this.a;
    }
    
    @Override
    public final klj b() {
        if (jlg.a != null) {
            return klq.g(fzu.b(jlg.a, this.k.a()));
        }
        return klq.g(fzu.e());
    }
    
    @Override
    public final void c(final gff p0, final gen p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_3       
        //     2: aload_3        
        //     3: getfield        gpg.a:Lklj;
        //     6: invokeinterface klj.aQ:()Ljava/lang/Object;
        //    11: checkcast       Ljava/lang/Boolean;
        //    14: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    17: ifne            31
        //    20: aload_3        
        //    21: getfield        gpg.b:Lkrr;
        //    24: ldc             "WARNING: HdrPlusImageCaptureCommand was executed, but the command is not available. This may result in deadlocks or other unintended behavior."
        //    26: invokeinterface krr.d:(Ljava/lang/String;)V
        //    31: aload_3        
        //    32: getfield        gpg.m:Ldty;
        //    35: invokevirtual   dty.a:()Ldtx;
        //    38: astore          4
        //    40: aload_3        
        //    41: getfield        gpg.g:Lnjp;
        //    44: invokeinterface njp.a:()Ljava/lang/Object;
        //    49: checkcast       Lkzl;
        //    52: astore          5
        //    54: aload_3        
        //    55: getfield        gpg.b:Lkrr;
        //    58: ldc             "Executing HdrPlus capture command."
        //    60: invokeinterface krr.f:(Ljava/lang/String;)V
        //    65: aload_3        
        //    66: getfield        gpg.c:Lkse;
        //    69: ldc             "HdrPlusCapture"
        //    71: invokeinterface kse.f:(Ljava/lang/String;)V
        //    76: aload_3        
        //    77: getfield        gpg.c:Lkse;
        //    80: ldc             "SessionAnd3AConvergence"
        //    82: invokeinterface kse.f:(Ljava/lang/String;)V
        //    87: getstatic       nii.a:Lnii;
        //    90: astore          6
        //    92: aload_3        
        //    93: getfield        gpg.f:Lkwd;
        //    96: invokeinterface kwd.c:()Lkwh;
        //   101: astore          7
        //   103: aload           7
        //   105: astore          8
        //   107: aload_3        
        //   108: getfield        gpg.s:Lgna;
        //   111: aload           8
        //   113: invokeinterface gna.a:(Lkwh;)Lgmz;
        //   118: astore          9
        //   120: aload           9
        //   122: astore          10
        //   124: aload_3        
        //   125: getfield        gpg.p:Lglk;
        //   128: aload           8
        //   130: aload           10
        //   132: invokeinterface gmz.a:()Lkwx;
        //   137: invokeinterface glk.a:(Lkwh;Lkwx;)Lfwt;
        //   142: astore          11
        //   144: new             Lkjk;
        //   147: astore          12
        //   149: aload           12
        //   151: invokespecial   kjk.<init>:()V
        //   154: aload_3        
        //   155: getfield        gpg.z:Lcxl;
        //   158: getstatic       cxs.x:Lcxm;
        //   161: invokeinterface cxl.k:(Lcxm;)Z
        //   166: istore          13
        //   168: iload           13
        //   170: ifeq            219
        //   173: aload_3        
        //   174: getfield        gpg.z:Lcxl;
        //   177: getstatic       cxs.A:Lcxm;
        //   180: invokeinterface cxl.k:(Lcxm;)Z
        //   185: ifne            219
        //   188: aload           8
        //   190: checkcast       Lkzi;
        //   193: getfield        kzi.a:Llag;
        //   196: invokevirtual   lag.g:()V
        //   199: goto            219
        //   202: astore          8
        //   204: aload           7
        //   206: astore          10
        //   208: aload           9
        //   210: astore          7
        //   212: aload           10
        //   214: astore          9
        //   216: goto            4561
        //   219: aload           8
        //   221: invokeinterface kwh.f:()Lkyh;
        //   226: astore          14
        //   228: aload_3        
        //   229: getfield        gpg.c:Lkse;
        //   232: ldc_w           "Metering"
        //   235: invokeinterface kse.h:(Ljava/lang/String;)V
        //   240: aconst_null    
        //   241: astore          15
        //   243: aconst_null    
        //   244: astore          16
        //   246: aconst_null    
        //   247: astore          17
        //   249: aconst_null    
        //   250: astore          18
        //   252: aload_3        
        //   253: getfield        gpg.c:Lkse;
        //   256: ldc_w           "SmartMetering"
        //   259: invokeinterface kse.f:(Ljava/lang/String;)V
        //   264: aload_3        
        //   265: getfield        gpg.e:Lght;
        //   268: aload           11
        //   270: invokeinterface fwt.a:()J
        //   275: invokeinterface ght.c:(J)Lghk;
        //   280: astore          19
        //   282: aload           12
        //   284: aload           19
        //   286: invokevirtual   kjk.c:(Lkrc;)V
        //   289: aload           19
        //   291: getfield        ghk.a:Lljm;
        //   294: astore          20
        //   296: aload           20
        //   298: ifnonnull       330
        //   301: aload_3        
        //   302: getfield        gpg.b:Lkrr;
        //   305: ldc_w           "SmartMetering failed, using last known good metadata instead."
        //   308: invokeinterface krr.h:(Ljava/lang/String;)V
        //   313: aload_3        
        //   314: getfield        gpg.l:Ldwh;
        //   317: getfield        dwh.a:Lljm;
        //   320: astore          20
        //   322: goto            330
        //   325: astore          20
        //   327: goto            4471
        //   330: aload_3        
        //   331: getfield        gpg.c:Lkse;
        //   334: invokeinterface kse.g:()V
        //   339: aload           20
        //   341: ifnonnull       351
        //   344: aload_3        
        //   345: ldc_w           "Viewfinder metering metadata is not available, aborting shot."
        //   348: invokespecial   gpg.d:(Ljava/lang/String;)V
        //   351: aload_3        
        //   352: getfield        gpg.e:Lght;
        //   355: invokeinterface ght.a:()Lniz;
        //   360: astore          21
        //   362: aload           21
        //   364: invokevirtual   niz.g:()Z
        //   367: istore          13
        //   369: iload           13
        //   371: ifne            381
        //   374: aload_3        
        //   375: ldc_w           "Viewfinder raw frame is not available, aborting shot."
        //   378: invokespecial   gpg.d:(Ljava/lang/String;)V
        //   381: aload           12
        //   383: aload           21
        //   385: invokevirtual   niz.c:()Ljava/lang/Object;
        //   388: checkcast       Llju;
        //   391: invokevirtual   kjk.c:(Lkrc;)V
        //   394: aload_3        
        //   395: getfield        gpg.c:Lkse;
        //   398: ldc_w           "Shot"
        //   401: invokeinterface kse.h:(Ljava/lang/String;)V
        //   406: aload_3        
        //   407: getfield        gpg.c:Lkse;
        //   410: ldc_w           "StartShotCapture"
        //   413: invokeinterface kse.f:(Ljava/lang/String;)V
        //   418: aload           20
        //   420: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   423: pop            
        //   424: aload_3        
        //   425: getfield        gpg.h:Ldvj;
        //   428: aload           20
        //   430: invokeinterface dvj.a:(Lljm;)I
        //   435: istore          22
        //   437: aload_3        
        //   438: getfield        gpg.o:Ldwn;
        //   441: aload           20
        //   443: iload           22
        //   445: invokevirtual   dwn.a:(Lljm;I)Ldwo;
        //   448: astore          23
        //   450: aload_2        
        //   451: getfield        gen.a:Lfvn;
        //   454: getfield        fvn.a:I
        //   457: aload_3        
        //   458: getfield        gpg.u:Llfg;
        //   461: invokestatic    boa.b:(ILlfg;)I
        //   464: istore          24
        //   466: aload_3        
        //   467: getfield        gpg.n:Ldtv;
        //   470: astore          25
        //   472: aload           12
        //   474: astore          26
        //   476: aload           11
        //   478: astore          27
        //   480: aload           25
        //   482: aload_2        
        //   483: aload           23
        //   485: aload           4
        //   487: iload           24
        //   489: iconst_0       
        //   490: iconst_0       
        //   491: invokevirtual   dtv.b:(Lgen;Ldwo;Ldtx;IZZ)V
        //   494: aload_3        
        //   495: getfield        gpg.u:Llfg;
        //   498: aload_3        
        //   499: getfield        gpg.d:Lgij;
        //   502: invokestatic    dub.b:(Llfg;Lgij;)Lcom/google/googlex/gcam/PostviewParams;
        //   505: astore          23
        //   507: aload           4
        //   509: getfield        dtx.g:Lggv;
        //   512: astore          4
        //   514: aload_3        
        //   515: getfield        gpg.h:Ldvj;
        //   518: iload           22
        //   520: aload_2        
        //   521: aload           23
        //   523: aload           4
        //   525: aload           20
        //   527: invokeinterface dvj.e:(ILgen;Lcom/google/googlex/gcam/PostviewParams;Lggv;Lljm;)Ldxh;
        //   532: astore          23
        //   534: aload_3        
        //   535: getfield        gpg.c:Lkse;
        //   538: invokeinterface kse.g:()V
        //   543: aload           23
        //   545: ifnonnull       579
        //   548: aload_3        
        //   549: ldc_w           "startShotCapture returned null. Shot failed."
        //   552: invokespecial   gpg.d:(Ljava/lang/String;)V
        //   555: goto            579
        //   558: astore          20
        //   560: aload           10
        //   562: astore          9
        //   564: aload           8
        //   566: astore          7
        //   568: aload           20
        //   570: astore          8
        //   572: aload           8
        //   574: astore          20
        //   576: goto            4414
        //   579: aload_3        
        //   580: getfield        gpg.c:Lkse;
        //   583: ldc_w           "CreateBurstTaker"
        //   586: invokeinterface kse.f:(Ljava/lang/String;)V
        //   591: aload_3        
        //   592: getfield        gpg.j:Lgpc;
        //   595: aload           8
        //   597: aload_2        
        //   598: invokevirtual   gpc.a:(Lkwh;Lgen;)Lgpb;
        //   601: astore          28
        //   603: aload_3        
        //   604: getfield        gpg.c:Lkse;
        //   607: invokeinterface kse.g:()V
        //   612: aload_2        
        //   613: getfield        gen.b:Lhhy;
        //   616: astore          25
        //   618: new             Lgpf;
        //   621: astore          4
        //   623: aload           4
        //   625: aload           28
        //   627: aload_2        
        //   628: invokespecial   gpf.<init>:(Lgpb;Lgen;)V
        //   631: aload           25
        //   633: aload           4
        //   635: invokeinterface hhy.u:(Lhik;)V
        //   640: aload_3        
        //   641: getfield        gpg.r:Lduq;
        //   644: aload_2        
        //   645: invokevirtual   duq.e:(Lgen;)V
        //   648: aload_3        
        //   649: getfield        gpg.c:Lkse;
        //   652: ldc_w           "BuildPsafBurstSpec"
        //   655: invokeinterface kse.f:(Ljava/lang/String;)V
        //   660: aload_3        
        //   661: getfield        gpg.q:Lnjp;
        //   664: invokeinterface njp.a:()Ljava/lang/Object;
        //   669: checkcast       Ljava/lang/Boolean;
        //   672: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   675: istore          13
        //   677: aload_3        
        //   678: getfield        gpg.b:Lkrr;
        //   681: astore          25
        //   683: new             Ljava/lang/StringBuilder;
        //   686: astore          4
        //   688: aload           4
        //   690: bipush          33
        //   692: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   695: aload           4
        //   697: ldc_w           "PSAF active from settings = "
        //   700: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   703: pop            
        //   704: aload           4
        //   706: iload           13
        //   708: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   711: pop            
        //   712: aload           25
        //   714: aload           4
        //   716: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   719: invokeinterface krr.b:(Ljava/lang/String;)V
        //   724: iload           13
        //   726: ifeq            758
        //   729: aload_3        
        //   730: getfield        gpg.h:Ldvj;
        //   733: aload           23
        //   735: aload           21
        //   737: invokevirtual   niz.c:()Ljava/lang/Object;
        //   740: checkcast       Llju;
        //   743: aload           20
        //   745: invokeinterface dvj.i:(Ldxh;Llju;Lljm;)Lcom/google/googlex/gcam/BurstSpec;
        //   750: invokestatic    niz.i:(Ljava/lang/Object;)Lniz;
        //   753: astore          4
        //   755: goto            763
        //   758: getstatic       nii.a:Lnii;
        //   761: astore          4
        //   763: aload           20
        //   765: astore          25
        //   767: aload_3        
        //   768: getfield        gpg.c:Lkse;
        //   771: ldc_w           "BuildPayloadBurstSpec"
        //   774: invokeinterface kse.h:(Ljava/lang/String;)V
        //   779: aload_3        
        //   780: getfield        gpg.h:Ldvj;
        //   783: aload           23
        //   785: aload           21
        //   787: invokevirtual   niz.c:()Ljava/lang/Object;
        //   790: checkcast       Llju;
        //   793: aload           25
        //   795: iconst_0       
        //   796: invokeinterface dvj.j:(Ldxh;Llju;Lljm;Z)Lcom/google/googlex/gcam/BurstSpec;
        //   801: astore          29
        //   803: aload_3        
        //   804: getfield        gpg.c:Lkse;
        //   807: invokeinterface kse.g:()V
        //   812: aload           5
        //   814: invokevirtual   kzl.a:()Lklj;
        //   817: invokeinterface klj.aQ:()Ljava/lang/Object;
        //   822: checkcast       Ljava/lang/Integer;
        //   825: invokevirtual   java/lang/Integer.intValue:()I
        //   828: istore          22
        //   830: aload           4
        //   832: invokevirtual   niz.g:()Z
        //   835: istore          13
        //   837: iload           13
        //   839: ifeq            961
        //   842: aload           4
        //   844: getstatic       fzt.i:Lfzt;
        //   847: invokevirtual   niz.b:(Lnir;)Lniz;
        //   850: astore          20
        //   852: aload           20
        //   854: invokevirtual   niz.g:()Z
        //   857: ifeq            877
        //   860: aload           20
        //   862: invokevirtual   niz.c:()Ljava/lang/Object;
        //   865: checkcast       Lcom/google/googlex/gcam/FrameRequestVector;
        //   868: invokevirtual   com/google/googlex/gcam/FrameRequestVector.a:()J
        //   871: l2i            
        //   872: istore          24
        //   874: goto            880
        //   877: iconst_0       
        //   878: istore          24
        //   880: aload_3        
        //   881: getfield        gpg.b:Lkrr;
        //   884: astore          20
        //   886: new             Ljava/lang/StringBuilder;
        //   889: astore          30
        //   891: aload           30
        //   893: bipush          32
        //   895: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   898: aload           30
        //   900: ldc_w           "PSAF af burst size = "
        //   903: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   906: pop            
        //   907: aload           30
        //   909: iload           24
        //   911: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   914: pop            
        //   915: aload           20
        //   917: aload           30
        //   919: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   922: invokeinterface krr.b:(Ljava/lang/String;)V
        //   927: iload           22
        //   929: iload           24
        //   931: isub           
        //   932: ifgt            958
        //   935: aload_3        
        //   936: getfield        gpg.b:Lkrr;
        //   939: ldc_w           "not enough capacity to take a burst with PSAF, removing PSAF."
        //   942: invokeinterface krr.b:(Ljava/lang/String;)V
        //   947: getstatic       nii.a:Lnii;
        //   950: astore          4
        //   952: iconst_0       
        //   953: istore          24
        //   955: goto            964
        //   958: goto            964
        //   961: iconst_0       
        //   962: istore          24
        //   964: aload           29
        //   966: invokevirtual   com/google/googlex/gcam/BurstSpec.b:()Lcom/google/googlex/gcam/FrameRequestVector;
        //   969: invokevirtual   com/google/googlex/gcam/FrameRequestVector.a:()J
        //   972: l2i            
        //   973: istore          31
        //   975: iload           31
        //   977: iload           22
        //   979: iload           24
        //   981: isub           
        //   982: invokestatic    java/lang/Math.min:(II)I
        //   985: istore          32
        //   987: aload_3        
        //   988: getfield        gpg.u:Llfg;
        //   991: aload           29
        //   993: getstatic       nii.a:Lnii;
        //   996: iload           32
        //   998: iconst_0       
        //   999: iconst_0       
        //  1000: iconst_0       
        //  1001: aload           25
        //  1003: invokestatic    gru.a:(Llfg;Lcom/google/googlex/gcam/BurstSpec;Lniz;IIZZLljm;)J
        //  1006: lstore          33
        //  1008: iload           31
        //  1010: istore          22
        //  1012: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //  1015: astore          20
        //  1017: lload           33
        //  1019: aload           20
        //  1021: ldc2_w          6
        //  1024: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //  1027: lcmp           
        //  1028: ifle            1037
        //  1031: iconst_1       
        //  1032: istore          13
        //  1034: goto            1040
        //  1037: iconst_0       
        //  1038: istore          13
        //  1040: aload_2        
        //  1041: getfield        gen.b:Lhhy;
        //  1044: invokeinterface hhy.i:()Lhio;
        //  1049: getstatic       hio.m:Lhio;
        //  1052: if_acmpne       1061
        //  1055: iconst_1       
        //  1056: istore          35
        //  1058: goto            1064
        //  1061: iconst_0       
        //  1062: istore          35
        //  1064: aload_3        
        //  1065: getfield        gpg.r:Lduq;
        //  1068: iload           13
        //  1070: aload_3        
        //  1071: getfield        gpg.u:Llfg;
        //  1074: invokeinterface lfg.l:()Llfu;
        //  1079: iload           35
        //  1081: iconst_1       
        //  1082: invokevirtual   duq.f:(ZLlfu;ZZ)V
        //  1085: aload_3        
        //  1086: getfield        gpg.A:Lliy;
        //  1089: astore          20
        //  1091: aload_3        
        //  1092: getfield        gpg.B:Lliz;
        //  1095: astore          30
        //  1097: aload           30
        //  1099: invokevirtual   liz.e:()Z
        //  1102: istore          13
        //  1104: iload           13
        //  1106: ifne            1270
        //  1109: aload           30
        //  1111: getfield        liz.e:Z
        //  1114: ifeq            1123
        //  1117: iconst_1       
        //  1118: istore          13
        //  1120: goto            1273
        //  1123: aload           20
        //  1125: getfield        liy.i:Z
        //  1128: ifeq            1259
        //  1131: new             Lnnt;
        //  1134: astore          20
        //  1136: aload           20
        //  1138: invokespecial   nnt.<init>:()V
        //  1141: aload           20
        //  1143: ldc_w           "RQ3A"
        //  1146: ldc_w           7168887
        //  1149: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1152: invokevirtual   nnt.d:(Ljava/lang/Object;Ljava/lang/Object;)V
        //  1155: aload           20
        //  1157: ldc_w           "RD2A"
        //  1160: ldc_w           7168879
        //  1163: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1166: invokevirtual   nnt.d:(Ljava/lang/Object;Ljava/lang/Object;)V
        //  1169: aload           20
        //  1171: invokevirtual   nnt.b:()Lnnx;
        //  1174: astore          36
        //  1176: getstatic       android/os/Build$VERSION.INCREMENTAL:Ljava/lang/String;
        //  1179: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1182: istore          37
        //  1184: aload           36
        //  1186: invokevirtual   nnx.t:()Lnoi;
        //  1189: invokevirtual   noi.bN:()Lnrv;
        //  1192: astore          30
        //  1194: aload           30
        //  1196: invokeinterface java/util/Iterator.hasNext:()Z
        //  1201: ifeq            1270
        //  1204: aload           30
        //  1206: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1211: checkcast       Ljava/lang/String;
        //  1214: astore          20
        //  1216: getstatic       android/os/Build.ID:Ljava/lang/String;
        //  1219: aload           20
        //  1221: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //  1224: ifeq            1256
        //  1227: aload           36
        //  1229: aload           20
        //  1231: iconst_0       
        //  1232: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1235: invokevirtual   nnx.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1238: checkcast       Ljava/lang/Integer;
        //  1241: invokevirtual   java/lang/Integer.intValue:()I
        //  1244: istore          38
        //  1246: iload           37
        //  1248: iload           38
        //  1250: if_icmpge       1259
        //  1253: goto            1270
        //  1256: goto            1194
        //  1259: iconst_0       
        //  1260: istore          13
        //  1262: goto            1273
        //  1265: astore          8
        //  1267: goto            572
        //  1270: iconst_1       
        //  1271: istore          13
        //  1273: aload_3        
        //  1274: getfield        gpg.r:Lduq;
        //  1277: invokevirtual   duq.n:()Z
        //  1280: istore          35
        //  1282: iload           35
        //  1284: ifeq            1426
        //  1287: aload_3        
        //  1288: getfield        gpg.u:Llfg;
        //  1291: aload           29
        //  1293: aload           4
        //  1295: iload           32
        //  1297: iload           24
        //  1299: aload_3        
        //  1300: getfield        gpg.w:Z
        //  1303: iload           13
        //  1305: aload           25
        //  1307: invokestatic    gru.a:(Llfg;Lcom/google/googlex/gcam/BurstSpec;Lniz;IIZZLljm;)J
        //  1310: lstore          33
        //  1312: aload_2        
        //  1313: getfield        gen.c:Lgem;
        //  1316: invokeinterface gem.b:()Lgel;
        //  1321: astore          20
        //  1323: aload           20
        //  1325: lload           33
        //  1327: invokeinterface gel.d:(J)V
        //  1332: aload_3        
        //  1333: getfield        gpg.x:Lpii;
        //  1336: invokeinterface pii.get:()Ljava/lang/Object;
        //  1341: checkcast       Lgtr;
        //  1344: lload           33
        //  1346: invokevirtual   gtr.j:(J)V
        //  1349: aload_3        
        //  1350: getfield        gpg.y:Lniz;
        //  1353: invokevirtual   niz.g:()Z
        //  1356: ifeq            1376
        //  1359: aload_3        
        //  1360: getfield        gpg.y:Lniz;
        //  1363: invokevirtual   niz.c:()Ljava/lang/Object;
        //  1366: checkcast       Leii;
        //  1369: lload           33
        //  1371: invokeinterface eii.k:(J)V
        //  1376: aload_3        
        //  1377: getfield        gpg.b:Lkrr;
        //  1380: astore          36
        //  1382: new             Ljava/lang/StringBuilder;
        //  1385: astore          30
        //  1387: aload           30
        //  1389: bipush          63
        //  1391: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1394: aload           30
        //  1396: ldc_w           "tripodSignal detected, total capture time: "
        //  1399: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1402: pop            
        //  1403: aload           30
        //  1405: lload           33
        //  1407: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  1410: pop            
        //  1411: aload           36
        //  1413: aload           30
        //  1415: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1418: invokeinterface krr.b:(Ljava/lang/String;)V
        //  1423: goto            1503
        //  1426: aload_3        
        //  1427: getfield        gpg.u:Llfg;
        //  1430: aload           29
        //  1432: aload           4
        //  1434: iload           32
        //  1436: iload           24
        //  1438: iconst_0       
        //  1439: iload           13
        //  1441: aload           25
        //  1443: invokestatic    gru.a:(Llfg;Lcom/google/googlex/gcam/BurstSpec;Lniz;IIZZLljm;)J
        //  1446: lstore          33
        //  1448: aload           23
        //  1450: getfield        dxh.n:Ldwf;
        //  1453: getstatic       dwf.b:Ldwf;
        //  1456: invokevirtual   dwf.equals:(Ljava/lang/Object;)Z
        //  1459: istore          13
        //  1461: iload           13
        //  1463: ifne            1483
        //  1466: aload_3        
        //  1467: getfield        gpg.x:Lpii;
        //  1470: invokeinterface pii.get:()Ljava/lang/Object;
        //  1475: checkcast       Lgtr;
        //  1478: lload           33
        //  1480: invokevirtual   gtr.j:(J)V
        //  1483: aload_2        
        //  1484: getfield        gen.c:Lgem;
        //  1487: invokeinterface gem.a:()Lgel;
        //  1492: astore          20
        //  1494: aload           20
        //  1496: lload           33
        //  1498: invokeinterface gel.d:(J)V
        //  1503: aload           21
        //  1505: invokevirtual   niz.c:()Ljava/lang/Object;
        //  1508: checkcast       Llju;
        //  1511: invokeinterface lju.close:()V
        //  1516: aload           29
        //  1518: invokevirtual   com/google/googlex/gcam/BurstSpec.b:()Lcom/google/googlex/gcam/FrameRequestVector;
        //  1521: invokevirtual   com/google/googlex/gcam/FrameRequestVector.d:()Z
        //  1524: istore          13
        //  1526: iload           13
        //  1528: ifeq            1694
        //  1531: aload_3        
        //  1532: getfield        gpg.b:Lkrr;
        //  1535: ldc_w           "payloadBurstSpec is empty. Payload failed."
        //  1538: invokeinterface krr.d:(Ljava/lang/String;)V
        //  1543: aload           23
        //  1545: ifnull          1587
        //  1548: aload_3        
        //  1549: getfield        gpg.h:Ldvj;
        //  1552: aload           23
        //  1554: invokeinterface dvj.n:(Ldxh;)V
        //  1559: aload_3        
        //  1560: getfield        gpg.t:Ldva;
        //  1563: aload           23
        //  1565: getfield        dxh.c:Lgen;
        //  1568: getfield        gen.b:Lhhy;
        //  1571: invokeinterface hhy.h:()Lhim;
        //  1576: invokevirtual   dva.d:(Lhim;)V
        //  1579: goto            1587
        //  1582: astore          8
        //  1584: goto            204
        //  1587: aload           26
        //  1589: invokevirtual   kjk.close:()V
        //  1592: aload           27
        //  1594: ifnull          1612
        //  1597: aload           27
        //  1599: invokeinterface fwt.close:()V
        //  1604: goto            1612
        //  1607: astore          8
        //  1609: goto            4222
        //  1612: aload           10
        //  1614: ifnull          1632
        //  1617: aload           10
        //  1619: invokeinterface gmz.close:()V
        //  1624: goto            1632
        //  1627: astore          9
        //  1629: goto            4245
        //  1632: aload           8
        //  1634: invokeinterface kwh.close:()V
        //  1639: aload_1        
        //  1640: invokeinterface gff.close:()V
        //  1645: aload_0        
        //  1646: astore_1       
        //  1647: aload_1        
        //  1648: getfield        gpg.s:Lgna;
        //  1651: invokeinterface gna.b:()V
        //  1656: aload_1        
        //  1657: getfield        gpg.c:Lkse;
        //  1660: invokeinterface kse.g:()V
        //  1665: aload_1        
        //  1666: getfield        gpg.c:Lkse;
        //  1669: invokeinterface kse.g:()V
        //  1674: return         
        //  1675: astore          7
        //  1677: goto            4269
        //  1680: astore          9
        //  1682: goto            4277
        //  1685: astore          9
        //  1687: aload           10
        //  1689: astore          7
        //  1691: goto            4591
        //  1694: aload           14
        //  1696: invokevirtual   kyh.c:()V
        //  1699: new             Lgpe;
        //  1702: astore          21
        //  1704: aload           21
        //  1706: aload           27
        //  1708: aload           10
        //  1710: aload           8
        //  1712: aload           19
        //  1714: invokespecial   gpe.<init>:(Lfwt;Lgmz;Lkwh;Lkrc;)V
        //  1717: aload_2        
        //  1718: getfield        gen.b:Lhhy;
        //  1721: invokeinterface hhy.k:()Lhuz;
        //  1726: astore          27
        //  1728: aload           14
        //  1730: invokestatic    kyh.a:(Lkyh;)Lkyh;
        //  1733: astore          19
        //  1735: aload           28
        //  1737: getfield        gpb.a:Lkse;
        //  1740: astore_3       
        //  1741: aload           23
        //  1743: invokevirtual   dxh.a:()I
        //  1746: istore          37
        //  1748: new             Ljava/lang/StringBuilder;
        //  1751: astore          14
        //  1753: aload           14
        //  1755: bipush          25
        //  1757: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1760: aload           14
        //  1762: ldc_w           "HdrPlusPayload"
        //  1765: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1768: pop            
        //  1769: aload           14
        //  1771: iload           37
        //  1773: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1776: pop            
        //  1777: aload_3        
        //  1778: aload           14
        //  1780: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1783: invokeinterface kse.f:(Ljava/lang/String;)V
        //  1788: aload           29
        //  1790: invokevirtual   com/google/googlex/gcam/BurstSpec.b:()Lcom/google/googlex/gcam/FrameRequestVector;
        //  1793: astore          14
        //  1795: aload           4
        //  1797: getstatic       fzt.h:Lfzt;
        //  1800: invokevirtual   niz.b:(Lnir;)Lniz;
        //  1803: astore          30
        //  1805: iload           32
        //  1807: ifgt            1816
        //  1810: iconst_0       
        //  1811: istore          13
        //  1813: goto            4183
        //  1816: aload           28
        //  1818: getfield        gpb.a:Lkse;
        //  1821: astore          4
        //  1823: aload           23
        //  1825: invokevirtual   dxh.a:()I
        //  1828: istore          37
        //  1830: new             Ljava/lang/StringBuilder;
        //  1833: astore_3       
        //  1834: aload_3        
        //  1835: bipush          31
        //  1837: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1840: aload_3        
        //  1841: ldc_w           "buildPayloadRequests"
        //  1844: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1847: pop            
        //  1848: aload_3        
        //  1849: iload           37
        //  1851: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1854: pop            
        //  1855: aload           4
        //  1857: aload_3        
        //  1858: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1861: invokeinterface kse.f:(Ljava/lang/String;)V
        //  1866: aload           28
        //  1868: getfield        gpb.e:Lgpl;
        //  1871: astore          36
        //  1873: getstatic       jlj.p:Landroid/hardware/camera2/CaptureRequest$Key;
        //  1876: astore          4
        //  1878: aload           4
        //  1880: ifnull          1917
        //  1883: aload           30
        //  1885: invokevirtual   niz.g:()Z
        //  1888: ifeq            1917
        //  1891: aload           30
        //  1893: invokevirtual   niz.c:()Ljava/lang/Object;
        //  1896: checkcast       Lcom/google/googlex/gcam/FrameRequestVector;
        //  1899: invokevirtual   com/google/googlex/gcam/FrameRequestVector.a:()J
        //  1902: lstore          33
        //  1904: lload           33
        //  1906: l2i            
        //  1907: istore          37
        //  1909: goto            1920
        //  1912: astore          8
        //  1914: goto            1267
        //  1917: iconst_0       
        //  1918: istore          37
        //  1920: aload           10
        //  1922: astore          4
        //  1924: aload           8
        //  1926: astore_3       
        //  1927: aload           36
        //  1929: aload           19
        //  1931: aload           20
        //  1933: aload           5
        //  1935: iload           32
        //  1937: iload           37
        //  1939: iconst_0       
        //  1940: invokevirtual   gpl.c:(Lkyh;Lgel;Lkzl;IIZ)V
        //  1943: aload           36
        //  1945: aload           19
        //  1947: aload           14
        //  1949: aload           25
        //  1951: iload           32
        //  1953: invokevirtual   gpl.b:(Lkyh;Lcom/google/googlex/gcam/FrameRequestVector;Lljm;I)Ljava/util/List;
        //  1956: astore          14
        //  1958: iload           37
        //  1960: ifle            2004
        //  1963: aload           19
        //  1965: getstatic       jlj.p:Landroid/hardware/camera2/CaptureRequest$Key;
        //  1968: iload           37
        //  1970: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1973: invokevirtual   kyh.d:(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
        //  1976: aload           14
        //  1978: iconst_0       
        //  1979: aload           36
        //  1981: aload           19
        //  1983: aload           30
        //  1985: invokevirtual   niz.c:()Ljava/lang/Object;
        //  1988: checkcast       Lcom/google/googlex/gcam/FrameRequestVector;
        //  1991: aload           25
        //  1993: iload           37
        //  1995: invokevirtual   gpl.b:(Lkyh;Lcom/google/googlex/gcam/FrameRequestVector;Lljm;I)Ljava/util/List;
        //  1998: invokeinterface java/util/List.addAll:(ILjava/util/Collection;)Z
        //  2003: pop            
        //  2004: aload           14
        //  2006: invokeinterface java/util/List.size:()I
        //  2011: iload           32
        //  2013: iload           24
        //  2015: iadd           
        //  2016: if_icmpeq       2071
        //  2019: aload           28
        //  2021: getfield        gpb.b:Lkrr;
        //  2024: ldc_w           "Unexpected frameRequests length: %d != PSAF %d + payload %d"
        //  2027: iconst_3       
        //  2028: anewarray       Ljava/lang/Object;
        //  2031: dup            
        //  2032: iconst_0       
        //  2033: aload           14
        //  2035: invokeinterface java/util/List.size:()I
        //  2040: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2043: aastore        
        //  2044: dup            
        //  2045: iconst_1       
        //  2046: iload           24
        //  2048: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2051: aastore        
        //  2052: dup            
        //  2053: iconst_2       
        //  2054: iload           32
        //  2056: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2059: aastore        
        //  2060: invokestatic    ksc.c:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  2063: invokeinterface krr.d:(Ljava/lang/String;)V
        //  2068: goto            2107
        //  2071: aload           28
        //  2073: getfield        gpb.b:Lkrr;
        //  2076: ldc_w           "Created frameRequests with %d PSAF and %d payload"
        //  2079: iconst_2       
        //  2080: anewarray       Ljava/lang/Object;
        //  2083: dup            
        //  2084: iconst_0       
        //  2085: iload           24
        //  2087: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2090: aastore        
        //  2091: dup            
        //  2092: iconst_1       
        //  2093: iload           32
        //  2095: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2098: aastore        
        //  2099: invokestatic    ksc.c:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  2102: invokeinterface krr.b:(Ljava/lang/String;)V
        //  2107: aload           28
        //  2109: getfield        gpb.a:Lkse;
        //  2112: invokeinterface kse.g:()V
        //  2117: aload           28
        //  2119: getstatic       nxk.d:Lnxk;
        //  2122: invokevirtual   oky.m:()Lokt;
        //  2125: putfield        gpb.n:Lokt;
        //  2128: aload           28
        //  2130: getfield        gpb.c:Ldvj;
        //  2133: aload           23
        //  2135: aload           29
        //  2137: invokeinterface dvj.s:(Ldxh;Lcom/google/googlex/gcam/BurstSpec;)V
        //  2142: aload           28
        //  2144: getfield        gpb.f:Ldva;
        //  2147: aload           23
        //  2149: aload           29
        //  2151: aload           25
        //  2153: invokevirtual   dva.f:(Ldxh;Lcom/google/googlex/gcam/BurstSpec;Lljm;)V
        //  2156: aload           28
        //  2158: getfield        gpb.d:Lduq;
        //  2161: invokevirtual   duq.n:()Z
        //  2164: istore          13
        //  2166: iload           13
        //  2168: ifeq            2183
        //  2171: aload           28
        //  2173: getfield        gpb.d:Lduq;
        //  2176: iconst_1       
        //  2177: invokevirtual   duq.l:(Z)V
        //  2180: goto            2210
        //  2183: aload           28
        //  2185: getfield        gpb.m:Lniz;
        //  2188: invokevirtual   niz.g:()Z
        //  2191: ifeq            2210
        //  2194: aload           28
        //  2196: getfield        gpb.m:Lniz;
        //  2199: invokevirtual   niz.c:()Ljava/lang/Object;
        //  2202: checkcast       Lgtr;
        //  2205: aload           23
        //  2207: invokevirtual   gtr.k:(Ldxh;)V
        //  2210: aload           28
        //  2212: getfield        gpb.n:Lokt;
        //  2215: astore          8
        //  2217: aload           8
        //  2219: getfield        okt.c:Z
        //  2222: ifeq            2236
        //  2225: aload           8
        //  2227: invokevirtual   okt.m:()V
        //  2230: aload           8
        //  2232: iconst_0       
        //  2233: putfield        okt.c:Z
        //  2236: aload           8
        //  2238: getfield        okt.b:Loky;
        //  2241: checkcast       Lnxk;
        //  2244: astore          8
        //  2246: aload           8
        //  2248: aload           8
        //  2250: getfield        nxk.a:I
        //  2253: iconst_1       
        //  2254: ior            
        //  2255: putfield        nxk.a:I
        //  2258: aload           8
        //  2260: iload           13
        //  2262: putfield        nxk.b:Z
        //  2265: aload           20
        //  2267: invokeinterface gel.e:()V
        //  2272: iload           13
        //  2274: ifeq            3462
        //  2277: aload           28
        //  2279: getfield        gpb.i:Lcxl;
        //  2282: getstatic       cxs.A:Lcxm;
        //  2285: invokeinterface cxl.k:(Lcxm;)Z
        //  2290: ifeq            3459
        //  2293: aload           28
        //  2295: getfield        gpb.j:Lkwh;
        //  2298: ifnonnull       2320
        //  2301: aload           28
        //  2303: getfield        gpb.b:Lkrr;
        //  2306: ldc_w           "FrameServerSession not provided."
        //  2309: invokeinterface krr.d:(Ljava/lang/String;)V
        //  2314: iconst_0       
        //  2315: istore          13
        //  2317: goto            3422
        //  2320: new             Lkjk;
        //  2323: astore          17
        //  2325: aload           17
        //  2327: invokespecial   kjk.<init>:()V
        //  2330: aload           28
        //  2332: getfield        gpb.a:Lkse;
        //  2335: ldc_w           "HdrPlus#payload"
        //  2338: invokeinterface kse.f:(Ljava/lang/String;)V
        //  2343: aload           14
        //  2345: invokeinterface java/util/List.isEmpty:()Z
        //  2350: ifne            2840
        //  2353: aload           28
        //  2355: getfield        gpb.j:Lkwh;
        //  2358: aload           14
        //  2360: iconst_0       
        //  2361: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2366: checkcast       Lkyi;
        //  2369: invokeinterface kwh.d:(Lkyi;)Lkzh;
        //  2374: astore          8
        //  2376: aload           23
        //  2378: getfield        dxh.c:Lgen;
        //  2381: getfield        gen.b:Lhhy;
        //  2384: iconst_0       
        //  2385: invokeinterface hhy.D:(Z)V
        //  2390: aload           8
        //  2392: aload           5
        //  2394: invokevirtual   kzh.a:(Lkzl;)Lkvs;
        //  2397: astore          20
        //  2399: aload           8
        //  2401: invokevirtual   kzh.close:()V
        //  2404: aload           20
        //  2406: ifnull          2434
        //  2409: aload           17
        //  2411: aload           20
        //  2413: invokevirtual   kjk.c:(Lkrc;)V
        //  2416: aconst_null    
        //  2417: astore          10
        //  2419: iconst_0       
        //  2420: istore          24
        //  2422: aload           18
        //  2424: astore          8
        //  2426: goto            2444
        //  2429: astore          10
        //  2431: goto            2907
        //  2434: aconst_null    
        //  2435: astore          10
        //  2437: iconst_0       
        //  2438: istore          24
        //  2440: aload           18
        //  2442: astore          8
        //  2444: iload           24
        //  2446: aload           14
        //  2448: invokeinterface java/util/List.size:()I
        //  2453: if_icmpge       2832
        //  2456: aload           28
        //  2458: getfield        gpb.h:Z
        //  2461: istore          13
        //  2463: iload           13
        //  2465: ifeq            2575
        //  2468: aload           28
        //  2470: getfield        gpb.j:Lkwh;
        //  2473: invokeinterface kwh.f:()Lkyh;
        //  2478: astore          10
        //  2480: aload           10
        //  2482: aload           5
        //  2484: invokevirtual   kyh.f:(Lkzl;)V
        //  2487: aload           28
        //  2489: getfield        gpb.j:Lkwh;
        //  2492: aload           10
        //  2494: invokevirtual   kyh.b:()Lkyi;
        //  2497: invokeinterface kwh.d:(Lkyi;)Lkzh;
        //  2502: astore          16
        //  2504: aload           16
        //  2506: aload           5
        //  2508: invokevirtual   kzh.a:(Lkzl;)Lkvs;
        //  2511: astore          20
        //  2513: aload           20
        //  2515: ifnull          2560
        //  2518: new             Lgpa;
        //  2521: astore          10
        //  2523: aload           10
        //  2525: aload           28
        //  2527: aload           16
        //  2529: invokespecial   gpa.<init>:(Lgpb;Lkzh;)V
        //  2532: new             Lkwi;
        //  2535: astore          16
        //  2537: aload           16
        //  2539: aload           10
        //  2541: invokespecial   kwi.<init>:(Ljava/lang/Runnable;)V
        //  2544: aload           20
        //  2546: aload           16
        //  2548: invokeinterface kvs.j:(Lkwp;)V
        //  2553: aload           17
        //  2555: aload           20
        //  2557: invokevirtual   kjk.c:(Lkrc;)V
        //  2560: aload           21
        //  2562: invokeinterface krc.close:()V
        //  2567: goto            2847
        //  2570: astore          10
        //  2572: goto            2918
        //  2575: aload           10
        //  2577: ifnull          2584
        //  2580: aload           10
        //  2582: astore          20
        //  2584: iload           24
        //  2586: iconst_1       
        //  2587: iadd           
        //  2588: istore          31
        //  2590: aload           14
        //  2592: invokeinterface java/util/List.size:()I
        //  2597: istore          37
        //  2599: iload           31
        //  2601: iload           37
        //  2603: if_icmpge       2662
        //  2606: aload           28
        //  2608: getfield        gpb.j:Lkwh;
        //  2611: aload           14
        //  2613: iload           31
        //  2615: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2620: checkcast       Lkyi;
        //  2623: invokeinterface kwh.d:(Lkyi;)Lkzh;
        //  2628: astore          16
        //  2630: aload           16
        //  2632: aload           5
        //  2634: invokevirtual   kzh.a:(Lkzl;)Lkvs;
        //  2637: astore          10
        //  2639: aload           16
        //  2641: invokevirtual   kzh.close:()V
        //  2644: aload           10
        //  2646: ifnull          2659
        //  2649: aload           17
        //  2651: aload           10
        //  2653: invokevirtual   kjk.c:(Lkrc;)V
        //  2656: goto            2659
        //  2659: goto            2669
        //  2662: aload           21
        //  2664: invokeinterface krc.close:()V
        //  2669: aload           20
        //  2671: ifnull          2829
        //  2674: aload           28
        //  2676: getfield        gpb.h:Z
        //  2679: ifne            2829
        //  2682: aload           20
        //  2684: invokestatic    kwp.j:(Lkvs;)V
        //  2687: aload           28
        //  2689: aload           23
        //  2691: iload           24
        //  2693: iload           22
        //  2695: aload           20
        //  2697: invokevirtual   gpb.a:(Ldxh;IILkvs;)Lljm;
        //  2700: astore          16
        //  2702: aload           16
        //  2704: ifnull          2829
        //  2707: iload           31
        //  2709: istore          24
        //  2711: aload           16
        //  2713: astore          8
        //  2715: goto            2829
        //  2718: astore          10
        //  2720: goto            2725
        //  2723: astore          10
        //  2725: iload           22
        //  2727: istore          31
        //  2729: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //  2732: invokevirtual   java/lang/Thread.interrupt:()V
        //  2735: aload           28
        //  2737: getfield        gpb.b:Lkrr;
        //  2740: ldc_w           "Failed to awaitComplete on frame %s."
        //  2743: iconst_1       
        //  2744: anewarray       Ljava/lang/Object;
        //  2747: dup            
        //  2748: iconst_0       
        //  2749: iload           24
        //  2751: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2754: aastore        
        //  2755: invokestatic    ksc.c:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  2758: invokeinterface krr.h:(Ljava/lang/String;)V
        //  2763: iload           24
        //  2765: ifne            2804
        //  2768: aload           17
        //  2770: invokevirtual   kjk.close:()V
        //  2773: aload           28
        //  2775: iconst_0       
        //  2776: putfield        gpb.h:Z
        //  2779: aload           28
        //  2781: getfield        gpb.a:Lkse;
        //  2784: invokeinterface kse.g:()V
        //  2789: iconst_0       
        //  2790: istore          13
        //  2792: goto            3422
        //  2795: astore          10
        //  2797: iload           31
        //  2799: istore          22
        //  2801: goto            2992
        //  2804: aload           28
        //  2806: getfield        gpb.k:Lgen;
        //  2809: getfield        gen.c:Lgem;
        //  2812: invokeinterface gem.f:()V
        //  2817: iload           31
        //  2819: istore          22
        //  2821: goto            2847
        //  2824: astore          10
        //  2826: goto            2837
        //  2829: goto            2444
        //  2832: goto            2847
        //  2835: astore          10
        //  2837: goto            2918
        //  2840: iconst_0       
        //  2841: istore          24
        //  2843: aload           15
        //  2845: astore          8
        //  2847: aload           28
        //  2849: aload           23
        //  2851: iload           24
        //  2853: iload           22
        //  2855: aload           8
        //  2857: aload           27
        //  2859: invokevirtual   gpb.d:(Ldxh;IILljm;Lhuz;)Z
        //  2862: istore          13
        //  2864: iload           22
        //  2866: istore          37
        //  2868: iload           24
        //  2870: istore          31
        //  2872: aload           8
        //  2874: astore          20
        //  2876: aload           17
        //  2878: invokevirtual   kjk.close:()V
        //  2881: aload           28
        //  2883: iconst_0       
        //  2884: putfield        gpb.h:Z
        //  2887: aload           28
        //  2889: getfield        gpb.a:Lkse;
        //  2892: invokeinterface kse.g:()V
        //  2897: goto            3422
        //  2900: astore          10
        //  2902: goto            2918
        //  2905: astore          10
        //  2907: iload           31
        //  2909: istore          22
        //  2911: iconst_0       
        //  2912: istore          24
        //  2914: aload           16
        //  2916: astore          8
        //  2918: aload           17
        //  2920: invokevirtual   kjk.close:()V
        //  2923: goto            2947
        //  2926: astore          16
        //  2928: iload           22
        //  2930: istore          37
        //  2932: iload           24
        //  2934: istore          31
        //  2936: aload           8
        //  2938: astore          20
        //  2940: aload           10
        //  2942: aload           16
        //  2944: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  2947: iload           22
        //  2949: istore          37
        //  2951: iload           24
        //  2953: istore          31
        //  2955: aload           8
        //  2957: astore          20
        //  2959: aload           10
        //  2961: athrow         
        //  2962: astore          8
        //  2964: aload           20
        //  2966: astore          8
        //  2968: iload           37
        //  2970: istore          22
        //  2972: iload           31
        //  2974: istore          24
        //  2976: goto            2992
        //  2979: astore          7
        //  2981: goto            3435
        //  2984: astore          8
        //  2986: aconst_null    
        //  2987: astore          8
        //  2989: iconst_0       
        //  2990: istore          24
        //  2992: aload           8
        //  2994: ifnull          3348
        //  2997: aload           28
        //  2999: getfield        gpb.a:Lkse;
        //  3002: ldc_w           "HdrPlus#recoverPayload"
        //  3005: invokeinterface kse.h:(Ljava/lang/String;)V
        //  3010: aload           28
        //  3012: getfield        gpb.b:Lkrr;
        //  3015: astore          10
        //  3017: aload           23
        //  3019: invokevirtual   dxh.a:()I
        //  3022: istore          31
        //  3024: new             Ljava/lang/StringBuilder;
        //  3027: astore          20
        //  3029: aload           20
        //  3031: bipush          88
        //  3033: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  3036: aload           20
        //  3038: ldc_w           "Attempting to recover HDR+ burst "
        //  3041: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3044: pop            
        //  3045: aload           20
        //  3047: iload           31
        //  3049: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3052: pop            
        //  3053: aload           20
        //  3055: ldc_w           " by supplying null for the remaining frames."
        //  3058: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3061: pop            
        //  3062: aload           10
        //  3064: aload           20
        //  3066: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3069: invokeinterface krr.h:(Ljava/lang/String;)V
        //  3074: iload           24
        //  3076: iload           32
        //  3078: if_icmpge       3100
        //  3081: aload           28
        //  3083: aload           23
        //  3085: iload           24
        //  3087: iload           22
        //  3089: aload           8
        //  3091: invokevirtual   gpb.c:(Ldxh;IILljm;)V
        //  3094: iinc            24, 1
        //  3097: goto            3074
        //  3100: aload           28
        //  3102: getfield        gpb.c:Ldvj;
        //  3105: aload           23
        //  3107: invokeinterface dvj.x:(Ldxh;)Z
        //  3112: ifeq            3278
        //  3115: aload           28
        //  3117: getfield        gpb.l:Lhvd;
        //  3120: aload           27
        //  3122: invokevirtual   hvd.c:(Lhuz;)V
        //  3125: aload           28
        //  3127: getfield        gpb.b:Lkrr;
        //  3130: astore          8
        //  3132: aload           23
        //  3134: invokevirtual   dxh.a:()I
        //  3137: istore          22
        //  3139: new             Ljava/lang/StringBuilder;
        //  3142: astore          10
        //  3144: aload           10
        //  3146: bipush          48
        //  3148: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  3151: aload           10
        //  3153: ldc_w           "Payload recovery succeeded for shot "
        //  3156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3159: pop            
        //  3160: aload           10
        //  3162: iload           22
        //  3164: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3167: pop            
        //  3168: aload           10
        //  3170: ldc_w           "."
        //  3173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3176: pop            
        //  3177: aload           8
        //  3179: aload           10
        //  3181: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3184: invokeinterface krr.h:(Ljava/lang/String;)V
        //  3189: aload           28
        //  3191: getfield        gpb.c:Ldvj;
        //  3194: aload           23
        //  3196: invokeinterface dvj.y:(Ldxh;)Z
        //  3201: ifeq            3241
        //  3204: aload           28
        //  3206: getfield        gpb.b:Lkrr;
        //  3209: ldc_w           "EndShotCapture succeeded for shot %d."
        //  3212: iconst_1       
        //  3213: anewarray       Ljava/lang/Object;
        //  3216: dup            
        //  3217: iconst_0       
        //  3218: aload           23
        //  3220: invokevirtual   dxh.a:()I
        //  3223: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3226: aastore        
        //  3227: invokestatic    ksc.c:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  3230: invokeinterface krr.f:(Ljava/lang/String;)V
        //  3235: iconst_1       
        //  3236: istore          13
        //  3238: goto            3406
        //  3241: aload           28
        //  3243: getfield        gpb.b:Lkrr;
        //  3246: ldc_w           "EndShotCapture failed for shot %d."
        //  3249: iconst_1       
        //  3250: anewarray       Ljava/lang/Object;
        //  3253: dup            
        //  3254: iconst_0       
        //  3255: aload           23
        //  3257: invokevirtual   dxh.a:()I
        //  3260: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3263: aastore        
        //  3264: invokestatic    ksc.c:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  3267: invokeinterface krr.f:(Ljava/lang/String;)V
        //  3272: iconst_0       
        //  3273: istore          13
        //  3275: goto            3406
        //  3278: aload           28
        //  3280: getfield        gpb.b:Lkrr;
        //  3283: astore          8
        //  3285: aload           23
        //  3287: invokevirtual   dxh.a:()I
        //  3290: istore          22
        //  3292: new             Ljava/lang/StringBuilder;
        //  3295: astore          10
        //  3297: aload           10
        //  3299: bipush          45
        //  3301: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  3304: aload           10
        //  3306: ldc_w           "Payload recovery failed for shot "
        //  3309: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3312: pop            
        //  3313: aload           10
        //  3315: iload           22
        //  3317: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3320: pop            
        //  3321: aload           10
        //  3323: ldc_w           "!"
        //  3326: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3329: pop            
        //  3330: aload           8
        //  3332: aload           10
        //  3334: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3337: invokeinterface krr.d:(Ljava/lang/String;)V
        //  3342: iconst_0       
        //  3343: istore          13
        //  3345: goto            3406
        //  3348: aload           28
        //  3350: getfield        gpb.b:Lkrr;
        //  3353: astore          8
        //  3355: aload           23
        //  3357: invokevirtual   dxh.a:()I
        //  3360: istore          22
        //  3362: new             Ljava/lang/StringBuilder;
        //  3365: astore          10
        //  3367: aload           10
        //  3369: bipush          67
        //  3371: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  3374: aload           10
        //  3376: ldc_w           "Failed to receive any frames. Aborting capture for shot "
        //  3379: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3382: pop            
        //  3383: aload           10
        //  3385: iload           22
        //  3387: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3390: pop            
        //  3391: aload           8
        //  3393: aload           10
        //  3395: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3398: invokeinterface krr.d:(Ljava/lang/String;)V
        //  3403: iconst_0       
        //  3404: istore          13
        //  3406: aload           28
        //  3408: iconst_0       
        //  3409: putfield        gpb.h:Z
        //  3412: aload           28
        //  3414: getfield        gpb.a:Lkse;
        //  3417: invokeinterface kse.g:()V
        //  3422: aload           28
        //  3424: getfield        gpb.a:Lkse;
        //  3427: invokeinterface kse.g:()V
        //  3432: goto            4183
        //  3435: aload           28
        //  3437: iconst_0       
        //  3438: putfield        gpb.h:Z
        //  3441: aload           28
        //  3443: getfield        gpb.a:Lkse;
        //  3446: invokeinterface kse.g:()V
        //  3451: aload           7
        //  3453: athrow         
        //  3454: astore          7
        //  3456: goto            4331
        //  3459: goto            3462
        //  3462: iload           31
        //  3464: istore          24
        //  3466: aload           28
        //  3468: getfield        gpb.j:Lkwh;
        //  3471: ifnonnull       3493
        //  3474: aload           28
        //  3476: getfield        gpb.b:Lkrr;
        //  3479: ldc_w           "FrameServerSession not provided."
        //  3482: invokeinterface krr.d:(Ljava/lang/String;)V
        //  3487: iconst_0       
        //  3488: istore          13
        //  3490: goto            4173
        //  3493: aload           28
        //  3495: getfield        gpb.b:Lkrr;
        //  3498: astore          10
        //  3500: aload           23
        //  3502: invokevirtual   dxh.a:()I
        //  3505: istore          22
        //  3507: new             Ljava/lang/StringBuilder;
        //  3510: astore          8
        //  3512: aload           8
        //  3514: bipush          75
        //  3516: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  3519: aload           8
        //  3521: ldc_w           "Submitting an HDR+ payload burst of "
        //  3524: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3527: pop            
        //  3528: aload           8
        //  3530: iload           32
        //  3532: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3535: pop            
        //  3536: aload           8
        //  3538: ldc_w           " frames for shot "
        //  3541: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3544: pop            
        //  3545: aload           8
        //  3547: iload           22
        //  3549: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3552: pop            
        //  3553: aload           10
        //  3555: aload           8
        //  3557: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3560: invokeinterface krr.b:(Ljava/lang/String;)V
        //  3565: aload           28
        //  3567: getfield        gpb.j:Lkwh;
        //  3570: aload           14
        //  3572: invokeinterface kwh.c:(Ljava/util/List;)Ljava/util/List;
        //  3577: astore          16
        //  3579: aload           23
        //  3581: getfield        dxh.c:Lgen;
        //  3584: getfield        gen.b:Lhhy;
        //  3587: iconst_0       
        //  3588: invokeinterface hhy.D:(Z)V
        //  3593: aload           16
        //  3595: invokeinterface java/util/List.isEmpty:()Z
        //  3600: ifeq            3664
        //  3603: aload           28
        //  3605: getfield        gpb.b:Lkrr;
        //  3608: astore          10
        //  3610: aload           23
        //  3612: invokevirtual   dxh.a:()I
        //  3615: istore          22
        //  3617: new             Ljava/lang/StringBuilder;
        //  3620: astore          8
        //  3622: aload           8
        //  3624: bipush          46
        //  3626: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  3629: aload           8
        //  3631: ldc_w           "Error submitting requests for shot "
        //  3634: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3637: pop            
        //  3638: aload           8
        //  3640: iload           22
        //  3642: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3645: pop            
        //  3646: aload           10
        //  3648: aload           8
        //  3650: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3653: invokeinterface krr.d:(Ljava/lang/String;)V
        //  3658: iconst_0       
        //  3659: istore          13
        //  3661: goto            4173
        //  3664: aload           28
        //  3666: getfield        gpb.d:Lduq;
        //  3669: invokevirtual   duq.n:()Z
        //  3672: istore          13
        //  3674: iload           13
        //  3676: ifne            3686
        //  3679: aload           21
        //  3681: invokeinterface krc.close:()V
        //  3686: aload           28
        //  3688: getfield        gpb.a:Lkse;
        //  3691: ldc_w           "HdrPlus#payloadAwait"
        //  3694: invokeinterface kse.f:(Ljava/lang/String;)V
        //  3699: aload           16
        //  3701: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  3706: astore          10
        //  3708: iconst_0       
        //  3709: istore          22
        //  3711: aload           17
        //  3713: astore          8
        //  3715: aload           10
        //  3717: invokeinterface java/util/Iterator.hasNext:()Z
        //  3722: ifeq            4033
        //  3725: aload           10
        //  3727: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3732: checkcast       Lkzh;
        //  3735: astore          18
        //  3737: aload           18
        //  3739: aload           5
        //  3741: invokevirtual   kzh.a:(Lkzl;)Lkvs;
        //  3744: astore          20
        //  3746: aload           20
        //  3748: ifnull          4030
        //  3751: aload           28
        //  3753: getfield        gpb.h:Z
        //  3756: ifeq            3769
        //  3759: aload           20
        //  3761: invokeinterface kvs.close:()V
        //  3766: goto            4033
        //  3769: aload           20
        //  3771: invokestatic    kwp.j:(Lkvs;)V
        //  3774: aload           28
        //  3776: aload           23
        //  3778: iload           22
        //  3780: iload           24
        //  3782: aload           20
        //  3784: invokevirtual   gpb.a:(Ldxh;IILkvs;)Lljm;
        //  3787: astore          20
        //  3789: aload           20
        //  3791: ifnull          3908
        //  3794: iinc            22, 1
        //  3797: aload           20
        //  3799: getstatic       android/hardware/camera2/CaptureResult.SENSOR_EXPOSURE_TIME:Landroid/hardware/camera2/CaptureResult$Key;
        //  3802: invokeinterface ljm.d:(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;
        //  3807: checkcast       Ljava/lang/Long;
        //  3810: astore          17
        //  3812: aload           28
        //  3814: getfield        gpb.b:Lkrr;
        //  3817: astore          8
        //  3819: aload           17
        //  3821: ifnull          3834
        //  3824: aload           17
        //  3826: invokevirtual   java/lang/Long.longValue:()J
        //  3829: lstore          33
        //  3831: goto            3837
        //  3834: lconst_0       
        //  3835: lstore          33
        //  3837: new             Ljava/lang/StringBuilder;
        //  3840: astore          17
        //  3842: aload           17
        //  3844: bipush          42
        //  3846: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  3849: aload           17
        //  3851: ldc_w           "Frame exposure time "
        //  3854: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3857: pop            
        //  3858: aload           17
        //  3860: lload           33
        //  3862: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  3865: pop            
        //  3866: aload           17
        //  3868: ldc_w           "ns"
        //  3871: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3874: pop            
        //  3875: aload           8
        //  3877: aload           17
        //  3879: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3882: invokeinterface krr.b:(Ljava/lang/String;)V
        //  3887: aload           20
        //  3889: astore          8
        //  3891: goto            3908
        //  3894: astore          8
        //  3896: goto            3901
        //  3899: astore          8
        //  3901: aload           20
        //  3903: astore          8
        //  3905: goto            3918
        //  3908: aload           18
        //  3910: invokevirtual   kzh.close:()V
        //  3913: goto            3715
        //  3916: astore          10
        //  3918: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //  3921: invokevirtual   java/lang/Thread.interrupt:()V
        //  3924: aload           28
        //  3926: getfield        gpb.b:Lkrr;
        //  3929: ldc_w           "Failed to awaitComplete on frame %s."
        //  3932: iconst_1       
        //  3933: anewarray       Ljava/lang/Object;
        //  3936: dup            
        //  3937: iconst_0       
        //  3938: iload           22
        //  3940: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3943: aastore        
        //  3944: invokestatic    ksc.c:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  3947: invokeinterface krr.h:(Ljava/lang/String;)V
        //  3952: aload           16
        //  3954: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  3959: astore          10
        //  3961: aload           10
        //  3963: invokeinterface java/util/Iterator.hasNext:()Z
        //  3968: ifeq            3987
        //  3971: aload           10
        //  3973: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3978: checkcast       Lkzh;
        //  3981: invokevirtual   kzh.close:()V
        //  3984: goto            3961
        //  3987: iload           22
        //  3989: ifne            4014
        //  3992: aload           28
        //  3994: getfield        gpb.a:Lkse;
        //  3997: invokeinterface kse.g:()V
        //  4002: aload           28
        //  4004: iconst_0       
        //  4005: putfield        gpb.h:Z
        //  4008: iconst_0       
        //  4009: istore          13
        //  4011: goto            4173
        //  4014: aload           28
        //  4016: getfield        gpb.k:Lgen;
        //  4019: getfield        gen.c:Lgem;
        //  4022: invokeinterface gem.f:()V
        //  4027: goto            4033
        //  4030: goto            3715
        //  4033: aload           16
        //  4035: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  4040: astore          10
        //  4042: aload           10
        //  4044: invokeinterface java/util/Iterator.hasNext:()Z
        //  4049: ifeq            4068
        //  4052: aload           10
        //  4054: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  4059: checkcast       Lkzh;
        //  4062: invokevirtual   kzh.close:()V
        //  4065: goto            4042
        //  4068: iload           13
        //  4070: ifeq            4080
        //  4073: aload           21
        //  4075: invokeinterface krc.close:()V
        //  4080: aload           28
        //  4082: aload           23
        //  4084: iload           22
        //  4086: iload           24
        //  4088: aload           8
        //  4090: aload           27
        //  4092: invokevirtual   gpb.d:(Ldxh;IILljm;Lhuz;)Z
        //  4095: istore          13
        //  4097: aload           28
        //  4099: getfield        gpb.a:Lkse;
        //  4102: invokeinterface kse.g:()V
        //  4107: aload           28
        //  4109: iconst_0       
        //  4110: putfield        gpb.h:Z
        //  4113: goto            4173
        //  4116: astore          7
        //  4118: aload           28
        //  4120: getfield        gpb.a:Lkse;
        //  4123: invokeinterface kse.g:()V
        //  4128: aload           28
        //  4130: iconst_0       
        //  4131: putfield        gpb.h:Z
        //  4134: aload           7
        //  4136: athrow         
        //  4137: astore          8
        //  4139: aload           28
        //  4141: getfield        gpb.b:Lkrr;
        //  4144: ldc_w           "Failed to submit frame requests for shot %d."
        //  4147: iconst_1       
        //  4148: anewarray       Ljava/lang/Object;
        //  4151: dup            
        //  4152: iconst_0       
        //  4153: aload           23
        //  4155: invokevirtual   dxh.a:()I
        //  4158: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4161: aastore        
        //  4162: invokestatic    ksc.c:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  4165: invokeinterface krr.d:(Ljava/lang/String;)V
        //  4170: iconst_0       
        //  4171: istore          13
        //  4173: aload           28
        //  4175: getfield        gpb.a:Lkse;
        //  4178: invokeinterface kse.g:()V
        //  4183: aload           11
        //  4185: astore          20
        //  4187: aload           7
        //  4189: astore          8
        //  4191: aload           9
        //  4193: astore          10
        //  4195: iload           13
        //  4197: ifeq            4296
        //  4200: aload           26
        //  4202: invokevirtual   kjk.close:()V
        //  4205: aload           20
        //  4207: ifnull          4228
        //  4210: aload           20
        //  4212: invokeinterface fwt.close:()V
        //  4217: goto            4228
        //  4220: astore          8
        //  4222: iconst_0       
        //  4223: istore          22
        //  4225: goto            4675
        //  4228: aload           10
        //  4230: ifnull          4251
        //  4233: aload           10
        //  4235: invokeinterface gmz.close:()V
        //  4240: goto            4251
        //  4243: astore          9
        //  4245: iconst_0       
        //  4246: istore          22
        //  4248: goto            4716
        //  4251: aload           8
        //  4253: invokeinterface kwh.close:()V
        //  4258: aload_1        
        //  4259: invokeinterface gff.close:()V
        //  4264: goto            1645
        //  4267: astore          7
        //  4269: iconst_0       
        //  4270: istore          22
        //  4272: goto            4789
        //  4275: astore          9
        //  4277: iconst_0       
        //  4278: istore          22
        //  4280: goto            4761
        //  4283: astore          20
        //  4285: aload           10
        //  4287: astore          7
        //  4289: aload           8
        //  4291: astore          9
        //  4293: goto            4583
        //  4296: new             Lkuw;
        //  4299: astore          7
        //  4301: aload           7
        //  4303: ldc_w           "HDR+ shot didn't succeed"
        //  4306: invokespecial   kuw.<init>:(Ljava/lang/String;)V
        //  4309: aload           7
        //  4311: athrow         
        //  4312: astore          20
        //  4314: aload           23
        //  4316: astore          4
        //  4318: aload           10
        //  4320: astore          9
        //  4322: aload           8
        //  4324: astore          7
        //  4326: goto            4477
        //  4329: astore          7
        //  4331: aload           28
        //  4333: getfield        gpb.a:Lkse;
        //  4336: invokeinterface kse.g:()V
        //  4341: aload           7
        //  4343: athrow         
        //  4344: astore          7
        //  4346: aload           4
        //  4348: astore          9
        //  4350: aload_3        
        //  4351: astore          10
        //  4353: goto            4406
        //  4356: astore          7
        //  4358: aload           4
        //  4360: astore          9
        //  4362: aload_3        
        //  4363: astore          10
        //  4365: goto            4406
        //  4368: astore          10
        //  4370: aload           8
        //  4372: astore          7
        //  4374: aload           10
        //  4376: astore          8
        //  4378: goto            4393
        //  4381: astore          8
        //  4383: goto            4398
        //  4386: astore          8
        //  4388: goto            4393
        //  4391: astore          8
        //  4393: goto            4398
        //  4396: astore          8
        //  4398: aload           7
        //  4400: astore          10
        //  4402: aload           8
        //  4404: astore          7
        //  4406: aload           7
        //  4408: astore          20
        //  4410: aload           10
        //  4412: astore          7
        //  4414: iconst_0       
        //  4415: istore          13
        //  4417: aload           23
        //  4419: astore          4
        //  4421: goto            4477
        //  4424: astore          8
        //  4426: aload_3        
        //  4427: getfield        gpg.b:Lkrr;
        //  4430: ldc_w           "Error starting shot."
        //  4433: aload           8
        //  4435: invokeinterface krr.e:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  4440: new             Lkuw;
        //  4443: astore          10
        //  4445: aload           10
        //  4447: aload           8
        //  4449: invokespecial   kuw.<init>:(Ljava/lang/Throwable;)V
        //  4452: aload           10
        //  4454: athrow         
        //  4455: astore          8
        //  4457: goto            4467
        //  4460: astore          8
        //  4462: goto            4467
        //  4465: astore          8
        //  4467: aload           8
        //  4469: astore          20
        //  4471: aconst_null    
        //  4472: astore          4
        //  4474: iconst_0       
        //  4475: istore          13
        //  4477: aload_0        
        //  4478: astore          8
        //  4480: aload           4
        //  4482: ifnull          4523
        //  4485: iload           13
        //  4487: ifne            4523
        //  4490: aload           8
        //  4492: getfield        gpg.h:Ldvj;
        //  4495: aload           4
        //  4497: invokeinterface dvj.n:(Ldxh;)V
        //  4502: aload           8
        //  4504: getfield        gpg.t:Ldva;
        //  4507: aload           4
        //  4509: getfield        dxh.c:Lgen;
        //  4512: getfield        gen.b:Lhhy;
        //  4515: invokeinterface hhy.h:()Lhim;
        //  4520: invokevirtual   dva.d:(Lhim;)V
        //  4523: aload           20
        //  4525: athrow         
        //  4526: astore          10
        //  4528: aload           9
        //  4530: astore          8
        //  4532: goto            4549
        //  4535: astore          9
        //  4537: aload           8
        //  4539: astore          7
        //  4541: aload           10
        //  4543: astore          8
        //  4545: aload           9
        //  4547: astore          10
        //  4549: aload           7
        //  4551: astore          9
        //  4553: aload           8
        //  4555: astore          7
        //  4557: aload           10
        //  4559: astore          8
        //  4561: aload           12
        //  4563: invokevirtual   kjk.close:()V
        //  4566: goto            4578
        //  4569: astore          10
        //  4571: aload           8
        //  4573: aload           10
        //  4575: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  4578: aload           8
        //  4580: athrow         
        //  4581: astore          20
        //  4583: aload           9
        //  4585: astore          8
        //  4587: aload           20
        //  4589: astore          9
        //  4591: iconst_0       
        //  4592: istore          22
        //  4594: aload           9
        //  4596: astore          10
        //  4598: aload           7
        //  4600: astore          9
        //  4602: aload           8
        //  4604: astore          7
        //  4606: goto            4626
        //  4609: astore          20
        //  4611: aload           10
        //  4613: astore          9
        //  4615: aload           8
        //  4617: astore          7
        //  4619: aload           20
        //  4621: astore          10
        //  4623: iconst_1       
        //  4624: istore          22
        //  4626: aload           11
        //  4628: ifnull          4650
        //  4631: aload           11
        //  4633: invokeinterface fwt.close:()V
        //  4638: goto            4650
        //  4641: astore          8
        //  4643: aload           10
        //  4645: aload           8
        //  4647: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  4650: aload           10
        //  4652: athrow         
        //  4653: astore          8
        //  4655: goto            4675
        //  4658: astore          11
        //  4660: aload           10
        //  4662: astore          9
        //  4664: aload           8
        //  4666: astore          7
        //  4668: aload           11
        //  4670: astore          8
        //  4672: iconst_1       
        //  4673: istore          22
        //  4675: aload           9
        //  4677: ifnull          4699
        //  4680: aload           9
        //  4682: invokeinterface gmz.close:()V
        //  4687: goto            4699
        //  4690: astore          9
        //  4692: aload           8
        //  4694: aload           9
        //  4696: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  4699: aload           8
        //  4701: athrow         
        //  4702: astore          9
        //  4704: goto            4716
        //  4707: astore          9
        //  4709: aload           8
        //  4711: astore          7
        //  4713: iconst_1       
        //  4714: istore          22
        //  4716: aload           7
        //  4718: invokeinterface kwh.close:()V
        //  4723: goto            4735
        //  4726: astore          7
        //  4728: aload           9
        //  4730: aload           7
        //  4732: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  4735: aload           9
        //  4737: athrow         
        //  4738: astore          7
        //  4740: goto            4789
        //  4743: astore          9
        //  4745: goto            4761
        //  4748: astore          7
        //  4750: iconst_1       
        //  4751: istore          22
        //  4753: goto            4789
        //  4756: astore          9
        //  4758: iconst_1       
        //  4759: istore          22
        //  4761: aload           6
        //  4763: astore          7
        //  4765: aload           9
        //  4767: invokestatic    niz.i:(Ljava/lang/Object;)Lniz;
        //  4770: astore          8
        //  4772: aload           8
        //  4774: astore          7
        //  4776: aload           9
        //  4778: athrow         
        //  4779: astore          9
        //  4781: aload           7
        //  4783: astore          6
        //  4785: aload           9
        //  4787: astore          7
        //  4789: aload_0        
        //  4790: astore          9
        //  4792: iload           22
        //  4794: ifeq            4822
        //  4797: aload           6
        //  4799: invokevirtual   niz.g:()Z
        //  4802: ifeq            4822
        //  4805: aload_2        
        //  4806: getfield        gen.b:Lhhy;
        //  4809: aload           6
        //  4811: invokevirtual   niz.c:()Ljava/lang/Object;
        //  4814: checkcast       Ljava/lang/Throwable;
        //  4817: invokeinterface hhy.w:(Ljava/lang/Throwable;)V
        //  4822: aload_1        
        //  4823: invokeinterface gff.close:()V
        //  4828: aload           9
        //  4830: getfield        gpg.s:Lgna;
        //  4833: invokeinterface gna.b:()V
        //  4838: aload           9
        //  4840: getfield        gpg.c:Lkse;
        //  4843: invokeinterface kse.g:()V
        //  4848: aload           9
        //  4850: getfield        gpg.c:Lkse;
        //  4853: invokeinterface kse.g:()V
        //  4858: goto            4864
        //  4861: aload           7
        //  4863: athrow         
        //  4864: goto            4861
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  92     103    4756   4761   Ljava/lang/InterruptedException;
        //  92     103    4748   4756   Any
        //  107    120    4707   4716   Any
        //  124    144    4658   4675   Any
        //  144    154    4609   4626   Any
        //  154    168    4535   4549   Any
        //  173    199    202    204    Any
        //  219    240    4535   4549   Any
        //  252    296    4465   4467   Any
        //  301    322    325    330    Any
        //  330    339    4465   4467   Any
        //  344    351    325    330    Any
        //  351    369    4465   4467   Any
        //  374    381    325    330    Any
        //  381    472    4465   4467   Any
        //  480    514    4460   4465   Any
        //  514    534    4424   4460   Ljava/lang/IllegalStateException;
        //  514    534    4460   4465   Any
        //  534    543    4396   4398   Any
        //  548    555    558    572    Any
        //  579    724    4396   4398   Any
        //  729    755    558    572    Any
        //  758    763    4396   4398   Any
        //  767    837    4396   4398   Any
        //  842    874    558    572    Any
        //  880    927    558    572    Any
        //  935    952    558    572    Any
        //  964    1008   4396   4398   Any
        //  1012   1017   4396   4398   Any
        //  1017   1031   4391   4393   Any
        //  1040   1055   4391   4393   Any
        //  1064   1104   4391   4393   Any
        //  1109   1117   1265   1267   Any
        //  1123   1194   1265   1267   Any
        //  1194   1246   1265   1267   Any
        //  1273   1282   4391   4393   Any
        //  1287   1376   1265   1267   Any
        //  1376   1387   1265   1267   Any
        //  1387   1423   1265   1267   Any
        //  1426   1461   4391   4393   Any
        //  1466   1483   1265   1267   Any
        //  1483   1503   4391   4393   Any
        //  1503   1526   4391   4393   Any
        //  1531   1543   1265   1267   Any
        //  1548   1579   1582   1587   Any
        //  1587   1592   1685   1694   Any
        //  1597   1604   1607   1612   Any
        //  1617   1624   1627   1632   Any
        //  1632   1639   1680   1685   Ljava/lang/InterruptedException;
        //  1632   1639   1675   1680   Any
        //  1694   1704   4386   4391   Any
        //  1704   1735   4381   4386   Any
        //  1735   1741   4368   4381   Any
        //  1741   1805   4386   4391   Any
        //  1816   1878   4386   4391   Any
        //  1883   1904   1912   1917   Any
        //  1927   1958   4356   4368   Any
        //  1963   2004   4356   4368   Any
        //  2004   2068   4356   4368   Any
        //  2071   2107   4356   4368   Any
        //  2107   2128   4356   4368   Any
        //  2128   2166   4329   4331   Any
        //  2171   2180   4329   4331   Any
        //  2183   2210   4329   4331   Any
        //  2210   2236   4329   4331   Any
        //  2236   2272   4329   4331   Any
        //  2277   2314   4329   4331   Any
        //  2320   2330   2984   2992   Lkuw;
        //  2320   2330   2979   3454   Any
        //  2330   2404   2905   2907   Any
        //  2409   2416   2429   2434   Any
        //  2444   2463   2835   2837   Any
        //  2468   2513   2570   2575   Any
        //  2518   2560   2570   2575   Any
        //  2560   2567   2570   2575   Any
        //  2590   2599   2835   2837   Any
        //  2606   2644   2570   2575   Any
        //  2649   2656   2570   2575   Any
        //  2662   2669   2835   2837   Any
        //  2674   2687   2723   2725   Ljava/lang/InterruptedException;
        //  2674   2687   2835   2837   Any
        //  2687   2702   2718   2723   Ljava/lang/InterruptedException;
        //  2687   2702   2824   2829   Any
        //  2729   2763   2824   2829   Any
        //  2768   2773   2795   2804   Lkuw;
        //  2768   2773   2979   3454   Any
        //  2773   2789   4329   4331   Any
        //  2804   2817   2824   2829   Any
        //  2847   2864   2900   2905   Any
        //  2876   2881   2962   2979   Lkuw;
        //  2876   2881   2979   3454   Any
        //  2881   2887   3454   3459   Any
        //  2887   2897   4329   4331   Any
        //  2918   2923   2926   2947   Any
        //  2940   2947   2962   2979   Lkuw;
        //  2940   2947   2979   3454   Any
        //  2959   2962   2962   2979   Lkuw;
        //  2959   2962   2979   3454   Any
        //  2997   3074   2979   3454   Any
        //  3081   3094   2979   3454   Any
        //  3100   3235   2979   3454   Any
        //  3241   3272   2979   3454   Any
        //  3278   3342   2979   3454   Any
        //  3348   3403   2979   3454   Any
        //  3406   3422   4329   4331   Any
        //  3422   3432   4356   4368   Any
        //  3435   3441   3454   3459   Any
        //  3441   3454   4329   4331   Any
        //  3466   3487   4329   4331   Any
        //  3493   3658   4137   4173   Lkuw;
        //  3493   3658   4329   4331   Any
        //  3664   3674   4329   4331   Any
        //  3679   3686   4329   4331   Any
        //  3686   3708   4116   4137   Any
        //  3715   3746   4116   4137   Any
        //  3751   3766   3916   3918   Ljava/lang/InterruptedException;
        //  3751   3766   4116   4137   Any
        //  3769   3789   3916   3918   Ljava/lang/InterruptedException;
        //  3769   3789   4116   4137   Any
        //  3797   3819   3899   3901   Ljava/lang/InterruptedException;
        //  3797   3819   4116   4137   Any
        //  3824   3831   3899   3901   Ljava/lang/InterruptedException;
        //  3824   3831   4116   4137   Any
        //  3837   3887   3894   3899   Ljava/lang/InterruptedException;
        //  3837   3887   4116   4137   Any
        //  3908   3913   4116   4137   Any
        //  3918   3961   4116   4137   Any
        //  3961   3984   4116   4137   Any
        //  3992   4008   4329   4331   Any
        //  4014   4027   4116   4137   Any
        //  4033   4042   4116   4137   Any
        //  4042   4065   4116   4137   Any
        //  4073   4080   4116   4137   Any
        //  4080   4097   4116   4137   Any
        //  4097   4113   4329   4331   Any
        //  4118   4128   4329   4331   Any
        //  4128   4134   3454   3459   Any
        //  4134   4137   4329   4331   Any
        //  4139   4170   4329   4331   Any
        //  4173   4183   4356   4368   Any
        //  4200   4205   4283   4296   Any
        //  4210   4217   4220   4222   Any
        //  4233   4240   4243   4245   Any
        //  4251   4258   4275   4277   Ljava/lang/InterruptedException;
        //  4251   4258   4267   4269   Any
        //  4296   4312   4312   4329   Any
        //  4331   4344   4344   4356   Any
        //  4426   4455   4455   4460   Any
        //  4490   4523   4526   4535   Any
        //  4523   4526   4526   4535   Any
        //  4561   4566   4569   4578   Any
        //  4571   4578   4581   4583   Any
        //  4578   4581   4581   4583   Any
        //  4631   4638   4641   4650   Any
        //  4643   4650   4653   4658   Any
        //  4650   4653   4653   4658   Any
        //  4680   4687   4690   4699   Any
        //  4692   4699   4702   4707   Any
        //  4699   4702   4702   4707   Any
        //  4716   4723   4726   4735   Any
        //  4728   4735   4743   4748   Ljava/lang/InterruptedException;
        //  4728   4735   4738   4743   Any
        //  4735   4738   4743   4748   Ljava/lang/InterruptedException;
        //  4735   4738   4738   4743   Any
        //  4765   4772   4779   4789   Any
        //  4776   4779   4779   4789   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.StackOverflowError
        //     at java.util.Vector.contains(Unknown Source)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:828)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1067)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1565)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2125)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1557)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1565)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1049)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2124)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1545)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1565)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:667)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:373)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
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
