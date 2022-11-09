import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

// 
// Decompiled by Procyon v0.6.0
// 

public final class olt extends ojj implements RandomAccess, olu
{
    private static final olt b;
    private final List c;
    
    static {
        (b = new olt(10)).b();
    }
    
    public olt() {
        this(10);
    }
    
    public olt(final int n) {
        this(new ArrayList(n));
    }
    
    private olt(final ArrayList c) {
        this.c = c;
    }
    
    private static String j(final Object o) {
        if (o instanceof String) {
            return (String)o;
        }
        if (o instanceof ojw) {
            return ((ojw)o).z();
        }
        return olk.f((byte[])o);
    }
    
    @Override
    public final boolean addAll(final int n, final Collection collection) {
        this.bT();
        List h = (List)collection;
        if (collection instanceof olu) {
            h = ((olu)collection).h();
        }
        final boolean addAll = this.c.addAll(n, h);
        ++this.modCount;
        return addAll;
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        return this.addAll(this.size(), collection);
    }
    
    @Override
    public final void clear() {
        this.bT();
        this.c.clear();
        ++this.modCount;
    }
    
    @Override
    public final olu d() {
        if (super.a) {
            return new onn(this);
        }
        return this;
    }
    
    @Override
    public final Object f(final int n) {
        return this.c.get(n);
    }
    
    public final String g(final int n) {
        final byte[] value = this.c.get(n);
        if (value instanceof String) {
            return (String)(Object)value;
        }
        if (value instanceof ojw) {
            final ojw ojw = (Object)value;
            final String z = ojw.z();
            if (ojw.p()) {
                this.c.set(n, z);
            }
            return z;
        }
        final byte[] array = value;
        final String f = olk.f(array);
        if (olk.g(array)) {
            this.c.set(n, f);
        }
        return f;
    }
    
    @Override
    public final List h() {
        return Collections.unmodifiableList((List<?>)this.c);
    }
    
    @Override
    public final void i(final ojw ojw) {
        this.bT();
        this.c.add(ojw);
        ++this.modCount;
    }
    
    @Override
    public final int size() {
        return this.c.size();
    }
}
