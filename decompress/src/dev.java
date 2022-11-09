import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dev
{
    private final HashMap a;
    private final HashMap b;
    
    public dev() {
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    private static final hbj e(Future o) {
        final Future future = null;
        if (o != null) {
            if (((Future)o).isDone()) {
                try {
                    o = ((Future)o).get();
                    return (hbj)o;
                }
                catch (final InterruptedException o) {}
                catch (final ExecutionException o) {}
                catch (final CancellationException ex) {}
                if (o instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                    return null;
                }
                o = future;
            }
            else {
                ((Future)o).cancel(true);
                o = future;
            }
        }
        else {
            o = future;
        }
        return (hbj)o;
    }
    
    public final niz a(final him p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        dev.a:Ljava/util/HashMap;
        //     6: aload_1        
        //     7: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    10: checkcast       Ljava/util/concurrent/Future;
        //    13: astore_2       
        //    14: aload_0        
        //    15: getfield        dev.b:Ljava/util/HashMap;
        //    18: aload_1        
        //    19: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    22: checkcast       Ljava/util/concurrent/Future;
        //    25: astore_3       
        //    26: aload_0        
        //    27: monitorexit    
        //    28: aload_2        
        //    29: ifnull          179
        //    32: aload_2        
        //    33: invokeinterface java/util/concurrent/Future.get:()Ljava/lang/Object;
        //    38: checkcast       Lcom/google/android/apps/camera/dynamicdepth/DynamicDepthResult;
        //    41: astore_2       
        //    42: aload_3        
        //    43: invokestatic    dev.e:(Ljava/util/concurrent/Future;)Lhbj;
        //    46: astore_3       
        //    47: new             Ldeu;
        //    50: astore          4
        //    52: aload           4
        //    54: aload_2        
        //    55: aload_3        
        //    56: invokespecial   deu.<init>:(Lcom/google/android/apps/camera/dynamicdepth/DynamicDepthResult;Lhbj;)V
        //    59: aload           4
        //    61: invokestatic    niz.i:(Ljava/lang/Object;)Lniz;
        //    64: astore_2       
        //    65: aload_0        
        //    66: monitorenter   
        //    67: aload_0        
        //    68: getfield        dev.a:Ljava/util/HashMap;
        //    71: aload_1        
        //    72: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    75: pop            
        //    76: aload_0        
        //    77: getfield        dev.b:Ljava/util/HashMap;
        //    80: aload_1        
        //    81: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //    84: pop            
        //    85: aload_0        
        //    86: monitorexit    
        //    87: aload_2        
        //    88: areturn        
        //    89: astore_1       
        //    90: aload_0        
        //    91: monitorexit    
        //    92: aload_1        
        //    93: athrow         
        //    94: astore_2       
        //    95: goto            150
        //    98: astore_2       
        //    99: goto            107
        //   102: astore_2       
        //   103: goto            107
        //   106: astore_2       
        //   107: aload_2        
        //   108: instanceof      Ljava/lang/InterruptedException;
        //   111: ifeq            120
        //   114: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   117: invokevirtual   java/lang/Thread.interrupt:()V
        //   120: aload_0        
        //   121: monitorenter   
        //   122: aload_0        
        //   123: getfield        dev.a:Ljava/util/HashMap;
        //   126: aload_1        
        //   127: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   130: pop            
        //   131: aload_0        
        //   132: getfield        dev.b:Ljava/util/HashMap;
        //   135: aload_1        
        //   136: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   139: pop            
        //   140: aload_0        
        //   141: monitorexit    
        //   142: goto            179
        //   145: astore_1       
        //   146: aload_0        
        //   147: monitorexit    
        //   148: aload_1        
        //   149: athrow         
        //   150: aload_0        
        //   151: monitorenter   
        //   152: aload_0        
        //   153: getfield        dev.a:Ljava/util/HashMap;
        //   156: aload_1        
        //   157: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   160: pop            
        //   161: aload_0        
        //   162: getfield        dev.b:Ljava/util/HashMap;
        //   165: aload_1        
        //   166: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   169: pop            
        //   170: aload_0        
        //   171: monitorexit    
        //   172: aload_2        
        //   173: athrow         
        //   174: astore_1       
        //   175: aload_0        
        //   176: monitorexit    
        //   177: aload_1        
        //   178: athrow         
        //   179: getstatic       nii.a:Lnii;
        //   182: areturn        
        //   183: astore_1       
        //   184: aload_0        
        //   185: monitorexit    
        //   186: aload_1        
        //   187: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                        
        //  -----  -----  -----  -----  --------------------------------------------
        //  2      28     183    188    Any
        //  32     65     106    107    Ljava/lang/InterruptedException;
        //  32     65     102    106    Ljava/util/concurrent/ExecutionException;
        //  32     65     98     102    Ljava/util/concurrent/CancellationException;
        //  32     65     94     179    Any
        //  67     87     89     94     Any
        //  90     92     89     94     Any
        //  107    120    94     179    Any
        //  122    142    145    150    Any
        //  146    148    145    150    Any
        //  152    172    174    179    Any
        //  175    177    174    179    Any
        //  184    186    183    188    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 115, Size: 115
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
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
    
    public final void b(final him him) {
        synchronized (this) {
            this.a.put(him, ofn.f());
            this.b.put(him, ofn.f());
        }
    }
    
    public final void c(final him him, final niz niz) {
        synchronized (this) {
            final ofn ofn = this.a.get(him);
            monitorexit(this);
            if (ofn != null) {
                if (niz.g()) {
                    ofn.o(niz.c());
                    return;
                }
                synchronized (this) {
                    this.a.remove(him);
                    final hbj e = e(this.b.remove(him));
                    if (e != null) {
                        e.close();
                    }
                    monitorexit(this);
                    ofn.cancel(true);
                    return;
                }
            }
            final String value = String.valueOf(him);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 16);
            sb.append("Shot not found: ");
            sb.append(value);
            throw new NoSuchElementException(sb.toString());
        }
    }
    
    public final void d(final him him, final hbj hbj) {
        synchronized (this) {
            final ofn ofn = this.b.get(him);
            monitorexit(this);
            if (ofn == null) {
                if (hbj != null) {
                    hbj.close();
                }
                return;
            }
            ofn.o(hbj);
        }
    }
}
