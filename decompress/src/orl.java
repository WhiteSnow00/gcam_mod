import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import android.content.res.Resources;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.res.Resources$NotFoundException;
import android.util.Log;
import android.content.pm.PackageManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orl
{
    public static final String a;
    public final PackageManager b;
    
    static {
        a = orl.class.getSimpleName();
    }
    
    public orl(final PackageManager b) {
        b.getClass();
        this.b = b;
    }
    
    public final String a(final String s, final String s2) {
        try {
            final Resources resourcesForApplication = this.b.getResourcesForApplication(s);
            return resourcesForApplication.getString(resourcesForApplication.getIdentifier(s2, "string", s));
        }
        catch (final Resources$NotFoundException ex) {
            Log.w(orl.a, String.format("String resource name '%s' not found in package '%s'.", s2, s));
            return null;
        }
        catch (final PackageManager$NameNotFoundException ex2) {
            Log.w(orl.a, String.format("Application package name '%s' not found.", s));
            return null;
        }
    }
    
    public final String b() {
        String s = "com.google.vr.apps.ornament";
        if (!this.c("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.measure.MeasureMainActivity")) {
            s = "com.google.vr.apps.ornament.measure";
        }
        return s;
    }
    
    public final boolean c(final String s, final String s2) {
        final Intent intent = new Intent();
        intent.setClassName(s, s2);
        return this.b.resolveActivity(intent, 0) != null;
    }
    
    public final Drawable d() {
        try {
            final Resources resourcesForApplication = this.b.getResourcesForApplication("com.google.vr.apps.ornament");
            return resourcesForApplication.getDrawable(resourcesForApplication.getIdentifier("playground_mode_icon", "drawable", "com.google.vr.apps.ornament"), (Resources$Theme)null);
        }
        catch (final Resources$NotFoundException ex) {
            Log.w(orl.a, String.format("Drawable resource name '%s' not found in package '%s'.", "playground_mode_icon", "com.google.vr.apps.ornament"));
            return null;
        }
        catch (final PackageManager$NameNotFoundException ex2) {
            Log.w(orl.a, String.format("Application package name '%s' not found.", "com.google.vr.apps.ornament"));
            return null;
        }
    }
}
