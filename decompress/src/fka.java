// 
// Decompiled by Procyon v0.6.0
// 

final class fka implements fkk
{
    final /* synthetic */ fkb a;
    
    public fka(final fkb a) {
        this.a = a;
    }
    
    @Override
    public final void a(final fjy fjy) {
        synchronized (this.a) {
            final fkb a = this.a;
            a.d = true;
            a.e = niz.i(fjy);
            this.a.c();
        }
    }
    
    @Override
    public final void b(final long f, final fkp fkp) {
        synchronized (this.a) {
            final fkb a = this.a;
            a.b = true;
            a.c = niz.i(fkp);
            final fkb a2 = this.a;
            a2.f = f;
            a2.c();
        }
    }
}
