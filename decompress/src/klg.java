import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class klg implements kri
{
    final /* synthetic */ klh a;
    private final int b;
    
    public klg(final klh a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void aR(final Object o) {
        this.a.a.set(this.b, o);
        final klh a = this.a;
        Label_0069: {
            if (!a.b) {
                final Iterator iterator = a.a.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next() == null) {
                        break Label_0069;
                    }
                }
                this.a.b = true;
            }
        }
        final klh a2 = this.a;
        if (a2.b) {
            this.a.d.execute(new klf(this, nns.j(a2.a)));
        }
    }
}
