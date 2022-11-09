import android.os.Bundle;
import android.content.ContentValues;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hic implements oen
{
    final /* synthetic */ krd a;
    final /* synthetic */ hie b;
    
    public hic(final hie b, final krd a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        final hie b = this.b;
        final krr g = b.g;
        final String value = String.valueOf(b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 27);
        sb.append("Failed to set progress for ");
        sb.append(value);
        g.h(sb.toString());
    }
}
