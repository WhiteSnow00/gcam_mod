import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ayy
{
    public final hp a;
    public final List b;
    public final String c;
    
    public ayy(final Class clazz, final Class clazz2, final Class clazz3, final List b, final hp a) {
        this.a = a;
        bit.d(b);
        this.b = b;
        final String simpleName = clazz.getSimpleName();
        final String simpleName2 = clazz2.getSimpleName();
        final String simpleName3 = clazz3.getSimpleName();
        final StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 21 + String.valueOf(simpleName2).length() + String.valueOf(simpleName3).length());
        sb.append("Failed LoadPath{");
        sb.append(simpleName);
        sb.append("->");
        sb.append(simpleName2);
        sb.append("->");
        sb.append(simpleName3);
        sb.append("}");
        this.c = sb.toString();
    }
    
    @Override
    public final String toString() {
        final String string = Arrays.toString(this.b.toArray());
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 22);
        sb.append("LoadPath{decodePaths=");
        sb.append(string);
        sb.append('}');
        return sb.toString();
    }
}
