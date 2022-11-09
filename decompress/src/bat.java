import android.content.res.AssetManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bat implements bbx, bas
{
    private final AssetManager a;
    private final /* synthetic */ int b;
    
    public bat(final AssetManager a) {
        this.a = a;
    }
    
    public bat(final AssetManager a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final awp a(final AssetManager assetManager, final String s) {
        switch (this.b) {
            default: {
                return new aww(assetManager, s);
            }
            case 0: {
                return new axe(assetManager, s);
            }
        }
    }
    
    @Override
    public final bbw b(final bcf bcf) {
        switch (this.b) {
            default: {
                return new bau(this.a, this);
            }
            case 0: {
                return new bau(this.a, this);
            }
        }
    }
}
