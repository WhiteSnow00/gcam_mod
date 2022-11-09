import android.content.res.Configuration;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.Iterator;
import android.content.pm.ApplicationInfo;
import com.bumptech.glide.GeneratedAppGlideModule;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentCallbacks;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import com.google.android.apps.camera.filmstrip.GlideConfiguration;
import java.util.Collections;
import android.content.ContentResolver;
import android.content.res.Resources;
import java.net.URL;
import java.io.File;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.graphics.Bitmap;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import android.content.Context;
import java.util.List;
import android.content.ComponentCallbacks2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auf implements ComponentCallbacks2
{
    private static volatile auf h;
    private static volatile boolean i;
    public final azk a;
    public final auk b;
    public final auu c;
    public final azi d;
    public final bgo e;
    public final List f;
    public final bgh g;
    private final bah j;
    
    public auf(final Context context, final ayn ayn, final bah j, final azk a, final azi d, final bgo e, final bgh g, final Map map, final List list, final aun aun) {
        this.f = new ArrayList();
        this.a = a;
        this.d = d;
        this.j = j;
        this.e = e;
        this.g = g;
        final Resources resources = context.getResources();
        if (aun.a.get(aui.class) != null) {
            bec.a = 0;
        }
        final auu c = new auu();
        (this.c = c).i(new bdo());
        c.i(new bea());
        final List b = c.b();
        final bfh bfh = new bfh(context, b, a, d);
        final bex bex = new bex(a, new beu(2));
        final bdw bdw = new bdw(c.b(), resources.getDisplayMetrics(), a, d);
        awi awi;
        awi awi2;
        if (aun.a(aug.class)) {
            awi = new beh();
            awi2 = new beh(1);
        }
        else {
            awi2 = new bej(bdw, 1);
            awi = new beo(bdw, d);
        }
        final bfe bfe = new bfe(context);
        final bcg bcg = new bcg(resources, 2);
        final bcg bcg2 = new bcg(resources, 3);
        final bcg bcg3 = new bcg(resources);
        final bcg bcg4 = new bcg(resources, 1);
        final bde bde = new bde(d);
        final bfv bfv = new bfv();
        final bgb bgb = new bgb(1);
        final ContentResolver contentResolver = context.getContentResolver();
        c.d(ByteBuffer.class, new bba());
        c.d(InputStream.class, new bci(d));
        c.h("Bitmap", ByteBuffer.class, Bitmap.class, awi2);
        c.h("Bitmap", InputStream.class, Bitmap.class, awi);
        c.h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new bej(bdw));
        c.h("Bitmap", ParcelFileDescriptor.class, Bitmap.class, bex);
        c.h("Bitmap", AssetFileDescriptor.class, Bitmap.class, new bex(a, new beu(1)));
        c.g(Bitmap.class, Bitmap.class, bcn.a);
        c.h("Bitmap", Bitmap.class, Bitmap.class, new bff(1));
        c.e(Bitmap.class, bde);
        c.h("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new bdc(resources, awi2));
        c.h("BitmapDrawable", InputStream.class, BitmapDrawable.class, new bdc(resources, awi));
        c.h("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new bdc(resources, bex));
        c.e(BitmapDrawable.class, new bdd(a, bde));
        c.h("Gif", InputStream.class, bfk.class, new bfu(b, bfh, d));
        c.h("Gif", ByteBuffer.class, bfk.class, bfh);
        c.e(bfk.class, new bfl());
        c.g(avk.class, avk.class, bcn.a);
        c.h("Bitmap", avk.class, Bitmap.class, new bfs(a));
        c.f(Uri.class, Drawable.class, bfe);
        c.f(Uri.class, Bitmap.class, new bem(bfe, a));
        c.j(new bey());
        c.g(File.class, ByteBuffer.class, new bay(2));
        c.g(File.class, InputStream.class, new bbg(new bbj()));
        c.f(File.class, File.class, new bff(2));
        c.g(File.class, ParcelFileDescriptor.class, new bbg(new bbj(1)));
        c.g(File.class, File.class, bcn.a);
        c.j(new awz(d));
        c.j(new axc());
        c.g(Integer.TYPE, InputStream.class, bcg);
        c.g(Integer.TYPE, ParcelFileDescriptor.class, bcg3);
        c.g(Integer.class, InputStream.class, bcg);
        c.g(Integer.class, ParcelFileDescriptor.class, bcg3);
        c.g(Integer.class, Uri.class, bcg2);
        c.g(Integer.TYPE, AssetFileDescriptor.class, bcg4);
        c.g(Integer.class, AssetFileDescriptor.class, bcg4);
        c.g(Integer.TYPE, Uri.class, bcg2);
        c.g(String.class, InputStream.class, new bbf());
        c.g(Uri.class, InputStream.class, new bbf());
        c.g(String.class, InputStream.class, new bay(5));
        c.g(String.class, ParcelFileDescriptor.class, new bay(4));
        c.g(String.class, AssetFileDescriptor.class, new bay(3));
        c.g(Uri.class, InputStream.class, new bat(context.getAssets()));
        c.g(Uri.class, ParcelFileDescriptor.class, new bat(context.getAssets(), 1));
        c.g(Uri.class, InputStream.class, new bcr(context));
        c.g(Uri.class, InputStream.class, new bcr(context, 2));
        c.g(Uri.class, InputStream.class, new bct(context, InputStream.class));
        c.g(Uri.class, ParcelFileDescriptor.class, new bct(context, ParcelFileDescriptor.class));
        c.g(Uri.class, InputStream.class, new bck(contentResolver, 2));
        c.g(Uri.class, ParcelFileDescriptor.class, new bck(contentResolver));
        c.g(Uri.class, AssetFileDescriptor.class, new bck(contentResolver, 1));
        c.g(Uri.class, InputStream.class, new bcn());
        c.g(URL.class, InputStream.class, new bcn(2, null));
        c.g(Uri.class, File.class, new bcr(context, 1));
        c.g(bbl.class, InputStream.class, new bcp());
        c.g(byte[].class, ByteBuffer.class, new bay(1));
        c.g(byte[].class, InputStream.class, new bay());
        c.g(Uri.class, Uri.class, bcn.a);
        c.g(Drawable.class, Drawable.class, bcn.a);
        c.f(Drawable.class, Drawable.class, new bff());
        c.k(Bitmap.class, BitmapDrawable.class, new bfw(resources));
        c.k(Bitmap.class, byte[].class, bfv);
        c.k(Drawable.class, byte[].class, new bfx(a, bfv, bgb));
        c.k(bfk.class, byte[].class, bgb);
        final bex bex2 = new bex(a, new beu());
        c.f(ByteBuffer.class, Bitmap.class, bex2);
        c.f(ByteBuffer.class, BitmapDrawable.class, new bdc(resources, bex2));
        this.b = new auk(context, d, c, map, list, ayn, aun);
    }
    
    public static auf b(Context applicationContext) {
        if (auf.h == null) {
            final GeneratedAppGlideModule d = d(applicationContext.getApplicationContext());
            synchronized (auf.class) {
                if (auf.h == null) {
                    if (!auf.i) {
                        auf.i = true;
                        final auj auj = new auj();
                        applicationContext = applicationContext.getApplicationContext();
                        Collections.emptyList();
                        final ArrayList list = new ArrayList();
                        try {
                            final ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                            if (applicationInfo.metaData != null) {
                                for (final String s : applicationInfo.metaData.keySet()) {
                                    if ("GlideModule".equals(applicationInfo.metaData.get(s))) {
                                        list.add(dap.d(s));
                                    }
                                }
                            }
                            if (d != null && !d.a().isEmpty()) {
                                final Set a = d.a();
                                final Iterator iterator2 = list.iterator();
                                while (iterator2.hasNext()) {
                                    if (a.contains(((GlideConfiguration)iterator2.next()).getClass())) {
                                        iterator2.remove();
                                    }
                                }
                            }
                            for (GlideConfiguration glideConfiguration : list) {}
                            if (auj.f == null) {
                                final bao bao = new bao(false);
                                bao.b(bar.a());
                                bao.a = "source";
                                auj.f = bao.a();
                            }
                            if (auj.g == null) {
                                final bao bao2 = new bao(true);
                                bao2.b(1);
                                bao2.a = "disk-cache";
                                auj.g = bao2.a();
                            }
                            if (auj.i == null) {
                                int n;
                                if (bar.a() >= 4) {
                                    n = 2;
                                }
                                else {
                                    n = 1;
                                }
                                final bao bao3 = new bao(true);
                                bao3.b(n);
                                bao3.a = "animation";
                                auj.i = bao3.a();
                            }
                            if (auj.h == null) {
                                auj.h = new bak(new bai(applicationContext));
                            }
                            if (auj.m == null) {
                                auj.m = new bgh();
                            }
                            if (auj.d == null) {
                                final int a2 = auj.h.a;
                                if (a2 > 0) {
                                    auj.d = new azs(a2);
                                }
                                else {
                                    auj.d = new azl();
                                }
                            }
                            if (auj.e == null) {
                                auj.e = new azr(auj.h.c);
                            }
                            if (auj.k == null) {
                                auj.k = new bah(auj.h.b);
                            }
                            if (auj.l == null) {
                                auj.l = new bae(applicationContext);
                            }
                            if (auj.c == null) {
                                auj.c = new ayn(auj.k, auj.l, auj.g, auj.f, new bar(new ThreadPoolExecutor(0, Integer.MAX_VALUE, bar.a, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(), new baq("source-unlimited", false))), auj.i);
                            }
                            final List j = auj.j;
                            if (j == null) {
                                auj.j = Collections.emptyList();
                            }
                            else {
                                auj.j = Collections.unmodifiableList((List<?>)j);
                            }
                            final auf h = new auf(applicationContext, auj.c, auj.k, auj.d, auj.e, new bgo(), auj.m, auj.a, auj.j, new aun(auj.b));
                            for (GlideConfiguration glideConfiguration2 : list) {}
                            applicationContext.registerComponentCallbacks((ComponentCallbacks)h);
                            auf.h = h;
                            auf.i = false;
                            return auf.h;
                        }
                        catch (final PackageManager$NameNotFoundException ex) {
                            throw new RuntimeException("Unable to find metadata to parse GlideModules", (Throwable)ex);
                        }
                    }
                    throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                }
            }
        }
        return auf.h;
    }
    
    public static auz c(final Context context) {
        bit.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).e.a(context);
    }
    
    private static GeneratedAppGlideModule d(final Context context) {
        final GeneratedAppGlideModule generatedAppGlideModule = null;
        Label_0096: {
            GeneratedAppGlideModule generatedAppGlideModule2;
            try {
                generatedAppGlideModule2 = (GeneratedAppGlideModule)Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
            }
            catch (final InvocationTargetException ex) {
                e(ex);
                generatedAppGlideModule2 = generatedAppGlideModule;
            }
            catch (final NoSuchMethodException ex2) {
                e(ex2);
                generatedAppGlideModule2 = generatedAppGlideModule;
            }
            catch (final IllegalAccessException ex3) {
                e(ex3);
                generatedAppGlideModule2 = generatedAppGlideModule;
            }
            catch (final InstantiationException ex4) {
                e(ex4);
                generatedAppGlideModule2 = generatedAppGlideModule;
            }
            catch (final ClassNotFoundException ex5) {
                if (Log.isLoggable("Glide", 5)) {
                    break Label_0096;
                }
                generatedAppGlideModule2 = generatedAppGlideModule;
            }
            return generatedAppGlideModule2;
        }
        Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
        return null;
    }
    
    private static void e(final Exception ex) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", ex);
    }
    
    public final Context a() {
        return this.b.getBaseContext();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
    }
    
    public final void onLowMemory() {
        biv.i();
        this.j.i();
        this.a.c();
        this.d.b();
    }
    
    public final void onTrimMemory(final int n) {
        biv.i();
        Object o = this.f;
        monitorenter(o);
        try {
            for (auz auz : this.f) {}
            monitorexit(o);
            o = this.j;
            int n2 = 0;
            Label_0100: {
                if (n >= 40) {
                    ((biq)o).i();
                    n2 = n;
                }
                else {
                    if ((n2 = n) < 20) {
                        if ((n2 = n) != 15) {
                            break Label_0100;
                        }
                        n2 = 15;
                    }
                    ((biq)o).j(((biq)o).e() / 2L);
                }
            }
            this.a.e(n2);
            this.d.d(n2);
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
