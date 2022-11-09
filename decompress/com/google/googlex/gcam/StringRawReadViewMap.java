// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class StringRawReadViewMap
{
    public transient long a;
    protected transient boolean b;
    
    public StringRawReadViewMap() {
        final long new_StringRawReadViewMap__SWIG_0 = GcamModuleJNI.new_StringRawReadViewMap__SWIG_0();
        this.b = true;
        this.a = new_StringRawReadViewMap__SWIG_0;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_StringRawReadViewMap(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void b(final String s, final RawReadView rawReadView) {
        GcamModuleJNI.StringRawReadViewMap_set(this.a, this, s, RawReadView.b(rawReadView), rawReadView);
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
