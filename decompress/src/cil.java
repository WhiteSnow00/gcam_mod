import j$.util.function.Consumer;
import j$.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cil implements krc
{
    public final kof a;
    public final List b;
    public final AtomicBoolean c;
    public final hje d;
    public final hip e;
    
    public cil(final kof a, final cgf cgf, final hje d) {
        final ArrayList b = new ArrayList();
        this.b = b;
        this.c = new AtomicBoolean(false);
        this.a = a;
        this.d = d;
        this.e = cgf.a.b();
        b.add(cgf);
    }
    
    @Override
    public final void close() {
        if (this.c.compareAndSet(false, true)) {
            this.a.close();
            Collection$_EL.stream((Collection)this.b).map((Function)cdd.e).forEach((Consumer)cbc.d);
        }
    }
}
