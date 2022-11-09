import android.database.sqlite.SQLiteDatabase;
import android.database.DatabaseErrorHandler;

// 
// Decompiled by Procyon v0.6.0
// 

final class afi implements DatabaseErrorHandler
{
    final /* synthetic */ afh[] a;
    
    public afi(final afh[] a) {
        this.a = a;
    }
    
    public final void onCorruption(final SQLiteDatabase p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        afi.a:[Lafh;
        //     4: aload_1        
        //     5: invokestatic    afj.b:([Lafh;Landroid/database/sqlite/SQLiteDatabase;)Lafh;
        //     8: astore_2       
        //     9: new             Ljava/lang/StringBuilder;
        //    12: dup            
        //    13: invokespecial   java/lang/StringBuilder.<init>:()V
        //    16: astore_1       
        //    17: aload_1        
        //    18: ldc             "Corruption reported by sqlite on database: "
        //    20: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    23: pop            
        //    24: aload_1        
        //    25: aload_2        
        //    26: invokevirtual   afh.c:()Ljava/lang/String;
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    32: pop            
        //    33: ldc             "SupportSQLite"
        //    35: aload_1        
        //    36: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    39: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    42: pop            
        //    43: aload_2        
        //    44: invokevirtual   afh.j:()Z
        //    47: ifeq            186
        //    50: aconst_null    
        //    51: astore_1       
        //    52: aconst_null    
        //    53: astore_3       
        //    54: aload_2        
        //    55: getfield        afh.a:Landroid/database/sqlite/SQLiteDatabase;
        //    58: invokevirtual   android/database/sqlite/SQLiteDatabase.getAttachedDbs:()Ljava/util/List;
        //    61: astore          4
        //    63: aload           4
        //    65: astore_1       
        //    66: goto            74
        //    69: astore_1       
        //    70: goto            83
        //    73: astore_3       
        //    74: aload_1        
        //    75: astore_3       
        //    76: aload_2        
        //    77: invokevirtual   afh.close:()V
        //    80: goto            134
        //    83: aload_3        
        //    84: ifnull          124
        //    87: aload_3        
        //    88: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    93: astore_3       
        //    94: aload_3        
        //    95: invokeinterface java/util/Iterator.hasNext:()Z
        //   100: ifeq            131
        //   103: aload_3        
        //   104: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   109: checkcast       Landroid/util/Pair;
        //   112: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   115: checkcast       Ljava/lang/String;
        //   118: invokestatic    aez.a:(Ljava/lang/String;)V
        //   121: goto            94
        //   124: aload_2        
        //   125: invokevirtual   afh.c:()Ljava/lang/String;
        //   128: invokestatic    aez.a:(Ljava/lang/String;)V
        //   131: aload_1        
        //   132: athrow         
        //   133: astore_3       
        //   134: aload_1        
        //   135: ifnull          176
        //   138: aload_1        
        //   139: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   144: astore_1       
        //   145: aload_1        
        //   146: invokeinterface java/util/Iterator.hasNext:()Z
        //   151: ifeq            175
        //   154: aload_1        
        //   155: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   160: checkcast       Landroid/util/Pair;
        //   163: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   166: checkcast       Ljava/lang/String;
        //   169: invokestatic    aez.a:(Ljava/lang/String;)V
        //   172: goto            145
        //   175: return         
        //   176: aload_2        
        //   177: invokevirtual   afh.c:()Ljava/lang/String;
        //   180: astore_1       
        //   181: aload_1        
        //   182: invokestatic    aez.a:(Ljava/lang/String;)V
        //   185: return         
        //   186: aload_2        
        //   187: invokevirtual   afh.c:()Ljava/lang/String;
        //   190: astore_1       
        //   191: goto            181
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  54     63     73     74     Landroid/database/sqlite/SQLiteException;
        //  54     63     69     133    Any
        //  76     80     133    134    Ljava/io/IOException;
        //  76     80     69     133    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0083:
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
