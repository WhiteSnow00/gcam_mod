import java.util.concurrent.Executor;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;
import android.content.Context;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mqo
{
    private static volatile Map b;
    private static final Object c;
    private static volatile mtc d;
    private static final Object e;
    private static final mub f;
    
    static {
        mqo.b = null;
        c = new Object();
        mqo.d = null;
        e = new Object();
        f = new mub(mqp.h);
    }
    
    public static mqp a(final mok mok) {
        final okt m = mqp.h.m();
        if (mok == null) {
            return (mqp)m.h();
        }
        for (final mol mol : mok.e) {
            final okt i = mqq.e.m();
            final String d = mol.d;
            if (i.c) {
                i.m();
                i.c = false;
            }
            final mqq mqq = (mqq)i.b;
            d.getClass();
            mqq.a |= 0x1;
            mqq.d = d;
            final int b = mol.b;
            int n = 0;
            switch (b) {
                default: {
                    n = 0;
                    break;
                }
                case 5: {
                    n = 5;
                    break;
                }
                case 4: {
                    n = 4;
                    break;
                }
                case 3: {
                    n = 3;
                    break;
                }
                case 2: {
                    n = 2;
                    break;
                }
                case 1: {
                    n = 1;
                    break;
                }
                case 0: {
                    n = 6;
                    break;
                }
            }
            if (n == 0) {
                throw null;
            }
            switch (n - 1) {
                default: {
                    throw new IllegalStateException("No known flag type");
                }
                case 4: {
                    ojw b2;
                    if (b == 5) {
                        b2 = (ojw)mol.c;
                    }
                    else {
                        b2 = ojw.b;
                    }
                    if (i.c) {
                        i.m();
                        i.c = false;
                    }
                    final mqq mqq2 = (mqq)i.b;
                    b2.getClass();
                    mqq2.b = 6;
                    mqq2.c = b2;
                    break;
                }
                case 3: {
                    String c;
                    if (b == 4) {
                        c = (String)mol.c;
                    }
                    else {
                        c = "";
                    }
                    c.getClass();
                    mqq.b = 5;
                    mqq.c = c;
                    break;
                }
                case 2: {
                    double doubleValue;
                    if (b == 3) {
                        doubleValue = (double)mol.c;
                    }
                    else {
                        doubleValue = 0.0;
                    }
                    if (i.c) {
                        i.m();
                        i.c = false;
                    }
                    final mqq mqq3 = (mqq)i.b;
                    mqq3.b = 4;
                    mqq3.c = doubleValue;
                    break;
                }
                case 1: {
                    final boolean b3 = b == 2 && (boolean)mol.c;
                    if (i.c) {
                        i.m();
                        i.c = false;
                    }
                    final mqq mqq4 = (mqq)i.b;
                    mqq4.b = 3;
                    mqq4.c = b3;
                    break;
                }
                case 0: {
                    long longValue;
                    if (b == 1) {
                        longValue = (long)mol.c;
                    }
                    else {
                        longValue = 0L;
                    }
                    if (i.c) {
                        i.m();
                        i.c = false;
                    }
                    final mqq mqq5 = (mqq)i.b;
                    mqq5.b = 2;
                    mqq5.c = longValue;
                    break;
                }
            }
            final mqq mqq6 = (mqq)i.h();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final mqp mqp = (mqp)m.b;
            mqq6.getClass();
            mqp.b();
            mqp.g.add(mqq6);
        }
        final String d2 = mok.d;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final mqp mqp2 = (mqp)m.b;
        d2.getClass();
        final int a = 0x4 | mqp2.a;
        mqp2.a = a;
        mqp2.d = d2;
        final String b4 = mok.b;
        b4.getClass();
        final boolean a2 = (0x1 | a) != 0x0;
        mqp2.a = (a2 ? 1 : 0);
        mqp2.b = b4;
        final long h = mok.h;
        final int a3 = (a2 ? 1 : 0) | 0x8;
        mqp2.a = a3;
        mqp2.e = h;
        if ((mok.a & 0x2) != 0x0) {
            final ojw c2 = mok.c;
            c2.getClass();
            mqp2.a = (a3 | 0x2);
            mqp2.c = c2;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final mqp mqp3 = (mqp)m.b;
        mqp3.a |= 0x10;
        mqp3.f = currentTimeMillis;
        return (mqp)m.h();
    }
    
    static mtc b(final Context context, final ofb a) {
        Object b;
        if ((b = mqo.d) == null) {
            synchronized (mqo.e) {
                b = mqo.d;
                Object o;
                if (b == null) {
                    b = new mrs(Collections.singletonList(new mrv(new mru(context))));
                    final mtd mtd = new mtd();
                    mtd.a = a;
                    mtd.b = (mrs)b;
                    final mtx a2 = mtk.a;
                    njo.i(mtd.c.containsKey("singleproc") ^ true, "There is already a factory registered for the ID %s", "singleproc");
                    mtd.c.put("singleproc", a2);
                    o = (mqo.d = new mtc(mtd.a, mtd.b, mtd.d, mtd.c));
                }
                else {
                    o = b;
                }
                monitorexit(mqo.e);
                b = o;
            }
        }
        return (mtc)b;
    }
    
    static nnx c(final mqp mqp) {
        final HashMap h = nqb.h(mqp.g.size() + 3);
        for (final mqq mqq : mqp.g) {
            final int b = mqq.b;
            boolean booleanValue = false;
            int n = 0;
            switch (b) {
                default: {
                    n = 0;
                    break;
                }
                case 6: {
                    n = 5;
                    break;
                }
                case 5: {
                    n = 4;
                    break;
                }
                case 4: {
                    n = 3;
                    break;
                }
                case 3: {
                    n = 2;
                    break;
                }
                case 2: {
                    n = 1;
                    break;
                }
                case 0: {
                    n = 6;
                    break;
                }
            }
            if (n == 0) {
                throw null;
            }
            switch (n - 1) {
                default: {
                    continue;
                }
                case 4: {
                    final String d = mqq.d;
                    ojw b2;
                    if (b == 6) {
                        b2 = (ojw)mqq.c;
                    }
                    else {
                        b2 = ojw.b;
                    }
                    h.put(d, b2.B());
                    continue;
                }
                case 3: {
                    final String d2 = mqq.d;
                    String s;
                    if (b == 5) {
                        s = (String)mqq.c;
                    }
                    else {
                        s = "";
                    }
                    h.put(d2, s);
                    continue;
                }
                case 2: {
                    final String d3 = mqq.d;
                    double doubleValue;
                    if (b == 4) {
                        doubleValue = (double)mqq.c;
                    }
                    else {
                        doubleValue = 0.0;
                    }
                    h.put(d3, doubleValue);
                    continue;
                }
                case 1: {
                    final String d4 = mqq.d;
                    if (b == 3) {
                        booleanValue = (boolean)mqq.c;
                    }
                    h.put(d4, booleanValue);
                    continue;
                }
                case 0: {
                    final String d5 = mqq.d;
                    long longValue;
                    if (b == 2) {
                        longValue = (long)mqq.c;
                    }
                    else {
                        longValue = 0L;
                    }
                    h.put(d5, longValue);
                    continue;
                }
            }
        }
        h.put("__phenotype_server_token", mqp.d);
        h.put("__phenotype_snapshot_token", mqp.b);
        h.put("__phenotype_configuration_version", mqp.e);
        return nnx.n(h);
    }
    
    static oey d(final mny mny, final String s, final String s2) {
        return odg.h(mny.c().b(s, s2), mcj.g, mny.b());
    }
    
    public static oey e(final mny mny, final String s, final String s2, final mqp mqp, final boolean b) {
        return g(mny, s, s2, b).b(new mqn(mqp), mny.b());
    }
    
    public static Map f(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_1       
        //     4: aload_1        
        //     5: astore_2       
        //     6: aload_1        
        //     7: ifnonnull       274
        //    10: getstatic       mqo.c:Ljava/lang/Object;
        //    13: astore_1       
        //    14: aload_1        
        //    15: monitorenter   
        //    16: getstatic       mqo.b:Ljava/util/Map;
        //    19: astore_2       
        //    20: aload_2        
        //    21: ifnonnull       260
        //    24: invokestatic    nnx.l:()Lnnt;
        //    27: astore_3       
        //    28: aload_0        
        //    29: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //    32: ldc_w           "phenotype"
        //    35: invokevirtual   android/content/res/AssetManager.list:(Ljava/lang/String;)[Ljava/lang/String;
        //    38: astore          4
        //    40: aload           4
        //    42: arraylength    
        //    43: istore          5
        //    45: iconst_0       
        //    46: istore          6
        //    48: iload           6
        //    50: iload           5
        //    52: if_icmpge       248
        //    55: aload           4
        //    57: iload           6
        //    59: aaload         
        //    60: astore          7
        //    62: aload_0        
        //    63: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //    66: astore          8
        //    68: aload           7
        //    70: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    73: astore_2       
        //    74: aload_2        
        //    75: invokevirtual   java/lang/String.length:()I
        //    78: ifeq            92
        //    81: ldc_w           "phenotype/"
        //    84: aload_2        
        //    85: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    88: astore_2       
        //    89: goto            103
        //    92: new             Ljava/lang/String;
        //    95: dup            
        //    96: ldc_w           "phenotype/"
        //    99: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   102: astore_2       
        //   103: aload           8
        //   105: aload_2        
        //   106: invokevirtual   android/content/res/AssetManager.open:(Ljava/lang/String;)Ljava/io/InputStream;
        //   109: astore_2       
        //   110: new             Lmpj;
        //   113: astore          9
        //   115: invokestatic    okm.b:()Lokm;
        //   118: astore          8
        //   120: aload           9
        //   122: aload_0        
        //   123: getstatic       mpk.g:Lmpk;
        //   126: aload_2        
        //   127: aload           8
        //   129: invokestatic    oky.r:(Loky;Ljava/io/InputStream;Lokm;)Loky;
        //   132: checkcast       Lmpk;
        //   135: invokespecial   mpj.<init>:(Landroid/content/Context;Lmpk;)V
        //   138: aload_3        
        //   139: aload           9
        //   141: getfield        mpj.a:Ljava/lang/String;
        //   144: aload           9
        //   146: invokevirtual   nnt.d:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   149: aload_2        
        //   150: ifnull          230
        //   153: aload_2        
        //   154: invokevirtual   java/io/InputStream.close:()V
        //   157: goto            230
        //   160: astore          8
        //   162: aload_2        
        //   163: ifnull          180
        //   166: aload_2        
        //   167: invokevirtual   java/io/InputStream.close:()V
        //   170: goto            180
        //   173: astore_2       
        //   174: aload           8
        //   176: aload_2        
        //   177: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   180: aload           8
        //   182: athrow         
        //   183: astore          8
        //   185: aload           7
        //   187: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   190: astore_2       
        //   191: aload_2        
        //   192: invokevirtual   java/lang/String.length:()I
        //   195: ifeq            209
        //   198: ldc_w           "Unable to read Phenotype PackageMetadata for "
        //   201: aload_2        
        //   202: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   205: astore_2       
        //   206: goto            220
        //   209: new             Ljava/lang/String;
        //   212: dup            
        //   213: ldc_w           "Unable to read Phenotype PackageMetadata for "
        //   216: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   219: astore_2       
        //   220: ldc_w           "SnapshotHandler"
        //   223: aload_2        
        //   224: aload           8
        //   226: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   229: pop            
        //   230: iinc            6, 1
        //   233: goto            48
        //   236: astore_0       
        //   237: ldc_w           "SnapshotHandler"
        //   240: ldc_w           "Unable to read Phenotype PackageMetadata from assets."
        //   243: aload_0        
        //   244: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   247: pop            
        //   248: aload_3        
        //   249: invokevirtual   nnt.b:()Lnnx;
        //   252: astore_0       
        //   253: aload_0        
        //   254: putstatic       mqo.b:Ljava/util/Map;
        //   257: goto            262
        //   260: aload_2        
        //   261: astore_0       
        //   262: aload_1        
        //   263: monitorexit    
        //   264: aload_0        
        //   265: astore_2       
        //   266: goto            274
        //   269: astore_0       
        //   270: aload_1        
        //   271: monitorexit    
        //   272: aload_0        
        //   273: athrow         
        //   274: aload_2        
        //   275: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  16     20     269    274    Any
        //  24     28     269    274    Any
        //  28     45     236    248    Ljava/io/IOException;
        //  28     45     269    274    Any
        //  62     89     183    230    Lolm;
        //  62     89     236    248    Ljava/io/IOException;
        //  62     89     269    274    Any
        //  92     103    183    230    Lolm;
        //  92     103    236    248    Ljava/io/IOException;
        //  92     103    269    274    Any
        //  103    110    183    230    Lolm;
        //  103    110    236    248    Ljava/io/IOException;
        //  103    110    269    274    Any
        //  110    149    160    183    Any
        //  153    157    183    230    Lolm;
        //  153    157    236    248    Ljava/io/IOException;
        //  153    157    269    274    Any
        //  166    170    173    180    Any
        //  174    180    183    230    Lolm;
        //  174    180    236    248    Ljava/io/IOException;
        //  174    180    269    274    Any
        //  180    183    183    230    Lolm;
        //  180    183    236    248    Ljava/io/IOException;
        //  180    183    269    274    Any
        //  185    206    236    248    Ljava/io/IOException;
        //  185    206    269    274    Any
        //  209    220    236    248    Ljava/io/IOException;
        //  209    220    269    274    Any
        //  220    230    236    248    Ljava/io/IOException;
        //  220    230    269    274    Any
        //  237    248    269    274    Any
        //  248    257    269    274    Any
        //  262    264    269    274    Any
        //  270    272    269    274    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0209:
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
    
    static mtv g(final mny mny, final String s, final String s2, final boolean b) {
        final mta a = mtb.a();
        final mrw a2 = mrx.a(mny.e);
        a2.b();
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 3 + String.valueOf(s2).length());
        sb.append(s);
        sb.append(s2);
        sb.append(".pb");
        a2.c(sb.toString());
        if (b) {
            final int a3 = loq.a;
            mug.c(mrx.d.contains("directboot-files"), "The only supported locations are %s: %s", mrx.d, "directboot-files");
            a2.a = "directboot-files";
        }
        a.e(a2.a());
        a.d(mqp.h);
        a.c(mqo.f);
        a.b();
        return b(mny.e, mny.b()).a(a.a());
    }
}
