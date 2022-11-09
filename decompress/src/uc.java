// 
// Decompiled by Procyon v0.6.0
// 

public final class uc
{
    static final hp a;
    public int b;
    public rz c;
    public rz d;
    
    static {
        a = new hq(20);
    }
    
    private uc() {
    }
    
    public static uc a() {
        uc uc;
        if ((uc = (uc)uc.a.a()) == null) {
            uc = new uc();
        }
        return uc;
    }
    
    public static void b() {
        while (uc.a.a() != null) {}
    }
    
    public static void c(final uc uc) {
        uc.b = 0;
        uc.c = null;
        uc.d = null;
        uc.a.b(uc);
    }
}
