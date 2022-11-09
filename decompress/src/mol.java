// 
// Decompiled by Procyon v0.6.0
// 

public final class mol extends oky implements omk
{
    public static final mol e;
    private static volatile omp f;
    public int a;
    public int b;
    public Object c;
    public String d;
    
    static {
        oky.G(mol.class, e = new mol());
    }
    
    private mol() {
        this.b = 0;
        this.d = "";
    }
    
    @Override
    protected final Object a(final int n, Object o) {
        switch (n - 1) {
            default: {
                return null;
            }
            case 6: {
                final omp f;
                if ((f = mol.f) == null) {
                    synchronized (mol.class) {
                        if (mol.f == null) {
                            o = (mol.f = new oku(mol.e));
                        }
                    }
                }
                return f;
            }
            case 5: {
                return mol.e;
            }
            case 4: {
                return new okt(mol.e);
            }
            case 3: {
                return new mol();
            }
            case 2: {
                return oky.F(mol.e, "\u0001\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001\u1038\u0000\u0002\u103a\u0000\u0003\u1033\u0000\u0004\u103b\u0000\u0005\u103d\u0000\n\u1008\u0000", new Object[] { "c", "b", "a", "d" });
            }
            case 0: {
                return 1;
            }
        }
    }
}
