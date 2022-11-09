// 
// Decompiled by Procyon v0.6.0
// 

public enum knd implements kng
{
    a("AMR_NB", 0, "audio/3gpp"), 
    b("AMR_WB", 1, "audio/amr-wb"), 
    c("AAC", 2, "audio/mp4a-latm"), 
    d("HE_AAC", 3, "audio/mp4a-latm"), 
    e("AAC_ELD", 4, "audio/mp4a-latm");
    
    public final String f;
    
    private knd(final String s, final int n, final String f) {
        this.f = f;
    }
    
    public static knd a(final int n) {
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder(41);
                sb.append("Unsupported audio codec type: ");
                sb.append(n);
                throw new IllegalArgumentException(sb.toString());
            }
            case 5: {
                return knd.e;
            }
            case 4: {
                return knd.d;
            }
            case 3: {
                return knd.c;
            }
            case 2: {
                return knd.b;
            }
            case 1: {
                return knd.a;
            }
        }
    }
    
    @Override
    public final String b() {
        return this.f;
    }
}
