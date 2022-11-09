import java.util.HashMap;
import android.util.LruCache;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxg
{
    public static final nsd a;
    public final LruCache b;
    public final HashMap c;
    public final HashMap d;
    
    static {
        a = nsd.g("com/google/android/apps/camera/storage/module/StorageImpl");
    }
    
    public hxg() {
        this.b = new hxf();
        this.c = new HashMap();
        this.d = new HashMap();
    }
    
    public final niz a(final him him) {
        return niz.h(this.b.get((Object)him));
    }
}
