import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.content.Context;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gu
{
    static {
        new ThreadLocal();
        new WeakHashMap(0);
    }
    
    public static Typeface a(final Context context, final int n, final TypedValue typedValue, final int n2, final gs gs) {
        if (context.isRestricted()) {
            return null;
        }
        return d(context, n, typedValue, n2, gs, true);
    }
    
    public static Drawable b(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        return resources.getDrawable(n, resources$Theme);
    }
    
    public static void c(final Context context, final int n, final gs gs) {
        if (context.isRestricted()) {
            gs.d();
            return;
        }
        d(context, n, new TypedValue(), 0, gs, false);
    }
    
    private static Typeface d(final Context context, final int n, final TypedValue typedValue, final int n2, final gs gs, final boolean b) {
        final Resources resources = context.getResources();
        resources.getValue(n, typedValue, true);
        return e(context, resources, typedValue, n, n2, gs, b);
    }
    
    private static Typeface e(final Context p0, final Resources p1, final TypedValue p2, final int p3, final int p4, final gs p5, final boolean p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/util/TypedValue.string:Ljava/lang/CharSequence;
        //     4: ifnull          1006
        //     7: aload_2        
        //     8: getfield        android/util/TypedValue.string:Ljava/lang/CharSequence;
        //    11: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //    16: astore          7
        //    18: aload           7
        //    20: ldc             "res/"
        //    22: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    25: ifne            33
        //    28: invokestatic    gs.d:()V
        //    31: aconst_null    
        //    32: areturn        
        //    33: getstatic       ha.a:Lza;
        //    36: aload_1        
        //    37: iload_3        
        //    38: iload           4
        //    40: invokestatic    ha.b:(Landroid/content/res/Resources;II)Ljava/lang/String;
        //    43: invokevirtual   za.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //    46: checkcast       Landroid/graphics/Typeface;
        //    49: astore_2       
        //    50: aload_2        
        //    51: ifnonnull       998
        //    54: aload           7
        //    56: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //    59: ldc             ".xml"
        //    61: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //    64: ifeq            806
        //    67: aload_1        
        //    68: iload_3        
        //    69: invokevirtual   android/content/res/Resources.getXml:(I)Landroid/content/res/XmlResourceParser;
        //    72: astore_2       
        //    73: aload_2        
        //    74: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //    79: istore          8
        //    81: iload           8
        //    83: iconst_2       
        //    84: if_icmpeq       108
        //    87: iload           8
        //    89: iconst_1       
        //    90: if_icmpeq       96
        //    93: goto            73
        //    96: new             Lorg/xmlpull/v1/XmlPullParserException;
        //    99: astore_0       
        //   100: aload_0        
        //   101: ldc             "No start tag found"
        //   103: invokespecial   org/xmlpull/v1/XmlPullParserException.<init>:(Ljava/lang/String;)V
        //   106: aload_0        
        //   107: athrow         
        //   108: aload_2        
        //   109: iconst_2       
        //   110: aconst_null    
        //   111: ldc             "font-family"
        //   113: invokeinterface org/xmlpull/v1/XmlPullParser.require:(ILjava/lang/String;Ljava/lang/String;)V
        //   118: aload_2        
        //   119: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   124: ldc             "font-family"
        //   126: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   129: ifeq            767
        //   132: aload_1        
        //   133: aload_2        
        //   134: invokestatic    android/util/Xml.asAttributeSet:(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
        //   137: getstatic       cq.b:[I
        //   140: invokevirtual   android/content/res/Resources.obtainAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
        //   143: astore          9
        //   145: aload           9
        //   147: iconst_0       
        //   148: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //   151: astore          10
        //   153: aload           9
        //   155: iconst_4       
        //   156: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //   159: astore          11
        //   161: aload           9
        //   163: iconst_5       
        //   164: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //   167: astore          12
        //   169: aload           9
        //   171: iconst_1       
        //   172: iconst_0       
        //   173: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //   176: istore          8
        //   178: aload           9
        //   180: iconst_2       
        //   181: iconst_1       
        //   182: invokevirtual   android/content/res/TypedArray.getInteger:(II)I
        //   185: istore          13
        //   187: aload           9
        //   189: iconst_3       
        //   190: sipush          500
        //   193: invokevirtual   android/content/res/TypedArray.getInteger:(II)I
        //   196: istore          14
        //   198: aload           9
        //   200: bipush          6
        //   202: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //   205: astore          15
        //   207: aload           9
        //   209: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   212: aload           10
        //   214: ifnull          426
        //   217: aload           11
        //   219: ifnull          426
        //   222: aload           12
        //   224: ifnull          426
        //   227: aload_2        
        //   228: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //   233: iconst_3       
        //   234: if_icmpeq       244
        //   237: aload_2        
        //   238: invokestatic    a.d:(Lorg/xmlpull/v1/XmlPullParser;)V
        //   241: goto            227
        //   244: iload           8
        //   246: ifne            256
        //   249: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   252: astore_2       
        //   253: goto            373
        //   256: aload_1        
        //   257: iload           8
        //   259: invokevirtual   android/content/res/Resources.obtainTypedArray:(I)Landroid/content/res/TypedArray;
        //   262: astore          9
        //   264: aload           9
        //   266: invokevirtual   android/content/res/TypedArray.length:()I
        //   269: ifne            284
        //   272: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   275: astore_2       
        //   276: aload           9
        //   278: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   281: goto            373
        //   284: new             Ljava/util/ArrayList;
        //   287: dup            
        //   288: invokespecial   java/util/ArrayList.<init>:()V
        //   291: astore_2       
        //   292: aload           9
        //   294: iconst_0       
        //   295: invokevirtual   android/content/res/TypedArray.getType:(I)I
        //   298: iconst_1       
        //   299: if_icmpne       352
        //   302: iconst_0       
        //   303: istore          8
        //   305: iload           8
        //   307: aload           9
        //   309: invokevirtual   android/content/res/TypedArray.length:()I
        //   312: if_icmpge       368
        //   315: aload           9
        //   317: iload           8
        //   319: iconst_0       
        //   320: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //   323: istore          16
        //   325: iload           16
        //   327: ifeq            346
        //   330: aload_2        
        //   331: aload_1        
        //   332: iload           16
        //   334: invokevirtual   android/content/res/Resources.getStringArray:(I)[Ljava/lang/String;
        //   337: invokestatic    a.c:([Ljava/lang/String;)Ljava/util/List;
        //   340: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   345: pop            
        //   346: iinc            8, 1
        //   349: goto            305
        //   352: aload_2        
        //   353: aload_1        
        //   354: iload           8
        //   356: invokevirtual   android/content/res/Resources.getStringArray:(I)[Ljava/lang/String;
        //   359: invokestatic    a.c:([Ljava/lang/String;)Ljava/util/List;
        //   362: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   367: pop            
        //   368: aload           9
        //   370: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   373: new             Lgp;
        //   376: astore          9
        //   378: new             Laav;
        //   381: astore          17
        //   383: aload           17
        //   385: aload           10
        //   387: aload           11
        //   389: aload           12
        //   391: aload_2        
        //   392: invokespecial   aav.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
        //   395: aload           9
        //   397: aload           17
        //   399: iload           13
        //   401: iload           14
        //   403: aload           15
        //   405: invokespecial   gp.<init>:(Laav;IILjava/lang/String;)V
        //   408: aload           9
        //   410: astore_2       
        //   411: goto            773
        //   414: astore_0       
        //   415: goto            419
        //   418: astore_0       
        //   419: aload           9
        //   421: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   424: aload_0        
        //   425: athrow         
        //   426: new             Ljava/util/ArrayList;
        //   429: astore          9
        //   431: aload           9
        //   433: invokespecial   java/util/ArrayList.<init>:()V
        //   436: aload_2        
        //   437: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //   442: iconst_3       
        //   443: if_icmpeq       721
        //   446: aload_2        
        //   447: invokeinterface org/xmlpull/v1/XmlPullParser.getEventType:()I
        //   452: iconst_2       
        //   453: if_icmpne       718
        //   456: aload_2        
        //   457: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   462: ldc             "font"
        //   464: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   467: ifeq            711
        //   470: aload_1        
        //   471: aload_2        
        //   472: invokestatic    android/util/Xml.asAttributeSet:(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
        //   475: getstatic       cq.c:[I
        //   478: invokevirtual   android/content/res/Resources.obtainAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
        //   481: astore          15
        //   483: bipush          8
        //   485: istore          8
        //   487: iconst_1       
        //   488: aload           15
        //   490: bipush          8
        //   492: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //   495: if_icmpeq       504
        //   498: iconst_1       
        //   499: istore          8
        //   501: goto            504
        //   504: aload           15
        //   506: iload           8
        //   508: sipush          400
        //   511: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //   514: istore          14
        //   516: iconst_1       
        //   517: aload           15
        //   519: bipush          6
        //   521: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //   524: if_icmpeq       533
        //   527: iconst_2       
        //   528: istore          8
        //   530: goto            537
        //   533: bipush          6
        //   535: istore          8
        //   537: aload           15
        //   539: iload           8
        //   541: iconst_0       
        //   542: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //   545: iconst_1       
        //   546: if_icmpne       555
        //   549: iconst_1       
        //   550: istore          18
        //   552: goto            558
        //   555: iconst_0       
        //   556: istore          18
        //   558: bipush          9
        //   560: istore          8
        //   562: iconst_1       
        //   563: aload           15
        //   565: bipush          9
        //   567: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //   570: if_icmpeq       579
        //   573: iconst_3       
        //   574: istore          8
        //   576: goto            579
        //   579: bipush          7
        //   581: istore          13
        //   583: iconst_1       
        //   584: aload           15
        //   586: bipush          7
        //   588: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //   591: if_icmpeq       600
        //   594: iconst_4       
        //   595: istore          13
        //   597: goto            600
        //   600: aload           15
        //   602: iload           13
        //   604: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //   607: astore          11
        //   609: aload           15
        //   611: iload           8
        //   613: iconst_0       
        //   614: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //   617: istore          13
        //   619: iconst_1       
        //   620: aload           15
        //   622: iconst_5       
        //   623: invokevirtual   android/content/res/TypedArray.hasValue:(I)Z
        //   626: if_icmpeq       635
        //   629: iconst_0       
        //   630: istore          8
        //   632: goto            638
        //   635: iconst_5       
        //   636: istore          8
        //   638: aload           15
        //   640: iload           8
        //   642: iconst_0       
        //   643: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //   646: istore          16
        //   648: aload           15
        //   650: iload           8
        //   652: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //   655: pop            
        //   656: aload           15
        //   658: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   661: aload_2        
        //   662: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //   667: iconst_3       
        //   668: if_icmpeq       678
        //   671: aload_2        
        //   672: invokestatic    a.d:(Lorg/xmlpull/v1/XmlPullParser;)V
        //   675: goto            661
        //   678: new             Lgo;
        //   681: astore          15
        //   683: aload           15
        //   685: iload           14
        //   687: iload           18
        //   689: aload           11
        //   691: iload           13
        //   693: iload           16
        //   695: invokespecial   go.<init>:(IZLjava/lang/String;II)V
        //   698: aload           9
        //   700: aload           15
        //   702: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   707: pop            
        //   708: goto            436
        //   711: aload_2        
        //   712: invokestatic    a.d:(Lorg/xmlpull/v1/XmlPullParser;)V
        //   715: goto            436
        //   718: goto            436
        //   721: aload           9
        //   723: invokeinterface java/util/List.isEmpty:()Z
        //   728: ifeq            736
        //   731: aconst_null    
        //   732: astore_2       
        //   733: goto            773
        //   736: new             Lgn;
        //   739: dup            
        //   740: aload           9
        //   742: aload           9
        //   744: invokeinterface java/util/List.size:()I
        //   749: anewarray       Lgo;
        //   752: invokeinterface java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   757: checkcast       [Lgo;
        //   760: invokespecial   gn.<init>:([Lgo;)V
        //   763: astore_2       
        //   764: goto            773
        //   767: aload_2        
        //   768: invokestatic    a.d:(Lorg/xmlpull/v1/XmlPullParser;)V
        //   771: aconst_null    
        //   772: astore_2       
        //   773: aload_2        
        //   774: ifnonnull       790
        //   777: ldc             "ResourcesCompat"
        //   779: ldc             "Failed to find font-family tag"
        //   781: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   784: pop            
        //   785: invokestatic    gs.d:()V
        //   788: aconst_null    
        //   789: areturn        
        //   790: aload_0        
        //   791: aload_2        
        //   792: aload_1        
        //   793: iload_3        
        //   794: iload           4
        //   796: aload           5
        //   798: iload           6
        //   800: invokestatic    ha.c:(Landroid/content/Context;Lgm;Landroid/content/res/Resources;IILgs;Z)Landroid/graphics/Typeface;
        //   803: astore_0       
        //   804: aload_0        
        //   805: areturn        
        //   806: new             Landroid/graphics/fonts/Font$Builder;
        //   809: astore_0       
        //   810: aload_0        
        //   811: aload_1        
        //   812: iload_3        
        //   813: invokespecial   android/graphics/fonts/Font$Builder.<init>:(Landroid/content/res/Resources;I)V
        //   816: aload_0        
        //   817: invokevirtual   android/graphics/fonts/Font$Builder.build:()Landroid/graphics/fonts/Font;
        //   820: astore_0       
        //   821: new             Landroid/graphics/fonts/FontFamily$Builder;
        //   824: astore_2       
        //   825: aload_2        
        //   826: aload_0        
        //   827: invokespecial   android/graphics/fonts/FontFamily$Builder.<init>:(Landroid/graphics/fonts/Font;)V
        //   830: aload_2        
        //   831: invokevirtual   android/graphics/fonts/FontFamily$Builder.build:()Landroid/graphics/fonts/FontFamily;
        //   834: astore_2       
        //   835: new             Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   838: astore          9
        //   840: aload           9
        //   842: aload_2        
        //   843: invokespecial   android/graphics/Typeface$CustomFallbackBuilder.<init>:(Landroid/graphics/fonts/FontFamily;)V
        //   846: aload           9
        //   848: aload_0        
        //   849: invokevirtual   android/graphics/fonts/Font.getStyle:()Landroid/graphics/fonts/FontStyle;
        //   852: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.setStyle:(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   855: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.build:()Landroid/graphics/Typeface;
        //   858: astore_0       
        //   859: goto            865
        //   862: astore_0       
        //   863: aconst_null    
        //   864: astore_0       
        //   865: aload_0        
        //   866: ifnull          900
        //   869: aload_1        
        //   870: iload_3        
        //   871: iload           4
        //   873: invokestatic    ha.b:(Landroid/content/res/Resources;II)Ljava/lang/String;
        //   876: astore_1       
        //   877: getstatic       ha.a:Lza;
        //   880: aload_1        
        //   881: aload_0        
        //   882: invokevirtual   za.b:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   885: pop            
        //   886: goto            900
        //   889: astore_0       
        //   890: goto            919
        //   893: astore_0       
        //   894: aload           7
        //   896: astore_1       
        //   897: goto            960
        //   900: aload_0        
        //   901: ifnull          913
        //   904: aload           5
        //   906: aload_0        
        //   907: invokevirtual   gs.b:(Landroid/graphics/Typeface;)V
        //   910: goto            916
        //   913: invokestatic    gs.d:()V
        //   916: aload_0        
        //   917: areturn        
        //   918: astore_0       
        //   919: new             Ljava/lang/StringBuilder;
        //   922: dup            
        //   923: invokespecial   java/lang/StringBuilder.<init>:()V
        //   926: astore_1       
        //   927: aload_1        
        //   928: ldc_w           "Failed to read xml resource "
        //   931: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   934: pop            
        //   935: aload_1        
        //   936: aload           7
        //   938: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   941: pop            
        //   942: ldc             "ResourcesCompat"
        //   944: aload_1        
        //   945: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   948: aload_0        
        //   949: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   952: pop            
        //   953: goto            993
        //   956: astore_0       
        //   957: aload           7
        //   959: astore_1       
        //   960: new             Ljava/lang/StringBuilder;
        //   963: dup            
        //   964: invokespecial   java/lang/StringBuilder.<init>:()V
        //   967: astore_2       
        //   968: aload_2        
        //   969: ldc_w           "Failed to parse xml resource "
        //   972: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   975: pop            
        //   976: aload_2        
        //   977: aload_1        
        //   978: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   981: pop            
        //   982: ldc             "ResourcesCompat"
        //   984: aload_2        
        //   985: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   988: aload_0        
        //   989: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   992: pop            
        //   993: invokestatic    gs.d:()V
        //   996: aconst_null    
        //   997: areturn        
        //   998: aload           5
        //  1000: aload_2        
        //  1001: invokevirtual   gs.b:(Landroid/graphics/Typeface;)V
        //  1004: aload_2        
        //  1005: areturn        
        //  1006: new             Ljava/lang/StringBuilder;
        //  1009: dup            
        //  1010: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1013: astore_0       
        //  1014: aload_0        
        //  1015: ldc_w           "Resource \""
        //  1018: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1021: pop            
        //  1022: aload_0        
        //  1023: aload_1        
        //  1024: iload_3        
        //  1025: invokevirtual   android/content/res/Resources.getResourceName:(I)Ljava/lang/String;
        //  1028: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1031: pop            
        //  1032: aload_0        
        //  1033: ldc_w           "\" ("
        //  1036: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1039: pop            
        //  1040: aload_0        
        //  1041: iload_3        
        //  1042: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //  1045: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1048: pop            
        //  1049: aload_0        
        //  1050: ldc_w           ") is not a Font: "
        //  1053: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1056: pop            
        //  1057: aload_0        
        //  1058: aload_2        
        //  1059: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1062: pop            
        //  1063: new             Landroid/content/res/Resources$NotFoundException;
        //  1066: dup            
        //  1067: aload_0        
        //  1068: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1071: invokespecial   android/content/res/Resources$NotFoundException.<init>:(Ljava/lang/String;)V
        //  1074: astore_0       
        //  1075: goto            1080
        //  1078: aload_0        
        //  1079: athrow         
        //  1080: goto            1078
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                   
        //  -----  -----  -----  -----  ---------------------------------------
        //  54     73     956    960    Lorg/xmlpull/v1/XmlPullParserException;
        //  54     73     918    919    Ljava/io/IOException;
        //  73     81     956    960    Lorg/xmlpull/v1/XmlPullParserException;
        //  73     81     918    919    Ljava/io/IOException;
        //  96     108    956    960    Lorg/xmlpull/v1/XmlPullParserException;
        //  96     108    918    919    Ljava/io/IOException;
        //  108    212    956    960    Lorg/xmlpull/v1/XmlPullParserException;
        //  108    212    918    919    Ljava/io/IOException;
        //  227    241    956    960    Lorg/xmlpull/v1/XmlPullParserException;
        //  227    241    918    919    Ljava/io/IOException;
        //  249    253    956    960    Lorg/xmlpull/v1/XmlPullParserException;
        //  249    253    918    919    Ljava/io/IOException;
        //  256    264    956    960    Lorg/xmlpull/v1/XmlPullParserException;
        //  256    264    918    919    Ljava/io/IOException;
        //  264    276    418    419    Any
        //  276    281    956    960    Lorg/xmlpull/v1/XmlPullParserException;
        //  276    281    918    919    Ljava/io/IOException;
        //  284    292    418    419    Any
        //  292    302    414    418    Any
        //  305    325    414    418    Any
        //  330    346    414    418    Any
        //  352    368    414    418    Any
        //  368    373    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  368    373    889    893    Ljava/io/IOException;
        //  373    408    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  373    408    889    893    Ljava/io/IOException;
        //  419    426    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  419    426    889    893    Ljava/io/IOException;
        //  426    436    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  426    436    889    893    Ljava/io/IOException;
        //  436    483    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  436    483    889    893    Ljava/io/IOException;
        //  487    498    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  487    498    889    893    Ljava/io/IOException;
        //  504    527    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  504    527    889    893    Ljava/io/IOException;
        //  537    549    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  537    549    889    893    Ljava/io/IOException;
        //  562    573    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  562    573    889    893    Ljava/io/IOException;
        //  583    594    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  583    594    889    893    Ljava/io/IOException;
        //  600    629    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  600    629    889    893    Ljava/io/IOException;
        //  638    661    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  638    661    889    893    Ljava/io/IOException;
        //  661    675    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  661    675    889    893    Ljava/io/IOException;
        //  678    708    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  678    708    889    893    Ljava/io/IOException;
        //  711    715    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  711    715    889    893    Ljava/io/IOException;
        //  721    731    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  721    731    889    893    Ljava/io/IOException;
        //  736    764    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  736    764    889    893    Ljava/io/IOException;
        //  767    771    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  767    771    889    893    Ljava/io/IOException;
        //  777    788    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  777    788    889    893    Ljava/io/IOException;
        //  790    804    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  790    804    889    893    Ljava/io/IOException;
        //  806    859    862    865    Ljava/lang/Exception;
        //  869    886    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  869    886    889    893    Ljava/io/IOException;
        //  904    910    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  904    910    889    893    Ljava/io/IOException;
        //  913    916    893    900    Lorg/xmlpull/v1/XmlPullParserException;
        //  913    916    889    893    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0368:
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
