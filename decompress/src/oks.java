import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class oks
{
    private static final Logger a;
    private static final String b;
    
    static {
        a = Logger.getLogger(okg.class.getName());
        b = "ojn";
    }
    
    public oks() {
    }
    
    static okm b(final Class p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //     5: astore_1       
        //     6: aload_0        
        //     7: ldc             Lokm;.class
        //     9: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    12: ifeq            22
        //    15: getstatic       oks.b:Ljava/lang/String;
        //    18: astore_2       
        //    19: goto            64
        //    22: aload_0        
        //    23: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    26: ldc             Loks;.class
        //    28: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    31: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    34: ifeq            356
        //    37: ldc             "%s.BlazeGenerated%sLoader"
        //    39: iconst_2       
        //    40: anewarray       Ljava/lang/Object;
        //    43: dup            
        //    44: iconst_0       
        //    45: aload_0        
        //    46: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    49: invokevirtual   java/lang/Package.getName:()Ljava/lang/String;
        //    52: aastore        
        //    53: dup            
        //    54: iconst_1       
        //    55: aload_0        
        //    56: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //    59: aastore        
        //    60: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    63: astore_2       
        //    64: aload_2        
        //    65: iconst_1       
        //    66: aload_1        
        //    67: invokestatic    java/lang/Class.forName:(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
        //    70: astore_2       
        //    71: aload_2        
        //    72: iconst_0       
        //    73: anewarray       Ljava/lang/Class;
        //    76: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    79: iconst_0       
        //    80: anewarray       Ljava/lang/Object;
        //    83: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //    86: checkcast       Loks;
        //    89: astore_2       
        //    90: aload_0        
        //    91: aload_2        
        //    92: invokevirtual   oks.a:()Lokm;
        //    95: invokevirtual   java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        //    98: checkcast       Lokm;
        //   101: areturn        
        //   102: astore_2       
        //   103: new             Ljava/lang/IllegalStateException;
        //   106: astore_3       
        //   107: aload_3        
        //   108: aload_2        
        //   109: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   112: aload_3        
        //   113: athrow         
        //   114: astore_2       
        //   115: new             Ljava/lang/IllegalStateException;
        //   118: astore_3       
        //   119: aload_3        
        //   120: aload_2        
        //   121: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   124: aload_3        
        //   125: athrow         
        //   126: astore_3       
        //   127: new             Ljava/lang/IllegalStateException;
        //   130: astore_2       
        //   131: aload_2        
        //   132: aload_3        
        //   133: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   136: aload_2        
        //   137: athrow         
        //   138: astore_3       
        //   139: new             Ljava/lang/IllegalStateException;
        //   142: astore_2       
        //   143: aload_2        
        //   144: aload_3        
        //   145: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   148: aload_2        
        //   149: athrow         
        //   150: astore_2       
        //   151: ldc             Loks;.class
        //   153: aload_1        
        //   154: invokestatic    java/util/ServiceLoader.load:(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;
        //   157: invokevirtual   java/util/ServiceLoader.iterator:()Ljava/util/Iterator;
        //   160: astore          4
        //   162: new             Ljava/util/ArrayList;
        //   165: dup            
        //   166: invokespecial   java/util/ArrayList.<init>:()V
        //   169: astore_3       
        //   170: aload           4
        //   172: invokeinterface java/util/Iterator.hasNext:()Z
        //   177: ifeq            267
        //   180: aload_3        
        //   181: aload_0        
        //   182: aload           4
        //   184: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   189: checkcast       Loks;
        //   192: invokevirtual   oks.a:()Lokm;
        //   195: invokevirtual   java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        //   198: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   201: pop            
        //   202: goto            170
        //   205: astore          5
        //   207: getstatic       oks.a:Ljava/util/logging/Logger;
        //   210: astore_1       
        //   211: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //   214: astore          6
        //   216: aload_0        
        //   217: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   220: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   223: astore_2       
        //   224: aload_2        
        //   225: invokevirtual   java/lang/String.length:()I
        //   228: ifeq            241
        //   231: ldc             "Unable to load "
        //   233: aload_2        
        //   234: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   237: astore_2       
        //   238: goto            251
        //   241: new             Ljava/lang/String;
        //   244: dup            
        //   245: ldc             "Unable to load "
        //   247: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   250: astore_2       
        //   251: aload_1        
        //   252: aload           6
        //   254: ldc             "com.google.protobuf.GeneratedExtensionRegistryLoader"
        //   256: ldc             "load"
        //   258: aload_2        
        //   259: aload           5
        //   261: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   264: goto            170
        //   267: aload_3        
        //   268: invokevirtual   java/util/ArrayList.size:()I
        //   271: iconst_1       
        //   272: if_icmpne       284
        //   275: aload_3        
        //   276: iconst_0       
        //   277: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   280: checkcast       Lokm;
        //   283: areturn        
        //   284: aload_3        
        //   285: invokevirtual   java/util/ArrayList.size:()I
        //   288: ifne            293
        //   291: aconst_null    
        //   292: areturn        
        //   293: aload_0        
        //   294: ldc             "combine"
        //   296: iconst_1       
        //   297: anewarray       Ljava/lang/Class;
        //   300: dup            
        //   301: iconst_0       
        //   302: ldc             Ljava/util/Collection;.class
        //   304: aastore        
        //   305: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   308: aconst_null    
        //   309: iconst_1       
        //   310: anewarray       Ljava/lang/Object;
        //   313: dup            
        //   314: iconst_0       
        //   315: aload_3        
        //   316: aastore        
        //   317: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   320: checkcast       Lokm;
        //   323: astore_0       
        //   324: aload_0        
        //   325: areturn        
        //   326: astore_0       
        //   327: new             Ljava/lang/IllegalStateException;
        //   330: dup            
        //   331: aload_0        
        //   332: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   335: athrow         
        //   336: astore_0       
        //   337: new             Ljava/lang/IllegalStateException;
        //   340: dup            
        //   341: aload_0        
        //   342: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   345: athrow         
        //   346: astore_0       
        //   347: new             Ljava/lang/IllegalStateException;
        //   350: dup            
        //   351: aload_0        
        //   352: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   355: athrow         
        //   356: new             Ljava/lang/IllegalArgumentException;
        //   359: dup            
        //   360: aload_0        
        //   361: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   364: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   367: astore_0       
        //   368: goto            373
        //   371: aload_0        
        //   372: athrow         
        //   373: goto            371
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  64     71     150    356    Ljava/lang/ClassNotFoundException;
        //  71     90     138    150    Ljava/lang/NoSuchMethodException;
        //  71     90     126    138    Ljava/lang/InstantiationException;
        //  71     90     114    126    Ljava/lang/IllegalAccessException;
        //  71     90     102    114    Ljava/lang/reflect/InvocationTargetException;
        //  71     90     150    356    Ljava/lang/ClassNotFoundException;
        //  90     102    150    356    Ljava/lang/ClassNotFoundException;
        //  103    114    150    356    Ljava/lang/ClassNotFoundException;
        //  115    126    150    356    Ljava/lang/ClassNotFoundException;
        //  127    138    150    356    Ljava/lang/ClassNotFoundException;
        //  139    150    150    356    Ljava/lang/ClassNotFoundException;
        //  180    202    205    267    Ljava/util/ServiceConfigurationError;
        //  293    324    346    356    Ljava/lang/NoSuchMethodException;
        //  293    324    336    346    Ljava/lang/IllegalAccessException;
        //  293    324    326    336    Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 200, Size: 200
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
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
    
    protected abstract okm a();
}
