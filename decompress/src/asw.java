// 
// Decompiled by Procyon v0.6.0
// 

public final class asw implements Runnable
{
    final /* synthetic */ atc a;
    final /* synthetic */ asx b;
    private final /* synthetic */ int c;
    
    public asw(final asx b, final atc a) {
        this.b = b;
        this.a = a;
    }
    
    public asw(final asx b, final atc a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.c) {
            default: {
                this.b.c().obtainMessage(101, (Object)null).sendToTarget();
                this.b.c().post(this.a.a);
                return;
            }
            case 0: {
                this.b.c().obtainMessage(103, (Object)this.a).sendToTarget();
            }
        }
    }
}
