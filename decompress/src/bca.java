import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bca
{
    private final bcf a;
    private final bbz b;
    
    public bca(final hp hp) {
        final bcf a = new bcf(hp);
        this.b = new bbz();
        this.a = a;
    }
    
    public final List a(final Class clazz) {
        synchronized (this) {
            return this.a.c(clazz);
        }
    }
    
    public final List b(final Class clazz) {
        synchronized (this) {
            final bby bby = this.b.a.get(clazz);
            List a;
            if (bby == null) {
                a = null;
            }
            else {
                a = bby.a;
            }
            List<Object> unmodifiableList = a;
            if (a == null) {
                unmodifiableList = Collections.unmodifiableList((List<?>)this.a.b(clazz));
                if (this.b.a.put(clazz, new bby(unmodifiableList)) != null) {
                    final String value = String.valueOf(clazz);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 34);
                    sb.append("Already cached loaders for model: ");
                    sb.append(value);
                    throw new IllegalStateException(sb.toString());
                }
            }
            return unmodifiableList;
        }
    }
    
    public final void c(final Class clazz, final Class clazz2, final bbx bbx) {
        synchronized (this) {
            this.a.d(clazz, clazz2, bbx);
            this.b.a.clear();
        }
    }
}
