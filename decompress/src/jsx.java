import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public interface jsx
{
    Activity a();
    
    void b(final LifecycleCallback p0);
    
    LifecycleCallback c(final Class p0);
    
    void startActivityForResult(final Intent p0, final int p1);
}
