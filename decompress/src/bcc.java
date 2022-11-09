import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bcc implements bbw
{
    private final List a;
    private final hp b;
    
    public bcc(final List a, final hp b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final bbv a(final Object o, final int n, final int n2, final awg awg) {
        final int size = this.a.size();
        final ArrayList list = new ArrayList(size);
        int i = 0;
        awc awc = null;
        while (i < size) {
            final bbw bbw = this.a.get(i);
            awc a = awc;
            if (bbw.b(o)) {
                final bbv a2 = bbw.a(o, n, n2, awg);
                a = awc;
                if (a2 != null) {
                    a = a2.a;
                    list.add((Object)a2.c);
                }
            }
            ++i;
            awc = a;
        }
        if (!list.isEmpty() && awc != null) {
            return new bbv(awc, new bcb(list, this.b));
        }
        return null;
    }
    
    @Override
    public final boolean b(final Object o) {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            if (((bbw)iterator.next()).b(o)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final String string = Arrays.toString(this.a.toArray());
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 31);
        sb.append("MultiModelLoader{modelLoaders=");
        sb.append(string);
        sb.append('}');
        return sb.toString();
    }
}
