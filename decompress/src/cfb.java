import android.media.CamcorderProfile;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfb
{
    public final kna a;
    public final Map b;
    public final lfw c;
    
    public cfb(final kna a, final lfw c) {
        this.b = new HashMap();
        this.a = a;
        this.c = c;
    }
    
    public final List a(final lfj lfj, final kmt kmt) {
        final LinkedList list = new LinkedList();
        for (final knl knl : knl.values()) {
            final kmv j = knl.j;
            if (CamcorderProfile.hasProfile(Integer.parseInt(lfj.a), knl.i) && this.a.d(krf.i(lfj, knl), kmt, j)) {
                list.addFirst(j);
            }
        }
        return list;
    }
}
