// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public final class ScriptGroup$Builder2
{
    private static final String TAG = "ScriptGroup.Builder2";
    List mClosures;
    List mInputs;
    RenderScript mRS;
    
    public ScriptGroup$Builder2(final RenderScript mrs) {
        this.mRS = mrs;
        this.mClosures = new ArrayList();
        this.mInputs = new ArrayList();
    }
    
    private ScriptGroup$Closure addInvokeInternal(final Script$InvokeID script$InvokeID, final Object[] array, final Map map) {
        final ScriptGroup$Closure scriptGroup$Closure = new ScriptGroup$Closure(this.mRS, script$InvokeID, array, map);
        this.mClosures.add(scriptGroup$Closure);
        return scriptGroup$Closure;
    }
    
    private ScriptGroup$Closure addKernelInternal(final Script$KernelID script$KernelID, final Type type, final Object[] array, final Map map) {
        final ScriptGroup$Closure scriptGroup$Closure = new ScriptGroup$Closure(this.mRS, script$KernelID, type, array, map);
        this.mClosures.add(scriptGroup$Closure);
        return scriptGroup$Closure;
    }
    
    private boolean seperateArgsAndBindings(final Object[] array, final ArrayList list, final Map map) {
        int n = 0;
        int i;
        while (true) {
            i = n;
            if (n >= array.length) {
                break;
            }
            final Object o = array[n];
            i = n;
            if (o instanceof ScriptGroup$Binding) {
                break;
            }
            list.add(o);
            ++n;
        }
        while (i < array.length) {
            final Object o2 = array[i];
            if (!(o2 instanceof ScriptGroup$Binding)) {
                return false;
            }
            final ScriptGroup$Binding scriptGroup$Binding = (ScriptGroup$Binding)o2;
            map.put(scriptGroup$Binding.getField(), scriptGroup$Binding.getValue());
            ++i;
        }
        return true;
    }
    
    public ScriptGroup$Input addInput() {
        final ScriptGroup$Input scriptGroup$Input = new ScriptGroup$Input();
        this.mInputs.add(scriptGroup$Input);
        return scriptGroup$Input;
    }
    
    public ScriptGroup$Closure addInvoke(final Script$InvokeID script$InvokeID, final Object... array) {
        final ArrayList list = new ArrayList();
        final HashMap hashMap = new HashMap();
        if (!this.seperateArgsAndBindings(array, list, hashMap)) {
            return null;
        }
        return this.addInvokeInternal(script$InvokeID, list.toArray(), hashMap);
    }
    
    public ScriptGroup$Closure addKernel(final Script$KernelID script$KernelID, final Type type, final Object... array) {
        final ArrayList list = new ArrayList();
        final HashMap hashMap = new HashMap();
        if (!this.seperateArgsAndBindings(array, list, hashMap)) {
            return null;
        }
        return this.addKernelInternal(script$KernelID, type, list.toArray(), hashMap);
    }
    
    public ScriptGroup create(final String s, final ScriptGroup$Future... array) {
        if (s != null && !s.isEmpty() && s.length() <= 100 && s.equals(s.replaceAll("[^a-zA-Z0-9-]", "_"))) {
            return new ScriptGroup(this.mRS, s, this.mClosures, this.mInputs, array);
        }
        throw new RSIllegalArgumentException("invalid script group name");
    }
}
