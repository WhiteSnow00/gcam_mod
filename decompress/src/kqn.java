import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqn implements oun
{
    private final pii a;
    
    public kqn(final pii a) {
        this.a = a;
    }
    
    public final xq a() {
        final xl xl = (xl)this.a.get();
        xl.getClass();
        final xw a = xl.a;
        final Object f = ((ya)a).f;
        final Object o4;
        Label_0456: {
            if (f instanceof ouq) {
                synchronized (f) {
                    if (((ya)a).f instanceof ouq) {
                        final Object c = ((ya)a).c;
                        final Object o;
                        Label_0199: {
                            if (c instanceof ouq) {
                                synchronized (c) {
                                    if (((ya)a).c instanceof ouq) {
                                        pii b;
                                        if ((b = ((ya)a).b) == null) {
                                            b = new xz((ya)a);
                                            ((ya)a).b = b;
                                        }
                                        final xu c2 = new xu(b, ((ya)a).b());
                                        oum.c(((ya)a).c, c2);
                                        ((ya)a).c = c2;
                                    }
                                    break Label_0199;
                                }
                            }
                            o = c;
                        }
                        final xu xu = (xu)o;
                        final Object e = ((ya)a).e;
                        final Object o3;
                        Label_0409: {
                            if (e instanceof ouq) {
                                synchronized (e) {
                                    if (((ya)a).e instanceof ouq) {
                                        final Context a2 = ((ya)a).a();
                                        final yj b2 = ((ya)a).b();
                                        final Object d = ((ya)a).d;
                                        final Object o2;
                                        Label_0357: {
                                            if (d instanceof ouq) {
                                                synchronized (d) {
                                                    if (((ya)a).d instanceof ouq) {
                                                        final yh d2 = new yh(((ya)a).a());
                                                        oum.c(((ya)a).d, d2);
                                                        ((ya)a).d = d2;
                                                    }
                                                    break Label_0357;
                                                }
                                            }
                                            o2 = d;
                                        }
                                        final xv e2 = new xv(a2, b2, (yh)o2);
                                        oum.c(((ya)a).e, e2);
                                        ((ya)a).e = e2;
                                    }
                                    break Label_0409;
                                }
                            }
                            o3 = e;
                        }
                        final xq f2 = new xq(xu, (xv)o3);
                        oum.c(((ya)a).f, f2);
                        ((ya)a).f = f2;
                    }
                    break Label_0456;
                }
            }
            o4 = f;
        }
        final xq xq = (xq)o4;
        pqf.k(xq);
        return xq;
    }
}
