// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.moments;

import java.util.Collection;
import android.hardware.HardwareBuffer;

public class MomentsUtils
{
    public static oey a(final kvs kvs) {
        final ofn f = ofn.f();
        kvs.j(new ftw(f));
        return f;
    }
    
    public static native HardwareBuffer allocateHardwareBuffer(final int p0, final int p1, final int p2, final int p3, final long p4);
    
    public static boolean b(final fqa fqa, final gzu gzu, final Collection collection) {
        if (!fqa.f().g() && !fqa.e().g()) {
            return false;
        }
        if (collection.size() <= 0) {
            return true;
        }
        if (fqa.f().g()) {
            final int length = ((hat)fqa.f().c()).a.length;
        }
        return fqa.a() >= 0.0f && gzu.a(fqa.d(), collection, true).a > 0.07f;
    }
    
    public static boolean c(final fqa fqa, final float n, final gzu gzu, final Collection collection) {
        if (collection.size() < 2) {
            return true;
        }
        if (fqa.f().g()) {
            final int length = ((hat)fqa.f().c()).a.length;
        }
        return fqa.a() - n >= -0.02f && gzu.a(fqa.d(), collection, false).a > 0.07f;
    }
}
