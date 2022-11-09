// 
// Decompiled by Procyon v0.6.0
// 

final class ofl implements Runnable
{
    Runnable a;
    final /* synthetic */ ofm b;
    
    public ofl(final ofm b) {
        this.b = b;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_1       
        //     2: iconst_0       
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        ofl.b:Lofm;
        //     8: getfield        ofm.b:Ljava/util/Deque;
        //    11: astore_3       
        //    12: aload_3        
        //    13: monitorenter   
        //    14: iload_1        
        //    15: ifne            64
        //    18: aload_0        
        //    19: getfield        ofl.b:Lofm;
        //    22: astore          4
        //    24: aload           4
        //    26: getfield        ofm.d:I
        //    29: iconst_4       
        //    30: if_icmpne       46
        //    33: aload_3        
        //    34: monitorexit    
        //    35: iload_2        
        //    36: ifeq            112
        //    39: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    42: invokevirtual   java/lang/Thread.interrupt:()V
        //    45: return         
        //    46: aload           4
        //    48: aload           4
        //    50: getfield        ofm.c:J
        //    53: lconst_1       
        //    54: ladd           
        //    55: putfield        ofm.c:J
        //    58: aload           4
        //    60: iconst_4       
        //    61: putfield        ofm.d:I
        //    64: aload_0        
        //    65: getfield        ofl.b:Lofm;
        //    68: getfield        ofm.b:Ljava/util/Deque;
        //    71: invokeinterface java/util/Deque.poll:()Ljava/lang/Object;
        //    76: checkcast       Ljava/lang/Runnable;
        //    79: astore          4
        //    81: aload_0        
        //    82: aload           4
        //    84: putfield        ofl.a:Ljava/lang/Runnable;
        //    87: aload           4
        //    89: ifnonnull       113
        //    92: aload_0        
        //    93: getfield        ofl.b:Lofm;
        //    96: iconst_1       
        //    97: putfield        ofm.d:I
        //   100: aload_3        
        //   101: monitorexit    
        //   102: iload_2        
        //   103: ifeq            112
        //   106: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   109: invokevirtual   java/lang/Thread.interrupt:()V
        //   112: return         
        //   113: aload_3        
        //   114: monitorexit    
        //   115: invokestatic    java/lang/Thread.interrupted:()Z
        //   118: istore          5
        //   120: iload_2        
        //   121: iload           5
        //   123: ior            
        //   124: istore_2       
        //   125: aload_0        
        //   126: getfield        ofl.a:Ljava/lang/Runnable;
        //   129: invokeinterface java/lang/Runnable.run:()V
        //   134: aload_0        
        //   135: aconst_null    
        //   136: putfield        ofl.a:Ljava/lang/Runnable;
        //   139: iconst_1       
        //   140: istore_1       
        //   141: goto            4
        //   144: astore_3       
        //   145: goto            250
        //   148: astore_3       
        //   149: goto            235
        //   152: astore          6
        //   154: getstatic       ofm.a:Ljava/util/logging/Logger;
        //   157: astore          4
        //   159: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //   162: astore          7
        //   164: aload_0        
        //   165: getfield        ofl.a:Ljava/lang/Runnable;
        //   168: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   171: astore          8
        //   173: aload           8
        //   175: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   178: invokevirtual   java/lang/String.length:()I
        //   181: istore_1       
        //   182: new             Ljava/lang/StringBuilder;
        //   185: astore_3       
        //   186: aload_3        
        //   187: iload_1        
        //   188: bipush          35
        //   190: iadd           
        //   191: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   194: aload_3        
        //   195: ldc             "Exception while executing runnable "
        //   197: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   200: pop            
        //   201: aload_3        
        //   202: aload           8
        //   204: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   207: pop            
        //   208: aload           4
        //   210: aload           7
        //   212: ldc             "com.google.common.util.concurrent.SequentialExecutor$QueueWorker"
        //   214: ldc             "workOnQueue"
        //   216: aload_3        
        //   217: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   220: aload           6
        //   222: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   225: aload_0        
        //   226: aconst_null    
        //   227: putfield        ofl.a:Ljava/lang/Runnable;
        //   230: iconst_1       
        //   231: istore_1       
        //   232: goto            4
        //   235: aload_0        
        //   236: aconst_null    
        //   237: putfield        ofl.a:Ljava/lang/Runnable;
        //   240: aload_3        
        //   241: athrow         
        //   242: astore          4
        //   244: aload_3        
        //   245: monitorexit    
        //   246: aload           4
        //   248: athrow         
        //   249: astore_3       
        //   250: iload_2        
        //   251: ifeq            260
        //   254: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   257: invokevirtual   java/lang/Thread.interrupt:()V
        //   260: aload_3        
        //   261: athrow         
        //   262: astore          4
        //   264: aload_0        
        //   265: getfield        ofl.b:Lofm;
        //   268: getfield        ofm.b:Ljava/util/Deque;
        //   271: astore_3       
        //   272: aload_3        
        //   273: monitorenter   
        //   274: aload_0        
        //   275: getfield        ofl.b:Lofm;
        //   278: iconst_1       
        //   279: putfield        ofm.d:I
        //   282: aload_3        
        //   283: monitorexit    
        //   284: aload           4
        //   286: athrow         
        //   287: astore          4
        //   289: aload_3        
        //   290: monitorexit    
        //   291: goto            297
        //   294: aload           4
        //   296: athrow         
        //   297: goto            294
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  4      14     249    250    Any
        //  18     35     242    249    Any
        //  39     45     262    300    Ljava/lang/Error;
        //  46     64     242    249    Any
        //  64     87     242    249    Any
        //  92     102    242    249    Any
        //  106    112    262    300    Ljava/lang/Error;
        //  113    115    242    249    Any
        //  115    120    249    250    Any
        //  125    134    152    235    Ljava/lang/RuntimeException;
        //  125    134    148    152    Any
        //  134    139    144    148    Any
        //  154    225    148    152    Any
        //  225    230    144    148    Any
        //  235    242    144    148    Any
        //  244    246    242    249    Any
        //  246    249    249    250    Any
        //  254    260    262    300    Ljava/lang/Error;
        //  260    262    262    300    Ljava/lang/Error;
        //  274    284    287    300    Any
        //  289    291    287    300    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    public final String toString() {
        final Runnable a = this.a;
        if (a != null) {
            final String value = String.valueOf(a);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 34);
            sb.append("SequentialExecutorWorker{running=");
            sb.append(value);
            sb.append("}");
            return sb.toString();
        }
        String s = null;
        switch (this.b.d) {
            default: {
                s = "null";
                break;
            }
            case 4: {
                s = "RUNNING";
                break;
            }
            case 3: {
                s = "QUEUED";
                break;
            }
            case 2: {
                s = "QUEUING";
                break;
            }
            case 1: {
                s = "IDLE";
                break;
            }
        }
        final StringBuilder sb2 = new StringBuilder(s.length() + 32);
        sb2.append("SequentialExecutorWorker{state=");
        sb2.append(s);
        sb2.append("}");
        return sb2.toString();
    }
}
