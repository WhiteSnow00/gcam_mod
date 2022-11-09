// 
// Decompiled by Procyon v0.6.0
// 

final class chi extends kwp
{
    final /* synthetic */ ofn a;
    final /* synthetic */ kvs b;
    final /* synthetic */ chj c;
    
    public chi(final chj c, final ofn a, final kvs b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        this.a.a(new IllegalStateException("Snapshot request is aborted"));
        this.b.close();
    }
    
    @Override
    public final void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        chi.c:Lchj;
        //     4: getfield        chj.c:Ljava/lang/Object;
        //     7: astore_1       
        //     8: aload_1        
        //     9: monitorenter   
        //    10: aload_0        
        //    11: getfield        chi.c:Lchj;
        //    14: getfield        chj.i:Lkwz;
        //    17: astore_2       
        //    18: aload_2        
        //    19: ifnonnull       46
        //    22: aload_0        
        //    23: getfield        chi.a:Lofn;
        //    26: astore_3       
        //    27: new             Ljava/lang/IllegalStateException;
        //    30: astore_2       
        //    31: aload_2        
        //    32: ldc             "Snapshot is not available"
        //    34: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    37: aload_3        
        //    38: aload_2        
        //    39: invokevirtual   ofn.a:(Ljava/lang/Throwable;)Z
        //    42: pop            
        //    43: goto            102
        //    46: aload_0        
        //    47: getfield        chi.b:Lkvs;
        //    50: aload_2        
        //    51: invokeinterface kvs.d:(Lkwz;)Llju;
        //    56: astore_2       
        //    57: aload_2        
        //    58: ifnull          81
        //    61: aload_0        
        //    62: getfield        chi.a:Lofn;
        //    65: aload_2        
        //    66: invokevirtual   ofn.o:(Ljava/lang/Object;)Z
        //    69: ifne            102
        //    72: aload_2        
        //    73: invokeinterface lju.close:()V
        //    78: goto            102
        //    81: aload_0        
        //    82: getfield        chi.a:Lofn;
        //    85: astore_2       
        //    86: new             Ljava/lang/IllegalStateException;
        //    89: astore_3       
        //    90: aload_3        
        //    91: ldc             "Snapshot is null"
        //    93: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    96: aload_2        
        //    97: aload_3        
        //    98: invokevirtual   ofn.a:(Ljava/lang/Throwable;)Z
        //   101: pop            
        //   102: aload_0        
        //   103: getfield        chi.b:Lkvs;
        //   106: invokeinterface kvs.close:()V
        //   111: aload_1        
        //   112: monitorexit    
        //   113: return         
        //   114: astore_2       
        //   115: aload_0        
        //   116: getfield        chi.b:Lkvs;
        //   119: invokeinterface kvs.close:()V
        //   124: aload_2        
        //   125: athrow         
        //   126: astore_2       
        //   127: aload_1        
        //   128: monitorexit    
        //   129: aload_2        
        //   130: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  10     18     114    126    Any
        //  22     43     114    126    Any
        //  46     57     114    126    Any
        //  61     78     114    126    Any
        //  81     102    114    126    Any
        //  102    113    126    131    Any
        //  115    126    126    131    Any
        //  127    129    126    131    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0102:
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
