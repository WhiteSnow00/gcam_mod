import android.util.LogPrinter;
import android.net.Uri$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlp
{
    static {
        final Uri$Builder uri$Builder = new Uri$Builder();
        uri$Builder.scheme("uri");
        uri$Builder.authority("local");
        uri$Builder.build();
    }
    
    public jlp() {
        new LogPrinter(4, "GA/LogCatTransport");
    }
}
