// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.library.api;

public final class ObjectWrapper extends bjf
{
    private final Object wrappedObject;
    
    private ObjectWrapper(final Object wrappedObject) {
        super("com.google.vr.vrcore.library.api.IObjectWrapper");
        this.wrappedObject = wrappedObject;
    }
    
    public static bjf b(final Object o) {
        return new ObjectWrapper(o);
    }
}
