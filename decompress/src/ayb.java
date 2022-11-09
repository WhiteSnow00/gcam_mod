import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ayb implements Runnable, Comparable, axv, bja
{
    private boolean A;
    private int B;
    private int C;
    public final axx a;
    public final axz b;
    public final aya c;
    public auk d;
    public awc e;
    public auo f;
    public int g;
    public int h;
    public ayg i;
    public awg j;
    public axy k;
    public int l;
    public boolean m;
    public awc n;
    public volatile axw o;
    public volatile boolean p;
    public int q;
    public final ayl r;
    private final List s;
    private final bjd t;
    private final hp u;
    private Thread v;
    private awc w;
    private Object x;
    private awp y;
    private volatile boolean z;
    
    public ayb(final ayl r, final hp u) {
        this.a = new axx();
        this.s = new ArrayList();
        this.t = bjd.a();
        this.b = new axz();
        this.c = new aya();
        this.r = r;
        this.u = u;
    }
    
    private final int g() {
        return this.f.ordinal();
    }
    
    private final axw h() {
        final int b = this.B;
        if (b == 0) {
            throw null;
        }
        switch (b - 1) {
            default: {
                final String a = bbe.a(b);
                final StringBuilder sb = new StringBuilder(a.length() + 20);
                sb.append("Unrecognized stage: ");
                sb.append(a);
                throw new IllegalStateException(sb.toString());
            }
            case 5: {
                return null;
            }
            case 3: {
                return new azg(this.a, this);
            }
            case 2: {
                final axx a2 = this.a;
                return new axs(a2.e(), a2, this);
            }
            case 1: {
                return new azb(this.a, this);
            }
        }
    }
    
    private final void i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        ayb.y:Lawp;
        //     4: astore_1       
        //     5: aload_0        
        //     6: getfield        ayb.x:Ljava/lang/Object;
        //     9: astore_2       
        //    10: aload_0        
        //    11: getfield        ayb.C:I
        //    14: istore_3       
        //    15: aload_2        
        //    16: ifnonnull       31
        //    19: aload_1        
        //    20: invokeinterface awp.d:()V
        //    25: aconst_null    
        //    26: astore          4
        //    28: goto            1048
        //    31: invokestatic    bio.b:()J
        //    34: pop2           
        //    35: aload_0        
        //    36: getfield        ayb.a:Laxx;
        //    39: aload_2        
        //    40: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    43: invokevirtual   axx.b:(Ljava/lang/Class;)Layy;
        //    46: astore          5
        //    48: aload_0        
        //    49: getfield        ayb.j:Lawg;
        //    52: astore          6
        //    54: iload_3        
        //    55: iconst_4       
        //    56: if_icmpeq       81
        //    59: aload_0        
        //    60: getfield        ayb.a:Laxx;
        //    63: getfield        axx.q:Z
        //    66: ifeq            75
        //    69: iconst_1       
        //    70: istore          7
        //    72: goto            84
        //    75: iconst_0       
        //    76: istore          7
        //    78: goto            84
        //    81: iconst_1       
        //    82: istore          7
        //    84: aload           6
        //    86: getstatic       bdw.d:Lawf;
        //    89: invokevirtual   awg.b:(Lawf;)Ljava/lang/Object;
        //    92: checkcast       Ljava/lang/Boolean;
        //    95: astore          8
        //    97: iload           7
        //    99: istore          9
        //   101: aload           8
        //   103: ifnull          129
        //   106: aload           6
        //   108: astore          4
        //   110: aload           8
        //   112: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   115: ifeq            161
        //   118: iload           7
        //   120: ifeq            126
        //   123: goto            165
        //   126: iconst_0       
        //   127: istore          9
        //   129: new             Lawg;
        //   132: astore          4
        //   134: aload           4
        //   136: invokespecial   awg.<init>:()V
        //   139: aload           4
        //   141: aload_0        
        //   142: getfield        ayb.j:Lawg;
        //   145: invokevirtual   awg.c:(Lawg;)V
        //   148: aload           4
        //   150: getstatic       bdw.d:Lawf;
        //   153: iload           9
        //   155: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   158: invokevirtual   awg.d:(Lawf;Ljava/lang/Object;)V
        //   161: aload           4
        //   163: astore          6
        //   165: aload_0        
        //   166: getfield        ayb.d:Lauk;
        //   169: getfield        auk.c:Lauu;
        //   172: aload_2        
        //   173: invokevirtual   auu.a:(Ljava/lang/Object;)Lawr;
        //   176: astore          10
        //   178: aload_0        
        //   179: getfield        ayb.g:I
        //   182: istore          11
        //   184: aload_0        
        //   185: getfield        ayb.h:I
        //   188: istore          12
        //   190: aload           5
        //   192: getfield        ayy.a:Lhp;
        //   195: invokeinterface hp.a:()Ljava/lang/Object;
        //   200: checkcast       Ljava/util/List;
        //   203: astore          4
        //   205: aload           4
        //   207: invokestatic    bit.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   210: pop            
        //   211: aload           4
        //   213: astore          8
        //   215: aload           5
        //   217: getfield        ayy.b:Ljava/util/List;
        //   220: invokeinterface java/util/List.size:()I
        //   225: istore          13
        //   227: iconst_0       
        //   228: istore          14
        //   230: aconst_null    
        //   231: astore_2       
        //   232: iload           14
        //   234: iload           13
        //   236: if_icmpge       874
        //   239: aload           4
        //   241: astore          8
        //   243: aload           5
        //   245: getfield        ayy.b:Ljava/util/List;
        //   248: iload           14
        //   250: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   255: checkcast       Layc;
        //   258: astore          15
        //   260: aload           4
        //   262: astore          8
        //   264: aload           15
        //   266: getfield        ayc.b:Lhp;
        //   269: invokeinterface hp.a:()Ljava/lang/Object;
        //   274: checkcast       Ljava/util/List;
        //   277: astore          16
        //   279: aload           4
        //   281: astore          8
        //   283: aload           16
        //   285: invokestatic    bit.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   288: pop            
        //   289: aload           4
        //   291: astore          8
        //   293: aload           15
        //   295: aload           10
        //   297: iload           11
        //   299: iload           12
        //   301: aload           6
        //   303: aload           16
        //   305: invokevirtual   ayc.a:(Lawr;IILawg;Ljava/util/List;)Laza;
        //   308: astore          17
        //   310: aload           15
        //   312: getfield        ayc.b:Lhp;
        //   315: aload           16
        //   317: invokeinterface hp.b:(Ljava/lang/Object;)Z
        //   322: pop            
        //   323: aload           17
        //   325: invokeinterface aza.c:()Ljava/lang/Object;
        //   330: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   333: astore          18
        //   335: iload_3        
        //   336: iconst_4       
        //   337: if_icmpeq       377
        //   340: aload_0        
        //   341: getfield        ayb.a:Laxx;
        //   344: aload           18
        //   346: invokevirtual   axx.a:(Ljava/lang/Class;)Lawk;
        //   349: astore          19
        //   351: aload           19
        //   353: aload_0        
        //   354: getfield        ayb.d:Lauk;
        //   357: aload           17
        //   359: aload_0        
        //   360: getfield        ayb.g:I
        //   363: aload_0        
        //   364: getfield        ayb.h:I
        //   367: invokeinterface awk.b:(Landroid/content/Context;Laza;II)Laza;
        //   372: astore          16
        //   374: goto            384
        //   377: aload           17
        //   379: astore          16
        //   381: aconst_null    
        //   382: astore          19
        //   384: aload           17
        //   386: aload           16
        //   388: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   391: ifne            401
        //   394: aload           17
        //   396: invokeinterface aza.e:()V
        //   401: aload_0        
        //   402: getfield        ayb.a:Laxx;
        //   405: getfield        axx.c:Lauk;
        //   408: getfield        auk.c:Lauu;
        //   411: getfield        auu.d:Lbhe;
        //   414: aload           16
        //   416: invokeinterface aza.b:()Ljava/lang/Class;
        //   421: invokevirtual   bhe.a:(Ljava/lang/Class;)Lawj;
        //   424: ifnull          489
        //   427: aload_0        
        //   428: getfield        ayb.a:Laxx;
        //   431: getfield        axx.c:Lauk;
        //   434: getfield        auk.c:Lauu;
        //   437: getfield        auu.d:Lbhe;
        //   440: aload           16
        //   442: invokeinterface aza.b:()Ljava/lang/Class;
        //   447: invokevirtual   bhe.a:(Ljava/lang/Class;)Lawj;
        //   450: astore          17
        //   452: aload           17
        //   454: ifnull          469
        //   457: aload           17
        //   459: invokeinterface awj.b:()I
        //   464: istore          20
        //   466: goto            495
        //   469: new             Laus;
        //   472: astore          17
        //   474: aload           17
        //   476: aload           16
        //   478: invokeinterface aza.b:()Ljava/lang/Class;
        //   483: invokespecial   aus.<init>:(Ljava/lang/Class;)V
        //   486: aload           17
        //   488: athrow         
        //   489: iconst_3       
        //   490: istore          20
        //   492: aconst_null    
        //   493: astore          17
        //   495: aload_0        
        //   496: getfield        ayb.a:Laxx;
        //   499: astore          21
        //   501: aload_0        
        //   502: getfield        ayb.n:Lawc;
        //   505: astore          22
        //   507: aload           21
        //   509: invokevirtual   axx.f:()Ljava/util/List;
        //   512: astore          21
        //   514: aload           21
        //   516: invokeinterface java/util/List.size:()I
        //   521: istore          23
        //   523: iconst_0       
        //   524: istore          24
        //   526: iload           24
        //   528: iload           23
        //   530: if_icmpge       570
        //   533: aload           21
        //   535: iload           24
        //   537: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   542: checkcast       Lbbv;
        //   545: getfield        bbv.a:Lawc;
        //   548: aload           22
        //   550: invokeinterface awc.equals:(Ljava/lang/Object;)Z
        //   555: ifeq            564
        //   558: iconst_1       
        //   559: istore          23
        //   561: goto            573
        //   564: iinc            24, 1
        //   567: goto            526
        //   570: iconst_0       
        //   571: istore          23
        //   573: aload_0        
        //   574: getfield        ayb.i:Layg;
        //   577: iload           23
        //   579: iconst_1       
        //   580: ixor           
        //   581: iload_3        
        //   582: iload           20
        //   584: invokevirtual   ayg.d:(ZII)Z
        //   587: ifeq            764
        //   590: aload           17
        //   592: ifnull          741
        //   595: iload           20
        //   597: iconst_1       
        //   598: isub           
        //   599: tableswitch {
        //                0: 624
        //          default: 616
        //        }
        //   616: new             Lazc;
        //   619: astore          22
        //   621: goto            644
        //   624: new             Laxt;
        //   627: dup            
        //   628: aload_0        
        //   629: getfield        ayb.n:Lawc;
        //   632: aload_0        
        //   633: getfield        ayb.e:Lawc;
        //   636: invokespecial   axt.<init>:(Lawc;Lawc;)V
        //   639: astore          19
        //   641: goto            704
        //   644: aload_0        
        //   645: getfield        ayb.a:Laxx;
        //   648: invokevirtual   axx.c:()Lazi;
        //   651: astore          25
        //   653: aload_0        
        //   654: getfield        ayb.n:Lawc;
        //   657: astore          26
        //   659: aload_0        
        //   660: getfield        ayb.e:Lawc;
        //   663: astore          21
        //   665: aload_0        
        //   666: getfield        ayb.g:I
        //   669: istore          23
        //   671: aload_0        
        //   672: getfield        ayb.h:I
        //   675: istore          20
        //   677: aload           22
        //   679: aload           25
        //   681: aload           26
        //   683: aload           21
        //   685: iload           23
        //   687: iload           20
        //   689: aload           19
        //   691: aload           18
        //   693: aload_0        
        //   694: getfield        ayb.j:Lawg;
        //   697: invokespecial   azc.<init>:(Lazi;Lawc;Lawc;IILawk;Ljava/lang/Class;Lawg;)V
        //   700: aload           22
        //   702: astore          19
        //   704: aload           16
        //   706: invokestatic    ayz.d:(Laza;)Layz;
        //   709: astore          16
        //   711: aload_0        
        //   712: getfield        ayb.b:Laxz;
        //   715: astore          22
        //   717: aload           22
        //   719: aload           19
        //   721: putfield        axz.a:Lawc;
        //   724: aload           22
        //   726: aload           17
        //   728: putfield        axz.b:Lawj;
        //   731: aload           22
        //   733: aload           16
        //   735: putfield        axz.c:Layz;
        //   738: goto            764
        //   741: new             Laus;
        //   744: astore          17
        //   746: aload           17
        //   748: aload           16
        //   750: invokeinterface aza.c:()Ljava/lang/Object;
        //   755: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   758: invokespecial   aus.<init>:(Ljava/lang/Class;)V
        //   761: aload           17
        //   763: athrow         
        //   764: aload           15
        //   766: getfield        ayc.a:Lbfy;
        //   769: aload           16
        //   771: aload           6
        //   773: invokeinterface bfy.a:(Laza;Lawg;)Laza;
        //   778: astore          16
        //   780: aload           8
        //   782: astore          4
        //   784: aload           16
        //   786: astore          8
        //   788: goto            854
        //   791: astore          8
        //   793: goto            829
        //   796: astore          17
        //   798: aload           15
        //   800: getfield        ayc.b:Lhp;
        //   803: aload           16
        //   805: invokeinterface hp.b:(Ljava/lang/Object;)Z
        //   810: pop            
        //   811: aload           17
        //   813: athrow         
        //   814: astore_2       
        //   815: aload           8
        //   817: astore          4
        //   819: goto            979
        //   822: astore          8
        //   824: goto            829
        //   827: astore          8
        //   829: aload           4
        //   831: astore          16
        //   833: aload           16
        //   835: astore          4
        //   837: aload           16
        //   839: aload           8
        //   841: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   846: pop            
        //   847: aload_2        
        //   848: astore          8
        //   850: aload           16
        //   852: astore          4
        //   854: aload           8
        //   856: ifnull          865
        //   859: aload           4
        //   861: astore_2       
        //   862: goto            880
        //   865: iinc            14, 1
        //   868: aload           8
        //   870: astore_2       
        //   871: goto            232
        //   874: aload_2        
        //   875: astore          8
        //   877: aload           4
        //   879: astore_2       
        //   880: aload           8
        //   882: ifnull          917
        //   885: aload           5
        //   887: getfield        ayy.a:Lhp;
        //   890: aload_2        
        //   891: invokeinterface hp.b:(Ljava/lang/Object;)Z
        //   896: pop            
        //   897: aload           10
        //   899: invokeinterface awr.b:()V
        //   904: aload_1        
        //   905: invokeinterface awp.d:()V
        //   910: aload           8
        //   912: astore          4
        //   914: goto            28
        //   917: aload_2        
        //   918: astore          4
        //   920: new             Layv;
        //   923: astore          8
        //   925: aload_2        
        //   926: astore          4
        //   928: aload           5
        //   930: getfield        ayy.c:Ljava/lang/String;
        //   933: astore          6
        //   935: aload_2        
        //   936: astore          4
        //   938: new             Ljava/util/ArrayList;
        //   941: astore          16
        //   943: aload_2        
        //   944: astore          4
        //   946: aload           16
        //   948: aload_2        
        //   949: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   952: aload_2        
        //   953: astore          4
        //   955: aload           8
        //   957: aload           6
        //   959: aload           16
        //   961: invokespecial   ayv.<init>:(Ljava/lang/String;Ljava/util/List;)V
        //   964: aload_2        
        //   965: astore          4
        //   967: aload           8
        //   969: athrow         
        //   970: astore_2       
        //   971: goto            979
        //   974: astore_2       
        //   975: aload           8
        //   977: astore          4
        //   979: aload           5
        //   981: getfield        ayy.a:Lhp;
        //   984: aload           4
        //   986: invokeinterface hp.b:(Ljava/lang/Object;)Z
        //   991: pop            
        //   992: aload_2        
        //   993: athrow         
        //   994: astore          4
        //   996: aload           10
        //   998: invokeinterface awr.b:()V
        //  1003: aload           4
        //  1005: athrow         
        //  1006: astore          4
        //  1008: aload_1        
        //  1009: invokeinterface awp.d:()V
        //  1014: aload           4
        //  1016: athrow         
        //  1017: astore          4
        //  1019: aload           4
        //  1021: aload_0        
        //  1022: getfield        ayb.w:Lawc;
        //  1025: aload_0        
        //  1026: getfield        ayb.C:I
        //  1029: aconst_null    
        //  1030: invokevirtual   ayv.b:(Lawc;ILjava/lang/Class;)V
        //  1033: aload_0        
        //  1034: getfield        ayb.s:Ljava/util/List;
        //  1037: aload           4
        //  1039: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1044: pop            
        //  1045: aconst_null    
        //  1046: astore          4
        //  1048: aconst_null    
        //  1049: astore_2       
        //  1050: aload           4
        //  1052: ifnull          1640
        //  1055: aload_0        
        //  1056: getfield        ayb.C:I
        //  1059: istore          12
        //  1061: aload           4
        //  1063: instanceof      Layw;
        //  1066: ifeq            1079
        //  1069: aload           4
        //  1071: checkcast       Layw;
        //  1074: invokeinterface ayw.d:()V
        //  1079: aload_0        
        //  1080: getfield        ayb.b:Laxz;
        //  1083: invokevirtual   axz.a:()Z
        //  1086: ifeq            1102
        //  1089: aload           4
        //  1091: invokestatic    ayz.d:(Laza;)Layz;
        //  1094: astore          4
        //  1096: aload           4
        //  1098: astore_2       
        //  1099: goto            1102
        //  1102: aload_0        
        //  1103: invokespecial   ayb.l:()V
        //  1106: aload_0        
        //  1107: getfield        ayb.k:Laxy;
        //  1110: astore          8
        //  1112: aload           8
        //  1114: monitorenter   
        //  1115: aload           8
        //  1117: checkcast       Layr;
        //  1120: aload           4
        //  1122: putfield        ayr.f:Laza;
        //  1125: aload           8
        //  1127: checkcast       Layr;
        //  1130: iload           12
        //  1132: putfield        ayr.l:I
        //  1135: aload           8
        //  1137: monitorexit    
        //  1138: aload           8
        //  1140: monitorenter   
        //  1141: aload           8
        //  1143: checkcast       Layr;
        //  1146: getfield        ayr.b:Lbjd;
        //  1149: invokevirtual   bjd.b:()V
        //  1152: aload           8
        //  1154: checkcast       Layr;
        //  1157: getfield        ayr.k:Z
        //  1160: ifeq            1190
        //  1163: aload           8
        //  1165: checkcast       Layr;
        //  1168: getfield        ayr.f:Laza;
        //  1171: invokeinterface aza.e:()V
        //  1176: aload           8
        //  1178: checkcast       Layr;
        //  1181: invokevirtual   ayr.e:()V
        //  1184: aload           8
        //  1186: monitorexit    
        //  1187: goto            1447
        //  1190: aload           8
        //  1192: checkcast       Layr;
        //  1195: getfield        ayr.a:Layq;
        //  1198: invokevirtual   ayq.e:()Z
        //  1201: ifne            1603
        //  1204: aload           8
        //  1206: checkcast       Layr;
        //  1209: getfield        ayr.g:Z
        //  1212: ifne            1587
        //  1215: aload           8
        //  1217: checkcast       Layr;
        //  1220: getfield        ayr.f:Laza;
        //  1223: astore          17
        //  1225: aload           8
        //  1227: checkcast       Layr;
        //  1230: getfield        ayr.d:Z
        //  1233: istore          7
        //  1235: aload           8
        //  1237: checkcast       Layr;
        //  1240: getfield        ayr.c:Lawc;
        //  1243: astore          6
        //  1245: aload           8
        //  1247: checkcast       Layr;
        //  1250: getfield        ayr.m:Layn;
        //  1253: astore          16
        //  1255: new             Layt;
        //  1258: astore          4
        //  1260: aload           4
        //  1262: aload           17
        //  1264: iload           7
        //  1266: aload           6
        //  1268: aload           16
        //  1270: invokespecial   ayt.<init>:(Laza;ZLawc;Layn;)V
        //  1273: aload           8
        //  1275: checkcast       Layr;
        //  1278: aload           4
        //  1280: putfield        ayr.j:Layt;
        //  1283: aload           8
        //  1285: checkcast       Layr;
        //  1288: iconst_1       
        //  1289: putfield        ayr.g:Z
        //  1292: aload           8
        //  1294: checkcast       Layr;
        //  1297: getfield        ayr.a:Layq;
        //  1300: invokevirtual   ayq.c:()Layq;
        //  1303: astore          4
        //  1305: aload           4
        //  1307: invokevirtual   ayq.a:()I
        //  1310: istore          12
        //  1312: aload           8
        //  1314: checkcast       Layr;
        //  1317: iload           12
        //  1319: iconst_1       
        //  1320: iadd           
        //  1321: invokevirtual   ayr.d:(I)V
        //  1324: aload           8
        //  1326: checkcast       Layr;
        //  1329: getfield        ayr.c:Lawc;
        //  1332: astore          16
        //  1334: aload           8
        //  1336: checkcast       Layr;
        //  1339: getfield        ayr.j:Layt;
        //  1342: astore          6
        //  1344: aload           8
        //  1346: monitorexit    
        //  1347: aload           8
        //  1349: checkcast       Layr;
        //  1352: getfield        ayr.n:Layn;
        //  1355: aload           8
        //  1357: checkcast       Layr;
        //  1360: aload           16
        //  1362: aload           6
        //  1364: invokevirtual   ayn.b:(Layr;Lawc;Layt;)V
        //  1367: aload           4
        //  1369: invokevirtual   ayq.iterator:()Ljava/util/Iterator;
        //  1372: astore          4
        //  1374: aload           4
        //  1376: invokeinterface java/util/Iterator.hasNext:()Z
        //  1381: ifeq            1439
        //  1384: aload           4
        //  1386: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1391: checkcast       Layp;
        //  1394: astore          17
        //  1396: aload           17
        //  1398: getfield        ayp.b:Ljava/util/concurrent/Executor;
        //  1401: astore          6
        //  1403: new             Layo;
        //  1406: astore          16
        //  1408: aload           17
        //  1410: getfield        ayp.a:Lbhp;
        //  1413: astore          17
        //  1415: aload           16
        //  1417: aload           8
        //  1419: checkcast       Layr;
        //  1422: aload           17
        //  1424: invokespecial   ayo.<init>:(Layr;Lbhp;)V
        //  1427: aload           6
        //  1429: aload           16
        //  1431: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
        //  1436: goto            1374
        //  1439: aload           8
        //  1441: checkcast       Layr;
        //  1444: invokevirtual   ayr.c:()V
        //  1447: aload_0        
        //  1448: iconst_5       
        //  1449: putfield        ayb.B:I
        //  1452: aload_0        
        //  1453: getfield        ayb.b:Laxz;
        //  1456: invokevirtual   axz.a:()Z
        //  1459: ifeq            1551
        //  1462: aload_0        
        //  1463: getfield        ayb.b:Laxz;
        //  1466: astore          4
        //  1468: aload_0        
        //  1469: getfield        ayb.r:Layl;
        //  1472: astore          16
        //  1474: aload_0        
        //  1475: getfield        ayb.j:Lawg;
        //  1478: astore          8
        //  1480: aload           16
        //  1482: invokevirtual   ayl.a:()Lazz;
        //  1485: astore          6
        //  1487: aload           4
        //  1489: getfield        axz.a:Lawc;
        //  1492: astore          16
        //  1494: new             Laxu;
        //  1497: astore          17
        //  1499: aload           17
        //  1501: aload           4
        //  1503: getfield        axz.b:Lawj;
        //  1506: aload           4
        //  1508: getfield        axz.c:Layz;
        //  1511: aload           8
        //  1513: invokespecial   axu.<init>:(Lavr;Ljava/lang/Object;Lawg;)V
        //  1516: aload           6
        //  1518: aload           16
        //  1520: aload           17
        //  1522: invokeinterface azz.b:(Lawc;Laxu;)V
        //  1527: aload           4
        //  1529: getfield        axz.c:Layz;
        //  1532: invokevirtual   ayz.f:()V
        //  1535: goto            1551
        //  1538: astore          8
        //  1540: aload           4
        //  1542: getfield        axz.c:Layz;
        //  1545: invokevirtual   ayz.f:()V
        //  1548: aload           8
        //  1550: athrow         
        //  1551: aload_2        
        //  1552: ifnull          1559
        //  1555: aload_2        
        //  1556: invokevirtual   ayz.f:()V
        //  1559: aload_0        
        //  1560: getfield        ayb.c:Laya;
        //  1563: invokevirtual   aya.b:()Z
        //  1566: ifeq            1573
        //  1569: aload_0        
        //  1570: invokevirtual   ayb.c:()V
        //  1573: return         
        //  1574: astore          4
        //  1576: aload_2        
        //  1577: ifnull          1584
        //  1580: aload_2        
        //  1581: invokevirtual   ayz.f:()V
        //  1584: aload           4
        //  1586: athrow         
        //  1587: new             Ljava/lang/IllegalStateException;
        //  1590: astore          4
        //  1592: aload           4
        //  1594: ldc_w           "Already have resource"
        //  1597: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1600: aload           4
        //  1602: athrow         
        //  1603: new             Ljava/lang/IllegalStateException;
        //  1606: astore          4
        //  1608: aload           4
        //  1610: ldc_w           "Received a resource without any callbacks to notify"
        //  1613: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1616: aload           4
        //  1618: athrow         
        //  1619: astore          4
        //  1621: aload           8
        //  1623: monitorexit    
        //  1624: aload           4
        //  1626: athrow         
        //  1627: astore          4
        //  1629: aload           8
        //  1631: monitorexit    
        //  1632: aload           4
        //  1634: athrow         
        //  1635: astore          4
        //  1637: aload           4
        //  1639: athrow         
        //  1640: aload_0        
        //  1641: invokespecial   ayb.k:()V
        //  1644: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type 
        //  -----  -----  -----  -----  -----
        //  0      15     1017   1048   Layv;
        //  19     25     1017   1048   Layv;
        //  31     54     1006   1017   Any
        //  59     69     1006   1017   Any
        //  84     97     1006   1017   Any
        //  110    118    1006   1017   Any
        //  129    161    1006   1017   Any
        //  165    178    1006   1017   Any
        //  178    211    994    1006   Any
        //  215    227    974    979    Any
        //  243    260    974    979    Any
        //  264    279    827    829    Layv;
        //  264    279    974    979    Any
        //  283    289    827    829    Layv;
        //  283    289    974    979    Any
        //  293    310    796    814    Any
        //  310    335    791    796    Layv;
        //  310    335    814    822    Any
        //  340    374    791    796    Layv;
        //  340    374    814    822    Any
        //  384    401    791    796    Layv;
        //  384    401    814    822    Any
        //  401    452    791    796    Layv;
        //  401    452    814    822    Any
        //  457    466    791    796    Layv;
        //  457    466    814    822    Any
        //  469    489    791    796    Layv;
        //  469    489    814    822    Any
        //  495    523    791    796    Layv;
        //  495    523    814    822    Any
        //  533    558    791    796    Layv;
        //  533    558    814    822    Any
        //  573    590    791    796    Layv;
        //  573    590    814    822    Any
        //  616    621    791    796    Layv;
        //  616    621    814    822    Any
        //  624    641    791    796    Layv;
        //  624    641    814    822    Any
        //  644    677    791    796    Layv;
        //  644    677    814    822    Any
        //  677    700    822    827    Layv;
        //  677    700    814    822    Any
        //  704    738    822    827    Layv;
        //  704    738    814    822    Any
        //  741    764    822    827    Layv;
        //  741    764    814    822    Any
        //  764    780    822    827    Layv;
        //  764    780    814    822    Any
        //  798    814    822    827    Layv;
        //  798    814    814    822    Any
        //  837    847    970    974    Any
        //  885    897    994    1006   Any
        //  897    904    1006   1017   Any
        //  904    910    1017   1048   Layv;
        //  920    925    970    974    Any
        //  928    935    970    974    Any
        //  938    943    970    974    Any
        //  946    952    970    974    Any
        //  955    964    970    974    Any
        //  967    970    970    974    Any
        //  979    994    994    1006   Any
        //  996    1006   1006   1017   Any
        //  1008   1017   1017   1048   Layv;
        //  1061   1079   1635   1640   Any
        //  1079   1096   1635   1640   Any
        //  1102   1115   1635   1640   Any
        //  1115   1138   1627   1635   Any
        //  1138   1141   1635   1640   Any
        //  1141   1187   1619   1627   Any
        //  1190   1347   1619   1627   Any
        //  1347   1374   1635   1640   Any
        //  1374   1436   1635   1640   Any
        //  1439   1447   1635   1640   Any
        //  1447   1452   1635   1640   Any
        //  1452   1480   1574   1587   Any
        //  1480   1527   1538   1551   Any
        //  1527   1535   1574   1587   Any
        //  1540   1551   1574   1587   Any
        //  1555   1559   1635   1640   Any
        //  1559   1573   1635   1640   Any
        //  1580   1584   1635   1640   Any
        //  1584   1587   1635   1640   Any
        //  1587   1603   1619   1627   Any
        //  1603   1619   1619   1627   Any
        //  1621   1624   1619   1627   Any
        //  1624   1627   1635   1640   Any
        //  1629   1632   1627   1635   Any
        //  1632   1635   1635   1640   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 714, Size: 714
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
    
    private final void j() {
        this.l();
        final ayv h = new ayv("Failed to load resource", new ArrayList(this.s));
        axy k = this.k;
        monitorenter(k);
        try {
            ((ayr)k).h = h;
            monitorexit(k);
            synchronized (k) {
                ((ayr)k).b.b();
                if (((ayr)k).k) {
                    ((ayr)k).e();
                    monitorexit(k);
                }
                else {
                    if (((ayr)k).a.e()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (((ayr)k).i) {
                        throw new IllegalStateException("Already failed once");
                    }
                    ((ayr)k).i = true;
                    final awc c = ((ayr)k).c;
                    final ayq c2 = ((ayr)k).a.c();
                    ((ayr)k).d(c2.a() + 1);
                    monitorexit(k);
                    k = k;
                    ((ayr)k).n.b((ayr)k, c, null);
                    for (final ayp ayp : c2) {
                        ayp.b.execute(new ayo((ayr)k, ayp.a, 1));
                    }
                    ((ayr)k).c();
                }
                if (this.c.c()) {
                    this.c();
                }
            }
        }
        finally {
            monitorexit(k);
            while (true) {}
        }
    }
    
    private final void k() {
        this.v = Thread.currentThread();
        bio.b();
        boolean c = false;
        do {
            boolean b = c;
            if (!this.p) {
                b = c;
                if (this.o != null) {
                    c = this.o.c();
                    if (!(b = c)) {
                        this.B = this.f(this.B);
                        this.o = this.h();
                        continue;
                    }
                }
            }
            if ((this.B == 6 || this.p) && !b) {
                this.j();
            }
            return;
        } while (this.B != 4);
        this.b();
    }
    
    private final void l() {
        this.t.b();
        if (this.z) {
            Throwable t;
            if (this.s.isEmpty()) {
                t = null;
            }
            else {
                final List s = this.s;
                t = (Throwable)s.get(s.size() - 1);
            }
            throw new IllegalStateException("Already notified", t);
        }
        this.z = true;
    }
    
    @Override
    public final bjd aK() {
        return this.t;
    }
    
    @Override
    public final void b() {
        this.q = 2;
        this.k.aJ(this);
    }
    
    public final void c() {
        this.c.a();
        final axz b = this.b;
        b.a = null;
        b.b = null;
        b.c = null;
        final axx a = this.a;
        a.c = null;
        a.d = null;
        a.m = null;
        a.g = null;
        a.j = null;
        a.h = null;
        a.n = null;
        a.i = null;
        a.o = null;
        a.a.clear();
        a.k = false;
        a.b.clear();
        a.l = false;
        this.z = false;
        this.d = null;
        this.e = null;
        this.j = null;
        this.f = null;
        this.k = null;
        this.B = 0;
        this.o = null;
        this.v = null;
        this.n = null;
        this.x = null;
        this.C = 0;
        this.y = null;
        this.p = false;
        this.s.clear();
        this.u.b(this);
    }
    
    @Override
    public final void d(final awc awc, final Exception ex, final awp awp, final int n) {
        awp.d();
        final ayv ayv = new ayv("Fetching data failed", Collections.singletonList(ex));
        ayv.b(awc, n, awp.a());
        this.s.add(ayv);
        if (Thread.currentThread() != this.v) {
            this.q = 2;
            this.k.aJ(this);
            return;
        }
        this.k();
    }
    
    @Override
    public final void e(final awc n, final Object x, final awp y, final int c, final awc w) {
        this.n = n;
        this.x = x;
        this.y = y;
        this.C = c;
        this.w = w;
        final List e = this.a.e();
        boolean a = false;
        if (n != e.get(0)) {
            a = true;
        }
        this.A = a;
        if (Thread.currentThread() == this.v) {
            try {
                this.i();
                return;
            }
            finally {}
        }
        this.q = 3;
        this.k.aJ(this);
    }
    
    public final int f(final int n) {
        if (n == 0) {
            throw null;
        }
        switch (n - 1) {
            default: {
                final String a = bbe.a(n);
                final StringBuilder sb = new StringBuilder(a.length() + 20);
                sb.append("Unrecognized stage: ");
                sb.append(a);
                throw new IllegalArgumentException(sb.toString());
            }
            case 3:
            case 5: {
                return 6;
            }
            case 2: {
                if (this.m) {
                    return 6;
                }
                return 4;
            }
            case 1: {
                if (this.i.a()) {
                    return 3;
                }
                return this.f(3);
            }
            case 0: {
                if (this.i.b()) {
                    return 2;
                }
                return this.f(2);
            }
        }
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        ayb.y:Lawp;
        //     4: astore_1       
        //     5: aload_0        
        //     6: getfield        ayb.p:Z
        //     9: ifeq            27
        //    12: aload_0        
        //    13: invokespecial   ayb.j:()V
        //    16: aload_1        
        //    17: ifnull          26
        //    20: aload_1        
        //    21: invokeinterface awp.d:()V
        //    26: return         
        //    27: aload_0        
        //    28: getfield        ayb.q:I
        //    31: istore_2       
        //    32: iload_2        
        //    33: ifeq            205
        //    36: iload_2        
        //    37: iconst_1       
        //    38: isub           
        //    39: tableswitch {
        //                0: 85
        //                1: 78
        //                2: 71
        //          default: 64
        //        }
        //    64: new             Ljava/lang/IllegalStateException;
        //    67: astore_3       
        //    68: goto            114
        //    71: aload_0        
        //    72: invokespecial   ayb.i:()V
        //    75: goto            106
        //    78: aload_0        
        //    79: invokespecial   ayb.k:()V
        //    82: goto            106
        //    85: aload_0        
        //    86: aload_0        
        //    87: iconst_1       
        //    88: invokevirtual   ayb.f:(I)I
        //    91: putfield        ayb.B:I
        //    94: aload_0        
        //    95: aload_0        
        //    96: invokespecial   ayb.h:()Laxw;
        //    99: putfield        ayb.o:Laxw;
        //   102: aload_0        
        //   103: invokespecial   ayb.k:()V
        //   106: aload_1        
        //   107: ifnull          113
        //   110: goto            20
        //   113: return         
        //   114: iload_2        
        //   115: tableswitch {
        //                2: 152
        //                3: 144
        //          default: 136
        //        }
        //   136: ldc_w           "DECODE_DATA"
        //   139: astore          4
        //   141: goto            157
        //   144: ldc_w           "SWITCH_TO_SOURCE_SERVICE"
        //   147: astore          4
        //   149: goto            157
        //   152: ldc_w           "INITIALIZE"
        //   155: astore          4
        //   157: aload           4
        //   159: invokevirtual   java/lang/String.length:()I
        //   162: istore_2       
        //   163: new             Ljava/lang/StringBuilder;
        //   166: astore          5
        //   168: aload           5
        //   170: iload_2        
        //   171: bipush          25
        //   173: iadd           
        //   174: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   177: aload           5
        //   179: ldc_w           "Unrecognized run reason: "
        //   182: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   185: pop            
        //   186: aload           5
        //   188: aload           4
        //   190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   193: pop            
        //   194: aload_3        
        //   195: aload           5
        //   197: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   200: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   203: aload_3        
        //   204: athrow         
        //   205: aconst_null    
        //   206: athrow         
        //   207: astore          4
        //   209: aload_0        
        //   210: getfield        ayb.B:I
        //   213: iconst_5       
        //   214: if_icmpeq       233
        //   217: aload_0        
        //   218: getfield        ayb.s:Ljava/util/List;
        //   221: aload           4
        //   223: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   228: pop            
        //   229: aload_0        
        //   230: invokespecial   ayb.j:()V
        //   233: aload_0        
        //   234: getfield        ayb.p:Z
        //   237: ifne            243
        //   240: aload           4
        //   242: athrow         
        //   243: aload           4
        //   245: athrow         
        //   246: astore          4
        //   248: aload           4
        //   250: athrow         
        //   251: astore          4
        //   253: aload_1        
        //   254: ifnull          263
        //   257: aload_1        
        //   258: invokeinterface awp.d:()V
        //   263: goto            269
        //   266: aload           4
        //   268: athrow         
        //   269: goto            266
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type 
        //  -----  -----  -----  -----  -----
        //  5      16     246    251    Laxr;
        //  5      16     207    246    Any
        //  27     32     246    251    Laxr;
        //  27     32     207    246    Any
        //  64     68     246    251    Laxr;
        //  64     68     207    246    Any
        //  71     75     246    251    Laxr;
        //  71     75     207    246    Any
        //  78     82     246    251    Laxr;
        //  78     82     207    246    Any
        //  85     106    246    251    Laxr;
        //  85     106    207    246    Any
        //  157    205    246    251    Laxr;
        //  157    205    207    246    Any
        //  205    207    246    251    Laxr;
        //  205    207    207    246    Any
        //  209    233    251    272    Any
        //  233    243    251    272    Any
        //  243    246    251    272    Any
        //  248    251    251    272    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0233:
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
