import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewDebug$ExportedProperty;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oj extends qz
{
    @ViewDebug$ExportedProperty
    public boolean a;
    @ViewDebug$ExportedProperty
    public int b;
    @ViewDebug$ExportedProperty
    public int c;
    @ViewDebug$ExportedProperty
    public boolean d;
    @ViewDebug$ExportedProperty
    public boolean e;
    public boolean f;
    
    public oj() {
        super(-2);
        this.a = false;
    }
    
    public oj(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public oj(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
    }
    
    public oj(final oj oj) {
        super((ViewGroup$LayoutParams)oj);
        this.a = oj.a;
    }
}
