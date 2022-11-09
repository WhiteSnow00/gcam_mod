import android.app.Activity;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class juu extends juw
{
    final /* synthetic */ Intent a;
    final /* synthetic */ Activity b;
    final /* synthetic */ int c;
    
    public juu(final Intent a, final Activity b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        final Intent a = this.a;
        if (a != null) {
            this.b.startActivityForResult(a, this.c);
        }
    }
}
