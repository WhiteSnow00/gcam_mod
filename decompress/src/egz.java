// 
// Decompiled by Procyon v0.6.0
// 

public final class egz
{
    private egz() {
    }
    
    public static Object a(final pii pii) {
        b();
        return pii.get();
    }
    
    public static void b() {
        synchronized (egz.class) {
            krk.a(egz.class);
        }
    }
    
    public static void c(final kjm kjm, final ewn ewn, final exn exn) {
        kjm.getClass();
        exn.getClass();
        if (kjm.c()) {
            ewn.g(exn);
            return;
        }
        kjm.execute(new exp(ewn, exn));
    }
    
    public static void d(final kjm kjm, final ewy ewy, final exn exn) {
        kjm.getClass();
        ewy.getClass();
        exn.getClass();
        if (kjm.c()) {
            ewy.c(exn);
            return;
        }
        kjm.execute(new exq(ewy, exn));
    }
    
    public static int e(final int n) {
        return n - 1;
    }
    
    public static int f(final int n) {
        return n - 1;
    }
}
