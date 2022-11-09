import java.util.ListIterator;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbu
{
    public final myz a;
    public final myc b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final mza g;
    
    public nbu(final myz a, final myc b, final List c, final List d, final List e, final List f, final mza g) {
        a.getClass();
        b.getClass();
        c.getClass();
        d.getClass();
        g.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void a(List list, int i, final String s) {
        if (i == list.size()) {
            return;
        }
        final mza g = this.g;
        final myz a = this.a;
        final List b = pjf.b(this.b);
        list.getClass();
        if (i >= 0) {
            Label_0369: {
                if (i == 0) {
                    list = pjf.j(list);
                }
                else {
                    ArrayList list2;
                    if (list instanceof Collection) {
                        final int n = list.size() - i;
                        if (n <= 0) {
                            list = pja.a;
                            break Label_0369;
                        }
                        if (n == 1) {
                            list.getClass();
                            Object o;
                            if (list instanceof List) {
                                list.getClass();
                                if (list.isEmpty()) {
                                    throw new NoSuchElementException("List is empty.");
                                }
                                o = list.get(pjf.c(list));
                            }
                            else {
                                final Iterator iterator = list.iterator();
                                if (!iterator.hasNext()) {
                                    throw new NoSuchElementException("Collection is empty.");
                                }
                                o = iterator.next();
                                while (iterator.hasNext()) {
                                    o = iterator.next();
                                }
                            }
                            list = pjf.b(o);
                            break Label_0369;
                        }
                        list2 = new ArrayList(n);
                        if (list instanceof List) {
                            if (list instanceof RandomAccess) {
                                while (i < list.size()) {
                                    list2.add(list.get(i));
                                    ++i;
                                }
                            }
                            else {
                                final ListIterator listIterator = list.listIterator(i);
                                while (listIterator.hasNext()) {
                                    list2.add(listIterator.next());
                                }
                            }
                            list = list2;
                            break Label_0369;
                        }
                    }
                    else {
                        list2 = new ArrayList();
                    }
                    final Iterator iterator2 = list.iterator();
                    int n2 = 0;
                    while (iterator2.hasNext()) {
                        final Object next = iterator2.next();
                        if (n2 >= i) {
                            list2.add(next);
                        }
                        else {
                            ++n2;
                        }
                    }
                    list = pjf.d(list2);
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Extra ");
            sb.append(s);
            g.a(a.a(b, list, 31, new IllegalStateException(sb.toString())));
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Requested element count ");
        sb2.append(i);
        sb2.append(" is less than zero.");
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    public final void b(final int n, final Throwable t) {
        this.g.a(this.a.a(pjf.b(this.b), pjf.i(pjf.i(this.c, this.d), this.e), n, t));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof nbu) {
                final nbu nbu = (nbu)o;
                if (plr.b(this.a, nbu.a) && plr.b(this.b, nbu.b) && plr.b(this.c, nbu.c) && plr.b(this.d, nbu.d) && plr.b(this.e, nbu.e) && plr.b(this.f, nbu.f) && plr.b(this.g, nbu.g)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final myz a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final myc b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final List c = this.c;
        int hashCode4;
        if (c != null) {
            hashCode4 = c.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final List d = this.d;
        int hashCode5;
        if (d != null) {
            hashCode5 = d.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int hashCode6 = this.e.hashCode();
        final int hashCode7 = this.f.hashCode();
        final mza g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return (((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UploadItem(logStarter=");
        sb.append(this.a);
        sb.append(", resource=");
        sb.append(this.b);
        sb.append(", annotations=");
        sb.append(this.c);
        sb.append(", attachments=");
        sb.append(this.d);
        sb.append(", notForUploads=");
        sb.append(this.e);
        sb.append(", originalAnnotachmentOnDeviceIdOrder=");
        sb.append(this.f);
        sb.append(", f250Logger=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
