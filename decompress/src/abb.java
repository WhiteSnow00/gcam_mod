import android.content.Context;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abb
{
    public static final za a;
    public static final ExecutorService b;
    public static final Object c;
    public static final zb d;
    
    static {
        a = new za(16);
        final ThreadPoolExecutor b2 = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>(), new abf());
        b2.allowCoreThreadTimeOut(true);
        b = b2;
        c = new Object();
        d = new zb();
    }
    
    public static aba a(final String p0, final Context p1, final aav p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0        
        //     4: invokevirtual   za.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //     7: checkcast       Landroid/graphics/Typeface;
        //    10: astore          4
        //    12: aload           4
        //    14: ifnonnull       1284
        //    17: aload_1        
        //    18: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    21: astore          5
        //    23: aload_1        
        //    24: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    27: pop            
        //    28: aload_2        
        //    29: getfield        aav.a:Ljava/lang/String;
        //    32: astore          4
        //    34: aload           5
        //    36: aload           4
        //    38: iconst_0       
        //    39: invokevirtual   android/content/pm/PackageManager.resolveContentProvider:(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
        //    42: astore          6
        //    44: aload           6
        //    46: ifnull          1237
        //    49: aload           6
        //    51: getfield        android/content/pm/ProviderInfo.packageName:Ljava/lang/String;
        //    54: aload_2        
        //    55: getfield        aav.b:Ljava/lang/String;
        //    58: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    61: ifeq            1183
        //    64: aload           5
        //    66: aload           6
        //    68: getfield        android/content/pm/ProviderInfo.packageName:Ljava/lang/String;
        //    71: bipush          64
        //    73: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    76: getfield        android/content/pm/PackageInfo.signatures:[Landroid/content/pm/Signature;
        //    79: astore          4
        //    81: new             Ljava/util/ArrayList;
        //    84: astore          7
        //    86: aload           7
        //    88: invokespecial   java/util/ArrayList.<init>:()V
        //    91: iconst_0       
        //    92: istore          8
        //    94: iload           8
        //    96: aload           4
        //    98: arraylength    
        //    99: if_icmpge       124
        //   102: aload           7
        //   104: aload           4
        //   106: iload           8
        //   108: aaload         
        //   109: invokevirtual   android/content/pm/Signature.toByteArray:()[B
        //   112: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   117: pop            
        //   118: iinc            8, 1
        //   121: goto            94
        //   124: aload           7
        //   126: getstatic       aau.a:Ljava/util/Comparator;
        //   129: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   132: aload_2        
        //   133: getfield        aav.d:Ljava/util/List;
        //   136: astore          4
        //   138: iconst_0       
        //   139: istore          8
        //   141: iload           8
        //   143: aload           4
        //   145: invokeinterface java/util/List.size:()I
        //   150: if_icmpge       287
        //   153: new             Ljava/util/ArrayList;
        //   156: astore          9
        //   158: aload           9
        //   160: aload           4
        //   162: iload           8
        //   164: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   169: checkcast       Ljava/util/Collection;
        //   172: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   175: aload           9
        //   177: getstatic       aau.a:Ljava/util/Comparator;
        //   180: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   183: aload           7
        //   185: invokeinterface java/util/List.size:()I
        //   190: aload           9
        //   192: invokeinterface java/util/List.size:()I
        //   197: if_icmpeq       207
        //   200: aload           4
        //   202: astore          5
        //   204: goto            270
        //   207: iconst_0       
        //   208: istore          10
        //   210: iload           10
        //   212: aload           7
        //   214: invokeinterface java/util/List.size:()I
        //   219: if_icmpge       280
        //   222: aload           7
        //   224: iload           10
        //   226: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   231: checkcast       [B
        //   234: astore          11
        //   236: aload           9
        //   238: iload           10
        //   240: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   245: astore          12
        //   247: aload           4
        //   249: astore          5
        //   251: aload           11
        //   253: aload           12
        //   255: checkcast       [B
        //   258: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   261: ifeq            270
        //   264: iinc            10, 1
        //   267: goto            210
        //   270: iinc            8, 1
        //   273: aload           5
        //   275: astore          4
        //   277: goto            141
        //   280: aload           6
        //   282: astore          4
        //   284: goto            290
        //   287: aconst_null    
        //   288: astore          4
        //   290: aload           4
        //   292: ifnonnull       303
        //   295: iconst_1       
        //   296: istore          8
        //   298: aconst_null    
        //   299: astore_2       
        //   300: goto            764
        //   303: aload           4
        //   305: getfield        android/content/pm/ProviderInfo.authority:Ljava/lang/String;
        //   308: astore          4
        //   310: new             Ljava/util/ArrayList;
        //   313: astore          5
        //   315: aload           5
        //   317: invokespecial   java/util/ArrayList.<init>:()V
        //   320: new             Landroid/net/Uri$Builder;
        //   323: astore          6
        //   325: aload           6
        //   327: invokespecial   android/net/Uri$Builder.<init>:()V
        //   330: aload           6
        //   332: ldc             "content"
        //   334: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   337: aload           4
        //   339: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   342: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //   345: astore          6
        //   347: new             Landroid/net/Uri$Builder;
        //   350: astore          7
        //   352: aload           7
        //   354: invokespecial   android/net/Uri$Builder.<init>:()V
        //   357: aload           7
        //   359: ldc             "content"
        //   361: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   364: aload           4
        //   366: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   369: ldc             "file"
        //   371: invokevirtual   android/net/Uri$Builder.appendPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   374: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //   377: astore          7
        //   379: aload_1        
        //   380: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   383: astore          4
        //   385: aload_2        
        //   386: getfield        aav.c:Ljava/lang/String;
        //   389: astore_2       
        //   390: aload           4
        //   392: aload           6
        //   394: bipush          7
        //   396: anewarray       Ljava/lang/String;
        //   399: dup            
        //   400: iconst_0       
        //   401: ldc             "_id"
        //   403: aastore        
        //   404: dup            
        //   405: iconst_1       
        //   406: ldc             "file_id"
        //   408: aastore        
        //   409: dup            
        //   410: iconst_2       
        //   411: ldc             "font_ttc_index"
        //   413: aastore        
        //   414: dup            
        //   415: iconst_3       
        //   416: ldc             "font_variation_settings"
        //   418: aastore        
        //   419: dup            
        //   420: iconst_4       
        //   421: ldc             "font_weight"
        //   423: aastore        
        //   424: dup            
        //   425: iconst_5       
        //   426: ldc             "font_italic"
        //   428: aastore        
        //   429: dup            
        //   430: bipush          6
        //   432: ldc             "result_code"
        //   434: aastore        
        //   435: ldc             "query = ?"
        //   437: iconst_1       
        //   438: anewarray       Ljava/lang/String;
        //   441: dup            
        //   442: iconst_0       
        //   443: aload_2        
        //   444: aastore        
        //   445: aconst_null    
        //   446: aconst_null    
        //   447: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
        //   450: astore          4
        //   452: aload           4
        //   454: ifnull          734
        //   457: aload           4
        //   459: invokeinterface android/database/Cursor.getCount:()I
        //   464: ifle            734
        //   467: aload           4
        //   469: ldc             "result_code"
        //   471: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   476: istore          13
        //   478: new             Ljava/util/ArrayList;
        //   481: astore          5
        //   483: aload           5
        //   485: invokespecial   java/util/ArrayList.<init>:()V
        //   488: aload           4
        //   490: ldc             "_id"
        //   492: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   497: istore          14
        //   499: aload           4
        //   501: ldc             "file_id"
        //   503: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   508: istore          15
        //   510: aload           4
        //   512: ldc             "font_ttc_index"
        //   514: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   519: istore          16
        //   521: aload           4
        //   523: ldc             "font_weight"
        //   525: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   530: istore          17
        //   532: aload           4
        //   534: ldc             "font_italic"
        //   536: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   541: istore          18
        //   543: aload           4
        //   545: invokeinterface android/database/Cursor.moveToNext:()Z
        //   550: ifeq            721
        //   553: iload           13
        //   555: iconst_m1      
        //   556: if_icmpeq       573
        //   559: aload           4
        //   561: iload           13
        //   563: invokeinterface android/database/Cursor.getInt:(I)I
        //   568: istore          8
        //   570: goto            576
        //   573: iconst_0       
        //   574: istore          8
        //   576: iload           16
        //   578: iconst_m1      
        //   579: if_icmpeq       596
        //   582: aload           4
        //   584: iload           16
        //   586: invokeinterface android/database/Cursor.getInt:(I)I
        //   591: istore          10
        //   593: goto            599
        //   596: iconst_0       
        //   597: istore          10
        //   599: iload           15
        //   601: iconst_m1      
        //   602: if_icmpne       623
        //   605: aload           6
        //   607: aload           4
        //   609: iload           14
        //   611: invokeinterface android/database/Cursor.getLong:(I)J
        //   616: invokestatic    android/content/ContentUris.withAppendedId:(Landroid/net/Uri;J)Landroid/net/Uri;
        //   619: astore_2       
        //   620: goto            638
        //   623: aload           7
        //   625: aload           4
        //   627: iload           15
        //   629: invokeinterface android/database/Cursor.getLong:(I)J
        //   634: invokestatic    android/content/ContentUris.withAppendedId:(Landroid/net/Uri;J)Landroid/net/Uri;
        //   637: astore_2       
        //   638: iload           17
        //   640: iconst_m1      
        //   641: if_icmpeq       658
        //   644: aload           4
        //   646: iload           17
        //   648: invokeinterface android/database/Cursor.getInt:(I)I
        //   653: istore          19
        //   655: goto            663
        //   658: sipush          400
        //   661: istore          19
        //   663: iload           18
        //   665: iconst_m1      
        //   666: if_icmpeq       688
        //   669: aload           4
        //   671: iload           18
        //   673: invokeinterface android/database/Cursor.getInt:(I)I
        //   678: iconst_1       
        //   679: if_icmpne       688
        //   682: iconst_1       
        //   683: istore          20
        //   685: goto            691
        //   688: iconst_0       
        //   689: istore          20
        //   691: new             Labc;
        //   694: astore          9
        //   696: aload           9
        //   698: aload_2        
        //   699: iload           10
        //   701: iload           19
        //   703: iload           20
        //   705: iload           8
        //   707: invokespecial   abc.<init>:(Landroid/net/Uri;IIZI)V
        //   710: aload           5
        //   712: aload           9
        //   714: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   717: pop            
        //   718: goto            543
        //   721: aload           5
        //   723: astore_2       
        //   724: goto            737
        //   727: astore_1       
        //   728: aload           4
        //   730: astore_0       
        //   731: goto            1171
        //   734: aload           5
        //   736: astore_2       
        //   737: aload           4
        //   739: ifnull          749
        //   742: aload           4
        //   744: invokeinterface android/database/Cursor.close:()V
        //   749: aload_2        
        //   750: iconst_0       
        //   751: anewarray       Labc;
        //   754: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   757: checkcast       [Labc;
        //   760: astore_2       
        //   761: iconst_0       
        //   762: istore          8
        //   764: iload           8
        //   766: ifeq            776
        //   769: bipush          -2
        //   771: istore          8
        //   773: goto            853
        //   776: aload_2        
        //   777: ifnull          850
        //   780: aload_2        
        //   781: arraylength    
        //   782: istore          19
        //   784: iload           19
        //   786: ifne            795
        //   789: iconst_1       
        //   790: istore          8
        //   792: goto            853
        //   795: iconst_0       
        //   796: istore          8
        //   798: iload           8
        //   800: iload           19
        //   802: if_icmpge       844
        //   805: aload_2        
        //   806: iload           8
        //   808: aaload         
        //   809: getfield        abc.e:I
        //   812: istore          10
        //   814: iload           10
        //   816: ifeq            838
        //   819: iload           10
        //   821: ifge            831
        //   824: bipush          -3
        //   826: istore          8
        //   828: goto            853
        //   831: iload           10
        //   833: istore          8
        //   835: goto            853
        //   838: iinc            8, 1
        //   841: goto            798
        //   844: iconst_0       
        //   845: istore          8
        //   847: goto            853
        //   850: iconst_1       
        //   851: istore          8
        //   853: iload           8
        //   855: ifne            1158
        //   858: getstatic       ha.a:Lza;
        //   861: astore          4
        //   863: aload_1        
        //   864: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   867: astore          5
        //   869: aload_2        
        //   870: arraylength    
        //   871: istore          10
        //   873: iconst_0       
        //   874: istore          8
        //   876: aconst_null    
        //   877: astore_1       
        //   878: iload           8
        //   880: iload           10
        //   882: if_icmpge       1039
        //   885: aload_2        
        //   886: iload           8
        //   888: aaload         
        //   889: astore          4
        //   891: aload           4
        //   893: getfield        abc.a:Landroid/net/Uri;
        //   896: astore          6
        //   898: aload           5
        //   900: aload           6
        //   902: ldc_w           "r"
        //   905: aconst_null    
        //   906: invokevirtual   android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
        //   909: astore          6
        //   911: aload           6
        //   913: ifnonnull       919
        //   916: goto            1033
        //   919: new             Landroid/graphics/fonts/Font$Builder;
        //   922: astore          7
        //   924: aload           7
        //   926: aload           6
        //   928: invokespecial   android/graphics/fonts/Font$Builder.<init>:(Landroid/os/ParcelFileDescriptor;)V
        //   931: aload           7
        //   933: aload           4
        //   935: getfield        abc.c:I
        //   938: invokevirtual   android/graphics/fonts/Font$Builder.setWeight:(I)Landroid/graphics/fonts/Font$Builder;
        //   941: aload           4
        //   943: getfield        abc.d:Z
        //   946: invokevirtual   android/graphics/fonts/Font$Builder.setSlant:(I)Landroid/graphics/fonts/Font$Builder;
        //   949: aload           4
        //   951: getfield        abc.b:I
        //   954: invokevirtual   android/graphics/fonts/Font$Builder.setTtcIndex:(I)Landroid/graphics/fonts/Font$Builder;
        //   957: invokevirtual   android/graphics/fonts/Font$Builder.build:()Landroid/graphics/fonts/Font;
        //   960: astore          7
        //   962: aload_1        
        //   963: ifnonnull       984
        //   966: new             Landroid/graphics/fonts/FontFamily$Builder;
        //   969: astore          4
        //   971: aload           4
        //   973: aload           7
        //   975: invokespecial   android/graphics/fonts/FontFamily$Builder.<init>:(Landroid/graphics/fonts/Font;)V
        //   978: aload           4
        //   980: astore_1       
        //   981: goto            991
        //   984: aload_1        
        //   985: aload           7
        //   987: invokevirtual   android/graphics/fonts/FontFamily$Builder.addFont:(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
        //   990: pop            
        //   991: aload           6
        //   993: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   996: goto            1033
        //   999: astore          4
        //  1001: goto            1033
        //  1004: astore          4
        //  1006: aload           6
        //  1008: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //  1011: goto            1023
        //  1014: astore          6
        //  1016: aload           4
        //  1018: aload           6
        //  1020: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1023: aload           4
        //  1025: athrow         
        //  1026: astore          4
        //  1028: goto            1033
        //  1031: astore          4
        //  1033: iinc            8, 1
        //  1036: goto            878
        //  1039: aload_1        
        //  1040: ifnonnull       1048
        //  1043: aconst_null    
        //  1044: astore_1       
        //  1045: goto            1126
        //  1048: new             Landroid/graphics/fonts/FontStyle;
        //  1051: astore_2       
        //  1052: iconst_1       
        //  1053: iload_3        
        //  1054: iconst_1       
        //  1055: iand           
        //  1056: if_icmpeq       1067
        //  1059: sipush          400
        //  1062: istore          8
        //  1064: goto            1072
        //  1067: sipush          700
        //  1070: istore          8
        //  1072: iload_3        
        //  1073: iconst_2       
        //  1074: iand           
        //  1075: ifeq            1083
        //  1078: iconst_1       
        //  1079: istore_3       
        //  1080: goto            1085
        //  1083: iconst_0       
        //  1084: istore_3       
        //  1085: aload_2        
        //  1086: iload           8
        //  1088: iload_3        
        //  1089: invokespecial   android/graphics/fonts/FontStyle.<init>:(II)V
        //  1092: new             Landroid/graphics/Typeface$CustomFallbackBuilder;
        //  1095: astore          4
        //  1097: aload           4
        //  1099: aload_1        
        //  1100: invokevirtual   android/graphics/fonts/FontFamily$Builder.build:()Landroid/graphics/fonts/FontFamily;
        //  1103: invokespecial   android/graphics/Typeface$CustomFallbackBuilder.<init>:(Landroid/graphics/fonts/FontFamily;)V
        //  1106: aload           4
        //  1108: aload_2        
        //  1109: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.setStyle:(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
        //  1112: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.build:()Landroid/graphics/Typeface;
        //  1115: astore_1       
        //  1116: goto            1126
        //  1119: astore_1       
        //  1120: goto            1124
        //  1123: astore_1       
        //  1124: aconst_null    
        //  1125: astore_1       
        //  1126: aload_1        
        //  1127: ifnull          1148
        //  1130: getstatic       abb.a:Lza;
        //  1133: aload_0        
        //  1134: aload_1        
        //  1135: invokevirtual   za.b:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1138: pop            
        //  1139: new             Laba;
        //  1142: dup            
        //  1143: aload_1        
        //  1144: invokespecial   aba.<init>:(Landroid/graphics/Typeface;)V
        //  1147: areturn        
        //  1148: new             Laba;
        //  1151: dup            
        //  1152: bipush          -3
        //  1154: invokespecial   aba.<init>:(I)V
        //  1157: areturn        
        //  1158: new             Laba;
        //  1161: dup            
        //  1162: iload           8
        //  1164: invokespecial   aba.<init>:(I)V
        //  1167: areturn        
        //  1168: astore_1       
        //  1169: aconst_null    
        //  1170: astore_0       
        //  1171: aload_0        
        //  1172: ifnull          1181
        //  1175: aload_0        
        //  1176: invokeinterface android/database/Cursor.close:()V
        //  1181: aload_1        
        //  1182: athrow         
        //  1183: new             Landroid/content/pm/PackageManager$NameNotFoundException;
        //  1186: astore_0       
        //  1187: new             Ljava/lang/StringBuilder;
        //  1190: astore_1       
        //  1191: aload_1        
        //  1192: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1195: aload_1        
        //  1196: ldc_w           "Found content provider "
        //  1199: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1202: pop            
        //  1203: aload_1        
        //  1204: aload           4
        //  1206: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1209: pop            
        //  1210: aload_1        
        //  1211: ldc_w           ", but package was not "
        //  1214: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1217: pop            
        //  1218: aload_1        
        //  1219: aload_2        
        //  1220: getfield        aav.b:Ljava/lang/String;
        //  1223: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1226: pop            
        //  1227: aload_0        
        //  1228: aload_1        
        //  1229: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1232: invokespecial   android/content/pm/PackageManager$NameNotFoundException.<init>:(Ljava/lang/String;)V
        //  1235: aload_0        
        //  1236: athrow         
        //  1237: new             Landroid/content/pm/PackageManager$NameNotFoundException;
        //  1240: astore_0       
        //  1241: new             Ljava/lang/StringBuilder;
        //  1244: astore_1       
        //  1245: aload_1        
        //  1246: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1249: aload_1        
        //  1250: ldc_w           "No package found for authority: "
        //  1253: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1256: pop            
        //  1257: aload_1        
        //  1258: aload           4
        //  1260: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1263: pop            
        //  1264: aload_0        
        //  1265: aload_1        
        //  1266: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1269: invokespecial   android/content/pm/PackageManager$NameNotFoundException.<init>:(Ljava/lang/String;)V
        //  1272: aload_0        
        //  1273: athrow         
        //  1274: astore_0       
        //  1275: new             Laba;
        //  1278: dup            
        //  1279: iconst_m1      
        //  1280: invokespecial   aba.<init>:(I)V
        //  1283: areturn        
        //  1284: new             Laba;
        //  1287: dup            
        //  1288: aload           4
        //  1290: invokespecial   aba.<init>:(Landroid/graphics/Typeface;)V
        //  1293: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  17     44     1274   1284   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  49     91     1274   1284   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  94     118    1274   1284   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  124    138    1274   1284   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  141    200    1274   1284   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  210    247    1274   1284   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  251    264    1274   1284   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  303    379    1274   1284   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  379    452    1168   1171   Any
        //  457    543    727    734    Any
        //  543    553    727    734    Any
        //  559    570    727    734    Any
        //  582    593    727    734    Any
        //  605    620    727    734    Any
        //  623    638    727    734    Any
        //  644    655    727    734    Any
        //  669    682    727    734    Any
        //  691    718    727    734    Any
        //  742    749    1274   1284   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  749    761    1274   1284   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  869    873    1123   1124   Ljava/lang/Exception;
        //  891    898    1031   1033   Ljava/io/IOException;
        //  891    898    1123   1124   Ljava/lang/Exception;
        //  898    911    1026   1031   Ljava/io/IOException;
        //  898    911    1119   1123   Ljava/lang/Exception;
        //  919    962    1004   1026   Any
        //  966    978    1004   1026   Any
        //  984    991    1004   1026   Any
        //  991    996    999    1004   Ljava/io/IOException;
        //  991    996    1119   1123   Ljava/lang/Exception;
        //  1006   1011   1014   1023   Any
        //  1016   1023   1026   1031   Ljava/io/IOException;
        //  1016   1023   1119   1123   Ljava/lang/Exception;
        //  1023   1026   1026   1031   Ljava/io/IOException;
        //  1023   1026   1119   1123   Ljava/lang/Exception;
        //  1048   1052   1119   1123   Ljava/lang/Exception;
        //  1085   1116   1119   1123   Ljava/lang/Exception;
        //  1175   1181   1274   1284   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  1181   1183   1274   1284   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  1183   1237   1274   1284   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  1237   1274   1274   1284   Landroid/content/pm/PackageManager$NameNotFoundException;
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
    
    public static String b(final aav aav, final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append(aav.e);
        sb.append("-");
        sb.append(n);
        return sb.toString();
    }
}
