import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abn implements Interpolator
{
    private final /* synthetic */ int a;
    
    public abn() {
    }
    
    public abn(final int a) {
        this.a = a;
    }
    
    public final float getInterpolation(float n) {
        switch (this.a) {
            default: {
                return Math.abs(n - 1.0f);
            }
            case 0:
            case 1:
            case 2: {
                --n;
                return n * n * n * n * n + 1.0f;
            }
        }
    }
}
