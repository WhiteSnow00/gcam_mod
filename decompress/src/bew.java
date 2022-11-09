// 
// Decompiled by Procyon v0.6.0
// 

final class bew extends RuntimeException
{
    private static final long serialVersionUID = -2556382523004027815L;
    
    public bew() {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
