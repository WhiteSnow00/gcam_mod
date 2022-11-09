import java.util.concurrent.TimeUnit;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ExecutionException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghl implements ght, krc
{
    public static final nsd a;
    public final Object b;
    public final Object c;
    public final fyr d;
    public final ghr e;
    public final Executor f;
    public boolean g;
    public int h;
    public boolean i;
    private final kvw j;
    private final ghj k;
    private final dxr l;
    private final gry m;
    private final ExecutorService n;
    private final gun o;
    private krc p;
    private ljm q;
    
    static {
        a = nsd.g("com/google/android/apps/camera/one/smartmetering/PckSmartMeteringController");
    }
    
    public ghl(final kvw j, final njp njp, final ghr e, final fyr d, final dxr l, final gry m, final Executor f, final Set set) {
        this.b = new Object();
        this.c = new Object();
        this.g = false;
        this.j = j;
        this.e = e;
        this.d = d;
        this.l = l;
        this.m = m;
        this.k = new ghj(this, njp);
        this.f = f;
        this.o = new gun(set);
        this.n = mcn.h("waitForFrame");
    }
    
    private final void e() {
        synchronized (this.b) {
            final krc p = this.p;
            if (p != null) {
                p.close();
                this.p = null;
            }
        }
    }
    
    private final void f(final long n) {
        final ghf ghf = new ghf(this, n);
        try {
            this.n.submit(ghf).get();
        }
        catch (final RejectedExecutionException ex) {
            ghl.a.b().h(ex).E(1824).q("Error trying to wait for frame %d", n);
            throw new ExecutionException(ex);
        }
    }
    
    @Override
    public final niz a() {
        synchronized (this.c) {
            return this.e.a();
        }
    }
    
    public final void b() {
        synchronized (this.b) {
            if (this.g) {
                return;
            }
            if (this.h <= 0) {
                if (this.p == null) {
                    final ghj k = this.k;
                    final kvw j = this.j;
                    synchronized (k.a) {
                        j.k(k);
                        k.b = true;
                        final ghg p = new ghg(k, j);
                        monitorexit(k.a);
                        this.p = p;
                    }
                }
            }
        }
    }
    
    @Override
    public final ghk c(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        ghl.b:Ljava/lang/Object;
        //     4: astore_3       
        //     5: aload_3        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        ghl.g:Z
        //    11: ifne            409
        //    14: aload_0        
        //    15: invokespecial   ghl.e:()V
        //    18: aload_0        
        //    19: getfield        ghl.h:I
        //    22: istore          4
        //    24: iload           4
        //    26: ifle            57
        //    29: aload_0        
        //    30: iload           4
        //    32: iconst_1       
        //    33: iadd           
        //    34: putfield        ghl.h:I
        //    37: new             Lghk;
        //    40: astore          5
        //    42: aload           5
        //    44: aload_0        
        //    45: aload_0        
        //    46: getfield        ghl.q:Lljm;
        //    49: invokespecial   ghk.<init>:(Lghl;Lljm;)V
        //    52: aload_3        
        //    53: monitorexit    
        //    54: aload           5
        //    56: areturn        
        //    57: aload_3        
        //    58: monitorexit    
        //    59: aload_0        
        //    60: getfield        ghl.c:Ljava/lang/Object;
        //    63: astore          5
        //    65: aload           5
        //    67: monitorenter   
        //    68: aload_0        
        //    69: getfield        ghl.d:Lfyr;
        //    72: astore_3       
        //    73: aload_3        
        //    74: getfield        fyr.a:Ljava/util/concurrent/locks/ReentrantLock;
        //    77: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //    80: aload_3        
        //    81: getfield        fyr.c:J
        //    84: lstore          6
        //    86: aload_3        
        //    87: getfield        fyr.a:Ljava/util/concurrent/locks/ReentrantLock;
        //    90: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //    93: iconst_0       
        //    94: istore          4
        //    96: iload           4
        //    98: istore          8
        //   100: iload           4
        //   102: bipush          10
        //   104: if_icmpge       242
        //   107: aload_0        
        //   108: iload           4
        //   110: i2l            
        //   111: lload           6
        //   113: ladd           
        //   114: invokespecial   ghl.f:(J)V
        //   117: iinc            4, 1
        //   120: aload_0        
        //   121: getfield        ghl.j:Lkvw;
        //   124: invokeinterface kvw.h:()Lkvs;
        //   129: astore          9
        //   131: aload           9
        //   133: ifnonnull       139
        //   136: goto            96
        //   139: aload           9
        //   141: invokeinterface kvs.b:()Lkvx;
        //   146: astore_3       
        //   147: aload_3        
        //   148: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   151: pop            
        //   152: aload_3        
        //   153: getfield        kvx.b:J
        //   156: lload_1        
        //   157: lcmp           
        //   158: iflt            193
        //   161: aload           9
        //   163: invokestatic    kwp.j:(Lkvs;)V
        //   166: aload_0        
        //   167: aload           9
        //   169: invokevirtual   ghl.d:(Lkvs;)Z
        //   172: istore          10
        //   174: iload           10
        //   176: ifeq            193
        //   179: aload           9
        //   181: invokeinterface kvs.close:()V
        //   186: iload           4
        //   188: istore          8
        //   190: goto            242
        //   193: aload           9
        //   195: invokeinterface kvs.close:()V
        //   200: goto            96
        //   203: astore_3       
        //   204: aload           9
        //   206: invokeinterface kvs.close:()V
        //   211: goto            222
        //   214: astore          9
        //   216: aload_3        
        //   217: aload           9
        //   219: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   222: aload_3        
        //   223: athrow         
        //   224: astore_3       
        //   225: getstatic       ghl.a:Lnsd;
        //   228: invokevirtual   nry.b:()Lnsu;
        //   231: ldc             "Error retrieving metadata from frame."
        //   233: sipush          1822
        //   236: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //   239: goto            96
        //   242: iload           8
        //   244: bipush          10
        //   246: if_icmpge       252
        //   249: goto            325
        //   252: new             Lkuw;
        //   255: astore_3       
        //   256: aload_3        
        //   257: ldc             "Unable to acquire a valid frame after 10 attempts!!!"
        //   259: invokespecial   kuw.<init>:(Ljava/lang/String;)V
        //   262: aload_3        
        //   263: athrow         
        //   264: astore          9
        //   266: aload_3        
        //   267: getfield        fyr.a:Ljava/util/concurrent/locks/ReentrantLock;
        //   270: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   273: aload           9
        //   275: athrow         
        //   276: astore_3       
        //   277: goto            404
        //   280: astore_3       
        //   281: goto            289
        //   284: astore_3       
        //   285: goto            289
        //   288: astore_3       
        //   289: getstatic       ghl.a:Lnsd;
        //   292: invokevirtual   nry.c:()Lnsu;
        //   295: checkcast       Lnsa;
        //   298: aload_3        
        //   299: invokeinterface nsa.h:(Ljava/lang/Throwable;)Lnsu;
        //   304: checkcast       Lnsa;
        //   307: sipush          1816
        //   310: invokeinterface nsa.E:(I)Lnsu;
        //   315: checkcast       Lnsa;
        //   318: ldc             "SmartMetering failed, using last known good metadata instead."
        //   320: invokeinterface nsa.o:(Ljava/lang/String;)V
        //   325: aload_0        
        //   326: getfield        ghl.e:Lghr;
        //   329: invokeinterface ghr.b:()Lnjp;
        //   334: checkcast       Lnjs;
        //   337: getfield        njs.a:Ljava/lang/Object;
        //   340: checkcast       Landroid/util/Pair;
        //   343: astore          9
        //   345: aload           5
        //   347: monitorexit    
        //   348: aload_0        
        //   349: getfield        ghl.b:Ljava/lang/Object;
        //   352: astore_3       
        //   353: aload_3        
        //   354: monitorenter   
        //   355: aload_0        
        //   356: aload_0        
        //   357: getfield        ghl.h:I
        //   360: iconst_1       
        //   361: iadd           
        //   362: putfield        ghl.h:I
        //   365: aload_0        
        //   366: aload           9
        //   368: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   371: checkcast       Lljm;
        //   374: putfield        ghl.q:Lljm;
        //   377: new             Lghk;
        //   380: astore          5
        //   382: aload           5
        //   384: aload_0        
        //   385: aload_0        
        //   386: getfield        ghl.q:Lljm;
        //   389: invokespecial   ghk.<init>:(Lghl;Lljm;)V
        //   392: aload_3        
        //   393: monitorexit    
        //   394: aload           5
        //   396: areturn        
        //   397: astore          5
        //   399: aload_3        
        //   400: monitorexit    
        //   401: aload           5
        //   403: athrow         
        //   404: aload           5
        //   406: monitorexit    
        //   407: aload_3        
        //   408: athrow         
        //   409: new             Lkuw;
        //   412: astore          5
        //   414: aload           5
        //   416: ldc_w           "SmartMeteringController already closed"
        //   419: invokespecial   kuw.<init>:(Ljava/lang/String;)V
        //   422: aload           5
        //   424: athrow         
        //   425: astore          5
        //   427: aload_3        
        //   428: monitorexit    
        //   429: goto            435
        //   432: aload           5
        //   434: athrow         
        //   435: goto            432
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  7      24     425    438    Any
        //  29     54     425    438    Any
        //  57     59     425    438    Any
        //  68     80     288    289    Ljava/lang/InterruptedException;
        //  68     80     284    288    Lkuw;
        //  68     80     280    284    Ljava/util/concurrent/ExecutionException;
        //  68     80     276    409    Any
        //  80     86     264    276    Any
        //  86     93     288    289    Ljava/lang/InterruptedException;
        //  86     93     284    288    Lkuw;
        //  86     93     280    284    Ljava/util/concurrent/ExecutionException;
        //  86     93     276    409    Any
        //  107    117    288    289    Ljava/lang/InterruptedException;
        //  107    117    284    288    Lkuw;
        //  107    117    280    284    Ljava/util/concurrent/ExecutionException;
        //  107    117    276    409    Any
        //  120    131    224    242    Ljava/lang/InterruptedException;
        //  120    131    284    288    Lkuw;
        //  120    131    280    284    Ljava/util/concurrent/ExecutionException;
        //  120    131    276    409    Any
        //  139    174    203    224    Any
        //  179    186    224    242    Ljava/lang/InterruptedException;
        //  179    186    284    288    Lkuw;
        //  179    186    280    284    Ljava/util/concurrent/ExecutionException;
        //  179    186    276    409    Any
        //  193    200    224    242    Ljava/lang/InterruptedException;
        //  193    200    284    288    Lkuw;
        //  193    200    280    284    Ljava/util/concurrent/ExecutionException;
        //  193    200    276    409    Any
        //  204    211    214    222    Any
        //  216    222    224    242    Ljava/lang/InterruptedException;
        //  216    222    284    288    Lkuw;
        //  216    222    280    284    Ljava/util/concurrent/ExecutionException;
        //  216    222    276    409    Any
        //  222    224    224    242    Ljava/lang/InterruptedException;
        //  222    224    284    288    Lkuw;
        //  222    224    280    284    Ljava/util/concurrent/ExecutionException;
        //  222    224    276    409    Any
        //  225    239    288    289    Ljava/lang/InterruptedException;
        //  225    239    284    288    Lkuw;
        //  225    239    280    284    Ljava/util/concurrent/ExecutionException;
        //  225    239    276    409    Any
        //  252    264    288    289    Ljava/lang/InterruptedException;
        //  252    264    284    288    Lkuw;
        //  252    264    280    284    Ljava/util/concurrent/ExecutionException;
        //  252    264    276    409    Any
        //  266    276    288    289    Ljava/lang/InterruptedException;
        //  266    276    284    288    Lkuw;
        //  266    276    280    284    Ljava/util/concurrent/ExecutionException;
        //  266    276    276    409    Any
        //  289    325    276    409    Any
        //  325    348    276    409    Any
        //  355    394    397    404    Any
        //  399    401    397    404    Any
        //  404    407    276    409    Any
        //  409    425    425    438    Any
        //  427    429    425    438    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0242:
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
    
    @Override
    public final void close() {
        synchronized (this.b) {
            if (this.g) {
                return;
            }
            this.g = true;
            synchronized (this.b) {
                this.i = false;
                this.e();
                monitorexit(this.b);
                this.n.shutdownNow();
                this.k.close();
                this.j.close();
            }
        }
    }
    
    public final boolean d(final kvs kvs) {
        final ljm c = kvs.c();
        if (c != null && this.o.a(kvs)) {
            final grx a = this.m.a(kvs);
            final lju e = a.e();
            if (e != null) {
                synchronized (this.c) {
                    nsd.b.F(TimeUnit.MILLISECONDS);
                    a.a().c();
                    final lgb lgb = new lgb(e);
                    final lju k = lgb.k();
                    if (k != null) {
                        this.l.aR(new gaa(k, ofi.n(c)));
                    }
                    this.e.e(new gaa(new lgc(lgb), ofi.n(c)), c);
                    return true;
                }
            }
        }
        return false;
    }
}
