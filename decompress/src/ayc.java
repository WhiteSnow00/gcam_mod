import java.util.Collection;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ayc
{
    public final bfy a;
    public final hp b;
    private final Class c;
    private final List d;
    private final String e;
    
    public ayc(final Class c, final Class clazz, final Class clazz2, final List d, final bfy a, final hp b) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
        final String simpleName = c.getSimpleName();
        final String simpleName2 = clazz.getSimpleName();
        final String simpleName3 = clazz2.getSimpleName();
        final StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 23 + String.valueOf(simpleName2).length() + String.valueOf(simpleName3).length());
        sb.append("Failed DecodePath{");
        sb.append(simpleName);
        sb.append("->");
        sb.append(simpleName2);
        sb.append("->");
        sb.append(simpleName3);
        sb.append("}");
        this.e = sb.toString();
    }
    
    public final aza a(final awr awr, final int n, final int n2, final awg awg, final List list) {
        final int size = this.d.size();
        aza aza = null;
        aza a;
        for (int i = 0; i < size; ++i, aza = a) {
            final awi awi = this.d.get(i);
            a = aza;
            Label_0110: {
                try {
                    if (awi.b(awr.a(), awg)) {
                        a = awi.a(awr.a(), n, n2, awg);
                    }
                    break Label_0110;
                }
                catch (final OutOfMemoryError a) {}
                catch (final RuntimeException a) {}
                catch (final IOException ex) {}
                list.add(a);
                a = aza;
            }
            if (a != null) {
                aza = a;
                break;
            }
        }
        if (aza != null) {
            return aza;
        }
        throw new ayv(this.e, new ArrayList(list));
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.d);
        final String value3 = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 47 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append("DecodePath{ dataClass=");
        sb.append(value);
        sb.append(", decoders=");
        sb.append(value2);
        sb.append(", transcoder=");
        sb.append(value3);
        sb.append('}');
        return sb.toString();
    }
}
