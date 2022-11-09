import android.graphics.drawable.Drawable;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

// 
// Decompiled by Procyon v0.6.0
// 

final class hqn extends ResolveInfo
{
    final /* synthetic */ hqo a;
    final /* synthetic */ int b;
    
    public hqn(final hqo a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final Drawable loadIcon(final PackageManager packageManager) {
        final hqo a = this.a;
        final int b = this.b;
        final bqt a2 = bqt.a;
        final hio a3 = hio.a;
        Drawable drawable = null;
        switch (b - 1) {
            default: {
                drawable = a.b.getDrawable(2131231626);
                drawable.getClass();
                break;
            }
            case 1: {
                drawable = a.b.getDrawable(2131231624);
                drawable.getClass();
                break;
            }
        }
        return drawable;
    }
    
    public final CharSequence loadLabel(final PackageManager packageManager) {
        if (this.b == 2) {
            return this.a.b.getString(2131952151);
        }
        return this.a.b.getString(2131952153);
    }
}
