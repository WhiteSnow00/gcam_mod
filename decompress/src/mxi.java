import android.database.Cursor;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class mxi implements Callable
{
    final /* synthetic */ at a;
    final /* synthetic */ mxj b;
    
    public mxi(final mxj b, final at a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    protected final void finalize() {
        this.a.j();
    }
}
