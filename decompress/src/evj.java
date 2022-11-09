import android.graphics.Bitmap;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class evj
{
    final /* synthetic */ LinkChipResult a;
    final /* synthetic */ niz b;
    final /* synthetic */ lqo c;
    final /* synthetic */ evk d;
    
    public evj(final evk d, final LinkChipResult a, final niz b, final lqo c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final Bitmap bitmap) {
        if (bitmap != null) {
            this.d.A.b(new evi(this, bitmap, this.a, this.b, this.c));
        }
    }
}
