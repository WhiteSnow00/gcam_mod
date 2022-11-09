import com.google.android.gms.common.api.Scope;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdd
{
    public static final lio a;
    static final lio b;
    
    static {
        final lio lio = a = new kda();
        final lio lio2 = b = new kdb();
        new Scope("profile");
        new Scope("email");
        new jqp("SignIn.API", lio, null, null);
        new jqp("SignIn.INTERNAL_API", lio2, null, null);
    }
}
