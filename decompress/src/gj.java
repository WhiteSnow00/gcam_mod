import java.util.Iterator;
import android.content.Context;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gj implements Iterable
{
    public final ArrayList a;
    public final Context b;
    
    public gj(final Context b) {
        this.a = new ArrayList();
        this.b = b;
    }
    
    @Deprecated
    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
