// 
// Decompiled by Procyon v0.6.0
// 

public final class cbj implements kpy
{
    private static final nsd a;
    private final dfz b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/CamcorderDeviceCallbackImpl");
    }
    
    public cbj(final dfz b) {
        this.b = b;
    }
    
    @Override
    public final void a() {
        a.l(cbj.a.b(), "onMediaRecorderError", '\u013f');
        this.b.f();
    }
}
