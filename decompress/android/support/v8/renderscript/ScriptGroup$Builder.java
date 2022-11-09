// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

@Deprecated
public final class ScriptGroup$Builder
{
    private int mKernelCount;
    private ArrayList mLines;
    private ArrayList mNodes;
    private RenderScript mRS;
    private boolean mUseIncSupp;
    
    public ScriptGroup$Builder(final RenderScript mrs) {
        this.mNodes = new ArrayList();
        this.mLines = new ArrayList();
        this.mUseIncSupp = false;
        this.mRS = mrs;
    }
    
    private boolean calcOrder() {
        final ArrayList mNodes = this.mNodes;
        final int size = mNodes.size();
        int i = 0;
        int n = 1;
        while (i < size) {
            final ScriptGroup$Node scriptGroup$Node = (ScriptGroup$Node)mNodes.get(i);
            int n2 = n;
            if (scriptGroup$Node.mInputs.size() == 0) {
                final ArrayList mNodes2 = this.mNodes;
                for (int size2 = mNodes2.size(), j = 0; j < size2; ++j) {
                    ((ScriptGroup$Node)mNodes2.get(j)).mSeen = false;
                }
                n2 = (n & (this.calcOrderRecurse(scriptGroup$Node, 1) ? 1 : 0));
            }
            ++i;
            n = n2;
        }
        Collections.sort((List<Object>)this.mNodes, new ScriptGroup$Builder$1(this));
        return n != 0;
    }
    
    private boolean calcOrderRecurse(final ScriptGroup$Node scriptGroup$Node, int i) {
        scriptGroup$Node.mSeen = true;
        if (scriptGroup$Node.mOrder < i) {
            scriptGroup$Node.mOrder = i;
        }
        final ArrayList mOutputs = scriptGroup$Node.mOutputs;
        final int size = mOutputs.size();
        i = 0;
        boolean b = true;
        while (i < size) {
            final ScriptGroup$ConnectLine scriptGroup$ConnectLine = (ScriptGroup$ConnectLine)mOutputs.get(i);
            final Script$FieldID mToF = scriptGroup$ConnectLine.mToF;
            ScriptGroup$Node scriptGroup$Node2;
            if (mToF != null) {
                scriptGroup$Node2 = this.findNode(mToF.mScript);
            }
            else {
                scriptGroup$Node2 = this.findNode(scriptGroup$ConnectLine.mToK.mScript);
            }
            if (scriptGroup$Node2.mSeen) {
                return false;
            }
            b &= this.calcOrderRecurse(scriptGroup$Node2, scriptGroup$Node.mOrder + 1);
            ++i;
        }
        return b;
    }
    
    private ScriptGroup$Node findNode(final Script$KernelID script$KernelID) {
        for (int i = 0; i < this.mNodes.size(); ++i) {
            final ScriptGroup$Node scriptGroup$Node = this.mNodes.get(i);
            for (int j = 0; j < scriptGroup$Node.mKernels.size(); ++j) {
                if (script$KernelID == scriptGroup$Node.mKernels.get(j)) {
                    return scriptGroup$Node;
                }
            }
        }
        return null;
    }
    
    private ScriptGroup$Node findNode(final Script script) {
        for (int i = 0; i < this.mNodes.size(); ++i) {
            if (script == ((ScriptGroup$Node)this.mNodes.get(i)).mScript) {
                return (ScriptGroup$Node)this.mNodes.get(i);
            }
        }
        return null;
    }
    
    private void mergeDAGs(final int dagNumber, final int n) {
        for (int i = 0; i < this.mNodes.size(); ++i) {
            if (((ScriptGroup$Node)this.mNodes.get(i)).dagNumber == n) {
                ((ScriptGroup$Node)this.mNodes.get(i)).dagNumber = dagNumber;
            }
        }
    }
    
    private void validateCycle(final ScriptGroup$Node scriptGroup$Node, final ScriptGroup$Node scriptGroup$Node2) {
        for (int i = 0; i < scriptGroup$Node.mOutputs.size(); ++i) {
            final ScriptGroup$ConnectLine scriptGroup$ConnectLine = scriptGroup$Node.mOutputs.get(i);
            final Script$KernelID mToK = scriptGroup$ConnectLine.mToK;
            if (mToK != null) {
                final ScriptGroup$Node node = this.findNode(mToK.mScript);
                if (node.equals(scriptGroup$Node2)) {
                    throw new RSInvalidStateException("Loops in group not allowed.");
                }
                this.validateCycle(node, scriptGroup$Node2);
            }
            final Script$FieldID mToF = scriptGroup$ConnectLine.mToF;
            if (mToF != null) {
                final ScriptGroup$Node node2 = this.findNode(mToF.mScript);
                if (node2.equals(scriptGroup$Node2)) {
                    throw new RSInvalidStateException("Loops in group not allowed.");
                }
                this.validateCycle(node2, scriptGroup$Node2);
            }
        }
    }
    
    private void validateDAG() {
        final int n = 0;
        for (int i = 0; i < this.mNodes.size(); ++i) {
            final ScriptGroup$Node scriptGroup$Node = this.mNodes.get(i);
            if (scriptGroup$Node.mInputs.size() == 0) {
                if (scriptGroup$Node.mOutputs.size() == 0 && this.mNodes.size() > 1) {
                    throw new RSInvalidStateException("Groups cannot contain unconnected scripts");
                }
                this.validateDAGRecurse(scriptGroup$Node, i + 1);
            }
        }
        final int dagNumber = this.mNodes.get(0).dagNumber;
        for (int j = n; j < this.mNodes.size(); ++j) {
            if (((ScriptGroup$Node)this.mNodes.get(j)).dagNumber != dagNumber) {
                throw new RSInvalidStateException("Multiple DAGs in group not allowed.");
            }
        }
    }
    
    private void validateDAGRecurse(final ScriptGroup$Node scriptGroup$Node, final int dagNumber) {
        final int dagNumber2 = scriptGroup$Node.dagNumber;
        if (dagNumber2 != 0 && dagNumber2 != dagNumber) {
            this.mergeDAGs(dagNumber2, dagNumber);
            return;
        }
        scriptGroup$Node.dagNumber = dagNumber;
        for (int i = 0; i < scriptGroup$Node.mOutputs.size(); ++i) {
            final ScriptGroup$ConnectLine scriptGroup$ConnectLine = scriptGroup$Node.mOutputs.get(i);
            final Script$KernelID mToK = scriptGroup$ConnectLine.mToK;
            if (mToK != null) {
                this.validateDAGRecurse(this.findNode(mToK.mScript), dagNumber);
            }
            final Script$FieldID mToF = scriptGroup$ConnectLine.mToF;
            if (mToF != null) {
                this.validateDAGRecurse(this.findNode(mToF.mScript), dagNumber);
            }
        }
    }
    
    public ScriptGroup$Builder addConnection(final Type type, final Script$KernelID script$KernelID, final Script$FieldID script$FieldID) {
        final ScriptGroup$Node node = this.findNode(script$KernelID);
        if (node == null) {
            throw new RSInvalidStateException("From script not found.");
        }
        final ScriptGroup$Node node2 = this.findNode(script$FieldID.mScript);
        if (node2 != null) {
            final ScriptGroup$ConnectLine scriptGroup$ConnectLine = new ScriptGroup$ConnectLine(type, script$KernelID, script$FieldID);
            this.mLines.add(new ScriptGroup$ConnectLine(type, script$KernelID, script$FieldID));
            node.mOutputs.add(scriptGroup$ConnectLine);
            node2.mInputs.add(scriptGroup$ConnectLine);
            this.validateCycle(node, node);
            return this;
        }
        throw new RSInvalidStateException("To script not found.");
    }
    
    public ScriptGroup$Builder addConnection(final Type type, final Script$KernelID script$KernelID, final Script$KernelID script$KernelID2) {
        final ScriptGroup$Node node = this.findNode(script$KernelID);
        if (node == null) {
            throw new RSInvalidStateException("From script not found.");
        }
        final ScriptGroup$Node node2 = this.findNode(script$KernelID2);
        if (node2 != null) {
            final ScriptGroup$ConnectLine scriptGroup$ConnectLine = new ScriptGroup$ConnectLine(type, script$KernelID, script$KernelID2);
            this.mLines.add(new ScriptGroup$ConnectLine(type, script$KernelID, script$KernelID2));
            node.mOutputs.add(scriptGroup$ConnectLine);
            node2.mInputs.add(scriptGroup$ConnectLine);
            this.validateCycle(node, node);
            return this;
        }
        throw new RSInvalidStateException("To script not found.");
    }
    
    public ScriptGroup$Builder addKernel(final Script$KernelID script$KernelID) {
        if (this.mLines.size() != 0) {
            throw new RSInvalidStateException("Kernels may not be added once connections exist.");
        }
        if (script$KernelID.mScript.isIncSupp()) {
            this.mUseIncSupp = true;
        }
        if (this.findNode(script$KernelID) != null) {
            return this;
        }
        ++this.mKernelCount;
        ScriptGroup$Node node;
        if ((node = this.findNode(script$KernelID.mScript)) == null) {
            node = new ScriptGroup$Node(script$KernelID.mScript);
            this.mNodes.add(node);
        }
        node.mKernels.add(script$KernelID);
        return this;
    }
    
    public ScriptGroup create() {
        if (this.mNodes.size() == 0) {
            throw new RSInvalidStateException("Empty script groups are not allowed");
        }
        final int n = 0;
        for (int i = 0; i < this.mNodes.size(); ++i) {
            ((ScriptGroup$Node)this.mNodes.get(i)).dagNumber = 0;
        }
        this.validateDAG();
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final long[] array = new long[this.mKernelCount];
        int j = 0;
        int n2 = 0;
        while (j < this.mNodes.size()) {
            final ScriptGroup$Node scriptGroup$Node = this.mNodes.get(j);
            for (int k = 0; k < scriptGroup$Node.mKernels.size(); ++k, ++n2) {
                final Script$KernelID script$KernelID = scriptGroup$Node.mKernels.get(k);
                array[n2] = script$KernelID.getID(this.mRS);
                int l = 0;
                boolean b = false;
                while (l < scriptGroup$Node.mInputs.size()) {
                    b |= (scriptGroup$Node.mInputs.get(l).mToK != script$KernelID ^ true);
                    ++l;
                }
                int n3 = 0;
                boolean b2 = false;
                while (n3 < scriptGroup$Node.mOutputs.size()) {
                    b2 |= (scriptGroup$Node.mOutputs.get(n3).mFrom != script$KernelID ^ true);
                    ++n3;
                }
                if (!b) {
                    list.add(new ScriptGroup$IO(script$KernelID));
                }
                if (!b2) {
                    list2.add(new ScriptGroup$IO(script$KernelID));
                }
            }
            ++j;
        }
        if (n2 == this.mKernelCount) {
            final boolean mUseIncSupp = this.mUseIncSupp;
            long nScriptGroupCreate = 0L;
            if (!mUseIncSupp) {
                final long[] array2 = new long[this.mLines.size()];
                final long[] array3 = new long[this.mLines.size()];
                final long[] array4 = new long[this.mLines.size()];
                final long[] array5 = new long[this.mLines.size()];
                for (int n4 = 0; n4 < this.mLines.size(); ++n4) {
                    final ScriptGroup$ConnectLine scriptGroup$ConnectLine = this.mLines.get(n4);
                    array2[n4] = scriptGroup$ConnectLine.mFrom.getID(this.mRS);
                    final Script$KernelID mToK = scriptGroup$ConnectLine.mToK;
                    if (mToK != null) {
                        array3[n4] = mToK.getID(this.mRS);
                    }
                    final Script$FieldID mToF = scriptGroup$ConnectLine.mToF;
                    if (mToF != null) {
                        array4[n4] = mToF.getID(this.mRS);
                    }
                    array5[n4] = scriptGroup$ConnectLine.mAllocationType.getID(this.mRS);
                }
                nScriptGroupCreate = this.mRS.nScriptGroupCreate(array, array2, array3, array4, array5);
                if (nScriptGroupCreate == 0L) {
                    throw new RSRuntimeException("Object creation error, should not happen.");
                }
            }
            else {
                this.calcOrder();
            }
            final ScriptGroup scriptGroup = new ScriptGroup(nScriptGroupCreate, this.mRS);
            scriptGroup.mOutputs = new ScriptGroup$IO[list2.size()];
            for (int n5 = 0; n5 < list2.size(); ++n5) {
                scriptGroup.mOutputs[n5] = (ScriptGroup$IO)list2.get(n5);
            }
            scriptGroup.mInputs = new ScriptGroup$IO[list.size()];
            for (int n6 = n; n6 < list.size(); ++n6) {
                scriptGroup.mInputs[n6] = (ScriptGroup$IO)list.get(n6);
            }
            scriptGroup.mNodes = this.mNodes;
            scriptGroup.mUseIncSupp = this.mUseIncSupp;
            return scriptGroup;
        }
        throw new RSRuntimeException("Count mismatch, should not happen.");
    }
}
