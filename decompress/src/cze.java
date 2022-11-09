import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.ContentProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cze
{
    public final ContentProvider a;
    public final ProviderInfo b;
    public final Context c;
    
    public cze(final ContentProvider a, final ProviderInfo b) {
        this.a = a;
        this.b = b;
        final Context context = a.getContext();
        context.getClass();
        this.c = context;
    }
}
