// 
// Decompiled by Procyon v0.6.0
// 

final class lww implements Runnable
{
    final /* synthetic */ lxh a;
    final /* synthetic */ lvm b;
    
    public lww(final lxh a, final lvm b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        if (this.a.a != null) {
            return;
        }
        throw njt.a(this.a.b);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 24 + String.valueOf(value2).length());
        sb.append(value);
        sb.append("finallyHandleException[");
        sb.append(value2);
        sb.append("]");
        return sb.toString();
    }
}
