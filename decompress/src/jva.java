import java.util.Collections;
import java.util.Iterator;
import android.os.Looper;
import android.content.Context;
import java.util.Set;
import android.accounts.Account;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jva extends jum implements jqo
{
    private final Account a;
    public final Set s;
    
    protected jva(final Context context, final Looper looper, final int n, final juq juq, final jsa jsa, final jtg jtg) {
        Object o = jvc.a;
        monitorenter(o);
        try {
            if (jvc.b == null) {
                jvc.b = new jvc(context.getApplicationContext());
            }
            monitorexit(o);
            o = jvc.b;
            final jpw a = jpw.a;
            jvu.a(jsa);
            jvu.a(jtg);
            super(context, looper, (jvc)o, a, n, new juy(jsa), new juz(jtg), juq.f);
            this.a = juq.a;
            final Set c = juq.c;
            final Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                if (c.contains(iterator.next())) {
                    continue;
                }
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
            this.s = c;
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    @Override
    public final jpu[] E() {
        return new jpu[0];
    }
    
    @Override
    public int a() {
        throw null;
    }
    
    @Override
    public final Set h() {
        Set<Object> set;
        if (this.o()) {
            set = this.s;
        }
        else {
            set = Collections.emptySet();
        }
        return set;
    }
    
    @Override
    public final Account t() {
        return this.a;
    }
}
