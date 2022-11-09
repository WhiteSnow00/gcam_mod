// 
// Decompiled by Procyon v0.6.0
// 

final class fuc implements frl
{
    final /* synthetic */ fud a;
    private final frl b;
    private boolean c;
    
    public fuc(final fud a, final frl b) {
        this.a = a;
        this.c = false;
        this.b = b;
    }
    
    @Override
    public final void a(final lju p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        fuc.c:Z
        //     6: ifne            22
        //     9: aload_0        
        //    10: getfield        fuc.b:Lfrl;
        //    13: aload_1        
        //    14: invokeinterface frl.a:(Llju;)V
        //    19: goto            49
        //    22: getstatic       fud.a:Lnsd;
        //    25: invokevirtual   nry.c:()Lnsu;
        //    28: checkcast       Lnsa;
        //    31: sipush          1787
        //    34: invokeinterface nsa.E:(I)Lnsu;
        //    39: checkcast       Lnsa;
        //    42: ldc             "Attempting to enqueue image on closed sink!"
        //    44: invokeinterface nsa.o:(Ljava/lang/String;)V
        //    49: aload_1        
        //    50: invokeinterface lju.close:()V
        //    55: aload_0        
        //    56: monitorexit    
        //    57: return         
        //    58: astore_2       
        //    59: goto            102
        //    62: astore_2       
        //    63: getstatic       fud.a:Lnsd;
        //    66: invokevirtual   nry.b:()Lnsu;
        //    69: checkcast       Lnsa;
        //    72: aload_2        
        //    73: invokeinterface nsa.h:(Ljava/lang/Throwable;)Lnsu;
        //    78: checkcast       Lnsa;
        //    81: sipush          1788
        //    84: invokeinterface nsa.E:(I)Lnsu;
        //    89: checkcast       Lnsa;
        //    92: ldc             "Could not encode out image"
        //    94: invokeinterface nsa.o:(Ljava/lang/String;)V
        //    99: goto            49
        //   102: aload_1        
        //   103: invokeinterface lju.close:()V
        //   108: aload_2        
        //   109: athrow         
        //   110: astore_1       
        //   111: aload_0        
        //   112: monitorexit    
        //   113: goto            118
        //   116: aload_1        
        //   117: athrow         
        //   118: goto            116
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  2      19     62     102    Ljava/lang/RuntimeException;
        //  2      19     58     62     Any
        //  22     49     62     102    Ljava/lang/RuntimeException;
        //  22     49     58     62     Any
        //  49     55     110    121    Any
        //  63     99     58     62     Any
        //  102    110    110    121    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
        synchronized (this) {
            if (!this.c) {
                this.b.close();
                this.c = true;
                this.a.c();
            }
        }
    }
}
