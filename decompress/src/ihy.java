import java.io.IOException;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihy implements Runnable
{
    final /* synthetic */ Context a;
    final /* synthetic */ ofn b;
    
    public ihy(final Context a, final ofn b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        try {
            this.b.o(avg.g(new File(this.a.getCacheDir(), "indicatorDiskCache"), 5000000L));
        }
        catch (final IOException ex) {
            this.b.a(ex);
        }
    }
}
