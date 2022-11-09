import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mdg
{
    private final Iterable a;
    
    public mdg(final Iterable a) {
        this.a = a;
    }
    
    public final lwk a() {
        final ArrayList list = new ArrayList();
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            list.add(((luy)iterator.next()).a());
        }
        return lwk.i(lwt.c(list).a(odx.a, lwt.m()));
    }
}
