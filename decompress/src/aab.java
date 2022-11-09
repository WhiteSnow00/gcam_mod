import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aab implements Comparator
{
    public static final Comparator a;
    public static final aab b;
    public static final aab c;
    private final /* synthetic */ int d;
    
    static {
        a = new aab(11);
        c = new aab(10);
        b = new aab(9);
    }
    
    public aab() {
    }
    
    public aab(final int d) {
        this.d = d;
    }
}
