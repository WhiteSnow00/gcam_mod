// 
// Decompiled by Procyon v0.6.0
// 

final class aj implements Runnable
{
    final /* synthetic */ an a;
    
    public aj(final an a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        aj.a:Lan;
        //     4: getfield        an.d:Laq;
        //     7: invokevirtual   aq.e:()Ljava/util/concurrent/locks/Lock;
        //    10: astore_1       
        //    11: aload_1        
        //    12: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //    17: aload_0        
        //    18: getfield        aj.a:Lan;
        //    21: astore_2       
        //    22: aload_2        
        //    23: getfield        an.d:Laq;
        //    26: invokevirtual   aq.l:()Z
        //    29: ifne            35
        //    32: goto            70
        //    35: aload_2        
        //    36: getfield        an.f:Z
        //    39: ifne            55
        //    42: aload_2        
        //    43: getfield        an.d:Laq;
        //    46: getfield        aq.b:Lafd;
        //    49: invokeinterface afd.a:()Lafh;
        //    54: pop            
        //    55: aload_2        
        //    56: getfield        an.f:Z
        //    59: ifne            77
        //    62: ldc             "ROOM"
        //    64: ldc             "database is not initialized even though it is open"
        //    66: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    69: pop            
        //    70: aload_1        
        //    71: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    76: return         
        //    77: aload_0        
        //    78: getfield        aj.a:Lan;
        //    81: getfield        an.e:Ljava/util/concurrent/atomic/AtomicBoolean;
        //    84: iconst_1       
        //    85: iconst_0       
        //    86: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.compareAndSet:(ZZ)Z
        //    89: ifne            95
        //    92: goto            70
        //    95: aload_0        
        //    96: getfield        aj.a:Lan;
        //    99: getfield        an.d:Laq;
        //   102: invokevirtual   aq.k:()Z
        //   105: ifeq            111
        //   108: goto            70
        //   111: aload_0        
        //   112: getfield        aj.a:Lan;
        //   115: getfield        an.d:Laq;
        //   118: getfield        aq.b:Lafd;
        //   121: invokeinterface afd.a:()Lafh;
        //   126: astore_3       
        //   127: aload_3        
        //   128: invokevirtual   afh.e:()V
        //   131: new             Ljava/util/HashSet;
        //   134: astore          4
        //   136: aload           4
        //   138: invokespecial   java/util/HashSet.<init>:()V
        //   141: aload_0        
        //   142: getfield        aj.a:Lan;
        //   145: getfield        an.d:Laq;
        //   148: astore          5
        //   150: new             Laey;
        //   153: astore_2       
        //   154: aload_2        
        //   155: ldc             "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
        //   157: invokespecial   aey.<init>:(Ljava/lang/String;)V
        //   160: aload           5
        //   162: aload_2        
        //   163: invokevirtual   aq.o:(Laff;)Landroid/database/Cursor;
        //   166: astore_2       
        //   167: aload_2        
        //   168: invokeinterface android/database/Cursor.moveToNext:()Z
        //   173: ifeq            195
        //   176: aload           4
        //   178: aload_2        
        //   179: iconst_0       
        //   180: invokeinterface android/database/Cursor.getInt:(I)I
        //   185: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   188: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   191: pop            
        //   192: goto            167
        //   195: aload_2        
        //   196: invokeinterface android/database/Cursor.close:()V
        //   201: aload           4
        //   203: invokevirtual   java/util/HashSet.isEmpty:()Z
        //   206: ifne            220
        //   209: aload_0        
        //   210: getfield        aj.a:Lan;
        //   213: getfield        an.j:Lafn;
        //   216: invokevirtual   afn.a:()I
        //   219: pop            
        //   220: aload_3        
        //   221: invokevirtual   afh.h:()V
        //   224: aload_3        
        //   225: invokevirtual   afh.f:()V
        //   228: aload           4
        //   230: astore_3       
        //   231: goto            299
        //   234: astore_2       
        //   235: goto            287
        //   238: astore_2       
        //   239: goto            287
        //   242: astore_2       
        //   243: goto            261
        //   246: astore          4
        //   248: aload_2        
        //   249: invokeinterface android/database/Cursor.close:()V
        //   254: aload           4
        //   256: athrow         
        //   257: astore_2       
        //   258: aconst_null    
        //   259: astore          4
        //   261: aload_3        
        //   262: invokevirtual   afh.f:()V
        //   265: aload_2        
        //   266: athrow         
        //   267: astore_2       
        //   268: goto            287
        //   271: astore_2       
        //   272: goto            287
        //   275: astore_2       
        //   276: goto            505
        //   279: astore_2       
        //   280: goto            284
        //   283: astore_2       
        //   284: aconst_null    
        //   285: astore          4
        //   287: ldc             "ROOM"
        //   289: ldc             "Cannot run invalidation tracker. Is the db closed?"
        //   291: aload_2        
        //   292: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   295: pop            
        //   296: aload           4
        //   298: astore_3       
        //   299: aload_1        
        //   300: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   305: aload_3        
        //   306: ifnull          504
        //   309: aload_3        
        //   310: invokeinterface java/util/Set.isEmpty:()Z
        //   315: ifne            504
        //   318: aload_0        
        //   319: getfield        aj.a:Lan;
        //   322: getfield        an.h:Lxg;
        //   325: astore_1       
        //   326: aload_1        
        //   327: monitorenter   
        //   328: aload_0        
        //   329: getfield        aj.a:Lan;
        //   332: getfield        an.h:Lxg;
        //   335: invokevirtual   xg.iterator:()Ljava/util/Iterator;
        //   338: astore          6
        //   340: aload           6
        //   342: invokeinterface java/util/Iterator.hasNext:()Z
        //   347: ifeq            496
        //   350: aload           6
        //   352: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   357: checkcast       Ljava/util/Map$Entry;
        //   360: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   365: checkcast       Lam;
        //   368: astore          5
        //   370: aload           5
        //   372: getfield        am.a:[I
        //   375: arraylength    
        //   376: istore          7
        //   378: aconst_null    
        //   379: astore_2       
        //   380: iconst_0       
        //   381: istore          8
        //   383: iload           8
        //   385: iload           7
        //   387: if_icmpge       473
        //   390: aload_2        
        //   391: astore          4
        //   393: aload_3        
        //   394: aload           5
        //   396: getfield        am.a:[I
        //   399: iload           8
        //   401: iaload         
        //   402: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   405: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   410: ifeq            464
        //   413: iload           7
        //   415: iconst_1       
        //   416: if_icmpne       429
        //   419: aload           5
        //   421: getfield        am.d:Ljava/util/Set;
        //   424: astore          4
        //   426: goto            464
        //   429: aload_2        
        //   430: astore          4
        //   432: aload_2        
        //   433: ifnonnull       448
        //   436: new             Ljava/util/HashSet;
        //   439: astore          4
        //   441: aload           4
        //   443: iload           7
        //   445: invokespecial   java/util/HashSet.<init>:(I)V
        //   448: aload           4
        //   450: aload           5
        //   452: getfield        am.b:[Ljava/lang/String;
        //   455: iload           8
        //   457: aaload         
        //   458: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   463: pop            
        //   464: iinc            8, 1
        //   467: aload           4
        //   469: astore_2       
        //   470: goto            383
        //   473: aload_2        
        //   474: ifnull          340
        //   477: aload           5
        //   479: getfield        am.c:Lal;
        //   482: getfield        al.b:Loxd;
        //   485: getstatic       ay.a:Ljava/lang/Object;
        //   488: invokeinterface oxd.c:(Ljava/lang/Object;)V
        //   493: goto            340
        //   496: aload_1        
        //   497: monitorexit    
        //   498: return         
        //   499: astore_2       
        //   500: aload_1        
        //   501: monitorexit    
        //   502: aload_2        
        //   503: athrow         
        //   504: return         
        //   505: aload_1        
        //   506: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   511: goto            516
        //   514: aload_2        
        //   515: athrow         
        //   516: goto            514
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  17     32     283    284    Ljava/lang/IllegalStateException;
        //  17     32     279    283    Landroid/database/sqlite/SQLiteException;
        //  17     32     275    519    Any
        //  35     55     283    284    Ljava/lang/IllegalStateException;
        //  35     55     279    283    Landroid/database/sqlite/SQLiteException;
        //  35     55     275    519    Any
        //  55     70     283    284    Ljava/lang/IllegalStateException;
        //  55     70     279    283    Landroid/database/sqlite/SQLiteException;
        //  55     70     275    519    Any
        //  77     92     283    284    Ljava/lang/IllegalStateException;
        //  77     92     279    283    Landroid/database/sqlite/SQLiteException;
        //  77     92     275    519    Any
        //  95     108    283    284    Ljava/lang/IllegalStateException;
        //  95     108    279    283    Landroid/database/sqlite/SQLiteException;
        //  95     108    275    519    Any
        //  111    131    283    284    Ljava/lang/IllegalStateException;
        //  111    131    279    283    Landroid/database/sqlite/SQLiteException;
        //  111    131    275    519    Any
        //  131    167    257    261    Any
        //  167    192    246    257    Any
        //  195    220    257    261    Any
        //  220    224    242    246    Any
        //  224    228    238    242    Ljava/lang/IllegalStateException;
        //  224    228    234    238    Landroid/database/sqlite/SQLiteException;
        //  224    228    275    519    Any
        //  248    257    257    261    Any
        //  261    267    271    275    Ljava/lang/IllegalStateException;
        //  261    267    267    271    Landroid/database/sqlite/SQLiteException;
        //  261    267    275    519    Any
        //  287    296    275    519    Any
        //  328    340    499    504    Any
        //  340    378    499    504    Any
        //  393    413    499    504    Any
        //  419    426    499    504    Any
        //  436    448    499    504    Any
        //  448    464    499    504    Any
        //  477    493    499    504    Any
        //  496    498    499    504    Any
        //  500    502    499    504    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0340:
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
