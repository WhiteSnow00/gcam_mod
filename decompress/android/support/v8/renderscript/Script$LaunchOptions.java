// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public final class Script$LaunchOptions
{
    private int strategy;
    private int xend;
    private int xstart;
    private int yend;
    private int ystart;
    private int zend;
    private int zstart;
    
    public Script$LaunchOptions() {
        this.xstart = 0;
        this.ystart = 0;
        this.xend = 0;
        this.yend = 0;
        this.zstart = 0;
        this.zend = 0;
    }
    
    public int getXEnd() {
        return this.xend;
    }
    
    public int getXStart() {
        return this.xstart;
    }
    
    public int getYEnd() {
        return this.yend;
    }
    
    public int getYStart() {
        return this.ystart;
    }
    
    public int getZEnd() {
        return this.zend;
    }
    
    public int getZStart() {
        return this.zstart;
    }
    
    public Script$LaunchOptions setX(final int xstart, final int xend) {
        if (xstart >= 0 && xend > xstart) {
            this.xstart = xstart;
            this.xend = xend;
            return this;
        }
        throw new RSIllegalArgumentException("Invalid dimensions");
    }
    
    public Script$LaunchOptions setY(final int ystart, final int yend) {
        if (ystart >= 0 && yend > ystart) {
            this.ystart = ystart;
            this.yend = yend;
            return this;
        }
        throw new RSIllegalArgumentException("Invalid dimensions");
    }
    
    public Script$LaunchOptions setZ(final int zstart, final int zend) {
        if (zstart >= 0 && zend > zstart) {
            this.zstart = zstart;
            this.zend = zend;
            return this;
        }
        throw new RSIllegalArgumentException("Invalid dimensions");
    }
}
