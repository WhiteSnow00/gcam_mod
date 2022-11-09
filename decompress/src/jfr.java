import java.util.Collection;
import java.util.List;
import android.view.Surface;
import java.util.Set;
import android.util.Size;
import com.google.android.libraries.oliveoil.bufferflinger.BufferFlinger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfr implements jgd, kvt
{
    public static final nsd a;
    public final Executor b;
    public final lyp c;
    public final kse d;
    public final ksj e;
    public final ksj f;
    public final ofn g;
    public lfu h;
    public kwz i;
    public String j;
    public jfq k;
    public final AtomicLong l;
    BufferFlinger m;
    volatile nns n;
    public boolean o;
    private final klj p;
    private kvw q;
    private Size r;
    private final Set s;
    
    static {
        a = nsd.g("com/google/android/apps/camera/viewfindereffects/ViewfinderEffectsPipelineFrameServerImpl");
    }
    
    public jfr(final Executor b, final lyp c, final klj p4, final kse d) {
        this.g = ofn.f();
        this.h = null;
        this.j = "";
        this.k = null;
        this.l = new AtomicLong(0L);
        this.n = nns.l();
        this.o = false;
        this.s = nrr.o();
        this.b = b;
        this.c = c;
        this.p = p4;
        this.d = d;
        this.e = d.b("VFE.ImageCount");
        this.f = d.b("VFE.IntervalMs");
    }
    
    @Override
    public final void a(final lbe lbe) {
        final kvs a = lbe.a();
        if (a == null) {
            return;
        }
        this.b.execute(new jfo(this, a));
    }
    
    @Override
    public final lyp b() {
        synchronized (this) {
            njo.p(this.o ^ true, "Tried to get GL context after ViewfinderEffectsPipeline is closed");
            return this.c;
        }
    }
    
    @Override
    public final niz c(final int n, final int n2) {
        throw null;
    }
    
    @Override
    public final void close() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        jfr.d:Lkse;
        //     6: ldc             "VFEPipeline#close"
        //     8: invokeinterface kse.f:(Ljava/lang/String;)V
        //    13: aload_0        
        //    14: getfield        jfr.o:Z
        //    17: istore_1       
        //    18: iload_1        
        //    19: ifeq            36
        //    22: aload_0        
        //    23: getfield        jfr.d:Lkse;
        //    26: astore_2       
        //    27: aload_2        
        //    28: invokeinterface kse.g:()V
        //    33: aload_0        
        //    34: monitorexit    
        //    35: return         
        //    36: aload_0        
        //    37: iconst_1       
        //    38: putfield        jfr.o:Z
        //    41: aload_0        
        //    42: getfield        jfr.k:Ljfq;
        //    45: astore_2       
        //    46: aload_2        
        //    47: ifnull          54
        //    50: aload_2        
        //    51: invokevirtual   jfq.onBufferReleased:()V
        //    54: aload_0        
        //    55: getfield        jfr.m:Lcom/google/android/libraries/oliveoil/bufferflinger/BufferFlinger;
        //    58: astore_2       
        //    59: aload_2        
        //    60: ifnull          72
        //    63: aload_2        
        //    64: invokevirtual   com/google/android/libraries/oliveoil/bufferflinger/BufferFlinger.close:()V
        //    67: aload_0        
        //    68: aconst_null    
        //    69: putfield        jfr.m:Lcom/google/android/libraries/oliveoil/bufferflinger/BufferFlinger;
        //    72: aload_0        
        //    73: invokestatic    nns.l:()Lnns;
        //    76: invokevirtual   jfr.g:(Ljava/util/List;)V
        //    79: aload_0        
        //    80: getfield        jfr.s:Ljava/util/Set;
        //    83: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    88: astore_2       
        //    89: aload_2        
        //    90: invokeinterface java/util/Iterator.hasNext:()Z
        //    95: ifeq            115
        //    98: aload_2        
        //    99: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   104: checkcast       Ljfy;
        //   107: invokeinterface jfy.close:()V
        //   112: goto            89
        //   115: aload_0        
        //   116: getfield        jfr.s:Ljava/util/Set;
        //   119: invokeinterface java/util/Set.clear:()V
        //   124: aload_0        
        //   125: getfield        jfr.d:Lkse;
        //   128: ldc             "glContext"
        //   130: invokeinterface kse.f:(Ljava/lang/String;)V
        //   135: aload_0        
        //   136: getfield        jfr.c:Llyp;
        //   139: invokeinterface lyp.close:()V
        //   144: aload_0        
        //   145: getfield        jfr.d:Lkse;
        //   148: invokeinterface kse.g:()V
        //   153: aload_0        
        //   154: getfield        jfr.d:Lkse;
        //   157: astore_2       
        //   158: goto            27
        //   161: astore_2       
        //   162: aload_0        
        //   163: getfield        jfr.d:Lkse;
        //   166: invokeinterface kse.g:()V
        //   171: aload_2        
        //   172: athrow         
        //   173: astore_2       
        //   174: aload_0        
        //   175: monitorexit    
        //   176: goto            181
        //   179: aload_2        
        //   180: athrow         
        //   181: goto            179
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      18     161    173    Any
        //  22     27     173    184    Any
        //  27     33     173    184    Any
        //  36     46     161    173    Any
        //  50     54     161    173    Any
        //  54     59     161    173    Any
        //  63     72     161    173    Any
        //  72     89     161    173    Any
        //  89     112    161    173    Any
        //  115    153    161    173    Any
        //  153    158    173    184    Any
        //  162    173    173    184    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    public final void d(final kvw q, final kwz i) {
        synchronized (this) {
            final kvw q2 = this.q;
            if (q2 != q) {
                if (q2 != null) {
                    q2.l(this);
                }
                q.k(this);
            }
            this.i = i;
            this.q = q;
        }
    }
    
    final void e(final kvs p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        jfr.d:Lkse;
        //     6: ldc             "VFE.process"
        //     8: invokeinterface kse.f:(Ljava/lang/String;)V
        //    13: new             Ljfq;
        //    16: astore_2       
        //    17: aload_2        
        //    18: aload_0        
        //    19: aload_1        
        //    20: invokespecial   jfq.<init>:(Ljfr;Lkvs;)V
        //    23: aload_2        
        //    24: getfield        jfq.b:Llju;
        //    27: astore_3       
        //    28: aload_3        
        //    29: ifnull          320
        //    32: aload_2        
        //    33: getfield        jfq.c:Landroid/hardware/HardwareBuffer;
        //    36: ifnull          320
        //    39: aload_0        
        //    40: getfield        jfr.o:Z
        //    43: ifeq            66
        //    46: aload_2        
        //    47: ldc             "The pipeline has been closed."
        //    49: invokevirtual   jfq.b:(Ljava/lang/String;)V
        //    52: aload_0        
        //    53: getfield        jfr.d:Lkse;
        //    56: astore_1       
        //    57: aload_1        
        //    58: invokeinterface kse.g:()V
        //    63: aload_0        
        //    64: monitorexit    
        //    65: return         
        //    66: aload_0        
        //    67: getfield        jfr.m:Lcom/google/android/libraries/oliveoil/bufferflinger/BufferFlinger;
        //    70: astore          4
        //    72: aload_0        
        //    73: getfield        jfr.r:Landroid/util/Size;
        //    76: astore          5
        //    78: aload           4
        //    80: ifnull          305
        //    83: aload           5
        //    85: ifnonnull       91
        //    88: goto            305
        //    91: aload_3        
        //    92: invokestatic    nov.z:(Ljava/lang/Object;)Ljava/lang/Object;
        //    95: pop            
        //    96: aload_2        
        //    97: invokevirtual   jfq.a:()Landroid/hardware/HardwareBuffer;
        //   100: astore          6
        //   102: aload_0        
        //   103: getfield        jfr.n:Lnns;
        //   106: astore          7
        //   108: aload           7
        //   110: invokevirtual   nns.isEmpty:()Z
        //   113: ifne            157
        //   116: aload           7
        //   118: invokevirtual   nns.t:()Lnrw;
        //   121: astore          7
        //   123: aload           7
        //   125: invokeinterface java/util/Iterator.hasNext:()Z
        //   130: ifeq            157
        //   133: aload           7
        //   135: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   140: checkcast       Ljfy;
        //   143: aload_1        
        //   144: aload_0        
        //   145: getfield        jfr.i:Lkwz;
        //   148: aload_1        
        //   149: invokeinterface jfy.c:(Lkvs;Lkwz;Lkvs;)V
        //   154: goto            123
        //   157: aload_0        
        //   158: getfield        jfr.h:Llfu;
        //   161: ifnonnull       181
        //   164: aload_0        
        //   165: aload_0        
        //   166: getfield        jfr.p:Lklj;
        //   169: checkcast       Lcrg;
        //   172: invokevirtual   crg.c:()Lcsd;
        //   175: invokevirtual   csd.a:()Llfu;
        //   178: putfield        jfr.h:Llfu;
        //   181: aload_0        
        //   182: getfield        jfr.h:Llfu;
        //   185: getstatic       lfu.a:Llfu;
        //   188: if_acmpne       198
        //   191: bipush          13
        //   193: istore          8
        //   195: goto            202
        //   198: bipush          12
        //   200: istore          8
        //   202: aload_0        
        //   203: getfield        jfr.k:Ljfq;
        //   206: astore_1       
        //   207: aload_2        
        //   208: invokevirtual   jfq.c:()V
        //   211: aload_0        
        //   212: aload_2        
        //   213: putfield        jfr.k:Ljfq;
        //   216: aload_1        
        //   217: ifnull          224
        //   220: aload_1        
        //   221: invokevirtual   jfq.onBufferReleased:()V
        //   224: new             Landroid/graphics/Rect;
        //   227: astore_1       
        //   228: aload_1        
        //   229: iconst_0       
        //   230: iconst_0       
        //   231: aload_3        
        //   232: invokeinterface lju.c:()I
        //   237: aload_3        
        //   238: invokeinterface lju.b:()I
        //   243: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //   246: new             Landroid/graphics/Rect;
        //   249: astore_3       
        //   250: aload_3        
        //   251: iconst_0       
        //   252: iconst_0       
        //   253: aload           5
        //   255: invokevirtual   android/util/Size.getWidth:()I
        //   258: aload           5
        //   260: invokevirtual   android/util/Size.getHeight:()I
        //   263: invokespecial   android/graphics/Rect.<init>:(IIII)V
        //   266: aload           4
        //   268: aload           6
        //   270: aload_1        
        //   271: aload_3        
        //   272: iload           8
        //   274: aload_2        
        //   275: invokevirtual   com/google/android/libraries/oliveoil/bufferflinger/BufferFlinger.displayBuffer:(Landroid/hardware/HardwareBuffer;Landroid/graphics/Rect;Landroid/graphics/Rect;ILcom/google/android/libraries/oliveoil/bufferflinger/BufferFlinger$OnBufferReleasedListener;)V
        //   278: aload_2        
        //   279: aload_2        
        //   280: getfield        jfq.e:Ljfr;
        //   283: getfield        jfr.d:Lkse;
        //   286: ldc_w           "VFE.Submit"
        //   289: invokeinterface kse.a:(Ljava/lang/String;)Lksh;
        //   294: putfield        jfq.d:Lksh;
        //   297: aload_0        
        //   298: getfield        jfr.d:Lkse;
        //   301: astore_1       
        //   302: goto            57
        //   305: aload_2        
        //   306: ldc_w           "BufferFlinger or outputSize isn't available."
        //   309: invokevirtual   jfq.b:(Ljava/lang/String;)V
        //   312: aload_0        
        //   313: getfield        jfr.d:Lkse;
        //   316: astore_1       
        //   317: goto            57
        //   320: aload_2        
        //   321: ldc_w           "Image or HardwareBuffer isn't available."
        //   324: invokevirtual   jfq.b:(Ljava/lang/String;)V
        //   327: aload_0        
        //   328: getfield        jfr.d:Lkse;
        //   331: astore_1       
        //   332: goto            57
        //   335: astore_1       
        //   336: aload_0        
        //   337: getfield        jfr.d:Lkse;
        //   340: invokeinterface kse.g:()V
        //   345: aload_1        
        //   346: athrow         
        //   347: astore_1       
        //   348: aload_0        
        //   349: monitorexit    
        //   350: goto            355
        //   353: aload_1        
        //   354: athrow         
        //   355: goto            353
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      28     335    347    Any
        //  32     52     335    347    Any
        //  52     57     347    358    Any
        //  57     63     347    358    Any
        //  66     78     335    347    Any
        //  91     123    335    347    Any
        //  123    154    335    347    Any
        //  157    181    335    347    Any
        //  181    191    335    347    Any
        //  202    216    335    347    Any
        //  220    224    335    347    Any
        //  224    297    335    347    Any
        //  297    302    347    358    Any
        //  305    312    335    347    Any
        //  312    317    347    358    Any
        //  320    327    335    347    Any
        //  327    332    347    358    Any
        //  336    347    347    358    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
    public final void f(final Surface surface, final Size r) {
        synchronized (this) {
            if (this.o) {
                surface.release();
                return;
            }
            try (final BufferFlinger m = this.m) {}
            this.r = r;
            this.m = new BufferFlinger(surface);
        }
    }
    
    @Override
    public final void g(final List list) {
        this.s.addAll(list);
        this.n = nns.j(list);
    }
}
