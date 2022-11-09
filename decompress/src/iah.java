// 
// Decompiled by Procyon v0.6.0
// 

enum iah
{
    a("STATE_UNINITIALIZED", 0, 0), 
    b("STATE_PREPARING_ON_START", 1, 1), 
    c("STATE_PREPARING_ON_RESUME", 2, 17), 
    d("STATE_PREPARING_ON_PREVIEW_STARTED", 3, 257), 
    e("STATE_IDLE", 4, 273), 
    f("STATE_PRE_RECORDING", 5, 4096), 
    g("STATE_RECORDING_PAUSE", 6, 65536), 
    h("STATE_RECORDING", 7, 1048576), 
    i("STATE_PROCESSING", 8, 16777216), 
    j("STATE_RECORDING_ERROR", 9, 268435456);
    
    public final int k;
    
    private iah(final String s, final int n, final int k) {
        this.k = k;
    }
    
    static boolean a(final iah iah) {
        return iah.equals(iah.g) || iah.equals(iah.h) || iah.equals(iah.j);
    }
}
