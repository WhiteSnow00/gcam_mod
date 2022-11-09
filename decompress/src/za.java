import java.util.Locale;
import java.util.Map;
import android.graphics.PorterDuff$Mode;
import java.util.LinkedHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class za
{
    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    
    public za() {
        this(6);
    }
    
    public za(final int c) {
        this.c = c;
        this.a = new LinkedHashMap(0, 0.75f, true);
    }
    
    public static int c(final int n, final PorterDuff$Mode porterDuff$Mode) {
        return (n + 31) * 31 + porterDuff$Mode.hashCode();
    }
    
    public final Object a(Object value) {
        if (value != null) {
            synchronized (this) {
                value = this.a.get(value);
                if (value != null) {
                    ++this.f;
                    return value;
                }
                ++this.g;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }
    
    public final Object b(Object put, Object key) {
        if (put != null) {
            synchronized (this) {
                ++this.d;
                ++this.b;
                put = this.a.put(put, key);
                if (put != null) {
                    --this.b;
                }
                monitorexit(this);
                final int c = this.c;
                while (true) {
                    synchronized (this) {
                        if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
                            key = new(java.lang.IllegalStateException.class)();
                            put = new StringBuilder();
                            ((StringBuilder)put).append(this.getClass().getName());
                            ((StringBuilder)put).append(".sizeOf() is reporting inconsistent results!");
                            new IllegalStateException(((StringBuilder)put).toString());
                            throw key;
                        }
                        if (this.b > c && !this.a.isEmpty()) {
                            final Map.Entry<Object, V> entry = this.a.entrySet().iterator().next();
                            key = entry.getKey();
                            entry.getValue();
                            this.a.remove(key);
                            --this.b;
                            ++this.e;
                            continue;
                        }
                        return put;
                    }
                }
            }
        }
        throw new NullPointerException("key == null || value == null");
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final int f = this.f;
            final int n = this.g + f;
            int n2;
            if (n != 0) {
                n2 = f * 100 / n;
            }
            else {
                n2 = 0;
            }
            return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.c, this.f, this.g, n2);
        }
    }
}
