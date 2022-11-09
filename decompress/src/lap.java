import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lap implements kri
{
    public final oey a;
    private final Set b;
    
    public lap(final noi b) {
        final ArrayList list = new ArrayList();
        this.b = b;
        final nrv bn = b.bN();
        while (bn.hasNext()) {
            list.add(((lao)bn.next()).a);
        }
        this.a = odg.i(ofi.j(list), emt.e, odx.a);
    }
}
