// 
// Decompiled by Procyon v0.6.0
// 

public final class cqy
{
    public final int a;
    public final int b;
    public final int c;
    public final lfu d;
    public final int e;
    public final int f;
    
    public cqy() {
    }
    
    public cqy(final int a, final int b, final int c, final lfu d, final int e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof cqy) {
            final cqy cqy = (cqy)o;
            if (this.a == cqy.a && this.b == cqy.b && this.c == cqy.c && this.d.equals(cqy.d)) {
                final int e = this.e;
                final int e2 = cqy.e;
                if (e == 0) {
                    throw null;
                }
                if (e == e2) {
                    final int f = this.f;
                    final int f2 = cqy.f;
                    if (f == 0) {
                        throw null;
                    }
                    if (f == f2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final int hashCode = this.d.hashCode();
        final int e = this.e;
        if (e == 0) {
            throw null;
        }
        final int f = this.f;
        if (f != 0) {
            return (((((a ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ c) * 1000003 ^ hashCode) * 1000003 ^ e) * 1000003 ^ f;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final String value = String.valueOf(this.d);
        final String a2 = cqx.a(this.e);
        final String a3 = cqw.a(this.f);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 168 + a2.length() + a3.length());
        sb.append("VideoCaptureSessionMetadata{creationLatencyMs=");
        sb.append(a);
        sb.append(", sessionDurationMs=");
        sb.append(b);
        sb.append(", numRecordedSessions=");
        sb.append(c);
        sb.append(", cameraFacing=");
        sb.append(value);
        sb.append(", sessionState=");
        sb.append(a2);
        sb.append(", sessionSource=");
        sb.append(a3);
        sb.append("}");
        return sb.toString();
    }
}
