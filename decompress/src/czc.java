import android.os.ParcelFileDescriptor;
import android.net.Uri;
import android.content.Context;
import android.content.UriMatcher;
import android.content.ContentProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czc
{
    public final ContentProvider a;
    public final UriMatcher b;
    public final kse c;
    public final drd d;
    public final dry e;
    private final Context f;
    private final cza g;
    
    public czc(final ContentProvider a, final Context f, final drd d, final cza g, final dry e, final UriMatcher b, final kse c) {
        this.a = a;
        this.f = f;
        this.d = d;
        this.g = g;
        this.e = e;
        this.b = b;
        this.c = c;
    }
    
    public final ParcelFileDescriptor a(final Uri p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/net/Uri.getPathSegments:()Ljava/util/List;
        //     4: iconst_1       
        //     5: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    10: checkcast       Ljava/lang/String;
        //    13: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    16: istore_3       
        //    17: aload_0        
        //    18: getfield        czc.g:Lcza;
        //    21: astore_1       
        //    22: aload_0        
        //    23: getfield        czc.f:Landroid/content/Context;
        //    26: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    29: iload_2        
        //    30: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //    33: istore          4
        //    35: aload_1        
        //    36: getfield        cza.a:Landroid/content/Context;
        //    39: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    42: astore_1       
        //    43: aconst_null    
        //    44: astore          5
        //    46: aconst_null    
        //    47: astore          6
        //    49: aload_1        
        //    50: iload_3        
        //    51: aconst_null    
        //    52: invokevirtual   android/content/res/Resources.getDrawable:(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
        //    55: astore          7
        //    57: aload           7
        //    59: ifnull          568
        //    62: aload           7
        //    64: instanceof      Landroid/graphics/drawable/BitmapDrawable;
        //    67: ifeq            82
        //    70: aload           7
        //    72: checkcast       Landroid/graphics/drawable/BitmapDrawable;
        //    75: invokevirtual   android/graphics/drawable/BitmapDrawable.getBitmap:()Landroid/graphics/Bitmap;
        //    78: astore_1       
        //    79: goto            133
        //    82: aload           7
        //    84: invokevirtual   android/graphics/drawable/Drawable.getIntrinsicWidth:()I
        //    87: aload           7
        //    89: invokevirtual   android/graphics/drawable/Drawable.getIntrinsicHeight:()I
        //    92: getstatic       android/graphics/Bitmap$Config.ARGB_8888:Landroid/graphics/Bitmap$Config;
        //    95: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //    98: astore_1       
        //    99: new             Landroid/graphics/Canvas;
        //   102: dup            
        //   103: aload_1        
        //   104: invokespecial   android/graphics/Canvas.<init>:(Landroid/graphics/Bitmap;)V
        //   107: astore          8
        //   109: aload           7
        //   111: iconst_0       
        //   112: iconst_0       
        //   113: aload           8
        //   115: invokevirtual   android/graphics/Canvas.getWidth:()I
        //   118: aload           8
        //   120: invokevirtual   android/graphics/Canvas.getHeight:()I
        //   123: invokevirtual   android/graphics/drawable/Drawable.setBounds:(IIII)V
        //   126: aload           7
        //   128: aload           8
        //   130: invokevirtual   android/graphics/drawable/Drawable.draw:(Landroid/graphics/Canvas;)V
        //   133: aload_1        
        //   134: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   137: pop            
        //   138: aload_1        
        //   139: iload           4
        //   141: iload           4
        //   143: iconst_0       
        //   144: invokestatic    android/graphics/Bitmap.createScaledBitmap:(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
        //   147: astore_1       
        //   148: aload_1        
        //   149: astore          8
        //   151: iload_2        
        //   152: ldc             2131166144
        //   154: if_icmpne       315
        //   157: aload_1        
        //   158: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   161: aload_1        
        //   162: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   165: aload_1        
        //   166: invokevirtual   android/graphics/Bitmap.getConfig:()Landroid/graphics/Bitmap$Config;
        //   169: invokestatic    android/graphics/Bitmap.createBitmap:(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
        //   172: astore          8
        //   174: new             Landroid/graphics/Canvas;
        //   177: dup            
        //   178: aload           8
        //   180: invokespecial   android/graphics/Canvas.<init>:(Landroid/graphics/Bitmap;)V
        //   183: astore          7
        //   185: new             Landroid/graphics/Paint;
        //   188: dup            
        //   189: invokespecial   android/graphics/Paint.<init>:()V
        //   192: astore          9
        //   194: aload           9
        //   196: new             Landroid/graphics/ColorMatrixColorFilter;
        //   199: dup            
        //   200: bipush          20
        //   202: newarray        F
        //   204: dup            
        //   205: iconst_0       
        //   206: fconst_0       
        //   207: fastore        
        //   208: dup            
        //   209: iconst_1       
        //   210: fconst_0       
        //   211: fastore        
        //   212: dup            
        //   213: iconst_2       
        //   214: fconst_0       
        //   215: fastore        
        //   216: dup            
        //   217: iconst_3       
        //   218: fconst_0       
        //   219: fastore        
        //   220: dup            
        //   221: iconst_4       
        //   222: fconst_0       
        //   223: fastore        
        //   224: dup            
        //   225: iconst_5       
        //   226: fconst_0       
        //   227: fastore        
        //   228: dup            
        //   229: bipush          6
        //   231: fconst_0       
        //   232: fastore        
        //   233: dup            
        //   234: bipush          7
        //   236: fconst_0       
        //   237: fastore        
        //   238: dup            
        //   239: bipush          8
        //   241: fconst_0       
        //   242: fastore        
        //   243: dup            
        //   244: bipush          9
        //   246: fconst_0       
        //   247: fastore        
        //   248: dup            
        //   249: bipush          10
        //   251: fconst_0       
        //   252: fastore        
        //   253: dup            
        //   254: bipush          11
        //   256: fconst_0       
        //   257: fastore        
        //   258: dup            
        //   259: bipush          12
        //   261: fconst_0       
        //   262: fastore        
        //   263: dup            
        //   264: bipush          13
        //   266: fconst_0       
        //   267: fastore        
        //   268: dup            
        //   269: bipush          14
        //   271: fconst_0       
        //   272: fastore        
        //   273: dup            
        //   274: bipush          15
        //   276: fconst_0       
        //   277: fastore        
        //   278: dup            
        //   279: bipush          16
        //   281: fconst_0       
        //   282: fastore        
        //   283: dup            
        //   284: bipush          17
        //   286: fconst_0       
        //   287: fastore        
        //   288: dup            
        //   289: bipush          18
        //   291: fconst_1       
        //   292: fastore        
        //   293: dup            
        //   294: bipush          19
        //   296: fconst_0       
        //   297: fastore        
        //   298: invokespecial   android/graphics/ColorMatrixColorFilter.<init>:([F)V
        //   301: invokevirtual   android/graphics/Paint.setColorFilter:(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
        //   304: pop            
        //   305: aload           7
        //   307: aload_1        
        //   308: fconst_0       
        //   309: fconst_0       
        //   310: aload           9
        //   312: invokevirtual   android/graphics/Canvas.drawBitmap:(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
        //   315: getstatic       android/graphics/Bitmap$CompressFormat.PNG:Landroid/graphics/Bitmap$CompressFormat;
        //   318: astore          10
        //   320: invokestatic    android/os/ParcelFileDescriptor.createPipe:()[Landroid/os/ParcelFileDescriptor;
        //   323: astore_1       
        //   324: aload_1        
        //   325: iconst_0       
        //   326: aaload         
        //   327: astore          9
        //   329: aload_1        
        //   330: iconst_1       
        //   331: aaload         
        //   332: astore_1       
        //   333: new             Ljava/io/BufferedOutputStream;
        //   336: astore          7
        //   338: new             Ljava/io/FileOutputStream;
        //   341: astore          11
        //   343: aload           11
        //   345: aload_1        
        //   346: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //   349: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/FileDescriptor;)V
        //   352: aload           7
        //   354: aload           11
        //   356: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   359: aload           8
        //   361: aload           10
        //   363: bipush          100
        //   365: aload           7
        //   367: invokevirtual   android/graphics/Bitmap.compress:(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        //   370: pop            
        //   371: aload           7
        //   373: invokevirtual   java/io/OutputStream.close:()V
        //   376: aload           7
        //   378: invokevirtual   java/io/OutputStream.close:()V
        //   381: goto            386
        //   384: astore          7
        //   386: aload_1        
        //   387: ifnull          398
        //   390: aload_1        
        //   391: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   394: goto            398
        //   397: astore_1       
        //   398: aload           9
        //   400: areturn        
        //   401: astore          5
        //   403: aload           7
        //   405: astore          8
        //   407: aload_1        
        //   408: astore          7
        //   410: aload           5
        //   412: astore_1       
        //   413: goto            465
        //   416: astore          6
        //   418: aload_1        
        //   419: astore          8
        //   421: aload           7
        //   423: astore          5
        //   425: aload           6
        //   427: astore_1       
        //   428: goto            501
        //   431: astore          5
        //   433: aload_1        
        //   434: astore          7
        //   436: aload           6
        //   438: astore          8
        //   440: aload           5
        //   442: astore_1       
        //   443: goto            465
        //   446: astore          7
        //   448: aload_1        
        //   449: astore          8
        //   451: aload           7
        //   453: astore_1       
        //   454: goto            501
        //   457: astore_1       
        //   458: aconst_null    
        //   459: astore          7
        //   461: aload           6
        //   463: astore          8
        //   465: aload           8
        //   467: ifnull          480
        //   470: aload           8
        //   472: invokevirtual   java/io/OutputStream.close:()V
        //   475: goto            480
        //   478: astore          8
        //   480: aload           7
        //   482: ifnull          495
        //   485: aload           7
        //   487: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   490: goto            495
        //   493: astore          7
        //   495: aload_1        
        //   496: athrow         
        //   497: astore_1       
        //   498: aconst_null    
        //   499: astore          8
        //   501: aload_1        
        //   502: astore          7
        //   504: aload           5
        //   506: ifnull          522
        //   509: aload           5
        //   511: invokevirtual   java/io/OutputStream.close:()V
        //   514: aload_1        
        //   515: astore          7
        //   517: goto            522
        //   520: astore          7
        //   522: aload           7
        //   524: astore_1       
        //   525: aload           8
        //   527: ifnull          542
        //   530: aload           8
        //   532: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   535: aload           7
        //   537: astore_1       
        //   538: goto            542
        //   541: astore_1       
        //   542: aload_1        
        //   543: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   546: astore_1       
        //   547: aload_1        
        //   548: ifnull          560
        //   551: new             Ljava/io/FileNotFoundException;
        //   554: dup            
        //   555: aload_1        
        //   556: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   559: athrow         
        //   560: new             Ljava/io/FileNotFoundException;
        //   563: dup            
        //   564: invokespecial   java/io/FileNotFoundException.<init>:()V
        //   567: athrow         
        //   568: new             Ljava/lang/StringBuilder;
        //   571: dup            
        //   572: bipush          37
        //   574: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   577: astore_1       
        //   578: aload_1        
        //   579: ldc             "resource is not found for "
        //   581: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   584: pop            
        //   585: aload_1        
        //   586: iload_3        
        //   587: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   590: pop            
        //   591: new             Ljava/io/FileNotFoundException;
        //   594: dup            
        //   595: aload_1        
        //   596: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   599: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   602: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  320    324    497    501    Ljava/io/IOException;
        //  320    324    457    465    Any
        //  333    359    446    457    Ljava/io/IOException;
        //  333    359    431    446    Any
        //  359    376    416    431    Ljava/io/IOException;
        //  359    376    401    416    Any
        //  376    381    384    386    Ljava/io/IOException;
        //  390    394    397    398    Ljava/io/IOException;
        //  470    475    478    480    Ljava/io/IOException;
        //  485    490    493    495    Ljava/io/IOException;
        //  509    514    520    522    Ljava/io/IOException;
        //  530    535    541    542    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 335, Size: 335
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
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
}
