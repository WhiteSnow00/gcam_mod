import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajs extends cwz
{
    private static final String g;
    public final akh a;
    public final String b;
    public final List c;
    public final List d;
    public boolean e;
    public final int f;
    private final List h;
    private ajc i;
    
    static {
        g = aiy.b("WorkContinuationImpl");
    }
    
    public ajs(final akh a, final String b, int i, final List c) {
        this.a = a;
        this.b = b;
        this.f = i;
        this.c = c;
        this.d = new ArrayList(c.size());
        this.h = new ArrayList();
        String a2;
        for (i = 0; i < c.size(); ++i) {
            a2 = c.get(i).a();
            this.d.add(a2);
            this.h.add(a2);
        }
    }
    
    public static Set b() {
        return new HashSet();
    }
    
    public final ajc a() {
        if (!this.e) {
            final ans ans = new ans(this);
            this.a.j.a(ans);
            this.i = ans.a;
        }
        else {
            aiy.a();
            aiy.g(ajs.g, String.format("Already enqueued work ids (%s)", TextUtils.join((CharSequence)", ", (Iterable)this.d)), new Throwable[0]);
        }
        return this.i;
    }
}
