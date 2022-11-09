import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

final class wa implements Runnable
{
    final /* synthetic */ we a;
    
    public wa(final we a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            we.j(this.a);
        }
        catch (final IllegalStateException ex) {
            if (TextUtils.equals((CharSequence)ex.getMessage(), (CharSequence)"Can not perform this action after onSaveInstanceState")) {
                return;
            }
            throw ex;
        }
    }
}
