import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ojf implements omi
{
    public static void e(final Iterable iterable, final List list) {
        olk.h(iterable);
        if (iterable instanceof olu) {
            final List h = ((olu)iterable).h();
            final olu olu = (olu)list;
            final int size = list.size();
            for (final Object next : h) {
                if (next == null) {
                    final int size2 = olu.size();
                    final StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    final String string = sb.toString();
                    for (int i = olu.size() - 1; i >= size; --i) {
                        olu.remove(i);
                    }
                    throw new NullPointerException(string);
                }
                if (next instanceof ojw) {
                    olu.i((ojw)next);
                }
                else {
                    olu.add((String)next);
                }
            }
        }
        else {
            if (iterable instanceof omq) {
                list.addAll((Collection)iterable);
                return;
            }
            if (list instanceof ArrayList && iterable instanceof Collection) {
                ((ArrayList)list).ensureCapacity(list.size() + ((Collection)iterable).size());
            }
            final int size3 = list.size();
            for (final Object next2 : iterable) {
                if (next2 == null) {
                    final int size4 = list.size();
                    final StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Element at index ");
                    sb2.append(size4 - size3);
                    sb2.append(" is null.");
                    final String string2 = sb2.toString();
                    for (int j = list.size() - 1; j >= size3; --j) {
                        list.remove(j);
                    }
                    throw new NullPointerException(string2);
                }
                list.add(next2);
            }
        }
    }
    
    public abstract ojf a();
    
    protected abstract ojf b(final ojg p0);
    
    public ojf f(final byte[] array, final int n) {
        throw null;
    }
}
