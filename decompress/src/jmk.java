import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmk implements ServiceConnection
{
    public volatile boolean a;
    final /* synthetic */ jml b;
    public volatile jnh c;
    
    protected jmk(final jml b) {
        this.b = b;
    }
    
    public final void onServiceConnected(final ComponentName p0, final IBinder p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    jvu.e:(Ljava/lang/String;)V
        //     5: aload_0        
        //     6: monitorenter   
        //     7: aload_2        
        //     8: ifnonnull       27
        //    11: aload_0        
        //    12: getfield        jmk.b:Ljml;
        //    15: ldc             "Service connected with null binder"
        //    17: invokevirtual   jmb.n:(Ljava/lang/String;)V
        //    20: aload_0        
        //    21: invokevirtual   java/lang/Object.notifyAll:()V
        //    24: aload_0        
        //    25: monitorexit    
        //    26: return         
        //    27: aconst_null    
        //    28: astore_1       
        //    29: aconst_null    
        //    30: astore_3       
        //    31: aload_2        
        //    32: invokeinterface android/os/IBinder.getInterfaceDescriptor:()Ljava/lang/String;
        //    37: astore          4
        //    39: ldc             "com.google.android.gms.analytics.internal.IAnalyticsService"
        //    41: aload           4
        //    43: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    46: ifeq            102
        //    49: aload_2        
        //    50: ldc             "com.google.android.gms.analytics.internal.IAnalyticsService"
        //    52: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //    57: astore_3       
        //    58: aload_3        
        //    59: instanceof      Ljnh;
        //    62: ifeq            75
        //    65: aload_3        
        //    66: checkcast       Ljnh;
        //    69: astore_2       
        //    70: aload_2        
        //    71: astore_1       
        //    72: goto            86
        //    75: new             Ljnh;
        //    78: dup            
        //    79: aload_2        
        //    80: invokespecial   jnh.<init>:(Landroid/os/IBinder;)V
        //    83: astore_2       
        //    84: aload_2        
        //    85: astore_1       
        //    86: aload_0        
        //    87: getfield        jmk.b:Ljml;
        //    90: ldc             "Bound to IAnalyticsService interface"
        //    92: invokevirtual   jmb.q:(Ljava/lang/String;)V
        //    95: goto            115
        //    98: astore_2       
        //    99: goto            123
        //   102: aload_0        
        //   103: getfield        jmk.b:Ljml;
        //   106: ldc             "Got binder with a wrong descriptor"
        //   108: aload           4
        //   110: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //   113: aload_3        
        //   114: astore_1       
        //   115: goto            132
        //   118: astore_1       
        //   119: goto            217
        //   122: astore_2       
        //   123: aload_0        
        //   124: getfield        jmk.b:Ljml;
        //   127: ldc             "Service connect failed to get IAnalyticsService"
        //   129: invokevirtual   jmb.n:(Ljava/lang/String;)V
        //   132: aload_1        
        //   133: ifnonnull       163
        //   136: invokestatic    jwl.a:()Ljwl;
        //   139: aload_0        
        //   140: getfield        jmk.b:Ljml;
        //   143: invokevirtual   jmb.d:()Landroid/content/Context;
        //   146: aload_0        
        //   147: getfield        jmk.b:Ljml;
        //   150: getfield        jml.a:Ljmk;
        //   153: invokevirtual   jwl.b:(Landroid/content/Context;Landroid/content/ServiceConnection;)V
        //   156: goto            210
        //   159: astore_1       
        //   160: goto            210
        //   163: aload_0        
        //   164: getfield        jmk.a:Z
        //   167: ifne            205
        //   170: aload_0        
        //   171: getfield        jmk.b:Ljml;
        //   174: ldc             "onServiceConnected received after the timeout limit"
        //   176: invokevirtual   jmb.t:(Ljava/lang/String;)V
        //   179: aload_0        
        //   180: getfield        jmk.b:Ljml;
        //   183: invokevirtual   jmb.e:()Ljlw;
        //   186: astore_3       
        //   187: new             Ljmi;
        //   190: astore_2       
        //   191: aload_2        
        //   192: aload_0        
        //   193: aload_1        
        //   194: invokespecial   jmi.<init>:(Ljmk;Ljnh;)V
        //   197: aload_3        
        //   198: aload_2        
        //   199: invokevirtual   jlw.b:(Ljava/lang/Runnable;)V
        //   202: goto            210
        //   205: aload_0        
        //   206: aload_1        
        //   207: putfield        jmk.c:Ljnh;
        //   210: aload_0        
        //   211: invokevirtual   java/lang/Object.notifyAll:()V
        //   214: aload_0        
        //   215: monitorexit    
        //   216: return         
        //   217: aload_0        
        //   218: invokevirtual   java/lang/Object.notifyAll:()V
        //   221: aload_1        
        //   222: athrow         
        //   223: astore_1       
        //   224: aload_0        
        //   225: monitorexit    
        //   226: aload_1        
        //   227: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  11     20     118    122    Any
        //  20     26     223    228    Any
        //  31     70     122    123    Landroid/os/RemoteException;
        //  31     70     118    122    Any
        //  75     84     122    123    Landroid/os/RemoteException;
        //  75     84     118    122    Any
        //  86     95     98     102    Landroid/os/RemoteException;
        //  86     95     118    122    Any
        //  102    113    122    123    Landroid/os/RemoteException;
        //  102    113    118    122    Any
        //  123    132    118    122    Any
        //  136    156    159    163    Ljava/lang/IllegalArgumentException;
        //  136    156    118    122    Any
        //  163    202    118    122    Any
        //  205    210    118    122    Any
        //  210    216    223    228    Any
        //  217    223    223    228    Any
        //  224    226    223    228    Any
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
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        jvu.e("AnalyticsServiceConnection.onServiceDisconnected");
        this.b.e().b(new jmj(this, componentName));
    }
}
