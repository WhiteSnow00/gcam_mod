// 
// Decompiled by Procyon v0.6.0
// 

public final class pju extends pjy
{
    final /* synthetic */ plc a;
    final /* synthetic */ Object b;
    private int d;
    
    public pju(final pjl pjl, final pjq pjq, final plc a, final Object b) {
        this.a = a;
        this.b = b;
        super(pjl, pjq);
    }
    
    @Override
    protected final Object b(Object a) {
        switch (this.d) {
            default: {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            case 1: {
                this.d = 2;
                pip.b(a);
                break;
            }
            case 0: {
                this.d = 1;
                pip.b(a);
                final plc a2 = this.a;
                plv.a(a2);
                a = a2.a(this.b, this);
                break;
            }
        }
        return a;
    }
}
