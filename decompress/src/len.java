import java.util.Iterator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import android.hardware.camera2.CaptureRequest$Key;
import android.hardware.camera2.CaptureRequest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class len implements ljh
{
    private final CaptureRequest a;
    
    public len(final CaptureRequest a) {
        this.a = a;
    }
    
    @Override
    public final Object a(final CaptureRequest$Key captureRequest$Key) {
        return this.a.get(captureRequest$Key);
    }
    
    @Override
    public final Object b() {
        return this.a.getTag();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && nqb.E(this.a, ((len)o).a));
    }
    
    @Override
    public final lfa g() {
        return new lfa(this.a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
    
    @Override
    public final String toString() {
        final ArrayList list = new ArrayList();
        for (final CaptureRequest$Key captureRequest$Key : this.a.getKeys()) {
            final String name = captureRequest$Key.getName();
            final Object a = this.a(captureRequest$Key);
            String s;
            if (a == null) {
                s = "null";
            }
            else if (a.getClass().isArray()) {
                final ArrayList list2 = new ArrayList();
                for (int length = Array.getLength(a), i = 0; i < length; ++i) {
                    list2.add(Array.get(a, i).toString());
                }
                s = nfa.g(list2, ", ");
            }
            else {
                s = a.toString();
            }
            final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 3 + String.valueOf(s).length());
            sb.append(name);
            sb.append(" : ");
            sb.append(s);
            list.add(sb.toString());
        }
        return nfa.g(list, "\n");
    }
}
