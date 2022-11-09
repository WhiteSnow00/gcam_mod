import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import java.util.Set;
import java.util.concurrent.Semaphore;

// 
// Decompiled by Procyon v0.6.0
// 

public final class joi extends adt
{
    private final Semaphore i;
    private final Set j;
    
    public joi(final Context context, final Set j) {
        super(context);
        this.i = new Semaphore(0);
        this.j = j;
    }
    
    @Override
    public final void h() {
        this.i.drainPermits();
        this.d();
    }
}
