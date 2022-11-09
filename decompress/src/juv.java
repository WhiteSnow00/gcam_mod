import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class juv extends juw
{
    final /* synthetic */ Intent a;
    final /* synthetic */ jsx b;
    
    public juv(final Intent a, final jsx b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final Intent a = this.a;
        if (a != null) {
            this.b.startActivityForResult(a, 2);
        }
    }
}
