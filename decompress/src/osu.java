// 
// Decompiled by Procyon v0.6.0
// 

public enum osu
{
    a("GVR_BETA_FEATURE_DAYDREAM_6DOF_CONTROLLER", 0, 1000, "com.google.vr.beta.daydream_6dof_controller"), 
    b("GVR_BETA_FEATURE_SEE_THROUGH", 1, 1001, "com.google.vr.beta.cameraSeeThrough");
    
    public final int c;
    public final String d;
    
    private osu(final String s, final int n, final int c, final String d) {
        this.c = c;
        this.d = d;
    }
    
    public static osu[] a(final int[] array) {
        if (array == null) {
            return new osu[0];
        }
        final int length = array.length;
        final osu[] array2 = new osu[length];
        int i = 0;
    Label_0019:
        while (i < length) {
            final int n = array[i];
            while (true) {
                for (final osu osu : values()) {
                    if (osu.c == n) {
                        array2[i] = osu;
                        ++i;
                        continue Label_0019;
                    }
                }
                osu osu = null;
                continue;
            }
        }
        return array2;
    }
}
