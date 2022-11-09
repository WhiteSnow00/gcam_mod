// 
// Decompiled by Procyon v0.6.0
// 

public final class llo implements llz
{
    public final kse a;
    public final krr b;
    private final lou c;
    
    public llo(final lou c, final kse a, final krr krr, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = krr.a("MediaFS-P");
    }
    
    @Override
    public final llw a(final lmf lmf, final llu llu) {
        return new lmh(this.c, lmk.l(lmf, llu, this.b), this.b, null, null);
    }
    
    @Override
    public final lly b(final llu llu) {
        return new lln(this, llu);
    }
}
