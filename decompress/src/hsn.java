import android.view.View$MeasureSpec;
import android.content.res.Resources;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import j$.time.Duration;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsn extends ImageButton implements hsj
{
    public static final ColorMatrixColorFilter a;
    public final boolean b;
    public final Duration c;
    public final ResolveInfo d;
    public final PackageManager e;
    public boolean f;
    private int g;
    
    static {
        final ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        a = new ColorMatrixColorFilter(colorMatrix);
    }
    
    public hsn(final Context context, final ResolveInfo d, final boolean b) {
        super(context);
        this.f = false;
        this.b = b;
        this.d = d;
        this.e = context.getPackageManager();
        this.g = context.getResources().getDimensionPixelSize(2131166297);
        this.c = Duration.ofMillis((long)context.getResources().getInteger(2131492979));
    }
    
    public static String a(final ResolveInfo resolveInfo, final PackageManager packageManager, final Resources resources) {
        final String string = resolveInfo.activityInfo.applicationInfo.loadLabel(packageManager).toString();
        final String string2 = resolveInfo.loadLabel(packageManager).toString();
        if (!string.equals(string2)) {
            final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(string2).length());
            sb.append(string);
            sb.append(" ");
            sb.append(string2);
            return resources.getString(2131952634, new Object[] { sb.toString() });
        }
        return resources.getString(2131952634, new Object[] { string });
    }
    
    public final void b() {
        this.f = true;
        this.g = this.getContext().getResources().getDimensionPixelSize(2131166304);
        this.setVisibility(0);
        this.setImportantForAccessibility(2);
        this.requestLayout();
    }
    
    public final void c() {
        this.f = false;
        this.g = this.getContext().getResources().getDimensionPixelSize(2131166297);
        this.setVisibility(0);
        this.setImportantForAccessibility(1);
        this.requestLayout();
    }
    
    public final void d() {
        this.setVisibility(8);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(View$MeasureSpec.getSize(n), this.g);
    }
}
