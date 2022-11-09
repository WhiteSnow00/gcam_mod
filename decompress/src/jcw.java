// 
// Decompiled by Procyon v0.6.0
// 

public final class jcw
{
    public final niz a;
    public final niz b;
    
    private jcw(final niz a, final niz b) {
        this.a = a;
        this.b = b;
    }
    
    public static jcw a(final Object o) {
        return new jcw(niz.i(o), nii.a);
    }
    
    public static jcw b(final Object o) {
        return new jcw(nii.a, niz.i(o));
    }
}
