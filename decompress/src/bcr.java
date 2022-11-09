import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcr implements bbx
{
    private final Context a;
    private final /* synthetic */ int b;
    
    public bcr(final Context a) {
        this.a = a;
    }
    
    public bcr(final Context a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final bbw b(final bcf bcf) {
        switch (this.b) {
            default: {
                return new bcs(this.a, 2, null);
            }
            case 1: {
                return new bcs(this.a, 1);
            }
            case 0: {
                return new bcs(this.a);
            }
        }
    }
}
