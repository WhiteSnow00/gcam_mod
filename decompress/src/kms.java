// 
// Decompiled by Procyon v0.6.0
// 

public enum kms
{
    a("AAC", 0, "audio/mp4a-latm"), 
    b("AMR_NB", 1, "audio/amr-wb"), 
    c("AMR_WB", 2, "audio/3gpp"), 
    d("VORBIS", 3, "audio/vorbis");
    
    public final String e;
    
    private kms(final String s, final int n, final String e) {
        this.e = e;
    }
    
    @Override
    public final String toString() {
        return this.e;
    }
}
