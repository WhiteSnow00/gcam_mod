import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nsf extends nsx
{
    public nsf(final Class clazz) {
        super("group_by", clazz, true);
    }
    
    @Override
    public final void a(final Iterator iterator, final nsw nsw) {
        if (iterator.hasNext()) {
            final Object next = iterator.next();
            if (!iterator.hasNext()) {
                nsw.a(super.a, next);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(next);
            do {
                sb.append(',');
                sb.append(iterator.next());
            } while (iterator.hasNext());
            final String a = super.a;
            sb.append(']');
            nsw.a(a, sb.toString());
        }
    }
}
