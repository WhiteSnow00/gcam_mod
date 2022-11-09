import android.hardware.camera2.CameraAccessException;
import java.util.concurrent.Executor;
import android.hardware.camera2.CameraManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class deq
{
    private static final nsd c;
    public final Object a;
    public ofn b;
    private final CameraManager d;
    private final oui e;
    private final Executor f;
    private final kuf g;
    
    static {
        c = nsd.g("com/google/android/apps/camera/device/CameraDeviceVerifier");
    }
    
    public deq(final CameraManager d, final oui e, final Executor f, final kuf g) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.a = new Object();
    }
    
    public final dep a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   nry.c:()Lnsu;
        //     6: checkcast       Lnsa;
        //     9: sipush          735
        //    12: invokeinterface nsa.E:(I)Lnsu;
        //    17: checkcast       Lnsa;
        //    20: ldc             "Attempting to reconnect to the camera service with a %dms timeout in %dms increments."
        //    22: sipush          7000
        //    25: sipush          200
        //    28: invokeinterface nsa.s:(Ljava/lang/String;II)V
        //    33: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //    36: dup            
        //    37: iconst_0       
        //    38: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //    41: astore_1       
        //    42: aconst_null    
        //    43: astore_2       
        //    44: aconst_null    
        //    45: astore_3       
        //    46: aconst_null    
        //    47: astore          4
        //    49: new             Lkjk;
        //    52: astore          5
        //    54: aload           5
        //    56: invokespecial   kjk.<init>:()V
        //    59: new             Ldeo;
        //    62: astore          6
        //    64: aload           6
        //    66: aload_1        
        //    67: invokespecial   deo.<init>:(Ljava/util/concurrent/atomic/AtomicBoolean;)V
        //    70: aload_0        
        //    71: getfield        deq.d:Landroid/hardware/camera2/CameraManager;
        //    74: aload           6
        //    76: aload           5
        //    78: ldc             "PollUntilReconnect"
        //    80: invokestatic    kpo.e:(Lkjk;Ljava/lang/String;)Landroid/os/Handler;
        //    83: invokevirtual   android/hardware/camera2/CameraManager.registerAvailabilityCallback:(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;Landroid/os/Handler;)V
        //    86: iconst_0       
        //    87: istore          7
        //    89: iload           7
        //    91: bipush          35
        //    93: if_icmpge       230
        //    96: aload_0        
        //    97: getfield        deq.d:Landroid/hardware/camera2/CameraManager;
        //   100: invokevirtual   android/hardware/camera2/CameraManager.getCameraIdList:()[Ljava/lang/String;
        //   103: astore_2       
        //   104: aload_2        
        //   105: ifnull          217
        //   108: aload_2        
        //   109: arraylength    
        //   110: ifle            217
        //   113: aload_1        
        //   114: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //   117: ifeq            217
        //   120: getstatic       deq.c:Lnsd;
        //   123: invokevirtual   nry.c:()Lnsu;
        //   126: checkcast       Lnsa;
        //   129: sipush          738
        //   132: invokeinterface nsa.E:(I)Lnsu;
        //   137: checkcast       Lnsa;
        //   140: ldc             "Camera Manager reconnect attempted and succeeded after ~%dms"
        //   142: iload           7
        //   144: iconst_1       
        //   145: iadd           
        //   146: sipush          200
        //   149: imul           
        //   150: invokeinterface nsa.p:(Ljava/lang/String;I)V
        //   155: aload_0        
        //   156: getfield        deq.e:Loui;
        //   159: invokeinterface oui.get:()Ljava/lang/Object;
        //   164: checkcast       Lktm;
        //   167: iconst_1       
        //   168: getstatic       kst.b:Lkst;
        //   171: getstatic       kst.b:Lkst;
        //   174: invokevirtual   kst.b:()Ljava/lang/String;
        //   177: iconst_2       
        //   178: invokeinterface ktm.au:(ILkst;Ljava/lang/String;I)V
        //   183: aload_0        
        //   184: getfield        deq.g:Lkuf;
        //   187: invokeinterface kuf.g:()V
        //   192: new             Ldep;
        //   195: astore_2       
        //   196: aload_2        
        //   197: iconst_1       
        //   198: invokespecial   dep.<init>:(Z)V
        //   201: aload           5
        //   203: invokevirtual   kjk.close:()V
        //   206: aload_0        
        //   207: getfield        deq.d:Landroid/hardware/camera2/CameraManager;
        //   210: aload           6
        //   212: invokevirtual   android/hardware/camera2/CameraManager.unregisterAvailabilityCallback:(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V
        //   215: aload_2        
        //   216: areturn        
        //   217: ldc2_w          200
        //   220: iconst_0       
        //   221: invokestatic    java/lang/Thread.sleep:(JI)V
        //   224: iinc            7, 1
        //   227: goto            89
        //   230: getstatic       deq.c:Lnsd;
        //   233: invokevirtual   nry.b:()Lnsu;
        //   236: checkcast       Lnsa;
        //   239: sipush          736
        //   242: invokeinterface nsa.E:(I)Lnsu;
        //   247: checkcast       Lnsa;
        //   250: ldc             "Camera Manager reconnect failed, or there are no cameras on this device."
        //   252: invokeinterface nsa.o:(Ljava/lang/String;)V
        //   257: getstatic       kst.b:Lkst;
        //   260: astore_2       
        //   261: aload_0        
        //   262: getfield        deq.g:Lkuf;
        //   265: getstatic       kst.b:Lkst;
        //   268: invokeinterface kuf.c:(Lkst;)V
        //   273: aload_0        
        //   274: getfield        deq.e:Loui;
        //   277: invokeinterface oui.get:()Ljava/lang/Object;
        //   282: checkcast       Lktm;
        //   285: iconst_2       
        //   286: getstatic       kst.b:Lkst;
        //   289: getstatic       kst.b:Lkst;
        //   292: invokevirtual   kst.b:()Ljava/lang/String;
        //   295: iconst_2       
        //   296: invokeinterface ktm.au:(ILkst;Ljava/lang/String;I)V
        //   301: aload           5
        //   303: invokevirtual   kjk.close:()V
        //   306: aload_0        
        //   307: getfield        deq.d:Landroid/hardware/camera2/CameraManager;
        //   310: aload           6
        //   312: invokevirtual   android/hardware/camera2/CameraManager.unregisterAvailabilityCallback:(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V
        //   315: aload_2        
        //   316: astore          6
        //   318: goto            565
        //   321: astore_2       
        //   322: aload           6
        //   324: astore_3       
        //   325: aload_2        
        //   326: astore          6
        //   328: goto            584
        //   331: astore_2       
        //   332: goto            336
        //   335: astore_2       
        //   336: aload           6
        //   338: astore          4
        //   340: aload_2        
        //   341: astore          6
        //   343: aload           4
        //   345: astore_2       
        //   346: goto            414
        //   349: astore_2       
        //   350: aload           6
        //   352: astore          4
        //   354: aload_2        
        //   355: astore          6
        //   357: aload           4
        //   359: astore_2       
        //   360: goto            368
        //   363: astore          6
        //   365: aload           4
        //   367: astore_2       
        //   368: aload           5
        //   370: invokevirtual   kjk.close:()V
        //   373: goto            387
        //   376: astore          4
        //   378: aload_2        
        //   379: astore_3       
        //   380: aload           6
        //   382: aload           4
        //   384: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   387: aload_2        
        //   388: astore_3       
        //   389: aload           6
        //   391: athrow         
        //   392: astore          6
        //   394: goto            414
        //   397: astore          6
        //   399: goto            414
        //   402: astore          6
        //   404: goto            584
        //   407: astore          6
        //   409: goto            414
        //   412: astore          6
        //   414: aload_2        
        //   415: astore_3       
        //   416: getstatic       deq.c:Lnsd;
        //   419: invokevirtual   nry.b:()Lnsu;
        //   422: checkcast       Lnsa;
        //   425: aload           6
        //   427: invokeinterface nsa.h:(Ljava/lang/Throwable;)Lnsu;
        //   432: checkcast       Lnsa;
        //   435: sipush          737
        //   438: invokeinterface nsa.E:(I)Lnsu;
        //   443: checkcast       Lnsa;
        //   446: ldc             "Camera Manager reconnect failed, or there are no cameras on this device."
        //   448: invokeinterface nsa.o:(Ljava/lang/String;)V
        //   453: aload_2        
        //   454: astore_3       
        //   455: getstatic       kst.m:Lkst;
        //   458: astore          4
        //   460: aload_2        
        //   461: astore_3       
        //   462: aload           6
        //   464: instanceof      Landroid/hardware/camera2/CameraAccessException;
        //   467: ifeq            488
        //   470: aload_2        
        //   471: astore_3       
        //   472: aload           6
        //   474: checkcast       Landroid/hardware/camera2/CameraAccessException;
        //   477: invokevirtual   android/hardware/camera2/CameraAccessException.getReason:()I
        //   480: invokestatic    kst.a:(I)Lkst;
        //   483: astore          4
        //   485: goto            505
        //   488: aload_2        
        //   489: astore_3       
        //   490: aload           6
        //   492: instanceof      Ljava/lang/InterruptedException;
        //   495: ifeq            505
        //   498: aload_2        
        //   499: astore_3       
        //   500: getstatic       kst.b:Lkst;
        //   503: astore          4
        //   505: aload_2        
        //   506: astore_3       
        //   507: aload_0        
        //   508: getfield        deq.g:Lkuf;
        //   511: aload           4
        //   513: invokeinterface kuf.c:(Lkst;)V
        //   518: aload_2        
        //   519: astore_3       
        //   520: aload_0        
        //   521: getfield        deq.e:Loui;
        //   524: invokeinterface oui.get:()Ljava/lang/Object;
        //   529: checkcast       Lktm;
        //   532: iconst_3       
        //   533: aload           4
        //   535: aload           6
        //   537: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   540: iconst_2       
        //   541: invokeinterface ktm.au:(ILkst;Ljava/lang/String;I)V
        //   546: aload_2        
        //   547: ifnull          561
        //   550: aload_0        
        //   551: getfield        deq.d:Landroid/hardware/camera2/CameraManager;
        //   554: aload_2        
        //   555: invokevirtual   android/hardware/camera2/CameraManager.unregisterAvailabilityCallback:(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V
        //   558: goto            561
        //   561: aload           4
        //   563: astore          6
        //   565: new             Ldep;
        //   568: dup            
        //   569: iconst_0       
        //   570: invokespecial   dep.<init>:(Z)V
        //   573: astore_2       
        //   574: aload_2        
        //   575: aload           6
        //   577: putfield        dep.b:Lkst;
        //   580: aload_2        
        //   581: areturn        
        //   582: astore          6
        //   584: aload_3        
        //   585: ifnull          596
        //   588: aload_0        
        //   589: getfield        deq.d:Landroid/hardware/camera2/CameraManager;
        //   592: aload_3        
        //   593: invokevirtual   android/hardware/camera2/CameraManager.unregisterAvailabilityCallback:(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V
        //   596: goto            602
        //   599: aload           6
        //   601: athrow         
        //   602: goto            599
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                            
        //  -----  -----  -----  -----  ------------------------------------------------
        //  49     59     412    414    Landroid/hardware/camera2/CameraAccessException;
        //  49     59     407    412    Ljava/lang/InterruptedException;
        //  49     59     402    407    Any
        //  59     70     363    368    Any
        //  70     86     349    363    Any
        //  96     104    349    363    Any
        //  108    201    349    363    Any
        //  201    206    335    336    Landroid/hardware/camera2/CameraAccessException;
        //  201    206    331    335    Ljava/lang/InterruptedException;
        //  201    206    321    331    Any
        //  217    224    349    363    Any
        //  230    301    349    363    Any
        //  301    306    335    336    Landroid/hardware/camera2/CameraAccessException;
        //  301    306    331    335    Ljava/lang/InterruptedException;
        //  301    306    321    331    Any
        //  368    373    376    387    Any
        //  380    387    397    402    Landroid/hardware/camera2/CameraAccessException;
        //  380    387    392    397    Ljava/lang/InterruptedException;
        //  380    387    582    584    Any
        //  389    392    397    402    Landroid/hardware/camera2/CameraAccessException;
        //  389    392    392    397    Ljava/lang/InterruptedException;
        //  389    392    582    584    Any
        //  416    453    582    584    Any
        //  455    460    582    584    Any
        //  462    470    582    584    Any
        //  472    485    582    584    Any
        //  490    498    582    584    Any
        //  500    505    582    584    Any
        //  507    518    582    584    Any
        //  520    546    582    584    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0387:
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
    
    public final oey b() {
        boolean b = true;
        try {
            final String[] cameraIdList = this.d.getCameraIdList();
            if (cameraIdList != null && cameraIdList.length > 0) {
                this.g.g();
                return ofi.n(new dep(true));
            }
        }
        catch (final CameraAccessException ex) {}
        synchronized (this.a) {
            if (this.b == null) {
                this.b = ofn.f();
            }
            else {
                b = false;
            }
            final ofn b2 = this.b;
            monitorexit(this.a);
            if (b) {
                this.f.execute(new den(this));
            }
            return b2;
        }
    }
}
