import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwb
{
    private final mxt a;
    private final mwy b;
    private final mza c;
    
    public mwb(final mxt a, final mwy b, final mza c) {
        a.getClass();
        b.getClass();
        c.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final owt a(final myz myz, final Collection collection, final List list, final int n, final int n2) {
        owt a;
        if (n2 == n) {
            a = owt.a();
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("Actually updated ");
            sb.append(n2);
            sb.append(" instead of expected ");
            sb.append(n);
            sb.append(" items");
            final IllegalStateException ex = new IllegalStateException(sb.toString());
            this.c.a(myz.a(collection, list, 19, ex));
            a = new ozs(ex);
            pip.i();
        }
        return a;
    }
    
    public final owt b(final myz myz, final myc myc, final mxe mxe) {
        myz.getClass();
        myc.getClass();
        return this.c(myz, pjf.b(myc), pjf.b(mxe));
    }
    
    public final owt c(final myz myz, final Collection collection, final List list) {
        myz.getClass();
        collection.getClass();
        list.getClass();
        final int size = list.size();
        oxk oxk = null;
        switch (size) {
            default: {
                oxk = this.b.b(list);
                break;
            }
            case 1: {
                oxk = this.b.a(list.get(0));
                break;
            }
            case 0: {
                oxk = oxk.j(0);
                break;
            }
        }
        return oxk.a(new mvz(this, myz, collection, list, size));
    }
    
    public final owt d(final myz myz, final myc myc) {
        myz.getClass();
        return this.e(myz, pjf.b(myc));
    }
    
    public final owt e(final myz myz, final List list) {
        myz.getClass();
        list.getClass();
        final int size = list.size();
        oxk oxk = null;
        switch (size) {
            default: {
                oxk = this.a.b(list);
                break;
            }
            case 1: {
                oxk = this.a.a(list.get(0));
                break;
            }
            case 0: {
                oxk = oxk.j(0);
                break;
            }
        }
        return oxk.a(new mwa(this, myz, list, size));
    }
}
