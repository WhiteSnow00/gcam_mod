import java.util.Iterator;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lug
{
    public final niz a;
    final List b;
    
    public lug(final niz a) {
        this.b = new ArrayList();
        this.a = a;
    }
    
    public final lug a(final String s) {
        final List c = this.c(s);
        if (c.size() != 1) {
            String a;
            if (this.a.g()) {
                a = ((luf)this.a.c()).a;
            }
            else {
                a = "n/a";
            }
            throw new luk(String.format(Locale.US, "Looking for a unique %s box in a %s box but found %d of them", s, a, c.size()));
        }
        return (lug)c.get(0);
    }
    
    public final lui b(final luh luh) {
        njo.d(this.a.g());
        njo.d(((luf)this.a.c()).a.equals(luh.a));
        if (((luf)this.a.c()).b.b >= luh.b + 4) {
            final luf luf = (luf)this.a.c();
            return new lui(luf.d, luf.b.a + luh.b);
        }
        throw new luk(String.format(Locale.US, "Trying to look up offset %d in box %s but the box is only %d bytes long", luh.b, ((luf)this.a.c()).a, ((luf)this.a.c()).b.b));
    }
    
    public final List c(final String s) {
        final ArrayList list = new ArrayList();
        for (final lug lug : this.b) {
            njo.o(lug.a.g());
            if (((luf)lug.a.c()).a.equals(s)) {
                list.add(lug);
            }
        }
        return list;
    }
}
