// 
// Decompiled by Procyon v0.6.0
// 

final class aki implements Runnable
{
    final /* synthetic */ oey a;
    final /* synthetic */ akl b;
    final /* synthetic */ aox c;
    
    public aki(final akl b, final oey a, final aox c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void run() {
        try {
            this.a.get();
            final aiy a = aiy.a();
            final int j = akl.j;
            String.format("Starting work for %s", this.b.c.b);
            a.d(new Throwable[0]);
            final akl b = this.b;
            b.e = b.d.b();
            this.c.g(this.b.e);
        }
        finally {
            final Throwable t;
            this.c.f(t);
        }
    }
}
