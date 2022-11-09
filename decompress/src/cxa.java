import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxa
{
    public cxa() {
        Collections.emptyList();
        Collections.emptyList();
    }
    
    public static void a(final cxp cxp, final cxl cxl, final liz liz, final cyn cyn) {
        cxp.m(cwt.e, 1.3229325E7f);
        cxp.m(cwt.f, 3.807744E7f);
        cxp.n(cxr.W, "Pixel-2H19-Droidfood-Discuss@google.com");
        cxp.n(cxr.X, "Pixel-2H19-Dogfood-Discuss@google.com");
        final cxm z = cxr.Z;
        final cyv cyv = (cyv)cxp;
        cyv.s(z, true);
        cyv.s(cxr.ao, true);
        cyv.s(cxr.aO, false);
        cyv.s(cxr.aN, true);
        cyv.s(cxr.H, liz.f);
        cyv.s(cxr.aR, true);
        cxp.l(cxr.k, 1000);
        cxp.l(cxr.o, 60);
        cyv.s(cxr.aa, false);
        cyv.s(cxr.ag, cyn == cyn.d || cyn == cyn.c);
        final cxo c = cxr.c;
        final Integer value = 2;
        cxp.l(c, value);
        cyv.s(cxr.aV, true);
        cyv.s(cxk.f, true);
        cyv.s(cxj.a, true);
        cyv.s(cwv.D, true);
        cyv.s(cwv.F, true);
        cyv.s(cwv.N, true);
        cyv.s(cwv.J, true);
        cyv.s(cwv.Q, true);
        cyv.s(cwv.R, true);
        cyv.s(cwv.S, true);
        cyv.s(cwv.U, true);
        cyv.s(cww.f, true);
        cyv.s(cww.g, true);
        cyv.s(cxs.L, true);
        cyn.b(cyn.c);
        cyv.s(cxs.A, false);
        cyv.s(cxs.T, true);
        cxp.l(cxs.c, value);
        cxp.l(cxs.a, 3);
        final cxo a = cxy.a;
        cyn.b(cyn.a);
        cyv.s(cxz.j, true);
        cyv.s(cxs.W, true);
        cyv.s(cxs.X, true);
        cyv.s(cxs.ae, true);
        cyv.s(cxs.ad, true);
        cyv.s(cxs.I, true);
        cyv.s(cxs.H, true);
        cyv.s(cyc.A, true);
        cyv.s(cxu.i, true);
        cyv.s(cxu.f, true);
        cyv.s(cxu.g, true);
        cyv.s(cxu.h, true);
        cxp.m(cxv.b, 2.948064E7f);
        cxp.m(cxv.c, 2.380845E7f);
        cyv.s(cxv.e, false);
        cyv.q(cxw.f, false);
        cyv.s(cxw.q, true);
        cyv.s(cxw.j, false);
        cyv.s(cxw.k, true);
        cyv.s(cxx.J, true);
        cyv.s(cxx.I, true);
        cyv.s(cxx.n, true);
        cxp.l(cxz.b, (int)cxl.a(cxz.c).c() * 4);
        cxp.l(cxz.a, 500);
        cyv.s(cyc.u, false);
        cyv.s(cyc.t, true);
        cyv.s(cyc.B, true);
        cxp.l(cyc.c, 2328);
        cxp.l(cyc.d, 1746);
        cxp.l(cyc.e, value);
        cyv.s(cyc.z, true);
        cyv.s(cyd.c, true);
        cxp.l(cyd.a, 1);
        cyv.s(cxr.R, true);
        cyv.s(cxr.T, true);
        final int a2 = cym.a;
    }
    
    public static aip b(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   aip.<init>:()V
        //     7: astore_1       
        //     8: aload_0        
        //     9: ifnonnull       14
        //    12: aload_1        
        //    13: areturn        
        //    14: new             Ljava/io/ByteArrayInputStream;
        //    17: dup            
        //    18: aload_0        
        //    19: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //    22: astore_2       
        //    23: aconst_null    
        //    24: astore_3       
        //    25: new             Ljava/io/ObjectInputStream;
        //    28: astore_0       
        //    29: aload_0        
        //    30: aload_2        
        //    31: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    34: aload_0        
        //    35: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //    38: istore          4
        //    40: iload           4
        //    42: ifle            89
        //    45: aload_0        
        //    46: invokevirtual   java/io/ObjectInputStream.readUTF:()Ljava/lang/String;
        //    49: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //    52: astore          5
        //    54: aload_0        
        //    55: invokevirtual   java/io/ObjectInputStream.readBoolean:()Z
        //    58: istore          6
        //    60: new             Laio;
        //    63: astore_3       
        //    64: aload_3        
        //    65: aload           5
        //    67: iload           6
        //    69: invokespecial   aio.<init>:(Landroid/net/Uri;Z)V
        //    72: aload_1        
        //    73: getfield        aip.a:Ljava/util/Set;
        //    76: aload_3        
        //    77: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    82: pop            
        //    83: iinc            4, -1
        //    86: goto            40
        //    89: aload_0        
        //    90: invokevirtual   java/io/ObjectInputStream.close:()V
        //    93: goto            101
        //    96: astore_0       
        //    97: aload_0        
        //    98: invokevirtual   java/io/IOException.printStackTrace:()V
        //   101: aload_2        
        //   102: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   105: goto            159
        //   108: astore_1       
        //   109: aload_0        
        //   110: astore_3       
        //   111: aload_1        
        //   112: astore_0       
        //   113: goto            166
        //   116: astore_3       
        //   117: goto            127
        //   120: astore_0       
        //   121: goto            166
        //   124: astore_3       
        //   125: aconst_null    
        //   126: astore_0       
        //   127: aload_3        
        //   128: invokevirtual   java/io/IOException.printStackTrace:()V
        //   131: aload_0        
        //   132: ifnull          147
        //   135: aload_0        
        //   136: invokevirtual   java/io/ObjectInputStream.close:()V
        //   139: goto            147
        //   142: astore_0       
        //   143: aload_0        
        //   144: invokevirtual   java/io/IOException.printStackTrace:()V
        //   147: aload_2        
        //   148: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   151: goto            159
        //   154: astore_0       
        //   155: aload_0        
        //   156: invokevirtual   java/io/IOException.printStackTrace:()V
        //   159: aload_1        
        //   160: areturn        
        //   161: astore_1       
        //   162: aload_0        
        //   163: astore_3       
        //   164: aload_1        
        //   165: astore_0       
        //   166: aload_3        
        //   167: ifnull          182
        //   170: aload_3        
        //   171: invokevirtual   java/io/ObjectInputStream.close:()V
        //   174: goto            182
        //   177: astore_3       
        //   178: aload_3        
        //   179: invokevirtual   java/io/IOException.printStackTrace:()V
        //   182: aload_2        
        //   183: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   186: goto            194
        //   189: astore_3       
        //   190: aload_3        
        //   191: invokevirtual   java/io/IOException.printStackTrace:()V
        //   194: goto            199
        //   197: aload_0        
        //   198: athrow         
        //   199: goto            197
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  25     34     124    127    Ljava/io/IOException;
        //  25     34     120    124    Any
        //  34     40     116    120    Ljava/io/IOException;
        //  34     40     108    116    Any
        //  45     83     116    120    Ljava/io/IOException;
        //  45     83     108    116    Any
        //  89     93     96     101    Ljava/io/IOException;
        //  101    105    154    159    Ljava/io/IOException;
        //  127    131    161    166    Any
        //  135    139    142    147    Ljava/io/IOException;
        //  147    151    154    159    Ljava/io/IOException;
        //  170    174    177    182    Ljava/io/IOException;
        //  182    186    189    194    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0101:
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
    
    public static int c(final int n) {
        if (n == 0) {
            throw null;
        }
        switch (n - 1) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not convert ");
                sb.append((Object)cwz.e(n));
                sb.append(" to int");
                throw new IllegalArgumentException(sb.toString());
            }
            case 5: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 3: {
                return 3;
            }
            case 2: {
                return 2;
            }
            case 1: {
                return 1;
            }
            case 0: {
                return 0;
            }
        }
    }
    
    public static int d(final int n) {
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not convert ");
                sb.append(n);
                sb.append(" to BackoffPolicy");
                throw new IllegalArgumentException(sb.toString());
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int e(final int n) {
        switch (n) {
            default: {
                if (n == 5) {
                    return 6;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not convert ");
                sb.append(n);
                sb.append(" to NetworkType");
                throw new IllegalArgumentException(sb.toString());
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int f(final int n) {
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not convert ");
                sb.append(n);
                sb.append(" to OutOfQuotaPolicy");
                throw new IllegalArgumentException(sb.toString());
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int g(final int n) {
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not convert ");
                sb.append(n);
                sb.append(" to State");
                throw new IllegalArgumentException(sb.toString());
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
}
