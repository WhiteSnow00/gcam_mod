import java.util.Map;
import java.lang.reflect.Constructor;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nvf implements Comparator
{
    private final /* synthetic */ int b;
    
    static {
        a = new nvf(2);
    }
    
    public nvf() {
    }
    
    public nvf(final int b) {
        this.b = b;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        switch (this.b) {
            default: {
                final Integer value = ((Constructor)o2).getParameterTypes().length;
                final Integer value2 = ((Constructor)o).getParameterTypes().length;
                if (value == value2) {
                    return 0;
                }
                return value.compareTo(value2);
            }
            case 2: {
                return ((Map.Entry)o).getKey().compareTo((String)((Map.Entry)o2).getKey());
            }
            case 1: {
                final nvj a = nvj.a(o);
                final nvj a2 = nvj.a(o2);
                int n = 0;
                if (a == a2) {
                    switch (a.ordinal()) {
                        default: {
                            throw null;
                        }
                        case 3: {
                            n = ((Double)o).compareTo((Double)o2);
                            break;
                        }
                        case 2: {
                            n = ((Long)o).compareTo((Long)o2);
                            break;
                        }
                        case 1: {
                            n = ((String)o).compareTo((String)o2);
                            break;
                        }
                        case 0: {
                            n = ((Boolean)o).compareTo((Boolean)o2);
                            break;
                        }
                    }
                }
                else {
                    n = a.compareTo(a2);
                }
                return n;
            }
            case 0: {
                return ((Map.Entry)o).getKey().compareTo((String)((Map.Entry)o2).getKey());
            }
        }
    }
}
