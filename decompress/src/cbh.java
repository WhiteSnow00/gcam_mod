import java.util.Iterator;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import j$.util.function.Consumer;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbh
{
    public static final nsd a;
    private final cid A;
    private final cfm B;
    private final Executor C;
    private final pii D;
    private final cqs E;
    private final cqn F;
    private final niz G;
    private cis H;
    private oey I;
    public final cfs b;
    public final kjm c;
    public final crg d;
    public final kse e;
    public final List f;
    public final jjb g;
    public final ivj h;
    public final igw i;
    public final hwj j;
    public final dfz k;
    public final ctr l;
    public final cxl m;
    final ivq n;
    public final eiq o;
    final eip p;
    public cce q;
    public cfg r;
    public boolean s;
    public boolean t;
    public cqv u;
    public final Object v;
    public final bmq w;
    public final crw x;
    public final crv y;
    private final cay z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/CamcorderController");
    }
    
    public cbh(final cfs b, final cay z, final cid a, final cfm b2, final Executor c, final bmq w, final pii d, final crg d2, final jjb g, final eiq o, final kjm c2, final kse e, final ivj h, final igw i, final hwj j, final cqs e2, final cqn f, final dfz k, final crv y, final crw x, final ctr l, final niz g2, final cxl m) {
        this.f = new ArrayList();
        this.n = new cbd(this);
        this.p = new cbe(this);
        this.v = new Object();
        this.z = z;
        this.A = a;
        this.B = b2;
        this.b = b;
        this.C = c;
        this.w = w;
        this.D = d;
        this.d = d2;
        this.g = g;
        this.o = o;
        this.c = c2;
        this.e = e;
        this.h = h;
        this.i = i;
        this.j = j;
        this.E = e2;
        this.F = f;
        this.k = k;
        this.y = y;
        this.x = x;
        this.l = l;
        this.G = g2;
        this.m = m;
    }
    
    private final void p() {
        synchronized (this.v) {
            final oey i = this.I;
            final int n = 1;
            if (i != null && !i.isDone()) {
                i.cancel(true);
            }
            this.I = null;
            if (this.q != null) {
                this.j.i(hwi.c);
                final cqv u = this.u;
                u.getClass();
                u.d(this.j.c(hwi.b, hwi.c));
                u.c(this.F.a());
                final cqs e = this.E;
                final cqv u2 = this.u;
                u2.getClass();
                final Integer a = u2.a;
                if (a == null || u2.b == null || u2.c == null || u2.d == null || u2.e == 0 || u2.f == 0) {
                    final StringBuilder sb = new StringBuilder();
                    if (u2.a == null) {
                        sb.append(" creationLatencyMs");
                    }
                    if (u2.b == null) {
                        sb.append(" sessionDurationMs");
                    }
                    if (u2.c == null) {
                        sb.append(" numRecordedSessions");
                    }
                    if (u2.d == null) {
                        sb.append(" cameraFacing");
                    }
                    if (u2.e == 0) {
                        sb.append(" sessionState");
                    }
                    if (u2.f == 0) {
                        sb.append(" sessionSource");
                    }
                    final String value = String.valueOf(sb);
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(value);
                    throw new IllegalStateException(sb2.toString());
                }
                final cqy cqy = new cqy(a, u2.b, u2.c, u2.d, u2.e, u2.f);
                final okt m = obq.h.m();
                final int a2 = cqy.a;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obq obq = (obq)m.b;
                final int a3 = obq.a | 0x1;
                obq.a = a3;
                obq.b = a2;
                final int b = cqy.b;
                final int a4 = a3 | 0x2;
                obq.a = a4;
                obq.c = b;
                final int c = cqy.c;
                obq.a = (a4 | 0x4);
                obq.d = c;
                final boolean e2 = cqy.d == lfu.a;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obq obq2 = (obq)m.b;
                final int a5 = obq2.a | 0x8;
                obq2.a = a5;
                obq2.e = e2;
                final int e3 = cqy.e;
                final clp a6 = clp.a;
                final kov a7 = kov.a;
                final jbm a8 = jbm.a;
                if (e3 == 0) {
                    throw null;
                }
                int n2 = 0;
                switch (e3 - 1) {
                    default: {
                        final String a9 = cqx.a(e3);
                        final StringBuilder sb3 = new StringBuilder(a9.length() + 27);
                        sb3.append("Not a valid session state: ");
                        sb3.append(a9);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    case 2: {
                        n2 = 3;
                        break;
                    }
                    case 1: {
                        n2 = 2;
                        break;
                    }
                    case 0: {
                        n2 = 1;
                        break;
                    }
                }
                obq2.f = n2 - 1;
                final int a10 = a5 | 0x10;
                obq2.a = a10;
                final int f = cqy.f;
                if (f == 0) {
                    throw null;
                }
                int n3 = 0;
                switch (f - 1) {
                    default: {
                        final String a11 = cqw.a(f);
                        final StringBuilder sb4 = new StringBuilder(a11.length() + 28);
                        sb4.append("Not a valid session source: ");
                        sb4.append(a11);
                        throw new IllegalArgumentException(sb4.toString());
                    }
                    case 6: {
                        n3 = 7;
                        break;
                    }
                    case 5: {
                        n3 = 6;
                        break;
                    }
                    case 4: {
                        n3 = 5;
                        break;
                    }
                    case 3: {
                        n3 = 4;
                        break;
                    }
                    case 2: {
                        n3 = 3;
                        break;
                    }
                    case 1: {
                        n3 = 2;
                        break;
                    }
                    case 0: {
                        n3 = n;
                        break;
                    }
                }
                obq2.g = n3 - 1;
                obq2.a = (a10 | 0x20);
                e.a.G((obq)m.h());
                this.u = null;
                this.q = null;
            }
            this.t = false;
            this.A.b(cic.b);
            this.A.b(cic.d);
            Collection$_EL.stream((Collection)this.f).forEach((Consumer)cbc.b);
            final cfg r = this.r;
            if (r != null) {
                r.a(cfd.d);
            }
        }
    }
    
    private final boolean q() {
        synchronized (this.v) {
            return this.q != null;
        }
    }
    
    private final void r(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: aload_2        
        //     3: getfield        cbh.v:Ljava/lang/Object;
        //     6: astore_3       
        //     7: aload_3        
        //     8: monitorenter   
        //     9: aload_2        
        //    10: getfield        cbh.r:Lcfg;
        //    13: getstatic       cfd.b:Lcfd;
        //    16: invokevirtual   cfg.a:(Lcfd;)V
        //    19: new             Lcqv;
        //    22: astore          4
        //    24: aload           4
        //    26: invokespecial   cqv.<init>:()V
        //    29: aload           4
        //    31: iconst_0       
        //    32: invokevirtual   cqv.b:(I)V
        //    35: aload           4
        //    37: iconst_0       
        //    38: invokevirtual   cqv.d:(I)V
        //    41: aload           4
        //    43: iconst_0       
        //    44: invokevirtual   cqv.c:(I)V
        //    47: aload           4
        //    49: getstatic       lfu.b:Llfu;
        //    52: invokevirtual   cqv.a:(Llfu;)V
        //    55: aload           4
        //    57: iconst_1       
        //    58: putfield        cqv.e:I
        //    61: aload           4
        //    63: iload_1        
        //    64: putfield        cqv.f:I
        //    67: aload           4
        //    69: aload_2        
        //    70: getfield        cbh.d:Lcrg;
        //    73: invokevirtual   crg.e:()Llfu;
        //    76: invokevirtual   cqv.a:(Llfu;)V
        //    79: aload_2        
        //    80: aload           4
        //    82: putfield        cbh.u:Lcqv;
        //    85: aload_2        
        //    86: getfield        cbh.e:Lkse;
        //    89: ldc_w           "CamcorderControllers#createCaptureSession"
        //    92: invokeinterface kse.f:(Ljava/lang/String;)V
        //    97: aload_2        
        //    98: getfield        cbh.j:Lhwj;
        //   101: invokevirtual   hwj.a:()V
        //   104: aload_2        
        //   105: getfield        cbh.j:Lhwj;
        //   108: getstatic       hwi.a:Lhwi;
        //   111: invokevirtual   hwh.i:(Ljava/lang/Enum;)V
        //   114: aload_2        
        //   115: getfield        cbh.f:Ljava/util/List;
        //   118: invokestatic    j$/util/Collection$_EL.stream:(Ljava/util/Collection;)Lj$/util/stream/Stream;
        //   121: getstatic       cbc.a:Lcbc;
        //   124: invokeinterface j$/util/stream/Stream.forEach:(Lj$/util/function/Consumer;)V
        //   129: aload_2        
        //   130: getfield        cbh.z:Lcay;
        //   133: astore_2       
        //   134: invokestatic    kjm.a:()V
        //   137: aload_2        
        //   138: getfield        cay.c:Lkse;
        //   141: ldc_w           "CamcorderCaptureSessionFactory#createNewSession"
        //   144: invokeinterface kse.a:(Ljava/lang/String;)Lksh;
        //   149: astore          5
        //   151: aload_2        
        //   152: getfield        cay.l:Lcbq;
        //   155: astore          6
        //   157: aload_2        
        //   158: getfield        cay.g:Lcfs;
        //   161: astore          7
        //   163: aload           6
        //   165: getfield        cbq.f:Lcfo;
        //   168: astore          4
        //   170: aload           4
        //   172: ifnull          184
        //   175: aload_2        
        //   176: astore          8
        //   178: aload           4
        //   180: astore_2       
        //   181: goto            3643
        //   184: aload           6
        //   186: getfield        cbq.g:Ljava/lang/Object;
        //   189: astore          9
        //   191: aload           9
        //   193: monitorenter   
        //   194: aload           6
        //   196: getfield        cbq.f:Lcfo;
        //   199: astore          4
        //   201: aload           4
        //   203: ifnull          218
        //   206: aload           9
        //   208: monitorexit    
        //   209: aload_2        
        //   210: astore          8
        //   212: aload           4
        //   214: astore_2       
        //   215: goto            3643
        //   218: aload           6
        //   220: getfield        cbq.b:Lcid;
        //   223: getstatic       cic.b:Lcic;
        //   226: invokevirtual   cid.a:(Lcic;)Lkjk;
        //   229: aload           6
        //   231: invokevirtual   kjk.c:(Lkrc;)V
        //   234: aload           7
        //   236: invokevirtual   cfs.b:()Llfj;
        //   239: astore          4
        //   241: aload           4
        //   243: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   246: pop            
        //   247: aload           7
        //   249: invokevirtual   cfs.c:()Llfj;
        //   252: astore          10
        //   254: aload           10
        //   256: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   259: pop            
        //   260: aload           7
        //   262: getfield        cfs.g:Lbmq;
        //   265: invokevirtual   bmq.a:()Landroid/content/Intent;
        //   268: astore          11
        //   270: aload           6
        //   272: getfield        cbq.h:Lcbn;
        //   275: getfield        cbn.a:Lcfb;
        //   278: astore          12
        //   280: aload           12
        //   282: getfield        cfb.b:Ljava/util/Map;
        //   285: aload           10
        //   287: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   292: ifeq            322
        //   295: aload           12
        //   297: getfield        cfb.b:Ljava/util/Map;
        //   300: aload           10
        //   302: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   307: checkcast       Lcfa;
        //   310: astore          13
        //   312: aload_2        
        //   313: astore          8
        //   315: aload           4
        //   317: astore          12
        //   319: goto            1251
        //   322: aload           12
        //   324: getfield        cfb.c:Llfw;
        //   327: aload           10
        //   329: invokevirtual   lfw.f:(Llfj;)Lfxu;
        //   332: astore          14
        //   334: new             Ljava/util/HashMap;
        //   337: astore          15
        //   339: aload           15
        //   341: invokespecial   java/util/HashMap.<init>:()V
        //   344: aload           15
        //   346: getstatic       kmt.c:Lkmt;
        //   349: aload           12
        //   351: aload           10
        //   353: getstatic       kmt.c:Lkmt;
        //   356: invokevirtual   cfb.a:(Llfj;Lkmt;)Ljava/util/List;
        //   359: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   364: pop            
        //   365: aload           15
        //   367: getstatic       kmt.d:Lkmt;
        //   370: aload           12
        //   372: aload           10
        //   374: getstatic       kmt.d:Lkmt;
        //   377: invokevirtual   cfb.a:(Llfj;Lkmt;)Ljava/util/List;
        //   380: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   385: pop            
        //   386: aload           15
        //   388: getstatic       kmt.a:Lkmt;
        //   391: aload           12
        //   393: aload           10
        //   395: getstatic       kmt.a:Lkmt;
        //   398: invokevirtual   cfb.a:(Llfj;Lkmt;)Ljava/util/List;
        //   401: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   406: pop            
        //   407: aload           15
        //   409: getstatic       kmt.b:Lkmt;
        //   412: aload           12
        //   414: aload           10
        //   416: getstatic       kmt.b:Lkmt;
        //   419: invokevirtual   cfb.a:(Llfj;Lkmt;)Ljava/util/List;
        //   422: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   427: pop            
        //   428: aload           15
        //   430: getstatic       kmt.f:Lkmt;
        //   433: aload           12
        //   435: aload           10
        //   437: getstatic       kmt.f:Lkmt;
        //   440: invokevirtual   cfb.a:(Llfj;Lkmt;)Ljava/util/List;
        //   443: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   448: pop            
        //   449: aload           15
        //   451: getstatic       kmt.e:Lkmt;
        //   454: aload           12
        //   456: aload           10
        //   458: getstatic       kmt.e:Lkmt;
        //   461: invokevirtual   cfb.a:(Llfj;Lkmt;)Ljava/util/List;
        //   464: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   469: pop            
        //   470: new             Ljava/util/HashMap;
        //   473: astore          13
        //   475: aload           13
        //   477: invokespecial   java/util/HashMap.<init>:()V
        //   480: invokestatic    kmt.d:()Ljava/util/Collection;
        //   483: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   488: astore          16
        //   490: aload           16
        //   492: invokeinterface java/util/Iterator.hasNext:()Z
        //   497: istore          17
        //   499: iload           17
        //   501: ifeq            541
        //   504: aload           16
        //   506: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   511: checkcast       Lkmt;
        //   514: astore          18
        //   516: new             Ljava/util/ArrayList;
        //   519: astore          8
        //   521: aload           8
        //   523: invokespecial   java/util/ArrayList.<init>:()V
        //   526: aload           13
        //   528: aload           18
        //   530: aload           8
        //   532: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   537: pop            
        //   538: goto            490
        //   541: aload           14
        //   543: checkcast       Llfv;
        //   546: getfield        lfv.a:Llfg;
        //   549: astore          16
        //   551: getstatic       android/hardware/camera2/CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;
        //   554: astore          18
        //   556: getstatic       lff.d:[I
        //   559: astore          8
        //   561: aload           16
        //   563: checkcast       Llff;
        //   566: aload           18
        //   568: aload           8
        //   570: invokevirtual   lff.n:(Landroid/hardware/camera2/CameraCharacteristics$Key;Ljava/lang/Object;)Ljava/lang/Object;
        //   573: checkcast       [I
        //   576: astore          16
        //   578: aload           16
        //   580: arraylength    
        //   581: istore          19
        //   583: iconst_0       
        //   584: istore          20
        //   586: iload           20
        //   588: iload           19
        //   590: if_icmpge       1151
        //   593: aload           16
        //   595: iload           20
        //   597: iaload         
        //   598: bipush          9
        //   600: if_icmpne       1145
        //   603: new             Ljava/util/ArrayList;
        //   606: astore          18
        //   608: aload           18
        //   610: invokespecial   java/util/ArrayList.<init>:()V
        //   613: aload           14
        //   615: checkcast       Llfv;
        //   618: getfield        lfv.a:Llfg;
        //   621: checkcast       Llff;
        //   624: invokevirtual   lff.i:()Landroid/hardware/camera2/params/StreamConfigurationMap;
        //   627: astore          16
        //   629: aload           16
        //   631: ifnonnull       642
        //   634: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   637: astore          16
        //   639: goto            694
        //   642: aload           16
        //   644: invokevirtual   android/hardware/camera2/params/StreamConfigurationMap.getHighSpeedVideoSizes:()[Landroid/util/Size;
        //   647: astore          16
        //   649: aload           16
        //   651: ifnonnull       662
        //   654: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   657: astore          16
        //   659: goto            694
        //   662: aload           16
        //   664: invokestatic    krf.e:([Landroid/util/Size;)Ljava/util/List;
        //   667: astore          16
        //   669: aload           16
        //   671: aload           16
        //   673: invokeinterface java/util/List.size:()I
        //   678: anewarray       Lkre;
        //   681: invokeinterface java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   686: checkcast       [Lkre;
        //   689: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   692: astore          16
        //   694: aload           16
        //   696: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   701: astore          16
        //   703: aload           16
        //   705: invokeinterface java/util/Iterator.hasNext:()Z
        //   710: ifeq            761
        //   713: aload           16
        //   715: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   720: checkcast       Lkre;
        //   723: astore          8
        //   725: getstatic       kmv.j:Ljava/util/Map;
        //   728: aload           8
        //   730: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   735: checkcast       Lkmv;
        //   738: astore          8
        //   740: aload           8
        //   742: ifnull          758
        //   745: aload           18
        //   747: aload           8
        //   749: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   754: pop            
        //   755: goto            703
        //   758: goto            703
        //   761: aload           18
        //   763: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   768: astore          21
        //   770: aload_2        
        //   771: astore          8
        //   773: aload           21
        //   775: invokeinterface java/util/Iterator.hasNext:()Z
        //   780: ifeq            1050
        //   783: aload           21
        //   785: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   790: checkcast       Lkmv;
        //   793: astore          22
        //   795: aload           22
        //   797: invokestatic    knj.a:(Lkmv;)Lknj;
        //   800: astore          16
        //   802: aload           16
        //   804: ifnull          1047
        //   807: aload           10
        //   809: aload           16
        //   811: invokestatic    krf.g:(Llfj;Lknj;)Z
        //   814: ifeq            1044
        //   817: aload           22
        //   819: invokevirtual   kmv.c:()Lkre;
        //   822: astore          18
        //   824: aload           14
        //   826: checkcast       Llfv;
        //   829: getfield        lfv.a:Llfg;
        //   832: checkcast       Llff;
        //   835: invokevirtual   lff.i:()Landroid/hardware/camera2/params/StreamConfigurationMap;
        //   838: astore_2       
        //   839: aload_2        
        //   840: ifnonnull       851
        //   843: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   846: astore          18
        //   848: goto            879
        //   851: aload_2        
        //   852: aload           18
        //   854: invokestatic    krf.a:(Lkre;)Landroid/util/Size;
        //   857: invokevirtual   android/hardware/camera2/params/StreamConfigurationMap.getHighSpeedVideoFpsRangesFor:(Landroid/util/Size;)[Landroid/util/Range;
        //   860: astore_2       
        //   861: aload_2        
        //   862: ifnonnull       873
        //   865: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   868: astore          18
        //   870: goto            879
        //   873: aload_2        
        //   874: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   877: astore          18
        //   879: invokestatic    kmt.d:()Ljava/util/Collection;
        //   882: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   887: astore_2       
        //   888: aload_2        
        //   889: invokeinterface java/util/Iterator.hasNext:()Z
        //   894: ifeq            1041
        //   897: aload_2        
        //   898: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   903: checkcast       Lkmt;
        //   906: astore          23
        //   908: aload           10
        //   910: aload           16
        //   912: invokestatic    krf.g:(Llfj;Lknj;)Z
        //   915: ifeq            1038
        //   918: aload           10
        //   920: aload           16
        //   922: invokestatic    krf.h:(Llfj;Lknj;)Lkno;
        //   925: astore          24
        //   927: aload           12
        //   929: getfield        cfb.a:Lkna;
        //   932: aload           24
        //   934: aload           23
        //   936: aload           22
        //   938: invokeinterface kna.d:(Lkno;Lkmt;Lkmv;)Z
        //   943: ifeq            1035
        //   946: aload           18
        //   948: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   953: astore          24
        //   955: aload           24
        //   957: invokeinterface java/util/Iterator.hasNext:()Z
        //   962: ifeq            1032
        //   965: aload           24
        //   967: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   972: checkcast       Landroid/util/Range;
        //   975: astore          25
        //   977: aload           23
        //   979: getfield        kmt.i:I
        //   982: aload           25
        //   984: invokevirtual   android/util/Range.getUpper:()Ljava/lang/Comparable;
        //   987: checkcast       Ljava/lang/Integer;
        //   990: invokevirtual   java/lang/Integer.intValue:()I
        //   993: if_icmpne       1029
        //   996: aload           13
        //   998: aload           23
        //  1000: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1005: checkcast       Ljava/util/List;
        //  1008: astore          23
        //  1010: aload           23
        //  1012: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1015: pop            
        //  1016: aload           23
        //  1018: aload           22
        //  1020: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1025: pop            
        //  1026: goto            888
        //  1029: goto            955
        //  1032: goto            888
        //  1035: goto            888
        //  1038: goto            888
        //  1041: goto            773
        //  1044: goto            773
        //  1047: goto            773
        //  1050: aload           4
        //  1052: astore_2       
        //  1053: invokestatic    knj.values:()[Lknj;
        //  1056: astore          4
        //  1058: aload           4
        //  1060: arraylength    
        //  1061: istore          20
        //  1063: iconst_0       
        //  1064: istore          19
        //  1066: iload           19
        //  1068: iload           20
        //  1070: if_icmpge       1115
        //  1073: aload           4
        //  1075: iload           19
        //  1077: aaload         
        //  1078: astore          16
        //  1080: aload           10
        //  1082: aload           16
        //  1084: invokestatic    krf.g:(Llfj;Lknj;)Z
        //  1087: ifeq            1109
        //  1090: aload           10
        //  1092: aload           16
        //  1094: invokestatic    krf.h:(Llfj;Lknj;)Lkno;
        //  1097: getfield        kno.l:I
        //  1100: sipush          240
        //  1103: if_icmpne       1109
        //  1106: goto            1157
        //  1109: iinc            19, 1
        //  1112: goto            1066
        //  1115: getstatic       kmt.h:Lkmt;
        //  1118: astore          4
        //  1120: new             Ljava/util/ArrayList;
        //  1123: astore          16
        //  1125: aload           16
        //  1127: invokespecial   java/util/ArrayList.<init>:()V
        //  1130: aload           13
        //  1132: aload           4
        //  1134: aload           16
        //  1136: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1141: pop            
        //  1142: goto            1157
        //  1145: iinc            20, 1
        //  1148: goto            586
        //  1151: aload_2        
        //  1152: astore          8
        //  1154: aload           4
        //  1156: astore_2       
        //  1157: aload           15
        //  1159: aload           13
        //  1161: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //  1166: aload           15
        //  1168: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //  1173: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  1178: astore          4
        //  1180: aload           4
        //  1182: invokeinterface java/util/Iterator.hasNext:()Z
        //  1187: ifeq            1219
        //  1190: aload           15
        //  1192: aload           4
        //  1194: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1199: checkcast       Lkmt;
        //  1202: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1207: checkcast       Ljava/util/List;
        //  1210: invokestatic    kmv.d:()Ljava/util/Comparator;
        //  1213: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //  1216: goto            1180
        //  1219: new             Lcfa;
        //  1222: astore          13
        //  1224: aload           13
        //  1226: aload           14
        //  1228: aload           15
        //  1230: invokespecial   cfa.<init>:(Lfxu;Ljava/util/Map;)V
        //  1233: aload           12
        //  1235: getfield        cfb.b:Ljava/util/Map;
        //  1238: aload           10
        //  1240: aload           13
        //  1242: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1247: pop            
        //  1248: aload_2        
        //  1249: astore          12
        //  1251: aload           13
        //  1253: getfield        cfa.a:Lfxu;
        //  1256: invokeinterface fxu.l:()Llfu;
        //  1261: astore          24
        //  1263: aload           7
        //  1265: getfield        cfs.f:Lclu;
        //  1268: invokevirtual   clu.a:()Lclp;
        //  1271: astore_2       
        //  1272: aload_2        
        //  1273: getstatic       clp.e:Lclp;
        //  1276: invokevirtual   clp.equals:(Ljava/lang/Object;)Z
        //  1279: ifeq            1295
        //  1282: getstatic       kmv.h:Lkmv;
        //  1285: astore          4
        //  1287: getstatic       kmt.c:Lkmt;
        //  1290: astore          16
        //  1292: goto            1512
        //  1295: aload_2        
        //  1296: getstatic       clp.c:Lclp;
        //  1299: invokevirtual   clp.equals:(Ljava/lang/Object;)Z
        //  1302: ifeq            1334
        //  1305: aload           6
        //  1307: getfield        cbq.d:Lcxl;
        //  1310: getstatic       cwv.D:Lcxm;
        //  1313: invokeinterface cxl.k:(Lcxm;)Z
        //  1318: ifne            1334
        //  1321: getstatic       kmv.h:Lkmv;
        //  1324: astore          4
        //  1326: getstatic       kmt.f:Lkmt;
        //  1329: astore          16
        //  1331: goto            1512
        //  1334: aload           6
        //  1336: getfield        cbq.d:Lcxl;
        //  1339: getstatic       cya.b:Lcxm;
        //  1342: invokeinterface cxl.k:(Lcxm;)Z
        //  1347: ifne            1379
        //  1350: aload           11
        //  1352: invokestatic    cbq.c:(Landroid/content/Intent;)Z
        //  1355: ifeq            1365
        //  1358: getstatic       kmv.g:Lkmv;
        //  1361: astore_2       
        //  1362: goto            1405
        //  1365: aload           6
        //  1367: getfield        cbq.a:Lckn;
        //  1370: aload           24
        //  1372: invokevirtual   ckn.a:(Llfu;)Lkmv;
        //  1375: astore_2       
        //  1376: goto            1405
        //  1379: aload           11
        //  1381: invokestatic    cbq.c:(Landroid/content/Intent;)Z
        //  1384: ifeq            1394
        //  1387: getstatic       kmv.g:Lkmv;
        //  1390: astore_2       
        //  1391: goto            1405
        //  1394: aload           7
        //  1396: getfield        cfs.e:Lckt;
        //  1399: aload           24
        //  1401: invokevirtual   ckt.a:(Llfu;)Lkmv;
        //  1404: astore_2       
        //  1405: aload           7
        //  1407: getfield        cfs.a:Lckq;
        //  1410: astore          4
        //  1412: aload           4
        //  1414: aload_2        
        //  1415: putfield        ckq.a:Lkmv;
        //  1418: aload           4
        //  1420: aload           7
        //  1422: invokevirtual   cfs.a:()Ljbm;
        //  1425: invokevirtual   ckq.a:(Ljbm;)Lckp;
        //  1428: invokeinterface ckp.aQ:()Ljava/lang/Object;
        //  1433: checkcast       Lkmt;
        //  1436: astore          18
        //  1438: aload_2        
        //  1439: astore          4
        //  1441: aload           18
        //  1443: astore          16
        //  1445: aload           13
        //  1447: aload           18
        //  1449: aload_2        
        //  1450: invokevirtual   cfa.a:(Lkmt;Lkmv;)Z
        //  1453: ifne            1512
        //  1456: aload           18
        //  1458: invokevirtual   kmt.f:()Z
        //  1461: ifeq            1504
        //  1464: aload           13
        //  1466: getfield        cfa.b:Ljava/util/Map;
        //  1469: aload           18
        //  1471: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1476: checkcast       Ljava/util/List;
        //  1479: astore_2       
        //  1480: aload_2        
        //  1481: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1484: pop            
        //  1485: aload_2        
        //  1486: iconst_0       
        //  1487: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1492: checkcast       Lkmv;
        //  1495: astore          4
        //  1497: aload           18
        //  1499: astore          16
        //  1501: goto            1512
        //  1504: getstatic       kmt.c:Lkmt;
        //  1507: astore          16
        //  1509: aload_2        
        //  1510: astore          4
        //  1512: aload           7
        //  1514: invokevirtual   cfs.a:()Ljbm;
        //  1517: astore_2       
        //  1518: aload_2        
        //  1519: getstatic       jbm.i:Ljbm;
        //  1522: if_acmpne       1538
        //  1525: aload           4
        //  1527: invokevirtual   kmv.c:()Lkre;
        //  1530: invokestatic    niz.i:(Ljava/lang/Object;)Lniz;
        //  1533: astore          21
        //  1535: goto            1749
        //  1538: aload_2        
        //  1539: getstatic       jbm.c:Ljbm;
        //  1542: if_acmpne       1744
        //  1545: aload           6
        //  1547: getfield        cbq.d:Lcxl;
        //  1550: astore          18
        //  1552: getstatic       cwv.a:Lcxo;
        //  1555: astore_2       
        //  1556: aload           18
        //  1558: invokeinterface cxl.e:()V
        //  1563: aload           13
        //  1565: getfield        cfa.a:Lfxu;
        //  1568: sipush          256
        //  1571: invokeinterface fxu.v:(I)Ljava/util/List;
        //  1576: astore_2       
        //  1577: getstatic       kmv.i:Lkmv;
        //  1580: astore          15
        //  1582: new             Lkre;
        //  1585: astore          18
        //  1587: aload           18
        //  1589: iconst_0       
        //  1590: iconst_0       
        //  1591: invokespecial   kre.<init>:(II)V
        //  1594: aload_2        
        //  1595: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1600: astore_2       
        //  1601: aload_2        
        //  1602: invokeinterface java/util/Iterator.hasNext:()Z
        //  1607: ifeq            1721
        //  1610: aload_2        
        //  1611: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1616: checkcast       Lkre;
        //  1619: astore          21
        //  1621: aload           21
        //  1623: invokestatic    kqp.g:(Lkre;)Lkqp;
        //  1626: aload           4
        //  1628: invokevirtual   kmv.c:()Lkre;
        //  1631: invokestatic    kqp.g:(Lkre;)Lkqp;
        //  1634: invokevirtual   kqp.equals:(Ljava/lang/Object;)Z
        //  1637: ifeq            1718
        //  1640: aload           4
        //  1642: aload           15
        //  1644: if_acmpeq       1683
        //  1647: aload           16
        //  1649: getfield        kmt.i:I
        //  1652: bipush          60
        //  1654: if_icmpeq       1683
        //  1657: aload           16
        //  1659: getfield        kmt.k:I
        //  1662: bipush          60
        //  1664: if_icmpne       1697
        //  1667: aload           13
        //  1669: getfield        cfa.a:Lfxu;
        //  1672: invokeinterface fxu.l:()Llfu;
        //  1677: getstatic       lfu.a:Llfu;
        //  1680: if_acmpne       1697
        //  1683: aload           21
        //  1685: invokevirtual   kre.b:()J
        //  1688: aload           4
        //  1690: invokevirtual   kmv.a:()J
        //  1693: lcmp           
        //  1694: ifgt            1718
        //  1697: aload           21
        //  1699: invokevirtual   kre.b:()J
        //  1702: aload           18
        //  1704: invokevirtual   kre.b:()J
        //  1707: lcmp           
        //  1708: ifle            1718
        //  1711: aload           21
        //  1713: astore          18
        //  1715: goto            1601
        //  1718: goto            1601
        //  1721: aload           18
        //  1723: invokevirtual   kre.b:()J
        //  1726: lconst_0       
        //  1727: lcmp           
        //  1728: ifne            1734
        //  1731: goto            1744
        //  1734: aload           18
        //  1736: invokestatic    niz.i:(Ljava/lang/Object;)Lniz;
        //  1739: astore          21
        //  1741: goto            1749
        //  1744: getstatic       nii.a:Lnii;
        //  1747: astore          21
        //  1749: aload           7
        //  1751: getfield        cfs.c:Lcjl;
        //  1754: invokeinterface cek.m:()V
        //  1759: aload           4
        //  1761: invokevirtual   kmv.e:()Z
        //  1764: ifeq            1804
        //  1767: aload           16
        //  1769: getfield        kmt.i:I
        //  1772: bipush          60
        //  1774: if_icmpne       1804
        //  1777: aload           6
        //  1779: getfield        cbq.d:Lcxl;
        //  1782: getstatic       cwv.F:Lcxm;
        //  1785: invokeinterface cxl.k:(Lcxm;)Z
        //  1790: ifeq            1804
        //  1793: getstatic       kmv.g:Lkmv;
        //  1796: invokevirtual   kmv.c:()Lkre;
        //  1799: astore          15
        //  1801: goto            1830
        //  1804: aload           4
        //  1806: invokevirtual   kmv.e:()Z
        //  1809: ifeq            1823
        //  1812: getstatic       kmv.h:Lkmv;
        //  1815: invokevirtual   kmv.c:()Lkre;
        //  1818: astore          15
        //  1820: goto            1830
        //  1823: aload           4
        //  1825: invokevirtual   kmv.c:()Lkre;
        //  1828: astore          15
        //  1830: aload           6
        //  1832: getfield        cbq.h:Lcbn;
        //  1835: getfield        cbn.b:Lcim;
        //  1838: astore_2       
        //  1839: aload           7
        //  1841: invokevirtual   cfs.a:()Ljbm;
        //  1844: astore          18
        //  1846: aload_2        
        //  1847: getfield        cim.b:Lkna;
        //  1850: aload_2        
        //  1851: aload           10
        //  1853: aload           4
        //  1855: aload           18
        //  1857: invokevirtual   cim.a:(Llfj;Lkmv;Ljbm;)Lkno;
        //  1860: aload           16
        //  1862: aload           4
        //  1864: invokeinterface kna.c:(Lkno;Lkmt;Lkmv;)Lknc;
        //  1869: astore          25
        //  1871: aload           16
        //  1873: getstatic       kmt.e:Lkmt;
        //  1876: if_acmpeq       1975
        //  1879: aload           16
        //  1881: getstatic       kmt.f:Lkmt;
        //  1884: if_acmpeq       1975
        //  1887: aload           7
        //  1889: invokevirtual   cfs.a:()Ljbm;
        //  1892: astore          14
        //  1894: aload_2        
        //  1895: getfield        cim.a:Lckn;
        //  1898: getfield        ckn.b:Lcxl;
        //  1901: astore          18
        //  1903: getstatic       cwv.a:Lcxo;
        //  1906: astore          22
        //  1908: aload           18
        //  1910: invokeinterface cxl.b:()V
        //  1915: aload           16
        //  1917: invokevirtual   kmt.g:()Z
        //  1920: ifeq            1949
        //  1923: aload_2        
        //  1924: getfield        cim.b:Lkna;
        //  1927: aload           16
        //  1929: aload_2        
        //  1930: aload           10
        //  1932: aload           4
        //  1934: aload           14
        //  1936: invokevirtual   cim.a:(Llfj;Lkmv;Ljbm;)Lkno;
        //  1939: invokeinterface kna.a:(Lkmt;Lkno;)Lkmz;
        //  1944: astore          14
        //  1946: goto            1978
        //  1949: aload_2        
        //  1950: getfield        cim.b:Lkna;
        //  1953: aload           16
        //  1955: aload_2        
        //  1956: aload           10
        //  1958: aload           4
        //  1960: aload           14
        //  1962: invokevirtual   cim.a:(Llfj;Lkmv;Ljbm;)Lkno;
        //  1965: invokeinterface kna.b:(Lkmt;Lkno;)Lkmz;
        //  1970: astore          14
        //  1972: goto            1978
        //  1975: aconst_null    
        //  1976: astore          14
        //  1978: aload           13
        //  1980: getfield        cfa.a:Lfxu;
        //  1983: invokeinterface fxu.u:()Ljava/util/List;
        //  1988: astore          26
        //  1990: aload           26
        //  1992: invokeinterface java/util/List.isEmpty:()Z
        //  1997: iconst_1       
        //  1998: ixor           
        //  1999: invokestatic    njo.o:(Z)V
        //  2002: new             Landroid/util/Range;
        //  2005: astore          18
        //  2007: iconst_0       
        //  2008: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2011: astore_2       
        //  2012: aload           18
        //  2014: aload_2        
        //  2015: aload_2        
        //  2016: invokespecial   android/util/Range.<init>:(Ljava/lang/Comparable;Ljava/lang/Comparable;)V
        //  2019: aload           26
        //  2021: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  2026: astore          22
        //  2028: aload           11
        //  2030: astore_2       
        //  2031: aload           22
        //  2033: astore          11
        //  2035: aload           11
        //  2037: invokeinterface java/util/Iterator.hasNext:()Z
        //  2042: ifeq            2121
        //  2045: aload           11
        //  2047: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2052: checkcast       Landroid/util/Range;
        //  2055: astore          23
        //  2057: aload           18
        //  2059: astore          22
        //  2061: aload           23
        //  2063: invokevirtual   android/util/Range.getUpper:()Ljava/lang/Comparable;
        //  2066: checkcast       Ljava/lang/Integer;
        //  2069: invokevirtual   java/lang/Integer.intValue:()I
        //  2072: aload           23
        //  2074: invokevirtual   android/util/Range.getLower:()Ljava/lang/Comparable;
        //  2077: checkcast       Ljava/lang/Integer;
        //  2080: invokevirtual   java/lang/Integer.intValue:()I
        //  2083: isub           
        //  2084: aload           18
        //  2086: invokevirtual   android/util/Range.getUpper:()Ljava/lang/Comparable;
        //  2089: checkcast       Ljava/lang/Integer;
        //  2092: invokevirtual   java/lang/Integer.intValue:()I
        //  2095: aload           18
        //  2097: invokevirtual   android/util/Range.getLower:()Ljava/lang/Comparable;
        //  2100: checkcast       Ljava/lang/Integer;
        //  2103: invokevirtual   java/lang/Integer.intValue:()I
        //  2106: isub           
        //  2107: if_icmple       2114
        //  2110: aload           23
        //  2112: astore          22
        //  2114: aload           22
        //  2116: astore          18
        //  2118: goto            2035
        //  2121: aload           18
        //  2123: invokevirtual   android/util/Range.getUpper:()Ljava/lang/Comparable;
        //  2126: checkcast       Ljava/lang/Integer;
        //  2129: invokevirtual   java/lang/Integer.intValue:()I
        //  2132: aload           18
        //  2134: invokevirtual   android/util/Range.getLower:()Ljava/lang/Comparable;
        //  2137: checkcast       Ljava/lang/Integer;
        //  2140: invokevirtual   java/lang/Integer.intValue:()I
        //  2143: if_icmpne       2154
        //  2146: getstatic       nii.a:Lnii;
        //  2149: astore          18
        //  2151: goto            2203
        //  2154: aload           16
        //  2156: getstatic       kmt.a:Lkmt;
        //  2159: if_acmpne       2172
        //  2162: aload           18
        //  2164: invokestatic    niz.i:(Ljava/lang/Object;)Lniz;
        //  2167: astore          18
        //  2169: goto            2203
        //  2172: aload           26
        //  2174: getstatic       cey.a:Landroid/util/Range;
        //  2177: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  2182: ifeq            2196
        //  2185: getstatic       cey.a:Landroid/util/Range;
        //  2188: invokestatic    niz.i:(Ljava/lang/Object;)Lniz;
        //  2191: astore          18
        //  2193: goto            2203
        //  2196: aload           18
        //  2198: invokestatic    niz.i:(Ljava/lang/Object;)Lniz;
        //  2201: astore          18
        //  2203: aload           6
        //  2205: getfield        cbq.c:Lcey;
        //  2208: astore          11
        //  2210: aload           13
        //  2212: getfield        cfa.a:Lfxu;
        //  2215: invokeinterface fxu.l:()Llfu;
        //  2220: getstatic       lfu.a:Llfu;
        //  2223: if_acmpne       2251
        //  2226: aload           16
        //  2228: getstatic       kmt.c:Lkmt;
        //  2231: if_acmpne       2251
        //  2234: aload           11
        //  2236: getfield        cey.b:Z
        //  2239: ifne            2245
        //  2242: goto            2251
        //  2245: iconst_1       
        //  2246: istore          17
        //  2248: goto            2268
        //  2251: aload           16
        //  2253: getstatic       kmt.a:Lkmt;
        //  2256: if_acmpne       2265
        //  2259: iconst_1       
        //  2260: istore          17
        //  2262: goto            2268
        //  2265: iconst_0       
        //  2266: istore          17
        //  2268: aload           16
        //  2270: invokevirtual   kmt.g:()Z
        //  2273: ifeq            2321
        //  2276: new             Lcet;
        //  2279: astore          11
        //  2281: new             Landroid/util/Range;
        //  2284: astore          22
        //  2286: aload           22
        //  2288: aload           16
        //  2290: getfield        kmt.i:I
        //  2293: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2296: aload           16
        //  2298: getfield        kmt.i:I
        //  2301: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2304: invokespecial   android/util/Range.<init>:(Ljava/lang/Comparable;Ljava/lang/Comparable;)V
        //  2307: aload           11
        //  2309: aload           22
        //  2311: aload           18
        //  2313: iload           17
        //  2315: invokespecial   cet.<init>:(Landroid/util/Range;Lniz;Z)V
        //  2318: goto            2332
        //  2321: new             Lces;
        //  2324: dup            
        //  2325: aload           25
        //  2327: invokespecial   ces.<init>:(Lknc;)V
        //  2330: astore          11
        //  2332: new             Lcfn;
        //  2335: astore          22
        //  2337: aload           22
        //  2339: aconst_null    
        //  2340: invokespecial   cfn.<init>:([B)V
        //  2343: aload           6
        //  2345: getfield        cbq.e:Lcqn;
        //  2348: astore          18
        //  2350: aload           18
        //  2352: getfield        cqn.b:Ljava/util/concurrent/atomic/AtomicInteger;
        //  2355: iconst_0       
        //  2356: invokevirtual   java/util/concurrent/atomic/AtomicInteger.set:(I)V
        //  2359: aload           18
        //  2361: getfield        cqn.c:Ljava/util/concurrent/atomic/AtomicInteger;
        //  2364: iconst_0       
        //  2365: invokevirtual   java/util/concurrent/atomic/AtomicInteger.set:(I)V
        //  2368: aload           22
        //  2370: aload           18
        //  2372: getfield        cqn.a:Ljava/util/concurrent/atomic/AtomicInteger;
        //  2375: invokevirtual   java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        //  2378: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2381: putfield        cfn.A:Ljava/lang/Integer;
        //  2384: aload           12
        //  2386: ifnull          5290
        //  2389: aload           22
        //  2391: aload           12
        //  2393: putfield        cfn.a:Llfj;
        //  2396: aload           10
        //  2398: ifnull          5277
        //  2401: aload           22
        //  2403: aload           10
        //  2405: putfield        cfn.b:Llfj;
        //  2408: aload           16
        //  2410: ifnull          5264
        //  2413: aload           22
        //  2415: aload           16
        //  2417: putfield        cfn.d:Lkmt;
        //  2420: aload           4
        //  2422: ifnull          5251
        //  2425: aload           22
        //  2427: aload           4
        //  2429: putfield        cfn.e:Lkmv;
        //  2432: aload           13
        //  2434: ifnull          5238
        //  2437: aload           22
        //  2439: aload           13
        //  2441: putfield        cfn.c:Lcfa;
        //  2444: aload           22
        //  2446: aload           21
        //  2448: putfield        cfn.f:Lniz;
        //  2451: aload           22
        //  2453: aload           15
        //  2455: putfield        cfn.g:Lkre;
        //  2458: aload           22
        //  2460: aload           25
        //  2462: putfield        cfn.h:Lknc;
        //  2465: aload           22
        //  2467: aload           14
        //  2469: invokestatic    niz.h:(Ljava/lang/Object;)Lniz;
        //  2472: putfield        cfn.i:Lniz;
        //  2475: aload           22
        //  2477: aload_2        
        //  2478: invokestatic    bmx.e:(Landroid/content/Intent;)Lniz;
        //  2481: putfield        cfn.j:Lniz;
        //  2484: aload_2        
        //  2485: ifnonnull       2496
        //  2488: getstatic       nii.a:Lnii;
        //  2491: astore          18
        //  2493: goto            2535
        //  2496: aload_2        
        //  2497: astore          18
        //  2499: aload           18
        //  2501: ldc_w           "android.intent.extra.durationLimit"
        //  2504: invokevirtual   android/content/Intent.hasExtra:(Ljava/lang/String;)Z
        //  2507: ifeq            2530
        //  2510: aload           18
        //  2512: ldc_w           "android.intent.extra.durationLimit"
        //  2515: iconst_0       
        //  2516: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //  2519: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2522: invokestatic    niz.i:(Ljava/lang/Object;)Lniz;
        //  2525: astore          18
        //  2527: goto            2535
        //  2530: getstatic       nii.a:Lnii;
        //  2533: astore          18
        //  2535: aload           22
        //  2537: aload           18
        //  2539: putfield        cfn.k:Lniz;
        //  2542: aload_2        
        //  2543: ifnonnull       2553
        //  2546: getstatic       nii.a:Lnii;
        //  2549: astore_2       
        //  2550: goto            2586
        //  2553: aload_2        
        //  2554: ldc_w           "android.intent.extra.sizeLimit"
        //  2557: invokevirtual   android/content/Intent.hasExtra:(Ljava/lang/String;)Z
        //  2560: ifeq            2582
        //  2563: aload_2        
        //  2564: ldc_w           "android.intent.extra.sizeLimit"
        //  2567: iconst_0       
        //  2568: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //  2571: i2l            
        //  2572: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  2575: invokestatic    niz.i:(Ljava/lang/Object;)Lniz;
        //  2578: astore_2       
        //  2579: goto            2586
        //  2582: getstatic       nii.a:Lnii;
        //  2585: astore_2       
        //  2586: aload           22
        //  2588: aload_2        
        //  2589: putfield        cfn.l:Lniz;
        //  2592: aload           22
        //  2594: aload           7
        //  2596: getfield        cfs.c:Lcjl;
        //  2599: invokeinterface cek.j:()Z
        //  2604: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2607: putfield        cfn.m:Ljava/lang/Boolean;
        //  2610: aload           11
        //  2612: invokeinterface cer.a:()Landroid/util/Range;
        //  2617: astore_2       
        //  2618: aload_2        
        //  2619: ifnull          5225
        //  2622: aload           22
        //  2624: aload_2        
        //  2625: putfield        cfn.n:Landroid/util/Range;
        //  2628: aload           11
        //  2630: invokeinterface cer.b:()Landroid/util/Range;
        //  2635: astore_2       
        //  2636: aload_2        
        //  2637: ifnull          5212
        //  2640: aload           22
        //  2642: aload_2        
        //  2643: putfield        cfn.o:Landroid/util/Range;
        //  2646: aload           24
        //  2648: ifnull          5199
        //  2651: aload           22
        //  2653: aload           24
        //  2655: putfield        cfn.y:Llfu;
        //  2658: aload           22
        //  2660: aload           16
        //  2662: invokevirtual   kmt.f:()Z
        //  2665: iconst_1       
        //  2666: ixor           
        //  2667: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2670: putfield        cfn.p:Ljava/lang/Boolean;
        //  2673: aload           6
        //  2675: getfield        cbq.d:Lcxl;
        //  2678: getstatic       cwv.x:Lcxm;
        //  2681: invokeinterface cxl.k:(Lcxm;)Z
        //  2686: ifne            2709
        //  2689: aload           24
        //  2691: getstatic       lfu.b:Llfu;
        //  2694: if_acmpne       2703
        //  2697: iconst_1       
        //  2698: istore          17
        //  2700: goto            2712
        //  2703: iconst_0       
        //  2704: istore          17
        //  2706: goto            2712
        //  2709: iconst_1       
        //  2710: istore          17
        //  2712: aload           22
        //  2714: iload           17
        //  2716: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2719: putfield        cfn.q:Ljava/lang/Boolean;
        //  2722: aload           6
        //  2724: getfield        cbq.d:Lcxl;
        //  2727: getstatic       cwv.l:Lcxm;
        //  2730: invokeinterface cxl.k:(Lcxm;)Z
        //  2735: ifeq            2752
        //  2738: aload           24
        //  2740: getstatic       lfu.a:Llfu;
        //  2743: if_acmpne       2752
        //  2746: iconst_1       
        //  2747: istore          17
        //  2749: goto            2767
        //  2752: aload           6
        //  2754: getfield        cbq.d:Lcxl;
        //  2757: getstatic       cwv.m:Lcxm;
        //  2760: invokeinterface cxl.k:(Lcxm;)Z
        //  2765: istore          17
        //  2767: aload           22
        //  2769: iload           17
        //  2771: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2774: putfield        cfn.r:Ljava/lang/Boolean;
        //  2777: aload           13
        //  2779: getfield        cfa.a:Lfxu;
        //  2782: invokeinterface lfg.J:()Z
        //  2787: ifeq            2807
        //  2790: aload           6
        //  2792: getfield        cbq.a:Lckn;
        //  2795: invokevirtual   ckn.c:()Z
        //  2798: ifeq            2807
        //  2801: iconst_1       
        //  2802: istore          17
        //  2804: goto            2810
        //  2807: iconst_0       
        //  2808: istore          17
        //  2810: aload           22
        //  2812: iload           17
        //  2814: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2817: putfield        cfn.s:Ljava/lang/Boolean;
        //  2820: aload           22
        //  2822: aload           6
        //  2824: getfield        cbq.a:Lckn;
        //  2827: invokevirtual   ckn.d:()Z
        //  2830: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2833: putfield        cfn.t:Ljava/lang/Boolean;
        //  2836: aload           6
        //  2838: getfield        cbq.d:Lcxl;
        //  2841: invokeinterface cxl.b:()V
        //  2846: aload           4
        //  2848: invokevirtual   kmv.e:()Z
        //  2851: ifne            2917
        //  2854: aload           6
        //  2856: getfield        cbq.d:Lcxl;
        //  2859: getstatic       cwv.v:Lcxm;
        //  2862: invokeinterface cxl.k:(Lcxm;)Z
        //  2867: ifeq            2887
        //  2870: aload           16
        //  2872: getstatic       kmt.c:Lkmt;
        //  2875: if_acmpeq       2881
        //  2878: goto            2887
        //  2881: iconst_1       
        //  2882: istore          17
        //  2884: goto            2920
        //  2887: aload           6
        //  2889: getfield        cbq.d:Lcxl;
        //  2892: getstatic       cwv.w:Lcxm;
        //  2895: invokeinterface cxl.k:(Lcxm;)Z
        //  2900: ifeq            2917
        //  2903: aload           16
        //  2905: getstatic       kmt.a:Lkmt;
        //  2908: if_acmpne       2917
        //  2911: iconst_1       
        //  2912: istore          17
        //  2914: goto            2920
        //  2917: iconst_0       
        //  2918: istore          17
        //  2920: aload           22
        //  2922: iload           17
        //  2924: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2927: putfield        cfn.u:Ljava/lang/Boolean;
        //  2930: aload           7
        //  2932: getfield        cfs.f:Lclu;
        //  2935: invokevirtual   clu.a:()Lclp;
        //  2938: astore          18
        //  2940: new             Lnog;
        //  2943: astore          21
        //  2945: aload           21
        //  2947: invokespecial   nog.<init>:()V
        //  2950: aload           6
        //  2952: aload           16
        //  2954: aload           4
        //  2956: aload           24
        //  2958: aload           18
        //  2960: invokevirtual   cbq.b:(Lkmt;Lkmv;Llfu;Lclp;)Lnns;
        //  2963: astore_2       
        //  2964: aload_2        
        //  2965: checkcast       Lnql;
        //  2968: getfield        nql.c:I
        //  2971: istore          20
        //  2973: iconst_0       
        //  2974: istore          19
        //  2976: iload           19
        //  2978: iload           20
        //  2980: if_icmpge       3016
        //  2983: aload           21
        //  2985: aload           6
        //  2987: aload           13
        //  2989: aload           16
        //  2991: aload_2        
        //  2992: iload           19
        //  2994: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2999: checkcast       Lkmv;
        //  3002: aload           18
        //  3004: invokevirtual   cbq.a:(Lcfa;Lkmt;Lkmv;Lclp;)Lnns;
        //  3007: invokevirtual   nog.i:(Ljava/lang/Iterable;)V
        //  3010: iinc            19, 1
        //  3013: goto            2976
        //  3016: aload           21
        //  3018: invokevirtual   nog.f:()Lnoi;
        //  3021: invokevirtual   nnj.v:()Lnns;
        //  3024: astore_2       
        //  3025: aload_2        
        //  3026: ifnull          5186
        //  3029: aload           22
        //  3031: aload_2        
        //  3032: putfield        cfn.v:Lnns;
        //  3035: aload           6
        //  3037: aload           13
        //  3039: aload           16
        //  3041: aload           4
        //  3043: aload           7
        //  3045: getfield        cfs.f:Lclu;
        //  3048: invokevirtual   clu.a:()Lclp;
        //  3051: invokevirtual   cbq.a:(Lcfa;Lkmt;Lkmv;Lclp;)Lnns;
        //  3054: astore_2       
        //  3055: aload_2        
        //  3056: ifnull          5173
        //  3059: aload           22
        //  3061: aload_2        
        //  3062: putfield        cfn.w:Lnns;
        //  3065: aload           6
        //  3067: aload           16
        //  3069: aload           4
        //  3071: aload           24
        //  3073: aload           7
        //  3075: getfield        cfs.f:Lclu;
        //  3078: invokevirtual   clu.a:()Lclp;
        //  3081: invokevirtual   cbq.b:(Lkmt;Lkmv;Llfu;Lclp;)Lnns;
        //  3084: astore_2       
        //  3085: aload_2        
        //  3086: ifnull          5160
        //  3089: aload           22
        //  3091: aload_2        
        //  3092: putfield        cfn.x:Lnns;
        //  3095: aload           16
        //  3097: invokevirtual   kmt.e:()Z
        //  3100: ifeq            3110
        //  3103: getstatic       hio.r:Lhio;
        //  3106: astore_2       
        //  3107: goto            3114
        //  3110: getstatic       hio.j:Lhio;
        //  3113: astore_2       
        //  3114: aload_2        
        //  3115: ifnull          5147
        //  3118: aload           22
        //  3120: aload_2        
        //  3121: putfield        cfn.z:Lhio;
        //  3124: aload           7
        //  3126: getfield        cfs.c:Lcjl;
        //  3129: invokeinterface cek.e:()Z
        //  3134: ifne            3143
        //  3137: iconst_0       
        //  3138: istore          17
        //  3140: goto            3184
        //  3143: aload           6
        //  3145: getfield        cbq.d:Lcxl;
        //  3148: getstatic       cwv.G:Lcxm;
        //  3151: invokeinterface cxl.k:(Lcxm;)Z
        //  3156: ifeq            3181
        //  3159: aload           4
        //  3161: invokevirtual   kmv.e:()Z
        //  3164: ifeq            3181
        //  3167: aload           16
        //  3169: getstatic       kmt.d:Lkmt;
        //  3172: if_acmpne       3181
        //  3175: iconst_0       
        //  3176: istore          17
        //  3178: goto            3184
        //  3181: iconst_1       
        //  3182: istore          17
        //  3184: aload           22
        //  3186: iload           17
        //  3188: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  3191: putfield        cfn.B:Ljava/lang/Boolean;
        //  3194: aload           6
        //  3196: getfield        cbq.d:Lcxl;
        //  3199: invokeinterface cxl.b:()V
        //  3204: aload           22
        //  3206: iconst_0       
        //  3207: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  3210: putfield        cfn.C:Ljava/lang/Boolean;
        //  3213: aload           7
        //  3215: getfield        cfs.c:Lcjl;
        //  3218: invokeinterface cek.o:()V
        //  3223: aload           22
        //  3225: iconst_0       
        //  3226: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  3229: putfield        cfn.D:Ljava/lang/Boolean;
        //  3232: aload           22
        //  3234: getfield        cfn.a:Llfj;
        //  3237: astore          16
        //  3239: aload           16
        //  3241: ifnull          4650
        //  3244: aload           22
        //  3246: getfield        cfn.b:Llfj;
        //  3249: astore          18
        //  3251: aload           18
        //  3253: ifnull          4650
        //  3256: aload           22
        //  3258: getfield        cfn.c:Lcfa;
        //  3261: astore          4
        //  3263: aload           4
        //  3265: ifnull          4650
        //  3268: aload           22
        //  3270: getfield        cfn.d:Lkmt;
        //  3273: astore          14
        //  3275: aload           14
        //  3277: ifnull          4650
        //  3280: aload           22
        //  3282: getfield        cfn.e:Lkmv;
        //  3285: astore          12
        //  3287: aload           12
        //  3289: ifnull          4650
        //  3292: aload           22
        //  3294: getfield        cfn.g:Lkre;
        //  3297: astore          21
        //  3299: aload           21
        //  3301: ifnull          4650
        //  3304: aload           22
        //  3306: getfield        cfn.h:Lknc;
        //  3309: astore          15
        //  3311: aload           15
        //  3313: ifnull          4650
        //  3316: aload           22
        //  3318: getfield        cfn.m:Ljava/lang/Boolean;
        //  3321: astore          13
        //  3323: aload           13
        //  3325: ifnull          4650
        //  3328: aload           22
        //  3330: getfield        cfn.n:Landroid/util/Range;
        //  3333: ifnull          4650
        //  3336: aload           22
        //  3338: getfield        cfn.o:Landroid/util/Range;
        //  3341: ifnull          4650
        //  3344: aload           22
        //  3346: getfield        cfn.p:Ljava/lang/Boolean;
        //  3349: ifnull          4650
        //  3352: aload           22
        //  3354: getfield        cfn.q:Ljava/lang/Boolean;
        //  3357: ifnull          4650
        //  3360: aload           22
        //  3362: getfield        cfn.r:Ljava/lang/Boolean;
        //  3365: ifnull          4650
        //  3368: aload           22
        //  3370: getfield        cfn.s:Ljava/lang/Boolean;
        //  3373: ifnull          4650
        //  3376: aload           22
        //  3378: getfield        cfn.t:Ljava/lang/Boolean;
        //  3381: ifnull          4650
        //  3384: aload           22
        //  3386: getfield        cfn.u:Ljava/lang/Boolean;
        //  3389: ifnull          4650
        //  3392: aload           22
        //  3394: getfield        cfn.v:Lnns;
        //  3397: ifnull          4650
        //  3400: aload           22
        //  3402: getfield        cfn.w:Lnns;
        //  3405: ifnull          4650
        //  3408: aload           22
        //  3410: getfield        cfn.x:Lnns;
        //  3413: ifnull          4650
        //  3416: aload           22
        //  3418: getfield        cfn.y:Llfu;
        //  3421: ifnull          4650
        //  3424: aload           22
        //  3426: getfield        cfn.z:Lhio;
        //  3429: ifnull          4650
        //  3432: aload           22
        //  3434: getfield        cfn.A:Ljava/lang/Integer;
        //  3437: ifnull          4650
        //  3440: aload           22
        //  3442: getfield        cfn.B:Ljava/lang/Boolean;
        //  3445: ifnull          4650
        //  3448: aload           22
        //  3450: getfield        cfn.C:Ljava/lang/Boolean;
        //  3453: ifnull          4650
        //  3456: aload           22
        //  3458: getfield        cfn.D:Ljava/lang/Boolean;
        //  3461: ifnonnull       3467
        //  3464: goto            4650
        //  3467: new             Lcfo;
        //  3470: astore_2       
        //  3471: aload_2        
        //  3472: aload           16
        //  3474: aload           18
        //  3476: aload           4
        //  3478: aload           14
        //  3480: aload           12
        //  3482: aload           22
        //  3484: getfield        cfn.f:Lniz;
        //  3487: aload           21
        //  3489: aload           15
        //  3491: aload           22
        //  3493: getfield        cfn.i:Lniz;
        //  3496: aload           22
        //  3498: getfield        cfn.j:Lniz;
        //  3501: aload           22
        //  3503: getfield        cfn.k:Lniz;
        //  3506: aload           22
        //  3508: getfield        cfn.l:Lniz;
        //  3511: aload           13
        //  3513: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3516: aload           22
        //  3518: getfield        cfn.n:Landroid/util/Range;
        //  3521: aload           22
        //  3523: getfield        cfn.o:Landroid/util/Range;
        //  3526: aload           22
        //  3528: getfield        cfn.p:Ljava/lang/Boolean;
        //  3531: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3534: aload           22
        //  3536: getfield        cfn.q:Ljava/lang/Boolean;
        //  3539: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3542: aload           22
        //  3544: getfield        cfn.r:Ljava/lang/Boolean;
        //  3547: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3550: aload           22
        //  3552: getfield        cfn.s:Ljava/lang/Boolean;
        //  3555: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3558: aload           22
        //  3560: getfield        cfn.t:Ljava/lang/Boolean;
        //  3563: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3566: aload           22
        //  3568: getfield        cfn.u:Ljava/lang/Boolean;
        //  3571: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3574: aload           22
        //  3576: getfield        cfn.v:Lnns;
        //  3579: aload           22
        //  3581: getfield        cfn.w:Lnns;
        //  3584: aload           22
        //  3586: getfield        cfn.x:Lnns;
        //  3589: aload           22
        //  3591: getfield        cfn.y:Llfu;
        //  3594: aload           22
        //  3596: getfield        cfn.z:Lhio;
        //  3599: aload           22
        //  3601: getfield        cfn.A:Ljava/lang/Integer;
        //  3604: invokevirtual   java/lang/Integer.intValue:()I
        //  3607: aload           22
        //  3609: getfield        cfn.B:Ljava/lang/Boolean;
        //  3612: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3615: aload           22
        //  3617: getfield        cfn.C:Ljava/lang/Boolean;
        //  3620: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3623: aload           22
        //  3625: getfield        cfn.D:Ljava/lang/Boolean;
        //  3628: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3631: invokespecial   cfo.<init>:(Llfj;Llfj;Lcfa;Lkmt;Lkmv;Lniz;Lkre;Lknc;Lniz;Lniz;Lniz;Lniz;ZLandroid/util/Range;Landroid/util/Range;ZZZZZZLnns;Lnns;Lnns;Llfu;Lhio;IZZZ)V
        //  3634: aload           6
        //  3636: aload_2        
        //  3637: putfield        cbq.f:Lcfo;
        //  3640: aload           9
        //  3642: monitorexit    
        //  3643: aload           8
        //  3645: getfield        cay.e:Lcid;
        //  3648: getstatic       cic.b:Lcic;
        //  3651: invokevirtual   cid.a:(Lcic;)Lkjk;
        //  3654: aload           8
        //  3656: getfield        cay.i:Lccz;
        //  3659: invokevirtual   kjk.c:(Lkrc;)V
        //  3662: aload           8
        //  3664: getfield        cay.e:Lcid;
        //  3667: getstatic       cic.b:Lcic;
        //  3670: invokevirtual   cid.a:(Lcic;)Lkjk;
        //  3673: aload           8
        //  3675: invokevirtual   kjk.c:(Lkrc;)V
        //  3678: aload           8
        //  3680: getfield        cay.m:Lcxl;
        //  3683: astore          4
        //  3685: getstatic       cwv.a:Lcxo;
        //  3688: astore          16
        //  3690: aload           4
        //  3692: invokeinterface cxl.b:()V
        //  3697: aload           8
        //  3699: getfield        cay.d:Lcde;
        //  3702: astore          18
        //  3704: aload           18
        //  3706: aload_2        
        //  3707: putfield        cde.s:Lcfo;
        //  3710: aload           18
        //  3712: getfield        cde.c:Lcmw;
        //  3715: aload_2        
        //  3716: getfield        cfo.c:Lcfa;
        //  3719: getfield        cfa.a:Lfxu;
        //  3722: invokevirtual   cmt.a:(Lfxu;)V
        //  3725: aload           18
        //  3727: getfield        cde.o:Lkjm;
        //  3730: astore          16
        //  3732: new             Lcdb;
        //  3735: astore          4
        //  3737: aload           4
        //  3739: aload           18
        //  3741: aload_2        
        //  3742: invokespecial   cdb.<init>:(Lcde;Lcfo;)V
        //  3745: aload           16
        //  3747: aload           4
        //  3749: invokevirtual   kjm.b:(Ljava/lang/Runnable;)V
        //  3752: aload           8
        //  3754: getfield        cay.h:Lccc;
        //  3757: astore          27
        //  3759: new             Lcce;
        //  3762: astore          4
        //  3764: aload           27
        //  3766: checkcast       Lccf;
        //  3769: getfield        ccf.a:Lpii;
        //  3772: invokeinterface pii.get:()Ljava/lang/Object;
        //  3777: checkcast       Ljava/util/concurrent/Executor;
        //  3780: astore          28
        //  3782: aload           28
        //  3784: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  3787: pop            
        //  3788: aload           27
        //  3790: checkcast       Lccf;
        //  3793: getfield        ccf.b:Lpii;
        //  3796: invokeinterface pii.get:()Ljava/lang/Object;
        //  3801: checkcast       Lkjm;
        //  3804: astore          29
        //  3806: aload           29
        //  3808: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  3811: pop            
        //  3812: aload           27
        //  3814: checkcast       Lccf;
        //  3817: getfield        ccf.c:Lpii;
        //  3820: invokeinterface pii.get:()Ljava/lang/Object;
        //  3825: checkcast       Lgkw;
        //  3828: astore          9
        //  3830: aload           9
        //  3832: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  3835: pop            
        //  3836: aload           27
        //  3838: checkcast       Lccf;
        //  3841: getfield        ccf.d:Lpii;
        //  3844: invokeinterface pii.get:()Ljava/lang/Object;
        //  3849: checkcast       Litn;
        //  3852: astore          30
        //  3854: aload           30
        //  3856: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  3859: pop            
        //  3860: aload           27
        //  3862: checkcast       Lccf;
        //  3865: getfield        ccf.e:Lpii;
        //  3868: checkcast       Lcqt;
        //  3871: invokevirtual   cqt.a:()Lcqs;
        //  3874: astore          25
        //  3876: aload           27
        //  3878: checkcast       Lccf;
        //  3881: getfield        ccf.f:Lpii;
        //  3884: invokeinterface pii.get:()Ljava/lang/Object;
        //  3889: checkcast       Lcde;
        //  3892: astore          11
        //  3894: aload           11
        //  3896: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  3899: pop            
        //  3900: aload           27
        //  3902: checkcast       Lccf;
        //  3905: getfield        ccf.g:Lpii;
        //  3908: invokeinterface pii.get:()Ljava/lang/Object;
        //  3913: checkcast       Lcfr;
        //  3916: astore          26
        //  3918: aload           26
        //  3920: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  3923: pop            
        //  3924: aload           27
        //  3926: checkcast       Lccf;
        //  3929: getfield        ccf.h:Lpii;
        //  3932: invokeinterface pii.get:()Ljava/lang/Object;
        //  3937: checkcast       Lcqu;
        //  3940: astore          31
        //  3942: aload           31
        //  3944: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  3947: pop            
        //  3948: aload           27
        //  3950: checkcast       Lccf;
        //  3953: getfield        ccf.i:Lpii;
        //  3956: invokeinterface pii.get:()Ljava/lang/Object;
        //  3961: astore          15
        //  3963: aload           27
        //  3965: checkcast       Lccf;
        //  3968: getfield        ccf.j:Lpii;
        //  3971: invokeinterface pii.get:()Ljava/lang/Object;
        //  3976: checkcast       Lcid;
        //  3979: astore          32
        //  3981: aload           32
        //  3983: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  3986: pop            
        //  3987: aload           27
        //  3989: checkcast       Lccf;
        //  3992: getfield        ccf.k:Lpii;
        //  3995: invokeinterface pii.get:()Ljava/lang/Object;
        //  4000: checkcast       Lcfm;
        //  4003: astore          18
        //  4005: aload           18
        //  4007: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  4010: pop            
        //  4011: aload           27
        //  4013: checkcast       Lccf;
        //  4016: getfield        ccf.l:Lpii;
        //  4019: invokeinterface pii.get:()Ljava/lang/Object;
        //  4024: checkcast       Lcrg;
        //  4027: astore          21
        //  4029: aload           21
        //  4031: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  4034: pop            
        //  4035: aload           27
        //  4037: checkcast       Lccf;
        //  4040: getfield        ccf.m:Lpii;
        //  4043: checkcast       Lfnh;
        //  4046: invokevirtual   fnh.a:()Lbjx;
        //  4049: astore          10
        //  4051: aload           27
        //  4053: checkcast       Lccf;
        //  4056: getfield        ccf.n:Lpii;
        //  4059: invokeinterface pii.get:()Ljava/lang/Object;
        //  4064: checkcast       Lfwk;
        //  4067: astore          33
        //  4069: aload           33
        //  4071: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  4074: pop            
        //  4075: aload           27
        //  4077: checkcast       Lccf;
        //  4080: getfield        ccf.o:Lpii;
        //  4083: checkcast       Lcqq;
        //  4086: invokevirtual   cqq.a:()Lcqp;
        //  4089: astore          34
        //  4091: aload           27
        //  4093: checkcast       Lccf;
        //  4096: getfield        ccf.p:Lpii;
        //  4099: invokeinterface pii.get:()Ljava/lang/Object;
        //  4104: checkcast       Lhyi;
        //  4107: astore          16
        //  4109: aload           16
        //  4111: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  4114: pop            
        //  4115: aload           27
        //  4117: checkcast       Lccf;
        //  4120: getfield        ccf.q:Lpii;
        //  4123: invokeinterface pii.get:()Ljava/lang/Object;
        //  4128: checkcast       Lckg;
        //  4131: astore          6
        //  4133: aload           6
        //  4135: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  4138: pop            
        //  4139: aload           27
        //  4141: checkcast       Lccf;
        //  4144: getfield        ccf.r:Lpii;
        //  4147: checkcast       Lcpg;
        //  4150: invokevirtual   cpg.a:()Lniz;
        //  4153: astore          23
        //  4155: aload           27
        //  4157: checkcast       Lccf;
        //  4160: getfield        ccf.s:Lpii;
        //  4163: checkcast       Lcjk;
        //  4166: invokevirtual   cjk.a:()Lcjj;
        //  4169: astore          13
        //  4171: aload           27
        //  4173: checkcast       Lccf;
        //  4176: getfield        ccf.t:Lpii;
        //  4179: invokeinterface pii.get:()Ljava/lang/Object;
        //  4184: checkcast       Lcxl;
        //  4187: astore          35
        //  4189: aload           35
        //  4191: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  4194: pop            
        //  4195: aload           27
        //  4197: checkcast       Lccf;
        //  4200: getfield        ccf.u:Lpii;
        //  4203: invokeinterface pii.get:()Ljava/lang/Object;
        //  4208: astore          14
        //  4210: aload           27
        //  4212: checkcast       Lccf;
        //  4215: getfield        ccf.v:Lpii;
        //  4218: invokeinterface pii.get:()Ljava/lang/Object;
        //  4223: checkcast       Ljava/util/concurrent/ScheduledExecutorService;
        //  4226: astore          7
        //  4228: aload           7
        //  4230: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  4233: pop            
        //  4234: aload           27
        //  4236: checkcast       Lccf;
        //  4239: getfield        ccf.w:Lpii;
        //  4242: invokeinterface pii.get:()Ljava/lang/Object;
        //  4247: checkcast       Lhwl;
        //  4250: astore          24
        //  4252: aload           24
        //  4254: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  4257: pop            
        //  4258: aload           27
        //  4260: checkcast       Lccf;
        //  4263: getfield        ccf.x:Lpii;
        //  4266: astore          12
        //  4268: aload           27
        //  4270: checkcast       Lccf;
        //  4273: getfield        ccf.y:Lpii;
        //  4276: checkcast       Lour;
        //  4279: invokevirtual   our.a:()Loui;
        //  4282: astore          36
        //  4284: aload           36
        //  4286: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  4289: pop            
        //  4290: aload           27
        //  4292: checkcast       Lccf;
        //  4295: getfield        ccf.z:Lpii;
        //  4298: invokeinterface pii.get:()Ljava/lang/Object;
        //  4303: checkcast       Ljcs;
        //  4306: astore          22
        //  4308: aload           22
        //  4310: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  4313: pop            
        //  4314: aload           27
        //  4316: checkcast       Lccf;
        //  4319: getfield        ccf.A:Lpii;
        //  4322: invokeinterface pii.get:()Ljava/lang/Object;
        //  4327: checkcast       Lceo;
        //  4330: astore          27
        //  4332: aload           27
        //  4334: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  4337: pop            
        //  4338: aload           4
        //  4340: aload           28
        //  4342: aload           29
        //  4344: aload           9
        //  4346: aload           30
        //  4348: aload           25
        //  4350: aload           11
        //  4352: aload           26
        //  4354: aload           31
        //  4356: aload           15
        //  4358: aload           32
        //  4360: aload           18
        //  4362: aload           21
        //  4364: aload           10
        //  4366: aload           33
        //  4368: aload           34
        //  4370: aload           16
        //  4372: aload           6
        //  4374: aload           23
        //  4376: aload           13
        //  4378: aload           35
        //  4380: aload           14
        //  4382: checkcast       Lcij;
        //  4385: aload           7
        //  4387: aload           24
        //  4389: aload           12
        //  4391: aload           36
        //  4393: aload           22
        //  4395: aload           27
        //  4397: aload_2        
        //  4398: invokespecial   cce.<init>:(Ljava/util/concurrent/Executor;Lkjm;Lgkw;Litn;Lcqs;Lcde;Lcfr;Lcqu;Lccq;Lcid;Lcfm;Lcrg;Lbjx;Lfwk;Lcqp;Lhyi;Lckg;Lniz;Lcjj;Lcxl;Lcij;Ljava/util/concurrent/ScheduledExecutorService;Lhwl;Lpii;Loui;Ljcs;Lceo;Lcfo;)V
        //  4401: aload           8
        //  4403: getfield        cay.f:Lcra;
        //  4406: astore          16
        //  4408: aload_2        
        //  4409: getfield        cfo.g:Lkre;
        //  4412: astore          18
        //  4414: aload           16
        //  4416: getfield        cra.c:Lcqp;
        //  4419: aload_2        
        //  4420: invokevirtual   cqp.a:(Lcfo;)Z
        //  4423: ifeq            4434
        //  4426: aload           16
        //  4428: getfield        cra.c:Lcqp;
        //  4431: invokevirtual   cqp.b:()V
        //  4434: aload_2        
        //  4435: getfield        cfo.y:Llfu;
        //  4438: aload           18
        //  4440: aload           18
        //  4442: invokestatic    kqp.g:(Lkre;)Lkqp;
        //  4445: getstatic       nii.a:Lnii;
        //  4448: invokestatic    ixs.b:(Llfu;Lkre;Lkqp;Lniz;)Lixs;
        //  4451: astore          18
        //  4453: aload           16
        //  4455: getfield        cra.b:Lcek;
        //  4458: invokeinterface cek.a:()Ljbm;
        //  4463: getstatic       jbm.c:Ljbm;
        //  4466: if_acmpne       4476
        //  4469: aload           16
        //  4471: getfield        cra.d:Lniz;
        //  4474: astore          21
        //  4476: aload           16
        //  4478: getfield        cra.a:Lixn;
        //  4481: aload           18
        //  4483: getstatic       nii.a:Lnii;
        //  4486: invokevirtual   ixn.f:(Lixs;Lniz;)Loey;
        //  4489: astore          16
        //  4491: new             Lcax;
        //  4494: astore          18
        //  4496: aload           18
        //  4498: aload           8
        //  4500: aload_2        
        //  4501: invokespecial   cax.<init>:(Lcay;Lcfo;)V
        //  4504: aload           18
        //  4506: aload           8
        //  4508: getfield        cay.a:Lofa;
        //  4511: invokestatic    ofi.q:(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Loey;
        //  4514: astore          21
        //  4516: new             Lcaw;
        //  4519: astore          18
        //  4521: aload           18
        //  4523: aload           8
        //  4525: aload_2        
        //  4526: invokespecial   caw.<init>:(Lcay;Lcfo;)V
        //  4529: aload           21
        //  4531: aload           18
        //  4533: aload           8
        //  4535: getfield        cay.a:Lofa;
        //  4538: invokestatic    odg.i:(Loey;Lodp;Ljava/util/concurrent/Executor;)Loey;
        //  4541: astore          21
        //  4543: iconst_2       
        //  4544: anewarray       Loey;
        //  4547: dup            
        //  4548: iconst_0       
        //  4549: aload           16
        //  4551: aastore        
        //  4552: dup            
        //  4553: iconst_1       
        //  4554: aload           21
        //  4556: aastore        
        //  4557: invokestatic    ofi.h:([Loey;)Loer;
        //  4560: astore          18
        //  4562: new             Lcav;
        //  4565: astore_2       
        //  4566: aload_2        
        //  4567: aload           8
        //  4569: aload           4
        //  4571: aload           16
        //  4573: aload           21
        //  4575: aload           5
        //  4577: invokespecial   cav.<init>:(Lcay;Lcce;Loey;Loey;Lksh;)V
        //  4580: aload           18
        //  4582: aload_2        
        //  4583: aload           8
        //  4585: getfield        cay.a:Lofa;
        //  4588: invokevirtual   oer.b:(Lodo;Ljava/util/concurrent/Executor;)Loey;
        //  4591: astore_2       
        //  4592: new             Lcas;
        //  4595: astore          4
        //  4597: aload           4
        //  4599: aload           8
        //  4601: invokespecial   cas.<init>:(Lcay;)V
        //  4604: aload_2        
        //  4605: aload           4
        //  4607: aload           8
        //  4609: getfield        cay.b:Lkjm;
        //  4612: invokestatic    knf.f:(Loey;Lkqq;Ljava/util/concurrent/Executor;)V
        //  4615: aload_0        
        //  4616: aload_2        
        //  4617: putfield        cbh.I:Loey;
        //  4620: new             Lcbg;
        //  4623: astore          4
        //  4625: aload           4
        //  4627: aload_0        
        //  4628: iload_1        
        //  4629: aload_2        
        //  4630: invokespecial   cbg.<init>:(Lcbh;ILoey;)V
        //  4633: aload_2        
        //  4634: aload           4
        //  4636: aload_0        
        //  4637: getfield        cbh.C:Ljava/util/concurrent/Executor;
        //  4640: invokestatic    ofi.w:(Loey;Loen;Ljava/util/concurrent/Executor;)V
        //  4643: aload_3        
        //  4644: monitorexit    
        //  4645: return         
        //  4646: astore_2       
        //  4647: goto            5318
        //  4650: new             Ljava/lang/StringBuilder;
        //  4653: astore          4
        //  4655: aload           4
        //  4657: invokespecial   java/lang/StringBuilder.<init>:()V
        //  4660: aload           22
        //  4662: getfield        cfn.a:Llfj;
        //  4665: ifnonnull       4677
        //  4668: aload           4
        //  4670: ldc_w           " cameraId"
        //  4673: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4676: pop            
        //  4677: aload           22
        //  4679: getfield        cfn.b:Llfj;
        //  4682: ifnonnull       4694
        //  4685: aload           4
        //  4687: ldc_w           " streamCameraId"
        //  4690: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4693: pop            
        //  4694: aload           22
        //  4696: getfield        cfn.c:Lcfa;
        //  4699: ifnonnull       4711
        //  4702: aload           4
        //  4704: ldc_w           " camcorderCharacteristics"
        //  4707: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4710: pop            
        //  4711: aload           22
        //  4713: getfield        cfn.d:Lkmt;
        //  4716: ifnonnull       4728
        //  4719: aload           4
        //  4721: ldc_w           " captureRate"
        //  4724: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4727: pop            
        //  4728: aload           22
        //  4730: getfield        cfn.e:Lkmv;
        //  4733: ifnonnull       4745
        //  4736: aload           4
        //  4738: ldc_w           " videoResolution"
        //  4741: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4744: pop            
        //  4745: aload           22
        //  4747: getfield        cfn.g:Lkre;
        //  4750: ifnonnull       4762
        //  4753: aload           4
        //  4755: ldc_w           " previewSize"
        //  4758: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4761: pop            
        //  4762: aload           22
        //  4764: getfield        cfn.h:Lknc;
        //  4767: ifnonnull       4779
        //  4770: aload           4
        //  4772: ldc_w           " videoEncoderProfile"
        //  4775: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4778: pop            
        //  4779: aload           22
        //  4781: getfield        cfn.m:Ljava/lang/Boolean;
        //  4784: ifnonnull       4796
        //  4787: aload           4
        //  4789: ldc_w           " shouldRecordLocationIfPermitted"
        //  4792: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4795: pop            
        //  4796: aload           22
        //  4798: getfield        cfn.n:Landroid/util/Range;
        //  4801: ifnonnull       4813
        //  4804: aload           4
        //  4806: ldc_w           " previewFpsRange"
        //  4809: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4812: pop            
        //  4813: aload           22
        //  4815: getfield        cfn.o:Landroid/util/Range;
        //  4818: ifnonnull       4830
        //  4821: aload           4
        //  4823: ldc_w           " recordFpsRange"
        //  4826: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4829: pop            
        //  4830: aload           22
        //  4832: getfield        cfn.p:Ljava/lang/Boolean;
        //  4835: ifnonnull       4847
        //  4838: aload           4
        //  4840: ldc_w           " useContinuousAutoFocusOnDuringRecording"
        //  4843: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4846: pop            
        //  4847: aload           22
        //  4849: getfield        cfn.q:Ljava/lang/Boolean;
        //  4852: ifnonnull       4864
        //  4855: aload           4
        //  4857: ldc_w           " shouldUnlockAfAeWithSceneChange"
        //  4860: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4863: pop            
        //  4864: aload           22
        //  4866: getfield        cfn.r:Ljava/lang/Boolean;
        //  4869: ifnonnull       4881
        //  4872: aload           4
        //  4874: ldc_w           " shouldDetectFace"
        //  4877: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4880: pop            
        //  4881: aload           22
        //  4883: getfield        cfn.s:Ljava/lang/Boolean;
        //  4886: ifnonnull       4898
        //  4889: aload           4
        //  4891: ldc_w           " shouldVideoStabilizationOn"
        //  4894: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4897: pop            
        //  4898: aload           22
        //  4900: getfield        cfn.t:Ljava/lang/Boolean;
        //  4903: ifnonnull       4915
        //  4906: aload           4
        //  4908: ldc_w           " useOpticalStabilization"
        //  4911: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4914: pop            
        //  4915: aload           22
        //  4917: getfield        cfn.u:Ljava/lang/Boolean;
        //  4920: ifnonnull       4932
        //  4923: aload           4
        //  4925: ldc_w           " useLlv"
        //  4928: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4931: pop            
        //  4932: aload           22
        //  4934: getfield        cfn.v:Lnns;
        //  4937: ifnonnull       4949
        //  4940: aload           4
        //  4942: ldc_w           " allSupportedCaptureRates"
        //  4945: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4948: pop            
        //  4949: aload           22
        //  4951: getfield        cfn.w:Lnns;
        //  4954: ifnonnull       4966
        //  4957: aload           4
        //  4959: ldc_w           " supportedCaptureRates"
        //  4962: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4965: pop            
        //  4966: aload           22
        //  4968: getfield        cfn.x:Lnns;
        //  4971: ifnonnull       4983
        //  4974: aload           4
        //  4976: ldc_w           " supportedVideoResolutions"
        //  4979: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4982: pop            
        //  4983: aload           22
        //  4985: getfield        cfn.y:Llfu;
        //  4988: ifnonnull       5000
        //  4991: aload           4
        //  4993: ldc_w           " cameraFacing"
        //  4996: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4999: pop            
        //  5000: aload           22
        //  5002: getfield        cfn.z:Lhio;
        //  5005: ifnonnull       5017
        //  5008: aload           4
        //  5010: ldc_w           " captureSessionType"
        //  5013: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  5016: pop            
        //  5017: aload           22
        //  5019: getfield        cfn.A:Ljava/lang/Integer;
        //  5022: ifnonnull       5034
        //  5025: aload           4
        //  5027: ldc_w           " sessionId"
        //  5030: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  5033: pop            
        //  5034: aload           22
        //  5036: getfield        cfn.B:Ljava/lang/Boolean;
        //  5039: ifnonnull       5051
        //  5042: aload           4
        //  5044: ldc_w           " useMediaCodec"
        //  5047: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  5050: pop            
        //  5051: aload           22
        //  5053: getfield        cfn.C:Ljava/lang/Boolean;
        //  5056: ifnonnull       5068
        //  5059: aload           4
        //  5061: ldc_w           " topShotEnabled"
        //  5064: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  5067: pop            
        //  5068: aload           22
        //  5070: getfield        cfn.D:Ljava/lang/Boolean;
        //  5073: ifnonnull       5085
        //  5076: aload           4
        //  5078: ldc_w           " shouldSupportSpeechMode"
        //  5081: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  5084: pop            
        //  5085: new             Ljava/lang/IllegalStateException;
        //  5088: astore_2       
        //  5089: aload           4
        //  5091: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  5094: astore          4
        //  5096: aload           4
        //  5098: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  5101: invokevirtual   java/lang/String.length:()I
        //  5104: istore_1       
        //  5105: new             Ljava/lang/StringBuilder;
        //  5108: astore          16
        //  5110: aload           16
        //  5112: iload_1        
        //  5113: bipush          28
        //  5115: iadd           
        //  5116: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  5119: aload           16
        //  5121: ldc_w           "Missing required properties:"
        //  5124: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  5127: pop            
        //  5128: aload           16
        //  5130: aload           4
        //  5132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  5135: pop            
        //  5136: aload_2        
        //  5137: aload           16
        //  5139: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  5142: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  5145: aload_2        
        //  5146: athrow         
        //  5147: new             Ljava/lang/NullPointerException;
        //  5150: astore_2       
        //  5151: aload_2        
        //  5152: ldc_w           "Null captureSessionType"
        //  5155: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5158: aload_2        
        //  5159: athrow         
        //  5160: new             Ljava/lang/NullPointerException;
        //  5163: astore_2       
        //  5164: aload_2        
        //  5165: ldc_w           "Null supportedVideoResolutions"
        //  5168: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5171: aload_2        
        //  5172: athrow         
        //  5173: new             Ljava/lang/NullPointerException;
        //  5176: astore_2       
        //  5177: aload_2        
        //  5178: ldc_w           "Null supportedCaptureRates"
        //  5181: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5184: aload_2        
        //  5185: athrow         
        //  5186: new             Ljava/lang/NullPointerException;
        //  5189: astore_2       
        //  5190: aload_2        
        //  5191: ldc_w           "Null allSupportedCaptureRates"
        //  5194: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5197: aload_2        
        //  5198: athrow         
        //  5199: new             Ljava/lang/NullPointerException;
        //  5202: astore_2       
        //  5203: aload_2        
        //  5204: ldc_w           "Null cameraFacing"
        //  5207: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5210: aload_2        
        //  5211: athrow         
        //  5212: new             Ljava/lang/NullPointerException;
        //  5215: astore_2       
        //  5216: aload_2        
        //  5217: ldc_w           "Null recordFpsRange"
        //  5220: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5223: aload_2        
        //  5224: athrow         
        //  5225: new             Ljava/lang/NullPointerException;
        //  5228: astore_2       
        //  5229: aload_2        
        //  5230: ldc_w           "Null previewFpsRange"
        //  5233: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5236: aload_2        
        //  5237: athrow         
        //  5238: new             Ljava/lang/NullPointerException;
        //  5241: astore_2       
        //  5242: aload_2        
        //  5243: ldc_w           "Null camcorderCharacteristics"
        //  5246: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5249: aload_2        
        //  5250: athrow         
        //  5251: new             Ljava/lang/NullPointerException;
        //  5254: astore_2       
        //  5255: aload_2        
        //  5256: ldc_w           "Null videoResolution"
        //  5259: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5262: aload_2        
        //  5263: athrow         
        //  5264: new             Ljava/lang/NullPointerException;
        //  5267: astore_2       
        //  5268: aload_2        
        //  5269: ldc_w           "Null captureRate"
        //  5272: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5275: aload_2        
        //  5276: athrow         
        //  5277: new             Ljava/lang/NullPointerException;
        //  5280: astore_2       
        //  5281: aload_2        
        //  5282: ldc_w           "Null streamCameraId"
        //  5285: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5288: aload_2        
        //  5289: athrow         
        //  5290: new             Ljava/lang/NullPointerException;
        //  5293: astore_2       
        //  5294: aload_2        
        //  5295: ldc_w           "Null cameraId"
        //  5298: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5301: aload_2        
        //  5302: athrow         
        //  5303: astore_2       
        //  5304: goto            5308
        //  5307: astore_2       
        //  5308: aload           9
        //  5310: monitorexit    
        //  5311: aload_2        
        //  5312: athrow         
        //  5313: astore_2       
        //  5314: goto            5308
        //  5317: astore_2       
        //  5318: aload_3        
        //  5319: monitorexit    
        //  5320: aload_2        
        //  5321: athrow         
        //  5322: astore_2       
        //  5323: goto            5318
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  9      170    5317   5318   Any
        //  184    194    5317   5318   Any
        //  194    201    5307   5308   Any
        //  206    209    5307   5308   Any
        //  218    312    5307   5308   Any
        //  322    490    5307   5308   Any
        //  490    499    5307   5308   Any
        //  504    538    5303   5307   Any
        //  541    583    5303   5307   Any
        //  603    629    5303   5307   Any
        //  634    639    5303   5307   Any
        //  642    649    5303   5307   Any
        //  654    659    5303   5307   Any
        //  662    694    5303   5307   Any
        //  694    703    5303   5307   Any
        //  703    740    5303   5307   Any
        //  745    755    5303   5307   Any
        //  761    770    5303   5307   Any
        //  773    802    5303   5307   Any
        //  807    839    5303   5307   Any
        //  843    848    5303   5307   Any
        //  851    861    5303   5307   Any
        //  865    870    5303   5307   Any
        //  873    879    5303   5307   Any
        //  879    888    5303   5307   Any
        //  888    955    5303   5307   Any
        //  955    1026   5303   5307   Any
        //  1053   1063   5303   5307   Any
        //  1080   1106   5303   5307   Any
        //  1115   1142   5303   5307   Any
        //  1157   1180   5303   5307   Any
        //  1180   1216   5303   5307   Any
        //  1219   1248   5303   5307   Any
        //  1251   1292   5303   5307   Any
        //  1295   1331   5303   5307   Any
        //  1334   1362   5303   5307   Any
        //  1365   1376   5303   5307   Any
        //  1379   1391   5303   5307   Any
        //  1394   1405   5303   5307   Any
        //  1405   1438   5303   5307   Any
        //  1445   1497   5303   5307   Any
        //  1504   1509   5303   5307   Any
        //  1512   1535   5303   5307   Any
        //  1538   1601   5303   5307   Any
        //  1601   1640   5303   5307   Any
        //  1647   1683   5303   5307   Any
        //  1683   1697   5303   5307   Any
        //  1697   1711   5303   5307   Any
        //  1721   1731   5303   5307   Any
        //  1734   1741   5303   5307   Any
        //  1744   1749   5303   5307   Any
        //  1749   1801   5303   5307   Any
        //  1804   1820   5303   5307   Any
        //  1823   1830   5303   5307   Any
        //  1830   1946   5303   5307   Any
        //  1949   1972   5303   5307   Any
        //  1978   2028   5303   5307   Any
        //  2035   2057   5303   5307   Any
        //  2061   2110   5303   5307   Any
        //  2121   2151   5303   5307   Any
        //  2154   2169   5303   5307   Any
        //  2172   2193   5303   5307   Any
        //  2196   2203   5303   5307   Any
        //  2203   2242   5303   5307   Any
        //  2251   2259   5303   5307   Any
        //  2268   2318   5303   5307   Any
        //  2321   2332   5303   5307   Any
        //  2332   2384   5303   5307   Any
        //  2389   2396   5303   5307   Any
        //  2401   2408   5303   5307   Any
        //  2413   2420   5303   5307   Any
        //  2425   2432   5303   5307   Any
        //  2437   2484   5303   5307   Any
        //  2488   2493   5303   5307   Any
        //  2499   2527   5303   5307   Any
        //  2530   2535   5303   5307   Any
        //  2535   2542   5303   5307   Any
        //  2546   2550   5303   5307   Any
        //  2553   2579   5303   5307   Any
        //  2582   2586   5303   5307   Any
        //  2586   2618   5303   5307   Any
        //  2622   2636   5303   5307   Any
        //  2640   2646   5303   5307   Any
        //  2651   2697   5303   5307   Any
        //  2712   2746   5303   5307   Any
        //  2752   2767   5303   5307   Any
        //  2767   2801   5303   5307   Any
        //  2810   2878   5303   5307   Any
        //  2887   2911   5303   5307   Any
        //  2920   2973   5303   5307   Any
        //  2983   3010   5303   5307   Any
        //  3016   3025   5303   5307   Any
        //  3029   3055   5303   5307   Any
        //  3059   3085   5303   5307   Any
        //  3089   3107   5303   5307   Any
        //  3110   3114   5303   5307   Any
        //  3118   3137   5303   5307   Any
        //  3143   3175   5303   5307   Any
        //  3184   3239   5303   5307   Any
        //  3244   3251   5303   5307   Any
        //  3256   3263   5303   5307   Any
        //  3268   3275   5303   5307   Any
        //  3280   3287   5303   5307   Any
        //  3292   3299   5303   5307   Any
        //  3304   3311   5303   5307   Any
        //  3316   3323   5303   5307   Any
        //  3328   3464   5303   5307   Any
        //  3467   3643   5303   5307   Any
        //  3643   4434   4646   4650   Any
        //  4434   4476   4646   4650   Any
        //  4476   4615   4646   4650   Any
        //  4615   4645   5322   5326   Any
        //  4650   4677   5313   5317   Any
        //  4677   4694   5313   5317   Any
        //  4694   4711   5313   5317   Any
        //  4711   4728   5313   5317   Any
        //  4728   4745   5313   5317   Any
        //  4745   4762   5313   5317   Any
        //  4762   4779   5313   5317   Any
        //  4779   4796   5313   5317   Any
        //  4796   4813   5313   5317   Any
        //  4813   4830   5313   5317   Any
        //  4830   4847   5313   5317   Any
        //  4847   4864   5313   5317   Any
        //  4864   4881   5313   5317   Any
        //  4881   4898   5313   5317   Any
        //  4898   4915   5313   5317   Any
        //  4915   4932   5313   5317   Any
        //  4932   4949   5313   5317   Any
        //  4949   4966   5313   5317   Any
        //  4966   4983   5313   5317   Any
        //  4983   5000   5313   5317   Any
        //  5000   5017   5313   5317   Any
        //  5017   5034   5313   5317   Any
        //  5034   5051   5313   5317   Any
        //  5051   5068   5313   5317   Any
        //  5068   5085   5313   5317   Any
        //  5085   5147   5313   5317   Any
        //  5147   5160   5313   5317   Any
        //  5160   5173   5313   5317   Any
        //  5173   5186   5313   5317   Any
        //  5186   5199   5313   5317   Any
        //  5199   5212   5313   5317   Any
        //  5212   5225   5313   5317   Any
        //  5225   5238   5313   5317   Any
        //  5238   5251   5313   5317   Any
        //  5251   5264   5313   5317   Any
        //  5264   5277   5313   5317   Any
        //  5277   5290   5313   5317   Any
        //  5290   5303   5313   5317   Any
        //  5308   5311   5313   5317   Any
        //  5311   5313   5322   5326   Any
        //  5318   5320   5322   5326   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.StackOverflowError
        //     at java.util.concurrent.ConcurrentHashMap.get(Unknown Source)
        //     at com.strobel.assembler.metadata.MetadataSystem.resolveType(MetadataSystem.java:117)
        //     at com.strobel.decompiler.NoRetryMetadataSystem.resolveType(DecompilerDriver.java:475)
        //     at com.strobel.assembler.metadata.MetadataSystem.resolveCore(MetadataSystem.java:81)
        //     at com.strobel.assembler.metadata.MetadataResolver.resolve(MetadataResolver.java:104)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.resolve(CoreMetadataFactory.java:616)
        //     at com.strobel.assembler.metadata.MetadataHelper$9.visitClassType(MetadataHelper.java:2292)
        //     at com.strobel.assembler.metadata.MetadataHelper$9.visitClassType(MetadataHelper.java:2240)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.accept(CoreMetadataFactory.java:577)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:21)
        //     at com.strobel.assembler.metadata.MetadataHelper.getSuperType(MetadataHelper.java:1369)
        //     at com.strobel.assembler.metadata.MetadataHelper$8.visitClassType(MetadataHelper.java:2163)
        //     at com.strobel.assembler.metadata.MetadataHelper$8.visitClassType(MetadataHelper.java:2146)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.accept(CoreMetadataFactory.java:577)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.asSuper(MetadataHelper.java:833)
        //     at com.strobel.assembler.metadata.MetadataHelper$11.visitClassType(MetadataHelper.java:2894)
        //     at com.strobel.assembler.metadata.MetadataHelper$11.visitClassType(MetadataHelper.java:2887)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedType.accept(CoreMetadataFactory.java:577)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.asSubType(MetadataHelper.java:826)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1507)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2535)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2535)
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferBinaryExpression(TypeAnalysis.java:2213)
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2689)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2689)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:892)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.invalidateDependentExpressions(TypeAnalysis.java:771)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1022)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2689)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2535)
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2715)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2535)
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2483)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:782)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:778)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1510)
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
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1072)
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
    
    public final void a(final ceh ceh) {
        this.f.add(ceh);
    }
    
    public final void b() {
        synchronized (this.v) {
            this.r = this.B.a();
        }
    }
    
    public final void c() {
        synchronized (this.v) {
            if (this.b.a() == jbm.f) {
                cbh.a.c().E(300).o("Camera switch not supported for slow motion");
                return;
            }
            this.d.i(new cbb(this));
        }
    }
    
    public final void d() {
        synchronized (this.v) {
            if (this.q()) {
                final cce q = this.q;
                if (q != null) {
                    kjm.a();
                    synchronized (q.f) {
                        final ccs y = q.y;
                        if (y != null) {
                            synchronized (y.f) {
                                if (y.E != 2) {
                                    monitorexit(y.f);
                                }
                                else {
                                    final cil b = y.B;
                                    b.getClass();
                                    b.a.g();
                                    y.g.c();
                                    y.D.a.b(2131886105);
                                    y.u.b(1);
                                    y.j(3);
                                }
                            }
                        }
                        return;
                    }
                }
            }
            cbh.a.c().E(302).r("onPauseButtonClicked ignored with state: %s", ((kkz)this.r.f).d);
        }
    }
    
    public final void e(final int n) {
        synchronized (this.v) {
            if (this.q()) {
                final cce q = this.q;
                boolean b = false;
                if (q != null) {
                    final Object f = q.f;
                    monitorenter(f);
                    Label_0044: {
                        if (n != 0) {
                            break Label_0044;
                        }
                        try {
                            q.w = false;
                        }
                        finally {
                            monitorexit(f);
                        }
                    }
                }
                final klv e = this.r.e;
                if (n == 0 && (boolean)((kkz)e).d) {
                    b = true;
                }
                e.aR(b);
            }
        }
    }
    
    public final void f() {
        synchronized (this.v) {
            if (this.q()) {
                final cce q = this.q;
                if (q != null) {
                    kjm.a();
                    synchronized (q.f) {
                        final ccs y = q.y;
                        if (y != null) {
                            synchronized (y.f) {
                                if (y.E != 3) {
                                    monitorexit(y.f);
                                }
                                else {
                                    y.D.a.b(2131886106);
                                    y.u.b(2);
                                    y.s.schedule(new cck(y), 300L, TimeUnit.MILLISECONDS);
                                }
                            }
                        }
                        return;
                    }
                }
            }
            cbh.a.c().E(305).r("onResumeButtonClicked ignored with state: %s", ((kkz)this.r.f).d);
        }
    }
    
    public final void g(final boolean b) {
        synchronized (this.v) {
            if (this.q()) {
                final cce q = this.q;
                if (q != null) {
                    q.k(b);
                    if ((this.t || this.s) && this.m.k(cxr.ar)) {
                        this.h.A(false);
                        this.t = false;
                        this.s = false;
                    }
                    return;
                }
            }
            if (((kkz)this.r.f).d == cfd.b) {
                this.t = true;
            }
            else {
                cbh.a.c().E(307).r("onShutterButtonClicked ignored with state: %s", ((kkz)this.r.f).d);
            }
        }
    }
    
    public final void h() {
        synchronized (this.v) {
            if (this.q()) {
                final cce q = this.q;
                if (q != null) {
                    kjm.a();
                    synchronized (q.f) {
                        final ccs y = q.y;
                        if (y != null) {
                            kjm.a();
                            synchronized (y.f) {
                                final int e = y.E;
                                if (e == 2 || e == 3) {
                                    y.d.k(false);
                                    final oey a = y.q.a();
                                    y.d.p.l();
                                    ofi.w(a, new ccp(y), y.c);
                                }
                            }
                        }
                        return;
                    }
                }
            }
            cbh.a.c().E(310).r("onSnapshotButtonClicked ignored with state: %s", ((kkz)this.r.f).d);
        }
    }
    
    public final void i() {
        synchronized (this.v) {
            if (this.q()) {
                final cce q = this.q;
                if (q != null) {
                    synchronized (q.f) {
                        q.w = true;
                        return;
                    }
                }
            }
            cbh.a.c().E(312).r("onThumbnailButtonClicked ignored with state: %s", ((kkz)this.r.f).d);
        }
    }
    
    public final void j(final boolean b) {
        synchronized (this.v) {
            if (this.q()) {
                final cce q = this.q;
                if (q != null) {
                    final Object f = q.f;
                    monitorenter(f);
                    if (!b) {
                        return;
                    }
                    try {
                        q.w = false;
                        return;
                    }
                    finally {
                        monitorexit(f);
                    }
                }
            }
            cbh.a.c().E(314).r("onWindowFocusChanged ignored with state: %s", ((kkz)this.r.f).d);
        }
    }
    
    public final void k(final ceh ceh) {
        this.f.remove(ceh);
    }
    
    public final void l(final boolean b) {
        synchronized (this.v) {
            if (this.r == null) {
                this.b();
            }
            if (((kkz)this.r.f).d != cfd.a) {
                cbh.a.c().E(316).o("Capture session already started. Ignoring...");
                return;
            }
            final ciu a = ((civ)this.D).a();
            this.H = a;
            Object o = a.f;
            synchronized (o) {
                if (a.d) {
                    monitorexit(o);
                }
                else {
                    if (a.e) {
                        a.a();
                    }
                    a.b();
                    a.a.registerAudioDeviceCallback(a.b, a.c);
                    a.e = true;
                    monitorexit(o);
                }
                this.A.a(cic.a).c(this.H);
                final kjk a2 = this.A.a(cic.a);
                this.o.a(this.p);
                o = new cba(this);
                a2.c((krc)o);
                this.A.a(cic.a).c(this.h.d(this.n));
                o = this.m;
                final cxo a3 = cwv.a;
                ((cxl)o).e();
                if (b) {
                    this.r(2);
                }
            }
        }
    }
    
    public final void m() {
        final Object v = this.v;
        monitorenter(v);
        try {
            this.p();
            final cis h = this.H;
            if (h != null) {
                h.a();
            }
            final cid a = this.A;
            final Iterator iterator = new HashSet(a.a.keySet()).iterator();
            while (iterator.hasNext()) {
                a.b((cic)iterator.next());
            }
            final cfg r = this.r;
            if (r != null) {
                r.a(cfd.a);
            }
            monitorexit(v);
        }
        finally {
            monitorexit(v);
            while (true) {}
        }
    }
    
    public final boolean n() {
        synchronized (this.v) {
            if (((kkz)this.r.f).d == cfd.e) {
                this.g(false);
                return true;
            }
            if (this.m.k(cwv.H) && this.b.a().equals(jbm.f) && this.G.g()) {
                ((cpf)this.G.c()).d();
                return true;
            }
            return false;
        }
    }
    
    public final void o(final int n) {
        synchronized (this.v) {
            this.p();
            this.r(n);
        }
    }
}
