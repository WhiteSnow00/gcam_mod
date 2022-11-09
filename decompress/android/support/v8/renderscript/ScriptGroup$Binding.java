// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

public final class ScriptGroup$Binding
{
    private final Script$FieldID mField;
    private final Object mValue;
    
    public ScriptGroup$Binding(final Script$FieldID mField, final Object mValue) {
        this.mField = mField;
        this.mValue = mValue;
    }
    
    public Script$FieldID getField() {
        return this.mField;
    }
    
    public Object getValue() {
        return this.mValue;
    }
}
