// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

import java.util.Iterator;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

public final class ScriptGroup$Input
{
    List mArgIndex;
    List mFieldID;
    Object mValue;
    
    public ScriptGroup$Input() {
        this.mFieldID = new ArrayList();
        this.mArgIndex = new ArrayList();
    }
    
    public void addReference(final ScriptGroup$Closure scriptGroup$Closure, final int n) {
        this.mArgIndex.add(Pair.create((Object)scriptGroup$Closure, (Object)n));
    }
    
    public void addReference(final ScriptGroup$Closure scriptGroup$Closure, final Script$FieldID script$FieldID) {
        this.mFieldID.add(Pair.create((Object)scriptGroup$Closure, (Object)script$FieldID));
    }
    
    public Object get() {
        return this.mValue;
    }
    
    public void set(final Object mValue) {
        this.mValue = mValue;
        for (final Pair pair : this.mArgIndex) {
            ((ScriptGroup$Closure)pair.first).setArg((int)pair.second, mValue);
        }
        for (final Pair pair2 : this.mFieldID) {
            ((ScriptGroup$Closure)pair2.first).setGlobal((Script$FieldID)pair2.second, mValue);
        }
    }
}
