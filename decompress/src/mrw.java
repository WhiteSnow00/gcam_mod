import java.util.regex.Pattern;
import java.util.List;
import android.net.Uri$Builder;
import android.net.Uri;
import android.content.Context;
import android.accounts.Account;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrw
{
    public String a;
    private final String b;
    private String c;
    private final Account d;
    private String e;
    private final nnn f;
    
    public mrw(final Context context) {
        this.a = "files";
        this.c = "common";
        this.d = mrx.b;
        this.e = "";
        this.f = nns.e();
        mug.c(context != null, "Context cannot be null", new Object[0]);
        this.b = context.getPackageName();
    }
    
    public final Uri a() {
        return new Uri$Builder().scheme("android").authority(this.b).path(String.format("/%s/%s/%s/%s", this.a, this.c, mrt.b(this.d), this.e)).encodedFragment(msk.b(this.f.f())).build();
    }
    
    public final void b() {
        mug.c(mrx.a.matcher("phenotype").matches(), "Module must match [a-z]+(_[a-z]+)*: %s", "phenotype");
        mug.c(mrx.c.contains("phenotype") ^ true, "Module name is reserved and cannot be used: %s", "phenotype");
        this.c = "phenotype";
    }
    
    public final void c(final String s) {
        String substring = s;
        if (s.startsWith("/")) {
            substring = s.substring(1);
        }
        final Pattern a = mrx.a;
        this.e = substring;
    }
}
