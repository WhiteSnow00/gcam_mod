import java.util.Iterator;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqu implements gfg
{
    private static final nsd a;
    private final gfg b;
    private final Set c;
    private final gqb d;
    private final dvj e;
    private final dva f;
    private final gqr g;
    private final dty h;
    private final kse i;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/commands/PckZslShastaImageCaptureCommand");
    }
    
    public gqu(final Set c, final gfg b, final niz niz, final dvj e, final dva f, final gqr g, final dty h, final kse i) {
        this.b = b;
        this.c = c;
        this.g = g;
        this.d = (gqb)niz.c();
        this.e = e;
        this.f = f;
        this.h = h;
        this.i = i;
    }
    
    private static final void d(final gfg gfg, final List list, final gff gff, final gen gen) {
        a.l(gqu.a.b(), "Executing fallback", '\u07e3');
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((kvs)iterator.next()).close();
        }
        gen.b.k().w();
        gen.c.g();
        gfg.c(gff, gen);
    }
    
    @Override
    public final klj a() {
        return this.b.a();
    }
    
    @Override
    public final klj b() {
        return klq.g(fzu.c(nqb.n(this.c)));
    }
    
    @Override
    public final void c(final gff p0, final gen p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gqu.i:Lkse;
        //     4: ldc             "PckZslShastaImageCaptureCommand#captureImage"
        //     6: invokeinterface kse.f:(Ljava/lang/String;)V
        //    11: aload_0        
        //    12: getfield        gqu.i:Lkse;
        //    15: ldc             "PckZslShastaImageCaptureCommand#getZslFramesAsync"
        //    17: invokeinterface kse.f:(Ljava/lang/String;)V
        //    22: aload_0        
        //    23: getfield        gqu.d:Lgqb;
        //    26: astore_3       
        //    27: aload_2        
        //    28: getfield        gen.b:Lhhy;
        //    31: astore          4
        //    33: aload_3        
        //    34: getfield        gqb.h:Lkse;
        //    37: ldc             "getZslFramesAsync"
        //    39: invokeinterface kse.f:(Ljava/lang/String;)V
        //    44: new             Lgqa;
        //    47: dup            
        //    48: aload_3        
        //    49: getfield        gqb.d:Lgue;
        //    52: invokespecial   gqa.<init>:(Lgue;)V
        //    55: astore          5
        //    57: aload_3        
        //    58: getfield        gqb.l:Ljava/util/concurrent/Executor;
        //    61: astore          6
        //    63: aload_3        
        //    64: getfield        gqb.h:Lkse;
        //    67: astore          7
        //    69: aload           5
        //    71: aload           5
        //    73: getfield        gqa.b:Lgue;
        //    76: invokeinterface gue.a:()Lgud;
        //    81: putfield        gqa.d:Lgud;
        //    84: aload           5
        //    86: aload           5
        //    88: getfield        gqa.b:Lgue;
        //    91: invokeinterface gue.i:()Ljava/util/List;
        //    96: putfield        gqa.c:Ljava/util/List;
        //    99: aload           4
        //   101: iconst_1       
        //   102: invokeinterface hhy.D:(Z)V
        //   107: aload           5
        //   109: getfield        gqa.c:Ljava/util/List;
        //   112: invokeinterface java/util/List.size:()I
        //   117: pop            
        //   118: aload           6
        //   120: new             Lgpz;
        //   123: dup            
        //   124: aload           5
        //   126: aload           7
        //   128: invokespecial   gpz.<init>:(Lgqa;Lkse;)V
        //   131: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
        //   136: aload_3        
        //   137: getfield        gqb.h:Lkse;
        //   140: invokeinterface kse.g:()V
        //   145: aload_0        
        //   146: getfield        gqu.i:Lkse;
        //   149: ldc             "Shasta_pckZslHdrPlusProcessor#getLastGoodMetadata"
        //   151: invokeinterface kse.h:(Ljava/lang/String;)V
        //   156: aload           5
        //   158: getfield        gqa.c:Ljava/util/List;
        //   161: astore          7
        //   163: aload           7
        //   165: ifnull          219
        //   168: aload           7
        //   170: aload           7
        //   172: invokeinterface java/util/List.size:()I
        //   177: invokeinterface java/util/List.listIterator:(I)Ljava/util/ListIterator;
        //   182: astore          7
        //   184: aload           7
        //   186: invokeinterface java/util/ListIterator.hasPrevious:()Z
        //   191: ifeq            219
        //   194: aload           7
        //   196: invokeinterface java/util/ListIterator.previous:()Ljava/lang/Object;
        //   201: checkcast       Lkvs;
        //   204: invokeinterface kvs.c:()Lljm;
        //   209: astore          6
        //   211: aload           6
        //   213: ifnull          184
        //   216: goto            222
        //   219: aconst_null    
        //   220: astore          6
        //   222: aload_0        
        //   223: getfield        gqu.i:Lkse;
        //   226: ldc             "Shasta_pckZslHdrPlusProcessor#createZslShot"
        //   228: invokeinterface kse.h:(Ljava/lang/String;)V
        //   233: aload           6
        //   235: ifnull          263
        //   238: aload_0        
        //   239: getfield        gqu.g:Lgqr;
        //   242: aload_2        
        //   243: iconst_m1      
        //   244: aload           6
        //   246: aload_0        
        //   247: getfield        gqu.h:Ldty;
        //   250: invokevirtual   dty.a:()Ldtx;
        //   253: iconst_1       
        //   254: iconst_1       
        //   255: invokevirtual   gqr.f:(Lgen;ILljm;Ldtx;ZZ)Ldxh;
        //   258: astore          7
        //   260: goto            266
        //   263: aconst_null    
        //   264: astore          7
        //   266: aload           6
        //   268: astore          8
        //   270: aload_0        
        //   271: getfield        gqu.i:Lkse;
        //   274: invokeinterface kse.g:()V
        //   279: aload           7
        //   281: ifnull          3428
        //   284: aload           5
        //   286: invokevirtual   gqa.a:()I
        //   289: ifle            3428
        //   292: aload_2        
        //   293: getfield        gen.c:Lgem;
        //   296: invokeinterface gem.c:()Lgel;
        //   301: invokeinterface gel.e:()V
        //   306: aload_0        
        //   307: getfield        gqu.i:Lkse;
        //   310: ldc             "PckShastaZslController#processPayload"
        //   312: invokeinterface kse.f:(Ljava/lang/String;)V
        //   317: new             Ljava/util/ArrayList;
        //   320: dup            
        //   321: invokespecial   java/util/ArrayList.<init>:()V
        //   324: astore          9
        //   326: aload           7
        //   328: astore          10
        //   330: aload           7
        //   332: astore_3       
        //   333: aload_0        
        //   334: getfield        gqu.d:Lgqb;
        //   337: astore          11
        //   339: aload           7
        //   341: astore          10
        //   343: aload           7
        //   345: astore_3       
        //   346: aload_0        
        //   347: getfield        gqu.h:Ldty;
        //   350: invokevirtual   dty.a:()Ldtx;
        //   353: pop            
        //   354: aload           7
        //   356: astore          10
        //   358: aload           7
        //   360: astore_3       
        //   361: aload           11
        //   363: getfield        gqb.g:Ldus;
        //   366: astore          6
        //   368: aload           7
        //   370: astore          10
        //   372: aload           7
        //   374: astore_3       
        //   375: aload           6
        //   377: getfield        dus.a:Lkvs;
        //   380: ifnull          431
        //   383: aload           7
        //   385: astore          10
        //   387: aload           7
        //   389: astore_3       
        //   390: aload           6
        //   392: getfield        dus.a:Lkvs;
        //   395: invokeinterface kvs.e:()Z
        //   400: ifeq            409
        //   403: aconst_null    
        //   404: astore          6
        //   406: goto            434
        //   409: aload           7
        //   411: astore          10
        //   413: aload           7
        //   415: astore_3       
        //   416: aload           6
        //   418: getfield        dus.a:Lkvs;
        //   421: invokeinterface kvs.a:()Lkvs;
        //   426: astore          6
        //   428: goto            434
        //   431: aconst_null    
        //   432: astore          6
        //   434: aload           6
        //   436: ifnull          578
        //   439: aload           7
        //   441: astore          10
        //   443: aload           7
        //   445: astore_3       
        //   446: aload           6
        //   448: invokeinterface kvs.c:()Lljm;
        //   453: astore          4
        //   455: aload           4
        //   457: ifnull          536
        //   460: aload           7
        //   462: astore          10
        //   464: aload           7
        //   466: astore_3       
        //   467: aload           4
        //   469: getstatic       android/hardware/camera2/CaptureResult.LENS_FOCAL_LENGTH:Landroid/hardware/camera2/CaptureResult$Key;
        //   472: invokeinterface ljm.d:(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;
        //   477: checkcast       Ljava/lang/Float;
        //   480: astore          12
        //   482: aload           7
        //   484: astore          10
        //   486: aload           7
        //   488: astore_3       
        //   489: aload           8
        //   491: getstatic       android/hardware/camera2/CaptureResult.LENS_FOCAL_LENGTH:Landroid/hardware/camera2/CaptureResult$Key;
        //   494: invokeinterface ljm.d:(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;
        //   499: checkcast       Ljava/lang/Float;
        //   502: astore          4
        //   504: aload           12
        //   506: ifnull          536
        //   509: aload           7
        //   511: astore          10
        //   513: aload           7
        //   515: astore_3       
        //   516: aload           12
        //   518: aload           4
        //   520: invokevirtual   java/lang/Float.equals:(Ljava/lang/Object;)Z
        //   523: ifne            529
        //   526: goto            536
        //   529: aload           6
        //   531: astore          12
        //   533: goto            581
        //   536: aload           7
        //   538: astore          10
        //   540: aload           7
        //   542: astore_3       
        //   543: getstatic       gqb.a:Lnsd;
        //   546: invokevirtual   nry.c:()Lnsu;
        //   549: ldc_w           "Skipping cached PSL frame from different source."
        //   552: sipush          1941
        //   555: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //   558: aload           7
        //   560: astore          10
        //   562: aload           7
        //   564: astore_3       
        //   565: aload           6
        //   567: invokeinterface kvs.close:()V
        //   572: aconst_null    
        //   573: astore          12
        //   575: goto            581
        //   578: aconst_null    
        //   579: astore          12
        //   581: aload           12
        //   583: ifnonnull       592
        //   586: iconst_1       
        //   587: istore          13
        //   589: goto            595
        //   592: iconst_0       
        //   593: istore          13
        //   595: aload           7
        //   597: astore          10
        //   599: aload           7
        //   601: astore_3       
        //   602: new             Ljava/util/ArrayList;
        //   605: astore          14
        //   607: aload           7
        //   609: astore          10
        //   611: aload           7
        //   613: astore_3       
        //   614: aload           14
        //   616: invokespecial   java/util/ArrayList.<init>:()V
        //   619: aload           7
        //   621: astore          10
        //   623: aload           7
        //   625: astore_3       
        //   626: aload           11
        //   628: getfield        gqb.h:Lkse;
        //   631: ldc_w           "Shasta_frameServer#acquireSession"
        //   634: invokeinterface kse.f:(Ljava/lang/String;)V
        //   639: aload           11
        //   641: getfield        gqb.b:Lkwd;
        //   644: invokeinterface kwd.c:()Lkwh;
        //   649: astore_3       
        //   650: aload           11
        //   652: getfield        gqb.h:Lkse;
        //   655: invokeinterface kse.g:()V
        //   660: new             Ljava/util/ArrayList;
        //   663: astore          6
        //   665: aload           6
        //   667: invokespecial   java/util/ArrayList.<init>:()V
        //   670: iload           13
        //   672: ifeq            1313
        //   675: new             Lksd;
        //   678: astore          15
        //   680: aload           15
        //   682: aload           11
        //   684: getfield        gqb.h:Lkse;
        //   687: ldc_w           "ShastaZslCtrlr_getMeteringFrame"
        //   690: invokespecial   ksd.<init>:(Lkse;Ljava/lang/String;)V
        //   693: aload           6
        //   695: astore          4
        //   697: new             Ljava/util/ArrayList;
        //   700: astore          10
        //   702: aload           6
        //   704: astore          4
        //   706: aload           10
        //   708: aload           11
        //   710: getfield        gqb.d:Lgue;
        //   713: invokeinterface gue.j:()Ljava/util/List;
        //   718: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   721: aload           6
        //   723: astore          4
        //   725: aload           10
        //   727: invokestatic    java/util/Collections.reverse:(Ljava/util/List;)V
        //   730: aload           6
        //   732: astore          4
        //   734: aload           10
        //   736: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   739: astore          16
        //   741: aconst_null    
        //   742: astore          10
        //   744: aload           6
        //   746: astore          4
        //   748: aload           16
        //   750: invokeinterface java/util/Iterator.hasNext:()Z
        //   755: ifeq            850
        //   758: aload           6
        //   760: astore          4
        //   762: aload           16
        //   764: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   769: checkcast       Lkvs;
        //   772: astore          17
        //   774: aload           6
        //   776: astore          4
        //   778: aload           11
        //   780: getfield        gqb.h:Lkse;
        //   783: astore          18
        //   785: aload           18
        //   787: ldc_w           "meteringCandidate"
        //   790: invokeinterface kse.f:(Ljava/lang/String;)V
        //   795: aload           10
        //   797: ifnonnull       830
        //   800: aload           17
        //   802: invokeinterface kvs.f:()Z
        //   807: ifeq            830
        //   810: aload           11
        //   812: getfield        gqb.k:Lguk;
        //   815: aload           17
        //   817: invokevirtual   guk.b:(Lkvs;)Z
        //   820: ifeq            830
        //   823: aload           17
        //   825: astore          10
        //   827: goto            837
        //   830: aload           17
        //   832: invokeinterface kvs.close:()V
        //   837: aload           11
        //   839: getfield        gqb.h:Lkse;
        //   842: invokeinterface kse.g:()V
        //   847: goto            744
        //   850: aload           6
        //   852: astore          4
        //   854: aload           10
        //   856: ifnull          883
        //   859: aload           5
        //   861: invokeinterface krc.close:()V
        //   866: aload           15
        //   868: invokevirtual   ksd.close:()V
        //   871: aload           10
        //   873: astore          6
        //   875: goto            1092
        //   878: astore          6
        //   880: goto            1293
        //   883: aload           11
        //   885: getfield        gqb.h:Lkse;
        //   888: ldc_w           "ShastaZslCtrlr_getOldestFrame"
        //   891: invokeinterface kse.f:(Ljava/lang/String;)V
        //   896: aload           11
        //   898: getfield        gqb.d:Lgue;
        //   901: invokeinterface gue.d:()Lkvs;
        //   906: astore          10
        //   908: aload           5
        //   910: invokeinterface krc.close:()V
        //   915: aload           10
        //   917: ifnull          1013
        //   920: aload           11
        //   922: getfield        gqb.k:Lguk;
        //   925: astore          17
        //   927: new             Lgpy;
        //   930: astore          16
        //   932: aload           16
        //   934: aload           17
        //   936: invokespecial   gpy.<init>:(Lguk;)V
        //   939: aload           10
        //   941: aload           16
        //   943: invokestatic    kwp.i:(Lkvs;Lkwo;)V
        //   946: aload           10
        //   948: invokestatic    kwp.j:(Lkvs;)V
        //   951: aload           11
        //   953: getfield        gqb.k:Lguk;
        //   956: aload           10
        //   958: invokevirtual   guk.b:(Lkvs;)Z
        //   961: istore          19
        //   963: iload           19
        //   965: ifeq            978
        //   968: aload           5
        //   970: invokeinterface krc.close:()V
        //   975: goto            866
        //   978: getstatic       gqb.a:Lnsd;
        //   981: invokevirtual   nry.b:()Lnsu;
        //   984: checkcast       Lnsa;
        //   987: sipush          1943
        //   990: invokeinterface nsa.E:(I)Lnsu;
        //   995: checkcast       Lnsa;
        //   998: ldc_w           "Found older frame, but could not lock from binning."
        //  1001: invokeinterface nsa.o:(Ljava/lang/String;)V
        //  1006: aload           10
        //  1008: invokeinterface kvs.close:()V
        //  1013: aload           11
        //  1015: getfield        gqb.h:Lkse;
        //  1018: invokeinterface kse.g:()V
        //  1023: aload           5
        //  1025: invokeinterface krc.close:()V
        //  1030: goto            1084
        //  1033: astore          4
        //  1035: aload           6
        //  1037: astore          4
        //  1039: goto            1049
        //  1042: astore          6
        //  1044: goto            1281
        //  1047: astore          6
        //  1049: getstatic       gqb.a:Lnsd;
        //  1052: invokevirtual   nry.b:()Lnsu;
        //  1055: checkcast       Lnsa;
        //  1058: sipush          1942
        //  1061: invokeinterface nsa.E:(I)Lnsu;
        //  1066: checkcast       Lnsa;
        //  1069: ldc_w           "Failed to acquire metering frame."
        //  1072: invokeinterface nsa.o:(Ljava/lang/String;)V
        //  1077: aload           5
        //  1079: invokeinterface krc.close:()V
        //  1084: aload           15
        //  1086: invokevirtual   ksd.close:()V
        //  1089: aconst_null    
        //  1090: astore          6
        //  1092: aload           6
        //  1094: ifnonnull       1142
        //  1097: getstatic       gqb.a:Lnsd;
        //  1100: invokevirtual   nry.b:()Lnsu;
        //  1103: checkcast       Lnsa;
        //  1106: sipush          1960
        //  1109: invokeinterface nsa.E:(I)Lnsu;
        //  1114: checkcast       Lnsa;
        //  1117: ldc_w           "Failed to acquire metering frame."
        //  1120: invokeinterface nsa.o:(Ljava/lang/String;)V
        //  1125: aconst_null    
        //  1126: astore          16
        //  1128: iconst_0       
        //  1129: istore          20
        //  1131: aload           4
        //  1133: astore          10
        //  1135: aload           6
        //  1137: astore          4
        //  1139: goto            1332
        //  1142: aload           11
        //  1144: getfield        gqb.e:Lgry;
        //  1147: aload           6
        //  1149: invokevirtual   gry.a:(Lkvs;)Lgrx;
        //  1152: astore          10
        //  1154: aload           11
        //  1156: getfield        gqb.h:Lkse;
        //  1159: ldc_w           "Shasta_frameServer#createFrameStream"
        //  1162: invokeinterface kse.f:(Ljava/lang/String;)V
        //  1167: aload           11
        //  1169: getfield        gqb.b:Lkwd;
        //  1172: aload           11
        //  1174: getfield        gqb.j:Lguo;
        //  1177: aload           10
        //  1179: invokeinterface guo.a:(Lgrx;)Lnoi;
        //  1184: aload           11
        //  1186: getfield        gqb.c:Lgsh;
        //  1189: invokeinterface gsh.a:()Ljava/lang/Object;
        //  1194: checkcast       Lkzl;
        //  1197: getfield        kzl.d:Lnoi;
        //  1200: invokeinterface kwd.v:(Ljava/util/Set;Ljava/util/Set;)Lkzl;
        //  1205: astore          16
        //  1207: aload           11
        //  1209: getfield        gqb.h:Lkse;
        //  1212: invokeinterface kse.g:()V
        //  1217: aload           6
        //  1219: astore          4
        //  1221: aload           11
        //  1223: aload           7
        //  1225: aload           8
        //  1227: aload           10
        //  1229: aload           16
        //  1231: aload_3        
        //  1232: invokevirtual   gqb.a:(Ldxh;Lljm;Lgrx;Lkzl;Lkwh;)Ljava/util/List;
        //  1235: astore          10
        //  1237: iload           13
        //  1239: istore          20
        //  1241: goto            1332
        //  1244: astore          4
        //  1246: goto            1251
        //  1249: astore          4
        //  1251: aload           7
        //  1253: astore          10
        //  1255: aload_3        
        //  1256: astore          12
        //  1258: aload           6
        //  1260: astore          7
        //  1262: aload           4
        //  1264: astore_3       
        //  1265: aload           14
        //  1267: astore          4
        //  1269: aload           10
        //  1271: astore          6
        //  1273: goto            2637
        //  1276: astore          6
        //  1278: goto            1293
        //  1281: aload           5
        //  1283: invokeinterface krc.close:()V
        //  1288: aload           6
        //  1290: athrow         
        //  1291: astore          6
        //  1293: aload           15
        //  1295: invokevirtual   ksd.close:()V
        //  1298: goto            1310
        //  1301: astore          4
        //  1303: aload           6
        //  1305: aload           4
        //  1307: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1310: aload           6
        //  1312: athrow         
        //  1313: aload           5
        //  1315: invokevirtual   gqa.close:()V
        //  1318: aconst_null    
        //  1319: astore          16
        //  1321: aconst_null    
        //  1322: astore          4
        //  1324: iload           13
        //  1326: istore          20
        //  1328: aload           6
        //  1330: astore          10
        //  1332: aload           12
        //  1334: astore          15
        //  1336: aload           11
        //  1338: getfield        gqb.h:Lkse;
        //  1341: ldc_w           "afDebugMetadataFetcher#populateMetadata"
        //  1344: invokeinterface kse.f:(Ljava/lang/String;)V
        //  1349: aload           11
        //  1351: getfield        gqb.i:Lgnu;
        //  1354: astore          6
        //  1356: aload_2        
        //  1357: getfield        gen.b:Lhhy;
        //  1360: astore          12
        //  1362: aload           6
        //  1364: aload_3        
        //  1365: aload           12
        //  1367: invokevirtual   gnu.a:(Lkwh;Lhhy;)V
        //  1370: aload_3        
        //  1371: invokeinterface kwh.close:()V
        //  1376: aload           11
        //  1378: getfield        gqb.h:Lkse;
        //  1381: ldc_w           "zslFramesFuture#get"
        //  1384: invokeinterface kse.h:(Ljava/lang/String;)V
        //  1389: aload           5
        //  1391: getfield        gqa.a:Lofn;
        //  1394: invokevirtual   ofn.get:()Ljava/lang/Object;
        //  1397: checkcast       Ljava/util/List;
        //  1400: astore          6
        //  1402: goto            1436
        //  1405: astore          6
        //  1407: goto            1412
        //  1410: astore          6
        //  1412: getstatic       gqb.a:Lnsd;
        //  1415: invokevirtual   nry.b:()Lnsu;
        //  1418: ldc_w           "Error getting ZSL frames"
        //  1421: sipush          1935
        //  1424: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //  1427: new             Ljava/util/ArrayList;
        //  1430: dup            
        //  1431: invokespecial   java/util/ArrayList.<init>:()V
        //  1434: astore          6
        //  1436: aload           6
        //  1438: invokestatic    j$/util/Collection$_EL.stream:(Ljava/util/Collection;)Lj$/util/stream/Stream;
        //  1441: invokestatic    j$/util/stream/Collectors.toList:()Lj$/util/stream/Collector;
        //  1444: invokeinterface j$/util/stream/Stream.collect:(Lj$/util/stream/Collector;)Ljava/lang/Object;
        //  1449: checkcast       Ljava/util/List;
        //  1452: astore          6
        //  1454: aload           11
        //  1456: getfield        gqb.h:Lkse;
        //  1459: ldc_w           "closingCaptureLock"
        //  1462: invokeinterface kse.h:(Ljava/lang/String;)V
        //  1467: aload_1        
        //  1468: invokeinterface gff.close:()V
        //  1473: aload           11
        //  1475: getfield        gqb.h:Lkse;
        //  1478: invokeinterface kse.g:()V
        //  1483: aload           6
        //  1485: invokeinterface java/util/List.size:()I
        //  1490: istore          21
        //  1492: iload           20
        //  1494: ifeq            1509
        //  1497: aload           10
        //  1499: invokeinterface java/util/List.size:()I
        //  1504: istore          13
        //  1506: goto            1523
        //  1509: aload           15
        //  1511: ifnull          1520
        //  1514: iconst_1       
        //  1515: istore          13
        //  1517: goto            1523
        //  1520: iconst_0       
        //  1521: istore          13
        //  1523: iload           21
        //  1525: iload           13
        //  1527: iadd           
        //  1528: istore          22
        //  1530: iload           22
        //  1532: ifne            1601
        //  1535: new             Ljava/util/ArrayList;
        //  1538: dup            
        //  1539: invokespecial   java/util/ArrayList.<init>:()V
        //  1542: astore          12
        //  1544: aload_3        
        //  1545: invokeinterface kwh.close:()V
        //  1550: aload           7
        //  1552: astore          10
        //  1554: aload           7
        //  1556: astore_3       
        //  1557: aload           5
        //  1559: invokevirtual   gqa.close:()V
        //  1562: aload           4
        //  1564: ifnull          1581
        //  1567: aload           7
        //  1569: astore          10
        //  1571: aload           7
        //  1573: astore_3       
        //  1574: aload           4
        //  1576: invokeinterface kvs.close:()V
        //  1581: aload           12
        //  1583: astore          6
        //  1585: goto            2843
        //  1588: astore          6
        //  1590: goto            2494
        //  1593: astore_3       
        //  1594: goto            1598
        //  1597: astore_3       
        //  1598: goto            2502
        //  1601: aload           11
        //  1603: getfield        gqb.h:Lkse;
        //  1606: astore          18
        //  1608: aload           7
        //  1610: astore          17
        //  1612: aload           6
        //  1614: astore          14
        //  1616: aload_3        
        //  1617: astore          12
        //  1619: aload           18
        //  1621: ldc_w           "pckZslHdrPlusProcessor#beginPayload"
        //  1624: invokeinterface kse.f:(Ljava/lang/String;)V
        //  1629: aload           7
        //  1631: astore          17
        //  1633: aload           6
        //  1635: astore          14
        //  1637: aload_3        
        //  1638: astore          12
        //  1640: aload           11
        //  1642: getfield        gqb.f:Lgqr;
        //  1645: aload           7
        //  1647: aload           8
        //  1649: iconst_1       
        //  1650: invokevirtual   gqr.d:(Ldxh;Lljm;Z)V
        //  1653: aload           7
        //  1655: astore          17
        //  1657: aload           6
        //  1659: astore          14
        //  1661: aload_3        
        //  1662: astore          12
        //  1664: aload           11
        //  1666: getfield        gqb.h:Lkse;
        //  1669: ldc_w           "pckZslHdrPlusProcessor#processZslPayload"
        //  1672: invokeinterface kse.h:(Ljava/lang/String;)V
        //  1677: aload           7
        //  1679: astore          17
        //  1681: aload           6
        //  1683: astore          14
        //  1685: aload_3        
        //  1686: astore          12
        //  1688: aload           11
        //  1690: getfield        gqb.f:Lgqr;
        //  1693: aload           6
        //  1695: aload           7
        //  1697: iconst_1       
        //  1698: iload           22
        //  1700: invokevirtual   gqr.c:(Ljava/util/List;Ldxh;ZI)I
        //  1703: istore          13
        //  1705: iload           13
        //  1707: ifle            1772
        //  1710: aload           7
        //  1712: astore          17
        //  1714: aload           6
        //  1716: astore          14
        //  1718: aload_3        
        //  1719: astore          12
        //  1721: aload           11
        //  1723: getfield        gqb.f:Lgqr;
        //  1726: astore          18
        //  1728: aload           7
        //  1730: astore          17
        //  1732: aload           6
        //  1734: astore          14
        //  1736: aload_3        
        //  1737: astore          12
        //  1739: aload           18
        //  1741: getfield        gqr.b:Ldva;
        //  1744: aload           7
        //  1746: invokevirtual   dva.i:(Ldxh;)V
        //  1749: aload           7
        //  1751: astore          17
        //  1753: aload           6
        //  1755: astore          14
        //  1757: aload_3        
        //  1758: astore          12
        //  1760: aload           18
        //  1762: getfield        gqr.a:Ldvj;
        //  1765: aload           7
        //  1767: invokeinterface dvj.t:(Ldxh;)V
        //  1772: aload           7
        //  1774: astore          17
        //  1776: aload           6
        //  1778: astore          14
        //  1780: aload_3        
        //  1781: astore          12
        //  1783: aload           11
        //  1785: getfield        gqb.h:Lkse;
        //  1788: ldc_w           "Shasta_Frames#awaitCompletePsl"
        //  1791: invokeinterface kse.h:(Ljava/lang/String;)V
        //  1796: iload           20
        //  1798: ifeq            2312
        //  1801: aload           7
        //  1803: astore          17
        //  1805: aload           6
        //  1807: astore          12
        //  1809: aload_3        
        //  1810: astore          14
        //  1812: aload           16
        //  1814: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1817: pop            
        //  1818: aload           7
        //  1820: astore          17
        //  1822: aload           6
        //  1824: astore          12
        //  1826: aload_3        
        //  1827: astore          14
        //  1829: aload           10
        //  1831: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1836: astore          18
        //  1838: iload           22
        //  1840: istore          20
        //  1842: aload           7
        //  1844: astore          17
        //  1846: aload           6
        //  1848: astore          12
        //  1850: aload_3        
        //  1851: astore          14
        //  1853: aload           18
        //  1855: invokeinterface java/util/Iterator.hasNext:()Z
        //  1860: ifeq            2293
        //  1863: aload           7
        //  1865: astore          17
        //  1867: aload           6
        //  1869: astore          12
        //  1871: aload_3        
        //  1872: astore          14
        //  1874: aload           18
        //  1876: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1881: checkcast       Lkzh;
        //  1884: astore          15
        //  1886: aload           7
        //  1888: astore          17
        //  1890: aload           6
        //  1892: astore          12
        //  1894: aload_3        
        //  1895: astore          14
        //  1897: aload           11
        //  1899: getfield        gqb.h:Lkse;
        //  1902: ldc_w           "getPslFrame"
        //  1905: invokeinterface kse.f:(Ljava/lang/String;)V
        //  1910: aload           7
        //  1912: astore          17
        //  1914: aload           6
        //  1916: astore          12
        //  1918: aload_3        
        //  1919: astore          14
        //  1921: aload           15
        //  1923: aload           16
        //  1925: invokevirtual   kzh.a:(Lkzl;)Lkvs;
        //  1928: astore          10
        //  1930: aload           10
        //  1932: ifnonnull       1975
        //  1935: aload           7
        //  1937: astore          17
        //  1939: aload           6
        //  1941: astore          14
        //  1943: aload_3        
        //  1944: astore          12
        //  1946: aload           11
        //  1948: getfield        gqb.h:Lkse;
        //  1951: invokeinterface kse.g:()V
        //  1956: aload           7
        //  1958: astore          17
        //  1960: aload           6
        //  1962: astore          14
        //  1964: aload_3        
        //  1965: astore          12
        //  1967: aload           15
        //  1969: invokevirtual   kzh.close:()V
        //  1972: goto            1842
        //  1975: aload           10
        //  1977: invokestatic    kwp.j:(Lkvs;)V
        //  1980: aload           10
        //  1982: invokeinterface kvs.b:()Lkvx;
        //  1987: ifnull          2087
        //  1990: aload           10
        //  1992: invokeinterface kvs.g:()Z
        //  1997: ifeq            2087
        //  2000: aload           11
        //  2002: getfield        gqb.g:Ldus;
        //  2005: aload           10
        //  2007: invokeinterface kvs.a:()Lkvs;
        //  2012: invokevirtual   dus.b:(Lkvs;)V
        //  2015: aload           11
        //  2017: getfield        gqb.h:Lkse;
        //  2020: ldc_w           "processPslFrame"
        //  2023: invokeinterface kse.h:(Ljava/lang/String;)V
        //  2028: aload           11
        //  2030: getfield        gqb.f:Lgqr;
        //  2033: astore          12
        //  2035: aload           12
        //  2037: aload           10
        //  2039: aload           7
        //  2041: iconst_1       
        //  2042: iload           13
        //  2044: iload           20
        //  2046: invokevirtual   gqr.a:(Lkvs;Ldxh;ZII)I
        //  2049: istore          22
        //  2051: aload           6
        //  2053: aload           10
        //  2055: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  2060: pop            
        //  2061: iload           22
        //  2063: istore          13
        //  2065: goto            2122
        //  2068: astore          12
        //  2070: iload           22
        //  2072: istore          13
        //  2074: goto            2158
        //  2077: astore          16
        //  2079: goto            2242
        //  2082: astore          12
        //  2084: goto            2158
        //  2087: getstatic       gqb.a:Lnsd;
        //  2090: invokevirtual   nry.c:()Lnsu;
        //  2093: checkcast       Lnsa;
        //  2096: sipush          1956
        //  2099: invokeinterface nsa.E:(I)Lnsu;
        //  2104: checkcast       Lnsa;
        //  2107: ldc_w           "Failed to acquire PSL frame."
        //  2110: invokeinterface nsa.o:(Ljava/lang/String;)V
        //  2115: aload           10
        //  2117: invokeinterface kvs.close:()V
        //  2122: aload           7
        //  2124: astore          14
        //  2126: aload_3        
        //  2127: astore          12
        //  2129: aload           6
        //  2131: astore          10
        //  2133: aload           11
        //  2135: getfield        gqb.h:Lkse;
        //  2138: invokeinterface kse.g:()V
        //  2143: goto            2221
        //  2146: astore          12
        //  2148: goto            2158
        //  2151: astore          16
        //  2153: goto            2242
        //  2156: astore          12
        //  2158: aload           7
        //  2160: astore          14
        //  2162: aload_3        
        //  2163: astore          17
        //  2165: aload           6
        //  2167: astore          10
        //  2169: getstatic       gqb.a:Lnsd;
        //  2172: invokevirtual   nry.b:()Lnsu;
        //  2175: checkcast       Lnsa;
        //  2178: aload           12
        //  2180: invokeinterface nsa.h:(Ljava/lang/Throwable;)Lnsu;
        //  2185: checkcast       Lnsa;
        //  2188: sipush          1957
        //  2191: invokeinterface nsa.E:(I)Lnsu;
        //  2196: checkcast       Lnsa;
        //  2199: ldc_w           "Failed to awaitComplete "
        //  2202: invokeinterface nsa.o:(Ljava/lang/String;)V
        //  2207: aload           17
        //  2209: astore          12
        //  2211: aload           11
        //  2213: getfield        gqb.h:Lkse;
        //  2216: invokeinterface kse.g:()V
        //  2221: aload           6
        //  2223: astore          10
        //  2225: aload_3        
        //  2226: astore          12
        //  2228: aload           7
        //  2230: astore          14
        //  2232: aload           15
        //  2234: invokevirtual   kzh.close:()V
        //  2237: goto            1842
        //  2240: astore          16
        //  2242: aload           6
        //  2244: astore          10
        //  2246: aload_3        
        //  2247: astore          12
        //  2249: aload           7
        //  2251: astore          14
        //  2253: aload           11
        //  2255: getfield        gqb.h:Lkse;
        //  2258: invokeinterface kse.g:()V
        //  2263: aload           6
        //  2265: astore          10
        //  2267: aload_3        
        //  2268: astore          12
        //  2270: aload           7
        //  2272: astore          14
        //  2274: aload           15
        //  2276: invokevirtual   kzh.close:()V
        //  2279: aload           6
        //  2281: astore          10
        //  2283: aload_3        
        //  2284: astore          12
        //  2286: aload           7
        //  2288: astore          14
        //  2290: aload           16
        //  2292: athrow         
        //  2293: goto            2399
        //  2296: astore          7
        //  2298: aload           17
        //  2300: astore          6
        //  2302: aload           12
        //  2304: astore_3       
        //  2305: aload           14
        //  2307: astore          12
        //  2309: goto            2557
        //  2312: aload           15
        //  2314: ifnull          2399
        //  2317: aload           6
        //  2319: astore          10
        //  2321: aload_3        
        //  2322: astore          12
        //  2324: aload           7
        //  2326: astore          14
        //  2328: aload           11
        //  2330: getfield        gqb.f:Lgqr;
        //  2333: astore          16
        //  2335: aload           6
        //  2337: astore          14
        //  2339: aload_3        
        //  2340: astore          12
        //  2342: aload           7
        //  2344: astore          10
        //  2346: aload           16
        //  2348: aload           15
        //  2350: aload           7
        //  2352: iconst_1       
        //  2353: iload           13
        //  2355: iload           21
        //  2357: iconst_1       
        //  2358: iadd           
        //  2359: invokevirtual   gqr.a:(Lkvs;Ldxh;ZII)I
        //  2362: pop            
        //  2363: aload           6
        //  2365: astore          14
        //  2367: aload_3        
        //  2368: astore          12
        //  2370: aload           7
        //  2372: astore          10
        //  2374: aload           6
        //  2376: aload           15
        //  2378: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  2383: pop            
        //  2384: goto            2399
        //  2387: astore          7
        //  2389: aload           10
        //  2391: astore_3       
        //  2392: aload           14
        //  2394: astore          6
        //  2396: goto            2557
        //  2399: aload           6
        //  2401: astore          14
        //  2403: aload_3        
        //  2404: astore          12
        //  2406: aload           7
        //  2408: astore          10
        //  2410: aload           11
        //  2412: getfield        gqb.h:Lkse;
        //  2415: invokeinterface kse.g:()V
        //  2420: aload           6
        //  2422: astore          14
        //  2424: aload_3        
        //  2425: astore          12
        //  2427: aload           7
        //  2429: astore          10
        //  2431: aload           11
        //  2433: getfield        gqb.f:Lgqr;
        //  2436: aload           6
        //  2438: invokeinterface java/util/List.size:()I
        //  2443: aload_2        
        //  2444: aload           8
        //  2446: aload           7
        //  2448: iconst_1       
        //  2449: invokevirtual   gqr.e:(ILgen;Lljm;Ldxh;Z)V
        //  2452: aload_3        
        //  2453: invokeinterface kwh.close:()V
        //  2458: aload           7
        //  2460: astore          12
        //  2462: aload           7
        //  2464: astore_3       
        //  2465: aload           5
        //  2467: invokevirtual   gqa.close:()V
        //  2470: aload           4
        //  2472: ifnull          2489
        //  2475: aload           7
        //  2477: astore          12
        //  2479: aload           7
        //  2481: astore_3       
        //  2482: aload           4
        //  2484: invokeinterface kvs.close:()V
        //  2489: goto            2843
        //  2492: astore          6
        //  2494: goto            3014
        //  2497: astore_3       
        //  2498: goto            2502
        //  2501: astore_3       
        //  2502: aload           6
        //  2504: astore          12
        //  2506: goto            2722
        //  2509: astore          7
        //  2511: aload           14
        //  2513: astore_3       
        //  2514: aload           10
        //  2516: astore          6
        //  2518: goto            2557
        //  2521: astore          7
        //  2523: aload           17
        //  2525: astore          6
        //  2527: aload           14
        //  2529: astore_3       
        //  2530: goto            2557
        //  2533: astore          10
        //  2535: aload           7
        //  2537: astore          12
        //  2539: aload           6
        //  2541: astore          7
        //  2543: aload           12
        //  2545: astore          6
        //  2547: aload_3        
        //  2548: astore          12
        //  2550: aload           7
        //  2552: astore_3       
        //  2553: aload           10
        //  2555: astore          7
        //  2557: aload_3        
        //  2558: astore          10
        //  2560: aload           7
        //  2562: astore_3       
        //  2563: aload           4
        //  2565: astore          7
        //  2567: aload           10
        //  2569: astore          4
        //  2571: goto            2637
        //  2574: astore          6
        //  2576: goto            2581
        //  2579: astore          6
        //  2581: aload           7
        //  2583: astore          10
        //  2585: aload_3        
        //  2586: astore          12
        //  2588: aload           4
        //  2590: astore          7
        //  2592: aload           6
        //  2594: astore_3       
        //  2595: aload           14
        //  2597: astore          4
        //  2599: aload           10
        //  2601: astore          6
        //  2603: goto            2637
        //  2606: astore          6
        //  2608: aload_3        
        //  2609: astore          12
        //  2611: goto            2619
        //  2614: astore          6
        //  2616: aload_3        
        //  2617: astore          12
        //  2619: aload           6
        //  2621: astore_3       
        //  2622: aconst_null    
        //  2623: astore          10
        //  2625: aload           7
        //  2627: astore          6
        //  2629: aload           14
        //  2631: astore          4
        //  2633: aload           10
        //  2635: astore          7
        //  2637: aload           12
        //  2639: invokeinterface kwh.close:()V
        //  2644: goto            2655
        //  2647: astore          12
        //  2649: aload_3        
        //  2650: aload           12
        //  2652: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  2655: aload_3        
        //  2656: athrow         
        //  2657: astore_3       
        //  2658: goto            2669
        //  2661: astore_3       
        //  2662: goto            2683
        //  2665: astore_3       
        //  2666: goto            2683
        //  2669: aload           7
        //  2671: astore          4
        //  2673: aload           6
        //  2675: astore          7
        //  2677: aload_3        
        //  2678: astore          6
        //  2680: goto            3014
        //  2683: aload           7
        //  2685: astore          10
        //  2687: aload           4
        //  2689: astore          12
        //  2691: aload           6
        //  2693: astore          7
        //  2695: aload           10
        //  2697: astore          4
        //  2699: goto            2722
        //  2702: astore          6
        //  2704: aconst_null    
        //  2705: astore          4
        //  2707: goto            3014
        //  2710: astore_3       
        //  2711: goto            2715
        //  2714: astore_3       
        //  2715: aconst_null    
        //  2716: astore          4
        //  2718: aload           14
        //  2720: astore          12
        //  2722: getstatic       gqb.a:Lnsd;
        //  2725: invokevirtual   nry.b:()Lnsu;
        //  2728: checkcast       Lnsa;
        //  2731: aload_3        
        //  2732: invokeinterface nsa.h:(Ljava/lang/Throwable;)Lnsu;
        //  2737: checkcast       Lnsa;
        //  2740: sipush          1953
        //  2743: invokeinterface nsa.E:(I)Lnsu;
        //  2748: checkcast       Lnsa;
        //  2751: ldc_w           "Failed to acquire FrameServer session "
        //  2754: invokeinterface nsa.o:(Ljava/lang/String;)V
        //  2759: aload           12
        //  2761: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  2766: astore          6
        //  2768: aload           6
        //  2770: invokeinterface java/util/Iterator.hasNext:()Z
        //  2775: ifeq            2796
        //  2778: aload           6
        //  2780: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2785: checkcast       Lkvs;
        //  2788: invokeinterface kvs.close:()V
        //  2793: goto            2768
        //  2796: aload           7
        //  2798: astore          12
        //  2800: aload           7
        //  2802: astore_3       
        //  2803: aload           5
        //  2805: invokevirtual   gqa.close:()V
        //  2808: aload           4
        //  2810: ifnull          2827
        //  2813: aload           7
        //  2815: astore          12
        //  2817: aload           7
        //  2819: astore_3       
        //  2820: aload           4
        //  2822: invokeinterface kvs.close:()V
        //  2827: aload           7
        //  2829: astore          12
        //  2831: aload           7
        //  2833: astore_3       
        //  2834: new             Ljava/util/ArrayList;
        //  2837: dup            
        //  2838: invokespecial   java/util/ArrayList.<init>:()V
        //  2841: astore          6
        //  2843: aload_0        
        //  2844: getfield        gqu.i:Lkse;
        //  2847: invokeinterface kse.g:()V
        //  2852: aload           6
        //  2854: invokeinterface java/util/List.size:()I
        //  2859: ifgt            2896
        //  2862: getstatic       gqu.a:Lnsd;
        //  2865: invokevirtual   nry.b:()Lnsu;
        //  2868: checkcast       Lnsa;
        //  2871: sipush          2008
        //  2874: invokeinterface nsa.E:(I)Lnsu;
        //  2879: checkcast       Lnsa;
        //  2882: ldc_w           "Can't execute command, not enough images."
        //  2885: invokeinterface nsa.o:(Ljava/lang/String;)V
        //  2890: iconst_0       
        //  2891: istore          13
        //  2893: goto            2899
        //  2896: iconst_1       
        //  2897: istore          13
        //  2899: aload           5
        //  2901: invokevirtual   gqa.close:()V
        //  2904: iload           13
        //  2906: ifne            3255
        //  2909: aload           5
        //  2911: invokevirtual   gqa.b:()V
        //  2914: getstatic       gqu.a:Lnsd;
        //  2917: invokevirtual   nry.c:()Lnsu;
        //  2920: ldc_w           "Aborting HDR+ shot."
        //  2923: sipush          2010
        //  2926: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //  2929: aload_0        
        //  2930: getfield        gqu.e:Ldvj;
        //  2933: aload           7
        //  2935: invokeinterface dvj.n:(Ldxh;)V
        //  2940: aload_0        
        //  2941: getfield        gqu.f:Ldva;
        //  2944: aload           7
        //  2946: getfield        dxh.c:Lgen;
        //  2949: getfield        gen.b:Lhhy;
        //  2952: invokeinterface hhy.h:()Lhim;
        //  2957: invokevirtual   dva.d:(Lhim;)V
        //  2960: goto            3207
        //  2963: astore_3       
        //  2964: aload           7
        //  2966: astore          4
        //  2968: iconst_1       
        //  2969: istore          13
        //  2971: aconst_null    
        //  2972: astore          12
        //  2974: aload_3        
        //  2975: astore          7
        //  2977: aload           4
        //  2979: astore_3       
        //  2980: aload           12
        //  2982: astore          4
        //  2984: goto            3288
        //  2987: astore          4
        //  2989: aload           7
        //  2991: astore_3       
        //  2992: aload           4
        //  2994: astore          7
        //  2996: goto            3079
        //  2999: astore          7
        //  3001: aload           12
        //  3003: astore_3       
        //  3004: goto            3060
        //  3007: astore          7
        //  3009: goto            3075
        //  3012: astore          6
        //  3014: aload           7
        //  3016: astore          10
        //  3018: aload           7
        //  3020: astore_3       
        //  3021: aload           5
        //  3023: invokevirtual   gqa.close:()V
        //  3026: aload           4
        //  3028: ifnull          3045
        //  3031: aload           7
        //  3033: astore          10
        //  3035: aload           7
        //  3037: astore_3       
        //  3038: aload           4
        //  3040: invokeinterface kvs.close:()V
        //  3045: aload           7
        //  3047: astore          10
        //  3049: aload           7
        //  3051: astore_3       
        //  3052: aload           6
        //  3054: athrow         
        //  3055: astore          7
        //  3057: aload           10
        //  3059: astore_3       
        //  3060: aload           9
        //  3062: astore          6
        //  3064: iconst_1       
        //  3065: istore          13
        //  3067: aconst_null    
        //  3068: astore          4
        //  3070: goto            3288
        //  3073: astore          7
        //  3075: aload           9
        //  3077: astore          6
        //  3079: aload           7
        //  3081: instanceof      Ldgf;
        //  3084: istore          19
        //  3086: iload           19
        //  3088: iconst_1       
        //  3089: ixor           
        //  3090: istore          13
        //  3092: iconst_1       
        //  3093: iload           19
        //  3095: if_icmpeq       3101
        //  3098: goto            3103
        //  3101: aconst_null    
        //  3102: astore_3       
        //  3103: getstatic       gqu.a:Lnsd;
        //  3106: astore          4
        //  3108: aload           4
        //  3110: invokevirtual   nry.b:()Lnsu;
        //  3113: checkcast       Lnsa;
        //  3116: aload           7
        //  3118: invokeinterface nsa.h:(Ljava/lang/Throwable;)Lnsu;
        //  3123: checkcast       Lnsa;
        //  3126: sipush          2011
        //  3129: invokeinterface nsa.E:(I)Lnsu;
        //  3134: checkcast       Lnsa;
        //  3137: ldc_w           "Error executing ZSl command, "
        //  3140: invokeinterface nsa.o:(Ljava/lang/String;)V
        //  3145: aload           5
        //  3147: invokevirtual   gqa.close:()V
        //  3150: aload           5
        //  3152: invokevirtual   gqa.b:()V
        //  3155: aload_3        
        //  3156: ifnull          3202
        //  3159: aload           4
        //  3161: invokevirtual   nry.c:()Lnsu;
        //  3164: ldc_w           "Aborting HDR+ shot."
        //  3167: sipush          2014
        //  3170: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //  3173: aload_0        
        //  3174: getfield        gqu.e:Ldvj;
        //  3177: aload_3        
        //  3178: invokeinterface dvj.n:(Ldxh;)V
        //  3183: aload_0        
        //  3184: getfield        gqu.f:Ldva;
        //  3187: aload_3        
        //  3188: getfield        dxh.c:Lgen;
        //  3191: getfield        gen.b:Lhhy;
        //  3194: invokeinterface hhy.h:()Lhim;
        //  3199: invokevirtual   dva.d:(Lhim;)V
        //  3202: iload           13
        //  3204: ifeq            3221
        //  3207: aload_0        
        //  3208: getfield        gqu.b:Lgfg;
        //  3211: aload           6
        //  3213: aload_1        
        //  3214: aload_2        
        //  3215: invokestatic    gqu.d:(Lgfg;Ljava/util/List;Lgff;Lgen;)V
        //  3218: goto            3255
        //  3221: aload_2        
        //  3222: getfield        gen.c:Lgem;
        //  3225: invokeinterface gem.f:()V
        //  3230: new             Ldgi;
        //  3233: dup            
        //  3234: aload           7
        //  3236: invokespecial   dgi.<init>:(Ljava/lang/Throwable;)V
        //  3239: astore          7
        //  3241: aload_2        
        //  3242: getfield        gen.b:Lhhy;
        //  3245: getstatic       iwx.a:Liwv;
        //  3248: aload           7
        //  3250: invokeinterface hhy.C:(Liwv;Ljava/lang/Throwable;)V
        //  3255: aload_0        
        //  3256: getfield        gqu.i:Lkse;
        //  3259: invokeinterface kse.g:()V
        //  3264: goto            3501
        //  3267: astore          12
        //  3269: aload           7
        //  3271: astore          4
        //  3273: aload           12
        //  3275: astore          7
        //  3277: goto            3288
        //  3280: astore          7
        //  3282: iconst_1       
        //  3283: istore          13
        //  3285: aconst_null    
        //  3286: astore          4
        //  3288: aload           5
        //  3290: invokevirtual   gqa.close:()V
        //  3293: aload           5
        //  3295: invokevirtual   gqa.b:()V
        //  3298: aload_3        
        //  3299: ifnull          3346
        //  3302: getstatic       gqu.a:Lnsd;
        //  3305: invokevirtual   nry.c:()Lnsu;
        //  3308: ldc_w           "Aborting HDR+ shot."
        //  3311: sipush          2017
        //  3314: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //  3317: aload_0        
        //  3318: getfield        gqu.e:Ldvj;
        //  3321: aload_3        
        //  3322: invokeinterface dvj.n:(Ldxh;)V
        //  3327: aload_0        
        //  3328: getfield        gqu.f:Ldva;
        //  3331: aload_3        
        //  3332: getfield        dxh.c:Lgen;
        //  3335: getfield        gen.b:Lhhy;
        //  3338: invokeinterface hhy.h:()Lhim;
        //  3343: invokevirtual   dva.d:(Lhim;)V
        //  3346: iload           13
        //  3348: ifne            3405
        //  3351: aload_2        
        //  3352: getfield        gen.c:Lgem;
        //  3355: invokeinterface gem.f:()V
        //  3360: aload           4
        //  3362: ifnull          3378
        //  3365: new             Ldgi;
        //  3368: dup            
        //  3369: aload           4
        //  3371: invokespecial   dgi.<init>:(Ljava/lang/Throwable;)V
        //  3374: astore_1       
        //  3375: goto            3389
        //  3378: new             Ldgi;
        //  3381: dup            
        //  3382: ldc_w           "Image capture failed. Aborting capture!"
        //  3385: invokespecial   dgi.<init>:(Ljava/lang/String;)V
        //  3388: astore_1       
        //  3389: aload_2        
        //  3390: getfield        gen.b:Lhhy;
        //  3393: getstatic       iwx.a:Liwv;
        //  3396: aload_1        
        //  3397: invokeinterface hhy.C:(Liwv;Ljava/lang/Throwable;)V
        //  3402: goto            3416
        //  3405: aload_0        
        //  3406: getfield        gqu.b:Lgfg;
        //  3409: aload           6
        //  3411: aload_1        
        //  3412: aload_2        
        //  3413: invokestatic    gqu.d:(Lgfg;Ljava/util/List;Lgff;Lgen;)V
        //  3416: aload_0        
        //  3417: getfield        gqu.i:Lkse;
        //  3420: invokeinterface kse.g:()V
        //  3425: aload           7
        //  3427: athrow         
        //  3428: aload           5
        //  3430: invokevirtual   gqa.a:()I
        //  3433: ifne            3451
        //  3436: getstatic       gqu.a:Lnsd;
        //  3439: invokevirtual   nry.c:()Lnsu;
        //  3442: ldc_w           "No ZSL frames found."
        //  3445: sipush          2007
        //  3448: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //  3451: aload           8
        //  3453: ifnonnull       3471
        //  3456: getstatic       gqu.a:Lnsd;
        //  3459: invokevirtual   nry.c:()Lnsu;
        //  3462: ldc_w           "No good metadata found."
        //  3465: sipush          2006
        //  3468: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //  3471: aload           5
        //  3473: invokevirtual   gqa.b:()V
        //  3476: aload_0        
        //  3477: getfield        gqu.b:Lgfg;
        //  3480: new             Ljava/util/ArrayList;
        //  3483: dup            
        //  3484: invokespecial   java/util/ArrayList.<init>:()V
        //  3487: aload_1        
        //  3488: aload_2        
        //  3489: invokestatic    gqu.d:(Lgfg;Ljava/util/List;Lgff;Lgen;)V
        //  3492: aload_0        
        //  3493: getfield        gqu.i:Lkse;
        //  3496: invokeinterface kse.g:()V
        //  3501: aload_1        
        //  3502: invokeinterface gff.close:()V
        //  3507: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  333    339    3073   3075   Ldgi;
        //  333    339    3055   3060   Any
        //  346    354    3073   3075   Ldgi;
        //  346    354    3055   3060   Any
        //  361    368    3073   3075   Ldgi;
        //  361    368    3055   3060   Any
        //  375    383    3073   3075   Ldgi;
        //  375    383    3055   3060   Any
        //  390    403    3073   3075   Ldgi;
        //  390    403    3055   3060   Any
        //  416    428    3073   3075   Ldgi;
        //  416    428    3055   3060   Any
        //  446    455    3073   3075   Ldgi;
        //  446    455    3055   3060   Any
        //  467    482    3073   3075   Ldgi;
        //  467    482    3055   3060   Any
        //  489    504    3073   3075   Ldgi;
        //  489    504    3055   3060   Any
        //  516    526    3073   3075   Ldgi;
        //  516    526    3055   3060   Any
        //  543    558    3073   3075   Ldgi;
        //  543    558    3055   3060   Any
        //  565    572    3073   3075   Ldgi;
        //  565    572    3055   3060   Any
        //  602    607    3073   3075   Ldgi;
        //  602    607    3055   3060   Any
        //  614    619    3073   3075   Ldgi;
        //  614    619    3055   3060   Any
        //  626    639    3073   3075   Ldgi;
        //  626    639    3055   3060   Any
        //  639    650    2714   2715   Ljava/lang/InterruptedException;
        //  639    650    2710   2714   Lkuw;
        //  639    650    2702   2710   Any
        //  650    670    2614   2619   Any
        //  675    693    2614   2619   Any
        //  697    702    1047   1049   Ljava/lang/InterruptedException;
        //  697    702    1042   1293   Any
        //  706    721    1047   1049   Ljava/lang/InterruptedException;
        //  706    721    1042   1293   Any
        //  725    730    1047   1049   Ljava/lang/InterruptedException;
        //  725    730    1042   1293   Any
        //  734    741    1047   1049   Ljava/lang/InterruptedException;
        //  734    741    1042   1293   Any
        //  748    758    1047   1049   Ljava/lang/InterruptedException;
        //  748    758    1042   1293   Any
        //  762    774    1047   1049   Ljava/lang/InterruptedException;
        //  762    774    1042   1293   Any
        //  778    785    1047   1049   Ljava/lang/InterruptedException;
        //  778    785    1042   1293   Any
        //  785    795    1033   1042   Ljava/lang/InterruptedException;
        //  785    795    1042   1293   Any
        //  800    823    1033   1042   Ljava/lang/InterruptedException;
        //  800    823    1042   1293   Any
        //  830    837    1033   1042   Ljava/lang/InterruptedException;
        //  830    837    1042   1293   Any
        //  837    847    1033   1042   Ljava/lang/InterruptedException;
        //  837    847    1042   1293   Any
        //  859    866    878    883    Any
        //  866    871    2614   2619   Any
        //  883    915    1033   1042   Ljava/lang/InterruptedException;
        //  883    915    1042   1293   Any
        //  920    963    1033   1042   Ljava/lang/InterruptedException;
        //  920    963    1042   1293   Any
        //  968    975    878    883    Any
        //  978    1013   1033   1042   Ljava/lang/InterruptedException;
        //  978    1013   1042   1293   Any
        //  1013   1023   1033   1042   Ljava/lang/InterruptedException;
        //  1013   1023   1042   1293   Any
        //  1023   1030   878    883    Any
        //  1049   1077   1042   1293   Any
        //  1077   1084   1276   1281   Any
        //  1084   1089   2614   2619   Any
        //  1097   1125   1249   1251   Any
        //  1142   1217   1249   1251   Any
        //  1221   1237   1244   1249   Any
        //  1281   1291   1291   1293   Any
        //  1293   1298   1301   1310   Any
        //  1303   1310   2606   2614   Any
        //  1310   1313   2606   2614   Any
        //  1313   1318   2606   2614   Any
        //  1336   1362   2579   2581   Any
        //  1362   1389   2574   2579   Any
        //  1389   1402   1410   1412   Ljava/util/concurrent/ExecutionException;
        //  1389   1402   1405   1410   Ljava/lang/InterruptedException;
        //  1389   1402   2574   2579   Any
        //  1412   1436   2574   2579   Any
        //  1436   1454   2574   2579   Any
        //  1454   1492   2533   2557   Any
        //  1497   1506   2533   2557   Any
        //  1535   1544   2533   2557   Any
        //  1544   1550   1597   1598   Ljava/lang/InterruptedException;
        //  1544   1550   1593   1597   Lkuw;
        //  1544   1550   1588   1593   Any
        //  1557   1562   3073   3075   Ldgi;
        //  1557   1562   3055   3060   Any
        //  1574   1581   3073   3075   Ldgi;
        //  1574   1581   3055   3060   Any
        //  1601   1608   2533   2557   Any
        //  1619   1629   2521   2533   Any
        //  1640   1653   2521   2533   Any
        //  1664   1677   2521   2533   Any
        //  1688   1705   2521   2533   Any
        //  1721   1728   2521   2533   Any
        //  1739   1749   2521   2533   Any
        //  1760   1772   2521   2533   Any
        //  1783   1796   2521   2533   Any
        //  1812   1818   2296   2312   Any
        //  1829   1838   2296   2312   Any
        //  1853   1863   2296   2312   Any
        //  1874   1886   2296   2312   Any
        //  1897   1910   2296   2312   Any
        //  1921   1930   2296   2312   Any
        //  1946   1956   2521   2533   Any
        //  1967   1972   2521   2533   Any
        //  1975   2035   2156   2158   Ljava/lang/InterruptedException;
        //  1975   2035   2151   2156   Any
        //  2035   2051   2082   2087   Ljava/lang/InterruptedException;
        //  2035   2051   2077   2082   Any
        //  2051   2061   2068   2077   Ljava/lang/InterruptedException;
        //  2051   2061   2240   2242   Any
        //  2087   2122   2146   2151   Ljava/lang/InterruptedException;
        //  2087   2122   2240   2242   Any
        //  2133   2143   2387   2399   Any
        //  2169   2207   2240   2242   Any
        //  2211   2221   2387   2399   Any
        //  2232   2237   2387   2399   Any
        //  2253   2263   2387   2399   Any
        //  2274   2279   2387   2399   Any
        //  2290   2293   2387   2399   Any
        //  2328   2335   2387   2399   Any
        //  2346   2363   2509   2521   Any
        //  2374   2384   2509   2521   Any
        //  2410   2420   2509   2521   Any
        //  2431   2452   2509   2521   Any
        //  2452   2458   2501   2502   Ljava/lang/InterruptedException;
        //  2452   2458   2497   2501   Lkuw;
        //  2452   2458   2492   2494   Any
        //  2465   2470   3007   3012   Ldgi;
        //  2465   2470   2999   3007   Any
        //  2482   2489   3007   3012   Ldgi;
        //  2482   2489   2999   3007   Any
        //  2637   2644   2647   2655   Any
        //  2649   2655   2665   2669   Ljava/lang/InterruptedException;
        //  2649   2655   2661   2665   Lkuw;
        //  2649   2655   2657   2661   Any
        //  2655   2657   2665   2669   Ljava/lang/InterruptedException;
        //  2655   2657   2661   2665   Lkuw;
        //  2655   2657   2657   2661   Any
        //  2722   2768   3012   3014   Any
        //  2768   2793   3012   3014   Any
        //  2803   2808   3007   3012   Ldgi;
        //  2803   2808   2999   3007   Any
        //  2820   2827   3007   3012   Ldgi;
        //  2820   2827   2999   3007   Any
        //  2834   2843   3007   3012   Ldgi;
        //  2834   2843   2999   3007   Any
        //  2843   2890   2987   2999   Ldgi;
        //  2843   2890   2963   2987   Any
        //  3021   3026   3073   3075   Ldgi;
        //  3021   3026   3055   3060   Any
        //  3038   3045   3073   3075   Ldgi;
        //  3038   3045   3055   3060   Any
        //  3052   3055   3073   3075   Ldgi;
        //  3052   3055   3055   3060   Any
        //  3079   3086   3280   3288   Any
        //  3103   3145   3267   3280   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1463, Size: 1463
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
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
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.b("fallback", this.b);
        return c.toString();
    }
}
