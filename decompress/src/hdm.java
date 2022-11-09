import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdm implements exn, exe, exl, exm, exb
{
    public final krr a;
    public boolean b;
    boolean c;
    private final Context d;
    private final bnv e;
    private boolean f;
    private final BroadcastReceiver g;
    private final BroadcastReceiver h;
    private final BroadcastReceiver i;
    
    public hdm(final Context d, final bnv e, final krq krq) {
        this.b = false;
        this.c = false;
        this.g = new hdj(this);
        this.h = new hdk(this);
        this.i = new hdl(this);
        this.d = d;
        this.e = e;
        this.a = krq.a("ActivityCloseSec");
        this.f = false;
    }
    
    @Override
    public final void F() {
        if (!this.f) {
            this.a.f("Attaching secure activity shutdown receivers.");
            this.d.registerReceiver(this.h, new IntentFilter("android.intent.action.SCREEN_OFF"));
            this.d.registerReceiver(this.g, new IntentFilter("android.intent.action.SCREEN_ON"));
            this.d.registerReceiver(this.i, new IntentFilter("android.intent.action.USER_PRESENT"));
            this.f = true;
        }
    }
    
    public final void b() {
        if (this.f) {
            this.a.b("Detaching secure activity shutdown receivers.");
            try {
                this.d.unregisterReceiver(this.h);
            }
            catch (final IllegalArgumentException ex) {
                final krr a = this.a;
                final String value = String.valueOf(ex.getMessage());
                String concat;
                if (value.length() != 0) {
                    concat = "unregisterReceiver screenOffReceiver fail".concat(value);
                }
                else {
                    concat = new String("unregisterReceiver screenOffReceiver fail");
                }
                a.f(concat);
            }
            try {
                this.d.unregisterReceiver(this.g);
            }
            catch (final IllegalArgumentException ex2) {
                final krr a2 = this.a;
                final String value2 = String.valueOf(ex2.getMessage());
                String concat2;
                if (value2.length() != 0) {
                    concat2 = "unregisterReceiver screenOnReceiver fail".concat(value2);
                }
                else {
                    concat2 = new String("unregisterReceiver screenOnReceiver fail");
                }
                a2.f(concat2);
            }
            try {
                this.d.unregisterReceiver(this.i);
            }
            catch (final IllegalArgumentException ex3) {
                final krr a3 = this.a;
                final String value3 = String.valueOf(ex3.getMessage());
                String concat3;
                if (value3.length() != 0) {
                    concat3 = "unregisterReceiver userUnlockReceiver fail".concat(value3);
                }
                else {
                    concat3 = new String("unregisterReceiver userUnlockReceiver fail");
                }
                a3.f(concat3);
            }
            this.f = false;
        }
    }
    
    @Override
    public final void bh() {
        this.b();
    }
    
    @Override
    public final void bk() {
        this.b = true;
    }
    
    public final void c(final String s) {
        this.b();
        this.e.a(s);
    }
    
    @Override
    public final void e() {
        this.b = false;
        if (this.c) {
            this.c("Already received ScreenOff broadcast so closing the activity.");
        }
    }
}
