// 
// Decompiled by Procyon v0.6.0
// 

public final class ans implements Runnable
{
    private static final String b;
    public final ajn a;
    private final ajs c;
    
    static {
        b = aiy.b("EnqueueRunnable");
    }
    
    public ans(final ajs c) {
        this.c = c;
        this.a = new ajn();
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: aload_1        
        //     3: getfield        ans.c:Lajs;
        //     6: astore_2       
        //     7: new             Ljava/util/HashSet;
        //    10: astore_3       
        //    11: aload_3        
        //    12: invokespecial   java/util/HashSet.<init>:()V
        //    15: aload_3        
        //    16: aload_2        
        //    17: getfield        ajs.d:Ljava/util/List;
        //    20: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
        //    25: pop            
        //    26: invokestatic    ajs.b:()Ljava/util/Set;
        //    29: astore          4
        //    31: aload_3        
        //    32: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    37: astore          5
        //    39: aload           5
        //    41: invokeinterface java/util/Iterator.hasNext:()Z
        //    46: ifeq            98
        //    49: aload           4
        //    51: aload           5
        //    53: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    58: checkcast       Ljava/lang/String;
        //    61: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //    66: ifne            72
        //    69: goto            39
        //    72: new             Ljava/lang/IllegalStateException;
        //    75: astore_3       
        //    76: aload_3        
        //    77: ldc             "WorkContinuation has cycles (%s)"
        //    79: iconst_1       
        //    80: anewarray       Ljava/lang/Object;
        //    83: dup            
        //    84: iconst_0       
        //    85: aload_1        
        //    86: getfield        ans.c:Lajs;
        //    89: aastore        
        //    90: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    93: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    96: aload_3        
        //    97: athrow         
        //    98: aload_3        
        //    99: aload_2        
        //   100: getfield        ajs.d:Ljava/util/List;
        //   103: invokeinterface java/util/Set.removeAll:(Ljava/util/Collection;)Z
        //   108: pop            
        //   109: aload_1        
        //   110: getfield        ans.c:Lajs;
        //   113: getfield        ajs.a:Lakh;
        //   116: getfield        akh.d:Landroidx/work/impl/WorkDatabase;
        //   119: astore          4
        //   121: aload           4
        //   123: invokevirtual   aq.h:()V
        //   126: aload_1        
        //   127: getfield        ans.c:Lajs;
        //   130: astore          5
        //   132: invokestatic    ajs.b:()Ljava/util/Set;
        //   135: astore_1       
        //   136: aload           5
        //   138: getfield        ajs.a:Lakh;
        //   141: astore_2       
        //   142: aload           5
        //   144: getfield        ajs.c:Ljava/util/List;
        //   147: astore          6
        //   149: aload_1        
        //   150: iconst_0       
        //   151: anewarray       Ljava/lang/String;
        //   154: invokeinterface java/util/Set.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   159: checkcast       [Ljava/lang/String;
        //   162: astore_3       
        //   163: aload           5
        //   165: getfield        ajs.b:Ljava/lang/String;
        //   168: astore          7
        //   170: aload           5
        //   172: getfield        ajs.f:I
        //   175: istore          8
        //   177: invokestatic    java/lang/System.currentTimeMillis:()J
        //   180: lstore          9
        //   182: aload_2        
        //   183: getfield        akh.d:Landroidx/work/impl/WorkDatabase;
        //   186: astore          11
        //   188: aload_3        
        //   189: ifnull          203
        //   192: aload_3        
        //   193: arraylength    
        //   194: ifle            203
        //   197: iconst_1       
        //   198: istore          12
        //   200: goto            206
        //   203: iconst_0       
        //   204: istore          12
        //   206: iload           12
        //   208: ifeq            366
        //   211: aload_3        
        //   212: arraylength    
        //   213: istore          13
        //   215: iconst_0       
        //   216: istore          14
        //   218: iconst_0       
        //   219: istore          15
        //   221: iconst_0       
        //   222: istore          16
        //   224: iconst_1       
        //   225: istore          17
        //   227: iload           14
        //   229: iload           13
        //   231: if_icmpge       363
        //   234: aload_3        
        //   235: iload           14
        //   237: aaload         
        //   238: astore          18
        //   240: aload           11
        //   242: invokevirtual   androidx/work/impl/WorkDatabase.s:()Lanb;
        //   245: aload           18
        //   247: invokeinterface anb.a:(Ljava/lang/String;)Lana;
        //   252: astore_1       
        //   253: aload_1        
        //   254: ifnonnull       291
        //   257: invokestatic    aiy.a:()Laiy;
        //   260: pop            
        //   261: getstatic       ans.b:Ljava/lang/String;
        //   264: ldc             "Prerequisite %s doesn't exist; not enqueuing"
        //   266: iconst_1       
        //   267: anewarray       Ljava/lang/Object;
        //   270: dup            
        //   271: iconst_0       
        //   272: aload           18
        //   274: aastore        
        //   275: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   278: iconst_0       
        //   279: anewarray       Ljava/lang/Throwable;
        //   282: invokestatic    aiy.e:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
        //   285: iconst_0       
        //   286: istore          15
        //   288: goto            1474
        //   291: aload_1        
        //   292: getfield        ana.p:I
        //   295: istore          19
        //   297: iload           19
        //   299: iconst_3       
        //   300: if_icmpne       309
        //   303: iconst_1       
        //   304: istore          20
        //   306: goto            312
        //   309: iconst_0       
        //   310: istore          20
        //   312: iload           17
        //   314: iload           20
        //   316: iand           
        //   317: istore          20
        //   319: iload           19
        //   321: iconst_4       
        //   322: if_icmpne       331
        //   325: iconst_1       
        //   326: istore          17
        //   328: goto            349
        //   331: iload           15
        //   333: istore          17
        //   335: iload           19
        //   337: bipush          6
        //   339: if_icmpne       349
        //   342: iconst_1       
        //   343: istore          16
        //   345: iload           15
        //   347: istore          17
        //   349: iinc            14, 1
        //   352: iload           17
        //   354: istore          15
        //   356: iload           20
        //   358: istore          17
        //   360: goto            227
        //   363: goto            375
        //   366: iconst_0       
        //   367: istore          15
        //   369: iconst_0       
        //   370: istore          16
        //   372: iconst_1       
        //   373: istore          17
        //   375: aload           7
        //   377: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   380: istore          21
        //   382: iload           21
        //   384: iconst_1       
        //   385: ixor           
        //   386: istore          13
        //   388: iload           13
        //   390: ifeq            938
        //   393: iload           12
        //   395: ifne            938
        //   398: aload           11
        //   400: invokevirtual   androidx/work/impl/WorkDatabase.s:()Lanb;
        //   403: aload           7
        //   405: invokeinterface anb.d:(Ljava/lang/String;)Ljava/util/List;
        //   410: astore_1       
        //   411: aload_1        
        //   412: invokeinterface java/util/List.isEmpty:()Z
        //   417: istore          21
        //   419: iload           21
        //   421: ifne            938
        //   424: iload           8
        //   426: iconst_3       
        //   427: if_icmpeq       561
        //   430: iload           8
        //   432: iconst_4       
        //   433: if_icmpne       439
        //   436: goto            561
        //   439: iload           8
        //   441: iconst_2       
        //   442: if_icmpne       496
        //   445: aload_1        
        //   446: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   451: astore          18
        //   453: aload           18
        //   455: invokeinterface java/util/Iterator.hasNext:()Z
        //   460: ifeq            496
        //   463: aload           18
        //   465: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   470: checkcast       Lamy;
        //   473: getfield        amy.b:I
        //   476: istore          14
        //   478: iload           14
        //   480: iconst_1       
        //   481: if_icmpeq       490
        //   484: iload           14
        //   486: iconst_2       
        //   487: if_icmpne       453
        //   490: iconst_0       
        //   491: istore          15
        //   493: goto            1474
        //   496: aload           7
        //   498: aload_2        
        //   499: iconst_0       
        //   500: invokestatic    anr.b:(Ljava/lang/String;Lakh;Z)Lanr;
        //   503: invokevirtual   anr.run:()V
        //   506: aload           11
        //   508: invokevirtual   androidx/work/impl/WorkDatabase.s:()Lanb;
        //   511: astore_2       
        //   512: aload_1        
        //   513: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   518: astore_1       
        //   519: aload_1        
        //   520: invokeinterface java/util/Iterator.hasNext:()Z
        //   525: ifeq            549
        //   528: aload_2        
        //   529: aload_1        
        //   530: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   535: checkcast       Lamy;
        //   538: getfield        amy.a:Ljava/lang/String;
        //   541: invokeinterface anb.e:(Ljava/lang/String;)V
        //   546: goto            519
        //   549: iconst_1       
        //   550: istore          14
        //   552: aload_3        
        //   553: astore_1       
        //   554: iload           15
        //   556: istore          20
        //   558: goto            947
        //   561: aload           11
        //   563: invokevirtual   androidx/work/impl/WorkDatabase.u:()Lami;
        //   566: astore          18
        //   568: new             Ljava/util/ArrayList;
        //   571: astore_2       
        //   572: aload_2        
        //   573: invokespecial   java/util/ArrayList.<init>:()V
        //   576: aload_1        
        //   577: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   582: astore_1       
        //   583: aload_1        
        //   584: invokeinterface java/util/Iterator.hasNext:()Z
        //   589: ifeq            808
        //   592: aload_1        
        //   593: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   598: checkcast       Lamy;
        //   601: astore          22
        //   603: aload           22
        //   605: getfield        amy.a:Ljava/lang/String;
        //   608: astore          23
        //   610: ldc             "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
        //   612: iconst_1       
        //   613: invokestatic    at.a:(Ljava/lang/String;I)Lat;
        //   616: astore          24
        //   618: aload           23
        //   620: ifnonnull       632
        //   623: aload           24
        //   625: iconst_1       
        //   626: invokevirtual   at.f:(I)V
        //   629: goto            640
        //   632: aload           24
        //   634: iconst_1       
        //   635: aload           23
        //   637: invokevirtual   at.g:(ILjava/lang/String;)V
        //   640: aload           18
        //   642: getfield        ami.a:Laq;
        //   645: invokevirtual   aq.g:()V
        //   648: aload           18
        //   650: getfield        ami.a:Laq;
        //   653: aload           24
        //   655: iconst_0       
        //   656: invokestatic    gz.s:(Laq;Laff;Z)Landroid/database/Cursor;
        //   659: astore          23
        //   661: aload           23
        //   663: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   668: ifeq            692
        //   671: aload           23
        //   673: iconst_0       
        //   674: invokeinterface android/database/Cursor.getInt:(I)I
        //   679: istore          14
        //   681: iload           14
        //   683: ifeq            692
        //   686: iconst_1       
        //   687: istore          14
        //   689: goto            695
        //   692: iconst_0       
        //   693: istore          14
        //   695: aload           23
        //   697: invokeinterface android/database/Cursor.close:()V
        //   702: aload           24
        //   704: invokevirtual   at.j:()V
        //   707: iload           14
        //   709: ifne            790
        //   712: aload           22
        //   714: getfield        amy.b:I
        //   717: istore          20
        //   719: iload           20
        //   721: iconst_3       
        //   722: if_icmpne       731
        //   725: iconst_1       
        //   726: istore          12
        //   728: goto            734
        //   731: iconst_0       
        //   732: istore          12
        //   734: iload           20
        //   736: iconst_4       
        //   737: if_icmpne       746
        //   740: iconst_1       
        //   741: istore          14
        //   743: goto            764
        //   746: iload           15
        //   748: istore          14
        //   750: iload           20
        //   752: bipush          6
        //   754: if_icmpne       764
        //   757: iconst_1       
        //   758: istore          16
        //   760: iload           15
        //   762: istore          14
        //   764: aload_2        
        //   765: aload           22
        //   767: getfield        amy.a:Ljava/lang/String;
        //   770: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   775: pop            
        //   776: iload           17
        //   778: iload           12
        //   780: iand           
        //   781: istore          17
        //   783: iload           14
        //   785: istore          15
        //   787: goto            790
        //   790: goto            583
        //   793: astore_1       
        //   794: aload           23
        //   796: invokeinterface android/database/Cursor.close:()V
        //   801: aload           24
        //   803: invokevirtual   at.j:()V
        //   806: aload_1        
        //   807: athrow         
        //   808: iload           8
        //   810: iconst_4       
        //   811: if_icmpne       901
        //   814: iload           16
        //   816: ifne            838
        //   819: iload           15
        //   821: ifeq            827
        //   824: goto            838
        //   827: iconst_0       
        //   828: istore          15
        //   830: iconst_0       
        //   831: istore          16
        //   833: aload_2        
        //   834: astore_1       
        //   835: goto            903
        //   838: aload           11
        //   840: invokevirtual   androidx/work/impl/WorkDatabase.s:()Lanb;
        //   843: astore_1       
        //   844: aload_1        
        //   845: aload           7
        //   847: invokeinterface anb.d:(Ljava/lang/String;)Ljava/util/List;
        //   852: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   857: astore_2       
        //   858: aload_2        
        //   859: invokeinterface java/util/Iterator.hasNext:()Z
        //   864: ifeq            888
        //   867: aload_1        
        //   868: aload_2        
        //   869: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   874: checkcast       Lamy;
        //   877: getfield        amy.a:Ljava/lang/String;
        //   880: invokeinterface anb.e:(Ljava/lang/String;)V
        //   885: goto            858
        //   888: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   891: astore_1       
        //   892: iconst_0       
        //   893: istore          15
        //   895: iconst_0       
        //   896: istore          16
        //   898: goto            903
        //   901: aload_2        
        //   902: astore_1       
        //   903: aload_1        
        //   904: aload_3        
        //   905: invokeinterface java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   910: checkcast       [Ljava/lang/String;
        //   913: astore_1       
        //   914: aload_1        
        //   915: arraylength    
        //   916: ifle            925
        //   919: iconst_1       
        //   920: istore          12
        //   922: goto            928
        //   925: iconst_0       
        //   926: istore          12
        //   928: iconst_0       
        //   929: istore          14
        //   931: iload           15
        //   933: istore          20
        //   935: goto            947
        //   938: iconst_0       
        //   939: istore          14
        //   941: iload           15
        //   943: istore          20
        //   945: aload_3        
        //   946: astore_1       
        //   947: aload           6
        //   949: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   954: astore_2       
        //   955: aload_2        
        //   956: invokeinterface java/util/Iterator.hasNext:()Z
        //   961: ifeq            1470
        //   964: aload_2        
        //   965: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   970: checkcast       Lajh;
        //   973: astore_3       
        //   974: aload_3        
        //   975: getfield        ajh.a:Lana;
        //   978: astore          18
        //   980: iload           12
        //   982: ifeq            1028
        //   985: iload           17
        //   987: ifne            1028
        //   990: iload           20
        //   992: ifeq            1004
        //   995: aload           18
        //   997: iconst_4       
        //   998: putfield        ana.p:I
        //  1001: goto            1052
        //  1004: iload           16
        //  1006: ifeq            1019
        //  1009: aload           18
        //  1011: bipush          6
        //  1013: putfield        ana.p:I
        //  1016: goto            1052
        //  1019: aload           18
        //  1021: iconst_5       
        //  1022: putfield        ana.p:I
        //  1025: goto            1052
        //  1028: aload           18
        //  1030: invokevirtual   ana.d:()Z
        //  1033: ifne            1046
        //  1036: aload           18
        //  1038: lload           9
        //  1040: putfield        ana.l:J
        //  1043: goto            1052
        //  1046: aload           18
        //  1048: lconst_0       
        //  1049: putfield        ana.l:J
        //  1052: aload           18
        //  1054: getfield        ana.p:I
        //  1057: iconst_1       
        //  1058: if_icmpne       1067
        //  1061: iconst_0       
        //  1062: istore          15
        //  1064: goto            1070
        //  1067: iconst_1       
        //  1068: istore          15
        //  1070: iload           14
        //  1072: iload           15
        //  1074: iconst_1       
        //  1075: ixor           
        //  1076: ior            
        //  1077: istore          15
        //  1079: aload           11
        //  1081: invokevirtual   androidx/work/impl/WorkDatabase.s:()Lanb;
        //  1084: astore          6
        //  1086: aload           6
        //  1088: checkcast       Lanl;
        //  1091: getfield        anl.a:Laq;
        //  1094: invokevirtual   aq.g:()V
        //  1097: aload           6
        //  1099: checkcast       Lanl;
        //  1102: getfield        anl.a:Laq;
        //  1105: invokevirtual   aq.h:()V
        //  1108: aload           6
        //  1110: checkcast       Lanl;
        //  1113: getfield        anl.b:Lai;
        //  1116: aload           18
        //  1118: invokevirtual   ai.a:(Ljava/lang/Object;)V
        //  1121: aload           6
        //  1123: checkcast       Lanl;
        //  1126: getfield        anl.a:Laq;
        //  1129: invokevirtual   aq.j:()V
        //  1132: aload           6
        //  1134: checkcast       Lanl;
        //  1137: getfield        anl.a:Laq;
        //  1140: invokevirtual   aq.i:()V
        //  1143: iload           12
        //  1145: ifeq            1253
        //  1148: aload_1        
        //  1149: arraylength    
        //  1150: istore          8
        //  1152: iconst_0       
        //  1153: istore          14
        //  1155: iload           14
        //  1157: iload           8
        //  1159: if_icmpge       1250
        //  1162: aload_1        
        //  1163: iload           14
        //  1165: aaload         
        //  1166: astore          18
        //  1168: new             Lamg;
        //  1171: astore          6
        //  1173: aload           6
        //  1175: aload_3        
        //  1176: invokevirtual   ajh.a:()Ljava/lang/String;
        //  1179: aload           18
        //  1181: invokespecial   amg.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //  1184: aload           11
        //  1186: invokevirtual   androidx/work/impl/WorkDatabase.u:()Lami;
        //  1189: astore          18
        //  1191: aload           18
        //  1193: getfield        ami.a:Laq;
        //  1196: invokevirtual   aq.g:()V
        //  1199: aload           18
        //  1201: getfield        ami.a:Laq;
        //  1204: invokevirtual   aq.h:()V
        //  1207: aload           18
        //  1209: getfield        ami.b:Lai;
        //  1212: aload           6
        //  1214: invokevirtual   ai.a:(Ljava/lang/Object;)V
        //  1217: aload           18
        //  1219: getfield        ami.a:Laq;
        //  1222: invokevirtual   aq.j:()V
        //  1225: aload           18
        //  1227: getfield        ami.a:Laq;
        //  1230: invokevirtual   aq.i:()V
        //  1233: iinc            14, 1
        //  1236: goto            1155
        //  1239: astore_1       
        //  1240: aload           18
        //  1242: getfield        ami.a:Laq;
        //  1245: invokevirtual   aq.i:()V
        //  1248: aload_1        
        //  1249: athrow         
        //  1250: goto            1253
        //  1253: aload_3        
        //  1254: getfield        ajh.b:Ljava/util/Set;
        //  1257: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  1262: astore          22
        //  1264: aload           22
        //  1266: invokeinterface java/util/Iterator.hasNext:()Z
        //  1271: ifeq            1365
        //  1274: aload           22
        //  1276: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1281: checkcast       Ljava/lang/String;
        //  1284: astore          18
        //  1286: aload           11
        //  1288: invokevirtual   androidx/work/impl/WorkDatabase.z:()Lano;
        //  1291: astore          6
        //  1293: new             Lanm;
        //  1296: astore          24
        //  1298: aload           24
        //  1300: aload           18
        //  1302: aload_3        
        //  1303: invokevirtual   ajh.a:()Ljava/lang/String;
        //  1306: invokespecial   anm.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //  1309: aload           6
        //  1311: getfield        ano.a:Laq;
        //  1314: invokevirtual   aq.g:()V
        //  1317: aload           6
        //  1319: getfield        ano.a:Laq;
        //  1322: invokevirtual   aq.h:()V
        //  1325: aload           6
        //  1327: getfield        ano.b:Lai;
        //  1330: aload           24
        //  1332: invokevirtual   ai.a:(Ljava/lang/Object;)V
        //  1335: aload           6
        //  1337: getfield        ano.a:Laq;
        //  1340: invokevirtual   aq.j:()V
        //  1343: aload           6
        //  1345: getfield        ano.a:Laq;
        //  1348: invokevirtual   aq.i:()V
        //  1351: goto            1264
        //  1354: astore_1       
        //  1355: aload           6
        //  1357: getfield        ano.a:Laq;
        //  1360: invokevirtual   aq.i:()V
        //  1363: aload_1        
        //  1364: athrow         
        //  1365: iload           13
        //  1367: ifeq            1449
        //  1370: aload           11
        //  1372: invokevirtual   androidx/work/impl/WorkDatabase.x:()Lams;
        //  1375: astore          6
        //  1377: new             Lamq;
        //  1380: astore          18
        //  1382: aload           18
        //  1384: aload           7
        //  1386: aload_3        
        //  1387: invokevirtual   ajh.a:()Ljava/lang/String;
        //  1390: invokespecial   amq.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //  1393: aload           6
        //  1395: getfield        ams.a:Laq;
        //  1398: invokevirtual   aq.g:()V
        //  1401: aload           6
        //  1403: getfield        ams.a:Laq;
        //  1406: invokevirtual   aq.h:()V
        //  1409: aload           6
        //  1411: getfield        ams.b:Lai;
        //  1414: aload           18
        //  1416: invokevirtual   ai.a:(Ljava/lang/Object;)V
        //  1419: aload           6
        //  1421: getfield        ams.a:Laq;
        //  1424: invokevirtual   aq.j:()V
        //  1427: aload           6
        //  1429: getfield        ams.a:Laq;
        //  1432: invokevirtual   aq.i:()V
        //  1435: goto            1449
        //  1438: astore_1       
        //  1439: aload           6
        //  1441: getfield        ams.a:Laq;
        //  1444: invokevirtual   aq.i:()V
        //  1447: aload_1        
        //  1448: athrow         
        //  1449: iload           15
        //  1451: istore          14
        //  1453: goto            955
        //  1456: astore_1       
        //  1457: aload           6
        //  1459: checkcast       Lanl;
        //  1462: getfield        anl.a:Laq;
        //  1465: invokevirtual   aq.i:()V
        //  1468: aload_1        
        //  1469: athrow         
        //  1470: iload           14
        //  1472: istore          15
        //  1474: aload           5
        //  1476: iconst_1       
        //  1477: putfield        ajs.e:Z
        //  1480: aload           4
        //  1482: invokevirtual   aq.j:()V
        //  1485: aload           4
        //  1487: invokevirtual   aq.i:()V
        //  1490: iload           15
        //  1492: ifeq            1540
        //  1495: aload_0        
        //  1496: astore_1       
        //  1497: aload_1        
        //  1498: getfield        ans.c:Lajs;
        //  1501: getfield        ajs.a:Lakh;
        //  1504: getfield        akh.b:Landroid/content/Context;
        //  1507: ldc_w           Landroidx/work/impl/background/systemalarm/RescheduleReceiver;.class
        //  1510: iconst_1       
        //  1511: invokestatic    anv.a:(Landroid/content/Context;Ljava/lang/Class;Z)V
        //  1514: aload_1        
        //  1515: getfield        ans.c:Lajs;
        //  1518: getfield        ajs.a:Lakh;
        //  1521: astore_1       
        //  1522: aload_1        
        //  1523: getfield        akh.c:Lail;
        //  1526: aload_1        
        //  1527: getfield        akh.d:Landroidx/work/impl/WorkDatabase;
        //  1530: aload_1        
        //  1531: getfield        akh.e:Ljava/util/List;
        //  1534: invokestatic    ajr.b:(Lail;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V
        //  1537: goto            1540
        //  1540: aload_0        
        //  1541: getfield        ans.a:Lajn;
        //  1544: getstatic       ajc.a:Lajb;
        //  1547: invokevirtual   ajn.a:(Lcwy;)V
        //  1550: return         
        //  1551: astore_1       
        //  1552: goto            1568
        //  1555: astore_1       
        //  1556: goto            1560
        //  1559: astore_1       
        //  1560: aload           4
        //  1562: invokevirtual   aq.i:()V
        //  1565: aload_1        
        //  1566: athrow         
        //  1567: astore_1       
        //  1568: aload_0        
        //  1569: getfield        ans.a:Lajn;
        //  1572: new             Laiz;
        //  1575: dup            
        //  1576: aload_1        
        //  1577: invokespecial   aiz.<init>:(Ljava/lang/Throwable;)V
        //  1580: invokevirtual   ajn.a:(Lcwy;)V
        //  1583: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      39     1567   1568   Any
        //  39     69     1567   1568   Any
        //  72     98     1567   1568   Any
        //  98     126    1567   1568   Any
        //  126    188    1559   1560   Any
        //  192    197    1559   1560   Any
        //  211    215    1559   1560   Any
        //  240    253    1559   1560   Any
        //  257    285    1559   1560   Any
        //  291    297    1559   1560   Any
        //  375    382    1559   1560   Any
        //  398    419    1555   1559   Any
        //  445    453    1559   1560   Any
        //  453    478    1559   1560   Any
        //  496    519    1559   1560   Any
        //  519    546    1559   1560   Any
        //  561    583    1555   1559   Any
        //  583    618    1555   1559   Any
        //  623    629    1555   1559   Any
        //  632    640    1555   1559   Any
        //  640    661    1555   1559   Any
        //  661    681    793    808    Any
        //  695    707    1555   1559   Any
        //  712    719    1555   1559   Any
        //  764    776    1555   1559   Any
        //  794    808    1555   1559   Any
        //  838    858    1555   1559   Any
        //  858    885    1555   1559   Any
        //  888    892    1555   1559   Any
        //  903    919    1555   1559   Any
        //  947    955    1555   1559   Any
        //  955    980    1555   1559   Any
        //  995    1001   1555   1559   Any
        //  1009   1016   1555   1559   Any
        //  1019   1025   1555   1559   Any
        //  1028   1043   1555   1559   Any
        //  1046   1052   1555   1559   Any
        //  1052   1061   1555   1559   Any
        //  1079   1108   1555   1559   Any
        //  1108   1132   1456   1470   Any
        //  1132   1143   1555   1559   Any
        //  1148   1152   1555   1559   Any
        //  1168   1207   1555   1559   Any
        //  1207   1225   1239   1250   Any
        //  1225   1233   1555   1559   Any
        //  1240   1250   1555   1559   Any
        //  1253   1264   1555   1559   Any
        //  1264   1325   1555   1559   Any
        //  1325   1343   1354   1365   Any
        //  1343   1351   1555   1559   Any
        //  1355   1365   1555   1559   Any
        //  1370   1409   1555   1559   Any
        //  1409   1427   1438   1449   Any
        //  1427   1435   1555   1559   Any
        //  1439   1449   1555   1559   Any
        //  1457   1470   1555   1559   Any
        //  1474   1485   1555   1559   Any
        //  1485   1490   1551   1555   Any
        //  1497   1537   1567   1568   Any
        //  1540   1550   1567   1568   Any
        //  1560   1567   1567   1568   Any
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
}
