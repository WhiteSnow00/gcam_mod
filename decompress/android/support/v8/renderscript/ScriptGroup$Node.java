// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

import java.util.ArrayList;

class ScriptGroup$Node
{
    int dagNumber;
    ArrayList mInputs;
    ArrayList mKernels;
    ScriptGroup$Node mNext;
    int mOrder;
    ArrayList mOutputs;
    Script mScript;
    boolean mSeen;
    
    public ScriptGroup$Node(final Script mScript) {
        this.mKernels = new ArrayList();
        this.mInputs = new ArrayList();
        this.mOutputs = new ArrayList();
        this.mScript = mScript;
    }
}
