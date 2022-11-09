import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class njk
{
    public final nio a;
    public final boolean b;
    private final njj c;
    
    private njk(final njj njj) {
        this(njj, false, nin.a);
    }
    
    private njk(final njj c, final boolean b, final nio a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static njk b(final char c) {
        return new njk(new njf(new nil(c)));
    }
    
    public static njk c(final String s) {
        njo.e(s.length() != 0, "The separator may not be the empty string.");
        if (s.length() == 1) {
            return b(s.charAt(0));
        }
        return new njk(new njh(s));
    }
    
    public final njk a() {
        return new njk(this.c, true, this.a);
    }
    
    public final Iterable d(final CharSequence charSequence) {
        charSequence.getClass();
        return new nji(this, charSequence);
    }
    
    public final Iterator e(final CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }
    
    public final List f(final CharSequence charSequence) {
        charSequence.getClass();
        final Iterator e = this.e(charSequence);
        final ArrayList list = new ArrayList();
        while (e.hasNext()) {
            list.add(e.next());
        }
        return Collections.unmodifiableList((List<?>)list);
    }
}
