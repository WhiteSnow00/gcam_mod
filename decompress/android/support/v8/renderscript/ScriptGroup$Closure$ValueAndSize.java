// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

final class ScriptGroup$Closure$ValueAndSize
{
    public int size;
    public long value;
    
    public ScriptGroup$Closure$ValueAndSize(final RenderScript renderScript, final Object o) {
        if (o instanceof Allocation) {
            this.value = ((Allocation)o).getID(renderScript);
            this.size = -1;
            return;
        }
        if (o instanceof Boolean) {
            long value;
            if (!(boolean)o) {
                value = 0L;
            }
            else {
                value = 1L;
            }
            this.value = value;
            this.size = 4;
            return;
        }
        if (o instanceof Integer) {
            this.value = (long)o;
            this.size = 4;
            return;
        }
        if (o instanceof Long) {
            this.value = (long)o;
            this.size = 8;
            return;
        }
        if (o instanceof Float) {
            this.value = Float.floatToRawIntBits((float)o);
            this.size = 4;
            return;
        }
        if (o instanceof Double) {
            this.value = Double.doubleToRawLongBits((double)o);
            this.size = 8;
        }
    }
}
