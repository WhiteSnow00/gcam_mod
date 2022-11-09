import com.google.android.libraries.lens.lenslite.dynamicloading.EngineApiLoader;
import java.util.Iterator;
import java.util.Set;
import android.content.pm.PackageManager$NameNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;
import android.os.Bundle;
import com.google.android.libraries.lens.lenslite.dynamicloading.ApiVersion;
import dalvik.system.DexClassLoader;
import android.os.Build;
import java.io.File;
import android.text.TextUtils;
import com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lrd implements lrb
{
    public final lqc a;
    private final Context b;
    private final lqw c;
    
    public lrd(final Context b, final lqw c, final lqc a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final DLEngineApi a(String message) {
        final lqw c = this.c;
        final Context context = (Context)((ouo)c.a).a;
        context.getClass();
        final Set a = ((ous)c.b).a();
        a.getClass();
        message.getClass();
        final lqv lqv = new lqv(context, a, message);
        final Context d = lqv.d;
        Object b = lqv.f;
        try {
            final Context packageContext = d.createPackageContext((String)b, 3);
            final String c2 = lqv.c(packageContext, lqv.f);
            Object o = lqv.b;
            synchronized (o) {
                if (!lqv.c.containsKey(c2)) {
                    if (packageContext.getPackageName().equals(lqv.d.getPackageName())) {
                        b = lqv.d.getClassLoader();
                    }
                    else {
                        final String packageCodePath = packageContext.getPackageCodePath();
                        b = lqv.d.getCodeCacheDir().getAbsolutePath();
                        final String nativeLibraryDir = packageContext.getApplicationInfo().nativeLibraryDir;
                        final String packageCodePath2 = packageContext.getPackageCodePath();
                        final String[] splitSourceDirs = packageContext.getApplicationInfo().splitSourceDirs;
                        final StringBuilder sb = new StringBuilder();
                        sb.append(nativeLibraryDir);
                        if (!TextUtils.isEmpty((CharSequence)packageCodePath2)) {
                            sb.append(File.pathSeparator);
                            sb.append(packageCodePath2);
                            sb.append("!/lib/");
                            sb.append(Build.SUPPORTED_ABIS[0]);
                        }
                        if (splitSourceDirs != null) {
                            for (final String s : splitSourceDirs) {
                                sb.append(File.pathSeparator);
                                sb.append(s);
                                sb.append("!/lib/");
                                sb.append(Build.SUPPORTED_ABIS[0]);
                            }
                        }
                        b = new DexClassLoader(packageCodePath, (String)b, sb.toString(), (ClassLoader)new lqu(lqv.d.getClassLoader(), lqv.a));
                    }
                    lqv.c.put(c2, b);
                }
                monitorexit(o);
                lqv.g = (Context)new lqt(packageContext, lqv.d);
                o = lqv.f;
                final Iterator iterator = lqv.e.iterator();
                while (iterator.hasNext()) {
                    b = iterator.next();
                    final lrh b2 = ((lqz)b).b;
                    final long n = lrh.d(lqv);
                    final lrh b3 = ((lqz)b).b;
                    final long n2 = lrh.c(lqv);
                    ((lqz)b).a.a();
                    int n3 = 4;
                    if (n == 17L) {
                        b = lrg.c.m();
                        if (((okt)b).c) {
                            ((okt)b).m();
                            ((okt)b).c = false;
                        }
                        ((lrg)((okt)b).b).a = lrh.b(3);
                        b = ((okt)b).h();
                    }
                    else if (n < 17L && n >= 4L) {
                        b = lrg.c.m();
                        if (((okt)b).c) {
                            ((okt)b).m();
                            ((okt)b).c = false;
                        }
                        ((lrg)((okt)b).b).a = lrh.b(3);
                        b = ((okt)b).h();
                    }
                    else if (n > 17L && n2 <= 17L) {
                        b = lrg.c.m();
                        if (((okt)b).c) {
                            ((okt)b).m();
                            ((okt)b).c = false;
                        }
                        ((lrg)((okt)b).b).a = lrh.b(3);
                        b = ((okt)b).h();
                    }
                    else {
                        final okt m = lrg.c.m();
                        if (m.c) {
                            m.m();
                            m.c = false;
                        }
                        ((lrg)m.b).a = lrh.b(4);
                        b = String.format("Client and host versions are incompatible. Client version: %s. Client min version: %s. Host version: %s. Host min version: %s", 17L, 4L, n, n2);
                        if (m.c) {
                            m.m();
                            m.c = false;
                        }
                        final lrg lrg = (lrg)m.b;
                        b.getClass();
                        lrg.b = (String)b;
                        b = m.h();
                    }
                    switch (((lrg)b).a) {
                        default: {
                            n3 = 0;
                            break;
                        }
                        case 2: {
                            break;
                        }
                        case 1: {
                            n3 = 3;
                            break;
                        }
                        case 0: {
                            n3 = 2;
                            break;
                        }
                    }
                    if (n3 != 0 && n3 == 3) {
                        continue;
                    }
                    throw new lqx(String.format("Host package %s is not compatible: %s", o, ((lrg)b).b));
                }
                b = lqv.b("com.google.android.libraries.lens.lenslite.engine.EngineApiLoaderImpl");
                try {
                    o = ((Class<Object>)b).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                    b = lqv.a();
                    if (lrh.d(lqv) >= ApiVersion.VERSION_6.getVersionCode()) {
                        final Bundle bundle = new Bundle();
                        bundle.putLong("shim_version_code", 17L);
                        bundle.putString("host_package_name", message);
                        bundle.putString("shim_package_name", this.b.getPackageName());
                        b = ((EngineApiLoader)o).getEngineApi(b, (Callable)new lrc(this, 1), bundle);
                    }
                    else {
                        b = ((EngineApiLoader)o).getEngineApi(b, (Callable)new lrc(this), 17L);
                    }
                    String.format("EngineApi loaded from %1$s@%2$s. Host api version: %3$s", message, this.b.getPackageManager().getPackageInfo(message, 0).versionName, ((DLEngineApi)b).getHostApiVersion());
                    return (DLEngineApi)b;
                }
                catch (final InstantiationException ex) {
                    throw new lqx("Cannot create new instance of com.google.android.libraries.lens.lenslite.engine.EngineApiLoaderImpl class from loadedClass!", (Throwable)message);
                }
                catch (final IllegalAccessException ex2) {
                    throw new lqx("Cannot create new instance of com.google.android.libraries.lens.lenslite.engine.EngineApiLoaderImpl class from loadedClass!", (Throwable)message);
                }
                catch (final InvocationTargetException ex3) {}
                catch (final NoSuchMethodException ex4) {}
                finally {
                    if (((Throwable)b).getMessage() != null) {
                        message = ((Throwable)b).getMessage();
                    }
                    else {
                        message = "Failed to load engine";
                    }
                    throw new lqx(message, (Throwable)b);
                }
                throw new lqx("Cannot get constructor for com.google.android.libraries.lens.lenslite.engine.EngineApiLoaderImpl class from loadedClass!", (Throwable)message);
            }
        }
        catch (final PackageManager$NameNotFoundException ex5) {
            throw new lqy(String.format("remote package %s not found", b), (Throwable)ex5);
        }
    }
}
