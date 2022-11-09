import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import android.hardware.SensorManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lgn implements lgr
{
    public final krr a;
    public lgm b;
    private final SensorManager c;
    private final Set d;
    
    public lgn(final SensorManager c, final krr krr) {
        this.c = c;
        this.a = krr.a("DirectGyro");
        this.d = new HashSet();
        this.b = null;
    }
    
    private final void c() {
        synchronized (this) {
            this.a.b("Shutting down gyro direct channel");
            final lgm b = this.b;
            if (b != null) {
                if (b.b.configure(b.c, 0) == 0) {
                    this.a.d("Failed to stop direct gyro provider: Unable to configure gyro direct channel.");
                }
                else {
                    this.a.b("Stopped gyro direct channel successfully.");
                }
                b.b.close();
                b.a.a();
                this.b = null;
                return;
            }
            this.a.h("Failed to stop direct gyro provider: Already stopped");
        }
    }
    
    private final void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        lgn.a:Lkrr;
        //     6: ldc             "Starting up gyro direct channel"
        //     8: invokeinterface krr.b:(Ljava/lang/String;)V
        //    13: aload_0        
        //    14: getfield        lgn.b:Llgm;
        //    17: ifnull          34
        //    20: aload_0        
        //    21: getfield        lgn.a:Lkrr;
        //    24: ldc             "Failed to start direct gyro provider: Already running."
        //    26: invokeinterface krr.h:(Ljava/lang/String;)V
        //    31: aload_0        
        //    32: monitorexit    
        //    33: return         
        //    34: ldc             624000
        //    36: iconst_1       
        //    37: bipush          33
        //    39: iconst_1       
        //    40: ldc2_w          25165827
        //    43: invokestatic    android/hardware/HardwareBuffer.create:(IIIIJ)Landroid/hardware/HardwareBuffer;
        //    46: astore_1       
        //    47: aload_1        
        //    48: ifnonnull       65
        //    51: aload_0        
        //    52: getfield        lgn.a:Lkrr;
        //    55: ldc             "Failed to start direct gyro provider: Hardware Buffer returned null."
        //    57: invokeinterface krr.d:(Ljava/lang/String;)V
        //    62: aload_0        
        //    63: monitorexit    
        //    64: return         
        //    65: new             Llgx;
        //    68: astore_2       
        //    69: aload_2        
        //    70: aload_1        
        //    71: invokespecial   lgx.<init>:(Landroid/hardware/HardwareBuffer;)V
        //    74: aconst_null    
        //    75: astore_3       
        //    76: aconst_null    
        //    77: astore          4
        //    79: new             Llgo;
        //    82: astore          5
        //    84: aload           5
        //    86: aload_2        
        //    87: invokespecial   lgo.<init>:(Llgx;)V
        //    90: aload_0        
        //    91: getfield        lgn.c:Landroid/hardware/SensorManager;
        //    94: aload_1        
        //    95: invokevirtual   android/hardware/SensorManager.createDirectChannel:(Landroid/hardware/HardwareBuffer;)Landroid/hardware/SensorDirectChannel;
        //    98: astore_1       
        //    99: aload_1        
        //   100: ifnonnull       136
        //   103: aload_0        
        //   104: getfield        lgn.a:Lkrr;
        //   107: ldc             "Failed to start direct gyro provider: Creating direct channel returned null"
        //   109: invokeinterface krr.d:(Ljava/lang/String;)V
        //   114: aload_0        
        //   115: getfield        lgn.a:Lkrr;
        //   118: ldc             "Closing hardware buffer"
        //   120: invokeinterface krr.b:(Ljava/lang/String;)V
        //   125: aload_2        
        //   126: invokevirtual   lgx.a:()V
        //   129: aload_0        
        //   130: monitorexit    
        //   131: return         
        //   132: astore_3       
        //   133: goto            284
        //   136: aload_1        
        //   137: astore          4
        //   139: aload_0        
        //   140: getfield        lgn.c:Landroid/hardware/SensorManager;
        //   143: iconst_4       
        //   144: invokevirtual   android/hardware/SensorManager.getDefaultSensor:(I)Landroid/hardware/Sensor;
        //   147: astore          6
        //   149: aload           6
        //   151: ifnonnull       190
        //   154: aload_1        
        //   155: astore          4
        //   157: aload_0        
        //   158: getfield        lgn.a:Lkrr;
        //   161: ldc             "Failed to start direct gyro provider: Getting default sensor returned null."
        //   163: invokeinterface krr.d:(Ljava/lang/String;)V
        //   168: aload_0        
        //   169: getfield        lgn.a:Lkrr;
        //   172: ldc             "Closing hardware buffer"
        //   174: invokeinterface krr.b:(Ljava/lang/String;)V
        //   179: aload_2        
        //   180: invokevirtual   lgx.a:()V
        //   183: aload_1        
        //   184: invokevirtual   android/hardware/SensorDirectChannel.close:()V
        //   187: aload_0        
        //   188: monitorexit    
        //   189: return         
        //   190: aload_1        
        //   191: astore          4
        //   193: aload_1        
        //   194: aload           6
        //   196: iconst_2       
        //   197: invokevirtual   android/hardware/SensorDirectChannel.configure:(Landroid/hardware/Sensor;I)I
        //   200: ifne            235
        //   203: aload_1        
        //   204: astore          4
        //   206: aload_0        
        //   207: getfield        lgn.a:Lkrr;
        //   210: ldc             "Failed to start direct gyro provider: Unable to configure gyro direct channel."
        //   212: invokeinterface krr.d:(Ljava/lang/String;)V
        //   217: aload_0        
        //   218: getfield        lgn.a:Lkrr;
        //   221: ldc             "Closing hardware buffer"
        //   223: invokeinterface krr.b:(Ljava/lang/String;)V
        //   228: aload_2        
        //   229: invokevirtual   lgx.a:()V
        //   232: goto            183
        //   235: aload_1        
        //   236: astore          4
        //   238: aload_0        
        //   239: getfield        lgn.a:Lkrr;
        //   242: ldc             "Started gyro direct channel successfully"
        //   244: invokeinterface krr.b:(Ljava/lang/String;)V
        //   249: aload_1        
        //   250: astore          4
        //   252: new             Llgm;
        //   255: astore_3       
        //   256: aload_1        
        //   257: astore          4
        //   259: aload_3        
        //   260: aload_2        
        //   261: aload_1        
        //   262: aload           6
        //   264: aload           5
        //   266: invokespecial   lgm.<init>:(Llgx;Landroid/hardware/SensorDirectChannel;Landroid/hardware/Sensor;Llgo;)V
        //   269: aload_1        
        //   270: astore          4
        //   272: aload_0        
        //   273: aload_3        
        //   274: putfield        lgn.b:Llgm;
        //   277: aload_0        
        //   278: monitorexit    
        //   279: return         
        //   280: astore_3       
        //   281: aload           4
        //   283: astore_1       
        //   284: aload_1        
        //   285: astore          4
        //   287: aload_0        
        //   288: getfield        lgn.a:Lkrr;
        //   291: ldc             "Failed to start direct gyro provider: Creating direct channel threw an exception."
        //   293: aload_3        
        //   294: invokeinterface krr.e:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   299: aload_0        
        //   300: getfield        lgn.a:Lkrr;
        //   303: ldc             "Closing hardware buffer"
        //   305: invokeinterface krr.b:(Ljava/lang/String;)V
        //   310: aload_2        
        //   311: invokevirtual   lgx.a:()V
        //   314: aload_1        
        //   315: ifnull          187
        //   318: goto            183
        //   321: astore_1       
        //   322: goto            329
        //   325: astore_1       
        //   326: aload_3        
        //   327: astore          4
        //   329: aload_0        
        //   330: getfield        lgn.a:Lkrr;
        //   333: ldc             "Closing hardware buffer"
        //   335: invokeinterface krr.b:(Ljava/lang/String;)V
        //   340: aload_2        
        //   341: invokevirtual   lgx.a:()V
        //   344: aload           4
        //   346: ifnull          354
        //   349: aload           4
        //   351: invokevirtual   android/hardware/SensorDirectChannel.close:()V
        //   354: aload_1        
        //   355: athrow         
        //   356: astore_1       
        //   357: aload_0        
        //   358: getfield        lgn.a:Lkrr;
        //   361: ldc             "Failed to start direct gyro provider: Creating the hardware buffer threw an IllegalArgumentException exception."
        //   363: aload_1        
        //   364: invokeinterface krr.e:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   369: aload_0        
        //   370: monitorexit    
        //   371: return         
        //   372: astore_1       
        //   373: aload_0        
        //   374: monitorexit    
        //   375: goto            380
        //   378: aload_1        
        //   379: athrow         
        //   380: goto            378
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  2      31     372    383    Any
        //  34     47     356    372    Ljava/lang/IllegalArgumentException;
        //  34     47     372    383    Any
        //  51     62     372    383    Any
        //  65     74     372    383    Any
        //  79     90     325    329    Any
        //  90     99     280    284    Any
        //  103    114    132    136    Any
        //  114    129    372    383    Any
        //  139    149    321    325    Any
        //  157    168    321    325    Any
        //  168    183    372    383    Any
        //  183    187    372    383    Any
        //  193    203    321    325    Any
        //  206    217    321    325    Any
        //  217    232    372    383    Any
        //  238    249    321    325    Any
        //  252    256    321    325    Any
        //  259    269    321    325    Any
        //  272    277    321    325    Any
        //  287    299    321    325    Any
        //  299    314    372    383    Any
        //  329    344    372    383    Any
        //  349    354    372    383    Any
        //  354    356    372    383    Any
        //  357    369    372    383    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0183:
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
    public final lgq a(String o) {
        monitorenter(this);
        try {
            if (this.d.isEmpty()) {
                this.d();
            }
            else {
                for (lgq lgq : this.d) {
                    if (((String)o).equals(lgq.a())) {
                        final krr a = this.a;
                        final String a2 = lgq.a();
                        final StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 63);
                        sb.append("Fast gyro provider session existed for: ");
                        sb.append(a2);
                        sb.append(". No new session added.");
                        a.b(sb.toString());
                        monitorexit(this);
                        return lgq;
                    }
                }
            }
            if (this.b == null) {
                this.a.d("Failed to open new direct gyro session: Hardware was null.");
                monitorexit(this);
                return null;
            }
            final lgl lgl = new lgl(this, (String)o);
            this.d.add(lgl);
            final krr a3 = this.a;
            o = String.valueOf(lgl.a);
            if (((String)o).length() != 0) {
                o = "Fast gyro provider session added for: ".concat((String)o);
            }
            else {
                o = new String("Fast gyro provider session added for: ");
            }
            a3.b((String)o);
            monitorexit(this);
            return lgl;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b(final lgq lgq) {
        synchronized (this) {
            if (this.d.remove(lgq)) {
                final krr a = this.a;
                final String a2 = ((lgl)lgq).a;
                final int size = this.d.size();
                final StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 82);
                sb.append("Fast gyro provider session closed for: ");
                sb.append(a2);
                sb.append(" Remaining number of sessions = ");
                sb.append(size);
                a.b(sb.toString());
            }
            if (this.d.isEmpty()) {
                this.c();
            }
        }
    }
    
    @Override
    protected final void finalize() {
        synchronized (this) {
            final lgm b = this.b;
            if (b != null) {
                if (b.b.configure(b.c, 0) == 0) {
                    this.a.d("Failed to stop direct gyro provider in finalizer: Unable to configure gyro direct channel.");
                }
                b.b.close();
                b.a.a();
                this.a.h("Gyro direct channel reference potentially leaked and was closed in finalizer.");
                this.b = null;
            }
        }
    }
}
