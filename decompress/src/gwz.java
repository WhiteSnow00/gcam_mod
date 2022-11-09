import android.content.Intent;
import android.content.Context;
import com.google.android.apps.camera.processing.ProcessingService;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwz extends BroadcastReceiver
{
    final /* synthetic */ ProcessingService a;
    
    public gwz(final ProcessingService a) {
        this.a = a;
    }
    
    public final void onReceive(final Context p0, final Intent p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aload_2        
        //     3: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //     6: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //     9: ifeq            71
        //    12: aload_0        
        //    13: getfield        gwz.a:Lcom/google/android/apps/camera/processing/ProcessingService;
        //    16: astore_2       
        //    17: aload_2        
        //    18: getfield        com/google/android/apps/camera/processing/ProcessingService.f:Ljava/lang/Object;
        //    21: astore_1       
        //    22: aload_1        
        //    23: monitorenter   
        //    24: aload_2        
        //    25: iconst_0       
        //    26: putfield        com/google/android/apps/camera/processing/ProcessingService.g:Z
        //    29: aload_1        
        //    30: monitorexit    
        //    31: aload_2        
        //    32: getfield        com/google/android/apps/camera/processing/ProcessingService.b:Ljava/lang/Object;
        //    35: astore_1       
        //    36: aload_1        
        //    37: monitorenter   
        //    38: aload_2        
        //    39: iconst_1       
        //    40: putfield        com/google/android/apps/camera/processing/ProcessingService.e:Z
        //    43: aload_2        
        //    44: getfield        com/google/android/apps/camera/processing/ProcessingService.d:Lgxc;
        //    47: astore_2       
        //    48: aload_2        
        //    49: ifnull          58
        //    52: aload_2        
        //    53: invokeinterface gxc.g:()V
        //    58: aload_1        
        //    59: monitorexit    
        //    60: return         
        //    61: astore_2       
        //    62: aload_1        
        //    63: monitorexit    
        //    64: aload_2        
        //    65: athrow         
        //    66: astore_2       
        //    67: aload_1        
        //    68: monitorexit    
        //    69: aload_2        
        //    70: athrow         
        //    71: ldc             "com.google.android.apps.camera.legacy.app.processing.RESUME"
        //    73: aload_2        
        //    74: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    77: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    80: ifeq            142
        //    83: aload_0        
        //    84: getfield        gwz.a:Lcom/google/android/apps/camera/processing/ProcessingService;
        //    87: astore_2       
        //    88: aload_2        
        //    89: getfield        com/google/android/apps/camera/processing/ProcessingService.f:Ljava/lang/Object;
        //    92: astore_1       
        //    93: aload_1        
        //    94: monitorenter   
        //    95: aload_2        
        //    96: iconst_1       
        //    97: putfield        com/google/android/apps/camera/processing/ProcessingService.g:Z
        //   100: aload_1        
        //   101: monitorexit    
        //   102: aload_2        
        //   103: getfield        com/google/android/apps/camera/processing/ProcessingService.b:Ljava/lang/Object;
        //   106: astore_1       
        //   107: aload_1        
        //   108: monitorenter   
        //   109: aload_2        
        //   110: iconst_0       
        //   111: putfield        com/google/android/apps/camera/processing/ProcessingService.e:Z
        //   114: aload_2        
        //   115: getfield        com/google/android/apps/camera/processing/ProcessingService.d:Lgxc;
        //   118: astore_2       
        //   119: aload_2        
        //   120: ifnull          129
        //   123: aload_2        
        //   124: invokeinterface gxc.f:()V
        //   129: aload_1        
        //   130: monitorexit    
        //   131: return         
        //   132: astore_2       
        //   133: aload_1        
        //   134: monitorexit    
        //   135: aload_2        
        //   136: athrow         
        //   137: astore_2       
        //   138: aload_1        
        //   139: monitorexit    
        //   140: aload_2        
        //   141: athrow         
        //   142: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  24     31     66     71     Any
        //  38     48     61     66     Any
        //  52     58     61     66     Any
        //  58     60     61     66     Any
        //  62     64     61     66     Any
        //  67     69     66     71     Any
        //  95     102    137    142    Any
        //  109    119    132    137    Any
        //  123    129    132    137    Any
        //  129    131    132    137    Any
        //  133    135    132    137    Any
        //  138    140    137    142    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.NameVariables.generateNameForVariable(NameVariables.java:252)
        //     at com.strobel.decompiler.languages.java.ast.NameVariables.assignNamesToVariables(NameVariables.java:175)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.nameVariables(AstMethodBodyBuilder.java:1482)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.populateVariables(AstMethodBodyBuilder.java:1408)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
