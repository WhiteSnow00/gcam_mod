import android.util.Log;
import java.util.concurrent.CountDownLatch;
import android.os.Handler;
import java.util.concurrent.Executor;
import android.hardware.camera2.CameraManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kti implements ktd
{
    public final String a;
    public final CameraManager b;
    public final ktm c;
    public final Executor d;
    public final Handler e;
    public final kse f;
    public final Object g;
    public final Object h;
    public final kty i;
    public final CountDownLatch j;
    public boolean k;
    public boolean l;
    private Throwable m;
    
    public kti(final Handler e, final Executor d, final CameraManager b, final ktm c, final kse f, final String a) {
        this.k = false;
        this.l = false;
        this.m = null;
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.e = e;
        this.d = d;
        this.i = new kty();
        this.g = new Object();
        this.h = new Object();
        this.j = new CountDownLatch(1);
    }
    
    private final void c(String g, final Exception ex, final boolean b, final kst kst, final String s) {
        Log.w("CAM_CameraDeviceOpener", g, (Throwable)ex);
        g = (String)this.g;
        monitorenter(g);
        if (!b) {
            return;
        }
        try {
            this.c.au(3, kst, s, 3);
        }
        finally {
            monitorexit(g);
        }
    }
    
    public final ktg a(final kty p0, final boolean p1, final long p2, final long p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0        
        //     5: getfield        kti.f:Lkse;
        //     8: invokespecial   kth.<init>:(Lkse;)V
        //    11: astore          7
        //    13: aload_1        
        //    14: aload           7
        //    16: invokevirtual   kty.e:(Lktb;)V
        //    19: aload_0        
        //    20: getfield        kti.f:Lkse;
        //    23: ldc             "CameraDeviceOpenerImpl#open"
        //    25: invokeinterface kse.f:(Ljava/lang/String;)V
        //    30: aload_0        
        //    31: getfield        kti.a:Ljava/lang/String;
        //    34: invokevirtual   java/lang/String.length:()I
        //    37: pop            
        //    38: aload_0        
        //    39: getfield        kti.b:Landroid/hardware/camera2/CameraManager;
        //    42: astore          8
        //    44: aload_0        
        //    45: getfield        kti.a:Ljava/lang/String;
        //    48: astore          9
        //    50: new             Lksn;
        //    53: astore          10
        //    55: aload           10
        //    57: aload_1        
        //    58: aload           9
        //    60: invokespecial   ksn.<init>:(Lktb;Ljava/lang/String;)V
        //    63: aload           8
        //    65: aload           9
        //    67: aload           10
        //    69: aload_0        
        //    70: getfield        kti.e:Landroid/os/Handler;
        //    73: invokevirtual   android/hardware/camera2/CameraManager.openCamera:(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V
        //    76: aload           7
        //    78: ldc2_w          5000
        //    81: lload_3        
        //    82: ladd           
        //    83: lload           5
        //    85: lsub           
        //    86: invokevirtual   kth.e:(J)Lktg;
        //    89: astore          10
        //    91: aload_0        
        //    92: getfield        kti.f:Lkse;
        //    95: astore          9
        //    97: aload           10
        //    99: astore_1       
        //   100: aload           9
        //   102: invokeinterface kse.g:()V
        //   107: aload_1        
        //   108: areturn        
        //   109: astore_1       
        //   110: goto            1048
        //   113: astore_1       
        //   114: new             Lktg;
        //   117: dup            
        //   118: iconst_5       
        //   119: invokespecial   ktg.<init>:(I)V
        //   122: astore_1       
        //   123: aload_0        
        //   124: getfield        kti.f:Lkse;
        //   127: astore          9
        //   129: goto            100
        //   132: astore          9
        //   134: aload_0        
        //   135: getfield        kti.g:Ljava/lang/Object;
        //   138: astore          10
        //   140: aload           10
        //   142: monitorenter   
        //   143: aload_0        
        //   144: aload           9
        //   146: putfield        kti.m:Ljava/lang/Throwable;
        //   149: aload           10
        //   151: monitorexit    
        //   152: iload_2        
        //   153: ifne            188
        //   156: new             Lktg;
        //   159: dup            
        //   160: iconst_3       
        //   161: getstatic       kst.c:Lkst;
        //   164: aload           9
        //   166: invokevirtual   java/lang/SecurityException.getMessage:()Ljava/lang/String;
        //   169: invokespecial   ktg.<init>:(ILkst;Ljava/lang/String;)V
        //   172: astore          9
        //   174: aload_0        
        //   175: getfield        kti.f:Lkse;
        //   178: astore_1       
        //   179: aload_1        
        //   180: invokeinterface kse.g:()V
        //   185: aload           9
        //   187: areturn        
        //   188: aload_0        
        //   189: getfield        kti.a:Ljava/lang/String;
        //   192: astore          8
        //   194: aload           8
        //   196: invokevirtual   java/lang/String.length:()I
        //   199: istore          11
        //   201: new             Ljava/lang/StringBuilder;
        //   204: astore          10
        //   206: aload           10
        //   208: iload           11
        //   210: bipush          98
        //   212: iadd           
        //   213: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   216: aload           10
        //   218: ldc             "Failed to open camera device "
        //   220: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   223: pop            
        //   224: aload           10
        //   226: aload           8
        //   228: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   231: pop            
        //   232: aload           10
        //   234: ldc             ". A SecurityException was thrown while attempting to open the camera."
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: pop            
        //   240: aload_0        
        //   241: aload           10
        //   243: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   246: aload           9
        //   248: iconst_1       
        //   249: getstatic       kst.c:Lkst;
        //   252: aload           9
        //   254: invokevirtual   java/lang/SecurityException.getMessage:()Ljava/lang/String;
        //   257: invokespecial   kti.c:(Ljava/lang/String;Ljava/lang/Exception;ZLkst;Ljava/lang/String;)V
        //   260: aload_1        
        //   261: getstatic       kst.c:Lkst;
        //   264: invokevirtual   kty.c:(Lkst;)V
        //   267: new             Lktg;
        //   270: dup            
        //   271: iconst_4       
        //   272: getstatic       kst.c:Lkst;
        //   275: aload           9
        //   277: invokevirtual   java/lang/SecurityException.getMessage:()Ljava/lang/String;
        //   280: invokespecial   ktg.<init>:(ILkst;Ljava/lang/String;)V
        //   283: astore          9
        //   285: aload_0        
        //   286: getfield        kti.f:Lkse;
        //   289: astore_1       
        //   290: aload_1        
        //   291: invokeinterface kse.g:()V
        //   296: aload           9
        //   298: areturn        
        //   299: astore_1       
        //   300: aload           10
        //   302: monitorexit    
        //   303: aload_1        
        //   304: athrow         
        //   305: astore          9
        //   307: aload_0        
        //   308: getfield        kti.g:Ljava/lang/Object;
        //   311: astore_1       
        //   312: aload_1        
        //   313: monitorenter   
        //   314: aload_0        
        //   315: aload           9
        //   317: putfield        kti.m:Ljava/lang/Throwable;
        //   320: aload_1        
        //   321: monitorexit    
        //   322: new             Lktg;
        //   325: dup            
        //   326: iconst_2       
        //   327: getstatic       kst.d:Lkst;
        //   330: aload           9
        //   332: invokevirtual   java/lang/IllegalArgumentException.getMessage:()Ljava/lang/String;
        //   335: invokespecial   ktg.<init>:(ILkst;Ljava/lang/String;)V
        //   338: astore          9
        //   340: aload_0        
        //   341: getfield        kti.f:Lkse;
        //   344: astore_1       
        //   345: goto            290
        //   348: astore          9
        //   350: aload_1        
        //   351: monitorexit    
        //   352: aload           9
        //   354: athrow         
        //   355: astore          10
        //   357: aload           10
        //   359: invokevirtual   android/hardware/camera2/CameraAccessException.getReason:()I
        //   362: invokestatic    kst.a:(I)Lkst;
        //   365: astore          9
        //   367: aload           10
        //   369: invokevirtual   android/hardware/camera2/CameraAccessException.getReason:()I
        //   372: tableswitch {
        //                2: 798
        //                3: 773
        //                4: 748
        //                5: 519
        //                6: 417
        //          default: 408
        //        }
        //   408: aload_0        
        //   409: getfield        kti.a:Ljava/lang/String;
        //   412: astore          7
        //   414: goto            929
        //   417: aload_0        
        //   418: getfield        kti.a:Ljava/lang/String;
        //   421: astore          7
        //   423: aload           7
        //   425: invokevirtual   java/lang/String.length:()I
        //   428: istore          11
        //   430: new             Ljava/lang/StringBuilder;
        //   433: astore          8
        //   435: aload           8
        //   437: iload           11
        //   439: bipush          78
        //   441: iadd           
        //   442: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   445: aload           8
        //   447: ldc             "Failed to open camera device "
        //   449: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   452: pop            
        //   453: aload           8
        //   455: aload           7
        //   457: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   460: pop            
        //   461: aload           8
        //   463: ldc             ". The maximum number of cameras are already open."
        //   465: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   468: pop            
        //   469: aload_0        
        //   470: aload           8
        //   472: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   475: aload           10
        //   477: iload_2        
        //   478: aload           9
        //   480: aload           10
        //   482: invokevirtual   android/hardware/camera2/CameraAccessException.getMessage:()Ljava/lang/String;
        //   485: invokespecial   kti.c:(Ljava/lang/String;Ljava/lang/Exception;ZLkst;Ljava/lang/String;)V
        //   488: aload_1        
        //   489: aload           9
        //   491: invokevirtual   kty.c:(Lkst;)V
        //   494: new             Lktg;
        //   497: dup            
        //   498: iconst_4       
        //   499: aload           9
        //   501: aload           10
        //   503: invokevirtual   android/hardware/camera2/CameraAccessException.getMessage:()Ljava/lang/String;
        //   506: invokespecial   ktg.<init>:(ILkst;Ljava/lang/String;)V
        //   509: astore          9
        //   511: aload_0        
        //   512: getfield        kti.f:Lkse;
        //   515: astore_1       
        //   516: goto            290
        //   519: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   522: bipush          31
        //   524: if_icmpge       658
        //   527: iload_2        
        //   528: ifne            556
        //   531: new             Lktg;
        //   534: dup            
        //   535: iconst_3       
        //   536: aload           9
        //   538: aload           10
        //   540: invokevirtual   android/hardware/camera2/CameraAccessException.getMessage:()Ljava/lang/String;
        //   543: invokespecial   ktg.<init>:(ILkst;Ljava/lang/String;)V
        //   546: astore          9
        //   548: aload_0        
        //   549: getfield        kti.f:Lkse;
        //   552: astore_1       
        //   553: goto            179
        //   556: aload_0        
        //   557: getfield        kti.a:Ljava/lang/String;
        //   560: astore          7
        //   562: aload           7
        //   564: invokevirtual   java/lang/String.length:()I
        //   567: istore          11
        //   569: new             Ljava/lang/StringBuilder;
        //   572: astore          8
        //   574: aload           8
        //   576: iload           11
        //   578: bipush          101
        //   580: iadd           
        //   581: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   584: aload           8
        //   586: ldc             "Failed to open camera device "
        //   588: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   591: pop            
        //   592: aload           8
        //   594: aload           7
        //   596: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   599: pop            
        //   600: aload           8
        //   602: ldc             " after retry. The camera device in use due to a higher priority process."
        //   604: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   607: pop            
        //   608: aload_0        
        //   609: aload           8
        //   611: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   614: aload           10
        //   616: iconst_1       
        //   617: aload           9
        //   619: aload           10
        //   621: invokevirtual   android/hardware/camera2/CameraAccessException.getMessage:()Ljava/lang/String;
        //   624: invokespecial   kti.c:(Ljava/lang/String;Ljava/lang/Exception;ZLkst;Ljava/lang/String;)V
        //   627: aload_1        
        //   628: aload           9
        //   630: invokevirtual   kty.c:(Lkst;)V
        //   633: new             Lktg;
        //   636: dup            
        //   637: iconst_4       
        //   638: aload           9
        //   640: aload           10
        //   642: invokevirtual   android/hardware/camera2/CameraAccessException.getMessage:()Ljava/lang/String;
        //   645: invokespecial   ktg.<init>:(ILkst;Ljava/lang/String;)V
        //   648: astore          9
        //   650: aload_0        
        //   651: getfield        kti.f:Lkse;
        //   654: astore_1       
        //   655: goto            290
        //   658: aload_0        
        //   659: getfield        kti.a:Ljava/lang/String;
        //   662: astore          8
        //   664: aload           8
        //   666: invokevirtual   java/lang/String.length:()I
        //   669: istore          11
        //   671: new             Ljava/lang/StringBuilder;
        //   674: astore_1       
        //   675: aload_1        
        //   676: iload           11
        //   678: bipush          101
        //   680: iadd           
        //   681: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   684: aload_1        
        //   685: ldc             "Failed to open camera device "
        //   687: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   690: pop            
        //   691: aload_1        
        //   692: aload           8
        //   694: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   697: pop            
        //   698: aload_1        
        //   699: ldc             " The camera device in use due to a higher priority process. Retrying ..."
        //   701: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   704: pop            
        //   705: aload_0        
        //   706: aload_1        
        //   707: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   710: aload           10
        //   712: iconst_1       
        //   713: aload           9
        //   715: aload           10
        //   717: invokevirtual   android/hardware/camera2/CameraAccessException.getMessage:()Ljava/lang/String;
        //   720: invokespecial   kti.c:(Ljava/lang/String;Ljava/lang/Exception;ZLkst;Ljava/lang/String;)V
        //   723: new             Lktg;
        //   726: dup            
        //   727: iconst_2       
        //   728: aload           9
        //   730: aload           10
        //   732: invokevirtual   android/hardware/camera2/CameraAccessException.getMessage:()Ljava/lang/String;
        //   735: invokespecial   ktg.<init>:(ILkst;Ljava/lang/String;)V
        //   738: astore          9
        //   740: aload_0        
        //   741: getfield        kti.f:Lkse;
        //   744: astore_1       
        //   745: goto            290
        //   748: new             Lktg;
        //   751: dup            
        //   752: iconst_2       
        //   753: aload           9
        //   755: aload           10
        //   757: invokevirtual   android/hardware/camera2/CameraAccessException.getMessage:()Ljava/lang/String;
        //   760: invokespecial   ktg.<init>:(ILkst;Ljava/lang/String;)V
        //   763: astore          9
        //   765: aload_0        
        //   766: getfield        kti.f:Lkse;
        //   769: astore_1       
        //   770: goto            290
        //   773: new             Lktg;
        //   776: dup            
        //   777: iconst_2       
        //   778: aload           9
        //   780: aload           10
        //   782: invokevirtual   android/hardware/camera2/CameraAccessException.getMessage:()Ljava/lang/String;
        //   785: invokespecial   ktg.<init>:(ILkst;Ljava/lang/String;)V
        //   788: astore          9
        //   790: aload_0        
        //   791: getfield        kti.f:Lkse;
        //   794: astore_1       
        //   795: goto            290
        //   798: iload_2        
        //   799: ifne            827
        //   802: new             Lktg;
        //   805: dup            
        //   806: iconst_3       
        //   807: aload           9
        //   809: aload           10
        //   811: invokevirtual   android/hardware/camera2/CameraAccessException.getMessage:()Ljava/lang/String;
        //   814: invokespecial   ktg.<init>:(ILkst;Ljava/lang/String;)V
        //   817: astore          9
        //   819: aload_0        
        //   820: getfield        kti.f:Lkse;
        //   823: astore_1       
        //   824: goto            179
        //   827: aload_0        
        //   828: getfield        kti.a:Ljava/lang/String;
        //   831: astore          7
        //   833: aload           7
        //   835: invokevirtual   java/lang/String.length:()I
        //   838: istore          11
        //   840: new             Ljava/lang/StringBuilder;
        //   843: astore          8
        //   845: aload           8
        //   847: iload           11
        //   849: bipush          73
        //   851: iadd           
        //   852: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   855: aload           8
        //   857: ldc             "Failed to open camera device "
        //   859: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   862: pop            
        //   863: aload           8
        //   865: aload           7
        //   867: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   870: pop            
        //   871: aload           8
        //   873: ldc             " after retry. The camera device is disabled."
        //   875: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   878: pop            
        //   879: aload_0        
        //   880: aload           8
        //   882: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   885: aload           10
        //   887: iconst_1       
        //   888: aload           9
        //   890: aload           10
        //   892: invokevirtual   android/hardware/camera2/CameraAccessException.getMessage:()Ljava/lang/String;
        //   895: invokespecial   kti.c:(Ljava/lang/String;Ljava/lang/Exception;ZLkst;Ljava/lang/String;)V
        //   898: aload_1        
        //   899: aload           9
        //   901: invokevirtual   kty.c:(Lkst;)V
        //   904: new             Lktg;
        //   907: dup            
        //   908: iconst_4       
        //   909: aload           9
        //   911: aload           10
        //   913: invokevirtual   android/hardware/camera2/CameraAccessException.getMessage:()Ljava/lang/String;
        //   916: invokespecial   ktg.<init>:(ILkst;Ljava/lang/String;)V
        //   919: astore          9
        //   921: aload_0        
        //   922: getfield        kti.f:Lkse;
        //   925: astore_1       
        //   926: goto            290
        //   929: aload           10
        //   931: invokevirtual   android/hardware/camera2/CameraAccessException.getReason:()I
        //   934: istore          11
        //   936: aload           7
        //   938: invokevirtual   java/lang/String.length:()I
        //   941: istore          12
        //   943: new             Ljava/lang/StringBuilder;
        //   946: astore          8
        //   948: aload           8
        //   950: iload           12
        //   952: bipush          91
        //   954: iadd           
        //   955: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   958: aload           8
        //   960: ldc             "Failed to open camera device "
        //   962: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   965: pop            
        //   966: aload           8
        //   968: aload           7
        //   970: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   973: pop            
        //   974: aload           8
        //   976: ldc             ". An unknown exception was thrown with error code "
        //   978: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   981: pop            
        //   982: aload           8
        //   984: iload           11
        //   986: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   989: pop            
        //   990: aload           8
        //   992: ldc             "."
        //   994: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   997: pop            
        //   998: aload_0        
        //   999: aload           8
        //  1001: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1004: aload           10
        //  1006: iload_2        
        //  1007: aload           9
        //  1009: aload           10
        //  1011: invokevirtual   android/hardware/camera2/CameraAccessException.getMessage:()Ljava/lang/String;
        //  1014: invokespecial   kti.c:(Ljava/lang/String;Ljava/lang/Exception;ZLkst;Ljava/lang/String;)V
        //  1017: aload_1        
        //  1018: aload           9
        //  1020: invokevirtual   kty.c:(Lkst;)V
        //  1023: new             Lktg;
        //  1026: dup            
        //  1027: iconst_4       
        //  1028: aload           9
        //  1030: aload           10
        //  1032: invokevirtual   android/hardware/camera2/CameraAccessException.getMessage:()Ljava/lang/String;
        //  1035: invokespecial   ktg.<init>:(ILkst;Ljava/lang/String;)V
        //  1038: astore          9
        //  1040: aload_0        
        //  1041: getfield        kti.f:Lkse;
        //  1044: astore_1       
        //  1045: goto            290
        //  1048: aload_0        
        //  1049: getfield        kti.f:Lkse;
        //  1052: invokeinterface kse.g:()V
        //  1057: goto            1062
        //  1060: aload_1        
        //  1061: athrow         
        //  1062: goto            1060
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                            
        //  -----  -----  -----  -----  ------------------------------------------------
        //  30     91     355    1048   Landroid/hardware/camera2/CameraAccessException;
        //  30     91     305    355    Ljava/lang/IllegalArgumentException;
        //  30     91     132    305    Ljava/lang/SecurityException;
        //  30     91     113    132    Ljava/lang/InterruptedException;
        //  30     91     109    1065   Any
        //  114    123    109    1065   Any
        //  134    143    109    1065   Any
        //  143    152    299    305    Any
        //  156    174    109    1065   Any
        //  188    285    109    1065   Any
        //  300    303    299    305    Any
        //  303    305    109    1065   Any
        //  307    314    109    1065   Any
        //  314    322    348    355    Any
        //  322    340    109    1065   Any
        //  350    352    348    355    Any
        //  352    355    109    1065   Any
        //  357    408    109    1065   Any
        //  408    414    109    1065   Any
        //  417    511    109    1065   Any
        //  519    527    109    1065   Any
        //  531    548    109    1065   Any
        //  556    650    109    1065   Any
        //  658    740    109    1065   Any
        //  748    765    109    1065   Any
        //  773    790    109    1065   Any
        //  802    819    109    1065   Any
        //  827    921    109    1065   Any
        //  929    1040   109    1065   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 501, Size: 501
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
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
    
    public final void b(final boolean b, final kst kst, final String s) {
        synchronized (this.g) {
            if (this.m != null) {
                final String a = this.a;
                final StringBuilder sb = new StringBuilder(a.length() + 44);
                sb.append("Failed to open Camera device ");
                sb.append(a);
                sb.append(" after timeout.");
                Log.e("CAM_CameraDeviceOpener", sb.toString(), this.m);
            }
            else {
                final String a2 = this.a;
                final StringBuilder sb2 = new StringBuilder(a2.length() + 44);
                sb2.append("Failed to open Camera device ");
                sb2.append(a2);
                sb2.append(" after timeout.");
                Log.e("CAM_CameraDeviceOpener", sb2.toString());
            }
            if (b) {
                this.c.au(2, kst, s, 3);
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.g) {
            this.l = true;
            monitorexit(this.g);
            final Object h = this.h;
            synchronized (this.g) {
                this.h.notify();
            }
        }
    }
}
