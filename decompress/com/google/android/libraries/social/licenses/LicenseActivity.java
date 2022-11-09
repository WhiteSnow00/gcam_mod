// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.social.licenses;

import android.text.Layout;
import android.widget.ScrollView;
import android.view.MenuItem;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import android.content.Context;
import android.widget.TextView;
import android.os.Bundle;

public final class LicenseActivity extends kf
{
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131624037);
        final mrf mrf = (mrf)this.getIntent().getParcelableExtra("license");
        if (this.h() != null) {
            this.h().i(mrf.a);
            this.h().r();
            this.h().g(true);
            this.h().t();
        }
        final TextView textView = (TextView)this.findViewById(2131427699);
        final long b = mrf.b;
        final int c = mrf.c;
        final String d = mrf.d;
        Label_0157: {
            if (d.isEmpty()) {
                final String text = mqa.c((Context)this, "third_party_licenses", b, c);
                break Label_0157;
            }
            try {
                final String text = mqa.b(new BufferedInputStream(new FileInputStream(d)), b, c);
                if (text != null && !text.isEmpty()) {
                    if (text == null) {
                        this.finish();
                        return;
                    }
                    textView.setText((CharSequence)text);
                    return;
                }
            }
            catch (final FileNotFoundException ex) {}
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 46);
        sb.append(d);
        sb.append(" does not contain res/raw/third_party_licenses");
        throw new RuntimeException(sb.toString());
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
    
    public final void onRestoreInstanceState(final Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        final ScrollView scrollView = (ScrollView)this.findViewById(2131427698);
        final int int1 = bundle.getInt("scroll_pos");
        if (int1 != 0) {
            scrollView.post((Runnable)new mrg(this, int1, scrollView));
        }
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        final ScrollView scrollView = (ScrollView)this.findViewById(2131427698);
        final Layout layout = ((TextView)this.findViewById(2131427699)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
