import android.content.pm.PackageManager$NameNotFoundException;
import java.util.HashMap;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import com.google.android.libraries.lens.lenslite.api.LoggingListener;
import com.google.android.libraries.lens.lenslite.api.ImageProxy$Plane;
import com.google.android.libraries.lens.lenslite.api.ImageProxy;
import com.google.android.libraries.lens.lenslite.api.ModelInfoListener;
import com.google.android.libraries.lens.lenslite.api.ModelInfo;
import com.google.android.libraries.lens.lenslite.api.DownloadEvent;
import com.google.android.libraries.lens.lenslite.api.DownloadListener;
import com.google.android.libraries.lens.lenslite.api.DownloadParam;
import com.google.android.libraries.lens.lenslite.dynamicloading.ClientContextProvider;
import com.google.android.libraries.lens.lenslite.api.LogPolicyType;
import com.google.android.libraries.lens.lenslite.api.KeyguardDismisser;
import com.google.android.libraries.lens.lenslite.api.LinkHighResBitmapRequester$LinkHighResBitmapCallback;
import com.google.android.libraries.lens.lenslite.api.LinkHighResBitmapRequester;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult$BitmapProvider;
import com.google.android.libraries.lens.lenslite.dynamicloading.DLLinkResultListener;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;
import com.google.android.libraries.lens.lenslite.api.LinkEventListener;
import com.google.android.libraries.lens.smartsapi.SmartsResult$SmartsEngineType;
import com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi;
import com.google.android.libraries.lens.lenslite.dynamicloading.EngineApiLoader;
import android.content.Context;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqv
{
    public static final Set a;
    public static final Object b;
    public static final Map c;
    public final Context d;
    public final Set e;
    public final String f;
    public Context g;
    
    static {
        a = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(EngineApiLoader.class.getName(), DLEngineApi.class.getName(), SmartsResult$SmartsEngineType.class.getName(), LinkEventListener.class.getName(), LinkChipResult.class.getName(), DLLinkResultListener.class.getName(), LinkChipResult$BitmapProvider.class.getName(), LinkHighResBitmapRequester.class.getName(), LinkHighResBitmapRequester$LinkHighResBitmapCallback.class.getName(), KeyguardDismisser.class.getName(), LogPolicyType.class.getName(), ClientContextProvider.class.getName(), DownloadParam.class.getName(), DownloadListener.class.getName(), DownloadEvent.class.getName(), ModelInfo.class.getName(), ModelInfoListener.class.getName(), ImageProxy.class.getName(), ImageProxy$Plane.class.getName(), LoggingListener.class.getName())));
        b = new Object();
        c = new HashMap();
    }
    
    public lqv(final Context d, final Set e, final String f) {
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static String c(final Context context, final String s) {
        try {
            final long lastUpdateTime = context.getPackageManager().getPackageInfo(s, 0).lastUpdateTime;
            final StringBuilder sb = new StringBuilder(s.length() + 21);
            sb.append(s);
            sb.append(".");
            sb.append(lastUpdateTime);
            return sb.toString();
        }
        catch (final PackageManager$NameNotFoundException ex) {
            throw new lqy(String.format("Remote package %s can't be found", s), (Throwable)ex);
        }
    }
    
    public final Context a() {
        final Context g = this.g;
        g.getClass();
        return g;
    }
    
    public final Class b(final String s) {
        try {
            return Class.forName(s, true, lqv.c.get(c(this.a(), this.f)));
        }
        catch (final ClassNotFoundException ex) {
            throw new lqx(String.format("%s class is not found", s), ex);
        }
    }
}
