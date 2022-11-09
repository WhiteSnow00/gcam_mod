import android.os.Handler;
import android.os.HandlerThread;

// 
// Decompiled by Procyon v0.6.0
// 

final class asa extends atd
{
    public static final aub a;
    private static final att h;
    public atm b;
    public asb c;
    public final art d;
    public final atv e;
    public final atx f;
    public att g;
    private final HandlerThread j;
    
    static {
        a = new aub("AndCamAgntImp");
        h = new arg();
    }
    
    public asa() {
        this.g = asa.h;
        final HandlerThread j = new HandlerThread("Camera Handler Thread");
        (this.j = j).start();
        final art d = new art(this, this, j.getLooper());
        this.d = d;
        this.g = new att(d);
        this.e = new atv();
        (this.f = new atx(d, j)).start();
    }
    
    @Override
    protected final Handler a() {
        return this.d;
    }
    
    @Override
    public final atn b() {
        return ari.c();
    }
    
    @Override
    public final att c() {
        return this.g;
    }
    
    @Override
    protected final atv d() {
        return this.e;
    }
    
    @Override
    public final atx e() {
        return this.f;
    }
    
    @Override
    public final void f(final att g) {
        this.g = g;
    }
}
