import com.google.android.gms.common.api.Status;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jog implements jrf
{
    public final GoogleSignInAccount a;
    private final Status b;
    
    public jog(final GoogleSignInAccount a, final Status b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Status a() {
        return this.b;
    }
}
