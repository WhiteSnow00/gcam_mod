import android.content.Context;
import android.graphics.Matrix;
import java.util.ArrayList;
import android.graphics.Bitmap;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebk implements gxc
{
    private static final nsd b;
    public final hhy a;
    private final boolean c;
    private final edl d;
    private final eeb e;
    private final btl f;
    private final List g;
    private final kse h;
    private final jdi i;
    private final boolean j;
    private final eat k;
    
    static {
        b = nsd.g("com/google/android/apps/camera/imax/ImaxProcessingTask");
    }
    
    public ebk(final hgc hgc, final hfn hfn, final jdi i, final kse h, final eya eya, final klv klv, final hif hif, final eat k, Bitmap bitmap, final boolean j) {
        this.d = (edl)eea.a(edl.class);
        this.e = (eeb)eea.a(eeb.class);
        this.k = k;
        this.c = (boolean)klv.aQ();
        final cxm a = cxt.a;
        this.g = new ArrayList();
        this.h = h;
        final btl c = eya.c();
        this.f = c;
        this.i = i;
        this.j = j;
        final String concat = String.valueOf(k.a).concat(".vr");
        final hie a2 = hif.a(System.currentTimeMillis(), drk.b, "PANO");
        final Object value = hgc.a.get();
        concat.getClass();
        final hgb a3 = new hgb((hfk)value, concat, c, a2);
        this.a = a3;
        int n;
        if (!j) {
            n = 0;
        }
        else {
            n = 270;
        }
        if (j) {
            final Matrix matrix = new Matrix();
            matrix.postRotate(270.0f);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }
        h.h("imaxProcessing#startSession");
        hfn.e(a3);
        a3.P(kre.h(bitmap.getWidth(), bitmap.getHeight()));
        a3.W(bitmap);
        a3.U(bitmap, n);
        a3.O(jwn.ad(2131952555, new Object[0]));
        h.g();
    }
    
    @Override
    public final String b() {
        final String value = String.valueOf(this.a.h());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 19);
        sb.append("ImaxProcessingTask-");
        sb.append(value);
        return sb.toString();
    }
    
    @Override
    public final void c(final kqq kqq) {
        kqq.getClass();
        this.g.add(kqq);
    }
    
    @Override
    public final void d(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: new             Logj;
        //     5: dup            
        //     6: new             Lebj;
        //     9: dup            
        //    10: aload_2        
        //    11: invokespecial   ebj.<init>:(Lebk;)V
        //    14: invokespecial   ogj.<init>:(Lcom/google/geo/lightfield/processing/ProgressCallback;)V
        //    17: astore_3       
        //    18: getstatic       ogj.a:Z
        //    21: ifne            126
        //    24: aload_3        
        //    25: getfield        ogj.c:Logi;
        //    28: ifnull          34
        //    31: goto            126
        //    34: aload_3        
        //    35: getfield        ogj.d:Landroid/os/Looper;
        //    38: astore          4
        //    40: aload           4
        //    42: astore          5
        //    44: aload           4
        //    46: ifnonnull       75
        //    49: new             Landroid/os/HandlerThread;
        //    52: astore          5
        //    54: aload           5
        //    56: ldc_w           "ProgressInterpolatorThread"
        //    59: iconst_0       
        //    60: invokespecial   android/os/HandlerThread.<init>:(Ljava/lang/String;I)V
        //    63: aload           5
        //    65: invokevirtual   android/os/HandlerThread.start:()V
        //    68: aload           5
        //    70: invokevirtual   android/os/HandlerThread.getLooper:()Landroid/os/Looper;
        //    73: astore          5
        //    75: aload_3        
        //    76: aload           5
        //    78: putfield        ogj.d:Landroid/os/Looper;
        //    81: new             Logi;
        //    84: astore          5
        //    86: aload           5
        //    88: aload_3        
        //    89: getfield        ogj.b:Lcom/google/geo/lightfield/processing/ProgressCallback;
        //    92: aload_3        
        //    93: getfield        ogj.d:Landroid/os/Looper;
        //    96: invokespecial   ogi.<init>:(Lcom/google/geo/lightfield/processing/ProgressCallback;Landroid/os/Looper;)V
        //    99: aload_3        
        //   100: aload           5
        //   102: putfield        ogj.c:Logi;
        //   105: aload_3        
        //   106: getfield        ogj.c:Logi;
        //   109: astore          5
        //   111: aload           5
        //   113: fconst_0       
        //   114: putfield        ogi.c:F
        //   117: aload           5
        //   119: invokevirtual   ogi.a:()V
        //   122: iconst_1       
        //   123: putstatic       ogj.a:Z
        //   126: aload_3        
        //   127: fconst_0       
        //   128: ldc_w           0.35
        //   131: invokeinterface com/google/geo/lightfield/processing/ProgressCallback.setRange:(FF)V
        //   136: aload_2        
        //   137: getfield        ebk.d:Ledl;
        //   140: aload_2        
        //   141: getfield        ebk.k:Leat;
        //   144: invokevirtual   eat.a:()Ljava/lang/String;
        //   147: aload_3        
        //   148: invokeinterface edl.computePose:(Ljava/lang/String;Lcom/google/geo/lightfield/processing/ProgressCallback;)Z
        //   153: ifne            164
        //   156: aload_3        
        //   157: astore_1       
        //   158: iconst_0       
        //   159: istore          6
        //   161: goto            2411
        //   164: aload_2        
        //   165: getfield        ebk.c:Z
        //   168: ifeq            186
        //   171: aload_3        
        //   172: ldc_w           0.35
        //   175: ldc_w           0.93
        //   178: invokeinterface com/google/geo/lightfield/processing/ProgressCallback.setRange:(FF)V
        //   183: goto            198
        //   186: aload_3        
        //   187: ldc_w           0.35
        //   190: ldc_w           0.96
        //   193: invokeinterface com/google/geo/lightfield/processing/ProgressCallback.setRange:(FF)V
        //   198: aload_2        
        //   199: getfield        ebk.h:Lkse;
        //   202: ldc_w           "imaxProcessing#getStitchedPano"
        //   205: invokeinterface kse.f:(Ljava/lang/String;)V
        //   210: new             Leee;
        //   213: astore          4
        //   215: aload           4
        //   217: aload_2        
        //   218: getfield        ebk.k:Leat;
        //   221: invokespecial   eee.<init>:(Leat;)V
        //   224: aload           4
        //   226: aload_2        
        //   227: getfield        ebk.j:Z
        //   230: putfield        eee.c:Z
        //   233: new             Ljava/util/concurrent/atomic/AtomicReference;
        //   236: astore          5
        //   238: aload           5
        //   240: invokespecial   java/util/concurrent/atomic/AtomicReference.<init>:()V
        //   243: new             Ljava/lang/Thread;
        //   246: astore          7
        //   248: new             Leed;
        //   251: astore          8
        //   253: aload           8
        //   255: aload           4
        //   257: aload           5
        //   259: aload_3        
        //   260: invokespecial   eed.<init>:(Leee;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/geo/lightfield/processing/ProgressCallback;)V
        //   263: aload           7
        //   265: aload           8
        //   267: ldc_w           "OfflineOmnistereoStitchThread"
        //   270: invokespecial   java/lang/Thread.<init>:(Ljava/lang/Runnable;Ljava/lang/String;)V
        //   273: aload           7
        //   275: invokevirtual   java/lang/Thread.start:()V
        //   278: aload           7
        //   280: invokevirtual   java/lang/Thread.join:()V
        //   283: goto            310
        //   286: astore          4
        //   288: getstatic       eee.a:Lnsd;
        //   291: invokevirtual   nry.b:()Lnsu;
        //   294: ldc_w           "%s"
        //   297: aload           4
        //   299: invokevirtual   java/lang/InterruptedException.getMessage:()Ljava/lang/String;
        //   302: sipush          1131
        //   305: aload           4
        //   307: invokestatic    a.n:(Lnsu;Ljava/lang/String;Ljava/lang/Object;CLjava/lang/Throwable;)V
        //   310: aload           5
        //   312: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //   315: checkcast       Lcom/google/android/apps/camera/imax/cyclops/image/StereoPanorama;
        //   318: astore          7
        //   320: aload_2        
        //   321: getfield        ebk.h:Lkse;
        //   324: invokeinterface kse.g:()V
        //   329: aload           7
        //   331: ifnonnull       342
        //   334: aload_3        
        //   335: astore_1       
        //   336: iconst_0       
        //   337: istore          6
        //   339: goto            2411
        //   342: aload_3        
        //   343: fconst_0       
        //   344: fconst_1       
        //   345: invokeinterface com/google/geo/lightfield/processing/ProgressCallback.setRange:(FF)V
        //   350: aload_2        
        //   351: getfield        ebk.c:Z
        //   354: ifeq            956
        //   357: aload_2        
        //   358: getfield        ebk.h:Lkse;
        //   361: ldc_w           "imaxProcessing#addAudio"
        //   364: invokeinterface kse.f:(Ljava/lang/String;)V
        //   369: aload_1        
        //   370: invokevirtual   android/content/Context.getCacheDir:()Ljava/io/File;
        //   373: astore_1       
        //   374: aload_2        
        //   375: getfield        ebk.k:Leat;
        //   378: invokevirtual   eat.b:()Ljava/lang/String;
        //   381: astore          9
        //   383: ldc_w           "demuxed"
        //   386: ldc_w           "mp4"
        //   389: aload_1        
        //   390: invokestatic    java/io/File.createTempFile:(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
        //   393: astore          8
        //   395: aload           8
        //   397: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   400: astore          4
        //   402: new             Landroid/media/MediaExtractor;
        //   405: astore          5
        //   407: aload           5
        //   409: invokespecial   android/media/MediaExtractor.<init>:()V
        //   412: aload           5
        //   414: aload           9
        //   416: invokevirtual   android/media/MediaExtractor.setDataSource:(Ljava/lang/String;)V
        //   419: aload           5
        //   421: invokevirtual   android/media/MediaExtractor.getTrackCount:()I
        //   424: istore          10
        //   426: iconst_0       
        //   427: istore          6
        //   429: iload           6
        //   431: iload           10
        //   433: if_icmpge       468
        //   436: iload           6
        //   438: istore          11
        //   440: aload           5
        //   442: iload           6
        //   444: invokevirtual   android/media/MediaExtractor.getTrackFormat:(I)Landroid/media/MediaFormat;
        //   447: ldc_w           "mime"
        //   450: invokevirtual   android/media/MediaFormat.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   453: ldc_w           "audio/"
        //   456: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   459: ifne            471
        //   462: iinc            6, 1
        //   465: goto            429
        //   468: iconst_m1      
        //   469: istore          11
        //   471: iload           11
        //   473: ifge            498
        //   476: getstatic       edn.a:Lnsd;
        //   479: invokevirtual   nry.b:()Lnsu;
        //   482: ldc_w           "No video track found in %s"
        //   485: aload           9
        //   487: sipush          1118
        //   490: invokestatic    a.k:(Lnsu;Ljava/lang/String;Ljava/lang/Object;C)V
        //   493: aconst_null    
        //   494: astore_1       
        //   495: goto            536
        //   498: aload           5
        //   500: iload           11
        //   502: invokevirtual   android/media/MediaExtractor.selectTrack:(I)V
        //   505: aload           5
        //   507: iload           11
        //   509: invokevirtual   android/media/MediaExtractor.getTrackFormat:(I)Landroid/media/MediaFormat;
        //   512: astore_1       
        //   513: goto            536
        //   516: astore_1       
        //   517: getstatic       edn.a:Lnsd;
        //   520: invokevirtual   nry.b:()Lnsu;
        //   523: ldc_w           "Could not open video file %s"
        //   526: aload           9
        //   528: sipush          1119
        //   531: invokestatic    a.k:(Lnsu;Ljava/lang/String;Ljava/lang/Object;C)V
        //   534: aconst_null    
        //   535: astore_1       
        //   536: aload_1        
        //   537: ifnonnull       563
        //   540: getstatic       edn.a:Lnsd;
        //   543: invokevirtual   nry.b:()Lnsu;
        //   546: ldc_w           "Could not extract MediaFormat from %s"
        //   549: aload           9
        //   551: sipush          1117
        //   554: invokestatic    a.k:(Lnsu;Ljava/lang/String;Ljava/lang/Object;C)V
        //   557: aconst_null    
        //   558: astore          5
        //   560: goto            630
        //   563: new             Leem;
        //   566: astore          9
        //   568: aload           9
        //   570: aload           4
        //   572: iconst_1       
        //   573: invokespecial   eem.<init>:(Ljava/lang/String;I)V
        //   576: aload           9
        //   578: aload_1        
        //   579: invokevirtual   eem.a:(Landroid/media/MediaFormat;)I
        //   582: istore          11
        //   584: new             Landroid/media/MediaCodec$BufferInfo;
        //   587: astore          12
        //   589: aload           12
        //   591: invokespecial   android/media/MediaCodec$BufferInfo.<init>:()V
        //   594: sipush          2048
        //   597: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        //   600: astore          4
        //   602: aload           5
        //   604: aload           4
        //   606: iconst_0       
        //   607: invokevirtual   android/media/MediaExtractor.readSampleData:(Ljava/nio/ByteBuffer;I)I
        //   610: istore          6
        //   612: iload           6
        //   614: ifgt            807
        //   617: aload           5
        //   619: invokevirtual   android/media/MediaExtractor.release:()V
        //   622: aload           9
        //   624: invokevirtual   eem.b:()V
        //   627: aload_1        
        //   628: astore          5
        //   630: aload           5
        //   632: ifnonnull       640
        //   635: aconst_null    
        //   636: astore_1       
        //   637: goto            883
        //   640: aload           8
        //   642: invokevirtual   java/io/File.length:()J
        //   645: l2i            
        //   646: istore          11
        //   648: iload           11
        //   650: newarray        B
        //   652: astore          4
        //   654: new             Ljava/io/FileInputStream;
        //   657: astore_1       
        //   658: aload_1        
        //   659: aload           8
        //   661: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   664: iconst_0       
        //   665: istore          6
        //   667: iload           6
        //   669: iload           11
        //   671: if_icmpge       717
        //   674: aload_1        
        //   675: aload           4
        //   677: iload           6
        //   679: iload           11
        //   681: iload           6
        //   683: isub           
        //   684: invokevirtual   java/io/FileInputStream.read:([BII)I
        //   687: istore          10
        //   689: iload           10
        //   691: ifge            697
        //   694: goto            717
        //   697: iload           6
        //   699: iload           10
        //   701: iadd           
        //   702: istore          6
        //   704: goto            667
        //   707: astore          5
        //   709: goto            738
        //   712: astore          4
        //   714: goto            756
        //   717: aload_1        
        //   718: invokevirtual   java/io/FileInputStream.close:()V
        //   721: aload           4
        //   723: astore_1       
        //   724: goto            772
        //   727: astore_1       
        //   728: aload           4
        //   730: astore_1       
        //   731: goto            772
        //   734: astore          5
        //   736: aconst_null    
        //   737: astore_1       
        //   738: aload_1        
        //   739: ifnull          750
        //   742: aload_1        
        //   743: invokevirtual   java/io/FileInputStream.close:()V
        //   746: goto            750
        //   749: astore_1       
        //   750: aload           5
        //   752: athrow         
        //   753: astore_1       
        //   754: aconst_null    
        //   755: astore_1       
        //   756: aload_1        
        //   757: ifnull          770
        //   760: aload_1        
        //   761: invokevirtual   java/io/FileInputStream.close:()V
        //   764: aconst_null    
        //   765: astore_1       
        //   766: goto            772
        //   769: astore_1       
        //   770: aconst_null    
        //   771: astore_1       
        //   772: aload           8
        //   774: invokevirtual   java/io/File.delete:()Z
        //   777: pop            
        //   778: aload_1        
        //   779: ifnonnull       787
        //   782: aconst_null    
        //   783: astore_1       
        //   784: goto            883
        //   787: new             Lcom/google/android/apps/camera/imax/cyclops/audio/AudioTrack;
        //   790: dup            
        //   791: aload           5
        //   793: ldc_w           "mime"
        //   796: invokevirtual   android/media/MediaFormat.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   799: aload_1        
        //   800: invokespecial   com/google/android/apps/camera/imax/cyclops/audio/AudioTrack.<init>:(Ljava/lang/String;[B)V
        //   803: astore_1       
        //   804: goto            883
        //   807: iload           6
        //   809: sipush          2048
        //   812: if_icmpne       842
        //   815: getstatic       edn.a:Lnsd;
        //   818: invokevirtual   nry.b:()Lnsu;
        //   821: astore          13
        //   823: aload           13
        //   825: ldc_w           "Chunk size is the maximum size, we probably clamped the sample"
        //   828: sipush          1116
        //   831: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //   834: sipush          2048
        //   837: istore          6
        //   839: goto            842
        //   842: aload           12
        //   844: iconst_0       
        //   845: iload           6
        //   847: aload           5
        //   849: invokevirtual   android/media/MediaExtractor.getSampleTime:()J
        //   852: aload           5
        //   854: invokevirtual   android/media/MediaExtractor.getSampleFlags:()I
        //   857: invokevirtual   android/media/MediaCodec$BufferInfo.set:(IIJI)V
        //   860: aload           9
        //   862: iload           11
        //   864: aload           4
        //   866: aload           12
        //   868: invokevirtual   eem.c:(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
        //   871: aload           5
        //   873: invokevirtual   android/media/MediaExtractor.advance:()Z
        //   876: pop            
        //   877: goto            602
        //   880: astore_1       
        //   881: aconst_null    
        //   882: astore_1       
        //   883: new             Lcom/google/android/apps/camera/imax/cyclops/image/StereoPanorama;
        //   886: astore          8
        //   888: aload           7
        //   890: getfield        com/google/android/apps/camera/imax/cyclops/image/StereoPanorama.a:[B
        //   893: astore          4
        //   895: aload_2        
        //   896: getfield        ebk.j:Z
        //   899: ifeq            909
        //   902: aload           4
        //   904: astore          5
        //   906: goto            916
        //   909: aload           7
        //   911: getfield        com/google/android/apps/camera/imax/cyclops/image/StereoPanorama.b:[B
        //   914: astore          5
        //   916: aload           8
        //   918: aload           4
        //   920: aload           5
        //   922: aload           7
        //   924: getfield        com/google/android/apps/camera/imax/cyclops/image/StereoPanorama.c:Lcom/google/android/apps/camera/imax/cyclops/metadata/PanoMeta;
        //   927: aload_1        
        //   928: invokespecial   com/google/android/apps/camera/imax/cyclops/image/StereoPanorama.<init>:([B[BLcom/google/android/apps/camera/imax/cyclops/metadata/PanoMeta;Lcom/google/android/apps/camera/imax/cyclops/audio/AudioTrack;)V
        //   931: aload_2        
        //   932: getfield        ebk.h:Lkse;
        //   935: invokeinterface kse.g:()V
        //   940: aload_3        
        //   941: ldc_w           0.96
        //   944: invokeinterface com/google/geo/lightfield/processing/ProgressCallback.setProgress:(F)V
        //   949: aload           8
        //   951: astore          7
        //   953: goto            956
        //   956: aload_3        
        //   957: ldc_w           0.96
        //   960: fconst_1       
        //   961: invokeinterface com/google/geo/lightfield/processing/ProgressCallback.setRange:(FF)V
        //   966: aload_2        
        //   967: getfield        ebk.h:Lkse;
        //   970: ldc_w           "imaxProcessing#writePano"
        //   973: invokeinterface kse.f:(Ljava/lang/String;)V
        //   978: new             Ljava/io/File;
        //   981: astore          13
        //   983: aload_2        
        //   984: getfield        ebk.k:Leat;
        //   987: astore          4
        //   989: aload           4
        //   991: invokevirtual   eat.a:()Ljava/lang/String;
        //   994: astore_1       
        //   995: getstatic       java/io/File.separator:Ljava/lang/String;
        //   998: astore          5
        //  1000: aload           4
        //  1002: getfield        eat.a:Ljava/lang/String;
        //  1005: astore          8
        //  1007: aload_1        
        //  1008: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1011: invokevirtual   java/lang/String.length:()I
        //  1014: istore          6
        //  1016: aload           5
        //  1018: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1021: invokevirtual   java/lang/String.length:()I
        //  1024: istore          10
        //  1026: aload           8
        //  1028: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1031: invokevirtual   java/lang/String.length:()I
        //  1034: istore          11
        //  1036: new             Ljava/lang/StringBuilder;
        //  1039: astore          4
        //  1041: aload           4
        //  1043: iload           6
        //  1045: bipush          7
        //  1047: iadd           
        //  1048: iload           10
        //  1050: iadd           
        //  1051: iload           11
        //  1053: iadd           
        //  1054: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1057: aload           4
        //  1059: aload_1        
        //  1060: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1063: pop            
        //  1064: aload           4
        //  1066: aload           5
        //  1068: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1071: pop            
        //  1072: aload           4
        //  1074: aload           8
        //  1076: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1079: pop            
        //  1080: aload           4
        //  1082: ldc_w           ".vr.jpg"
        //  1085: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1088: pop            
        //  1089: aload           13
        //  1091: aload           4
        //  1093: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1096: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //  1099: aload_2        
        //  1100: getfield        ebk.j:Z
        //  1103: istore          14
        //  1105: iload           14
        //  1107: ifeq            1191
        //  1110: new             Ljava/io/FileOutputStream;
        //  1113: astore          5
        //  1115: aload           5
        //  1117: aload           13
        //  1119: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //  1122: aload           5
        //  1124: invokevirtual   java/io/FileOutputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //  1127: aload           7
        //  1129: getfield        com/google/android/apps/camera/imax/cyclops/image/StereoPanorama.a:[B
        //  1132: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //  1135: invokevirtual   java/nio/channels/FileChannel.write:(Ljava/nio/ByteBuffer;)I
        //  1138: pop            
        //  1139: aload           5
        //  1141: invokevirtual   java/io/FileOutputStream.flush:()V
        //  1144: aload           5
        //  1146: invokevirtual   java/io/FileOutputStream.close:()V
        //  1149: goto            1208
        //  1152: astore_1       
        //  1153: aload           5
        //  1155: invokevirtual   java/io/FileOutputStream.close:()V
        //  1158: goto            1169
        //  1161: astore          5
        //  1163: aload_1        
        //  1164: aload           5
        //  1166: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1169: aload_1        
        //  1170: athrow         
        //  1171: astore_1       
        //  1172: getstatic       ebk.b:Lnsd;
        //  1175: invokevirtual   nry.b:()Lnsu;
        //  1178: ldc_w           "Failed to write file."
        //  1181: sipush          1079
        //  1184: aload_1        
        //  1185: invokestatic    a.m:(Lnsu;Ljava/lang/String;CLjava/lang/Throwable;)V
        //  1188: goto            1208
        //  1191: aload_2        
        //  1192: getfield        ebk.e:Leeb;
        //  1195: aload           7
        //  1197: aload           13
        //  1199: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //  1202: aload_3        
        //  1203: invokeinterface eeb.a:(Lcom/google/android/apps/camera/imax/cyclops/image/StereoPanorama;Ljava/lang/String;Lcom/google/geo/lightfield/processing/ProgressCallback;)V
        //  1208: aload           13
        //  1210: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //  1213: astore          12
        //  1215: new             Lcom/google/android/libraries/camera/exif/ExifInterface;
        //  1218: astore          5
        //  1220: aload           5
        //  1222: invokespecial   com/google/android/libraries/camera/exif/ExifInterface.<init>:()V
        //  1225: aload           5
        //  1227: aload           12
        //  1229: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.readExif:(Ljava/lang/String;)V
        //  1232: new             Lkvj;
        //  1235: astore_1       
        //  1236: aload_1        
        //  1237: aload           5
        //  1239: invokespecial   kvj.<init>:(Lcom/google/android/libraries/camera/exif/ExifInterface;)V
        //  1242: aload_2        
        //  1243: getfield        ebk.f:Lbtl;
        //  1246: invokevirtual   btl.b:()Lniz;
        //  1249: invokevirtual   niz.g:()Z
        //  1252: istore          14
        //  1254: iload           14
        //  1256: ifeq            1289
        //  1259: aload_1        
        //  1260: aload_2        
        //  1261: getfield        ebk.f:Lbtl;
        //  1264: invokevirtual   btl.b:()Lniz;
        //  1267: invokevirtual   niz.c:()Ljava/lang/Object;
        //  1270: checkcast       Landroid/location/Location;
        //  1273: invokevirtual   kvj.d:(Landroid/location/Location;)V
        //  1276: goto            1289
        //  1279: astore          5
        //  1281: aload_3        
        //  1282: astore_1       
        //  1283: aload           5
        //  1285: astore_3       
        //  1286: goto            2201
        //  1289: aload_1        
        //  1290: invokevirtual   kvj.e:()V
        //  1293: aload_1        
        //  1294: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1297: invokevirtual   kvj.g:(J)V
        //  1300: aload_1        
        //  1301: getfield        kvj.a:Lcom/google/android/libraries/camera/exif/ExifInterface;
        //  1304: astore          9
        //  1306: aload_2        
        //  1307: getfield        ebk.i:Ljdi;
        //  1310: aload           9
        //  1312: invokevirtual   jdi.a:(Lcom/google/android/libraries/camera/exif/ExifInterface;)V
        //  1315: aload           9
        //  1317: getstatic       com/google/android/libraries/camera/exif/ExifInterface.h:I
        //  1320: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.getTagStringValue:(I)Ljava/lang/String;
        //  1323: astore          15
        //  1325: aload           9
        //  1327: getstatic       com/google/android/libraries/camera/exif/ExifInterface.g:I
        //  1330: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.getTagStringValue:(I)Ljava/lang/String;
        //  1333: astore          16
        //  1335: aload           9
        //  1337: getstatic       com/google/android/libraries/camera/exif/ExifInterface.aR:I
        //  1340: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.u:(I)[Lkrb;
        //  1343: invokestatic    krb.a:([Lkrb;)Ljava/lang/String;
        //  1346: astore          17
        //  1348: aload           9
        //  1350: getstatic       com/google/android/libraries/camera/exif/ExifInterface.aT:I
        //  1353: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.u:(I)[Lkrb;
        //  1356: invokestatic    krb.a:([Lkrb;)Ljava/lang/String;
        //  1359: astore          18
        //  1361: aload           9
        //  1363: getstatic       com/google/android/libraries/camera/exif/ExifInterface.aQ:I
        //  1366: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.getTagStringValue:(I)Ljava/lang/String;
        //  1369: astore          19
        //  1371: aload           9
        //  1373: getstatic       com/google/android/libraries/camera/exif/ExifInterface.aS:I
        //  1376: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.getTagStringValue:(I)Ljava/lang/String;
        //  1379: astore          20
        //  1381: aload           9
        //  1383: getstatic       com/google/android/libraries/camera/exif/ExifInterface.aV:I
        //  1386: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.u:(I)[Lkrb;
        //  1389: invokestatic    krb.a:([Lkrb;)Ljava/lang/String;
        //  1392: astore          21
        //  1394: aload           9
        //  1396: getstatic       com/google/android/libraries/camera/exif/ExifInterface.aU:I
        //  1399: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.k:(I)Lkvh;
        //  1402: astore          4
        //  1404: aload           9
        //  1406: getstatic       com/google/android/libraries/camera/exif/ExifInterface.aW:I
        //  1409: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.u:(I)[Lkrb;
        //  1412: astore          8
        //  1414: aload           8
        //  1416: ifnull          1623
        //  1419: aload           8
        //  1421: arraylength    
        //  1422: istore          6
        //  1424: iload           6
        //  1426: iconst_3       
        //  1427: if_icmpeq       1438
        //  1430: aload_3        
        //  1431: astore_1       
        //  1432: aconst_null    
        //  1433: astore          8
        //  1435: goto            1628
        //  1438: new             Ljava/lang/StringBuilder;
        //  1441: dup            
        //  1442: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1445: astore          22
        //  1447: iconst_0       
        //  1448: istore          6
        //  1450: aload_3        
        //  1451: astore_1       
        //  1452: aload_1        
        //  1453: astore          5
        //  1455: aload_1        
        //  1456: astore_2       
        //  1457: aload_1        
        //  1458: astore_3       
        //  1459: aload           8
        //  1461: arraylength    
        //  1462: istore          11
        //  1464: iload           6
        //  1466: iload           11
        //  1468: if_icmpge       1586
        //  1471: aload           8
        //  1473: iload           6
        //  1475: aaload         
        //  1476: astore          23
        //  1478: aload_1        
        //  1479: astore          5
        //  1481: aload_1        
        //  1482: astore_2       
        //  1483: aload_1        
        //  1484: astore_3       
        //  1485: aload           23
        //  1487: getfield        krb.a:J
        //  1490: lstore          24
        //  1492: aload_1        
        //  1493: astore          5
        //  1495: aload_1        
        //  1496: astore_2       
        //  1497: aload_1        
        //  1498: astore_3       
        //  1499: aload           23
        //  1501: getfield        krb.b:J
        //  1504: lconst_1       
        //  1505: lcmp           
        //  1506: ifeq            1515
        //  1509: lconst_0       
        //  1510: lstore          24
        //  1512: goto            1515
        //  1515: lload           24
        //  1517: ldc2_w          9
        //  1520: lcmp           
        //  1521: ifgt            1540
        //  1524: aload_1        
        //  1525: astore          5
        //  1527: aload_1        
        //  1528: astore_2       
        //  1529: aload_1        
        //  1530: astore_3       
        //  1531: aload           22
        //  1533: ldc_w           "0"
        //  1536: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1539: pop            
        //  1540: aload_1        
        //  1541: astore          5
        //  1543: aload_1        
        //  1544: astore_2       
        //  1545: aload_1        
        //  1546: astore_3       
        //  1547: aload           22
        //  1549: lload           24
        //  1551: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  1554: pop            
        //  1555: iload           6
        //  1557: iload           11
        //  1559: iconst_1       
        //  1560: isub           
        //  1561: if_icmpeq       1580
        //  1564: aload_1        
        //  1565: astore          5
        //  1567: aload_1        
        //  1568: astore_2       
        //  1569: aload_1        
        //  1570: astore_3       
        //  1571: aload           22
        //  1573: ldc_w           ":"
        //  1576: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1579: pop            
        //  1580: iinc            6, 1
        //  1583: goto            1452
        //  1586: aload_1        
        //  1587: astore          5
        //  1589: aload_1        
        //  1590: astore_2       
        //  1591: aload_1        
        //  1592: astore_3       
        //  1593: aload           22
        //  1595: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1598: astore          8
        //  1600: goto            1628
        //  1603: astore_1       
        //  1604: goto            1615
        //  1607: astore_1       
        //  1608: goto            1612
        //  1611: astore_1       
        //  1612: aload_3        
        //  1613: astore          5
        //  1615: aload_1        
        //  1616: astore_3       
        //  1617: aload           5
        //  1619: astore_1       
        //  1620: goto            1286
        //  1623: aload_3        
        //  1624: astore_1       
        //  1625: aconst_null    
        //  1626: astore          8
        //  1628: aload_1        
        //  1629: astore_2       
        //  1630: aload_1        
        //  1631: astore_3       
        //  1632: aload           9
        //  1634: getstatic       com/google/android/libraries/camera/exif/ExifInterface.bq:I
        //  1637: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.getTagStringValue:(I)Ljava/lang/String;
        //  1640: astore          26
        //  1642: aload_1        
        //  1643: astore_2       
        //  1644: aload_1        
        //  1645: astore_3       
        //  1646: aload           9
        //  1648: getstatic       com/google/android/libraries/camera/exif/ExifInterface.s:I
        //  1651: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.getTagStringValue:(I)Ljava/lang/String;
        //  1654: astore          27
        //  1656: aload_1        
        //  1657: astore_2       
        //  1658: aload_1        
        //  1659: astore_3       
        //  1660: aload           9
        //  1662: getstatic       com/google/android/libraries/camera/exif/ExifInterface.aK:I
        //  1665: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.getTagStringValue:(I)Ljava/lang/String;
        //  1668: astore          22
        //  1670: aload_1        
        //  1671: astore_2       
        //  1672: aload_1        
        //  1673: astore_3       
        //  1674: aload           9
        //  1676: getstatic       com/google/android/libraries/camera/exif/ExifInterface.ad:I
        //  1679: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.getTagStringValue:(I)Ljava/lang/String;
        //  1682: astore          23
        //  1684: aload_1        
        //  1685: astore_2       
        //  1686: aload_1        
        //  1687: astore_3       
        //  1688: new             Landroid/media/ExifInterface;
        //  1691: astore          28
        //  1693: aload_1        
        //  1694: astore_2       
        //  1695: aload_1        
        //  1696: astore_3       
        //  1697: aload           28
        //  1699: aload           12
        //  1701: invokespecial   android/media/ExifInterface.<init>:(Ljava/lang/String;)V
        //  1704: aload           15
        //  1706: ifnull          1726
        //  1709: aload_1        
        //  1710: astore          5
        //  1712: aload_1        
        //  1713: astore_2       
        //  1714: aload_1        
        //  1715: astore_3       
        //  1716: aload           28
        //  1718: ldc_w           "Model"
        //  1721: aload           15
        //  1723: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1726: aload           16
        //  1728: ifnull          1748
        //  1731: aload_1        
        //  1732: astore          5
        //  1734: aload_1        
        //  1735: astore_2       
        //  1736: aload_1        
        //  1737: astore_3       
        //  1738: aload           28
        //  1740: ldc_w           "Make"
        //  1743: aload           16
        //  1745: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1748: aload           17
        //  1750: ifnull          1770
        //  1753: aload_1        
        //  1754: astore          5
        //  1756: aload_1        
        //  1757: astore_2       
        //  1758: aload_1        
        //  1759: astore_3       
        //  1760: aload           28
        //  1762: ldc_w           "GPSLatitude"
        //  1765: aload           17
        //  1767: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1770: aload           18
        //  1772: ifnull          1792
        //  1775: aload_1        
        //  1776: astore          5
        //  1778: aload_1        
        //  1779: astore_2       
        //  1780: aload_1        
        //  1781: astore_3       
        //  1782: aload           28
        //  1784: ldc_w           "GPSLongitude"
        //  1787: aload           18
        //  1789: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1792: aload           19
        //  1794: ifnull          1814
        //  1797: aload_1        
        //  1798: astore          5
        //  1800: aload_1        
        //  1801: astore_2       
        //  1802: aload_1        
        //  1803: astore_3       
        //  1804: aload           28
        //  1806: ldc_w           "GPSLatitudeRef"
        //  1809: aload           19
        //  1811: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1814: aload           20
        //  1816: ifnull          1836
        //  1819: aload_1        
        //  1820: astore          5
        //  1822: aload_1        
        //  1823: astore_2       
        //  1824: aload_1        
        //  1825: astore_3       
        //  1826: aload           28
        //  1828: ldc_w           "GPSLongitudeRef"
        //  1831: aload           20
        //  1833: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1836: aload           8
        //  1838: ifnull          1858
        //  1841: aload_1        
        //  1842: astore          5
        //  1844: aload_1        
        //  1845: astore_2       
        //  1846: aload_1        
        //  1847: astore_3       
        //  1848: aload           28
        //  1850: ldc_w           "GPSTimeStamp"
        //  1853: aload           8
        //  1855: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1858: aload           26
        //  1860: ifnull          1880
        //  1863: aload_1        
        //  1864: astore          5
        //  1866: aload_1        
        //  1867: astore_2       
        //  1868: aload_1        
        //  1869: astore_3       
        //  1870: aload           28
        //  1872: ldc_w           "GPSDateStamp"
        //  1875: aload           26
        //  1877: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1880: aload           21
        //  1882: ifnull          1902
        //  1885: aload_1        
        //  1886: astore          5
        //  1888: aload_1        
        //  1889: astore_2       
        //  1890: aload_1        
        //  1891: astore_3       
        //  1892: aload           28
        //  1894: ldc_w           "GPSAltitude"
        //  1897: aload           21
        //  1899: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  1902: aload           4
        //  1904: ifnull          2025
        //  1907: aload_1        
        //  1908: astore_2       
        //  1909: aload_1        
        //  1910: astore_3       
        //  1911: aload           4
        //  1913: invokevirtual   kvh.e:()Z
        //  1916: ifeq            2025
        //  1919: aload_1        
        //  1920: astore_2       
        //  1921: aload_1        
        //  1922: astore_3       
        //  1923: aload           4
        //  1925: getfield        kvh.f:Ljava/lang/Object;
        //  1928: astore          8
        //  1930: aload_1        
        //  1931: astore_2       
        //  1932: aload_1        
        //  1933: astore_3       
        //  1934: aload           8
        //  1936: instanceof      [B
        //  1939: istore          14
        //  1941: iload           14
        //  1943: ifeq            1967
        //  1946: aload_1        
        //  1947: astore          5
        //  1949: aload_1        
        //  1950: astore_2       
        //  1951: aload_1        
        //  1952: astore_3       
        //  1953: aload           8
        //  1955: checkcast       [B
        //  1958: astore          8
        //  1960: aload           8
        //  1962: astore          5
        //  1964: goto            1970
        //  1967: aconst_null    
        //  1968: astore          5
        //  1970: aload           5
        //  1972: ifnull          2022
        //  1975: aload_1        
        //  1976: astore_2       
        //  1977: aload_1        
        //  1978: astore_3       
        //  1979: aload           5
        //  1981: arraylength    
        //  1982: istore          6
        //  1984: iload           6
        //  1986: ifgt            1992
        //  1989: goto            2025
        //  1992: aload           5
        //  1994: iconst_0       
        //  1995: baload         
        //  1996: iconst_m1      
        //  1997: if_icmpeq       2025
        //  2000: aload           4
        //  2002: invokevirtual   kvh.d:()Ljava/lang/String;
        //  2005: astore_3       
        //  2006: aload_3        
        //  2007: ifnull          2025
        //  2010: aload           28
        //  2012: ldc_w           "GPSAltitudeRef"
        //  2015: aload_3        
        //  2016: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  2019: goto            2025
        //  2022: goto            2025
        //  2025: aload           27
        //  2027: ifnull          2075
        //  2030: aload           28
        //  2032: ldc_w           "DateTime"
        //  2035: aload           27
        //  2037: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  2040: aload           28
        //  2042: ldc_w           "DateTimeOriginal"
        //  2045: aload           27
        //  2047: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  2050: aload           28
        //  2052: ldc_w           "DateTimeDigitized"
        //  2055: aload           27
        //  2057: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  2060: goto            2075
        //  2063: astore_3       
        //  2064: goto            2160
        //  2067: astore_3       
        //  2068: goto            2175
        //  2071: astore_3       
        //  2072: goto            2201
        //  2075: aload           22
        //  2077: ifnull          2110
        //  2080: aload           28
        //  2082: ldc_w           "OffsetTime"
        //  2085: aload           22
        //  2087: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  2090: aload           28
        //  2092: ldc_w           "OffsetTimeOriginal"
        //  2095: aload           22
        //  2097: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  2100: aload           28
        //  2102: ldc_w           "OffsetTimeDigitized"
        //  2105: aload           22
        //  2107: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  2110: aload           23
        //  2112: ifnull          2145
        //  2115: aload           28
        //  2117: ldc_w           "SubSecTime"
        //  2120: aload           23
        //  2122: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  2125: aload           28
        //  2127: ldc_w           "SubSecTimeOriginal"
        //  2130: aload           23
        //  2132: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  2135: aload           28
        //  2137: ldc_w           "SubSecTimeDigitized"
        //  2140: aload           23
        //  2142: invokevirtual   android/media/ExifInterface.setAttribute:(Ljava/lang/String;Ljava/lang/String;)V
        //  2145: aload           28
        //  2147: invokevirtual   android/media/ExifInterface.saveAttributes:()V
        //  2150: aload           9
        //  2152: astore          5
        //  2154: goto            2220
        //  2157: astore_3       
        //  2158: aload_2        
        //  2159: astore_1       
        //  2160: aload_3        
        //  2161: astore          5
        //  2163: aload_1        
        //  2164: astore_3       
        //  2165: goto            2694
        //  2168: astore          5
        //  2170: aload_3        
        //  2171: astore_1       
        //  2172: aload           5
        //  2174: astore_3       
        //  2175: aload_3        
        //  2176: astore          5
        //  2178: goto            2594
        //  2181: astore_3       
        //  2182: goto            2201
        //  2185: astore_1       
        //  2186: goto            2578
        //  2189: astore          5
        //  2191: goto            2586
        //  2194: astore          5
        //  2196: aload_3        
        //  2197: astore_1       
        //  2198: aload           5
        //  2200: astore_3       
        //  2201: getstatic       ebk.b:Lnsd;
        //  2204: invokevirtual   nry.b:()Lnsu;
        //  2207: ldc_w           "Could not read exif data"
        //  2210: sipush          1075
        //  2213: aload_3        
        //  2214: invokestatic    a.m:(Lnsu;Ljava/lang/String;CLjava/lang/Throwable;)V
        //  2217: aconst_null    
        //  2218: astore          5
        //  2220: aload_0        
        //  2221: astore_2       
        //  2222: aload_2        
        //  2223: getfield        ebk.h:Lkse;
        //  2226: invokeinterface kse.g:()V
        //  2231: aload_1        
        //  2232: astore_3       
        //  2233: aload_1        
        //  2234: fconst_1       
        //  2235: invokeinterface com/google/geo/lightfield/processing/ProgressCallback.setProgress:(F)V
        //  2240: aload_1        
        //  2241: astore_3       
        //  2242: new             Ljava/io/FileInputStream;
        //  2245: astore          4
        //  2247: aload_1        
        //  2248: astore_3       
        //  2249: aload           4
        //  2251: aload           13
        //  2253: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //  2256: aload_1        
        //  2257: astore_3       
        //  2258: aload           4
        //  2260: invokestatic    com/google/common/io/ByteStreams.toByteArray:(Ljava/io/InputStream;)[B
        //  2263: astore          4
        //  2265: aload_1        
        //  2266: astore_3       
        //  2267: aload_2        
        //  2268: getfield        ebk.a:Lhhy;
        //  2271: astore_2       
        //  2272: aload_1        
        //  2273: astore_3       
        //  2274: new             Lhwr;
        //  2277: astore          9
        //  2279: aload_1        
        //  2280: astore_3       
        //  2281: new             Lkre;
        //  2284: astore          8
        //  2286: aload_1        
        //  2287: astore_3       
        //  2288: aload           7
        //  2290: getfield        com/google/android/apps/camera/imax/cyclops/image/StereoPanorama.c:Lcom/google/android/apps/camera/imax/cyclops/metadata/PanoMeta;
        //  2293: astore          7
        //  2295: aload_1        
        //  2296: astore_3       
        //  2297: aload           8
        //  2299: aload           7
        //  2301: getfield        com/google/android/apps/camera/imax/cyclops/metadata/PanoMeta.croppedAreaImageWidthPixels:I
        //  2304: aload           7
        //  2306: getfield        com/google/android/apps/camera/imax/cyclops/metadata/PanoMeta.croppedAreaImageHeightPixels:I
        //  2309: invokespecial   kre.<init>:(II)V
        //  2312: aload_1        
        //  2313: astore_3       
        //  2314: aload           9
        //  2316: getstatic       llk.c:Lllk;
        //  2319: invokespecial   hwr.<init>:(Lllk;)V
        //  2322: aload_1        
        //  2323: astore_3       
        //  2324: aload           9
        //  2326: aload           5
        //  2328: invokevirtual   hwr.a:(Lcom/google/android/libraries/camera/exif/ExifInterface;)V
        //  2331: aload_1        
        //  2332: astore_3       
        //  2333: aload           9
        //  2335: getstatic       kra.a:Lkra;
        //  2338: invokevirtual   hwr.b:(Lkra;)V
        //  2341: aload_1        
        //  2342: astore_3       
        //  2343: aload_2        
        //  2344: aload           4
        //  2346: aload           9
        //  2348: invokeinterface hhy.r:([BLhwr;)Loey;
        //  2353: pop            
        //  2354: iconst_1       
        //  2355: istore          6
        //  2357: goto            2411
        //  2360: astore          5
        //  2362: aload_1        
        //  2363: astore_3       
        //  2364: getstatic       ebk.b:Lnsd;
        //  2367: invokevirtual   nry.b:()Lnsu;
        //  2370: ldc_w           "Unable to read file for saving"
        //  2373: sipush          1078
        //  2376: aload           5
        //  2378: invokestatic    a.m:(Lnsu;Ljava/lang/String;CLjava/lang/Throwable;)V
        //  2381: iconst_1       
        //  2382: istore          6
        //  2384: goto            2411
        //  2387: astore          5
        //  2389: aload_1        
        //  2390: astore_3       
        //  2391: getstatic       ebk.b:Lnsd;
        //  2394: invokevirtual   nry.b:()Lnsu;
        //  2397: ldc_w           "File not found for saving"
        //  2400: sipush          1077
        //  2403: aload           5
        //  2405: invokestatic    a.m:(Lnsu;Ljava/lang/String;CLjava/lang/Throwable;)V
        //  2408: iconst_1       
        //  2409: istore          6
        //  2411: iconst_0       
        //  2412: istore          10
        //  2414: aload_0        
        //  2415: astore_3       
        //  2416: aload_1        
        //  2417: invokevirtual   ogj.a:()V
        //  2420: aload_3        
        //  2421: getfield        ebk.g:Ljava/util/List;
        //  2424: invokestatic    nns.j:(Ljava/util/Collection;)Lnns;
        //  2427: astore_1       
        //  2428: aload_1        
        //  2429: invokeinterface java/util/List.size:()I
        //  2434: istore          29
        //  2436: iconst_0       
        //  2437: istore          11
        //  2439: iload           11
        //  2441: iload           29
        //  2443: if_icmpge       2469
        //  2446: aload_1        
        //  2447: iload           11
        //  2449: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2454: checkcast       Lkqq;
        //  2457: aload_3        
        //  2458: invokeinterface kqq.a:(Ljava/lang/Object;)V
        //  2463: iinc            11, 1
        //  2466: goto            2439
        //  2469: iload           6
        //  2471: ifeq            2689
        //  2474: new             Ljava/io/File;
        //  2477: dup            
        //  2478: aload_3        
        //  2479: getfield        ebk.k:Leat;
        //  2482: invokevirtual   eat.a:()Ljava/lang/String;
        //  2485: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //  2488: astore_1       
        //  2489: aload_1        
        //  2490: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //  2493: astore_3       
        //  2494: aload_3        
        //  2495: ifnull          2689
        //  2498: aload_3        
        //  2499: arraylength    
        //  2500: istore          11
        //  2502: iload           10
        //  2504: istore          6
        //  2506: iload           6
        //  2508: iload           11
        //  2510: if_icmpge       2527
        //  2513: aload_3        
        //  2514: iload           6
        //  2516: aaload         
        //  2517: invokevirtual   java/io/File.delete:()Z
        //  2520: pop            
        //  2521: iinc            6, 1
        //  2524: goto            2506
        //  2527: aload_1        
        //  2528: invokevirtual   java/io/File.delete:()Z
        //  2531: pop            
        //  2532: return         
        //  2533: astore_3       
        //  2534: goto            2591
        //  2537: astore_3       
        //  2538: goto            2546
        //  2541: astore_3       
        //  2542: goto            2558
        //  2545: astore_3       
        //  2546: aload_1        
        //  2547: astore          5
        //  2549: aload_3        
        //  2550: astore_1       
        //  2551: aload           5
        //  2553: astore_3       
        //  2554: goto            2578
        //  2557: astore_3       
        //  2558: goto            2591
        //  2561: astore_1       
        //  2562: goto            2578
        //  2565: astore_1       
        //  2566: aload_3        
        //  2567: astore          5
        //  2569: aload_1        
        //  2570: astore_3       
        //  2571: aload           5
        //  2573: astore_1       
        //  2574: goto            2591
        //  2577: astore_1       
        //  2578: aload_1        
        //  2579: astore          5
        //  2581: goto            2694
        //  2584: astore          5
        //  2586: aload_3        
        //  2587: astore_1       
        //  2588: aload           5
        //  2590: astore_3       
        //  2591: aload_3        
        //  2592: astore          5
        //  2594: iconst_0       
        //  2595: istore          6
        //  2597: aload_0        
        //  2598: astore_2       
        //  2599: aload_1        
        //  2600: astore_3       
        //  2601: getstatic       ebk.b:Lnsd;
        //  2604: invokevirtual   nry.b:()Lnsu;
        //  2607: checkcast       Lnsa;
        //  2610: aload           5
        //  2612: invokeinterface nsa.h:(Ljava/lang/Throwable;)Lnsu;
        //  2617: checkcast       Lnsa;
        //  2620: sipush          1076
        //  2623: invokeinterface nsa.E:(I)Lnsu;
        //  2628: checkcast       Lnsa;
        //  2631: ldc_w           "Failed to compute panorama"
        //  2634: invokeinterface nsa.o:(Ljava/lang/String;)V
        //  2639: aload_1        
        //  2640: invokevirtual   ogj.a:()V
        //  2643: aload_2        
        //  2644: getfield        ebk.g:Ljava/util/List;
        //  2647: invokestatic    nns.j:(Ljava/util/Collection;)Lnns;
        //  2650: astore_1       
        //  2651: aload_1        
        //  2652: invokeinterface java/util/List.size:()I
        //  2657: istore          11
        //  2659: iload           6
        //  2661: iload           11
        //  2663: if_icmpge       2689
        //  2666: aload_1        
        //  2667: iload           6
        //  2669: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2674: checkcast       Lkqq;
        //  2677: aload_2        
        //  2678: invokeinterface kqq.a:(Ljava/lang/Object;)V
        //  2683: iinc            6, 1
        //  2686: goto            2659
        //  2689: return         
        //  2690: astore_1       
        //  2691: goto            2578
        //  2694: iconst_0       
        //  2695: istore          6
        //  2697: aload_0        
        //  2698: astore_1       
        //  2699: aload_3        
        //  2700: invokevirtual   ogj.a:()V
        //  2703: aload_1        
        //  2704: getfield        ebk.g:Ljava/util/List;
        //  2707: invokestatic    nns.j:(Ljava/util/Collection;)Lnns;
        //  2710: astore_3       
        //  2711: aload_3        
        //  2712: invokeinterface java/util/List.size:()I
        //  2717: istore          11
        //  2719: iload           6
        //  2721: iload           11
        //  2723: if_icmpge       2749
        //  2726: aload_3        
        //  2727: iload           6
        //  2729: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2734: checkcast       Lkqq;
        //  2737: aload_1        
        //  2738: invokeinterface kqq.a:(Ljava/lang/Object;)V
        //  2743: iinc            6, 1
        //  2746: goto            2719
        //  2749: goto            2755
        //  2752: aload           5
        //  2754: athrow         
        //  2755: goto            2752
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  18     31     2584   2586   Ljava/lang/Exception;
        //  18     31     2577   2578   Any
        //  34     40     2584   2586   Ljava/lang/Exception;
        //  34     40     2577   2578   Any
        //  49     75     2584   2586   Ljava/lang/Exception;
        //  49     75     2577   2578   Any
        //  75     126    2584   2586   Ljava/lang/Exception;
        //  75     126    2577   2578   Any
        //  126    156    2584   2586   Ljava/lang/Exception;
        //  126    156    2577   2578   Any
        //  164    183    2584   2586   Ljava/lang/Exception;
        //  164    183    2577   2578   Any
        //  186    198    2584   2586   Ljava/lang/Exception;
        //  186    198    2577   2578   Any
        //  198    278    2584   2586   Ljava/lang/Exception;
        //  198    278    2577   2578   Any
        //  278    283    286    310    Ljava/lang/InterruptedException;
        //  278    283    2584   2586   Ljava/lang/Exception;
        //  278    283    2577   2578   Any
        //  288    310    2584   2586   Ljava/lang/Exception;
        //  288    310    2577   2578   Any
        //  310    329    2584   2586   Ljava/lang/Exception;
        //  310    329    2577   2578   Any
        //  342    383    2584   2586   Ljava/lang/Exception;
        //  342    383    2577   2578   Any
        //  383    395    880    883    Ljava/io/IOException;
        //  383    395    2584   2586   Ljava/lang/Exception;
        //  383    395    2577   2578   Any
        //  395    412    2584   2586   Ljava/lang/Exception;
        //  395    412    2577   2578   Any
        //  412    419    516    536    Ljava/io/IOException;
        //  412    419    2584   2586   Ljava/lang/Exception;
        //  412    419    2577   2578   Any
        //  419    426    2584   2586   Ljava/lang/Exception;
        //  419    426    2577   2578   Any
        //  440    462    2584   2586   Ljava/lang/Exception;
        //  440    462    2577   2578   Any
        //  476    493    2584   2586   Ljava/lang/Exception;
        //  476    493    2577   2578   Any
        //  498    513    2584   2586   Ljava/lang/Exception;
        //  498    513    2577   2578   Any
        //  517    534    2584   2586   Ljava/lang/Exception;
        //  517    534    2577   2578   Any
        //  540    557    2584   2586   Ljava/lang/Exception;
        //  540    557    2577   2578   Any
        //  563    602    2584   2586   Ljava/lang/Exception;
        //  563    602    2577   2578   Any
        //  602    612    2584   2586   Ljava/lang/Exception;
        //  602    612    2577   2578   Any
        //  617    627    2584   2586   Ljava/lang/Exception;
        //  617    627    2577   2578   Any
        //  640    654    2584   2586   Ljava/lang/Exception;
        //  640    654    2577   2578   Any
        //  654    664    753    756    Ljava/io/IOException;
        //  654    664    734    738    Any
        //  674    689    712    717    Ljava/io/IOException;
        //  674    689    707    712    Any
        //  717    721    727    734    Ljava/io/IOException;
        //  717    721    2584   2586   Ljava/lang/Exception;
        //  717    721    2577   2578   Any
        //  742    746    749    750    Ljava/io/IOException;
        //  742    746    2584   2586   Ljava/lang/Exception;
        //  742    746    2577   2578   Any
        //  750    753    2584   2586   Ljava/lang/Exception;
        //  750    753    2577   2578   Any
        //  760    764    769    770    Ljava/io/IOException;
        //  760    764    2584   2586   Ljava/lang/Exception;
        //  760    764    2577   2578   Any
        //  772    778    2584   2586   Ljava/lang/Exception;
        //  772    778    2577   2578   Any
        //  787    804    2584   2586   Ljava/lang/Exception;
        //  787    804    2577   2578   Any
        //  815    823    2584   2586   Ljava/lang/Exception;
        //  815    823    2577   2578   Any
        //  823    834    2565   2577   Ljava/lang/Exception;
        //  823    834    2561   2565   Any
        //  842    877    2565   2577   Ljava/lang/Exception;
        //  842    877    2561   2565   Any
        //  883    902    2565   2577   Ljava/lang/Exception;
        //  883    902    2561   2565   Any
        //  909    916    2565   2577   Ljava/lang/Exception;
        //  909    916    2561   2565   Any
        //  916    949    2565   2577   Ljava/lang/Exception;
        //  916    949    2561   2565   Any
        //  956    1105   2565   2577   Ljava/lang/Exception;
        //  956    1105   2561   2565   Any
        //  1110   1122   1171   1191   Ljava/io/IOException;
        //  1110   1122   2565   2577   Ljava/lang/Exception;
        //  1110   1122   2561   2565   Any
        //  1122   1144   1152   1171   Any
        //  1144   1149   1171   1191   Ljava/io/IOException;
        //  1144   1149   2565   2577   Ljava/lang/Exception;
        //  1144   1149   2561   2565   Any
        //  1153   1158   1161   1169   Any
        //  1163   1169   1171   1191   Ljava/io/IOException;
        //  1163   1169   2565   2577   Ljava/lang/Exception;
        //  1163   1169   2561   2565   Any
        //  1169   1171   1171   1191   Ljava/io/IOException;
        //  1169   1171   2565   2577   Ljava/lang/Exception;
        //  1169   1171   2561   2565   Any
        //  1172   1188   2565   2577   Ljava/lang/Exception;
        //  1172   1188   2561   2565   Any
        //  1191   1208   2565   2577   Ljava/lang/Exception;
        //  1191   1208   2561   2565   Any
        //  1208   1215   2565   2577   Ljava/lang/Exception;
        //  1208   1215   2561   2565   Any
        //  1215   1254   2194   2201   Ljava/io/IOException;
        //  1215   1254   2189   2194   Ljava/lang/Exception;
        //  1215   1254   2185   2189   Any
        //  1259   1276   1279   1286   Ljava/io/IOException;
        //  1259   1276   2565   2577   Ljava/lang/Exception;
        //  1259   1276   2561   2565   Any
        //  1289   1414   2194   2201   Ljava/io/IOException;
        //  1289   1414   2189   2194   Ljava/lang/Exception;
        //  1289   1414   2185   2189   Any
        //  1419   1424   1611   1612   Ljava/io/IOException;
        //  1419   1424   2189   2194   Ljava/lang/Exception;
        //  1419   1424   2185   2189   Any
        //  1438   1447   1607   1611   Ljava/io/IOException;
        //  1438   1447   2189   2194   Ljava/lang/Exception;
        //  1438   1447   2185   2189   Any
        //  1459   1464   1603   1607   Ljava/io/IOException;
        //  1459   1464   2168   2175   Ljava/lang/Exception;
        //  1459   1464   2157   2160   Any
        //  1485   1492   1603   1607   Ljava/io/IOException;
        //  1485   1492   2168   2175   Ljava/lang/Exception;
        //  1485   1492   2157   2160   Any
        //  1499   1509   1603   1607   Ljava/io/IOException;
        //  1499   1509   2168   2175   Ljava/lang/Exception;
        //  1499   1509   2157   2160   Any
        //  1531   1540   1603   1607   Ljava/io/IOException;
        //  1531   1540   2168   2175   Ljava/lang/Exception;
        //  1531   1540   2157   2160   Any
        //  1547   1555   1603   1607   Ljava/io/IOException;
        //  1547   1555   2168   2175   Ljava/lang/Exception;
        //  1547   1555   2157   2160   Any
        //  1571   1580   1603   1607   Ljava/io/IOException;
        //  1571   1580   2168   2175   Ljava/lang/Exception;
        //  1571   1580   2157   2160   Any
        //  1593   1600   1603   1607   Ljava/io/IOException;
        //  1593   1600   2168   2175   Ljava/lang/Exception;
        //  1593   1600   2157   2160   Any
        //  1632   1642   2181   2185   Ljava/io/IOException;
        //  1632   1642   2168   2175   Ljava/lang/Exception;
        //  1632   1642   2157   2160   Any
        //  1646   1656   2181   2185   Ljava/io/IOException;
        //  1646   1656   2168   2175   Ljava/lang/Exception;
        //  1646   1656   2157   2160   Any
        //  1660   1670   2181   2185   Ljava/io/IOException;
        //  1660   1670   2168   2175   Ljava/lang/Exception;
        //  1660   1670   2157   2160   Any
        //  1674   1684   2181   2185   Ljava/io/IOException;
        //  1674   1684   2168   2175   Ljava/lang/Exception;
        //  1674   1684   2157   2160   Any
        //  1688   1693   2181   2185   Ljava/io/IOException;
        //  1688   1693   2168   2175   Ljava/lang/Exception;
        //  1688   1693   2157   2160   Any
        //  1697   1704   2181   2185   Ljava/io/IOException;
        //  1697   1704   2168   2175   Ljava/lang/Exception;
        //  1697   1704   2157   2160   Any
        //  1716   1726   1603   1607   Ljava/io/IOException;
        //  1716   1726   2168   2175   Ljava/lang/Exception;
        //  1716   1726   2157   2160   Any
        //  1738   1748   1603   1607   Ljava/io/IOException;
        //  1738   1748   2168   2175   Ljava/lang/Exception;
        //  1738   1748   2157   2160   Any
        //  1760   1770   1603   1607   Ljava/io/IOException;
        //  1760   1770   2168   2175   Ljava/lang/Exception;
        //  1760   1770   2157   2160   Any
        //  1782   1792   1603   1607   Ljava/io/IOException;
        //  1782   1792   2168   2175   Ljava/lang/Exception;
        //  1782   1792   2157   2160   Any
        //  1804   1814   1603   1607   Ljava/io/IOException;
        //  1804   1814   2168   2175   Ljava/lang/Exception;
        //  1804   1814   2157   2160   Any
        //  1826   1836   1603   1607   Ljava/io/IOException;
        //  1826   1836   2168   2175   Ljava/lang/Exception;
        //  1826   1836   2157   2160   Any
        //  1848   1858   1603   1607   Ljava/io/IOException;
        //  1848   1858   2168   2175   Ljava/lang/Exception;
        //  1848   1858   2157   2160   Any
        //  1870   1880   1603   1607   Ljava/io/IOException;
        //  1870   1880   2168   2175   Ljava/lang/Exception;
        //  1870   1880   2157   2160   Any
        //  1892   1902   1603   1607   Ljava/io/IOException;
        //  1892   1902   2168   2175   Ljava/lang/Exception;
        //  1892   1902   2157   2160   Any
        //  1911   1919   2181   2185   Ljava/io/IOException;
        //  1911   1919   2168   2175   Ljava/lang/Exception;
        //  1911   1919   2157   2160   Any
        //  1923   1930   2181   2185   Ljava/io/IOException;
        //  1923   1930   2168   2175   Ljava/lang/Exception;
        //  1923   1930   2157   2160   Any
        //  1934   1941   2181   2185   Ljava/io/IOException;
        //  1934   1941   2168   2175   Ljava/lang/Exception;
        //  1934   1941   2157   2160   Any
        //  1953   1960   1603   1607   Ljava/io/IOException;
        //  1953   1960   2168   2175   Ljava/lang/Exception;
        //  1953   1960   2157   2160   Any
        //  1979   1984   2181   2185   Ljava/io/IOException;
        //  1979   1984   2168   2175   Ljava/lang/Exception;
        //  1979   1984   2157   2160   Any
        //  2000   2006   2071   2075   Ljava/io/IOException;
        //  2000   2006   2067   2071   Ljava/lang/Exception;
        //  2000   2006   2063   2067   Any
        //  2010   2019   2071   2075   Ljava/io/IOException;
        //  2010   2019   2067   2071   Ljava/lang/Exception;
        //  2010   2019   2063   2067   Any
        //  2030   2060   2071   2075   Ljava/io/IOException;
        //  2030   2060   2067   2071   Ljava/lang/Exception;
        //  2030   2060   2063   2067   Any
        //  2080   2110   2071   2075   Ljava/io/IOException;
        //  2080   2110   2067   2071   Ljava/lang/Exception;
        //  2080   2110   2063   2067   Any
        //  2115   2145   2071   2075   Ljava/io/IOException;
        //  2115   2145   2067   2071   Ljava/lang/Exception;
        //  2115   2145   2063   2067   Any
        //  2145   2150   2071   2075   Ljava/io/IOException;
        //  2145   2150   2067   2071   Ljava/lang/Exception;
        //  2145   2150   2063   2067   Any
        //  2201   2217   2557   2558   Ljava/lang/Exception;
        //  2201   2217   2545   2546   Any
        //  2222   2231   2541   2545   Ljava/lang/Exception;
        //  2222   2231   2537   2541   Any
        //  2233   2240   2533   2537   Ljava/lang/Exception;
        //  2233   2240   2690   2694   Any
        //  2242   2247   2387   2411   Ljava/io/FileNotFoundException;
        //  2242   2247   2360   2387   Ljava/io/IOException;
        //  2242   2247   2533   2537   Ljava/lang/Exception;
        //  2242   2247   2690   2694   Any
        //  2249   2256   2387   2411   Ljava/io/FileNotFoundException;
        //  2249   2256   2360   2387   Ljava/io/IOException;
        //  2249   2256   2533   2537   Ljava/lang/Exception;
        //  2249   2256   2690   2694   Any
        //  2258   2265   2387   2411   Ljava/io/FileNotFoundException;
        //  2258   2265   2360   2387   Ljava/io/IOException;
        //  2258   2265   2533   2537   Ljava/lang/Exception;
        //  2258   2265   2690   2694   Any
        //  2267   2272   2387   2411   Ljava/io/FileNotFoundException;
        //  2267   2272   2360   2387   Ljava/io/IOException;
        //  2267   2272   2533   2537   Ljava/lang/Exception;
        //  2267   2272   2690   2694   Any
        //  2274   2279   2387   2411   Ljava/io/FileNotFoundException;
        //  2274   2279   2360   2387   Ljava/io/IOException;
        //  2274   2279   2533   2537   Ljava/lang/Exception;
        //  2274   2279   2690   2694   Any
        //  2281   2286   2387   2411   Ljava/io/FileNotFoundException;
        //  2281   2286   2360   2387   Ljava/io/IOException;
        //  2281   2286   2533   2537   Ljava/lang/Exception;
        //  2281   2286   2690   2694   Any
        //  2288   2295   2387   2411   Ljava/io/FileNotFoundException;
        //  2288   2295   2360   2387   Ljava/io/IOException;
        //  2288   2295   2533   2537   Ljava/lang/Exception;
        //  2288   2295   2690   2694   Any
        //  2297   2312   2387   2411   Ljava/io/FileNotFoundException;
        //  2297   2312   2360   2387   Ljava/io/IOException;
        //  2297   2312   2533   2537   Ljava/lang/Exception;
        //  2297   2312   2690   2694   Any
        //  2314   2322   2387   2411   Ljava/io/FileNotFoundException;
        //  2314   2322   2360   2387   Ljava/io/IOException;
        //  2314   2322   2533   2537   Ljava/lang/Exception;
        //  2314   2322   2690   2694   Any
        //  2324   2331   2387   2411   Ljava/io/FileNotFoundException;
        //  2324   2331   2360   2387   Ljava/io/IOException;
        //  2324   2331   2533   2537   Ljava/lang/Exception;
        //  2324   2331   2690   2694   Any
        //  2333   2341   2387   2411   Ljava/io/FileNotFoundException;
        //  2333   2341   2360   2387   Ljava/io/IOException;
        //  2333   2341   2533   2537   Ljava/lang/Exception;
        //  2333   2341   2690   2694   Any
        //  2343   2354   2387   2411   Ljava/io/FileNotFoundException;
        //  2343   2354   2360   2387   Ljava/io/IOException;
        //  2343   2354   2533   2537   Ljava/lang/Exception;
        //  2343   2354   2690   2694   Any
        //  2364   2381   2533   2537   Ljava/lang/Exception;
        //  2364   2381   2690   2694   Any
        //  2391   2408   2533   2537   Ljava/lang/Exception;
        //  2391   2408   2690   2694   Any
        //  2601   2639   2690   2694   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    public final void e(final kqq kqq) {
        kqq.getClass();
        this.g.remove(kqq);
    }
    
    @Override
    public final void f() {
    }
    
    @Override
    public final void g() {
    }
}
