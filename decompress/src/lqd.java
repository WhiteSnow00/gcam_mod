import com.google.android.libraries.lens.lenslite.dynamicloading.ApiVersion;
import android.content.Context;
import com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqd
{
    public final DLEngineApi a;
    public final Context b;
    public final String c;
    
    public lqd(final DLEngineApi a, final Context b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final long a() {
        try {
            return this.a.getHostApiVersion();
        }
        finally {
            return ApiVersion.ORIGINAL.getVersionCode();
        }
    }
}
