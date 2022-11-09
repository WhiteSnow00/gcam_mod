// 
// Decompiled by Procyon v0.6.0
// 

public final class aud
{
    private static final aub a;
    
    static {
        a = new aub("SysProps");
    }
    
    public static String a() {
        try {
            return (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "camera2.portability.force_api", "0");
        }
        catch (final Exception ex) {
            auc.b(aud.a, "Exception while getting system property: ", ex);
            return "0";
        }
    }
}
