import android.app.PendingIntent;
import android.os.Bundle;
import android.content.Context;
import android.os.Parcelable;
import android.content.Intent;
import android.content.ComponentName;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ui extends Activity
{
    private ComponentName a;
    private int b;
    private int[] c;
    
    private final void a() {
        final ComponentName a = this.a;
        final int b = this.b;
        final int[] c = this.c;
        final Intent intent = new Intent("com.google.android.clockwork.home.complications.ACTION_CHOOSE_PROVIDER");
        intent.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME", (Parcelable)a);
        intent.putExtra("android.support.wearable.complications.EXTRA_COMPLICATION_ID", b);
        intent.putExtra("android.support.wearable.complications.EXTRA_SUPPORTED_TYPES", c);
        this.startActivityForResult(intent, 1);
    }
    
    private final boolean b() {
        return zv.s((Context)this, "com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA_PRIVILEGED") == 0 || zv.s((Context)this, "com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA") == 0;
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n == 1) {
            this.setResult(n2, intent);
            this.finish();
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        this.setTheme(16973840);
        super.onCreate(bundle);
        final Intent intent = this.getIntent();
        final String action = intent.getAction();
        int n = 0;
        Label_0085: {
            switch (action.hashCode()) {
                case 1414879715: {
                    if (action.equals("android.support.wearable.complications.ACTION_START_PROVIDER_CHOOSER")) {
                        n = 0;
                        break Label_0085;
                    }
                    break;
                }
                case -121457581: {
                    if (action.equals("android.support.wearable.complications.ACTION_PERMISSION_REQUEST_ONLY")) {
                        n = 1;
                        break Label_0085;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                throw new IllegalStateException("Unrecognised intent action.");
            }
            case 1: {
                this.a = (ComponentName)intent.getParcelableExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME");
                if (this.b()) {
                    this.finish();
                    return;
                }
                zv.t(this, new String[] { "com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA" }, 2);
                return;
            }
            case 0: {
                this.a = (ComponentName)intent.getParcelableExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME");
                this.b = intent.getIntExtra("android.support.wearable.complications.EXTRA_COMPLICATION_ID", 0);
                this.c = intent.getIntArrayExtra("android.support.wearable.complications.EXTRA_SUPPORTED_TYPES");
                if (this.b()) {
                    this.a();
                    return;
                }
                zv.t(this, new String[] { "com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA" }, 1);
            }
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        if (array2.length == 0) {
            return;
        }
        if (array2[0] == 0) {
            if (n == 1) {
                this.a();
            }
            else {
                this.finish();
            }
            final ComponentName a = this.a;
            final Intent intent = new Intent("android.support.wearable.complications.ACTION_REQUEST_UPDATE_ALL_ACTIVE");
            intent.setPackage("com.google.android.wearable.app");
            intent.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT", (Parcelable)a);
            intent.putExtra("android.support.wearable.complications.EXTRA_PENDING_INTENT", (Parcelable)PendingIntent.getActivity((Context)this, 0, new Intent(""), 0));
            this.sendBroadcast(intent);
            return;
        }
        this.finish();
    }
}
