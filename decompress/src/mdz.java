// 
// Decompiled by Procyon v0.6.0
// 

public final class mdz
{
    public static final nsd a;
    private static final mdz c;
    private static volatile boolean d;
    private static volatile mdz e;
    public final mea b;
    
    static {
        a = nsd.g("com/google/android/libraries/performance/primes/Primes");
        final mdz e = c = new mdz(new mdy());
        mdz.d = true;
        mdz.e = e;
    }
    
    public mdz(final mea b) {
        this.b = b;
    }
    
    public static boolean a() {
        return mdz.e != mdz.c;
    }
    
    public static void b(final mdu mdu) {
        synchronized (mdz.class) {
            if (!a()) {
                if (!mrm.f()) {
                    a.l(mdz.a.c(), "Primes.initialize() should only be called from the main thread.", '\u0bfb');
                }
                mdz.e = mdu.a;
            }
        }
    }
}
