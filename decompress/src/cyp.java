import android.content.ContentResolver;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyp
{
    private final Map a;
    
    public cyp(final ContentResolver contentResolver) {
        this.a = kir.d(contentResolver, "camera:");
    }
    
    public final String a(String concat) {
        final Map a = this.a;
        if (concat.length() != 0) {
            concat = "camera:".concat(concat);
        }
        else {
            concat = new String("camera:");
        }
        return (String)a.get(concat);
    }
}
