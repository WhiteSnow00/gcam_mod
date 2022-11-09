import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbn extends psn
{
    public final oxc a;
    public oxd b;
    
    public nbn(final org org) {
        final pdf pdf = new pdf(new pde(new AtomicReference()), oxc.a(new nbm(this, org)));
        pip.n();
        final pdi pdi = new pdi(pdf.a);
        pip.n();
        final pdl a = new pdl(pdi);
        pip.k();
        this.a = a;
    }
    
    public final void a(final org org, final ori ori) {
        final orh a = ori.a;
        final nta nta = (nta)nbq.a.c();
        String name;
        if (a != null) {
            name = a.name();
        }
        else {
            name = null;
        }
        nta.y("%s error from %s: %s", name, org.c(), ori.getMessage());
        final oxd b = this.b;
        if (b != null) {
            int n = 26;
            if (a == null) {
                n = 28;
            }
            else {
                switch (a.ordinal()) {
                    default: {
                        throw new pil();
                    }
                    case 0:
                    case 4: {
                        break;
                    }
                    case 5: {
                        n = 30;
                        break;
                    }
                    case 3: {
                        n = 27;
                        break;
                    }
                    case 2: {
                        n = 29;
                        break;
                    }
                    case 1: {
                        n = 25;
                        break;
                    }
                }
            }
            b.c(new nbt(n, ori));
        }
        final oxd b2 = this.b;
        if (b2 != null) {
            b2.a();
        }
    }
    
    @Override
    public final void b(final org org) {
        final oxd b = this.b;
        if (b != null) {
            b.c(new nbv(org.a()));
        }
    }
}
