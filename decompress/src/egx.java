import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.apps.camera.jni.facebeautification.FaceInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egx extends FaceInfo
{
    private final Rect a;
    private final Point b;
    private final Point c;
    
    public egx(final Rect a, final Point b, final Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Rect bounds() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof FaceInfo) {
            final FaceInfo faceInfo = (FaceInfo)o;
            if (this.a.equals((Object)faceInfo.bounds())) {
                final Point b = this.b;
                if (b == null) {
                    if (faceInfo.leftEye() != null) {
                        return false;
                    }
                }
                else if (!b.equals((Object)faceInfo.leftEye())) {
                    return false;
                }
                final Point c = this.c;
                Label_0099: {
                    if (c == null) {
                        if (faceInfo.rightEye() == null) {
                            break Label_0099;
                        }
                    }
                    else if (c.equals((Object)faceInfo.rightEye())) {
                        break Label_0099;
                    }
                    return false;
                }
                if (faceInfo.noseTip() == null && faceInfo.mouthCenter() == null && faceInfo.leftEarTragion() == null && faceInfo.rightEarTragion() == null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Point b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Point c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode2) * 1525764945;
    }
    
    @Override
    public final Point leftEarTragion() {
        return null;
    }
    
    @Override
    public final Point leftEye() {
        return this.b;
    }
    
    @Override
    public final Point mouthCenter() {
        return null;
    }
    
    @Override
    public final Point noseTip() {
        return null;
    }
    
    @Override
    public final Point rightEarTragion() {
        return null;
    }
    
    @Override
    public final Point rightEye() {
        return this.c;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf((Object)null);
        final String value5 = String.valueOf((Object)null);
        final String value6 = String.valueOf((Object)null);
        final String value7 = String.valueOf((Object)null);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 97 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf(value6).length() + String.valueOf(value7).length());
        sb.append("FaceInfo{bounds=");
        sb.append(value);
        sb.append(", leftEye=");
        sb.append(value2);
        sb.append(", rightEye=");
        sb.append(value3);
        sb.append(", noseTip=");
        sb.append(value4);
        sb.append(", mouthCenter=");
        sb.append(value5);
        sb.append(", leftEarTragion=");
        sb.append(value6);
        sb.append(", rightEarTragion=");
        sb.append(value7);
        sb.append("}");
        return sb.toString();
    }
}
