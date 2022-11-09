import java.util.Collections;
import java.util.TreeMap;
import java.text.ParseException;
import java.util.MissingResourceException;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cj extends dap
{
    public static final cj a;
    private static final ResourceBundle d;
    public Map b;
    public Map c;
    private final Map e;
    
    static {
        d = new bq();
        a = new cj();
    }
    
    private cj() {
        this.e = new HashMap();
    }
    
    public final ci a(final String s) {
        Object e = this.e;
        monitorenter(e);
        try {
            final boolean containsKey = this.e.containsKey(s);
            Object[][] array = null;
            ci b;
            if (containsKey) {
                b = this.e.get(s);
            }
            else {
                b = null;
            }
            monitorexit(e);
            if (!containsKey) {
                try {
                    final Object[][] array2 = (Object[][])cj.d.getObject("rules");
                    for (int length = array2.length, i = 0; i < length; ++i) {
                        e = array2[i];
                        if (s.equals(e[0])) {
                            array = (Object[][])e[1];
                            break;
                        }
                    }
                    final StringBuilder sb = new StringBuilder();
                    for (int length2 = array.length, j = 0; j < length2; ++j) {
                        e = array[j];
                        if (sb.length() > 0) {
                            sb.append("; ");
                        }
                        sb.append((String)e[0]);
                        sb.append(": ");
                        sb.append((String)e[1]);
                    }
                    b = ci.b(sb.toString());
                }
                catch (final MissingResourceException ex) {}
                catch (final ParseException ex2) {}
                synchronized (this.e) {
                    if (this.e.containsKey(s)) {
                        b = this.e.get(s);
                    }
                    else {
                        this.e.put(s, b);
                    }
                }
            }
            return b;
        }
        finally {
            monitorexit(e);
            while (true) {}
        }
    }
    
    public final void b() {
        monitorenter(this);
        try {
            final Map b = this.b;
            monitorexit(this);
            if (b == null) {
                Map<Object, Object> emptyMap;
                Map<Object, Object> emptyMap2;
                try {
                    final ResourceBundle d = cj.d;
                    final Object[][] array = (Object[][])d.getObject("locales");
                    emptyMap = new TreeMap<Object, Object>();
                    for (final Object[] array2 : array) {
                        emptyMap.put(array2[0], array2[1]);
                    }
                    final Object[][] array3 = (Object[][])d.getObject("locales_ordinals");
                    emptyMap2 = new TreeMap<Object, Object>();
                    for (final Object[] array4 : array3) {
                        emptyMap2.put(array4[0], array4[1]);
                    }
                }
                catch (final MissingResourceException ex) {
                    emptyMap = Collections.emptyMap();
                    emptyMap2 = Collections.emptyMap();
                }
                synchronized (this) {
                    if (this.b == null) {
                        this.b = emptyMap;
                        this.c = emptyMap2;
                    }
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
