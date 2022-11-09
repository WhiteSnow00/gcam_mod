// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public enum Element$DataKind
{
    PIXEL_A("PIXEL_A", 2, 8), 
    PIXEL_DEPTH("PIXEL_DEPTH", 6, 12), 
    PIXEL_L("PIXEL_L", 1, 7), 
    PIXEL_LA("PIXEL_LA", 3, 9), 
    PIXEL_RGB("PIXEL_RGB", 4, 10), 
    PIXEL_RGBA("PIXEL_RGBA", 5, 11), 
    PIXEL_YUV("PIXEL_YUV", 7, 13), 
    USER("USER", 0, 0);
    
    int mID;
    
    private Element$DataKind(final String s, final int n, final int mid) {
        this.mID = mid;
    }
}
