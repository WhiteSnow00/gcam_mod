import android.os.RemoteException;
import android.content.ContentValues;
import android.util.Base64;
import android.util.Log;
import android.net.Uri;
import android.content.ContentProviderClient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ort implements osi
{
    private static final String a;
    private final ContentProviderClient b;
    private final Uri c;
    private final Uri d;
    private final Uri e;
    private final Uri f;
    
    static {
        a = ort.class.getSimpleName();
    }
    
    public ort(final ContentProviderClient b, final String s) {
        if (s != null && !s.isEmpty()) {
            this.b = b;
            this.c = pip.p(s, "device_params");
            this.d = pip.p(s, "user_prefs");
            this.e = pip.p(s, "phone_params");
            this.f = pip.p(s, "sdk_configuration_params");
            pip.p(s, "recent_headsets");
            return;
        }
        throw new IllegalArgumentException("Authority key must be non-null and non-empty");
    }
    
    private final omj g(final omi omi, final Uri uri, final String s) {
        final byte[] h = this.h(uri, s);
        if (h == null) {
            return null;
        }
        try {
            return omi.d(h).j();
        }
        catch (final olm olm) {
            Log.e(ort.a, "Error reading params from ContentProvider", (Throwable)olm);
            return null;
        }
    }
    
    private final byte[] h(final Uri p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_3       
        //     2: aload_0        
        //     3: getfield        ort.b:Landroid/content/ContentProviderClient;
        //     6: aload_1        
        //     7: aconst_null    
        //     8: aload_2        
        //     9: aconst_null    
        //    10: aconst_null    
        //    11: invokevirtual   android/content/ContentProviderClient.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    14: astore          4
        //    16: aload           4
        //    18: ifnull          68
        //    21: aload           4
        //    23: astore_2       
        //    24: aload           4
        //    26: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    31: ifeq            68
        //    34: aload           4
        //    36: astore_2       
        //    37: aload           4
        //    39: iconst_0       
        //    40: invokeinterface android/database/Cursor.getBlob:(I)[B
        //    45: astore_1       
        //    46: aload_1        
        //    47: ifnonnull       59
        //    50: aload           4
        //    52: invokeinterface android/database/Cursor.close:()V
        //    57: aconst_null    
        //    58: areturn        
        //    59: aload           4
        //    61: invokeinterface android/database/Cursor.close:()V
        //    66: aload_1        
        //    67: areturn        
        //    68: aload           4
        //    70: astore_2       
        //    71: getstatic       ort.a:Ljava/lang/String;
        //    74: astore_3       
        //    75: aload           4
        //    77: astore_2       
        //    78: aload_1        
        //    79: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    82: astore_1       
        //    83: aload           4
        //    85: astore_2       
        //    86: aload_1        
        //    87: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    90: invokevirtual   java/lang/String.length:()I
        //    93: istore          5
        //    95: aload           4
        //    97: astore_2       
        //    98: new             Ljava/lang/StringBuilder;
        //   101: astore          6
        //   103: aload           4
        //   105: astore_2       
        //   106: aload           6
        //   108: iload           5
        //   110: bipush          50
        //   112: iadd           
        //   113: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   116: aload           4
        //   118: astore_2       
        //   119: aload           6
        //   121: ldc             "Invalid params result from ContentProvider query: "
        //   123: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   126: pop            
        //   127: aload           4
        //   129: astore_2       
        //   130: aload           6
        //   132: aload_1        
        //   133: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   136: pop            
        //   137: aload           4
        //   139: astore_2       
        //   140: aload_3        
        //   141: aload           6
        //   143: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   146: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   149: pop            
        //   150: aload           4
        //   152: ifnull          162
        //   155: aload           4
        //   157: invokeinterface android/database/Cursor.close:()V
        //   162: aconst_null    
        //   163: areturn        
        //   164: astore_1       
        //   165: goto            194
        //   168: astore_1       
        //   169: goto            194
        //   172: astore_1       
        //   173: goto            194
        //   176: astore_1       
        //   177: aload_3        
        //   178: astore_2       
        //   179: goto            222
        //   182: astore_1       
        //   183: goto            191
        //   186: astore_1       
        //   187: goto            191
        //   190: astore_1       
        //   191: aconst_null    
        //   192: astore          4
        //   194: aload           4
        //   196: astore_2       
        //   197: getstatic       ort.a:Ljava/lang/String;
        //   200: ldc             "Error reading params from ContentProvider"
        //   202: aload_1        
        //   203: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   206: pop            
        //   207: aload           4
        //   209: ifnull          219
        //   212: aload           4
        //   214: invokeinterface android/database/Cursor.close:()V
        //   219: aconst_null    
        //   220: areturn        
        //   221: astore_1       
        //   222: aload_2        
        //   223: ifnull          232
        //   226: aload_2        
        //   227: invokeinterface android/database/Cursor.close:()V
        //   232: aload_1        
        //   233: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                              
        //  -----  -----  -----  -----  --------------------------------------------------
        //  2      16     190    191    Landroid/database/CursorIndexOutOfBoundsException;
        //  2      16     186    190    Ljava/lang/IllegalArgumentException;
        //  2      16     182    186    Landroid/os/RemoteException;
        //  2      16     176    182    Any
        //  24     34     172    176    Landroid/database/CursorIndexOutOfBoundsException;
        //  24     34     168    172    Ljava/lang/IllegalArgumentException;
        //  24     34     164    168    Landroid/os/RemoteException;
        //  24     34     221    222    Any
        //  37     46     172    176    Landroid/database/CursorIndexOutOfBoundsException;
        //  37     46     168    172    Ljava/lang/IllegalArgumentException;
        //  37     46     164    168    Landroid/os/RemoteException;
        //  37     46     221    222    Any
        //  71     75     172    176    Landroid/database/CursorIndexOutOfBoundsException;
        //  71     75     168    172    Ljava/lang/IllegalArgumentException;
        //  71     75     164    168    Landroid/os/RemoteException;
        //  71     75     221    222    Any
        //  78     83     172    176    Landroid/database/CursorIndexOutOfBoundsException;
        //  78     83     168    172    Ljava/lang/IllegalArgumentException;
        //  78     83     164    168    Landroid/os/RemoteException;
        //  78     83     221    222    Any
        //  86     95     172    176    Landroid/database/CursorIndexOutOfBoundsException;
        //  86     95     168    172    Ljava/lang/IllegalArgumentException;
        //  86     95     164    168    Landroid/os/RemoteException;
        //  86     95     221    222    Any
        //  98     103    172    176    Landroid/database/CursorIndexOutOfBoundsException;
        //  98     103    168    172    Ljava/lang/IllegalArgumentException;
        //  98     103    164    168    Landroid/os/RemoteException;
        //  98     103    221    222    Any
        //  106    116    172    176    Landroid/database/CursorIndexOutOfBoundsException;
        //  106    116    168    172    Ljava/lang/IllegalArgumentException;
        //  106    116    164    168    Landroid/os/RemoteException;
        //  106    116    221    222    Any
        //  119    127    172    176    Landroid/database/CursorIndexOutOfBoundsException;
        //  119    127    168    172    Ljava/lang/IllegalArgumentException;
        //  119    127    164    168    Landroid/os/RemoteException;
        //  119    127    221    222    Any
        //  130    137    172    176    Landroid/database/CursorIndexOutOfBoundsException;
        //  130    137    168    172    Ljava/lang/IllegalArgumentException;
        //  130    137    164    168    Landroid/os/RemoteException;
        //  130    137    221    222    Any
        //  140    150    172    176    Landroid/database/CursorIndexOutOfBoundsException;
        //  140    150    168    172    Ljava/lang/IllegalArgumentException;
        //  140    150    164    168    Landroid/os/RemoteException;
        //  140    150    221    222    Any
        //  197    207    221    222    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0059:
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
    public final nxg a(final ota ota) {
        final String encodeToString = Base64.encodeToString(ota.g(), 0);
        final nxg c = ost.c;
        final okt okt = (okt)c.H(5);
        okt.o(c);
        return (nxg)this.g(okt, this.f, encodeToString);
    }
    
    @Override
    public final osx b() {
        return (osx)this.g(osx.a.m(), this.c, null);
    }
    
    @Override
    public final osy c() {
        return (osy)this.g(osy.e.m(), this.e, null);
    }
    
    @Override
    public final osz d() {
        return (osz)this.g(osz.a.m(), this.d, null);
    }
    
    @Override
    public final void e() {
        this.b.close();
    }
    
    @Override
    public final boolean f(final osx osx) {
        final Uri c = this.c;
        while (true) {
            if (osx == null) {
                try {
                    int n = this.b.delete(c, (String)null, (String[])null);
                    while (true) {
                        if (n > 0) {
                            return true;
                        }
                        return false;
                        final ContentValues contentValues = new ContentValues();
                        contentValues.put("value", osx.g());
                        n = this.b.update(c, contentValues, (String)null, (String[])null);
                        continue;
                    }
                }
                catch (final SecurityException ex) {
                    Log.e(ort.a, "Insufficient permissions to write params to ContentProvider", (Throwable)ex);
                }
                catch (final RemoteException ex2) {
                    Log.e(ort.a, "Failed to write params to ContentProvider", (Throwable)ex2);
                }
                return false;
            }
            continue;
        }
    }
}
