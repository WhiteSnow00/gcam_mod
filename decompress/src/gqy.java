// 
// Decompiled by Procyon v0.6.0
// 

public final class gqy implements gfg
{
    public static final nsd a;
    public final int b;
    public final Object c;
    public gqx d;
    public kvw e;
    public gel f;
    private final kwd g;
    private final gue h;
    private final gqr i;
    private final kse j;
    private final glv k;
    private final gna l;
    private final dwh m;
    private final niz n;
    private final dty o;
    private final cxl p;
    private final gry q;
    private final gsh r;
    private final gnu s;
    private final dvj t;
    private final kjk u;
    private final klj v;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/commands/PckZslTorchHdrPlusImageCaptureCommand");
    }
    
    public gqy(final kwd g, final gue h, final kse j, final gqr i, final glv k, final dwh m, final niz n, final dty o, final gry q, final gsh r, final cxl p17, final gnu s, final dvj t, final kjk u, final klj v, final gna l, final int b) {
        this.c = new Object();
        this.g = g;
        this.h = h;
        this.j = j;
        this.i = i;
        this.k = k;
        this.b = b;
        this.e = h.f();
        this.m = m;
        this.n = n;
        this.o = o;
        this.q = q;
        this.r = r;
        this.p = p17;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.l = l;
    }
    
    @Override
    public final klj a() {
        return this.v;
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
        //     1: getfield        gqy.h:Lgue;
        //     4: invokeinterface gue.a:()Lgud;
        //     9: astore_3       
        //    10: getstatic       nii.a:Lnii;
        //    13: astore          4
        //    15: aload_0        
        //    16: getfield        gqy.j:Lkse;
        //    19: ldc             "PckZslTorch#acquiring3A"
        //    21: invokeinterface kse.f:(Ljava/lang/String;)V
        //    26: aconst_null    
        //    27: astore          5
        //    29: aconst_null    
        //    30: astore          6
        //    32: aconst_null    
        //    33: astore          7
        //    35: aconst_null    
        //    36: astore          8
        //    38: aconst_null    
        //    39: astore          9
        //    41: aconst_null    
        //    42: astore          10
        //    44: aload_0        
        //    45: getfield        gqy.g:Lkwd;
        //    48: invokeinterface kwd.c:()Lkwh;
        //    53: astore          11
        //    55: aload_0        
        //    56: getfield        gqy.l:Lgna;
        //    59: aload           11
        //    61: invokeinterface gna.a:(Lkwh;)Lgmz;
        //    66: astore          7
        //    68: aload_0        
        //    69: getfield        gqy.k:Lglv;
        //    72: aload           11
        //    74: aload           7
        //    76: invokeinterface gmz.a:()Lkwx;
        //    81: invokevirtual   glv.a:(Lkwh;Lkwx;)Lfwt;
        //    84: astore          6
        //    86: aload_0        
        //    87: getfield        gqy.j:Lkse;
        //    90: ldc             "PckZslTorch#takePayload"
        //    92: invokeinterface kse.h:(Ljava/lang/String;)V
        //    97: aload_2        
        //    98: getfield        gen.c:Lgem;
        //   101: invokeinterface gem.a:()Lgel;
        //   106: astore          12
        //   108: aload_0        
        //   109: aload           12
        //   111: putfield        gqy.f:Lgel;
        //   114: aload           12
        //   116: invokeinterface gel.e:()V
        //   121: aload_0        
        //   122: getfield        gqy.m:Ldwh;
        //   125: getfield        dwh.a:Lljm;
        //   128: astore          12
        //   130: aload_0        
        //   131: getfield        gqy.p:Lcxl;
        //   134: getstatic       cxs.I:Lcxm;
        //   137: invokeinterface cxl.k:(Lcxm;)Z
        //   142: ifeq            179
        //   145: aload           12
        //   147: ifnull          179
        //   150: aload_0        
        //   151: getfield        gqy.i:Lgqr;
        //   154: aload_2        
        //   155: iconst_m1      
        //   156: aload           12
        //   158: aload_0        
        //   159: getfield        gqy.o:Ldty;
        //   162: invokevirtual   dty.a:()Ldtx;
        //   165: iconst_1       
        //   166: iconst_1       
        //   167: invokevirtual   gqr.f:(Lgen;ILljm;Ldtx;ZZ)Ldxh;
        //   170: astore          12
        //   172: aload           12
        //   174: astore          10
        //   176: goto            182
        //   179: aconst_null    
        //   180: astore          10
        //   182: aload           6
        //   184: checkcast       Lglx;
        //   187: getfield        glx.a:J
        //   190: lstore          13
        //   192: getstatic       gqe.c:Lgqe;
        //   195: astore          15
        //   197: aload_0        
        //   198: getfield        gqy.f:Lgel;
        //   201: aload_0        
        //   202: getfield        gqy.b:I
        //   205: invokeinterface gel.c:(I)V
        //   210: aload_0        
        //   211: getfield        gqy.j:Lkse;
        //   214: ldc             "PckZslTorch#waitForImages"
        //   216: invokeinterface kse.f:(Ljava/lang/String;)V
        //   221: aload_0        
        //   222: getfield        gqy.c:Ljava/lang/Object;
        //   225: astore          5
        //   227: aload           5
        //   229: monitorenter   
        //   230: aload_0        
        //   231: aload_0        
        //   232: getfield        gqy.h:Lgue;
        //   235: invokeinterface gue.f:()Lkvw;
        //   240: putfield        gqy.e:Lkvw;
        //   243: new             Lgqx;
        //   246: astore          8
        //   248: aload           8
        //   250: aload_0        
        //   251: lload           13
        //   253: invokespecial   gqx.<init>:(Lgqy;J)V
        //   256: aload_0        
        //   257: aload           8
        //   259: putfield        gqy.d:Lgqx;
        //   262: aload_0        
        //   263: getfield        gqy.e:Lkvw;
        //   266: aload           8
        //   268: invokeinterface kvw.k:(Lkvv;)V
        //   273: aload           5
        //   275: monitorexit    
        //   276: aload           8
        //   278: monitorenter   
        //   279: aload           8
        //   281: getfield        gqx.b:Z
        //   284: ifeq            295
        //   287: aload           8
        //   289: invokevirtual   java/lang/Object.wait:()V
        //   292: goto            279
        //   295: aload           8
        //   297: getfield        gqx.a:Ljava/util/List;
        //   300: invokeinterface java/util/List.isEmpty:()Z
        //   305: ifeq            336
        //   308: getstatic       gqy.a:Lnsd;
        //   311: invokevirtual   nry.c:()Lnsu;
        //   314: checkcast       Lnsa;
        //   317: sipush          2021
        //   320: invokeinterface nsa.E:(I)Lnsu;
        //   325: checkcast       Lnsa;
        //   328: ldc_w           "Unable to acquire any frame for this capture."
        //   331: invokeinterface nsa.o:(Ljava/lang/String;)V
        //   336: aload           8
        //   338: getfield        gqx.a:Ljava/util/List;
        //   341: astore          9
        //   343: aload           8
        //   345: monitorexit    
        //   346: new             Ljava/util/ArrayList;
        //   349: astore          5
        //   351: aload           5
        //   353: invokespecial   java/util/ArrayList.<init>:()V
        //   356: aload_2        
        //   357: getfield        gen.b:Lhhy;
        //   360: iconst_1       
        //   361: invokeinterface hhy.D:(Z)V
        //   366: aload_0        
        //   367: getfield        gqy.g:Lkwd;
        //   370: aload_0        
        //   371: getfield        gqy.r:Lgsh;
        //   374: invokeinterface gsh.a:()Ljava/lang/Object;
        //   379: checkcast       Lkzl;
        //   382: getfield        kzl.c:Lnoi;
        //   385: aload_0        
        //   386: getfield        gqy.r:Lgsh;
        //   389: invokeinterface gsh.a:()Ljava/lang/Object;
        //   394: checkcast       Lkzl;
        //   397: getfield        kzl.d:Lnoi;
        //   400: invokeinterface kwd.v:(Ljava/util/Set;Ljava/util/Set;)Lkzl;
        //   405: astore          16
        //   407: aload_0        
        //   408: getfield        gqy.o:Ldty;
        //   411: invokevirtual   dty.a:()Ldtx;
        //   414: pop            
        //   415: new             Ljava/util/ArrayList;
        //   418: astore          8
        //   420: aload           8
        //   422: invokespecial   java/util/ArrayList.<init>:()V
        //   425: aload           9
        //   427: invokeinterface java/util/List.isEmpty:()Z
        //   432: ifeq            511
        //   435: getstatic       gqy.a:Lnsd;
        //   438: invokevirtual   nry.c:()Lnsu;
        //   441: ldc_w           "No ZSL frames found, requesting a single PSL frame."
        //   444: sipush          2024
        //   447: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //   450: aload           11
        //   452: invokeinterface kwh.f:()Lkyh;
        //   457: astore          12
        //   459: aload           12
        //   461: aload           16
        //   463: invokevirtual   kyh.f:(Lkzl;)V
        //   466: aload           8
        //   468: aload           11
        //   470: aload           12
        //   472: invokevirtual   kyh.b:()Lkyi;
        //   475: invokeinterface kwh.d:(Lkyi;)Lkzh;
        //   480: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   485: pop            
        //   486: goto            619
        //   489: astore          12
        //   491: getstatic       gqy.a:Lnsd;
        //   494: invokevirtual   nry.c:()Lnsu;
        //   497: ldc_w           "Couldn't acquire session for PSL request"
        //   500: sipush          2025
        //   503: aload           12
        //   505: invokestatic    a.m:(Lnsu;Ljava/lang/String;CLjava/lang/Throwable;)V
        //   508: goto            619
        //   511: aload_0        
        //   512: getfield        gqy.n:Lniz;
        //   515: invokevirtual   niz.g:()Z
        //   518: ifeq            619
        //   521: aload           10
        //   523: ifnull          619
        //   526: aload           9
        //   528: iconst_0       
        //   529: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   534: checkcast       Lkvs;
        //   537: astore          17
        //   539: aload           17
        //   541: invokestatic    kwp.j:(Lkvs;)V
        //   544: aload           17
        //   546: invokeinterface kvs.c:()Lljm;
        //   551: ifnull          566
        //   554: aload           17
        //   556: invokeinterface kvs.c:()Lljm;
        //   561: astore          12
        //   563: goto            575
        //   566: aload_0        
        //   567: getfield        gqy.m:Ldwh;
        //   570: getfield        dwh.a:Lljm;
        //   573: astore          12
        //   575: aload           12
        //   577: ifnull          619
        //   580: aload_0        
        //   581: getfield        gqy.q:Lgry;
        //   584: aload           17
        //   586: invokevirtual   gry.a:(Lkvs;)Lgrx;
        //   589: astore          8
        //   591: aload_0        
        //   592: getfield        gqy.n:Lniz;
        //   595: invokevirtual   niz.c:()Ljava/lang/Object;
        //   598: checkcast       Lgqb;
        //   601: aload           10
        //   603: aload           12
        //   605: aload           8
        //   607: aload           16
        //   609: aload           11
        //   611: invokevirtual   gqb.a:(Ldxh;Lljm;Lgrx;Lkzl;Lkwh;)Ljava/util/List;
        //   614: astore          8
        //   616: goto            619
        //   619: aload           9
        //   621: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   626: astore          17
        //   628: aload           17
        //   630: invokeinterface java/util/Iterator.hasNext:()Z
        //   635: ifeq            695
        //   638: aload           17
        //   640: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   645: checkcast       Lkvs;
        //   648: astore          9
        //   650: aload           9
        //   652: invokestatic    kwp.j:(Lkvs;)V
        //   655: aload           5
        //   657: aload           9
        //   659: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   664: pop            
        //   665: goto            628
        //   668: astore          12
        //   670: getstatic       gqy.a:Lnsd;
        //   673: invokevirtual   nry.c:()Lnsu;
        //   676: ldc_w           "Interrupted when waiting for frame %s to complete."
        //   679: aload           9
        //   681: invokeinterface kvs.b:()Lkvx;
        //   686: sipush          2037
        //   689: invokestatic    a.k:(Lnsu;Ljava/lang/String;Ljava/lang/Object;C)V
        //   692: goto            628
        //   695: aload_0        
        //   696: getfield        gqy.s:Lgnu;
        //   699: aload           11
        //   701: aload_2        
        //   702: getfield        gen.b:Lhhy;
        //   705: invokevirtual   gnu.a:(Lkwh;Lhhy;)V
        //   708: aload           5
        //   710: invokeinterface java/util/List.isEmpty:()Z
        //   715: ifeq            753
        //   718: getstatic       gqy.a:Lnsd;
        //   721: invokevirtual   nry.c:()Lnsu;
        //   724: checkcast       Lnsa;
        //   727: sipush          2036
        //   730: invokeinterface nsa.E:(I)Lnsu;
        //   735: checkcast       Lnsa;
        //   738: ldc_w           "Unable to get any completed ZSL frame for this capture. %s PSL frames to arrive."
        //   741: aload           8
        //   743: invokeinterface java/util/List.size:()I
        //   748: invokeinterface nsa.p:(Ljava/lang/String;I)V
        //   753: aload           5
        //   755: invokeinterface java/util/List.size:()I
        //   760: pop            
        //   761: aload           8
        //   763: invokeinterface java/util/List.size:()I
        //   768: pop            
        //   769: aload_0        
        //   770: getfield        gqy.m:Ldwh;
        //   773: getfield        dwh.a:Lljm;
        //   776: ifnull          791
        //   779: aload_0        
        //   780: getfield        gqy.m:Ldwh;
        //   783: getfield        dwh.a:Lljm;
        //   786: astore          12
        //   788: goto            794
        //   791: aconst_null    
        //   792: astore          12
        //   794: aload           8
        //   796: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   801: astore          18
        //   803: aload           18
        //   805: invokeinterface java/util/Iterator.hasNext:()Z
        //   810: ifeq            1009
        //   813: aload           18
        //   815: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   820: checkcast       Lkzh;
        //   823: astore          17
        //   825: aload           17
        //   827: aload           16
        //   829: invokevirtual   kzh.a:(Lkzl;)Lkvs;
        //   832: astore          19
        //   834: aload           19
        //   836: ifnonnull       870
        //   839: getstatic       gqy.a:Lnsd;
        //   842: invokevirtual   nry.c:()Lnsu;
        //   845: checkcast       Lnsa;
        //   848: sipush          2035
        //   851: invokeinterface nsa.E:(I)Lnsu;
        //   856: checkcast       Lnsa;
        //   859: ldc_w           "Received invalid frame."
        //   862: invokeinterface nsa.o:(Ljava/lang/String;)V
        //   867: goto            898
        //   870: aload           19
        //   872: invokestatic    kwp.j:(Lkvs;)V
        //   875: aload           5
        //   877: aload           19
        //   879: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   884: pop            
        //   885: aload           19
        //   887: invokeinterface kvs.c:()Lljm;
        //   892: astore          9
        //   894: aload           9
        //   896: astore          12
        //   898: aload           17
        //   900: invokevirtual   kzh.close:()V
        //   903: goto            803
        //   906: astore          12
        //   908: goto            1001
        //   911: astore          9
        //   913: getstatic       gqy.a:Lnsd;
        //   916: invokevirtual   nry.b:()Lnsu;
        //   919: checkcast       Lnsa;
        //   922: aload           9
        //   924: invokeinterface nsa.h:(Ljava/lang/Throwable;)Lnsu;
        //   929: checkcast       Lnsa;
        //   932: sipush          2034
        //   935: invokeinterface nsa.E:(I)Lnsu;
        //   940: checkcast       Lnsa;
        //   943: ldc_w           "Failed to awaitComplete "
        //   946: invokeinterface nsa.o:(Ljava/lang/String;)V
        //   951: aload           19
        //   953: invokeinterface kvs.close:()V
        //   958: aload           8
        //   960: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   965: astore          8
        //   967: aload           8
        //   969: invokeinterface java/util/Iterator.hasNext:()Z
        //   974: ifeq            993
        //   977: aload           8
        //   979: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   984: checkcast       Lkzh;
        //   987: invokevirtual   kzh.close:()V
        //   990: goto            967
        //   993: aload           17
        //   995: invokevirtual   kzh.close:()V
        //   998: goto            1009
        //  1001: aload           17
        //  1003: invokevirtual   kzh.close:()V
        //  1006: aload           12
        //  1008: athrow         
        //  1009: aload_0        
        //  1010: getfield        gqy.j:Lkse;
        //  1013: invokeinterface kse.g:()V
        //  1018: aload           5
        //  1020: invokeinterface java/util/List.isEmpty:()Z
        //  1025: ifne            1340
        //  1028: aload           12
        //  1030: ifnull          1092
        //  1033: aload_0        
        //  1034: getfield        gqy.j:Lkse;
        //  1037: ldc_w           "PckZslTorch#processFrames"
        //  1040: invokeinterface kse.f:(Ljava/lang/String;)V
        //  1045: aload_0        
        //  1046: getfield        gqy.i:Lgqr;
        //  1049: astore          8
        //  1051: aload_0        
        //  1052: getfield        gqy.o:Ldty;
        //  1055: invokevirtual   dty.a:()Ldtx;
        //  1058: astore          9
        //  1060: aload           8
        //  1062: aload           5
        //  1064: aload           15
        //  1066: aload_2        
        //  1067: iconst_m1      
        //  1068: aload           12
        //  1070: aload           9
        //  1072: aload           10
        //  1074: invokevirtual   gqr.h:(Ljava/util/List;Lgff;Lgen;ILljm;Ldtx;Ldxh;)V
        //  1077: aload_0        
        //  1078: getfield        gqy.j:Lkse;
        //  1081: invokeinterface kse.g:()V
        //  1086: iconst_1       
        //  1087: istore          20
        //  1089: goto            1152
        //  1092: getstatic       gqy.a:Lnsd;
        //  1095: invokevirtual   nry.b:()Lnsu;
        //  1098: ldc_w           "No known good metadata."
        //  1101: sipush          2032
        //  1104: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //  1107: aload           5
        //  1109: invokeinterface java/util/List.size:()I
        //  1114: istore          21
        //  1116: iconst_0       
        //  1117: istore          20
        //  1119: iload           20
        //  1121: iload           21
        //  1123: if_icmpge       1149
        //  1126: aload           5
        //  1128: iload           20
        //  1130: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1135: checkcast       Lkvs;
        //  1138: invokeinterface kvs.close:()V
        //  1143: iinc            20, 1
        //  1146: goto            1119
        //  1149: iconst_0       
        //  1150: istore          20
        //  1152: aload_0        
        //  1153: getfield        gqy.j:Lkse;
        //  1156: invokeinterface kse.g:()V
        //  1161: aload           6
        //  1163: invokeinterface fwt.close:()V
        //  1168: aload           7
        //  1170: ifnull          1188
        //  1173: aload           7
        //  1175: invokeinterface gmz.close:()V
        //  1180: goto            1188
        //  1183: astore          12
        //  1185: goto            1585
        //  1188: aload           11
        //  1190: invokeinterface kwh.close:()V
        //  1195: iload           20
        //  1197: ifne            1276
        //  1200: aload           10
        //  1202: ifnull          1216
        //  1205: aload_0        
        //  1206: getfield        gqy.t:Ldvj;
        //  1209: aload           10
        //  1211: invokeinterface dvj.n:(Ldxh;)V
        //  1216: aload_2        
        //  1217: getfield        gen.c:Lgem;
        //  1220: invokeinterface gem.f:()V
        //  1225: aload_2        
        //  1226: getfield        gen.b:Lhhy;
        //  1229: astore_2       
        //  1230: aload_0        
        //  1231: getfield        gqy.u:Lkjk;
        //  1234: invokevirtual   kjk.a:()Z
        //  1237: ifne            1262
        //  1240: aload_2        
        //  1241: getstatic       iwx.a:Liwv;
        //  1244: new             Ldgi;
        //  1247: dup            
        //  1248: ldc_w           "Image capture failed. Aborting capture!"
        //  1251: invokespecial   dgi.<init>:(Ljava/lang/String;)V
        //  1254: invokeinterface hhy.C:(Liwv;Ljava/lang/Throwable;)V
        //  1259: goto            1276
        //  1262: aload_2        
        //  1263: new             Ldgg;
        //  1266: dup            
        //  1267: aconst_null    
        //  1268: invokespecial   dgg.<init>:(Ljava/lang/Throwable;)V
        //  1271: invokeinterface hhy.w:(Ljava/lang/Throwable;)V
        //  1276: aload_0        
        //  1277: getfield        gqy.l:Lgna;
        //  1280: invokeinterface gna.b:()V
        //  1285: aload_3        
        //  1286: invokeinterface gud.a:()V
        //  1291: aload_1        
        //  1292: invokeinterface gff.close:()V
        //  1297: return         
        //  1298: astore          12
        //  1300: iload           20
        //  1302: istore          21
        //  1304: iconst_0       
        //  1305: istore          20
        //  1307: goto            1906
        //  1310: astore          12
        //  1312: goto            1670
        //  1315: astore          12
        //  1317: goto            1327
        //  1320: astore          12
        //  1322: goto            1327
        //  1325: astore          12
        //  1327: goto            1799
        //  1330: astore          12
        //  1332: goto            1544
        //  1335: astore          12
        //  1337: goto            1508
        //  1340: getstatic       gqy.a:Lnsd;
        //  1343: invokevirtual   nry.b:()Lnsu;
        //  1346: ldc_w           "Unable to get any completed frame for this capture."
        //  1349: sipush          2033
        //  1352: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //  1355: new             Ldfy;
        //  1358: astore          12
        //  1360: aload           12
        //  1362: ldc_w           "Unable to get any completed frame for this capture."
        //  1365: invokespecial   dfy.<init>:(Ljava/lang/String;)V
        //  1368: aload           12
        //  1370: athrow         
        //  1371: astore          12
        //  1373: aload           8
        //  1375: monitorexit    
        //  1376: aload           12
        //  1378: athrow         
        //  1379: astore          12
        //  1381: goto            1391
        //  1384: astore          12
        //  1386: goto            1373
        //  1389: astore          12
        //  1391: getstatic       gqy.a:Lnsd;
        //  1394: invokevirtual   nry.b:()Lnsu;
        //  1397: ldc_w           "Interrupted when waiting on framebuffer listener to acquire frames."
        //  1400: sipush          2020
        //  1403: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //  1406: aload           8
        //  1408: monitorenter   
        //  1409: aload           8
        //  1411: iconst_0       
        //  1412: putfield        gqx.b:Z
        //  1415: aload           8
        //  1417: monitorexit    
        //  1418: aload           8
        //  1420: getfield        gqx.c:Lgqy;
        //  1423: getfield        gqy.c:Ljava/lang/Object;
        //  1426: astore          5
        //  1428: aload           5
        //  1430: monitorenter   
        //  1431: aload           8
        //  1433: getfield        gqx.c:Lgqy;
        //  1436: astore          8
        //  1438: aload           8
        //  1440: getfield        gqy.e:Lkvw;
        //  1443: aload           8
        //  1445: getfield        gqy.d:Lgqx;
        //  1448: invokeinterface kvw.l:(Lkvv;)V
        //  1453: aload           5
        //  1455: monitorexit    
        //  1456: aload           12
        //  1458: athrow         
        //  1459: astore          12
        //  1461: aload           5
        //  1463: monitorexit    
        //  1464: aload           12
        //  1466: athrow         
        //  1467: astore          12
        //  1469: aload           8
        //  1471: monitorexit    
        //  1472: aload           12
        //  1474: athrow         
        //  1475: astore          12
        //  1477: goto            1500
        //  1480: astore          12
        //  1482: aload           5
        //  1484: monitorexit    
        //  1485: aload           12
        //  1487: athrow         
        //  1488: astore          12
        //  1490: goto            1500
        //  1493: astore          12
        //  1495: goto            1482
        //  1498: astore          12
        //  1500: goto            1505
        //  1503: astore          12
        //  1505: iconst_0       
        //  1506: istore          20
        //  1508: aload           6
        //  1510: invokeinterface fwt.close:()V
        //  1515: goto            1527
        //  1518: astore          8
        //  1520: aload           12
        //  1522: aload           8
        //  1524: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1527: aload           12
        //  1529: athrow         
        //  1530: astore          12
        //  1532: goto            1544
        //  1535: astore          12
        //  1537: iconst_0       
        //  1538: istore          20
        //  1540: aload           5
        //  1542: astore          10
        //  1544: aload           7
        //  1546: ifnull          1568
        //  1549: aload           7
        //  1551: invokeinterface gmz.close:()V
        //  1556: goto            1568
        //  1559: astore          8
        //  1561: aload           12
        //  1563: aload           8
        //  1565: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1568: aload           12
        //  1570: athrow         
        //  1571: astore          12
        //  1573: goto            1585
        //  1576: astore          12
        //  1578: iconst_0       
        //  1579: istore          20
        //  1581: aload           6
        //  1583: astore          10
        //  1585: iconst_0       
        //  1586: istore          22
        //  1588: aload           11
        //  1590: invokeinterface kwh.close:()V
        //  1595: goto            1607
        //  1598: astore          8
        //  1600: aload           12
        //  1602: aload           8
        //  1604: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1607: aload           12
        //  1609: athrow         
        //  1610: astore          12
        //  1612: goto            1635
        //  1615: astore          12
        //  1617: goto            1670
        //  1620: astore          12
        //  1622: goto            1799
        //  1625: astore          12
        //  1627: goto            1799
        //  1630: astore          12
        //  1632: goto            1799
        //  1635: iload           20
        //  1637: istore          21
        //  1639: iload           22
        //  1641: istore          20
        //  1643: goto            1906
        //  1646: astore          12
        //  1648: iconst_0       
        //  1649: istore          20
        //  1651: iconst_0       
        //  1652: istore          21
        //  1654: aload           9
        //  1656: astore          10
        //  1658: goto            1906
        //  1661: astore          12
        //  1663: iconst_0       
        //  1664: istore          20
        //  1666: aload           7
        //  1668: astore          10
        //  1670: iload           20
        //  1672: istore          21
        //  1674: aload           10
        //  1676: astore          8
        //  1678: aload           12
        //  1680: invokestatic    niz.i:(Ljava/lang/Object;)Lniz;
        //  1683: astore          12
        //  1685: iload           20
        //  1687: ifne            1276
        //  1690: aload           10
        //  1692: ifnull          1706
        //  1695: aload_0        
        //  1696: getfield        gqy.t:Ldvj;
        //  1699: aload           10
        //  1701: invokeinterface dvj.n:(Ldxh;)V
        //  1706: aload_2        
        //  1707: getfield        gen.c:Lgem;
        //  1710: invokeinterface gem.f:()V
        //  1715: aload_2        
        //  1716: getfield        gen.b:Lhhy;
        //  1719: astore_2       
        //  1720: aload_0        
        //  1721: getfield        gqy.u:Lkjk;
        //  1724: invokevirtual   kjk.a:()Z
        //  1727: ifne            1753
        //  1730: aload_2        
        //  1731: getstatic       iwx.a:Liwv;
        //  1734: aload           12
        //  1736: checkcast       Lnjd;
        //  1739: getfield        njd.a:Ljava/lang/Object;
        //  1742: checkcast       Ljava/lang/Throwable;
        //  1745: invokeinterface hhy.C:(Liwv;Ljava/lang/Throwable;)V
        //  1750: goto            1276
        //  1753: aload_2        
        //  1754: new             Ldgg;
        //  1757: dup            
        //  1758: aload           12
        //  1760: checkcast       Lnjd;
        //  1763: getfield        njd.a:Ljava/lang/Object;
        //  1766: checkcast       Ljava/lang/Throwable;
        //  1769: invokespecial   dgg.<init>:(Ljava/lang/Throwable;)V
        //  1772: invokeinterface hhy.w:(Ljava/lang/Throwable;)V
        //  1777: goto            1276
        //  1780: astore          12
        //  1782: goto            1792
        //  1785: astore          12
        //  1787: goto            1792
        //  1790: astore          12
        //  1792: iconst_0       
        //  1793: istore          20
        //  1795: aload           8
        //  1797: astore          10
        //  1799: iload           20
        //  1801: istore          21
        //  1803: aload           10
        //  1805: astore          8
        //  1807: aload           12
        //  1809: invokestatic    niz.i:(Ljava/lang/Object;)Lniz;
        //  1812: astore          5
        //  1814: iload           20
        //  1816: istore          21
        //  1818: aload           5
        //  1820: astore          4
        //  1822: aload           10
        //  1824: astore          8
        //  1826: aload           12
        //  1828: instanceof      Ljava/lang/InterruptedException;
        //  1831: ifne            1870
        //  1834: iload           20
        //  1836: istore          21
        //  1838: aload           5
        //  1840: astore          4
        //  1842: aload           10
        //  1844: astore          8
        //  1846: aload           12
        //  1848: instanceof      Lkuw;
        //  1851: istore          23
        //  1853: iload           23
        //  1855: ifeq            1864
        //  1858: iconst_1       
        //  1859: istore          21
        //  1861: goto            1873
        //  1864: iconst_0       
        //  1865: istore          21
        //  1867: goto            1873
        //  1870: iconst_1       
        //  1871: istore          21
        //  1873: aload           12
        //  1875: athrow         
        //  1876: astore          12
        //  1878: iload           20
        //  1880: istore          22
        //  1882: iload           21
        //  1884: istore          20
        //  1886: aload           5
        //  1888: astore          4
        //  1890: iload           22
        //  1892: istore          21
        //  1894: goto            1906
        //  1897: iconst_0       
        //  1898: istore          20
        //  1900: astore          12
        //  1902: aload           8
        //  1904: astore          10
        //  1906: iload           21
        //  1908: ifne            2036
        //  1911: aload           10
        //  1913: ifnull          1927
        //  1916: aload_0        
        //  1917: getfield        gqy.t:Ldvj;
        //  1920: aload           10
        //  1922: invokeinterface dvj.n:(Ldxh;)V
        //  1927: aload_2        
        //  1928: getfield        gen.c:Lgem;
        //  1931: invokeinterface gem.f:()V
        //  1936: aload_2        
        //  1937: getfield        gen.b:Lhhy;
        //  1940: astore          10
        //  1942: aload_0        
        //  1943: getfield        gqy.u:Lkjk;
        //  1946: invokevirtual   kjk.a:()Z
        //  1949: ifne            2014
        //  1952: iload           20
        //  1954: ifeq            1965
        //  1957: aload           4
        //  1959: invokevirtual   niz.g:()Z
        //  1962: ifne            2014
        //  1965: getstatic       iwx.a:Liwv;
        //  1968: astore          8
        //  1970: aload           4
        //  1972: invokevirtual   niz.g:()Z
        //  1975: ifeq            1990
        //  1978: aload           4
        //  1980: invokevirtual   niz.c:()Ljava/lang/Object;
        //  1983: checkcast       Ljava/lang/Throwable;
        //  1986: astore_2       
        //  1987: goto            2001
        //  1990: new             Ldgi;
        //  1993: dup            
        //  1994: ldc_w           "Image capture failed. Aborting capture!"
        //  1997: invokespecial   dgi.<init>:(Ljava/lang/String;)V
        //  2000: astore_2       
        //  2001: aload           10
        //  2003: aload           8
        //  2005: aload_2        
        //  2006: invokeinterface hhy.C:(Liwv;Ljava/lang/Throwable;)V
        //  2011: goto            2036
        //  2014: aload           10
        //  2016: new             Ldgg;
        //  2019: dup            
        //  2020: aload           4
        //  2022: invokevirtual   niz.f:()Ljava/lang/Object;
        //  2025: checkcast       Ljava/lang/Throwable;
        //  2028: invokespecial   dgg.<init>:(Ljava/lang/Throwable;)V
        //  2031: invokeinterface hhy.w:(Ljava/lang/Throwable;)V
        //  2036: aload_0        
        //  2037: getfield        gqy.l:Lgna;
        //  2040: invokeinterface gna.b:()V
        //  2045: aload_3        
        //  2046: invokeinterface gud.a:()V
        //  2051: aload_1        
        //  2052: invokeinterface gff.close:()V
        //  2057: goto            2063
        //  2060: aload           12
        //  2062: athrow         
        //  2063: goto            2060
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  44     55     1790   1792   Lkuw;
        //  44     55     1785   1790   Ljava/lang/InterruptedException;
        //  44     55     1780   1785   Ljava/lang/RuntimeException;
        //  44     55     1661   1670   Ldgi;
        //  44     55     1646   1661   Any
        //  55     68     1576   1585   Any
        //  68     86     1535   1544   Any
        //  86     145    1503   1505   Any
        //  150    172    1503   1505   Any
        //  182    230    1498   1500   Any
        //  230    276    1480   1488   Any
        //  276    279    1389   1391   Ljava/lang/InterruptedException;
        //  276    279    1498   1500   Any
        //  279    292    1371   1389   Any
        //  295    336    1371   1389   Any
        //  336    346    1371   1389   Any
        //  346    450    1498   1500   Any
        //  450    486    489    511    Lkuw;
        //  450    486    1498   1500   Any
        //  491    508    1498   1500   Any
        //  511    521    1498   1500   Any
        //  526    563    1498   1500   Any
        //  566    575    1498   1500   Any
        //  580    616    1498   1500   Any
        //  619    628    1498   1500   Any
        //  628    650    1498   1500   Any
        //  650    665    668    695    Ljava/lang/InterruptedException;
        //  650    665    1498   1500   Any
        //  670    692    1498   1500   Any
        //  695    753    1498   1500   Any
        //  753    788    1498   1500   Any
        //  794    803    1498   1500   Any
        //  803    834    1498   1500   Any
        //  839    867    911    1001   Ljava/lang/InterruptedException;
        //  839    867    906    911    Any
        //  870    894    911    1001   Ljava/lang/InterruptedException;
        //  870    894    906    911    Any
        //  898    903    1498   1500   Any
        //  913    967    906    911    Any
        //  967    990    906    911    Any
        //  993    998    1498   1500   Any
        //  1001   1009   1498   1500   Any
        //  1009   1028   1498   1500   Any
        //  1033   1060   1498   1500   Any
        //  1060   1086   1475   1480   Any
        //  1092   1116   1475   1480   Any
        //  1126   1143   1475   1480   Any
        //  1152   1161   1335   1340   Any
        //  1161   1168   1330   1335   Any
        //  1173   1180   1183   1188   Any
        //  1188   1195   1325   1327   Lkuw;
        //  1188   1195   1320   1325   Ljava/lang/InterruptedException;
        //  1188   1195   1315   1320   Ljava/lang/RuntimeException;
        //  1188   1195   1310   1315   Ldgi;
        //  1188   1195   1298   1310   Any
        //  1340   1371   1475   1480   Any
        //  1373   1376   1384   1389   Any
        //  1376   1379   1379   1384   Ljava/lang/InterruptedException;
        //  1376   1379   1475   1480   Any
        //  1391   1409   1475   1480   Any
        //  1409   1418   1467   1475   Any
        //  1418   1431   1488   1493   Any
        //  1431   1456   1459   1467   Any
        //  1456   1459   1488   1493   Any
        //  1461   1464   1459   1467   Any
        //  1464   1467   1488   1493   Any
        //  1469   1472   1467   1475   Any
        //  1472   1475   1488   1493   Any
        //  1482   1485   1493   1498   Any
        //  1485   1488   1488   1493   Any
        //  1508   1515   1518   1527   Any
        //  1520   1527   1530   1535   Any
        //  1527   1530   1530   1535   Any
        //  1549   1556   1559   1568   Any
        //  1561   1568   1571   1576   Any
        //  1568   1571   1571   1576   Any
        //  1588   1595   1598   1607   Any
        //  1600   1607   1630   1635   Lkuw;
        //  1600   1607   1625   1630   Ljava/lang/InterruptedException;
        //  1600   1607   1620   1625   Ljava/lang/RuntimeException;
        //  1600   1607   1615   1620   Ldgi;
        //  1600   1607   1610   1615   Any
        //  1607   1610   1630   1635   Lkuw;
        //  1607   1610   1625   1630   Ljava/lang/InterruptedException;
        //  1607   1610   1620   1625   Ljava/lang/RuntimeException;
        //  1607   1610   1615   1620   Ldgi;
        //  1607   1610   1610   1615   Any
        //  1678   1685   1897   1906   Any
        //  1807   1814   1897   1906   Any
        //  1826   1834   1897   1906   Any
        //  1846   1853   1897   1906   Any
        //  1873   1876   1876   1897   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 827, Size: 827
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
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
}
