import android.os.SystemClock;
import android.content.Context;
import java.util.concurrent.Executor;
import android.location.Location;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class exv implements exz, kbq
{
    public static final nsd a;
    public static final int b;
    public static final int c;
    private static final Uri j;
    public boolean d;
    public Location e;
    public long f;
    public long g;
    public boolean h;
    public final jqt i;
    private final Executor k;
    
    static {
        a = nsd.g("com/google/android/apps/camera/location/FusedLocationController");
        b = jxc.i(20);
        c = jxc.i(60);
        j = Uri.parse("content://com.google.settings/partner");
    }
    
    public exv(final Context context, final Executor k) {
        this.d = false;
        this.i = kbt.a(context);
        this.k = k;
    }
    
    public static boolean d(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //     4: new             Landroid/content/Intent;
        //     7: dup            
        //     8: ldc             "com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"
        //    10: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //    13: ldc             65536
        //    15: invokevirtual   android/content/pm/PackageManager.resolveActivity:(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
        //    18: ifnull          225
        //    21: aload_0        
        //    22: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    25: astore_1       
        //    26: aconst_null    
        //    27: astore_2       
        //    28: aconst_null    
        //    29: astore_3       
        //    30: aconst_null    
        //    31: astore          4
        //    33: aconst_null    
        //    34: astore_0       
        //    35: aload_1        
        //    36: getstatic       exv.j:Landroid/net/Uri;
        //    39: iconst_1       
        //    40: anewarray       Ljava/lang/String;
        //    43: dup            
        //    44: iconst_0       
        //    45: ldc             "value"
        //    47: aastore        
        //    48: ldc             "name=?"
        //    50: iconst_1       
        //    51: anewarray       Ljava/lang/String;
        //    54: dup            
        //    55: iconst_0       
        //    56: ldc             "use_location_for_services"
        //    58: aastore        
        //    59: aconst_null    
        //    60: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    63: astore_1       
        //    64: aload_1        
        //    65: ifnull          104
        //    68: aload_1        
        //    69: astore          4
        //    71: aload_1        
        //    72: invokeinterface android/database/Cursor.moveToNext:()Z
        //    77: ifeq            104
        //    80: aload_1        
        //    81: astore          4
        //    83: aload_1        
        //    84: iconst_0       
        //    85: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    90: astore_0       
        //    91: goto            104
        //    94: astore          4
        //    96: aload_1        
        //    97: astore_0       
        //    98: aload           4
        //   100: astore_1       
        //   101: goto            121
        //   104: aload_0        
        //   105: astore          4
        //   107: aload_1        
        //   108: ifnull          183
        //   111: goto            168
        //   114: astore_0       
        //   115: goto            211
        //   118: astore_1       
        //   119: aconst_null    
        //   120: astore_0       
        //   121: aload_0        
        //   122: astore          4
        //   124: getstatic       exv.a:Lnsd;
        //   127: invokevirtual   nry.c:()Lnsu;
        //   130: checkcast       Lnsa;
        //   133: aload_1        
        //   134: invokeinterface nsa.h:(Ljava/lang/Throwable;)Lnsu;
        //   139: checkcast       Lnsa;
        //   142: sipush          1434
        //   145: invokeinterface nsa.E:(I)Lnsu;
        //   150: checkcast       Lnsa;
        //   153: ldc             "Failed to get 'Use My Location' setting"
        //   155: invokeinterface nsa.o:(Ljava/lang/String;)V
        //   160: aload_0        
        //   161: ifnull          180
        //   164: aload_0        
        //   165: astore_1       
        //   166: aload_2        
        //   167: astore_0       
        //   168: aload_1        
        //   169: invokeinterface android/database/Cursor.close:()V
        //   174: aload_0        
        //   175: astore          4
        //   177: goto            183
        //   180: aload_3        
        //   181: astore          4
        //   183: aload           4
        //   185: ifnonnull       191
        //   188: goto            208
        //   191: aload           4
        //   193: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   196: istore          5
        //   198: iload           5
        //   200: iconst_1       
        //   201: if_icmpne       208
        //   204: goto            225
        //   207: astore_0       
        //   208: iconst_0       
        //   209: ireturn        
        //   210: astore_0       
        //   211: aload           4
        //   213: ifnull          223
        //   216: aload           4
        //   218: invokeinterface android/database/Cursor.close:()V
        //   223: aload_0        
        //   224: athrow         
        //   225: iconst_1       
        //   226: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  35     64     118    121    Ljava/lang/RuntimeException;
        //  35     64     114    118    Any
        //  71     80     94     104    Ljava/lang/RuntimeException;
        //  71     80     210    211    Any
        //  83     91     94     104    Ljava/lang/RuntimeException;
        //  83     91     210    211    Any
        //  124    160    210    211    Any
        //  191    198    207    208    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0104:
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
    
    public static final boolean e(final Location location) {
        if (location == null) {
            a.l(exv.a.c(), "Fused location API did not provide a location.", '\u05aa');
            return false;
        }
        if (Double.isInfinite(location.getLatitude()) || Double.isNaN(location.getLatitude()) || Double.isInfinite(location.getLongitude()) || Double.isNaN(location.getLongitude()) || (location.getLatitude() == 0.0 && location.getLongitude() == 0.0)) {
            a.k(exv.a.c(), "Fused location API provided a location that is probably incorrect: %s", location, '\u05a8');
            return false;
        }
        final long k = jxc.k(SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos());
        if (k > jxc.i(1800)) {
            a.k(exv.a.c(), "Fused location API provided a location from %g seconds ago. Ignoring location.", jxc.f(k), '\u05a9');
            return false;
        }
        return true;
    }
    
    private final void f() {
        synchronized (this) {
            this.h = true;
            if (this.d) {
                try {
                    final jqt i = this.i;
                    final String simpleName = kbq.class.getSimpleName();
                    jvu.j(simpleName, "Listener type must not be null");
                    jvu.i(simpleName, "Listener type must not be empty");
                    i.i(new jtb(this, simpleName));
                }
                catch (final Exception ex) {
                    exv.a.c().h(ex).E(1447).o("Failed to remove location listeners. ");
                }
            }
            this.d = false;
        }
    }
    
    @Override
    public final oey a() {
        final ofn f = ofn.f();
        final Location e = this.e;
        Object e2 = null;
        if (e != null && System.currentTimeMillis() - this.f < 1000L) {
            System.currentTimeMillis();
            e2 = this.e;
        }
        else {
            this.e = null;
        }
        if (e2 != null) {
            f.o(e2);
            return f;
        }
        this.i.h().g(this.k, new exu(this, f));
        return f;
    }
    
    @Override
    public final void b(final Location location) {
        if (!e(location)) {
            return;
        }
        final int n = (int)(((System.currentTimeMillis() - this.g) / (float)jxc.i(10) + 1.0f) * 50.0f);
        boolean b = System.currentTimeMillis() - this.g > exv.c;
        if (location.getAccuracy() >= n) {
            if (!b) {
                return;
            }
            b = true;
        }
        this.f();
        String s;
        if (!b) {
            s = "got useful location";
        }
        else {
            s = "timeout";
        }
        if (s.length() != 0) {
            "onLocationChanged, ".concat(s);
        }
        else {
            new String("onLocationChanged, ");
        }
        location.getAccuracy();
    }
    
    @Override
    public final void c(final boolean b) {
        if (b) {
            synchronized (this) {
                if (this.d) {
                    return;
                }
                this.h = false;
                monitorexit(this);
                this.i.h().g(this.k, new ext(this));
                return;
            }
        }
        this.f();
    }
}
