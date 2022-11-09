import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hhb implements hhz
{
    public final Set a;
    public final Map b;
    
    public hhb() {
        this.a = new HashSet();
        this.b = new HashMap();
    }
    
    @Override
    public final void j(final him him, final Bitmap bitmap, final int n) {
        this.a.remove(him);
    }
    
    @Override
    public final void k(final him him) {
        this.a.remove(him);
    }
    
    @Override
    public final void o(final him him, final hih hih, final hip hip) {
        this.a.add(him);
        this.b.put(him, hih);
    }
    
    @Override
    public final void p(final him him) {
        this.a.remove(him);
    }
}
