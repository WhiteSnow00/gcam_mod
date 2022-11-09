// 
// Decompiled by Procyon v0.6.0
// 

enum kzy
{
    a("SESSION_BLACKLIST", 0, "Session blacklist"), 
    b("DEVICE_BLACKLIST", 1, "Device blacklist"), 
    c("API_BLACKLIST", 2, "Api blacklist"), 
    d("AAA_BLACKLIST", 3, "Please use 3A methods exposed via frameserver for this operation"), 
    e("UNSUPPORTED_KEY", 4, "Unsupported key");
    
    public final String f;
    
    private kzy(final String s, final int n, final String f) {
        this.f = f;
    }
}
