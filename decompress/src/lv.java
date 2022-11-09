import android.content.res.AssetManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.content.res.Resources$Theme;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lv extends ContextWrapper
{
    public int a;
    private Resources$Theme b;
    private LayoutInflater c;
    private Configuration d;
    private Resources e;
    
    public lv() {
        super((Context)null);
    }
    
    public lv(final Context context, final int a) {
        super(context);
        this.a = a;
    }
    
    public lv(final Context context, final Resources$Theme b) {
        super(context);
        this.b = b;
    }
    
    private final Resources b() {
        if (this.e == null) {
            final Configuration d = this.d;
            if (d == null) {
                this.e = super.getResources();
            }
            else {
                this.e = this.createConfigurationContext(d).getResources();
            }
        }
        return this.e;
    }
    
    private final void c() {
        if (this.b == null) {
            this.b = this.b().newTheme();
            final Resources$Theme theme = this.getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }
    
    public final void a(final Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.d == null) {
            this.d = new Configuration(configuration);
            return;
        }
        throw new IllegalStateException("Override configuration has already been set");
    }
    
    public final AssetManager getAssets() {
        return this.b().getAssets();
    }
    
    public final Resources getResources() {
        return this.b();
    }
    
    public final Object getSystemService(final String s) {
        if ("layout_inflater".equals(s)) {
            if (this.c == null) {
                this.c = LayoutInflater.from(this.getBaseContext()).cloneInContext((Context)this);
            }
            return this.c;
        }
        return this.getBaseContext().getSystemService(s);
    }
    
    public final Resources$Theme getTheme() {
        final Resources$Theme b = this.b;
        if (b != null) {
            return b;
        }
        if (this.a == 0) {
            this.a = 2132017861;
        }
        this.c();
        return this.b;
    }
    
    public final void setTheme(final int a) {
        if (this.a != a) {
            this.a = a;
            this.c();
        }
    }
}
