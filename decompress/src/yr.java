import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import j$.util.Map$Entry;
import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class yr implements Iterator, Entry, j$.util.Iterator, Map$Entry
{
    int a;
    int b;
    boolean c;
    final /* synthetic */ yu d;
    
    public yr(final yu d) {
        this.d = d;
        this.a = d.j - 1;
        this.b = -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(o instanceof Entry)) {
            return false;
        }
        final Entry entry = (Entry)o;
        return yx.f(entry.getKey(), this.d.f(this.b)) && yx.f(entry.getValue(), this.d.i(this.b));
    }
    
    @Override
    public final Object getKey() {
        if (this.c) {
            return this.d.f(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    @Override
    public final Object getValue() {
        if (this.c) {
            return this.d.i(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    @Override
    public final boolean hasNext() {
        return this.b < this.a;
    }
    
    @Override
    public final int hashCode() {
        if (this.c) {
            final Object f = this.d.f(this.b);
            final Object i = this.d.i(this.b);
            int hashCode = 0;
            int hashCode2;
            if (f == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = f.hashCode();
            }
            if (i != null) {
                hashCode = i.hashCode();
            }
            return hashCode2 ^ hashCode;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    @Override
    public final void remove() {
        if (this.c) {
            this.d.g(this.b);
            --this.b;
            --this.a;
            this.c = false;
            return;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final Object setValue(final Object o) {
        if (this.c) {
            return this.d.h(this.b, o);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getKey());
        sb.append("=");
        sb.append(this.getValue());
        return sb.toString();
    }
}
