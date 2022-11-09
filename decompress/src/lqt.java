import android.content.SharedPreferences;
import java.io.File;
import android.content.Context;
import com.google.android.libraries.lens.lenslite.dynamicloading.ClientContextProvider;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqt extends ContextWrapper implements ClientContextProvider
{
    private final Context a;
    
    public lqt(final Context context, final Context a) {
        super(context);
        this.a = a;
    }
    
    public final boolean deleteSharedPreferences(final String s) {
        return this.a.deleteSharedPreferences(s);
    }
    
    public final Context getApplicationContext() {
        return (Context)this;
    }
    
    public final File getCacheDir() {
        return this.a.getCacheDir();
    }
    
    public final Context getClientContext() {
        return this.a;
    }
    
    public final File getDir(final String s, final int n) {
        return this.a.getDir(s, n);
    }
    
    public final File getFilesDir() {
        return this.a.getFilesDir();
    }
    
    public final SharedPreferences getSharedPreferences(final String s, final int n) {
        return this.a.getSharedPreferences(s, n);
    }
    
    public final boolean moveSharedPreferencesFrom(final Context context, final String s) {
        return this.a.moveSharedPreferencesFrom(context, s);
    }
}
