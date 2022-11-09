// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.performance.primes.transmitter;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class LifeboatReceiver extends BroadcastReceiver
{
    public final void onReceive(final Context p0, final Intent p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "MetricSnapshot"
        //     3: invokevirtual   android/content/Intent.hasExtra:(Ljava/lang/String;)Z
        //     6: ifeq            231
        //     9: aload_2        
        //    10: ldc             "Transmitters"
        //    12: invokevirtual   android/content/Intent.hasExtra:(Ljava/lang/String;)Z
        //    15: ifne            21
        //    18: goto            231
        //    21: aload_2        
        //    22: ldc             "MetricSnapshot"
        //    24: invokevirtual   android/content/Intent.getByteArrayExtra:(Ljava/lang/String;)[B
        //    27: astore_3       
        //    28: aload_3        
        //    29: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    32: pop            
        //    33: aload_3        
        //    34: checkcast       [B
        //    37: astore_3       
        //    38: invokestatic    okm.b:()Lokm;
        //    41: astore          4
        //    43: getstatic       mmt.c:Lmmt;
        //    46: aload_3        
        //    47: aload           4
        //    49: invokestatic    oky.t:(Loky;[BLokm;)Loky;
        //    52: checkcast       Lmmt;
        //    55: astore          4
        //    57: aload_0        
        //    58: invokevirtual   com/google/android/libraries/performance/primes/transmitter/LifeboatReceiver.goAsync:()Landroid/content/BroadcastReceiver$PendingResult;
        //    61: astore_3       
        //    62: aload_2        
        //    63: ldc             "Transmitters"
        //    65: invokevirtual   android/content/Intent.getStringArrayExtra:(Ljava/lang/String;)[Ljava/lang/String;
        //    68: astore_2       
        //    69: aload_2        
        //    70: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    73: pop            
        //    74: aload_2        
        //    75: checkcast       [Ljava/lang/String;
        //    78: astore_2       
        //    79: aload_2        
        //    80: arraylength    
        //    81: istore          5
        //    83: new             Ljava/util/ArrayList;
        //    86: dup            
        //    87: iload           5
        //    89: invokespecial   java/util/ArrayList.<init>:(I)V
        //    92: astore          6
        //    94: iconst_0       
        //    95: istore          7
        //    97: iload           7
        //    99: iload           5
        //   101: if_icmpge       191
        //   104: aload_2        
        //   105: iload           7
        //   107: aaload         
        //   108: astore          8
        //   110: aload           8
        //   112: invokestatic    java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
        //   115: iconst_0       
        //   116: anewarray       Ljava/lang/Class;
        //   119: invokevirtual   java/lang/Class.getDeclaredConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //   122: astore          9
        //   124: aload           9
        //   126: iconst_1       
        //   127: invokevirtual   java/lang/reflect/Constructor.setAccessible:(Z)V
        //   130: aload           6
        //   132: aload           9
        //   134: iconst_0       
        //   135: anewarray       Ljava/lang/Object;
        //   138: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   141: checkcast       Lmmv;
        //   144: aload_1        
        //   145: aload           4
        //   147: invokeinterface mmv.a:(Landroid/content/Context;Lmmt;)Loey;
        //   152: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   157: pop            
        //   158: goto            185
        //   161: astore          9
        //   163: ldc             "PrimesLifeboatReceiver"
        //   165: ldc             "Unable to transmit the crash using %s."
        //   167: iconst_1       
        //   168: anewarray       Ljava/lang/Object;
        //   171: dup            
        //   172: iconst_0       
        //   173: aload           8
        //   175: aastore        
        //   176: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   179: aload           9
        //   181: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   184: pop            
        //   185: iinc            7, 1
        //   188: goto            97
        //   191: aload           6
        //   193: invokestatic    ofi.s:(Ljava/lang/Iterable;)Loey;
        //   196: astore_1       
        //   197: aload_3        
        //   198: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   201: pop            
        //   202: aload_1        
        //   203: new             Lmms;
        //   206: dup            
        //   207: aload_3        
        //   208: invokespecial   mms.<init>:(Landroid/content/BroadcastReceiver$PendingResult;)V
        //   211: getstatic       odx.a:Lodx;
        //   214: invokeinterface oey.d:(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
        //   219: return         
        //   220: astore_1       
        //   221: ldc             "PrimesLifeboatReceiver"
        //   223: ldc             "Unable to parse the payload of MetricSnapshot."
        //   225: aload_1        
        //   226: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   229: pop            
        //   230: return         
        //   231: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type 
        //  -----  -----  -----  -----  -----
        //  38     57     220    231    Lolm;
        //  110    158    161    185    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
}
