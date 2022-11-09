// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

class ScriptGroup$ConnectLine
{
    Allocation mAllocation;
    Type mAllocationType;
    Script$KernelID mFrom;
    Script$FieldID mToF;
    Script$KernelID mToK;
    
    public ScriptGroup$ConnectLine(final Type mAllocationType, final Script$KernelID mFrom, final Script$FieldID mToF) {
        this.mFrom = mFrom;
        this.mToF = mToF;
        this.mAllocationType = mAllocationType;
    }
    
    public ScriptGroup$ConnectLine(final Type mAllocationType, final Script$KernelID mFrom, final Script$KernelID mToK) {
        this.mFrom = mFrom;
        this.mToK = mToK;
        this.mAllocationType = mAllocationType;
    }
}
