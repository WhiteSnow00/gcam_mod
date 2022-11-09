// 
// Decompiled by Procyon v0.6.0
// 

public final class lfi implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public lfi(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final lfo a() {
        final niz a = ((emd)this.a).a();
        final pii b = this.b;
        final pii c = this.c;
        lfo lfo;
        if (a.e(false)) {
            lfo = ((lfz)b).a();
        }
        else {
            lfo = ((lfs)c).a();
        }
        return lfo;
    }
}
