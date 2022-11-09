import java.lang.reflect.InvocationTargetException;
import android.os.Parcel;
import android.os.RemoteException;
import android.database.Cursor;
import dalvik.system.DelegateLastClassLoader;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import android.os.IInterface;
import android.os.IBinder;
import java.lang.reflect.Field;
import android.util.Log;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxi
{
    public static Boolean a;
    public static int b;
    public static final ThreadLocal c;
    public static final ThreadLocal d;
    public static final jxg e;
    public static jxk f;
    private static String g;
    private static boolean h;
    private static jxj j;
    private final Context i;
    
    static {
        jxi.b = -1;
        c = new ThreadLocal();
        d = new jxa();
        e = new jxb();
    }
    
    public jxi(final Context i) {
        jvu.a(i);
        this.i = i;
    }
    
    public static int a(final Context context, final String s) {
        try {
            final ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            final StringBuilder sb = new StringBuilder(s.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(s);
            sb.append(".");
            sb.append("ModuleDescriptor");
            final Class<?> loadClass = classLoader.loadClass(sb.toString());
            final Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            final Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!jvu.m(declaredField.get(null), s)) {
                final String value = String.valueOf(declaredField.get(null));
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 51 + s.length());
                sb2.append("Module descriptor id '");
                sb2.append(value);
                sb2.append("' didn't match expected id '");
                sb2.append(s);
                sb2.append("'");
                Log.e("DynamiteModule", sb2.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        }
        catch (final Exception ex) {
            final String value2 = String.valueOf(ex.getMessage());
            String concat;
            if (value2.length() != 0) {
                concat = "Failed to load module descriptor class: ".concat(value2);
            }
            else {
                concat = new String("Failed to load module descriptor class: ");
            }
            Log.e("DynamiteModule", concat);
        }
        catch (final ClassNotFoundException ex2) {
            final StringBuilder sb3 = new StringBuilder(s.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(s);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
        }
        return 0;
    }
    
    public static jxi c(final Context context) {
        return new jxi(context.getApplicationContext());
    }
    
    public static jxj d(final Context context) {
        synchronized (jxi.class) {
            final jxj j = jxi.j;
            if (j != null) {
                return j;
            }
            try {
                final IBinder binder = (IBinder)context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                jxj i;
                if (binder == null) {
                    i = null;
                }
                else {
                    final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof jxj) {
                        i = (jxj)queryLocalInterface;
                    }
                    else {
                        i = new jxj(binder);
                    }
                }
                if (i != null) {
                    return jxi.j = i;
                }
            }
            catch (final Exception ex) {
                final String value = String.valueOf(ex.getMessage());
                String concat;
                if (value.length() != 0) {
                    concat = "Failed to load IDynamiteLoader from GmsCore: ".concat(value);
                }
                else {
                    concat = new String("Failed to load IDynamiteLoader from GmsCore: ");
                }
                Log.e("DynamiteModule", concat);
            }
            return null;
        }
    }
    
    public static int e(Context context) {
        try {
            synchronized (jxi.class) {
                final Boolean a = jxi.a;
                final Context context2 = null;
                Object o = null;
                final Context context3 = null;
                Boolean false = a;
                if (a == null) {
                    try {
                        final Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            final ClassLoader classLoader = (ClassLoader)declaredField.get(null);
                            Label_0257: {
                                if (classLoader != null) {
                                    if (classLoader == ClassLoader.getSystemClassLoader()) {
                                        final Boolean false2 = Boolean.FALSE;
                                    }
                                    else {
                                        try {
                                            f(classLoader);
                                        }
                                        catch (final jxf jxf) {}
                                        final Boolean true = Boolean.TRUE;
                                    }
                                }
                                else {
                                    if (!jxi.h) {
                                        if (!Boolean.TRUE.equals(null)) {
                                            try {
                                                final int n = h(context);
                                                final String g = jxi.g;
                                                if (g != null && !g.isEmpty()) {
                                                    Object a2;
                                                    if ((a2 = jwz.a()) == null) {
                                                        a2 = new(dalvik.system.DelegateLastClassLoader.class)();
                                                        final String g2 = jxi.g;
                                                        jvu.a(g2);
                                                        new DelegateLastClassLoader(g2, ClassLoader.getSystemClassLoader());
                                                    }
                                                    f((ClassLoader)a2);
                                                    declaredField.set(null, a2);
                                                    jxi.a = Boolean.TRUE;
                                                    return n;
                                                }
                                                return n;
                                            }
                                            catch (final jxf jxf2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                final Boolean false3 = Boolean.FALSE;
                                                break Label_0257;
                                            }
                                        }
                                    }
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    final Boolean false4 = Boolean.FALSE;
                                }
                            }
                        }
                    }
                    catch (final NoSuchFieldException false) {}
                    catch (final IllegalAccessException false) {}
                    catch (final ClassNotFoundException ex) {}
                    final String value = String.valueOf(false);
                    final int n = String.valueOf(value).length();
                    final StringBuilder sb = new StringBuilder(n + 30);
                    sb.append("Failed to load module via V2: ");
                    sb.append(value);
                    Log.w("DynamiteModule", sb.toString());
                    false = Boolean.FALSE;
                    jxi.a = false;
                }
                monitorexit(jxi.class);
                final boolean booleanValue = false;
                final int n2 = 0;
                if (booleanValue) {
                    try {
                        return h(context);
                    }
                    catch (final jxf jxf3) {
                        final String value2 = String.valueOf(jxf3.getMessage());
                        String concat;
                        if (value2.length() != 0) {
                            concat = "Failed to retrieve remote module version: ".concat(value2);
                        }
                        else {
                            concat = new String("Failed to retrieve remote module version: ");
                        }
                        Log.w("DynamiteModule", concat);
                        return 0;
                    }
                }
                final jxj d = d(context);
                if (d == null) {
                    return n2;
                }
                Object o2 = null;
                Label_0853: {
                    try {
                        int n = d.e();
                        if (n >= 3) {
                            final jxd jxd = jxi.c.get();
                            if (jxd != null) {
                                final Cursor a3 = jxd.a;
                                if (a3 != null) {
                                    n = a3.getInt(0);
                                    return n;
                                }
                            }
                            final jwx b = jww.b(context);
                            final long longValue = jxi.d.get();
                            final Parcel a4 = d.a();
                            bjg.e(a4, (IInterface)b);
                            a4.writeString("com.google.android.gms.brella_dynamite");
                            bjg.b(a4, true);
                            a4.writeLong(longValue);
                            final Parcel y = d.y(7, a4);
                            final IBinder strongBinder = y.readStrongBinder();
                            jwx jwx;
                            if (strongBinder == null) {
                                jwx = null;
                            }
                            else {
                                final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                if (queryLocalInterface instanceof jwx) {
                                    jwx = (jwx)queryLocalInterface;
                                }
                                else {
                                    jwx = new jwv(strongBinder);
                                }
                            }
                            y.recycle();
                            context = (Context)jww.c(jwx);
                            Label_0668: {
                                if (context == null) {
                                    break Label_0668;
                                }
                                try {
                                    if (((Cursor)context).moveToFirst()) {
                                        n = ((Cursor)context).getInt(0);
                                        if (n > 0 && g((Cursor)context)) {
                                            context = context3;
                                        }
                                        if (context != null) {
                                            ((Cursor)context).close();
                                        }
                                        return n;
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    n = n2;
                                    if (context != null) {
                                        ((Cursor)context).close();
                                        n = n2;
                                        return n;
                                    }
                                    return n;
                                }
                                catch (final RemoteException ex2) {
                                    break Label_0853;
                                }
                                finally {
                                    o = context;
                                }
                            }
                        }
                        if (n == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            final jwx b2 = jww.b(context);
                            final Parcel a5 = d.a();
                            bjg.e(a5, (IInterface)b2);
                            a5.writeString("com.google.android.gms.brella_dynamite");
                            bjg.b(a5, true);
                            final Parcel y2 = d.y(5, a5);
                            n = y2.readInt();
                            y2.recycle();
                            return n;
                        }
                        Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                        final jwx b3 = jww.b(context);
                        final Parcel a6 = d.a();
                        bjg.e(a6, (IInterface)b3);
                        a6.writeString("com.google.android.gms.brella_dynamite");
                        bjg.b(a6, true);
                        final Parcel y3 = d.y(3, a6);
                        n = y3.readInt();
                        y3.recycle();
                        return n;
                    }
                    catch (final RemoteException o2) {
                        context = context2;
                    }
                    finally {
                        o2 = o;
                        break Label_0853;
                    }
                    try {
                        final String value3 = String.valueOf(((RemoteException)o2).getMessage());
                        String concat2;
                        if (value3.length() != 0) {
                            concat2 = "Failed to retrieve remote module version: ".concat(value3);
                        }
                        else {
                            concat2 = new String("Failed to retrieve remote module version: ");
                        }
                        Log.w("DynamiteModule", concat2);
                        int n = n2;
                        if (context != null) {
                            ((Cursor)context).close();
                            n = n2;
                        }
                        return n;
                    }
                    finally {
                        o2 = context;
                        final Context context4;
                        context = context4;
                    }
                }
                if (o2 != null) {
                    ((Cursor)o2).close();
                }
                throw context;
            }
        }
        finally {}
    }
    
    private static void f(ClassLoader f) {
        try {
            f = (NoSuchMethodException)((ClassLoader)f).loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            if (f == null) {
                f = null;
            }
            else {
                final IInterface queryLocalInterface = ((IBinder)f).queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof jxk) {
                    f = (NoSuchMethodException)queryLocalInterface;
                }
                else {
                    f = (NoSuchMethodException)new jxk((IBinder)f);
                }
            }
            jxi.f = (jxk)f;
            return;
        }
        catch (final NoSuchMethodException f) {}
        catch (final InvocationTargetException f) {}
        catch (final InstantiationException f) {}
        catch (final IllegalAccessException f) {}
        catch (final ClassNotFoundException ex) {}
        throw new jxf("Failed to instantiate dynamite loader", f);
    }
    
    private static boolean g(final Cursor a) {
        final jxd jxd = jxi.c.get();
        if (jxd != null && jxd.a == null) {
            jxd.a = a;
            return true;
        }
        return false;
    }
    
    private static int h(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: aconst_null    
        //     3: astore_2       
        //     4: aconst_null    
        //     5: astore_3       
        //     6: getstatic       jxi.d:Ljava/lang/ThreadLocal;
        //     9: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //    12: checkcast       Ljava/lang/Long;
        //    15: invokevirtual   java/lang/Long.longValue:()J
        //    18: lstore          4
        //    20: aload_0        
        //    21: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    24: astore_0       
        //    25: new             Landroid/net/Uri$Builder;
        //    28: astore          6
        //    30: aload           6
        //    32: invokespecial   android/net/Uri$Builder.<init>:()V
        //    35: aload_0        
        //    36: aload           6
        //    38: ldc_w           "content"
        //    41: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    44: ldc_w           "com.google.android.gms.chimera"
        //    47: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    50: ldc_w           "api_force_staging"
        //    53: invokevirtual   android/net/Uri$Builder.path:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    56: ldc_w           "com.google.android.gms.brella_dynamite"
        //    59: invokevirtual   android/net/Uri$Builder.appendPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    62: ldc_w           "requestStartTime"
        //    65: lload           4
        //    67: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    70: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    73: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //    76: aconst_null    
        //    77: aconst_null    
        //    78: aconst_null    
        //    79: aconst_null    
        //    80: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    83: astore_0       
        //    84: aload_0        
        //    85: ifnull          278
        //    88: aload_0        
        //    89: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    94: ifeq            278
        //    97: iconst_0       
        //    98: istore          7
        //   100: iconst_0       
        //   101: istore          8
        //   103: iconst_0       
        //   104: istore          9
        //   106: aload_0        
        //   107: iconst_0       
        //   108: invokeinterface android/database/Cursor.getInt:(I)I
        //   113: istore          10
        //   115: iload           10
        //   117: ifle            233
        //   120: ldc             Ljxi;.class
        //   122: monitorenter   
        //   123: aload_0        
        //   124: iconst_2       
        //   125: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   130: putstatic       jxi.g:Ljava/lang/String;
        //   133: aload_0        
        //   134: ldc_w           "loaderVersion"
        //   137: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   142: istore          11
        //   144: iload           11
        //   146: iflt            160
        //   149: aload_0        
        //   150: iload           11
        //   152: invokeinterface android/database/Cursor.getInt:(I)I
        //   157: putstatic       jxi.b:I
        //   160: aload_0        
        //   161: ldc_w           "disableStandaloneDynamiteLoader"
        //   164: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   169: istore          11
        //   171: iload           11
        //   173: iflt            201
        //   176: aload_0        
        //   177: iload           11
        //   179: invokeinterface android/database/Cursor.getInt:(I)I
        //   184: ifeq            193
        //   187: iconst_1       
        //   188: istore          9
        //   190: goto            193
        //   193: iload           9
        //   195: putstatic       jxi.h:Z
        //   198: goto            205
        //   201: iload           7
        //   203: istore          9
        //   205: ldc             Ljxi;.class
        //   207: monitorexit    
        //   208: aload_0        
        //   209: invokestatic    jxi.g:(Landroid/database/Cursor;)Z
        //   212: istore          7
        //   214: iload           7
        //   216: ifeq            224
        //   219: aload_3        
        //   220: astore_0       
        //   221: goto            237
        //   224: goto            237
        //   227: astore_1       
        //   228: ldc             Ljxi;.class
        //   230: monitorexit    
        //   231: aload_1        
        //   232: athrow         
        //   233: iload           8
        //   235: istore          9
        //   237: iload           9
        //   239: ifne            255
        //   242: aload_0        
        //   243: ifnull          252
        //   246: aload_0        
        //   247: invokeinterface android/database/Cursor.close:()V
        //   252: iload           10
        //   254: ireturn        
        //   255: aload_0        
        //   256: astore_1       
        //   257: new             Ljxf;
        //   260: astore_2       
        //   261: aload_0        
        //   262: astore_1       
        //   263: aload_2        
        //   264: ldc_w           "forcing fallback to container DynamiteLoader impl"
        //   267: invokespecial   jxf.<init>:(Ljava/lang/String;)V
        //   270: aload_0        
        //   271: astore_1       
        //   272: aload_2        
        //   273: athrow         
        //   274: astore_2       
        //   275: goto            321
        //   278: ldc             "DynamiteModule"
        //   280: ldc_w           "Failed to retrieve remote module version."
        //   283: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   286: pop            
        //   287: new             Ljxf;
        //   290: astore_1       
        //   291: aload_1        
        //   292: ldc_w           "Failed to connect to dynamite module ContentResolver."
        //   295: invokespecial   jxf.<init>:(Ljava/lang/String;)V
        //   298: aload_1        
        //   299: athrow         
        //   300: astore_2       
        //   301: aload_0        
        //   302: astore_1       
        //   303: aload_2        
        //   304: astore_0       
        //   305: goto            355
        //   308: astore_2       
        //   309: goto            321
        //   312: astore_0       
        //   313: aload_2        
        //   314: astore_1       
        //   315: goto            355
        //   318: astore_2       
        //   319: aload_1        
        //   320: astore_0       
        //   321: aload_0        
        //   322: astore_1       
        //   323: aload_2        
        //   324: instanceof      Ljxf;
        //   327: ifeq            334
        //   330: aload_0        
        //   331: astore_1       
        //   332: aload_2        
        //   333: athrow         
        //   334: aload_0        
        //   335: astore_1       
        //   336: new             Ljxf;
        //   339: astore_3       
        //   340: aload_0        
        //   341: astore_1       
        //   342: aload_3        
        //   343: ldc_w           "V2 version check failed"
        //   346: aload_2        
        //   347: invokespecial   jxf.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   350: aload_0        
        //   351: astore_1       
        //   352: aload_3        
        //   353: athrow         
        //   354: astore_0       
        //   355: aload_1        
        //   356: ifnull          365
        //   359: aload_1        
        //   360: invokeinterface android/database/Cursor.close:()V
        //   365: aload_0        
        //   366: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      84     318    321    Ljava/lang/Exception;
        //  6      84     312    318    Any
        //  88     97     308    312    Ljava/lang/Exception;
        //  88     97     300    308    Any
        //  106    115    308    312    Ljava/lang/Exception;
        //  106    115    300    308    Any
        //  120    123    308    312    Ljava/lang/Exception;
        //  120    123    300    308    Any
        //  123    144    227    233    Any
        //  149    160    227    233    Any
        //  160    171    227    233    Any
        //  176    187    227    233    Any
        //  193    198    227    233    Any
        //  205    208    227    233    Any
        //  208    214    308    312    Ljava/lang/Exception;
        //  208    214    300    308    Any
        //  228    231    227    233    Any
        //  231    233    308    312    Ljava/lang/Exception;
        //  231    233    300    308    Any
        //  257    261    274    278    Ljava/lang/Exception;
        //  257    261    354    355    Any
        //  263    270    274    278    Ljava/lang/Exception;
        //  263    270    354    355    Any
        //  272    274    274    278    Ljava/lang/Exception;
        //  272    274    354    355    Any
        //  278    300    308    312    Ljava/lang/Exception;
        //  278    300    300    308    Any
        //  323    330    354    355    Any
        //  332    334    354    355    Any
        //  336    340    354    355    Any
        //  342    350    354    355    Any
        //  352    354    354    355    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0278:
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
    
    public final IBinder b(String concat) {
        IBinder binder = null;
        try {
            binder = (IBinder)this.i.getClassLoader().loadClass((String)concat).newInstance();
            return binder;
        }
        catch (final IllegalAccessException binder) {}
        catch (final InstantiationException binder) {}
        catch (final ClassNotFoundException ex) {}
        if (((String)concat).length() != 0) {
            concat = "Failed to instantiate module class: ".concat((String)concat);
        }
        else {
            concat = new String("Failed to instantiate module class: ");
        }
        throw new jxf((String)concat, (Throwable)binder);
    }
}
