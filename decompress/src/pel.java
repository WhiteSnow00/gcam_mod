// 
// Decompiled by Procyon v0.6.0
// 

public final class pel extends oxk
{
    final ax a;
    
    public pel(final ax a) {
        this.a = a;
    }
    
    @Override
    protected final void n(oxl oxl) {
        final pek pek = new pek(oxl);
        oxl.bV(pek);
        try {
            final ax a = this.a;
            try {
                final Object call = a.a.call();
                if (pek.get() == oyj.a) {
                    return;
                }
                oxl = (oxl)pek.getAndSet(oyj.a);
                if (oxl == oyj.a) {
                    return;
                }
                Label_0094: {
                    if (call != null) {
                        break Label_0094;
                    }
                    try {
                        pek.a.b(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        if (oxl != null) {
                            ((oxp)oxl).bX();
                            return;
                        }
                        return;
                        pek.a.d(call);
                    }
                    finally {
                        if (oxl != null) {
                            ((oxp)oxl).bX();
                        }
                    }
                }
            }
            catch (final ag ag) {
                pek.b(ag);
            }
        }
        finally {
            final Throwable t;
            psn.e(t);
            if (!pek.b(t)) {
                pip.g(t);
            }
        }
    }
}
