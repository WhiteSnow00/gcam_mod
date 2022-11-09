// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

import java.util.Comparator;

class ScriptGroup$Builder$1 implements Comparator
{
    final /* synthetic */ ScriptGroup$Builder this$0;
    
    public ScriptGroup$Builder$1(final ScriptGroup$Builder this$0) {
        this.this$0 = this$0;
    }
    
    public int compare(final ScriptGroup$Node scriptGroup$Node, final ScriptGroup$Node scriptGroup$Node2) {
        return scriptGroup$Node.mOrder - scriptGroup$Node2.mOrder;
    }
}
