import android.widget.ImageView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import j$.time.ZoneId;
import j$.time.format.FormatStyle;
import android.content.Context;
import j$.time.format.DateTimeFormatter;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class czt implements bqr
{
    public static final nsd a;
    protected static final DateTimeFormatter b;
    public final Context c;
    protected final czu d;
    public bqs e;
    protected fbl f;
    protected kre g;
    private final hip h;
    
    static {
        a = nsd.g("com/google/android/apps/camera/data/FilmstripItemBase");
        b = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withZone(ZoneId.systemDefault());
    }
    
    protected czt(final Context c, final czu d, final bqs e, final hip h) {
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        this.h = h;
        this.f = fbl.a;
        this.g = d.a;
    }
    
    public static czs k(final View view) {
        final Object tag = view.getTag(2131427743);
        if (tag instanceof czs) {
            return (czs)tag;
        }
        return null;
    }
    
    protected static final awc n(final bqs bqs) {
        bqs.i();
        return new bie(bqs.i(), bqs.h().getEpochSecond(), bqs.a());
    }
    
    @Override
    public final bqs a() {
        return this.e;
    }
    
    @Override
    public final fbl c() {
        return this.f;
    }
    
    @Override
    public final hip d() {
        return this.h;
    }
    
    @Override
    public final void f(final bqs e) {
        this.e = e;
    }
    
    @Override
    public final void g(final fbl f) {
        this.f = f;
    }
    
    @Override
    public final void h(final int n, final int n2) {
        if (n > 0 && n2 > 0) {
            this.g = new kre(n, n2);
            return;
        }
        a.l(czt.a.c(), "Suggested size was set to a zero area value!", '\u0298');
    }
    
    final View j(final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(this.c).inflate(2131624012, viewGroup, false);
        inflate.setTag(2131427743, (Object)new czs((ImageView)inflate.findViewById(2131427517), (ImageView)inflate.findViewById(2131427856), (ImageView)inflate.findViewById(2131427852)));
        return inflate;
    }
    
    public final void l(final View view) {
        final czs k = k(view);
        if (k == null) {
            a.l(czt.a.c(), "renderThumbnail was called with an invalid view!", '\u0297');
            return;
        }
        this.m(k);
    }
    
    protected abstract void m(final czs p0);
}
