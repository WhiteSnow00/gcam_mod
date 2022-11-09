import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nji implements Iterable
{
    final /* synthetic */ CharSequence a;
    final /* synthetic */ njk b;
    
    public nji(final njk b, final CharSequence a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Iterator iterator() {
        return this.b.e(this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('[');
        nfa.h(sb, this.iterator(), ", ");
        sb.append(']');
        return sb.toString();
    }
}
