import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Collection;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.List;
import android.content.Context;
import java.util.ArrayList;
import android.view.View;
import android.os.Looper;
import android.widget.ArrayAdapter;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrj extends ei implements adm
{
    public LicenseMenuActivity a;
    private ArrayAdapter b;
    
    @Override
    public final void E() {
        super.E();
        final adn a = adn.a(this.v());
        if (a.a.e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (adn.c(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("destroyLoader in ");
                sb.append(a);
                sb.append(" of 54321");
                sb.toString();
            }
            final ado b = a.a.b(54321);
            if (b != null) {
                b.j();
                final zc d = a.a.d;
                final int a2 = yx.a(d.c, d.e, 54321);
                if (a2 >= 0 && d.d[a2] != zc.a) {
                    d.d[a2] = zc.a;
                    d.b = true;
                }
            }
            return;
        }
        throw new IllegalStateException("destroyLoader must be called on the main thread");
    }
    
    @Override
    public final void Y(final View view) {
        final em v = this.v();
        this.b = new ArrayAdapter((Context)v, 2131624036, 2131427697, (List)new ArrayList());
        adn.a(v).d(54321, this);
        final ListView listView = (ListView)view.findViewById(2131427700);
        listView.setAdapter((ListAdapter)this.b);
        listView.setOnItemClickListener((AdapterView$OnItemClickListener)new mri(this));
    }
    
    @Override
    public final adu a() {
        return new mrh((Context)this.v());
    }
    
    @Override
    public final void c() {
        this.b.clear();
        this.b.notifyDataSetChanged();
    }
    
    @Override
    public final void d(final Context context) {
        super.d(context);
        final em v = this.v();
        if (v instanceof LicenseMenuActivity) {
            this.a = (LicenseMenuActivity)v;
        }
    }
    
    @Override
    public final void g() {
        super.g();
        this.a = null;
    }
    
    @Override
    public final View y(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return layoutInflater.inflate(2131624039, viewGroup, false);
    }
}
