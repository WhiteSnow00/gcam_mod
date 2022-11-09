import com.google.android.gms.common.data.DataHolder;
import android.content.IntentFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kio extends khi
{
    public jtd a;
    public final IntentFilter[] b;
    
    public kio(final IntentFilter[] array) {
        this.b = array;
    }
    
    @Override
    public final void b(final kgf kgf) {
    }
    
    @Override
    public final void c(final DataHolder dataHolder) {
        dataHolder.close();
    }
    
    @Override
    public final void d(final kht kht) {
        final jtd a = this.a;
        if (a != null) {
            a.b(new kin(kht));
        }
    }
    
    @Override
    public final void e(final kht kht, final khe khe) {
    }
    
    @Override
    public final void f() {
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public final void h() {
    }
    
    @Override
    public final void i() {
    }
    
    @Override
    public final void j() {
    }
    
    @Override
    public final void k() {
    }
    
    public final void l() {
        final jtd a = this.a;
        if (a != null) {
            a.a();
        }
        this.a = null;
    }
}
