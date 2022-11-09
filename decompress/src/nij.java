import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class nij implements Iterator, j$.util.Iterator
{
    public int a;
    final CharSequence b;
    final boolean c;
    int d;
    int e;
    private Object f;
    
    protected nij(final njk njk, final CharSequence b) {
        this.a = 2;
        this.d = 0;
        this.c = njk.b;
        this.e = Integer.MAX_VALUE;
        this.b = b;
    }
    
    public abstract int a(final int p0);
    
    public abstract int b(final int p0);
    
    @Override
    public final boolean hasNext() {
        njo.o(this.a != 4);
        final int a = this.a;
        Object string = null;
        if (a == 0) {
            throw null;
        }
        switch (a - 1) {
            default: {
                this.a = 4;
                int n = this.d;
                while (true) {
                    final int d = this.d;
                    if (d == -1) {
                        this.a = 3;
                        break;
                    }
                    int n2 = this.b(d);
                    int a2;
                    if (n2 == -1) {
                        n2 = this.b.length();
                        this.d = -1;
                        a2 = -1;
                    }
                    else {
                        a2 = this.a(n2);
                        this.d = a2;
                    }
                    if (a2 == n) {
                        if ((this.d = a2 + 1) <= this.b.length()) {
                            continue;
                        }
                        this.d = -1;
                    }
                    else {
                        if (n < n2) {
                            this.b.charAt(n);
                        }
                        if (n < n2) {
                            this.b.charAt(n2 - 1);
                        }
                        if (!this.c || n != n2) {
                            final int e = this.e;
                            if (e == 1) {
                                final int length = this.b.length();
                                this.d = -1;
                                if ((n2 = length) > n) {
                                    this.b.charAt(length - 1);
                                    n2 = length;
                                }
                            }
                            else {
                                this.e = e - 1;
                            }
                            string = this.b.subSequence(n, n2).toString();
                            break;
                        }
                        n = this.d;
                    }
                }
                this.f = string;
                if (this.a != 3) {
                    this.a = 1;
                    return true;
                }
                return false;
            }
            case 2: {
                return false;
            }
            case 0: {
                return true;
            }
        }
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            this.a = 2;
            final Object f = this.f;
            this.f = null;
            return f;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
