import java.util.Date;
import com.google.android.apps.camera.ui.remotecontrol.RemoteControlView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itc implements efl
{
    private final RemoteControlView a;
    private Date b;
    
    public itc(final RemoteControlView a) {
        this.a = a;
    }
    
    @Override
    public final int a() {
        return Integer.MAX_VALUE;
    }
    
    @Override
    public final efo b() {
        return efo.a;
    }
    
    @Override
    public final Date e() {
        return this.b;
    }
    
    @Override
    public final void f(final Runnable runnable) {
        final String value = String.valueOf(this.getClass().getName());
        String concat;
        if (value.length() != 0) {
            concat = "Unsupported Operation delayedHide(Runnable) in: ".concat(value);
        }
        else {
            concat = new String("Unsupported Operation delayedHide(Runnable) in: ");
        }
        throw new UnsupportedOperationException(concat);
    }
    
    @Override
    public final void g() {
        this.a.setVisibility(8);
    }
    
    @Override
    public final void i(final Date b) {
        this.b = b;
    }
    
    @Override
    public final void j() {
        this.a.setVisibility(0);
    }
    
    @Override
    public final boolean m() {
        return true;
    }
    
    @Override
    public final boolean n() {
        return false;
    }
    
    @Override
    public final int p() {
        return 6;
    }
}
