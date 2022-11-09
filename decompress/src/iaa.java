import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Timer;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class iaa
{
    public static final nsd a;
    public final SensorManager A;
    public final SensorEventListener B;
    public final ckn C;
    public final ckt D;
    public final Sensor E;
    public idf F;
    public ida G;
    public idd H;
    public niz I;
    public ofn J;
    public idc K;
    public Timer L;
    public ibh M;
    public kmq N;
    public final hny O;
    private final long P;
    public final AtomicBoolean b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final odq f;
    public final AtomicInteger g;
    public final AtomicInteger h;
    public final AtomicLong i;
    public final AtomicLong j;
    public final AtomicLong k;
    public final AtomicLong l;
    public final AtomicLong m;
    public final AtomicLong n;
    public final AtomicLong o;
    public final AtomicLong p;
    public final AtomicLong q;
    public final AtomicLong r;
    public final AtomicLong s;
    public final AtomicLong t;
    public final crg u;
    public final liz v;
    public final cxl w;
    public final Object x;
    public final pii y;
    public final klv z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/timelapse/FrameSelector");
    }
    
    public iaa(final egb egb, final crg u, final liz v, final pii y, final cxl w, final ckn c, final ckt d, final hny o, final klv z, final byte[] array, final byte[] array2) {
        this.b = new AtomicBoolean(false);
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(true);
        this.f = new odq(null);
        this.g = new AtomicInteger(0);
        this.h = new AtomicInteger(0);
        this.i = new AtomicLong(0L);
        this.j = new AtomicLong(0L);
        this.k = new AtomicLong(0L);
        this.l = new AtomicLong(0L);
        this.m = new AtomicLong(0L);
        this.n = new AtomicLong(0L);
        this.o = new AtomicLong(0L);
        this.p = new AtomicLong(0L);
        this.q = new AtomicLong(0L);
        this.r = new AtomicLong(0L);
        this.s = new AtomicLong(0L);
        this.t = new AtomicLong(0L);
        this.x = new Object();
        this.I = nii.a;
        if (w.k(cyl.b)) {
            this.P = 33000L;
        }
        else {
            this.P = 10000L;
        }
        this.u = u;
        this.v = v;
        this.y = y;
        this.w = w;
        this.E = egb.b().getDefaultSensor(4);
        this.A = egb.b();
        this.C = c;
        this.D = d;
        this.O = o;
        this.z = z;
        this.B = (SensorEventListener)new hzy(this, u);
        this.K = idc.a;
        this.J = ofn.f();
    }
    
    private static final void h(final kvs kvs, final lju lju) {
        lju.close();
        kvs.close();
    }
    
    public final long a() {
        return this.i.get();
    }
    
    public final long b() {
        return this.j.get() - this.i.get();
    }
    
    public final long c() {
        return TimeUnit.SECONDS.toMillis(this.j.get()) / this.K.f;
    }
    
    public final long d() {
        return this.k.get();
    }
    
    final void e() {
        if (this.C.c()) {
            final Sensor e = this.E;
            if (e != null) {
                this.A.unregisterListener(this.B, e);
            }
            final idf f = this.F;
            f.getClass();
            f.c();
        }
    }
    
    public final void f(final long p0, final kvs p1, final lju p2, final niz p3, final niz p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        iaa.b:Ljava/util/concurrent/atomic/AtomicBoolean;
        //     4: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //     7: ifne            59
        //    10: aload_0        
        //    11: getfield        iaa.c:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    14: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //    17: ifne            27
        //    20: aload_3        
        //    21: aload           4
        //    23: invokestatic    iaa.h:(Lkvs;Llju;)V
        //    26: return         
        //    27: aload           5
        //    29: invokevirtual   niz.g:()Z
        //    32: ifeq            59
        //    35: aload           5
        //    37: invokevirtual   niz.c:()Ljava/lang/Object;
        //    40: checkcast       Ljava/lang/Boolean;
        //    43: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    46: ifeq            52
        //    49: goto            59
        //    52: aload_3        
        //    53: aload           4
        //    55: invokestatic    iaa.h:(Lkvs;Llju;)V
        //    58: return         
        //    59: aload           5
        //    61: invokevirtual   niz.g:()Z
        //    64: ifeq            110
        //    67: aload_0        
        //    68: getfield        iaa.h:Ljava/util/concurrent/atomic/AtomicInteger;
        //    71: invokevirtual   java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        //    74: iconst_1       
        //    75: if_icmpgt       110
        //    78: aload           5
        //    80: invokevirtual   niz.c:()Ljava/lang/Object;
        //    83: checkcast       Ljava/lang/Boolean;
        //    86: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    89: ifne            95
        //    92: goto            110
        //    95: aload_0        
        //    96: getfield        iaa.h:Ljava/util/concurrent/atomic/AtomicInteger;
        //    99: invokevirtual   java/util/concurrent/atomic/AtomicInteger.get:()I
        //   102: pop            
        //   103: aload_3        
        //   104: aload           4
        //   106: invokestatic    iaa.h:(Lkvs;Llju;)V
        //   109: return         
        //   110: aload_0        
        //   111: getfield        iaa.N:Lkmq;
        //   114: astore          5
        //   116: aload           5
        //   118: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   121: pop            
        //   122: aload           5
        //   124: getfield        kmq.a:Lkof;
        //   127: astore          7
        //   129: aload           7
        //   131: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   134: pop            
        //   135: aload           7
        //   137: invokeinterface kof.b:()Landroid/media/MediaCodec;
        //   142: astore          8
        //   144: aload           8
        //   146: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   149: pop            
        //   150: aload_0        
        //   151: getfield        iaa.b:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   154: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //   157: ifeq            204
        //   160: aload_0        
        //   161: getfield        iaa.q:Ljava/util/concurrent/atomic/AtomicLong;
        //   164: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   167: lconst_0       
        //   168: lcmp           
        //   169: ifle            186
        //   172: aload_0        
        //   173: getfield        iaa.b:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   176: iconst_0       
        //   177: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   180: iconst_1       
        //   181: istore          9
        //   183: goto            207
        //   186: getstatic       iaa.a:Lnsd;
        //   189: invokevirtual   nry.c:()Lnsu;
        //   192: ldc_w           "onImageAvailable() - Wait for at least one frame to stop recording."
        //   195: sipush          2593
        //   198: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //   201: goto            204
        //   204: iconst_0       
        //   205: istore          9
        //   207: aload_0        
        //   208: getfield        iaa.x:Ljava/lang/Object;
        //   211: astore          10
        //   213: aload           10
        //   215: monitorenter   
        //   216: aload_0        
        //   217: getfield        iaa.M:Libh;
        //   220: astore          11
        //   222: aload           11
        //   224: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   227: pop            
        //   228: aload_0        
        //   229: getfield        iaa.K:Lidc;
        //   232: astore          12
        //   234: aload_0        
        //   235: getfield        iaa.H:Lidd;
        //   238: astore          13
        //   240: aload           13
        //   242: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   245: pop            
        //   246: aload_0        
        //   247: getfield        iaa.G:Lida;
        //   250: astore          14
        //   252: aload           14
        //   254: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   257: pop            
        //   258: aload_0        
        //   259: getfield        iaa.f:Lodq;
        //   262: invokevirtual   odq.a:()D
        //   265: dstore          15
        //   267: aload           12
        //   269: dload           15
        //   271: invokevirtual   idc.c:(D)Lidb;
        //   274: astore          17
        //   276: aload_0        
        //   277: getfield        iaa.I:Lniz;
        //   280: invokevirtual   niz.g:()Z
        //   283: ifeq            308
        //   286: aload_0        
        //   287: getfield        iaa.I:Lniz;
        //   290: invokevirtual   niz.c:()Ljava/lang/Object;
        //   293: aload           17
        //   295: if_acmpeq       322
        //   298: aload           14
        //   300: aload           17
        //   302: invokevirtual   ida.d:(Lidb;)V
        //   305: goto            322
        //   308: aload           14
        //   310: aload           17
        //   312: invokevirtual   ida.f:(Lidb;)V
        //   315: aload           14
        //   317: aload           17
        //   319: invokevirtual   ida.d:(Lidb;)V
        //   322: aload_0        
        //   323: aload           17
        //   325: invokestatic    niz.i:(Ljava/lang/Object;)Lniz;
        //   328: putfield        iaa.I:Lniz;
        //   331: aload           6
        //   333: invokevirtual   niz.g:()Z
        //   336: ifeq            389
        //   339: aload_0        
        //   340: getfield        iaa.F:Lidf;
        //   343: astore          5
        //   345: aload           5
        //   347: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   350: pop            
        //   351: aload           5
        //   353: invokeinterface idf.d:()Z
        //   358: ifeq            389
        //   361: aload           14
        //   363: getfield        ida.a:Ljava/lang/Object;
        //   366: astore          5
        //   368: aload           5
        //   370: monitorenter   
        //   371: aload           14
        //   373: iconst_1       
        //   374: putfield        ida.i:Z
        //   377: aload           5
        //   379: monitorexit    
        //   380: goto            389
        //   383: astore_3       
        //   384: aload           5
        //   386: monitorexit    
        //   387: aload_3        
        //   388: athrow         
        //   389: aload           12
        //   391: getfield        idc.e:I
        //   394: istore          18
        //   396: aload           10
        //   398: astore          5
        //   400: aload_0        
        //   401: lload_1        
        //   402: iload           18
        //   404: dload           15
        //   406: iload           9
        //   408: aload           6
        //   410: invokevirtual   iaa.g:(JIDZLniz;)Z
        //   413: ifeq            692
        //   416: iload           9
        //   418: ifeq            448
        //   421: aload           10
        //   423: astore          5
        //   425: aload_0        
        //   426: getfield        iaa.d:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   429: iconst_1       
        //   430: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   433: aload           10
        //   435: astore          5
        //   437: aload_0        
        //   438: getfield        iaa.l:Ljava/util/concurrent/atomic/AtomicLong;
        //   441: invokevirtual   java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
        //   444: pop2           
        //   445: goto            692
        //   448: aload           10
        //   450: astore          5
        //   452: aload           8
        //   454: ldc2_w          10000
        //   457: invokevirtual   android/media/MediaCodec.dequeueInputBuffer:(J)I
        //   460: istore          18
        //   462: iload           18
        //   464: iflt            689
        //   467: aload           10
        //   469: astore          5
        //   471: aload           8
        //   473: iload           18
        //   475: invokevirtual   android/media/MediaCodec.getInputBuffer:(I)Ljava/nio/ByteBuffer;
        //   478: astore          6
        //   480: aload           6
        //   482: ifnull          1431
        //   485: aload           10
        //   487: astore          5
        //   489: aload           6
        //   491: invokevirtual   java/nio/ByteBuffer.clear:()Ljava/nio/Buffer;
        //   494: pop            
        //   495: aload           10
        //   497: astore          5
        //   499: aload           6
        //   501: aload           4
        //   503: invokeinterface lju.h:()Ljava/util/List;
        //   508: iconst_0       
        //   509: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   514: checkcast       Lljt;
        //   517: invokeinterface ljt.getBuffer:()Ljava/nio/ByteBuffer;
        //   522: invokevirtual   java/nio/ByteBuffer.put:(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
        //   525: pop            
        //   526: aload           10
        //   528: astore          5
        //   530: aload           6
        //   532: aload           4
        //   534: invokeinterface lju.h:()Ljava/util/List;
        //   539: iconst_2       
        //   540: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   545: checkcast       Lljt;
        //   548: invokeinterface ljt.getBuffer:()Ljava/nio/ByteBuffer;
        //   553: invokevirtual   java/nio/ByteBuffer.put:(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
        //   556: pop            
        //   557: aload           10
        //   559: astore          5
        //   561: aload_0        
        //   562: getfield        iaa.q:Ljava/util/concurrent/atomic/AtomicLong;
        //   565: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   568: lstore_1       
        //   569: aload           10
        //   571: astore          5
        //   573: aload           12
        //   575: getfield        idc.f:I
        //   578: istore          19
        //   580: aload           10
        //   582: astore          5
        //   584: aload_0        
        //   585: getfield        iaa.n:Ljava/util/concurrent/atomic/AtomicLong;
        //   588: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   591: lconst_0       
        //   592: lcmp           
        //   593: ifne            631
        //   596: aload           10
        //   598: astore          5
        //   600: aload_0        
        //   601: getfield        iaa.n:Ljava/util/concurrent/atomic/AtomicLong;
        //   604: getstatic       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //   607: invokestatic    android/os/SystemClock.uptimeMillis:()J
        //   610: invokevirtual   java/util/concurrent/TimeUnit.toMicros:(J)J
        //   613: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //   616: aload           10
        //   618: astore          5
        //   620: aload_0        
        //   621: getfield        iaa.n:Ljava/util/concurrent/atomic/AtomicLong;
        //   624: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   627: lstore_1       
        //   628: goto            655
        //   631: aload           10
        //   633: astore          5
        //   635: aload_0        
        //   636: getfield        iaa.n:Ljava/util/concurrent/atomic/AtomicLong;
        //   639: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   642: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   645: lload_1        
        //   646: invokevirtual   java/util/concurrent/TimeUnit.toMicros:(J)J
        //   649: iload           19
        //   651: i2l            
        //   652: ldiv           
        //   653: ladd           
        //   654: lstore_1       
        //   655: aload           10
        //   657: astore          5
        //   659: aload           8
        //   661: iload           18
        //   663: iconst_0       
        //   664: aload           6
        //   666: invokevirtual   java/nio/ByteBuffer.capacity:()I
        //   669: lload_1        
        //   670: iconst_0       
        //   671: invokevirtual   android/media/MediaCodec.queueInputBuffer:(IIIJI)V
        //   674: aload           10
        //   676: astore          5
        //   678: aload_0        
        //   679: getfield        iaa.l:Ljava/util/concurrent/atomic/AtomicLong;
        //   682: invokevirtual   java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
        //   685: pop2           
        //   686: goto            692
        //   689: goto            692
        //   692: aload           10
        //   694: astore          5
        //   696: aload_0        
        //   697: getfield        iaa.l:Ljava/util/concurrent/atomic/AtomicLong;
        //   700: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   703: lconst_0       
        //   704: lcmp           
        //   705: ifgt            728
        //   708: aload           10
        //   710: astore          5
        //   712: aload_0        
        //   713: getfield        iaa.d:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   716: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //   719: ifeq            725
        //   722: goto            728
        //   725: goto            1381
        //   728: aload           10
        //   730: astore          5
        //   732: new             Landroid/media/MediaCodec$BufferInfo;
        //   735: astore          6
        //   737: aload           10
        //   739: astore          5
        //   741: aload           6
        //   743: invokespecial   android/media/MediaCodec$BufferInfo.<init>:()V
        //   746: aload           10
        //   748: astore          5
        //   750: aload           8
        //   752: aload           6
        //   754: aload_0        
        //   755: getfield        iaa.P:J
        //   758: invokevirtual   android/media/MediaCodec.dequeueOutputBuffer:(Landroid/media/MediaCodec$BufferInfo;J)I
        //   761: istore          18
        //   763: iload           18
        //   765: iconst_m1      
        //   766: if_icmpne       772
        //   769: goto            1145
        //   772: iload           18
        //   774: bipush          -2
        //   776: if_icmpne       798
        //   779: aload           10
        //   781: astore          5
        //   783: aload           7
        //   785: aload           8
        //   787: invokevirtual   android/media/MediaCodec.getOutputFormat:()Landroid/media/MediaFormat;
        //   790: invokeinterface kof.l:(Landroid/media/MediaFormat;)V
        //   795: goto            1145
        //   798: iload           18
        //   800: ifge            840
        //   803: aload           10
        //   805: astore          5
        //   807: getstatic       iaa.a:Lnsd;
        //   810: invokevirtual   nry.b:()Lnsu;
        //   813: checkcast       Lnsa;
        //   816: sipush          2601
        //   819: invokeinterface nsa.E:(I)Lnsu;
        //   824: checkcast       Lnsa;
        //   827: ldc_w           "selectAndDropFrames() - Unexpected result during dequeueOutputBuffer: %d"
        //   830: iload           18
        //   832: invokeinterface nsa.p:(Ljava/lang/String;I)V
        //   837: goto            1145
        //   840: aload           10
        //   842: astore          5
        //   844: aload           6
        //   846: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   849: iconst_2       
        //   850: iand           
        //   851: ifeq            864
        //   854: aload           10
        //   856: astore          5
        //   858: aload           6
        //   860: iconst_0       
        //   861: putfield        android/media/MediaCodec$BufferInfo.size:I
        //   864: aload           10
        //   866: astore          5
        //   868: aload           6
        //   870: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   873: ifeq            1085
        //   876: aload           10
        //   878: astore          5
        //   880: aload_0        
        //   881: getfield        iaa.q:Ljava/util/concurrent/atomic/AtomicLong;
        //   884: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   887: lstore          20
        //   889: aload           10
        //   891: astore          5
        //   893: aload           12
        //   895: getfield        idc.f:I
        //   898: istore          19
        //   900: aload           10
        //   902: astore          5
        //   904: aload_0        
        //   905: getfield        iaa.m:Ljava/util/concurrent/atomic/AtomicLong;
        //   908: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   911: lconst_0       
        //   912: lcmp           
        //   913: ifne            951
        //   916: aload           10
        //   918: astore          5
        //   920: aload_0        
        //   921: getfield        iaa.m:Ljava/util/concurrent/atomic/AtomicLong;
        //   924: getstatic       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //   927: invokestatic    android/os/SystemClock.uptimeMillis:()J
        //   930: invokevirtual   java/util/concurrent/TimeUnit.toMicros:(J)J
        //   933: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //   936: aload           10
        //   938: astore          5
        //   940: aload_0        
        //   941: getfield        iaa.m:Ljava/util/concurrent/atomic/AtomicLong;
        //   944: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   947: lstore_1       
        //   948: goto            982
        //   951: aload           10
        //   953: astore          5
        //   955: aload_0        
        //   956: getfield        iaa.m:Ljava/util/concurrent/atomic/AtomicLong;
        //   959: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   962: lstore_1       
        //   963: aload           10
        //   965: astore          5
        //   967: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   970: lload           20
        //   972: invokevirtual   java/util/concurrent/TimeUnit.toMicros:(J)J
        //   975: iload           19
        //   977: i2l            
        //   978: ldiv           
        //   979: lload_1        
        //   980: ladd           
        //   981: lstore_1       
        //   982: aload           10
        //   984: astore          5
        //   986: aload           6
        //   988: lload_1        
        //   989: putfield        android/media/MediaCodec$BufferInfo.presentationTimeUs:J
        //   992: aload           10
        //   994: astore          5
        //   996: aload           7
        //   998: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1001: pop            
        //  1002: aload           10
        //  1004: astore          5
        //  1006: aload           7
        //  1008: iload           18
        //  1010: aload           6
        //  1012: invokeinterface kof.n:(ILandroid/media/MediaCodec$BufferInfo;)V
        //  1017: aload           10
        //  1019: astore          5
        //  1021: aload_0        
        //  1022: getfield        iaa.k:Ljava/util/concurrent/atomic/AtomicLong;
        //  1025: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //  1028: aload_0        
        //  1029: getfield        iaa.i:Ljava/util/concurrent/atomic/AtomicLong;
        //  1032: invokevirtual   java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
        //  1035: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //  1038: aload           12
        //  1040: getfield        idc.f:I
        //  1043: i2l            
        //  1044: ldiv           
        //  1045: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //  1048: aload           10
        //  1050: astore          5
        //  1052: aload_0        
        //  1053: getfield        iaa.t:Ljava/util/concurrent/atomic/AtomicLong;
        //  1056: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //  1059: aload_0        
        //  1060: getfield        iaa.q:Ljava/util/concurrent/atomic/AtomicLong;
        //  1063: invokevirtual   java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
        //  1066: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //  1069: aload           12
        //  1071: getfield        idc.f:I
        //  1074: i2l            
        //  1075: ldiv           
        //  1076: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //  1079: iconst_1       
        //  1080: istore          18
        //  1082: goto            1100
        //  1085: aload           10
        //  1087: astore          5
        //  1089: aload           8
        //  1091: iload           18
        //  1093: iconst_0       
        //  1094: invokevirtual   android/media/MediaCodec.releaseOutputBuffer:(IZ)V
        //  1097: iconst_0       
        //  1098: istore          18
        //  1100: aload           10
        //  1102: astore          5
        //  1104: aload_0        
        //  1105: getfield        iaa.l:Ljava/util/concurrent/atomic/AtomicLong;
        //  1108: astore          6
        //  1110: aload           10
        //  1112: astore          5
        //  1114: aload           6
        //  1116: aload           6
        //  1118: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //  1121: lconst_1       
        //  1122: lsub           
        //  1123: invokevirtual   java/util/concurrent/atomic/AtomicLong.set:(J)V
        //  1126: iload           18
        //  1128: ifeq            1145
        //  1131: aload           10
        //  1133: astore          5
        //  1135: aload           14
        //  1137: aload           17
        //  1139: invokevirtual   ida.c:(Lidb;)V
        //  1142: goto            1145
        //  1145: aload           14
        //  1147: astore          6
        //  1149: iload           9
        //  1151: ifeq            1381
        //  1154: aload           10
        //  1156: astore          5
        //  1158: getstatic       iaa.a:Lnsd;
        //  1161: invokevirtual   nry.c:()Lnsu;
        //  1164: ldc_w           "Received Eos frame. Stop recording."
        //  1167: sipush          2598
        //  1170: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //  1173: aload           10
        //  1175: astore          5
        //  1177: aload_0        
        //  1178: getfield        iaa.c:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  1181: iconst_0       
        //  1182: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  1185: aload           10
        //  1187: astore          5
        //  1189: aload_0        
        //  1190: getfield        iaa.d:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  1193: iconst_0       
        //  1194: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //  1197: aload           10
        //  1199: astore          5
        //  1201: aload           13
        //  1203: aload_0        
        //  1204: invokevirtual   iaa.d:()J
        //  1207: invokevirtual   idd.i:(J)V
        //  1210: aload           10
        //  1212: astore          5
        //  1214: aload           13
        //  1216: aload_0        
        //  1217: invokevirtual   iaa.c:()J
        //  1220: invokevirtual   idd.j:(J)V
        //  1223: aload           10
        //  1225: astore          5
        //  1227: aload           13
        //  1229: aload_0        
        //  1230: invokevirtual   iaa.a:()J
        //  1233: invokevirtual   idd.d:(J)V
        //  1236: aload           10
        //  1238: astore          5
        //  1240: aload           13
        //  1242: aload_0        
        //  1243: invokevirtual   iaa.b:()J
        //  1246: invokevirtual   idd.e:(J)V
        //  1249: aload           10
        //  1251: astore          5
        //  1253: aload           6
        //  1255: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //  1258: aload_0        
        //  1259: getfield        iaa.r:Ljava/util/concurrent/atomic/AtomicLong;
        //  1262: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //  1265: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //  1268: aload_0        
        //  1269: getfield        iaa.K:Lidc;
        //  1272: getfield        idc.f:I
        //  1275: i2l            
        //  1276: ldiv           
        //  1277: invokevirtual   ida.e:(J)V
        //  1280: aload           10
        //  1282: astore          5
        //  1284: aload           6
        //  1286: aload_0        
        //  1287: getfield        iaa.t:Ljava/util/concurrent/atomic/AtomicLong;
        //  1290: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //  1293: invokevirtual   ida.g:(J)V
        //  1296: aload           10
        //  1298: astore          5
        //  1300: aload_0        
        //  1301: getfield        iaa.q:Ljava/util/concurrent/atomic/AtomicLong;
        //  1304: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //  1307: pop2           
        //  1308: aload           10
        //  1310: astore          5
        //  1312: aload           6
        //  1314: invokevirtual   ida.h:()V
        //  1317: aload           10
        //  1319: astore          5
        //  1321: aload_0        
        //  1322: getfield        iaa.r:Ljava/util/concurrent/atomic/AtomicLong;
        //  1325: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //  1328: pop2           
        //  1329: aload           10
        //  1331: astore          5
        //  1333: aload_0        
        //  1334: getfield        iaa.q:Ljava/util/concurrent/atomic/AtomicLong;
        //  1337: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //  1340: pop2           
        //  1341: aload           10
        //  1343: astore          5
        //  1345: aload           6
        //  1347: invokevirtual   ida.i:()V
        //  1350: aload           10
        //  1352: astore          5
        //  1354: aload_0        
        //  1355: getfield        iaa.J:Lofn;
        //  1358: astore          6
        //  1360: aload           10
        //  1362: astore          5
        //  1364: aload           6
        //  1366: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1369: pop            
        //  1370: aload           10
        //  1372: astore          5
        //  1374: aload           6
        //  1376: aconst_null    
        //  1377: invokevirtual   ofn.o:(Ljava/lang/Object;)Z
        //  1380: pop            
        //  1381: iload           9
        //  1383: ifne            1431
        //  1386: aload           10
        //  1388: astore          5
        //  1390: aload           11
        //  1392: aload_0        
        //  1393: getfield        iaa.q:Ljava/util/concurrent/atomic/AtomicLong;
        //  1396: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //  1399: aload           12
        //  1401: getfield        idc.f:I
        //  1404: i2f            
        //  1405: invokevirtual   ibh.a:(JF)V
        //  1408: aload           10
        //  1410: astore          5
        //  1412: aload_0        
        //  1413: getfield        iaa.j:Ljava/util/concurrent/atomic/AtomicLong;
        //  1416: invokevirtual   java/util/concurrent/atomic/AtomicLong.incrementAndGet:()J
        //  1419: pop2           
        //  1420: aload           10
        //  1422: astore          5
        //  1424: aload           14
        //  1426: aload           17
        //  1428: invokevirtual   ida.b:(Lidb;)V
        //  1431: aload           10
        //  1433: astore          5
        //  1435: aload           10
        //  1437: monitorexit    
        //  1438: aload_3        
        //  1439: aload           4
        //  1441: invokestatic    iaa.h:(Lkvs;Llju;)V
        //  1444: return         
        //  1445: astore_3       
        //  1446: aload           10
        //  1448: astore          4
        //  1450: aload           4
        //  1452: astore          5
        //  1454: aload           4
        //  1456: monitorexit    
        //  1457: aload_3        
        //  1458: athrow         
        //  1459: astore_3       
        //  1460: aload           5
        //  1462: astore          4
        //  1464: goto            1450
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  216    305    1445   1450   Any
        //  308    322    1445   1450   Any
        //  322    371    1445   1450   Any
        //  371    380    383    389    Any
        //  384    387    383    389    Any
        //  387    389    1445   1450   Any
        //  389    396    1445   1450   Any
        //  400    416    1459   1467   Any
        //  425    433    1459   1467   Any
        //  437    445    1459   1467   Any
        //  452    462    1459   1467   Any
        //  471    480    1459   1467   Any
        //  489    495    1459   1467   Any
        //  499    526    1459   1467   Any
        //  530    557    1459   1467   Any
        //  561    569    1459   1467   Any
        //  573    580    1459   1467   Any
        //  584    596    1459   1467   Any
        //  600    616    1459   1467   Any
        //  620    628    1459   1467   Any
        //  635    655    1459   1467   Any
        //  659    674    1459   1467   Any
        //  678    686    1459   1467   Any
        //  696    708    1459   1467   Any
        //  712    722    1459   1467   Any
        //  732    737    1459   1467   Any
        //  741    746    1459   1467   Any
        //  750    763    1459   1467   Any
        //  783    795    1459   1467   Any
        //  807    837    1459   1467   Any
        //  844    854    1459   1467   Any
        //  858    864    1459   1467   Any
        //  868    876    1459   1467   Any
        //  880    889    1459   1467   Any
        //  893    900    1459   1467   Any
        //  904    916    1459   1467   Any
        //  920    936    1459   1467   Any
        //  940    948    1459   1467   Any
        //  955    963    1459   1467   Any
        //  967    982    1459   1467   Any
        //  986    992    1459   1467   Any
        //  996    1002   1459   1467   Any
        //  1006   1017   1459   1467   Any
        //  1021   1048   1459   1467   Any
        //  1052   1079   1459   1467   Any
        //  1089   1097   1459   1467   Any
        //  1104   1110   1459   1467   Any
        //  1114   1126   1459   1467   Any
        //  1135   1142   1459   1467   Any
        //  1158   1173   1459   1467   Any
        //  1177   1185   1459   1467   Any
        //  1189   1197   1459   1467   Any
        //  1201   1210   1459   1467   Any
        //  1214   1223   1459   1467   Any
        //  1227   1236   1459   1467   Any
        //  1240   1249   1459   1467   Any
        //  1253   1280   1459   1467   Any
        //  1284   1296   1459   1467   Any
        //  1300   1308   1459   1467   Any
        //  1312   1317   1459   1467   Any
        //  1321   1329   1459   1467   Any
        //  1333   1341   1459   1467   Any
        //  1345   1350   1459   1467   Any
        //  1354   1360   1459   1467   Any
        //  1364   1370   1459   1467   Any
        //  1374   1381   1459   1467   Any
        //  1390   1408   1459   1467   Any
        //  1412   1420   1459   1467   Any
        //  1424   1431   1459   1467   Any
        //  1435   1438   1459   1467   Any
        //  1454   1457   1459   1467   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0448:
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
    
    final boolean g(final long n, int n2, final double n3, final boolean b, final niz niz) {
        final double n4 = n2;
        Double.isNaN(n4);
        if (n % (int)(n4 / n3) == 0L) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        int n5 = n2;
        if (niz.g()) {
            if (!(boolean)niz.c() && n2 != 0) {
                a.l(iaa.a.b(), "The frame is not warped. Ignore", '\u0a2a');
            }
            n5 = (n2 & (((boolean)niz.c()) ? 1 : 0));
        }
        if (n5 == 0 && !b) {
            if (!this.b.get()) {
                return false;
            }
        }
        return true;
    }
}
