// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public enum Allocation$MipmapControl
{
    MIPMAP_FULL("MIPMAP_FULL", 1, 1), 
    MIPMAP_NONE("MIPMAP_NONE", 0, 0), 
    MIPMAP_ON_SYNC_TO_TEXTURE("MIPMAP_ON_SYNC_TO_TEXTURE", 2, 2);
    
    int mID;
    
    private Allocation$MipmapControl(final String s, final int n, final int mid) {
        this.mID = mid;
    }
}
