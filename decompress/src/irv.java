// 
// Decompiled by Procyon v0.6.0
// 

public enum irv
{
    a("MIC_BROKEN", 0, 2131952772), 
    b("AUDIO_MISSING_DURING_RECORDING", 1, 2131952774), 
    c("VIDEO_MISSING_DURING_RECORDING", 2, 2131952775), 
    d("SNAPSHOT_FAILURE", 3, 2131952771), 
    e("PARTIAL_VIDEO_MISSING_AFTER_RECORDING", 4, 2131952776), 
    f("NO_VIDEO_AFTER_RECORDING", 5, 2131952773), 
    g("CAPTURE_SESSION_ERROR", 6, 2131952778), 
    h("RECORDING_TOO_SHORT", 7, 2131952777);
    
    public final int i;
    
    private irv(final String s, final int n, final int i) {
        this.i = i;
    }
}
