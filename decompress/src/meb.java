import java.util.Iterator;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class meb implements mea
{
    private static final nsd a;
    private final mem b;
    private final pii c;
    private final pii d;
    private final pii e;
    
    static {
        a = nsd.g("com/google/android/libraries/performance/primes/PrimesApiImpl");
    }
    
    public meb(final mem b, final pii c, final pii d, final pii e, final niz niz, final mdp mdp) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        if (!mrm.f() && !mdp.a()) {
            final String a = mdp.a;
            final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 150);
            sb.append("Primes init triggered from background in package: ");
            sb.append(a);
            sb.append(". If this is an existing error, please file a bug on the Primes team to whitelist your package name.");
            throw new IllegalStateException(sb.toString());
        }
        if (!(boolean)niz.e(Boolean.FALSE)) {
            try {
                final WeakHashMap a2 = nhz.a;
                final Iterator iterator = ((ous)c).a().iterator();
                while (iterator.hasNext()) {
                    ((mgx)iterator.next()).k();
                }
            }
            catch (final RuntimeException ex) {
                a.m(meb.a.c(), "Primes failed to initialize", '\u0c00', ex);
                this.b.a();
            }
        }
    }
    
    @Override
    public final void a() {
        ((mhn)this.d.get()).d();
    }
    
    @Override
    public final void b() {
        ((mjj)this.e.get()).a();
    }
}
