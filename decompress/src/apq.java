import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Collections;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

class apq implements Iterator, j$.util.Iterator
{
    final /* synthetic */ aps a;
    public app b;
    private int c;
    private apx d;
    private String e;
    private Iterator f;
    private int g;
    private Iterator h;
    
    public apq(final aps a) {
        this.a = a;
        this.c = 0;
        this.f = null;
        this.g = 0;
        this.h = Collections.EMPTY_LIST.iterator();
        this.b = null;
    }
    
    public apq(final aps a, final apx d, final String s, final int n) {
        this.a = a;
        this.c = 0;
        this.f = null;
        this.g = 0;
        this.h = Collections.EMPTY_LIST.iterator();
        this.b = null;
        this.d = d;
        this.c = 0;
        if (d.g().n()) {
            a.b = d.a;
        }
        this.e = this.a(d, s, n);
    }
    
    protected static final app b(final apx apx, final String s, final String s2) {
        Object b;
        if (apx.g().n()) {
            b = null;
        }
        else {
            b = apx.b;
        }
        return new app(s, s2, b, apx);
    }
    
    private final boolean c(final Iterator iterator) {
        if (!this.h.hasNext() && iterator.hasNext()) {
            final apx apx = iterator.next();
            final int g = this.g + 1;
            this.g = g;
            this.h = new apq(this.a, apx, this.e, g);
        }
        if (this.h.hasNext()) {
            this.b = this.h.next();
            return true;
        }
        return false;
    }
    
    protected final String a(final apx apx, final String s, final int n) {
        if (apx.c == null || apx.g().n()) {
            return null;
        }
        String s2;
        String s3;
        if (apx.c.g().d()) {
            final String value = String.valueOf(n);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 2);
            sb.append("[");
            sb.append(value);
            sb.append("]");
            s2 = sb.toString();
            s3 = "";
        }
        else {
            s2 = apx.a;
            s3 = "/";
        }
        if (s == null || s.length() == 0) {
            return s2;
        }
        if (!this.a.a.h(1024)) {
            final StringBuilder sb2 = new StringBuilder(s.length() + s3.length() + String.valueOf(s2).length());
            sb2.append(s);
            sb2.append(s3);
            sb2.append(s2);
            return sb2.toString();
        }
        if (!s2.startsWith("?")) {
            return s2;
        }
        return s2.substring(1);
    }
    
    @Override
    public boolean hasNext() {
        final app b = this.b;
        boolean hasNext = true;
        if (b != null) {
            return true;
        }
        final int c = this.c;
        if (c == 0) {
            this.c = 1;
            if (this.d.c != null && (!this.a.a.b() || !this.d.s())) {
                this.b = b(this.d, this.a.b, this.e);
            }
            else {
                hasNext = this.hasNext();
            }
            return hasNext;
        }
        if (c == 1) {
            if (this.f == null) {
                this.f = this.d.h();
            }
            boolean b3;
            final boolean b2 = b3 = this.c(this.f);
            if (!b2) {
                b3 = b2;
                if (this.d.t()) {
                    b3 = b2;
                    if (!this.a.a.h(4096)) {
                        this.c = 2;
                        this.f = null;
                        b3 = this.hasNext();
                    }
                }
            }
            return b3;
        }
        if (this.f == null) {
            this.f = this.d.i();
        }
        return this.c(this.f);
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            final app b = this.b;
            this.b = null;
            return b;
        }
        throw new NoSuchElementException("There are no more nodes to return");
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
