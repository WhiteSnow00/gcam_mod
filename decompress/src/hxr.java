import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Context;
import android.text.style.TextAppearanceSpan;
import android.text.SpannableStringBuilder;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

final class hxr extends rw
{
    private final String[] b;
    private final String[] c;
    
    public hxr(final Resources resources) {
        this.b = resources.getStringArray(2130903075);
        this.c = resources.getStringArray(2130903076);
    }
    
    @Override
    public final int a() {
        return this.b.length;
    }
}
