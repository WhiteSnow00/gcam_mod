import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import com.google.android.apps.camera.ui.views.GradientBar;
import com.google.android.apps.camera.ui.modeswitcher.MoreModesGrid;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.ui.breadcrumbs.BreadcrumbsView;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import android.widget.FrameLayout;
import com.google.android.apps.camera.ui.views.MainActivityLayout;
import android.view.ViewStub;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixx
{
    final ViewStub a;
    final ViewStub b;
    public final MainActivityLayout c;
    public final FrameLayout d;
    public final ViewfinderCover e;
    public final BottomBar f;
    public final RoundedThumbnailView g;
    public final OptionsMenuContainer h;
    public final ModeSwitcher i;
    public final BreadcrumbsView j;
    public final jea k;
    public final ShutterButton l;
    public final MoreModesGrid m;
    public final GradientBar n;
    public final ShutterButtonProgressOverlay o;
    public final ZoomLockView p;
    
    public ixx(final jea k) {
        kjm.a();
        this.k = k;
        this.c = (MainActivityLayout)k.c(2131427411);
        this.a = (ViewStub)k.c(2131427473);
        this.b = (ViewStub)k.c(2131427474);
        this.d = (FrameLayout)k.c(2131428138);
        this.e = (ViewfinderCover)k.c(2131428135);
        this.i = (ModeSwitcher)k.c(2131427775);
        this.j = (BreadcrumbsView)k.c(2131427464);
        this.l = (ShutterButton)k.c(2131427949);
        this.m = (MoreModesGrid)k.c(2131427777);
        this.h = (OptionsMenuContainer)k.c(2131427823);
        final BottomBar f = (BottomBar)k.c(2131427450);
        this.f = f;
        this.n = (GradientBar)k.c(2131427629);
        this.g = f.getThumbnailButton();
        this.o = (ShutterButtonProgressOverlay)k.c(2131427950);
        this.p = (ZoomLockView)k.c(2131428211);
    }
}
