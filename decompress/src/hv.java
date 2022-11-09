import android.os.Bundle;
import android.net.Uri;
import android.content.ClipData;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hv
{
    final ClipData a;
    final int b;
    public int c;
    public Uri d;
    public Bundle e;
    
    public hv(final ClipData a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final hw a() {
        return new hw(this);
    }
}
