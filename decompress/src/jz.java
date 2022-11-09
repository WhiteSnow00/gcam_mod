import android.content.Context;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jz extends ArrayAdapter
{
    public jz(final Context context, final int n) {
        super(context, n, 16908308, (Object[])null);
    }
    
    public final long getItemId(final int n) {
        return n;
    }
    
    public final boolean hasStableIds() {
        return true;
    }
}
