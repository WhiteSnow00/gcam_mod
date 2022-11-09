// 
// Decompiled by Procyon v0.6.0
// 

public enum kov
{
    a("VIDEO_BUFFER_DELAY", 0, true), 
    b("AUDIO_BUFFER_DELAY", 1, false), 
    c("VIDEO_TRACK_FAIL_TO_START", 2, true), 
    d("AUDIO_TRACK_FAIL_TO_START", 3, false), 
    e("AUDIO_RECORD_ERROR", 4, false), 
    f("MUXER_STOP_ERROR", 5, true), 
    g("MEDIA_CODEC_ERROR_AUDIO", 6, true), 
    h("MEDIA_CODEC_ERROR_VIDEO", 7, true), 
    i("FILE_LOST", 8, false), 
    j("OTHER", 9, true);
    
    public final boolean k;
    
    private kov(final String s, final int n, final boolean k) {
        this.k = k;
    }
}
