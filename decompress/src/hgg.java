import java.io.File;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgg
{
    public static final nsd a;
    private static final njp d;
    public final cxl b;
    public final Executor c;
    private final File e;
    private final File f;
    private final hif g;
    private final eyt h;
    
    static {
        a = nsd.g("com/google/android/apps/camera/session/InflightFallbackSaver");
        d = nov.F(fdh.e);
    }
    
    public hgg(final File file, final hif g, final cxl b, final eyt h, final Executor c) {
        this.e = new File(file, "inflight");
        this.f = new File(file, "inflight-mars");
        this.g = g;
        this.b = b;
        this.h = h;
        this.c = c;
    }
    
    public final void a(final hhy hhy) {
        File file;
        if (hhy.j() == hip.b) {
            file = this.f;
        }
        else {
            file = this.e;
        }
        final long d = hhy.d();
        final StringBuilder sb = new StringBuilder(31);
        sb.append("medres-");
        sb.append(d);
        sb.append(".jpg");
        hhy.u(new hgf(this, new File(file, sb.toString()), hhy));
    }
    
    public final void b(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifeq            12
        //     4: aload_0        
        //     5: getfield        hgg.f:Ljava/io/File;
        //     8: astore_2       
        //     9: goto            17
        //    12: aload_0        
        //    13: getfield        hgg.e:Ljava/io/File;
        //    16: astore_2       
        //    17: aload_2        
        //    18: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    21: pop            
        //    22: aload_2        
        //    23: invokevirtual   java/io/File.isDirectory:()Z
        //    26: ifne            30
        //    29: return         
        //    30: aload_2        
        //    31: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    34: astore_3       
        //    35: aload_3        
        //    36: ifnonnull       40
        //    39: return         
        //    40: aload_3        
        //    41: arraylength    
        //    42: istore          4
        //    44: iconst_0       
        //    45: istore          5
        //    47: iload           5
        //    49: iload           4
        //    51: if_icmpge       673
        //    54: aload_3        
        //    55: iload           5
        //    57: aaload         
        //    58: astore          6
        //    60: aload           6
        //    62: invokevirtual   java/io/File.length:()J
        //    65: lconst_0       
        //    66: lcmp           
        //    67: ifne            141
        //    70: getstatic       hgg.a:Lnsd;
        //    73: invokevirtual   nry.b:()Lnsu;
        //    76: checkcast       Lnsa;
        //    79: sipush          2298
        //    82: invokeinterface nsa.E:(I)Lnsu;
        //    87: checkcast       Lnsa;
        //    90: ldc             "Failed to restore empty file: %s"
        //    92: aload           6
        //    94: invokeinterface nsa.r:(Ljava/lang/String;Ljava/lang/Object;)V
        //    99: aload           6
        //   101: invokevirtual   java/io/File.delete:()Z
        //   104: pop            
        //   105: goto            544
        //   108: astore_2       
        //   109: getstatic       hgg.a:Lnsd;
        //   112: invokevirtual   nry.b:()Lnsu;
        //   115: astore          7
        //   117: sipush          2299
        //   120: istore          8
        //   122: iload           8
        //   124: istore          9
        //   126: aload           7
        //   128: ldc             "Failed to delete fallback file %s"
        //   130: aload           6
        //   132: iload           9
        //   134: aload_2        
        //   135: invokestatic    a.n:(Lnsu;Ljava/lang/String;Ljava/lang/Object;CLjava/lang/Throwable;)V
        //   138: goto            544
        //   141: getstatic       hgg.d:Lnjp;
        //   144: invokeinterface njp.a:()Ljava/lang/Object;
        //   149: checkcast       Ljava/util/regex/Pattern;
        //   152: aload           6
        //   154: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   157: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   160: astore_2       
        //   161: aload_2        
        //   162: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   165: ifne            218
        //   168: new             Ljava/io/IOException;
        //   171: astore          7
        //   173: aload           6
        //   175: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   178: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   181: astore_2       
        //   182: aload_2        
        //   183: invokevirtual   java/lang/String.length:()I
        //   186: ifeq            199
        //   189: ldc             "Unknown fallback file format: "
        //   191: aload_2        
        //   192: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   195: astore_2       
        //   196: goto            209
        //   199: new             Ljava/lang/String;
        //   202: dup            
        //   203: ldc             "Unknown fallback file format: "
        //   205: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   208: astore_2       
        //   209: aload           7
        //   211: aload_2        
        //   212: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   215: aload           7
        //   217: athrow         
        //   218: aload_2        
        //   219: iconst_1       
        //   220: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   223: astore_2       
        //   224: aload_2        
        //   225: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   228: pop            
        //   229: aload_2        
        //   230: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   233: lstore          10
        //   235: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   238: invokestatic    java/lang/System.currentTimeMillis:()J
        //   241: lload           10
        //   243: lsub           
        //   244: getstatic       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //   247: invokevirtual   java/util/concurrent/TimeUnit.convert:(JLjava/util/concurrent/TimeUnit;)J
        //   250: lstore          12
        //   252: aload_0        
        //   253: getfield        hgg.b:Lcxl;
        //   256: astore          7
        //   258: getstatic       cxr.a:Lcxo;
        //   261: astore_2       
        //   262: aload           7
        //   264: invokeinterface cxl.e:()V
        //   269: aload_0        
        //   270: getfield        hgg.g:Lhif;
        //   273: astore          7
        //   275: iload_1        
        //   276: ifeq            286
        //   279: getstatic       hip.b:Lhip;
        //   282: astore_2       
        //   283: goto            290
        //   286: getstatic       hip.a:Lhip;
        //   289: astore_2       
        //   290: getstatic       drk.a:Ldrk;
        //   293: astore          14
        //   295: new             Ljava/lang/String;
        //   298: astore          15
        //   300: aload           15
        //   302: ldc             "RESTORED"
        //   304: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   307: aload           7
        //   309: lload           10
        //   311: aload           14
        //   313: aload           15
        //   315: aload_2        
        //   316: invokevirtual   hif.b:(JLdrk;Ljava/lang/String;Lhip;)Lhie;
        //   319: astore          14
        //   321: aload           14
        //   323: ldc             "jpg"
        //   325: invokevirtual   hie.a:(Ljava/lang/String;)Lhia;
        //   328: astore          7
        //   330: new             Ljava/io/FileInputStream;
        //   333: astore_2       
        //   334: aload_2        
        //   335: aload           6
        //   337: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   340: aload           7
        //   342: getfield        hia.a:Llkb;
        //   345: invokeinterface lkb.e:()Ljava/io/FileOutputStream;
        //   350: astore          15
        //   352: aload_2        
        //   353: aload           15
        //   355: invokestatic    com/google/common/io/ByteStreams.copy:(Ljava/io/InputStream;Ljava/io/OutputStream;)J
        //   358: lstore          10
        //   360: lload           10
        //   362: lconst_0       
        //   363: lcmp           
        //   364: ifeq            550
        //   367: aload           15
        //   369: invokevirtual   java/io/FileOutputStream.close:()V
        //   372: aload_2        
        //   373: invokevirtual   java/io/FileInputStream.close:()V
        //   376: aload           7
        //   378: invokevirtual   hia.c:()V
        //   381: aload           14
        //   383: invokevirtual   hie.g:()V
        //   386: getstatic       hgg.a:Lnsd;
        //   389: invokevirtual   nry.c:()Lnsu;
        //   392: checkcast       Lnsa;
        //   395: sipush          2294
        //   398: invokeinterface nsa.E:(I)Lnsu;
        //   403: checkcast       Lnsa;
        //   406: ldc_w           "Restored %s"
        //   409: aload           7
        //   411: getfield        hia.a:Llkb;
        //   414: invokeinterface lkb.b:()Landroid/net/Uri;
        //   419: invokeinterface nsa.r:(Ljava/lang/String;Ljava/lang/Object;)V
        //   424: aload_0        
        //   425: getfield        hgg.h:Leyt;
        //   428: astore          15
        //   430: getstatic       nzm.d:Lnzm;
        //   433: invokevirtual   oky.m:()Lokt;
        //   436: astore          16
        //   438: aload           16
        //   440: getfield        okt.c:Z
        //   443: ifeq            457
        //   446: aload           16
        //   448: invokevirtual   okt.m:()V
        //   451: aload           16
        //   453: iconst_0       
        //   454: putfield        okt.c:Z
        //   457: aload           16
        //   459: getfield        okt.b:Loky;
        //   462: checkcast       Lnzm;
        //   465: astore_2       
        //   466: aload_2        
        //   467: getfield        nzm.a:I
        //   470: iconst_1       
        //   471: ior            
        //   472: istore          8
        //   474: aload_2        
        //   475: iload           8
        //   477: putfield        nzm.a:I
        //   480: aload_2        
        //   481: lload           12
        //   483: putfield        nzm.b:J
        //   486: aload_2        
        //   487: iconst_1       
        //   488: putfield        nzm.c:I
        //   491: aload_2        
        //   492: iload           8
        //   494: iconst_2       
        //   495: ior            
        //   496: putfield        nzm.a:I
        //   499: aload           15
        //   501: aload           16
        //   503: invokevirtual   okt.h:()Loky;
        //   506: checkcast       Lnzm;
        //   509: invokeinterface eyt.g:(Lnzm;)V
        //   514: aload           6
        //   516: invokevirtual   java/io/File.delete:()Z
        //   519: pop            
        //   520: goto            544
        //   523: astore_2       
        //   524: getstatic       hgg.a:Lnsd;
        //   527: invokevirtual   nry.b:()Lnsu;
        //   530: astore          7
        //   532: sipush          2295
        //   535: istore          8
        //   537: iload           8
        //   539: istore          9
        //   541: goto            126
        //   544: iinc            5, 1
        //   547: goto            47
        //   550: new             Ljava/io/IOException;
        //   553: astore_3       
        //   554: aload_3        
        //   555: ldc_w           "Copy returned 0 bytes"
        //   558: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   561: aload_3        
        //   562: athrow         
        //   563: astore_3       
        //   564: aload           15
        //   566: invokevirtual   java/io/FileOutputStream.close:()V
        //   569: goto            580
        //   572: astore          15
        //   574: aload_3        
        //   575: aload           15
        //   577: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   580: aload_3        
        //   581: athrow         
        //   582: astore_3       
        //   583: aload_2        
        //   584: invokevirtual   java/io/FileInputStream.close:()V
        //   587: goto            596
        //   590: astore_2       
        //   591: aload_3        
        //   592: aload_2        
        //   593: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   596: aload_3        
        //   597: athrow         
        //   598: astore_2       
        //   599: goto            621
        //   602: astore_2       
        //   603: aconst_null    
        //   604: astore          7
        //   606: goto            621
        //   609: astore          7
        //   611: goto            643
        //   614: astore_2       
        //   615: aconst_null    
        //   616: astore          7
        //   618: aconst_null    
        //   619: astore          14
        //   621: aload           7
        //   623: ifnull          631
        //   626: aload           7
        //   628: invokevirtual   hia.b:()V
        //   631: aload           14
        //   633: ifnull          641
        //   636: aload           14
        //   638: invokevirtual   hie.d:()V
        //   641: aload_2        
        //   642: athrow         
        //   643: aload           6
        //   645: invokevirtual   java/io/File.delete:()Z
        //   648: pop            
        //   649: goto            670
        //   652: astore_2       
        //   653: getstatic       hgg.a:Lnsd;
        //   656: invokevirtual   nry.b:()Lnsu;
        //   659: ldc             "Failed to delete fallback file %s"
        //   661: aload           6
        //   663: sipush          2296
        //   666: aload_2        
        //   667: invokestatic    a.n:(Lnsu;Ljava/lang/String;Ljava/lang/Object;CLjava/lang/Throwable;)V
        //   670: aload           7
        //   672: athrow         
        //   673: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  60     99     614    621    Ljava/io/IOException;
        //  60     99     609    673    Any
        //  99     105    108    126    Ljava/lang/Exception;
        //  141    196    614    621    Ljava/io/IOException;
        //  141    196    609    673    Any
        //  199    209    614    621    Ljava/io/IOException;
        //  199    209    609    673    Any
        //  209    218    614    621    Ljava/io/IOException;
        //  209    218    609    673    Any
        //  218    275    614    621    Ljava/io/IOException;
        //  218    275    609    673    Any
        //  279    283    614    621    Ljava/io/IOException;
        //  279    283    609    673    Any
        //  286    290    614    621    Ljava/io/IOException;
        //  286    290    609    673    Any
        //  290    321    614    621    Ljava/io/IOException;
        //  290    321    609    673    Any
        //  321    330    602    609    Ljava/io/IOException;
        //  321    330    609    673    Any
        //  330    340    598    602    Ljava/io/IOException;
        //  330    340    609    673    Any
        //  340    352    582    598    Any
        //  352    360    563    582    Any
        //  367    372    582    598    Any
        //  372    457    598    602    Ljava/io/IOException;
        //  372    457    609    673    Any
        //  457    514    598    602    Ljava/io/IOException;
        //  457    514    609    673    Any
        //  514    520    523    544    Ljava/lang/Exception;
        //  550    563    563    582    Any
        //  564    569    572    580    Any
        //  574    580    582    598    Any
        //  580    582    582    598    Any
        //  583    587    590    596    Any
        //  591    596    598    602    Ljava/io/IOException;
        //  591    596    609    673    Any
        //  596    598    598    602    Ljava/io/IOException;
        //  596    598    609    673    Any
        //  626    631    609    673    Any
        //  636    641    609    673    Any
        //  641    643    609    673    Any
        //  643    649    652    670    Ljava/lang/Exception;
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
