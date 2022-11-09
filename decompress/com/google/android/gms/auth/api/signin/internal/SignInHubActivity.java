// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.content.Context;
import com.google.android.gms.auth.api.signin.SignInAccount;
import android.view.accessibility.AccessibilityEvent;
import android.content.ActivityNotFoundException;
import android.util.Log;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import android.content.Intent;

public class SignInHubActivity extends em
{
    private static boolean m;
    public int k;
    public Intent l;
    private boolean n;
    private SignInConfiguration o;
    private boolean p;
    
    static {
        SignInHubActivity.m = false;
    }
    
    public SignInHubActivity() {
        this.n = false;
    }
    
    private final void h() {
        adn.a(this).d(0, new joy(this));
        SignInHubActivity.m = false;
    }
    
    private final void i(final int n) {
        final Status status = new Status(n);
        final Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", (Parcelable)status);
        this.setResult(0, intent);
        this.finish();
        SignInHubActivity.m = false;
    }
    
    private final void m(final String s) {
        final Intent intent = new Intent(s);
        if (s.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        }
        else {
            intent.setPackage(this.getPackageName());
        }
        intent.putExtra("config", (Parcelable)this.o);
        try {
            this.startActivityForResult(intent, 40962);
        }
        catch (final ActivityNotFoundException ex) {
            this.n = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            this.i(17);
        }
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return true;
    }
    
    @Override
    protected final void onActivityResult(int n, int intExtra, final Intent l) {
        if (this.n) {
            return;
        }
        this.setResult(0);
        switch (n) {
            default: {
                return;
            }
            case 40962: {
                if (l != null) {
                    final SignInAccount signInAccount = (SignInAccount)l.getParcelableExtra("signInAccount");
                    if (signInAccount != null) {
                        final GoogleSignInAccount b = signInAccount.b;
                        if (b != null) {
                            jot.c((Context)this).e(this.o.b, b);
                            l.removeExtra("signInAccount");
                            l.putExtra("googleSignInAccount", (Parcelable)b);
                            this.p = true;
                            this.k = intExtra;
                            this.l = l;
                            this.h();
                            return;
                        }
                    }
                    if (l.hasExtra("errorCode")) {
                        intExtra = l.getIntExtra("errorCode", 8);
                        if ((n = intExtra) == 13) {
                            n = 12501;
                        }
                        this.i(n);
                        return;
                    }
                }
                this.i(8);
            }
        }
    }
    
    @Override
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Intent intent = this.getIntent();
        final String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            this.i(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            final String value = String.valueOf(intent.getAction());
            String concat;
            if (value.length() != 0) {
                concat = "Unknown action: ".concat(value);
            }
            else {
                concat = new String("Unknown action: ");
            }
            Log.e("AuthSignInClient", concat);
            this.finish();
            return;
        }
        final Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        final SignInConfiguration o = (SignInConfiguration)bundleExtra.getParcelable("config");
        if (o == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            this.setResult(0);
            this.finish();
            return;
        }
        this.o = o;
        if (bundle != null) {
            final boolean boolean1 = bundle.getBoolean("signingInGoogleApiClients");
            this.p = boolean1;
            if (boolean1) {
                this.k = bundle.getInt("signInResultCode");
                final Intent l = (Intent)bundle.getParcelable("signInResultData");
                l.getClass();
                this.l = l;
                this.h();
            }
            return;
        }
        if (SignInHubActivity.m) {
            this.setResult(0);
            this.i(12502);
            return;
        }
        SignInHubActivity.m = true;
        this.m(action);
    }
    
    public final void onDestroy() {
        super.onDestroy();
        SignInHubActivity.m = false;
    }
    
    @Override
    protected final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.p);
        if (this.p) {
            bundle.putInt("signInResultCode", this.k);
            bundle.putParcelable("signInResultData", (Parcelable)this.l);
        }
    }
}
