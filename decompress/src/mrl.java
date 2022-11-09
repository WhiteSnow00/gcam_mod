import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrl
{
    private static final Logger a;
    
    static {
        a = Logger.getLogger("XmpUtil");
    }
    
    public static apf a(final InputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore_1       
        //     8: aload_0        
        //     9: ifnonnull       15
        //    12: goto            257
        //    15: aload_0        
        //    16: invokevirtual   java/io/InputStream.read:()I
        //    19: sipush          255
        //    22: if_icmpne       207
        //    25: aload_0        
        //    26: invokevirtual   java/io/InputStream.read:()I
        //    29: sipush          216
        //    32: if_icmpne       207
        //    35: aload_0        
        //    36: invokevirtual   java/io/InputStream.read:()I
        //    39: istore_2       
        //    40: iload_2        
        //    41: iconst_m1      
        //    42: if_icmpeq       196
        //    45: iload_2        
        //    46: sipush          255
        //    49: if_icmpne       189
        //    52: aload_0        
        //    53: invokevirtual   java/io/InputStream.read:()I
        //    56: istore_2       
        //    57: iload_2        
        //    58: sipush          255
        //    61: if_icmpeq       52
        //    64: iload_2        
        //    65: iconst_m1      
        //    66: if_icmpne       76
        //    69: aload_0        
        //    70: invokevirtual   java/io/InputStream.close:()V
        //    73: goto            257
        //    76: iload_2        
        //    77: sipush          218
        //    80: if_icmpne       90
        //    83: aload_0        
        //    84: invokevirtual   java/io/InputStream.close:()V
        //    87: goto            257
        //    90: aload_0        
        //    91: invokevirtual   java/io/InputStream.read:()I
        //    94: istore_3       
        //    95: aload_0        
        //    96: invokevirtual   java/io/InputStream.read:()I
        //    99: istore          4
        //   101: iload_3        
        //   102: iconst_m1      
        //   103: if_icmpeq       182
        //   106: iload           4
        //   108: iconst_m1      
        //   109: if_icmpne       115
        //   112: goto            182
        //   115: iload_3        
        //   116: bipush          8
        //   118: ishl           
        //   119: iload           4
        //   121: ior            
        //   122: istore_3       
        //   123: iload_2        
        //   124: sipush          225
        //   127: if_icmpne       171
        //   130: new             Lmrk;
        //   133: astore          5
        //   135: aload           5
        //   137: invokespecial   mrk.<init>:()V
        //   140: aload           5
        //   142: iload_3        
        //   143: iconst_2       
        //   144: isub           
        //   145: newarray        B
        //   147: putfield        mrk.a:[B
        //   150: aload_0        
        //   151: aload           5
        //   153: getfield        mrk.a:[B
        //   156: invokestatic    com/google/common/io/ByteStreams.readFully:(Ljava/io/InputStream;[B)V
        //   159: aload_1        
        //   160: aload           5
        //   162: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   167: pop            
        //   168: goto            35
        //   171: aload_0        
        //   172: iload_3        
        //   173: iconst_2       
        //   174: isub           
        //   175: i2l            
        //   176: invokestatic    com/google/common/io/ByteStreams.skipFully:(Ljava/io/InputStream;J)V
        //   179: goto            35
        //   182: aload_0        
        //   183: invokevirtual   java/io/InputStream.close:()V
        //   186: goto            257
        //   189: aload_0        
        //   190: invokevirtual   java/io/InputStream.close:()V
        //   193: goto            257
        //   196: aload_0        
        //   197: invokevirtual   java/io/InputStream.close:()V
        //   200: goto            257
        //   203: astore_0       
        //   204: goto            257
        //   207: getstatic       mrl.a:Ljava/util/logging/Logger;
        //   210: getstatic       java/util/logging/Level.INFO:Ljava/util/logging/Level;
        //   213: ldc             "com.google.android.libraries.social.xmp.XmpUtil"
        //   215: ldc             "parse"
        //   217: ldc             "XMP parse: only JPEG file is supported"
        //   219: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   222: aload_0        
        //   223: invokevirtual   java/io/InputStream.close:()V
        //   226: goto            257
        //   229: astore          5
        //   231: goto            883
        //   234: astore          5
        //   236: getstatic       mrl.a:Ljava/util/logging/Logger;
        //   239: getstatic       java/util/logging/Level.INFO:Ljava/util/logging/Level;
        //   242: ldc             "com.google.android.libraries.social.xmp.XmpUtil"
        //   244: ldc             "parse"
        //   246: ldc             "Could not parse file."
        //   248: aload           5
        //   250: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   253: aload_0        
        //   254: invokevirtual   java/io/InputStream.close:()V
        //   257: aload_1        
        //   258: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   263: astore          6
        //   265: aload           6
        //   267: invokeinterface java/util/Iterator.hasNext:()Z
        //   272: istore          7
        //   274: iconst_0       
        //   275: istore_3       
        //   276: aconst_null    
        //   277: astore          5
        //   279: iload           7
        //   281: ifeq            433
        //   284: aload           6
        //   286: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   291: checkcast       Lmrk;
        //   294: astore_0       
        //   295: aload_0        
        //   296: getfield        mrk.a:[B
        //   299: ldc             "http://ns.adobe.com/xap/1.0/\u0000"
        //   301: invokestatic    mrl.c:([BLjava/lang/String;)Z
        //   304: ifeq            265
        //   307: aload_0        
        //   308: getfield        mrk.a:[B
        //   311: astore          6
        //   313: aload           6
        //   315: arraylength    
        //   316: iconst_1       
        //   317: isub           
        //   318: istore_2       
        //   319: iload_2        
        //   320: ifle            355
        //   323: aload           6
        //   325: iload_2        
        //   326: baload         
        //   327: bipush          62
        //   329: if_icmpne       349
        //   332: aload           6
        //   334: iload_2        
        //   335: iconst_1       
        //   336: isub           
        //   337: baload         
        //   338: bipush          63
        //   340: if_icmpeq       349
        //   343: iinc            2, 1
        //   346: goto            359
        //   349: iinc            2, -1
        //   352: goto            319
        //   355: aload           6
        //   357: arraylength    
        //   358: istore_2       
        //   359: iinc            2, -29
        //   362: iload_2        
        //   363: newarray        B
        //   365: astore          6
        //   367: aload_0        
        //   368: getfield        mrk.a:[B
        //   371: bipush          29
        //   373: aload           6
        //   375: iconst_0       
        //   376: iload_2        
        //   377: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   380: aload           6
        //   382: invokestatic    aph.b:([B)Lapf;
        //   385: astore_0       
        //   386: goto            435
        //   389: astore_0       
        //   390: getstatic       mrl.a:Ljava/util/logging/Logger;
        //   393: getstatic       java/util/logging/Level.WARNING:Ljava/util/logging/Level;
        //   396: ldc             "com.google.android.libraries.social.xmp.XmpUtil"
        //   398: ldc             "parseFirstValidXMPSection"
        //   400: ldc             "Unexpected exception when parsing XMP"
        //   402: aload_0        
        //   403: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   406: aconst_null    
        //   407: astore_0       
        //   408: goto            435
        //   411: astore_0       
        //   412: getstatic       mrl.a:Ljava/util/logging/Logger;
        //   415: getstatic       java/util/logging/Level.INFO:Ljava/util/logging/Level;
        //   418: ldc             "com.google.android.libraries.social.xmp.XmpUtil"
        //   420: ldc             "parseFirstValidXMPSection"
        //   422: ldc             "XMP parse error"
        //   424: aload_0        
        //   425: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   428: aconst_null    
        //   429: astore_0       
        //   430: goto            435
        //   433: aconst_null    
        //   434: astore_0       
        //   435: aload_0        
        //   436: ifnull          881
        //   439: aload_0        
        //   440: ldc             "http://ns.adobe.com/xmp/note/"
        //   442: ldc             "HasExtendedXMP"
        //   444: invokeinterface apf.e:(Ljava/lang/String;Ljava/lang/String;)Z
        //   449: ifeq            881
        //   452: aload_0        
        //   453: ldc             "http://ns.adobe.com/xmp/note/"
        //   455: ldc             "HasExtendedXMP"
        //   457: invokeinterface apf.a:(Ljava/lang/String;Ljava/lang/String;)Laql;
        //   462: checkcast       Lapt;
        //   465: getfield        apt.a:Ljava/lang/Object;
        //   468: checkcast       Ljava/lang/String;
        //   471: astore          8
        //   473: aload           8
        //   475: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   478: invokevirtual   java/lang/String.length:()I
        //   481: istore_2       
        //   482: new             Ljava/lang/StringBuilder;
        //   485: astore          6
        //   487: aload           6
        //   489: iload_2        
        //   490: bipush          36
        //   492: iadd           
        //   493: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   496: aload           6
        //   498: ldc             "http://ns.adobe.com/xmp/extension/\u0000"
        //   500: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   503: pop            
        //   504: aload           6
        //   506: aload           8
        //   508: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   511: pop            
        //   512: aload           6
        //   514: ldc             "\u0000"
        //   516: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   519: pop            
        //   520: aload           6
        //   522: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   525: astore          9
        //   527: new             Ljava/util/ArrayList;
        //   530: astore          6
        //   532: aload           6
        //   534: invokespecial   java/util/ArrayList.<init>:()V
        //   537: new             Ljava/util/ArrayList;
        //   540: astore          8
        //   542: aload           8
        //   544: invokespecial   java/util/ArrayList.<init>:()V
        //   547: new             Ljava/util/ArrayList;
        //   550: astore          10
        //   552: aload           10
        //   554: invokespecial   java/util/ArrayList.<init>:()V
        //   557: aload_1        
        //   558: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   563: astore_1       
        //   564: iconst_0       
        //   565: istore_2       
        //   566: aload_1        
        //   567: invokeinterface java/util/Iterator.hasNext:()Z
        //   572: ifeq            664
        //   575: aload_1        
        //   576: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   581: checkcast       Lmrk;
        //   584: astore          11
        //   586: aload           11
        //   588: getfield        mrk.a:[B
        //   591: aload           9
        //   593: invokestatic    mrl.c:([BLjava/lang/String;)Z
        //   596: ifeq            566
        //   599: aload           9
        //   601: invokevirtual   java/lang/String.length:()I
        //   604: bipush          7
        //   606: iadd           
        //   607: istore          4
        //   609: aload           11
        //   611: getfield        mrk.a:[B
        //   614: arraylength    
        //   615: istore          12
        //   617: iload_2        
        //   618: iload           12
        //   620: iload           4
        //   622: isub           
        //   623: iadd           
        //   624: istore_2       
        //   625: aload           6
        //   627: aload           11
        //   629: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   634: pop            
        //   635: aload           8
        //   637: iload           4
        //   639: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   642: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   647: pop            
        //   648: aload           10
        //   650: iload           12
        //   652: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   655: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   660: pop            
        //   661: goto            566
        //   664: iload_2        
        //   665: newarray        B
        //   667: astore          9
        //   669: iconst_0       
        //   670: istore          4
        //   672: iload_3        
        //   673: istore_2       
        //   674: iload           4
        //   676: istore_3       
        //   677: iload_2        
        //   678: aload           6
        //   680: invokeinterface java/util/List.size:()I
        //   685: if_icmpge       760
        //   688: aload           6
        //   690: iload_2        
        //   691: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   696: checkcast       Lmrk;
        //   699: astore_1       
        //   700: aload           8
        //   702: iload_2        
        //   703: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   708: checkcast       Ljava/lang/Integer;
        //   711: invokevirtual   java/lang/Integer.intValue:()I
        //   714: istore          12
        //   716: aload           10
        //   718: iload_2        
        //   719: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   724: checkcast       Ljava/lang/Integer;
        //   727: invokevirtual   java/lang/Integer.intValue:()I
        //   730: iload           12
        //   732: isub           
        //   733: istore          4
        //   735: aload_1        
        //   736: getfield        mrk.a:[B
        //   739: iload           12
        //   741: aload           9
        //   743: iload_3        
        //   744: iload           4
        //   746: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   749: iload_3        
        //   750: iload           4
        //   752: iadd           
        //   753: istore_3       
        //   754: iinc            2, 1
        //   757: goto            677
        //   760: aload           9
        //   762: invokestatic    aph.b:([B)Lapf;
        //   765: astore_1       
        //   766: aload_1        
        //   767: astore          5
        //   769: goto            809
        //   772: astore_1       
        //   773: getstatic       mrl.a:Ljava/util/logging/Logger;
        //   776: getstatic       java/util/logging/Level.WARNING:Ljava/util/logging/Level;
        //   779: ldc             "com.google.android.libraries.social.xmp.XmpUtil"
        //   781: ldc             "parseExtendedXMPSections"
        //   783: ldc             "Unexpected exception when parsing extended XMP"
        //   785: aload_1        
        //   786: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   789: goto            809
        //   792: astore_1       
        //   793: getstatic       mrl.a:Ljava/util/logging/Logger;
        //   796: getstatic       java/util/logging/Level.INFO:Ljava/util/logging/Level;
        //   799: ldc             "com.google.android.libraries.social.xmp.XmpUtil"
        //   801: ldc             "parseExtendedXMPSections"
        //   803: ldc             "Extended XMP parse error"
        //   805: aload_1        
        //   806: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   809: aload           5
        //   811: ifnull          881
        //   814: aload           5
        //   816: invokeinterface apf.f:()Laps;
        //   821: astore_1       
        //   822: aload_1        
        //   823: invokevirtual   aps.next:()Ljava/lang/Object;
        //   826: checkcast       Lapp;
        //   829: astore          6
        //   831: aload           6
        //   833: getfield        app.b:Ljava/lang/String;
        //   836: astore          5
        //   838: aload           5
        //   840: ifnull          822
        //   843: aload_0        
        //   844: aload           6
        //   846: getfield        app.a:Ljava/lang/String;
        //   849: aload           5
        //   851: aload           6
        //   853: getfield        app.c:Ljava/lang/Object;
        //   856: aload           6
        //   858: invokevirtual   app.a:()Laqj;
        //   861: invokeinterface apf.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Laqj;)V
        //   866: goto            822
        //   869: astore          5
        //   871: goto            881
        //   874: astore          5
        //   876: aload           5
        //   878: invokevirtual   ape.printStackTrace:()V
        //   881: aload_0        
        //   882: areturn        
        //   883: aload_0        
        //   884: invokevirtual   java/io/InputStream.close:()V
        //   887: goto            891
        //   890: astore_0       
        //   891: goto            897
        //   894: aload           5
        //   896: athrow         
        //   897: goto            894
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  15     35     234    257    Ljava/io/IOException;
        //  15     35     229    900    Any
        //  35     40     234    257    Ljava/io/IOException;
        //  35     40     229    900    Any
        //  52     57     234    257    Ljava/io/IOException;
        //  52     57     229    900    Any
        //  69     73     203    207    Ljava/io/IOException;
        //  83     87     203    207    Ljava/io/IOException;
        //  90     101    234    257    Ljava/io/IOException;
        //  90     101    229    900    Any
        //  130    168    234    257    Ljava/io/IOException;
        //  130    168    229    900    Any
        //  171    179    234    257    Ljava/io/IOException;
        //  171    179    229    900    Any
        //  182    186    203    207    Ljava/io/IOException;
        //  189    193    203    207    Ljava/io/IOException;
        //  196    200    203    207    Ljava/io/IOException;
        //  207    222    234    257    Ljava/io/IOException;
        //  207    222    229    900    Any
        //  222    226    203    207    Ljava/io/IOException;
        //  236    253    229    900    Any
        //  253    257    203    207    Ljava/io/IOException;
        //  380    386    411    433    Lape;
        //  380    386    389    411    Ljava/lang/RuntimeException;
        //  452    564    874    881    Lape;
        //  566    617    874    881    Lape;
        //  625    661    874    881    Lape;
        //  664    669    874    881    Lape;
        //  677    749    874    881    Lape;
        //  760    766    792    809    Lape;
        //  760    766    772    792    Ljava/lang/RuntimeException;
        //  773    789    874    881    Lape;
        //  793    809    874    881    Lape;
        //  814    822    869    874    Ljava/lang/Exception;
        //  822    838    869    874    Ljava/lang/Exception;
        //  843    866    869    874    Ljava/lang/Exception;
        //  883    887    890    891    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 418, Size: 418
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
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
    
    public static apf b(String s) {
        try {
            return a(new FileInputStream(s));
        }
        catch (final FileNotFoundException ex) {
            final Logger a = mrl.a;
            final Level severe = Level.SEVERE;
            s = String.valueOf(s);
            if (s.length() != 0) {
                s = "Could not read file: ".concat(s);
            }
            else {
                s = new String("Could not read file: ");
            }
            a.logp(severe, "com.google.android.libraries.social.xmp.XmpUtil", "extractXMPMeta", s, ex);
            return null;
        }
    }
    
    private static boolean c(final byte[] array, final String s) {
        if (array.length < s.length()) {
            return false;
        }
        try {
            final byte[] array2 = new byte[s.length()];
            System.arraycopy(array, 0, array2, 0, s.length());
            return new String(array2, "UTF-8").equals(s);
        }
        catch (final UnsupportedEncodingException ex) {
            return false;
        }
    }
}
