import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmv
{
    private final hkd a;
    private final bmq b;
    
    public bmv(final bmq b, final hkd a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        final Intent a = this.b.a();
        if (a != null && a.hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE")) {
            if (bmx.m(a)) {
                this.a.d(hjq.j, bmx.c(a).d);
                return;
            }
            this.a.d(hjq.i, bmx.c(a).d);
        }
    }
}
