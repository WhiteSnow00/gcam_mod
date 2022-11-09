import java.util.concurrent.Executor;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzq
{
    private static final nns f;
    public final jzs a;
    public final lmy b;
    public final Random c;
    public final ExecutorService d;
    
    static {
        f = nns.m("CREATE TABLE collections(id INTEGER PRIMARY KEY, collection_name STRING NOT NULL,time INTEGER NOT NULL,selection_key INTEGER NOT NULL,value BLOB NOT NULL)");
    }
    
    public jzq(final Context context, final lmy b, final Random c, final ExecutorService d) {
        this.a = new jzs(context, jzq.f);
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final oey a(final nir nir) {
        return ofi.r(new jzn(this, nir), this.d);
    }
}
