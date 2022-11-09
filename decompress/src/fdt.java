// 
// Decompiled by Procyon v0.6.0
// 

final class fdt implements oen
{
    final /* synthetic */ fdw a;
    final /* synthetic */ fdv b;
    final /* synthetic */ fdx c;
    
    public fdt(final fdx c, final fdw a, final fdv b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Throwable t) {
        if (this.a.o.b().isCancelled()) {
            fdx.j(this.a, t, this.b);
            return;
        }
        this.c.c(this.a, t, this.b);
    }
    
    @Override
    public final void b(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        fdt.c:Lfdx;
        //     4: astore_2       
        //     5: aload_0        
        //     6: getfield        fdt.a:Lfdw;
        //     9: astore_3       
        //    10: aload_0        
        //    11: getfield        fdt.b:Lfdv;
        //    14: astore_1       
        //    15: aload_2        
        //    16: getfield        fdx.l:Lcxl;
        //    19: astore          4
        //    21: getstatic       cxw.a:Lcxo;
        //    24: astore          5
        //    26: aload           4
        //    28: invokeinterface cxl.f:()V
        //    33: aload_3        
        //    34: getfield        fdw.d:Lfgs;
        //    37: invokevirtual   fgs.a:()Lfgs;
        //    40: astore          5
        //    42: aload           5
        //    44: getfield        fgs.d:J
        //    47: lstore          6
        //    49: aload           5
        //    51: getfield        fgs.c:J
        //    54: lstore          8
        //    56: aload_3        
        //    57: getfield        fdw.p:Z
        //    60: ifne            1974
        //    63: aload_1        
        //    64: getfield        fdv.e:Lhia;
        //    67: getfield        hia.a:Llkb;
        //    70: invokeinterface lkb.e:()Ljava/io/FileOutputStream;
        //    75: astore          10
        //    77: aload_1        
        //    78: getfield        fdv.b:Lniz;
        //    81: invokevirtual   niz.g:()Z
        //    84: ifeq            107
        //    87: aload_1        
        //    88: getfield        fdv.b:Lniz;
        //    91: invokevirtual   niz.c:()Ljava/lang/Object;
        //    94: checkcast       Lcom/google/android/libraries/camera/exif/ExifInterface;
        //    97: aload           10
        //    99: invokevirtual   com/google/android/libraries/camera/exif/ExifInterface.m:(Ljava/io/OutputStream;)Ljava/io/OutputStream;
        //   102: astore          10
        //   104: goto            107
        //   107: aload_3        
        //   108: getfield        fdw.h:Lofn;
        //   111: invokevirtual   ofn.isDone:()Z
        //   114: invokestatic    njo.o:(Z)V
        //   117: aload_3        
        //   118: getfield        fdw.s:Loey;
        //   121: invokeinterface oey.isDone:()Z
        //   126: invokestatic    njo.o:(Z)V
        //   129: aload_3        
        //   130: getfield        fdw.h:Lofn;
        //   133: invokestatic    ofi.v:(Ljava/util/concurrent/Future;)Ljava/lang/Object;
        //   136: checkcast       Ljava/lang/Long;
        //   139: invokevirtual   java/lang/Long.longValue:()J
        //   142: aload_3        
        //   143: getfield        fdw.s:Loey;
        //   146: invokestatic    ofi.v:(Ljava/util/concurrent/Future;)Ljava/lang/Object;
        //   149: checkcast       Ljava/lang/Long;
        //   152: invokevirtual   java/lang/Long.longValue:()J
        //   155: lsub           
        //   156: lstore          8
        //   158: lload           8
        //   160: lconst_0       
        //   161: lcmp           
        //   162: ifge            200
        //   165: getstatic       fdx.a:Lnsd;
        //   168: invokevirtual   nry.b:()Lnsu;
        //   171: checkcast       Lnsa;
        //   174: sipush          1543
        //   177: invokeinterface nsa.E:(I)Lnsu;
        //   182: checkcast       Lnsa;
        //   185: ldc             "Negative shutter presentation timestamp detected (%d). Resetting to 0."
        //   187: lload           8
        //   189: invokeinterface nsa.q:(Ljava/lang/String;J)V
        //   194: lconst_0       
        //   195: lstore          8
        //   197: goto            200
        //   200: aload_2        
        //   201: getfield        fdx.l:Lcxl;
        //   204: getstatic       cxx.G:Lcxm;
        //   207: invokeinterface cxl.k:(Lcxm;)Z
        //   212: ifeq            229
        //   215: aload_2        
        //   216: getfield        fdx.o:Lfei;
        //   219: aload_3        
        //   220: getfield        fdw.c:Lhia;
        //   223: getfield        hia.a:Llkb;
        //   226: invokevirtual   fei.a:(Llkb;)V
        //   229: aload_3        
        //   230: getfield        fdw.c:Lhia;
        //   233: getfield        hia.a:Llkb;
        //   236: invokeinterface lkb.d:()Ljava/io/FileInputStream;
        //   241: astore          11
        //   243: aload_2        
        //   244: aload_3        
        //   245: getfield        fdw.p:Z
        //   248: invokevirtual   fdx.e:(Z)Z
        //   251: istore          12
        //   253: iload           12
        //   255: ifeq            275
        //   258: aload_1        
        //   259: getfield        fdv.e:Lhia;
        //   262: getfield        hia.a:Llkb;
        //   265: ldc             "MP"
        //   267: invokeinterface lkb.h:(Ljava/lang/String;)V
        //   272: goto            289
        //   275: aload_1        
        //   276: getfield        fdv.e:Lhia;
        //   279: getfield        hia.a:Llkb;
        //   282: ldc             "MV"
        //   284: invokeinterface lkb.h:(Ljava/lang/String;)V
        //   289: iconst_1       
        //   290: iload           12
        //   292: if_icmpeq       301
        //   295: iconst_1       
        //   296: istore          13
        //   298: goto            304
        //   301: iconst_2       
        //   302: istore          13
        //   304: aload_1        
        //   305: getfield        fdv.b:Lniz;
        //   308: invokevirtual   niz.g:()Z
        //   311: ifeq            341
        //   314: aload_1        
        //   315: getfield        fdv.b:Lniz;
        //   318: invokevirtual   niz.c:()Ljava/lang/Object;
        //   321: checkcast       Lcom/google/android/libraries/camera/exif/ExifInterface;
        //   324: getfield        com/google/android/libraries/camera/exif/ExifInterface.by:Ljava/lang/String;
        //   327: invokestatic    lmx.c:(Ljava/lang/String;)Lniz;
        //   330: invokevirtual   niz.f:()Ljava/lang/Object;
        //   333: checkcast       Lapf;
        //   336: astore          5
        //   338: goto            344
        //   341: aconst_null    
        //   342: astore          5
        //   344: aload_1        
        //   345: getfield        fdv.d:[B
        //   348: aload           5
        //   350: invokestatic    lmx.d:([BLapf;)Lnja;
        //   353: astore          14
        //   355: new             Llse;
        //   358: astore          5
        //   360: aload           5
        //   362: invokespecial   lse.<init>:()V
        //   365: aload           5
        //   367: iload           13
        //   369: putfield        lse.d:I
        //   372: aload           5
        //   374: iconst_1       
        //   375: putfield        lse.b:I
        //   378: aload           5
        //   380: lload           8
        //   382: putfield        lse.c:J
        //   385: aload           14
        //   387: getfield        nja.a:Ljava/lang/Object;
        //   390: checkcast       Lapf;
        //   393: astore          4
        //   395: aload           14
        //   397: getfield        nja.b:Ljava/lang/Object;
        //   400: checkcast       Lapf;
        //   403: astore          14
        //   405: new             Llsi;
        //   408: astore          15
        //   410: aload           15
        //   412: aload           4
        //   414: aload           14
        //   416: invokespecial   lsi.<init>:(Lapf;Lapf;)V
        //   419: aload           5
        //   421: aload           15
        //   423: putfield        lse.a:Llsj;
        //   426: aload_1        
        //   427: getfield        fdv.d:[B
        //   430: astore          14
        //   432: new             Llsf;
        //   435: astore          4
        //   437: aload           4
        //   439: aload           14
        //   441: invokespecial   lsf.<init>:([B)V
        //   444: aload           5
        //   446: aload           4
        //   448: putfield        lse.e:Llsf;
        //   451: new             Llsg;
        //   454: astore          4
        //   456: aload           4
        //   458: aload           10
        //   460: invokespecial   lsg.<init>:(Ljava/io/OutputStream;)V
        //   463: aload           5
        //   465: aload           4
        //   467: putfield        lse.g:Llsg;
        //   470: aload_3        
        //   471: getfield        fdw.c:Lhia;
        //   474: getfield        hia.a:Llkb;
        //   477: invokeinterface lkb.a:()J
        //   482: l2i            
        //   483: istore          13
        //   485: new             Llsd;
        //   488: astore          4
        //   490: aload           4
        //   492: iload           13
        //   494: aload           11
        //   496: invokespecial   lsd.<init>:(ILjava/io/InputStream;)V
        //   499: aload           5
        //   501: aload           4
        //   503: putfield        lse.f:Llsd;
        //   506: aload           5
        //   508: getfield        lse.e:Llsf;
        //   511: astore          15
        //   513: aload           15
        //   515: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   518: pop            
        //   519: aload           5
        //   521: getfield        lse.f:Llsd;
        //   524: astore          14
        //   526: aload           14
        //   528: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   531: pop            
        //   532: aload           5
        //   534: getfield        lse.a:Llsj;
        //   537: astore          16
        //   539: aload           16
        //   541: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   544: pop            
        //   545: aload           5
        //   547: getfield        lse.g:Llsg;
        //   550: astore          4
        //   552: aload           4
        //   554: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   557: pop            
        //   558: aload           5
        //   560: getfield        lse.b:I
        //   563: istore          17
        //   565: aload           5
        //   567: getfield        lse.d:I
        //   570: istore          13
        //   572: aload           5
        //   574: getfield        lse.c:J
        //   577: lstore          8
        //   579: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //   582: astore          5
        //   584: aload           5
        //   586: iconst_0       
        //   587: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //   590: aload           5
        //   592: iconst_1       
        //   593: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.getAndSet:(Z)Z
        //   596: istore          12
        //   598: iload           12
        //   600: ifne            1749
        //   603: iload           13
        //   605: tableswitch {
        //                2: 1283
        //                3: 645
        //          default: 628
        //        }
        //   628: aload_1        
        //   629: astore          5
        //   631: aload           5
        //   633: astore_1       
        //   634: aload_2        
        //   635: astore          4
        //   637: new             Ljava/io/IOException;
        //   640: astore          15
        //   642: goto            1633
        //   645: aload           16
        //   647: invokeinterface lsj.a:()Lapf;
        //   652: astore          18
        //   654: aload           16
        //   656: invokeinterface lsj.b:()Lapf;
        //   661: astore          16
        //   663: invokestatic    lut.a:()Llus;
        //   666: astore          5
        //   668: aload           5
        //   670: ldc_w           "Primary"
        //   673: putfield        lus.b:Ljava/lang/String;
        //   676: aload           5
        //   678: iconst_0       
        //   679: invokevirtual   lus.c:(I)V
        //   682: aload           5
        //   684: iconst_0       
        //   685: invokevirtual   lus.b:(I)V
        //   688: aload           5
        //   690: ldc_w           "image/jpeg"
        //   693: putfield        lus.a:Ljava/lang/String;
        //   696: aload           5
        //   698: invokevirtual   lus.a:()Llut;
        //   701: astore          5
        //   703: invokestatic    lut.a:()Llus;
        //   706: astore          19
        //   708: aload           19
        //   710: ldc_w           "MotionPhoto"
        //   713: putfield        lus.b:Ljava/lang/String;
        //   716: aload           19
        //   718: ldc_w           "video/mp4"
        //   721: putfield        lus.a:Ljava/lang/String;
        //   724: aload           19
        //   726: iconst_0       
        //   727: invokevirtual   lus.c:(I)V
        //   730: aload           19
        //   732: aload           14
        //   734: getfield        lsd.a:I
        //   737: invokevirtual   lus.b:(I)V
        //   740: aload           19
        //   742: invokevirtual   lus.a:()Llut;
        //   745: astore          19
        //   747: iconst_2       
        //   748: anewarray       Llut;
        //   751: astore          20
        //   753: aload           20
        //   755: iconst_0       
        //   756: aload           5
        //   758: aastore        
        //   759: aload           20
        //   761: iconst_1       
        //   762: aload           19
        //   764: aastore        
        //   765: iconst_0       
        //   766: istore          13
        //   768: iload           13
        //   770: iconst_2       
        //   771: if_icmpge       871
        //   774: iload           13
        //   776: ifne            791
        //   779: aload           20
        //   781: iconst_0       
        //   782: aaload         
        //   783: invokestatic    lsp.f:(Llut;)Ljava/lang/String;
        //   786: astore          5
        //   788: goto            801
        //   791: aload           20
        //   793: iload           13
        //   795: aaload         
        //   796: invokestatic    lsp.g:(Llut;)Ljava/lang/String;
        //   799: astore          5
        //   801: aload           5
        //   803: invokevirtual   java/lang/String.isEmpty:()Z
        //   806: ifne            865
        //   809: new             Lape;
        //   812: astore          4
        //   814: aload           5
        //   816: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   819: astore          5
        //   821: aload           5
        //   823: invokevirtual   java/lang/String.length:()I
        //   826: ifeq            842
        //   829: ldc_w           "Container items have bad values: "
        //   832: aload           5
        //   834: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   837: astore          5
        //   839: goto            854
        //   842: new             Ljava/lang/String;
        //   845: dup            
        //   846: ldc_w           "Container items have bad values: "
        //   849: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   852: astore          5
        //   854: aload           4
        //   856: aload           5
        //   858: iconst_5       
        //   859: invokespecial   ape.<init>:(Ljava/lang/String;I)V
        //   862: aload           4
        //   864: athrow         
        //   865: iinc            13, 1
        //   868: goto            768
        //   871: iconst_0       
        //   872: istore          13
        //   874: new             Llur;
        //   877: astore          19
        //   879: aload           19
        //   881: invokespecial   lur.<init>:()V
        //   884: iload           13
        //   886: iconst_2       
        //   887: if_icmpge       906
        //   890: aload           19
        //   892: aload           20
        //   894: iload           13
        //   896: aaload         
        //   897: invokevirtual   lur.b:(Llut;)V
        //   900: iinc            13, 1
        //   903: goto            884
        //   906: getstatic       aph.a:Laqa;
        //   909: ldc_w           "http://ns.google.com/photos/1.0/camera/"
        //   912: ldc_w           "Camera"
        //   915: invokevirtual   aqa.c:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   918: pop            
        //   919: aload           18
        //   921: ldc_w           "http://ns.google.com/photos/1.0/camera/"
        //   924: ldc_w           "MotionPhoto"
        //   927: iconst_1       
        //   928: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   931: invokeinterface apf.c:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
        //   936: aload           18
        //   938: ldc_w           "http://ns.google.com/photos/1.0/camera/"
        //   941: ldc_w           "MotionPhotoVersion"
        //   944: iload           17
        //   946: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   949: invokeinterface apf.c:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
        //   954: aload           18
        //   956: ldc_w           "http://ns.google.com/photos/1.0/camera/"
        //   959: ldc_w           "MotionPhotoPresentationTimestampUs"
        //   962: lload           8
        //   964: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   967: invokeinterface apf.c:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
        //   972: getstatic       aph.a:Laqa;
        //   975: ldc_w           "http://ns.google.com/photos/1.0/container/"
        //   978: ldc_w           "Container"
        //   981: invokevirtual   aqa.c:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   984: pop            
        //   985: new             Laqj;
        //   988: astore          5
        //   990: aload           5
        //   992: invokespecial   aqj.<init>:()V
        //   995: aload           5
        //   997: invokevirtual   aqj.q:()V
        //  1000: aload           5
        //  1002: invokevirtual   aqj.t:()V
        //  1005: aload           18
        //  1007: ldc_w           "http://ns.google.com/photos/1.0/container/"
        //  1010: ldc_w           "Directory"
        //  1013: aconst_null    
        //  1014: aload           5
        //  1016: invokeinterface apf.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Laqj;)V
        //  1021: aload           19
        //  1023: monitorenter   
        //  1024: aload           19
        //  1026: getfield        lur.a:Ljava/util/List;
        //  1029: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1034: astore          20
        //  1036: iconst_1       
        //  1037: istore          13
        //  1039: aload           20
        //  1041: invokeinterface java/util/Iterator.hasNext:()Z
        //  1046: ifeq            1222
        //  1049: aload           20
        //  1051: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1056: checkcast       Llut;
        //  1059: astore          21
        //  1061: ldc_w           "Directory"
        //  1064: iload           13
        //  1066: invokestatic    cxb.c:(Ljava/lang/String;I)Ljava/lang/String;
        //  1069: astore          5
        //  1071: aload           18
        //  1073: aload           5
        //  1075: invokestatic    lut.b:(Lapf;Ljava/lang/String;)V
        //  1078: aload           5
        //  1080: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1083: astore          5
        //  1085: ldc_w           "http://ns.google.com/photos/1.0/container/"
        //  1088: ldc_w           "Item"
        //  1091: invokestatic    cxb.d:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1094: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1097: astore          22
        //  1099: aload           22
        //  1101: invokevirtual   java/lang/String.length:()I
        //  1104: ifeq            1119
        //  1107: aload           5
        //  1109: aload           22
        //  1111: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1114: astore          5
        //  1116: goto            1130
        //  1119: new             Ljava/lang/String;
        //  1122: dup            
        //  1123: aload           5
        //  1125: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //  1128: astore          5
        //  1130: getstatic       aph.a:Laqa;
        //  1133: ldc_w           "http://ns.google.com/photos/1.0/container/item/"
        //  1136: ldc_w           "Item"
        //  1139: invokevirtual   aqa.c:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1142: pop            
        //  1143: aload           18
        //  1145: aload           5
        //  1147: invokestatic    lut.b:(Lapf;Ljava/lang/String;)V
        //  1150: aload           18
        //  1152: aload           5
        //  1154: ldc_w           "Mime"
        //  1157: aload           21
        //  1159: getfield        lut.a:Ljava/lang/String;
        //  1162: invokestatic    lut.f:(Lapf;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  1165: aload           18
        //  1167: aload           5
        //  1169: ldc_w           "Semantic"
        //  1172: aload           21
        //  1174: getfield        lut.b:Ljava/lang/String;
        //  1177: invokestatic    lut.f:(Lapf;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  1180: aload           18
        //  1182: aload           5
        //  1184: ldc_w           "Length"
        //  1187: aload           21
        //  1189: getfield        lut.c:I
        //  1192: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  1195: invokestatic    lut.f:(Lapf;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  1198: aload           18
        //  1200: aload           5
        //  1202: ldc_w           "Padding"
        //  1205: aload           21
        //  1207: getfield        lut.d:I
        //  1210: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //  1213: invokestatic    lut.f:(Lapf;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //  1216: iinc            13, 1
        //  1219: goto            1039
        //  1222: aload           19
        //  1224: monitorexit    
        //  1225: aload           4
        //  1227: aload           15
        //  1229: aload           18
        //  1231: aload           16
        //  1233: aload           14
        //  1235: invokevirtual   lsg.a:(Llsf;Lapf;Lapf;Llsd;)V
        //  1238: goto            1405
        //  1241: astore          5
        //  1243: aload           19
        //  1245: monitorexit    
        //  1246: aload           5
        //  1248: athrow         
        //  1249: astore          14
        //  1251: aload_2        
        //  1252: astore          5
        //  1254: aload_1        
        //  1255: astore_2       
        //  1256: aload           5
        //  1258: astore_1       
        //  1259: goto            1810
        //  1262: astore          5
        //  1264: goto            1614
        //  1267: astore          14
        //  1269: aload_1        
        //  1270: astore          5
        //  1272: goto            1630
        //  1275: astore          14
        //  1277: aload_1        
        //  1278: astore          5
        //  1280: goto            1713
        //  1283: aload           16
        //  1285: invokeinterface lsj.a:()Lapf;
        //  1290: astore          5
        //  1292: aload           16
        //  1294: invokeinterface lsj.b:()Lapf;
        //  1299: astore          18
        //  1301: aload           14
        //  1303: getfield        lsd.a:I
        //  1306: istore          13
        //  1308: getstatic       aph.a:Laqa;
        //  1311: ldc_w           "http://ns.google.com/photos/1.0/camera/"
        //  1314: ldc_w           "GCamera"
        //  1317: invokevirtual   aqa.c:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1320: pop            
        //  1321: aload           5
        //  1323: ldc_w           "http://ns.google.com/photos/1.0/camera/"
        //  1326: ldc_w           "MicroVideo"
        //  1329: iconst_1       
        //  1330: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1333: invokeinterface apf.c:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
        //  1338: aload           5
        //  1340: ldc_w           "http://ns.google.com/photos/1.0/camera/"
        //  1343: ldc_w           "MicroVideoVersion"
        //  1346: iload           17
        //  1348: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1351: invokeinterface apf.c:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
        //  1356: aload           5
        //  1358: ldc_w           "http://ns.google.com/photos/1.0/camera/"
        //  1361: ldc_w           "MicroVideoOffset"
        //  1364: iload           13
        //  1366: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1369: invokeinterface apf.c:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
        //  1374: aload           5
        //  1376: ldc_w           "http://ns.google.com/photos/1.0/camera/"
        //  1379: ldc_w           "MicroVideoPresentationTimestampUs"
        //  1382: lload           8
        //  1384: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1387: invokeinterface apf.c:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
        //  1392: aload           4
        //  1394: aload           15
        //  1396: aload           5
        //  1398: aload           18
        //  1400: aload           14
        //  1402: invokevirtual   lsg.a:(Llsf;Lapf;Lapf;Llsd;)V
        //  1405: aload_2        
        //  1406: astore          5
        //  1408: aload_1        
        //  1409: astore          4
        //  1411: aload_3        
        //  1412: getfield        fdw.c:Lhia;
        //  1415: invokevirtual   hia.b:()V
        //  1418: aload           11
        //  1420: invokevirtual   java/io/FileInputStream.close:()V
        //  1423: aload           10
        //  1425: invokevirtual   java/io/OutputStream.close:()V
        //  1428: aload           11
        //  1430: invokevirtual   java/io/FileInputStream.close:()V
        //  1433: aload           10
        //  1435: invokevirtual   java/io/OutputStream.close:()V
        //  1438: aload           4
        //  1440: astore_1       
        //  1441: aload_1        
        //  1442: getfield        fdv.c:Lhuz;
        //  1445: aload_1        
        //  1446: getfield        fdv.e:Lhia;
        //  1449: getfield        hia.a:Llkb;
        //  1452: invokeinterface lkb.a:()J
        //  1457: invokeinterface huz.m:(J)V
        //  1462: invokestatic    ffb.a:()V
        //  1465: invokestatic    ffb.b:()V
        //  1468: invokestatic    ffb.b:()V
        //  1471: invokestatic    ffb.b:()V
        //  1474: invokestatic    ffb.b:()V
        //  1477: aload_1        
        //  1478: getfield        fdv.e:Lhia;
        //  1481: invokevirtual   hia.c:()V
        //  1484: aload           5
        //  1486: astore_2       
        //  1487: aload_1        
        //  1488: astore          4
        //  1490: aload_2        
        //  1491: astore          5
        //  1493: aload_2        
        //  1494: getfield        fdx.p:Landroid/os/Handler;
        //  1497: aload_3        
        //  1498: getfield        fdw.a:Lhim;
        //  1501: invokevirtual   android/os/Handler.removeCallbacksAndMessages:(Ljava/lang/Object;)V
        //  1504: aload_3        
        //  1505: getfield        fdw.l:Ljava/util/concurrent/atomic/AtomicBoolean;
        //  1508: iconst_1       
        //  1509: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.getAndSet:(Z)Z
        //  1512: ifeq            1531
        //  1515: getstatic       fdx.a:Lnsd;
        //  1518: invokevirtual   nry.c:()Lnsu;
        //  1521: ldc_w           "Failed to encode microvideo before timeout fired!"
        //  1524: sipush          1566
        //  1527: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //  1530: return         
        //  1531: aload_1        
        //  1532: getfield        fdv.c:Lhuz;
        //  1535: aload_3        
        //  1536: invokestatic    java/lang/System.currentTimeMillis:()J
        //  1539: invokestatic    fdx.g:(Lfdw;J)Loaf;
        //  1542: invokeinterface huz.k:(Loaf;)V
        //  1547: aload_3        
        //  1548: getfield        fdw.n:Lofn;
        //  1551: invokevirtual   ofn.isDone:()Z
        //  1554: iconst_1       
        //  1555: ixor           
        //  1556: invokestatic    njo.o:(Z)V
        //  1559: aload_3        
        //  1560: getfield        fdw.n:Lofn;
        //  1563: aload_1        
        //  1564: getfield        fdv.a:Lhwr;
        //  1567: invokevirtual   ofn.o:(Ljava/lang/Object;)Z
        //  1570: pop            
        //  1571: aload_3        
        //  1572: getfield        fdw.c:Lhia;
        //  1575: invokevirtual   hia.b:()V
        //  1578: return         
        //  1579: astore_1       
        //  1580: goto            1584
        //  1583: astore_1       
        //  1584: aload           5
        //  1586: astore_2       
        //  1587: goto            1950
        //  1590: astore          14
        //  1592: aload           4
        //  1594: astore_1       
        //  1595: aload           5
        //  1597: astore_2       
        //  1598: goto            1903
        //  1601: astore          14
        //  1603: aload           4
        //  1605: astore_2       
        //  1606: aload           5
        //  1608: astore_1       
        //  1609: goto            1857
        //  1612: astore          5
        //  1614: aload_2        
        //  1615: astore          4
        //  1617: aload_1        
        //  1618: astore_2       
        //  1619: aload           4
        //  1621: astore_1       
        //  1622: goto            1806
        //  1625: astore          14
        //  1627: aload_1        
        //  1628: astore          5
        //  1630: goto            1713
        //  1633: aload           5
        //  1635: astore_1       
        //  1636: aload_2        
        //  1637: astore          4
        //  1639: new             Ljava/lang/StringBuilder;
        //  1642: astore          14
        //  1644: aload           5
        //  1646: astore_1       
        //  1647: aload_2        
        //  1648: astore          4
        //  1650: aload           14
        //  1652: bipush          45
        //  1654: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1657: aload           5
        //  1659: astore_1       
        //  1660: aload_2        
        //  1661: astore          4
        //  1663: aload           14
        //  1665: ldc_w           "Bad xmp format version requested: "
        //  1668: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1671: pop            
        //  1672: aload           5
        //  1674: astore_1       
        //  1675: aload_2        
        //  1676: astore          4
        //  1678: aload           14
        //  1680: iload           13
        //  1682: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1685: pop            
        //  1686: aload           5
        //  1688: astore_1       
        //  1689: aload_2        
        //  1690: astore          4
        //  1692: aload           15
        //  1694: aload           14
        //  1696: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1699: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1702: aload           5
        //  1704: astore_1       
        //  1705: aload_2        
        //  1706: astore          4
        //  1708: aload           15
        //  1710: athrow         
        //  1711: astore          14
        //  1713: aload           5
        //  1715: astore_1       
        //  1716: aload_2        
        //  1717: astore          4
        //  1719: new             Ljava/io/IOException;
        //  1722: astore          15
        //  1724: aload           5
        //  1726: astore_1       
        //  1727: aload_2        
        //  1728: astore          4
        //  1730: aload           15
        //  1732: ldc_w           "XMP serialization encountered an issue."
        //  1735: aload           14
        //  1737: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1740: aload           5
        //  1742: astore_1       
        //  1743: aload_2        
        //  1744: astore          4
        //  1746: aload           15
        //  1748: athrow         
        //  1749: aload_1        
        //  1750: astore          5
        //  1752: aload           5
        //  1754: astore_1       
        //  1755: aload_2        
        //  1756: astore          4
        //  1758: new             Ljava/lang/IllegalStateException;
        //  1761: astore          14
        //  1763: aload           5
        //  1765: astore_1       
        //  1766: aload_2        
        //  1767: astore          4
        //  1769: aload           14
        //  1771: ldc_w           "Executed command more than once. This is unexpected"
        //  1774: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1777: aload           5
        //  1779: astore_1       
        //  1780: aload_2        
        //  1781: astore          4
        //  1783: aload           14
        //  1785: athrow         
        //  1786: astore          5
        //  1788: aload_1        
        //  1789: astore_2       
        //  1790: aload           4
        //  1792: astore_1       
        //  1793: goto            1806
        //  1796: astore          5
        //  1798: aload_1        
        //  1799: astore          4
        //  1801: aload_2        
        //  1802: astore_1       
        //  1803: aload           4
        //  1805: astore_2       
        //  1806: aload           5
        //  1808: astore          14
        //  1810: aload           11
        //  1812: invokevirtual   java/io/FileInputStream.close:()V
        //  1815: goto            1833
        //  1818: astore          11
        //  1820: aload_2        
        //  1821: astore          4
        //  1823: aload_1        
        //  1824: astore          5
        //  1826: aload           14
        //  1828: aload           11
        //  1830: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1833: aload_2        
        //  1834: astore          4
        //  1836: aload_1        
        //  1837: astore          5
        //  1839: aload           14
        //  1841: athrow         
        //  1842: astore          14
        //  1844: goto            1857
        //  1847: astore          14
        //  1849: aload_1        
        //  1850: astore          5
        //  1852: aload_2        
        //  1853: astore_1       
        //  1854: aload           5
        //  1856: astore_2       
        //  1857: aload_2        
        //  1858: astore          4
        //  1860: aload_1        
        //  1861: astore          5
        //  1863: new             Ljava/lang/RuntimeException;
        //  1866: astore          11
        //  1868: aload_2        
        //  1869: astore          4
        //  1871: aload_1        
        //  1872: astore          5
        //  1874: aload           11
        //  1876: aload           14
        //  1878: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //  1881: aload_2        
        //  1882: astore          4
        //  1884: aload_1        
        //  1885: astore          5
        //  1887: aload           11
        //  1889: athrow         
        //  1890: astore          14
        //  1892: aload           4
        //  1894: astore_1       
        //  1895: aload           5
        //  1897: astore_2       
        //  1898: goto            1903
        //  1901: astore          14
        //  1903: aload           10
        //  1905: invokevirtual   java/io/OutputStream.close:()V
        //  1908: goto            1926
        //  1911: astore          10
        //  1913: aload_1        
        //  1914: astore          4
        //  1916: aload_2        
        //  1917: astore          5
        //  1919: aload           14
        //  1921: aload           10
        //  1923: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1926: aload_1        
        //  1927: astore          4
        //  1929: aload_2        
        //  1930: astore          5
        //  1932: aload           14
        //  1934: athrow         
        //  1935: astore_1       
        //  1936: aload           5
        //  1938: astore_2       
        //  1939: goto            1950
        //  1942: astore          5
        //  1944: aload_1        
        //  1945: astore          4
        //  1947: aload           5
        //  1949: astore_1       
        //  1950: aload_2        
        //  1951: aload_3        
        //  1952: aload_1        
        //  1953: aload           4
        //  1955: invokevirtual   fdx.c:(Lfdw;Ljava/lang/Throwable;Lfdv;)V
        //  1958: aload           4
        //  1960: getfield        fdv.e:Lhia;
        //  1963: invokevirtual   hia.b:()V
        //  1966: aload_3        
        //  1967: getfield        fdw.c:Lhia;
        //  1970: invokevirtual   hia.b:()V
        //  1973: return         
        //  1974: aload_2        
        //  1975: aload_3        
        //  1976: aload_1        
        //  1977: lload           6
        //  1979: lload           8
        //  1981: lsub           
        //  1982: invokevirtual   fdx.i:(Lfdw;Lfdv;J)V
        //  1985: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  63     104    1942   1950   Any
        //  107    158    1901   1903   Any
        //  165    194    1901   1903   Any
        //  200    229    1901   1903   Any
        //  229    243    1847   1857   Ljava/lang/Exception;
        //  229    243    1901   1903   Any
        //  243    253    1796   1806   Any
        //  258    272    1796   1806   Any
        //  275    289    1796   1806   Any
        //  304    338    1796   1806   Any
        //  344    598    1796   1806   Any
        //  637    642    1711   1713   Lape;
        //  637    642    1786   1796   Any
        //  645    747    1275   1283   Lape;
        //  645    747    1796   1806   Any
        //  747    753    1267   1275   Lape;
        //  747    753    1262   1267   Any
        //  779    788    1267   1275   Lape;
        //  779    788    1262   1267   Any
        //  791    801    1267   1275   Lape;
        //  791    801    1262   1267   Any
        //  801    839    1267   1275   Lape;
        //  801    839    1262   1267   Any
        //  842    854    1267   1275   Lape;
        //  842    854    1262   1267   Any
        //  854    865    1267   1275   Lape;
        //  854    865    1262   1267   Any
        //  874    884    1267   1275   Lape;
        //  874    884    1262   1267   Any
        //  890    900    1267   1275   Lape;
        //  890    900    1262   1267   Any
        //  906    919    1267   1275   Lape;
        //  906    919    1262   1267   Any
        //  919    1024   1625   1630   Lape;
        //  919    1024   1249   1262   Any
        //  1024   1036   1241   1249   Any
        //  1039   1116   1241   1249   Any
        //  1119   1130   1241   1249   Any
        //  1130   1216   1241   1249   Any
        //  1222   1225   1241   1249   Any
        //  1225   1238   1625   1630   Lape;
        //  1225   1238   1249   1262   Any
        //  1243   1246   1241   1249   Any
        //  1246   1249   1625   1630   Lape;
        //  1246   1249   1249   1262   Any
        //  1283   1405   1625   1630   Lape;
        //  1283   1405   1612   1614   Any
        //  1411   1428   1612   1614   Any
        //  1428   1433   1601   1612   Ljava/lang/Exception;
        //  1428   1433   1590   1601   Any
        //  1433   1438   1583   1584   Any
        //  1441   1484   1579   1583   Any
        //  1493   1504   1935   1942   Any
        //  1639   1644   1711   1713   Lape;
        //  1639   1644   1786   1796   Any
        //  1650   1657   1711   1713   Lape;
        //  1650   1657   1786   1796   Any
        //  1663   1672   1711   1713   Lape;
        //  1663   1672   1786   1796   Any
        //  1678   1686   1711   1713   Lape;
        //  1678   1686   1786   1796   Any
        //  1692   1702   1711   1713   Lape;
        //  1692   1702   1786   1796   Any
        //  1708   1711   1711   1713   Lape;
        //  1708   1711   1786   1796   Any
        //  1719   1724   1786   1796   Any
        //  1730   1740   1786   1796   Any
        //  1746   1749   1786   1796   Any
        //  1758   1763   1786   1796   Any
        //  1769   1777   1786   1796   Any
        //  1783   1786   1786   1796   Any
        //  1810   1815   1818   1833   Any
        //  1826   1833   1842   1847   Ljava/lang/Exception;
        //  1826   1833   1890   1901   Any
        //  1839   1842   1842   1847   Ljava/lang/Exception;
        //  1839   1842   1890   1901   Any
        //  1863   1868   1890   1901   Any
        //  1874   1881   1890   1901   Any
        //  1887   1890   1890   1901   Any
        //  1903   1908   1911   1926   Any
        //  1919   1926   1935   1942   Any
        //  1932   1935   1935   1942   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1039:
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
