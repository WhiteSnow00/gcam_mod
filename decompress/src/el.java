import android.view.Window;
import android.view.View;
import android.content.Context;
import android.app.Activity;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class el extends et implements ad, wi, wq, aex, fl
{
    final /* synthetic */ em a;
    
    public el(final em a) {
        this.a = a;
        super(a, (Context)a, new Handler());
    }
    
    @Override
    public final aev A() {
        return this.a.A();
    }
    
    @Override
    public final View aB(final int n) {
        return this.a.findViewById(n);
    }
    
    @Override
    public final boolean aC() {
        final Window window = this.a.getWindow();
        return window != null && window.peekDecorView() != null;
    }
    
    @Override
    public final i aD() {
        return this.a.e;
    }
    
    @Override
    public final ac bg() {
        return this.a.bg();
    }
    
    @Override
    public final void c() {
    }
}
