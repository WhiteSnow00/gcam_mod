import java.util.concurrent.Executor;
import com.google.mediapipe.framework.MediaPipeException;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import com.google.mediapipe.framework.AndroidAssetUtil;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djw implements jfy, krc
{
    public static final nsd a;
    public static final kra b;
    private static final String p;
    private static final String q;
    private static final float[] r;
    public final kse c;
    public ksh d;
    public final djt e;
    public final lyp f;
    public final mao g;
    public final oiy h;
    public final maq i;
    public final lzu j;
    public volatile boolean k;
    public volatile djv l;
    public boolean m;
    public final Object n;
    public final lit o;
    
    static {
        a = nsd.g("com/google/android/apps/camera/faceobfuscation/FaceObfuscationEffect");
        b = kra.b;
        p = nfa.i("in vec2 position;", new Object[] { "out vec2 texCoord;", "void main() {", "  texCoord = (1.0 + position) / 2.0;", "  gl_Position = vec4(position, 0.0, 1.0);", "}" }, "\n");
        q = nfa.i("#extension GL_EXT_YUV_target : enable", new Object[] { "precision highp float;", "uniform highp sampler2D imgTex;", "in vec2 texCoord;", "layout(yuv) out vec4 outColor;", "void main() {", "  outColor = vec4(rgb_2_yuv(texture(imgTex, texCoord).rgb, itu_601_full_range), 1.0);", "}" }, "\n");
        r = new float[] { -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f };
        ojc.b(oou.class, "drishti.Detection");
        ojc.b(oov.class, "drishti.DetectionList");
        ojc.b(ooy.class, "drishti.LocationData");
    }
    
    public djw(jgd b, final Context context, final lit o, final kse c, final djt e) {
        this.l = null;
        this.m = false;
        this.n = new Object();
        (this.c = c).f("Magritte VFX creation");
        this.e = e;
        AndroidAssetUtil.a(context);
        b = (TimeoutException)((jgd)b).b();
        this.f = (lyp)b;
        this.g = mao.a((lyp)b);
        this.o = o;
        this.i = maq.f((lyp)b, mar.b(djw.r));
        final mal d = mal.d((lyp)b, djw.p);
        final mal b2 = mal.b((lyp)b, djw.q);
        final lzt b3 = lzu.b((lyp)b);
        b3.b(mga.g(d));
        b3.b(mga.g(b2));
        this.j = b3.a();
        final ofn f = ofn.f();
        ((Executor)b).execute(new djq(this, f));
        try {
            b = (TimeoutException)new oiy(context, (long)f.get(1000L, TimeUnit.MILLISECONDS), (String)djt.e.getOrDefault(e, "gca_viewfinder_only_redaction.binarypb"));
            this.h = (oiy)b;
            njo.p(true ^ ((oiy)b).d.get(), "setMaxFramesInFlight must be called before the graph is started");
            synchronized (b) {
                ((oiy)b).f = 0;
                monitorexit(b);
                c.c("Magritte preheat", new djo(this)).run();
                ((oiy)b).c(new djn(this));
                return;
            }
        }
        catch (final TimeoutException b) {}
        catch (final ExecutionException b) {}
        catch (final InterruptedException ex) {}
        a.m(djw.a.b(), "Failure in setting up face obfuscation effect", '\u0321', b);
        this.m = true;
        this.h = null;
    }
    
    @Override
    public final jfz a() {
        return jfz.c;
    }
    
    @Override
    public final void c(final kvs p0, final kwz p1, final kvs p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokeinterface kvs.d:(Lkwz;)Llju;
        //     7: astore          4
        //     9: aload_3        
        //    10: aload_2        
        //    11: invokeinterface kvs.d:(Lkwz;)Llju;
        //    16: astore_2       
        //    17: aload           4
        //    19: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    22: pop            
        //    23: aload           4
        //    25: invokeinterface lju.f:()Landroid/hardware/HardwareBuffer;
        //    30: astore_3       
        //    31: aload_2        
        //    32: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    35: pop            
        //    36: aload_2        
        //    37: invokeinterface lju.f:()Landroid/hardware/HardwareBuffer;
        //    42: astore          5
        //    44: new             Lcom/google/android/libraries/oliveoil/gl/EGLImage;
        //    47: astore          6
        //    49: aload_3        
        //    50: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    53: pop            
        //    54: aload           6
        //    56: aload_3        
        //    57: invokespecial   com/google/android/libraries/oliveoil/gl/EGLImage.<init>:(Landroid/hardware/HardwareBuffer;)V
        //    60: new             Lcom/google/android/libraries/oliveoil/gl/EGLImage;
        //    63: astore          7
        //    65: aload           5
        //    67: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    70: pop            
        //    71: aload           7
        //    73: aload           5
        //    75: invokespecial   com/google/android/libraries/oliveoil/gl/EGLImage.<init>:(Landroid/hardware/HardwareBuffer;)V
        //    78: aload_0        
        //    79: getfield        djw.f:Llyp;
        //    82: aload           6
        //    84: invokestatic    lzn.b:(Llyp;Lcom/google/android/libraries/oliveoil/gl/EGLImage;)Llzn;
        //    87: astore          8
        //    89: aload_0        
        //    90: getfield        djw.f:Llyp;
        //    93: aload           7
        //    95: invokestatic    lyo.b:(Llyp;Lcom/google/android/libraries/oliveoil/gl/EGLImage;)Llyo;
        //    98: astore          9
        //   100: aload           4
        //   102: invokeinterface lju.d:()J
        //   107: lstore          10
        //   109: aload_1        
        //   110: invokeinterface kvs.c:()Lljm;
        //   115: astore_1       
        //   116: aload_0        
        //   117: getfield        djw.c:Lkse;
        //   120: astore          12
        //   122: new             Ldjr;
        //   125: astore          13
        //   127: aload           13
        //   129: aload_0        
        //   130: lload           10
        //   132: aload           9
        //   134: aload           8
        //   136: aload_1        
        //   137: invokespecial   djr.<init>:(Ldjw;JLlyo;Llzn;Lljm;)V
        //   140: aload           12
        //   142: ldc_w           "Magritte VFX processing"
        //   145: aload           13
        //   147: invokeinterface kse.d:(Ljava/lang/String;Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Callable;
        //   152: invokeinterface java/util/concurrent/Callable.call:()Ljava/lang/Object;
        //   157: checkcast       Ljava/lang/Boolean;
        //   160: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   163: pop            
        //   164: goto            188
        //   167: astore_1       
        //   168: goto            172
        //   171: astore_1       
        //   172: getstatic       djw.a:Lnsd;
        //   175: invokevirtual   nry.c:()Lnsu;
        //   178: ldc_w           "Error in Magritte VFX processing"
        //   181: sipush          807
        //   184: aload_1        
        //   185: invokestatic    a.m:(Lnsu;Ljava/lang/String;CLjava/lang/Throwable;)V
        //   188: aload           4
        //   190: astore_1       
        //   191: aload           9
        //   193: invokevirtual   lyv.close:()V
        //   196: aload           8
        //   198: invokevirtual   lyv.close:()V
        //   201: aload           7
        //   203: invokevirtual   com/google/android/libraries/oliveoil/gl/EGLImage.close:()V
        //   206: aload           6
        //   208: invokevirtual   com/google/android/libraries/oliveoil/gl/EGLImage.close:()V
        //   211: aload           5
        //   213: ifnull          221
        //   216: aload           5
        //   218: invokevirtual   android/hardware/HardwareBuffer.close:()V
        //   221: aload_3        
        //   222: ifnull          229
        //   225: aload_3        
        //   226: invokevirtual   android/hardware/HardwareBuffer.close:()V
        //   229: aload_2        
        //   230: ifnull          239
        //   233: aload_2        
        //   234: invokeinterface lju.close:()V
        //   239: aload_1        
        //   240: ifnull          249
        //   243: aload_1        
        //   244: invokeinterface lju.close:()V
        //   249: return         
        //   250: astore_1       
        //   251: goto            255
        //   254: astore_1       
        //   255: aload           9
        //   257: invokevirtual   lyv.close:()V
        //   260: goto            271
        //   263: astore          9
        //   265: aload_1        
        //   266: aload           9
        //   268: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   271: aload_1        
        //   272: athrow         
        //   273: astore_1       
        //   274: goto            278
        //   277: astore_1       
        //   278: aload           8
        //   280: invokevirtual   lyv.close:()V
        //   283: goto            294
        //   286: astore          8
        //   288: aload_1        
        //   289: aload           8
        //   291: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   294: aload_1        
        //   295: athrow         
        //   296: astore_1       
        //   297: goto            301
        //   300: astore_1       
        //   301: aload           7
        //   303: invokevirtual   com/google/android/libraries/oliveoil/gl/EGLImage.close:()V
        //   306: goto            317
        //   309: astore          7
        //   311: aload_1        
        //   312: aload           7
        //   314: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   317: aload_1        
        //   318: athrow         
        //   319: astore_1       
        //   320: goto            324
        //   323: astore_1       
        //   324: aload           6
        //   326: invokevirtual   com/google/android/libraries/oliveoil/gl/EGLImage.close:()V
        //   329: goto            340
        //   332: astore          6
        //   334: aload_1        
        //   335: aload           6
        //   337: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   340: aload_1        
        //   341: athrow         
        //   342: astore_1       
        //   343: goto            347
        //   346: astore_1       
        //   347: aload           5
        //   349: ifnull          368
        //   352: aload           5
        //   354: invokevirtual   android/hardware/HardwareBuffer.close:()V
        //   357: goto            368
        //   360: astore          5
        //   362: aload_1        
        //   363: aload           5
        //   365: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   368: aload_1        
        //   369: athrow         
        //   370: astore_1       
        //   371: goto            375
        //   374: astore_1       
        //   375: aload_3        
        //   376: ifnull          392
        //   379: aload_3        
        //   380: invokevirtual   android/hardware/HardwareBuffer.close:()V
        //   383: goto            392
        //   386: astore_3       
        //   387: aload_1        
        //   388: aload_3        
        //   389: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   392: aload_1        
        //   393: athrow         
        //   394: astore_1       
        //   395: goto            399
        //   398: astore_1       
        //   399: aload_2        
        //   400: ifnull          418
        //   403: aload_2        
        //   404: invokeinterface lju.close:()V
        //   409: goto            418
        //   412: astore_2       
        //   413: aload_1        
        //   414: aload_2        
        //   415: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   418: aload_1        
        //   419: athrow         
        //   420: astore_1       
        //   421: goto            425
        //   424: astore_1       
        //   425: aload           4
        //   427: ifnull          446
        //   430: aload           4
        //   432: invokeinterface lju.close:()V
        //   437: goto            446
        //   440: astore_2       
        //   441: aload_1        
        //   442: aload_2        
        //   443: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   446: aload_1        
        //   447: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      17     424    425    Any
        //  17     31     398    399    Any
        //  31     44     374    375    Any
        //  44     60     346    347    Any
        //  60     78     323    324    Any
        //  78     89     300    301    Any
        //  89     100    277    278    Any
        //  100    116    254    255    Any
        //  116    127    171    172    Ljava/lang/Exception;
        //  116    127    254    255    Any
        //  127    164    167    171    Ljava/lang/Exception;
        //  127    164    250    254    Any
        //  172    188    250    254    Any
        //  191    196    273    277    Any
        //  196    201    296    300    Any
        //  201    206    319    323    Any
        //  206    211    342    346    Any
        //  216    221    370    374    Any
        //  225    229    394    398    Any
        //  233    239    420    424    Any
        //  255    260    263    271    Any
        //  265    271    273    277    Any
        //  271    273    273    277    Any
        //  278    283    286    294    Any
        //  288    294    296    300    Any
        //  294    296    296    300    Any
        //  301    306    309    317    Any
        //  311    317    319    323    Any
        //  317    319    319    323    Any
        //  324    329    332    340    Any
        //  334    340    342    346    Any
        //  340    342    342    346    Any
        //  352    357    360    368    Any
        //  362    368    370    374    Any
        //  368    370    370    374    Any
        //  379    383    386    392    Any
        //  387    392    394    398    Any
        //  392    394    394    398    Any
        //  403    409    412    418    Any
        //  413    418    420    424    Any
        //  418    420    420    424    Any
        //  430    437    440    446    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0221:
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
    public final void close() {
        synchronized (this.n) {
            if (this.m) {
                djw.a.c().E(805).o("Trying to close effect after it is closed.");
                return;
            }
            this.m = true;
            final oiy h = this.h;
            if (h != null && h.d.get()) {
                try {
                    h.b.d();
                    h.b.j();
                }
                catch (final MediaPipeException ex) {
                    Log.e("FrameProcessor", "Mediapipe error: ", (Throwable)ex);
                }
                try {
                    h.b.i();
                }
                catch (final MediaPipeException ex2) {
                    Log.e("FrameProcessor", "Mediapipe error: ", (Throwable)ex2);
                }
            }
            this.g.close();
            this.j.close();
        }
    }
}
