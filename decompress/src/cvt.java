import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class cvt implements View$OnClickListener
{
    final /* synthetic */ cvu a;
    private final /* synthetic */ int b;
    
    public cvt(final cvu a) {
        this.a = a;
    }
    
    public cvt(final cvu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final View view) {
        switch (this.b) {
            default: {
                final Intent intent = new Intent();
                intent.setClassName(this.a.a, "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity");
                ((cvv)this.a.h.c()).a();
                this.a.b.g(intent);
                return;
            }
            case 0: {
                njo.o(this.a.h.g());
                this.a.d.a();
                ((cvv)this.a.h.c()).a();
            }
        }
    }
}
