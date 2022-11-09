import j$.util.function.Consumer;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.ArrayList;
import java.util.List;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuViewContainer;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqi implements cqk
{
    public final dgn a;
    public final cxl b;
    public PopupMenuView c;
    public PopupMenuViewContainer d;
    public final List e;
    public final kjk f;
    public final isg g;
    
    public cqi(final bmz bmz, final dgn a, final cxl b, final isg g) {
        this.e = new ArrayList();
        this.f = bmz.i();
        this.a = a;
        this.b = b;
        this.g = g;
    }
    
    @Override
    public final krc a(final cqm cqm) {
        this.e.add(cqm);
        return new cqg(this, cqm);
    }
    
    @Override
    public final void b() {
        this.c.b();
        Collection$_EL.stream((Collection)this.e).forEach((Consumer)cbc.e);
    }
    
    @Override
    public final boolean c() {
        return this.c.getVisibility() == 0;
    }
}
