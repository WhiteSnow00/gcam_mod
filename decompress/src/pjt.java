// 
// Decompiled by Procyon v0.6.0
// 

public final class pjt extends pkd
{
    final /* synthetic */ plc a;
    final /* synthetic */ Object b;
    private int c;
    
    public pjt(final pjl pjl, final plc a, final Object b) {
        this.a = a;
        this.b = b;
        super(pjl);
    }
    
    @Override
    protected final Object b(Object a) {
        switch (this.c) {
            default: {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            case 1: {
                this.c = 2;
                pip.b(a);
                break;
            }
            case 0: {
                this.c = 1;
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
