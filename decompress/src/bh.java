import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bh
{
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    
    public bh(final String a, final String b, final String c, final List list, final List list2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = Collections.unmodifiableList((List<?>)list);
        this.e = Collections.unmodifiableList((List<?>)list2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bh)) {
            return false;
        }
        final bh bh = (bh)o;
        return this.a.equals(bh.a) && this.b.equals(bh.b) && this.c.equals(bh.c) && this.d.equals(bh.d) && this.e.equals(bh.e);
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ForeignKey{referenceTable='");
        sb.append(this.a);
        sb.append("', onDelete='");
        sb.append(this.b);
        sb.append("', onUpdate='");
        sb.append(this.c);
        sb.append("', columnNames=");
        sb.append(this.d);
        sb.append(", referenceColumnNames=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
