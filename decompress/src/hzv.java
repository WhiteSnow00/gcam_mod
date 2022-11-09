import j$.util.Map$_EL;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzv implements oun
{
    private final pii a;
    private final /* synthetic */ int b;
    
    public hzv(final pii a) {
        this.a = a;
    }
    
    public hzv(final pii a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final hzf a() {
        switch (this.b) {
            default: {
                final hzf i = hzt.i();
                pqf.k(i);
                final hzf hzf = (hzf)Map$_EL.getOrDefault(hzg.b, ((cxl)this.a.get()).a(cyk.h).c(), (Object)i);
                pqf.k(hzf);
                return hzf;
            }
            case 4: {
                final hzf g = hzt.g();
                pqf.k(g);
                final hzf hzf2 = (hzf)Map$_EL.getOrDefault(hzg.b, ((cxl)this.a.get()).a(cyk.g).c(), (Object)g);
                pqf.k(hzf2);
                return hzf2;
            }
            case 3: {
                final hzf e = hzt.e();
                pqf.k(e);
                final hzf hzf3 = (hzf)Map$_EL.getOrDefault(hzg.b, ((cxl)this.a.get()).a(cyk.e).c(), (Object)e);
                pqf.k(hzf3);
                return hzf3;
            }
            case 2: {
                final hzf a = hzt.a;
                pqf.k(a);
                final hzf hzf4 = (hzf)Map$_EL.getOrDefault(hzg.b, (Object)hzu.a((cxl)this.a.get()), (Object)a);
                pqf.k(hzf4);
                return hzf4;
            }
            case 1: {
                final hzf a2 = hzt.a();
                pqf.k(a2);
                final hzf hzf5 = (hzf)Map$_EL.getOrDefault(hzg.b, ((cxl)this.a.get()).a(cyk.b).c(), (Object)a2);
                pqf.k(hzf5);
                return hzf5;
            }
            case 0: {
                final hzf b = hzt.b();
                pqf.k(b);
                final hzf hzf6 = (hzf)Map$_EL.getOrDefault(hzg.b, ((cxl)this.a.get()).a(cyk.a).c(), (Object)b);
                pqf.k(hzf6);
                return hzf6;
            }
        }
    }
}
