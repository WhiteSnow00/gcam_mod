// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public final class ScriptGroup$Future
{
    ScriptGroup$Closure mClosure;
    Script$FieldID mFieldID;
    Object mValue;
    
    public ScriptGroup$Future(final ScriptGroup$Closure mClosure, final Script$FieldID mFieldID, final Object mValue) {
        this.mClosure = mClosure;
        this.mFieldID = mFieldID;
        this.mValue = mValue;
    }
    
    public ScriptGroup$Closure getClosure() {
        return this.mClosure;
    }
    
    public Script$FieldID getFieldID() {
        return this.mFieldID;
    }
    
    public Object getValue() {
        return this.mValue;
    }
}
