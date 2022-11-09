import android.hardware.camera2.CaptureFailure;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lem
{
    private final CaptureFailure a;
    
    public lem(final CaptureFailure a) {
        this.a = a;
    }
    
    public final int a() {
        return this.a.getReason();
    }
    
    public final long b() {
        return this.a.getFrameNumber();
    }
    
    public final boolean c() {
        return this.a.wasImageCaptured();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("frame number=");
        sb.append(this.b());
        sb.append(", reason=");
        sb.append(this.a());
        sb.append(", wasImageCaptured=");
        sb.append(this.c());
        sb.append(", sequenceId=");
        sb.append(this.a.getSequenceId());
        return sb.toString();
    }
}
