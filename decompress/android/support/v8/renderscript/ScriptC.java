// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

import android.content.res.Resources;

public class ScriptC extends Script
{
    private static final String TAG = "ScriptC";
    
    public ScriptC(final long n, final RenderScript renderScript) {
        super(n, renderScript);
    }
    
    protected ScriptC(final RenderScript renderScript, final Resources resources, final int n) {
        super(0L, renderScript);
        final long internalCreate = internalCreate(renderScript, resources, n);
        if (internalCreate != 0L) {
            this.setID(internalCreate);
            return;
        }
        throw new RSRuntimeException("Loading of ScriptC script failed.");
    }
    
    protected ScriptC(final RenderScript renderScript, final String s, final byte[] array, final byte[] array2) {
        super(0L, renderScript);
        long id;
        if (RenderScript.sPointerSize == 4) {
            id = internalStringCreate(renderScript, s, array);
        }
        else {
            id = internalStringCreate(renderScript, s, array2);
        }
        if (id != 0L) {
            this.setID(id);
            return;
        }
        throw new RSRuntimeException("Loading of ScriptC script failed.");
    }
    
    private static long internalCreate(final RenderScript p0, final Resources p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: aload_1        
        //     4: iload_2        
        //     5: invokevirtual   android/content/res/Resources.openRawResource:(I)Ljava/io/InputStream;
        //     8: astore_3       
        //     9: sipush          1024
        //    12: newarray        B
        //    14: astore          4
        //    16: iconst_0       
        //    17: istore          5
        //    19: aload           4
        //    21: arraylength    
        //    22: istore          6
        //    24: iload           6
        //    26: iload           5
        //    28: isub           
        //    29: istore          7
        //    31: iload           7
        //    33: ifne            74
        //    36: iload           6
        //    38: iload           6
        //    40: iadd           
        //    41: istore          7
        //    43: iload           7
        //    45: newarray        B
        //    47: astore          8
        //    49: aload           4
        //    51: iconst_0       
        //    52: aload           8
        //    54: iconst_0       
        //    55: iload           6
        //    57: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    60: iload           7
        //    62: iload           5
        //    64: isub           
        //    65: istore          7
        //    67: aload           8
        //    69: astore          4
        //    71: goto            74
        //    74: aload_3        
        //    75: aload           4
        //    77: iload           5
        //    79: iload           7
        //    81: invokevirtual   java/io/InputStream.read:([BII)I
        //    84: istore          7
        //    86: iload           7
        //    88: ifgt            126
        //    91: aload_3        
        //    92: invokevirtual   java/io/InputStream.close:()V
        //    95: aload_0        
        //    96: aload_1        
        //    97: iload_2        
        //    98: invokevirtual   android/content/res/Resources.getResourceEntryName:(I)Ljava/lang/String;
        //   101: aload_0        
        //   102: invokevirtual   android/support/v8/renderscript/RenderScript.getApplicationContext:()Landroid/content/Context;
        //   105: invokevirtual   android/content/Context.getCacheDir:()Ljava/io/File;
        //   108: invokevirtual   java/io/File.toString:()Ljava/lang/String;
        //   111: aload           4
        //   113: iload           5
        //   115: invokevirtual   android/support/v8/renderscript/RenderScript.nScriptCCreate:(Ljava/lang/String;Ljava/lang/String;[BI)J
        //   118: lstore          9
        //   120: ldc             Landroid/support/v8/renderscript/ScriptC;.class
        //   122: monitorexit    
        //   123: lload           9
        //   125: lreturn        
        //   126: iload           5
        //   128: iload           7
        //   130: iadd           
        //   131: istore          5
        //   133: goto            19
        //   136: astore_0       
        //   137: aload_3        
        //   138: invokevirtual   java/io/InputStream.close:()V
        //   141: aload_0        
        //   142: athrow         
        //   143: astore_0       
        //   144: new             Landroid/content/res/Resources$NotFoundException;
        //   147: astore_0       
        //   148: aload_0        
        //   149: invokespecial   android/content/res/Resources$NotFoundException.<init>:()V
        //   152: aload_0        
        //   153: athrow         
        //   154: astore_0       
        //   155: ldc             Landroid/support/v8/renderscript/ScriptC;.class
        //   157: monitorexit    
        //   158: goto            163
        //   161: aload_0        
        //   162: athrow         
        //   163: goto            161
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      9      154    166    Any
        //  9      16     136    143    Any
        //  19     24     136    143    Any
        //  43     60     136    143    Any
        //  74     86     136    143    Any
        //  91     95     143    154    Ljava/io/IOException;
        //  91     95     154    166    Any
        //  95     120    154    166    Any
        //  137    143    143    154    Ljava/io/IOException;
        //  137    143    154    166    Any
        //  144    154    154    166    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0126:
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
    
    private static long internalStringCreate(final RenderScript renderScript, final String s, final byte[] array) {
        synchronized (ScriptC.class) {
            return renderScript.nScriptCCreate(s, renderScript.getApplicationContext().getCacheDir().toString(), array, array.length);
        }
    }
}
