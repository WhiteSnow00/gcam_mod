import android.content.ContextWrapper;
import android.app.Activity;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.Menu;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import android.view.MenuInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mb extends MenuInflater
{
    static final Class[] a;
    static final Class[] b;
    final Object[] c;
    final Object[] d;
    final Context e;
    public Object f;
    
    static {
        b = (a = new Class[] { Context.class });
    }
    
    public mb(final Context e) {
        super(e);
        this.e = e;
        final Object[] array = { e };
        this.c = array;
        this.d = array;
    }
    
    private final void b(final XmlPullParser xmlPullParser, final AttributeSet set, final Menu menu) {
        final ma ma = new ma(this, menu);
        int i = xmlPullParser.getEventType();
        String name3;
        while (true) {
            while (i != 2) {
                i = xmlPullParser.next();
                if (i == 1) {
                    int j = 0;
                    int n = 0;
                    Object o = null;
                    int next = i;
                    while (j == 0) {
                        int n2 = 0;
                        Label_0998: {
                            switch (next) {
                                default: {
                                    n2 = n;
                                    break Label_0998;
                                }
                                case 3: {
                                    final String name = xmlPullParser.getName();
                                    if (n != 0 && name.equals(o)) {
                                        n2 = 0;
                                        o = null;
                                        break Label_0998;
                                    }
                                    if (name.equals("group")) {
                                        ma.c();
                                        n2 = n;
                                        break Label_0998;
                                    }
                                    if (name.equals("item")) {
                                        if (!ma.h) {
                                            final hu a = ma.A;
                                            if (a != null && a.d()) {
                                                ma.a();
                                                n2 = n;
                                                break Label_0998;
                                            }
                                            ma.h = true;
                                            ma.d(ma.a.add(ma.b, ma.i, ma.j, ma.k));
                                        }
                                        n2 = n;
                                        break Label_0998;
                                    }
                                    if (name.equals("menu")) {
                                        j = 1;
                                        n2 = n;
                                        break Label_0998;
                                    }
                                    break;
                                }
                                case 2: {
                                    if (n != 0) {
                                        break;
                                    }
                                    final String name2 = xmlPullParser.getName();
                                    if (name2.equals("group")) {
                                        final TypedArray obtainStyledAttributes = ma.F.e.obtainStyledAttributes(set, lo.o);
                                        ma.b = obtainStyledAttributes.getResourceId(1, 0);
                                        ma.c = obtainStyledAttributes.getInt(3, 0);
                                        ma.d = obtainStyledAttributes.getInt(4, 0);
                                        ma.e = obtainStyledAttributes.getInt(5, 0);
                                        ma.f = obtainStyledAttributes.getBoolean(2, true);
                                        ma.g = obtainStyledAttributes.getBoolean(0, true);
                                        obtainStyledAttributes.recycle();
                                        n2 = n;
                                        break Label_0998;
                                    }
                                    if (name2.equals("item")) {
                                        final to k = to.k(ma.F.e, set, lo.p);
                                        ma.i = k.f(2, 0);
                                        ma.j = ((k.c(5, ma.c) & 0xFFFF0000) | (char)k.c(6, ma.d));
                                        ma.k = k.l(7);
                                        ma.l = k.l(8);
                                        ma.m = k.f(0, 0);
                                        ma.n = ma.e(k.m(9));
                                        ma.o = k.c(16, 4096);
                                        ma.p = ma.e(k.m(10));
                                        ma.q = k.c(20, 4096);
                                        if (k.p(11)) {
                                            ma.r = (k.o(11, false) ? 1 : 0);
                                        }
                                        else {
                                            ma.r = ma.e;
                                        }
                                        ma.s = k.o(3, false);
                                        ma.t = k.o(4, ma.f);
                                        ma.u = k.o(1, ma.g);
                                        ma.v = k.c(21, -1);
                                        ma.z = k.m(12);
                                        ma.w = k.f(13, 0);
                                        ma.x = k.m(15);
                                        ma.y = k.m(14);
                                        final String y = ma.y;
                                        Label_0837: {
                                            if (y != null) {
                                                if (ma.w == 0 && ma.x == null) {
                                                    ma.A = (hu)ma.b(y, mb.b, ma.F.d);
                                                    break Label_0837;
                                                }
                                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                            }
                                            ma.A = null;
                                        }
                                        ma.B = k.l(17);
                                        ma.C = k.l(22);
                                        if (k.p(19)) {
                                            ma.E = qi.a(k.c(19, -1), ma.E);
                                        }
                                        else {
                                            ma.E = null;
                                        }
                                        if (k.p(18)) {
                                            ma.D = k.g(18);
                                        }
                                        else {
                                            ma.D = null;
                                        }
                                        k.n();
                                        ma.h = false;
                                        n2 = n;
                                        break Label_0998;
                                    }
                                    if (name2.equals("menu")) {
                                        this.b(xmlPullParser, set, (Menu)ma.a());
                                        n2 = n;
                                        break Label_0998;
                                    }
                                    o = name2;
                                    n2 = 1;
                                    break Label_0998;
                                }
                                case 1: {
                                    throw new RuntimeException("Unexpected end of document");
                                }
                            }
                            n2 = n;
                        }
                        next = xmlPullParser.next();
                        n = n2;
                    }
                    return;
                }
            }
            name3 = xmlPullParser.getName();
            if (name3.equals("menu")) {
                i = xmlPullParser.next();
                continue;
            }
            break;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expecting menu, got ");
        sb.append(name3);
        throw new RuntimeException(sb.toString());
    }
    
    public final Object a(final Object o) {
        if (o instanceof Activity) {
            return o;
        }
        Object a = o;
        if (o instanceof ContextWrapper) {
            a = this.a(((ContextWrapper)o).getBaseContext());
        }
        return a;
    }
    
    public final void inflate(final int p0, final Menu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lhe;
        //     4: ifeq            149
        //     7: aconst_null    
        //     8: astore_3       
        //     9: aconst_null    
        //    10: astore          4
        //    12: aconst_null    
        //    13: astore          5
        //    15: aload_0        
        //    16: getfield        mb.e:Landroid/content/Context;
        //    19: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    22: iload_1        
        //    23: invokevirtual   android/content/res/Resources.getLayout:(I)Landroid/content/res/XmlResourceParser;
        //    26: astore          6
        //    28: aload           6
        //    30: astore          5
        //    32: aload_0        
        //    33: aload           6
        //    35: aload           6
        //    37: invokestatic    android/util/Xml.asAttributeSet:(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
        //    40: aload_2        
        //    41: invokespecial   mb.b:(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
        //    44: aload           6
        //    46: ifnull          56
        //    49: aload           6
        //    51: invokeinterface android/content/res/XmlResourceParser.close:()V
        //    56: return         
        //    57: astore_2       
        //    58: goto            78
        //    61: astore_2       
        //    62: goto            108
        //    65: astore_2       
        //    66: aload           4
        //    68: astore          5
        //    70: goto            135
        //    73: astore_2       
        //    74: aload           5
        //    76: astore          6
        //    78: aload           6
        //    80: astore          5
        //    82: new             Landroid/view/InflateException;
        //    85: astore_3       
        //    86: aload           6
        //    88: astore          5
        //    90: aload_3        
        //    91: ldc_w           "Error inflating menu XML"
        //    94: aload_2        
        //    95: invokespecial   android/view/InflateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    98: aload           6
        //   100: astore          5
        //   102: aload_3        
        //   103: athrow         
        //   104: astore_2       
        //   105: aload_3        
        //   106: astore          6
        //   108: aload           6
        //   110: astore          5
        //   112: new             Landroid/view/InflateException;
        //   115: astore_3       
        //   116: aload           6
        //   118: astore          5
        //   120: aload_3        
        //   121: ldc_w           "Error inflating menu XML"
        //   124: aload_2        
        //   125: invokespecial   android/view/InflateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   128: aload           6
        //   130: astore          5
        //   132: aload_3        
        //   133: athrow         
        //   134: astore_2       
        //   135: aload           5
        //   137: ifnull          147
        //   140: aload           5
        //   142: invokeinterface android/content/res/XmlResourceParser.close:()V
        //   147: aload_2        
        //   148: athrow         
        //   149: aload_0        
        //   150: iload_1        
        //   151: aload_2        
        //   152: invokespecial   android/view/MenuInflater.inflate:(ILandroid/view/Menu;)V
        //   155: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                   
        //  -----  -----  -----  -----  ---------------------------------------
        //  15     28     104    108    Lorg/xmlpull/v1/XmlPullParserException;
        //  15     28     73     78     Ljava/io/IOException;
        //  15     28     65     73     Any
        //  32     44     61     65     Lorg/xmlpull/v1/XmlPullParserException;
        //  32     44     57     61     Ljava/io/IOException;
        //  32     44     134    135    Any
        //  82     86     134    135    Any
        //  90     98     134    135    Any
        //  102    104    134    135    Any
        //  112    116    134    135    Any
        //  120    128    134    135    Any
        //  132    134    134    135    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0056:
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
