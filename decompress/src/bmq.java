import android.content.Intent;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmq
{
    public final Activity a;
    
    public bmq(final Activity a) {
        this.a = a;
    }
    
    public final Intent a() {
        return this.a.getIntent();
    }
    
    public final void b(final Intent intent) {
        this.a.startActivity(intent);
    }
    
    public final void c(final Intent intent, final int n, final int n2) {
        this.a.startActivityForResult(intent, 0);
        this.a.overridePendingTransition(n, n2);
    }
}
