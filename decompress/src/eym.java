// 
// Decompiled by Procyon v0.6.0
// 

public final class eym
{
    public static int a;
    
    static {
        eym.a = 0;
    }
    
    public static void a(final cxl cxl) {
        synchronized (eym.class) {
            njo.i((eym.a = (int)cxl.a(cxr.j).c()) >= 0, "Key %s must be set to a value >=0", cxr.j);
        }
    }
}
