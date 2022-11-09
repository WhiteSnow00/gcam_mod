// 
// Decompiled by Procyon v0.6.0
// 

public final class oss
{
    private static volatile boolean a;
    
    static {
        oss.a = false;
    }
    
    public static void a() {
        try {
            System.loadLibrary("gvr");
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {}
    }
}
