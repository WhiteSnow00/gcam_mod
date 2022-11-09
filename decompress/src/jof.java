import java.util.Arrays;
import java.util.ArrayList;
import com.google.android.gms.common.api.Scope;
import java.util.List;
import java.util.Collection;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import android.accounts.Account;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jof
{
    public Set a;
    public String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private String f;
    private Account g;
    private String h;
    private Map i;
    
    public jof() {
        this.a = new HashSet();
        this.i = new HashMap();
    }
    
    public jof(final GoogleSignInOptions googleSignInOptions) {
        this.a = new HashSet();
        this.i = new HashMap();
        jvu.a(googleSignInOptions);
        final Scope a = GoogleSignInOptions.a;
        this.a = new HashSet(googleSignInOptions.i);
        this.c = googleSignInOptions.l;
        this.d = googleSignInOptions.m;
        this.e = googleSignInOptions.k;
        this.f = googleSignInOptions.n;
        this.g = googleSignInOptions.j;
        this.h = googleSignInOptions.o;
        this.i = GoogleSignInOptions.c(googleSignInOptions.p);
        this.b = googleSignInOptions.q;
    }
    
    public final GoogleSignInOptions a() {
        if (this.a.contains(GoogleSignInOptions.e) && this.a.contains(GoogleSignInOptions.d)) {
            this.a.remove(GoogleSignInOptions.d);
        }
        if (this.e && (this.g == null || !this.a.isEmpty())) {
            this.b();
        }
        return new GoogleSignInOptions(3, new ArrayList(this.a), this.g, this.e, this.c, this.d, this.f, this.h, this.i, this.b);
    }
    
    public final void b() {
        this.a.add(GoogleSignInOptions.c);
    }
    
    public final void c(final Scope scope, final Scope... array) {
        this.a.add(scope);
        this.a.addAll(Arrays.asList(array));
    }
}
