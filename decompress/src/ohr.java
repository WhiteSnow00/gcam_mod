import android.hardware.HardwareBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ohr
{
    public final Object a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final Runnable e;
    public final Runnable f;
    
    public ohr(final lju lju, final HardwareBuffer hardwareBuffer) {
        this.a = new Object();
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = new ohq(this, lju);
        this.f = new ohp(this, hardwareBuffer, lju);
    }
}
