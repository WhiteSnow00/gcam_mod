// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.social.licenses;

import android.view.MenuItem;
import android.os.Bundle;

public final class LicenseMenuActivity extends kf
{
    @Override
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131624038);
        if (this.h() != null) {
            this.h().g(true);
        }
        final fi c = this.c();
        if (!(c.c(2131427701) instanceof mrj)) {
            final mrj mrj = new mrj();
            final fr i = c.i();
            i.l(2131427701, mrj);
            i.b();
        }
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
