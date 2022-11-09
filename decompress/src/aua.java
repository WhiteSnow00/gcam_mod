import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.util.Size;
import android.hardware.Camera$Size;
import android.graphics.Point;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aua
{
    private final Point a;
    
    public aua(final int n, final int n2) {
        this.a = new Point(n, n2);
    }
    
    public aua(final Camera$Size camera$Size) {
        if (camera$Size == null) {
            this.a = new Point(0, 0);
            return;
        }
        this.a = new Point(camera$Size.width, camera$Size.height);
    }
    
    public aua(final Size size) {
        if (size == null) {
            this.a = new Point(0, 0);
            return;
        }
        this.a = new Point(size.getWidth(), size.getHeight());
    }
    
    public aua(final aua aua) {
        if (aua == null) {
            this.a = new Point(0, 0);
            return;
        }
        this.a = new Point(aua.b(), aua.a());
    }
    
    public static List c(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(new aua((Size)iterator.next()));
        }
        return list2;
    }
    
    public final int a() {
        return this.a.y;
    }
    
    public final int b() {
        return this.a.x;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aua && this.a.equals((Object)((aua)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Size: (");
        sb.append(this.b());
        sb.append(" x ");
        sb.append(this.a());
        sb.append(")");
        return sb.toString();
    }
}
