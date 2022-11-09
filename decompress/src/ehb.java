import com.google.android.apps.camera.jni.gyro.GyroQueueNative;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ehb implements eha
{
    private static final nsd a;
    private static final float[] b;
    private static final int[] c;
    private static final int[] d;
    private final long e;
    private final Object f;
    private boolean g;
    private long h;
    
    static {
        a = nsd.g("com/google/android/apps/camera/jni/gyro/GyroQueueImpl");
        b = e();
        c = new int[] { 1, 0, 2 };
        d = new int[] { 1, 1, 1 };
    }
    
    public ehb() {
        this.f = new Object();
        this.h = 0L;
        this.e = GyroQueueNative.createHandle(ehb.c, ehb.d);
        this.g = false;
    }
    
    private static final float[] e() {
        return new float[] { 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f };
    }
    
    @Override
    public final long a() {
        synchronized (this.f) {
            return this.h;
        }
    }
    
    @Override
    public final void b(final float n, final float n2, final float n3, final long h) {
        synchronized (this.f) {
            if (!this.g) {
                if (this.h < h) {
                    this.h = h;
                    GyroQueueNative.processAndEnqueueGyro(this.e, n, n2, n3, h);
                }
            }
        }
    }
    
    @Override
    public final boolean c(final long n, final float n2, final float n3, final float n4, final float[] array) {
        System.arraycopy(ehb.b, 0, array, 0, 9);
        synchronized (this.f) {
            if (this.g) {
                return false;
            }
            if (!GyroQueueNative.getProjectionMatrix(this.e, n, n2, n3, n4, 0L, array)) {
                ehb.a.c().E(1181).q("Projection matrix could not be computed for timestamp = %d", n);
                return false;
            }
            return true;
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.f) {
            if (this.g) {
                return;
            }
            this.g = true;
            GyroQueueNative.releaseHandle(this.e);
        }
    }
    
    @Override
    public final float[] d(final long p0, final float p1, final float p2, final float p3, final long p4, final float p5, final float p6, final float p7) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          11
        //     5: aload_0        
        //     6: getfield        ehb.f:Ljava/lang/Object;
        //     9: astore          12
        //    11: aload           12
        //    13: monitorenter   
        //    14: aload_0        
        //    15: getfield        ehb.g:Z
        //    18: ifeq            27
        //    21: aload           12
        //    23: monitorexit    
        //    24: aload           11
        //    26: areturn        
        //    27: aload_0        
        //    28: getfield        ehb.e:J
        //    31: lstore          13
        //    33: aload           12
        //    35: astore          15
        //    37: lload           13
        //    39: lload_1        
        //    40: fload_3        
        //    41: fload           4
        //    43: fload           5
        //    45: lload           6
        //    47: fload           8
        //    49: fload           9
        //    51: fload           10
        //    53: lconst_0       
        //    54: aload           11
        //    56: invokestatic    com/google/android/apps/camera/jni/gyro/GyroQueueNative.getTransformBetweenTime:(JJFFFJFFFJ[F)Z
        //    59: ifne            96
        //    62: aload           12
        //    64: astore          15
        //    66: getstatic       ehb.a:Lnsd;
        //    69: invokevirtual   nry.c:()Lnsu;
        //    72: checkcast       Lnsa;
        //    75: sipush          1183
        //    78: invokeinterface nsa.E:(I)Lnsu;
        //    83: checkcast       Lnsa;
        //    86: ldc             "Transformation matrix could not be computed for timestamps %d - %d"
        //    88: lload_1        
        //    89: lload           6
        //    91: invokeinterface nsa.u:(Ljava/lang/String;JJ)V
        //    96: aload           12
        //    98: astore          15
        //   100: aload           12
        //   102: monitorexit    
        //   103: aload           11
        //   105: areturn        
        //   106: astore          15
        //   108: aload           15
        //   110: astore          11
        //   112: aload           12
        //   114: astore          15
        //   116: aload           12
        //   118: monitorexit    
        //   119: aload           11
        //   121: athrow         
        //   122: astore          11
        //   124: aload           15
        //   126: astore          12
        //   128: goto            112
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  14     24     106    112    Any
        //  27     33     106    112    Any
        //  37     62     122    131    Any
        //  66     96     122    131    Any
        //  100    103    122    131    Any
        //  116    119    122    131    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0096:
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
