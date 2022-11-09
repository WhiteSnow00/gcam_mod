import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kku implements kkp
{
    private final kse a;
    
    public kku(final kse a) {
        this.a = a;
    }
    
    @Override
    public final void a(final krc krc) {
        if (!(krc instanceof kkt)) {
            krc.close();
            return;
        }
        final String c = ((kkt)krc).c();
        try {
            this.a.f(c);
            krc.close();
        }
        finally {
            this.a.g();
        }
    }
    
    @Override
    public final void b(final Iterable iterable) {
        try {
            this.a.f("Lifetime#close");
            final Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                this.a((krc)iterator.next());
            }
            this.a.g();
        }
        finally {
            this.a.g();
            while (true) {}
        }
    }
}
