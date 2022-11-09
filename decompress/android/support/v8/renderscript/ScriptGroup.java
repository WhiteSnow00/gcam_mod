// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class ScriptGroup extends BaseObj
{
    private static final int MIN_API_VERSION = 23;
    private static final String TAG = "ScriptGroup";
    private List mClosures;
    ScriptGroup$IO[] mInputs;
    private List mInputs2;
    private String mName;
    private ArrayList mNodes;
    ScriptGroup$IO[] mOutputs;
    private ScriptGroup$Future[] mOutputs2;
    private boolean mUseIncSupp;
    
    public ScriptGroup(final long n, final RenderScript renderScript) {
        super(n, renderScript);
        this.mUseIncSupp = false;
        this.mNodes = new ArrayList();
    }
    
    public ScriptGroup(final RenderScript renderScript, final String mName, final List mClosures, final List mInputs2, final ScriptGroup$Future[] mOutputs2) {
        super(0L, renderScript);
        int i = 0;
        this.mUseIncSupp = false;
        this.mNodes = new ArrayList();
        this.mName = mName;
        this.mClosures = mClosures;
        this.mInputs2 = mInputs2;
        this.mOutputs2 = mOutputs2;
        final int size = mClosures.size();
        final long[] array = new long[size];
        while (i < size) {
            array[i] = mClosures.get(i).getID(renderScript);
            ++i;
        }
        this.setID(renderScript.nScriptGroup2Create(mName, renderScript.getApplicationContext().getCacheDir().toString(), array));
    }
    
    @Deprecated
    public void execute() {
        if (this.mUseIncSupp) {
            for (int i = 0; i < this.mNodes.size(); ++i) {
                final ScriptGroup$Node scriptGroup$Node = this.mNodes.get(i);
                for (int j = 0; j < scriptGroup$Node.mOutputs.size(); ++j) {
                    final ScriptGroup$ConnectLine scriptGroup$ConnectLine = scriptGroup$Node.mOutputs.get(j);
                    if (scriptGroup$ConnectLine.mAllocation == null) {
                        final Allocation typed = Allocation.createTyped(this.mRS, scriptGroup$ConnectLine.mAllocationType, Allocation$MipmapControl.MIPMAP_NONE, 1);
                        scriptGroup$ConnectLine.mAllocation = typed;
                        for (int k = j + 1; k < scriptGroup$Node.mOutputs.size(); ++k) {
                            if (((ScriptGroup$ConnectLine)scriptGroup$Node.mOutputs.get(k)).mFrom == scriptGroup$ConnectLine.mFrom) {
                                ((ScriptGroup$ConnectLine)scriptGroup$Node.mOutputs.get(k)).mAllocation = typed;
                            }
                        }
                    }
                }
            }
            final ArrayList mNodes = this.mNodes;
            for (int size = mNodes.size(), l = 0; l < size; ++l) {
                final ScriptGroup$Node scriptGroup$Node2 = (ScriptGroup$Node)mNodes.get(l);
                final ArrayList mKernels = scriptGroup$Node2.mKernels;
                for (int size2 = mKernels.size(), n = 0; n < size2; ++n) {
                    final Script$KernelID script$KernelID = (Script$KernelID)mKernels.get(n);
                    final ArrayList mInputs = scriptGroup$Node2.mInputs;
                    final int size3 = mInputs.size();
                    int n2 = 0;
                    Allocation mAllocation = null;
                    while (n2 < size3) {
                        final ScriptGroup$ConnectLine scriptGroup$ConnectLine2 = (ScriptGroup$ConnectLine)mInputs.get(n2);
                        if (scriptGroup$ConnectLine2.mToK == script$KernelID) {
                            mAllocation = scriptGroup$ConnectLine2.mAllocation;
                        }
                        ++n2;
                    }
                    final ScriptGroup$IO[] mInputs2 = this.mInputs;
                    final int length = mInputs2.length;
                    int n3 = 0;
                    Allocation mAllocation2 = mAllocation;
                    while (n3 < length) {
                        final ScriptGroup$IO scriptGroup$IO = mInputs2[n3];
                        if (scriptGroup$IO.mKID == script$KernelID) {
                            mAllocation2 = scriptGroup$IO.mAllocation;
                        }
                        ++n3;
                    }
                    final ArrayList mOutputs = scriptGroup$Node2.mOutputs;
                    final int size4 = mOutputs.size();
                    int n4 = 0;
                    Allocation allocation = null;
                    while (n4 < size4) {
                        final ScriptGroup$ConnectLine scriptGroup$ConnectLine3 = (ScriptGroup$ConnectLine)mOutputs.get(n4);
                        if (scriptGroup$ConnectLine3.mFrom == script$KernelID) {
                            allocation = scriptGroup$ConnectLine3.mAllocation;
                        }
                        ++n4;
                    }
                    for (final ScriptGroup$IO scriptGroup$IO2 : this.mOutputs) {
                        if (scriptGroup$IO2.mKID == script$KernelID) {
                            allocation = scriptGroup$IO2.mAllocation;
                        }
                    }
                    script$KernelID.mScript.forEach(script$KernelID.mSlot, mAllocation2, allocation, null);
                }
            }
            return;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptGroupExecute(this.getID(mrs));
    }
    
    public Object[] execute(final Object... array) {
        final int length = array.length;
        if (length < this.mInputs2.size()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.toString());
            sb.append(" receives ");
            sb.append(length);
            sb.append(" inputs, less than expected ");
            sb.append(this.mInputs2.size());
            Log.e("ScriptGroup", sb.toString());
            return null;
        }
        final int size = this.mInputs2.size();
        final int n = 0;
        int i;
        if (length > size) {
            this.toString();
            this.mInputs2.size();
            i = 0;
        }
        else {
            i = 0;
        }
        while (i < this.mInputs2.size()) {
            final Object o = array[i];
            if (o instanceof ScriptGroup$Future || o instanceof ScriptGroup$Input) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(this.toString());
                sb2.append(": input ");
                sb2.append(i);
                sb2.append(" is a future or unbound value");
                Log.e("ScriptGroup", sb2.toString());
                return null;
            }
            this.mInputs2.get(i).set(o);
            ++i;
        }
        final RenderScript mrs = this.mRS;
        mrs.nScriptGroup2Execute(this.getID(mrs));
        final ScriptGroup$Future[] mOutputs2 = this.mOutputs2;
        final int length2 = mOutputs2.length;
        final Object[] array2 = new Object[length2];
        final int n2 = 0;
        for (int j = n, n3 = n2; j < length2; ++j, ++n3) {
            Object o3;
            final Object o2 = o3 = mOutputs2[j].getValue();
            if (o2 instanceof ScriptGroup$Input) {
                o3 = ((ScriptGroup$Input)o2).get();
            }
            array2[n3] = o3;
        }
        return array2;
    }
    
    @Deprecated
    public void setInput(final Script$KernelID script$KernelID, final Allocation mAllocation) {
        int n = 0;
        while (true) {
            final ScriptGroup$IO[] mInputs = this.mInputs;
            if (n >= mInputs.length) {
                throw new RSIllegalArgumentException("Script not found");
            }
            final ScriptGroup$IO scriptGroup$IO = mInputs[n];
            if (scriptGroup$IO.mKID == script$KernelID) {
                scriptGroup$IO.mAllocation = mAllocation;
                if (!this.mUseIncSupp) {
                    final RenderScript mrs = this.mRS;
                    mrs.nScriptGroupSetInput(this.getID(mrs), script$KernelID.getID(this.mRS), this.mRS.safeID(mAllocation));
                }
                return;
            }
            ++n;
        }
    }
    
    @Deprecated
    public void setOutput(final Script$KernelID script$KernelID, final Allocation mAllocation) {
        int n = 0;
        while (true) {
            final ScriptGroup$IO[] mOutputs = this.mOutputs;
            if (n >= mOutputs.length) {
                throw new RSIllegalArgumentException("Script not found");
            }
            final ScriptGroup$IO scriptGroup$IO = mOutputs[n];
            if (scriptGroup$IO.mKID == script$KernelID) {
                scriptGroup$IO.mAllocation = mAllocation;
                if (!this.mUseIncSupp) {
                    final RenderScript mrs = this.mRS;
                    mrs.nScriptGroupSetOutput(this.getID(mrs), script$KernelID.getID(this.mRS), this.mRS.safeID(mAllocation));
                }
                return;
            }
            ++n;
        }
    }
}
