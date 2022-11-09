// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public final class ScriptGroup$Closure extends BaseObj
{
    private static final String TAG = "Closure";
    private Object[] mArgs;
    private Map mBindings;
    private FieldPacker mFP;
    private Map mGlobalFuture;
    private ScriptGroup$Future mReturnFuture;
    private Allocation mReturnValue;
    
    public ScriptGroup$Closure(final long n, final RenderScript renderScript) {
        super(n, renderScript);
    }
    
    public ScriptGroup$Closure(final RenderScript renderScript, final Script$InvokeID script$InvokeID, final Object[] mArgs, final Map mBindings) {
        super(0L, renderScript);
        this.mFP = FieldPacker.createFromArray(mArgs);
        this.mArgs = mArgs;
        this.mBindings = mBindings;
        this.mGlobalFuture = new HashMap();
        final int size = mBindings.size();
        final long[] array = new long[size];
        final long[] array2 = new long[size];
        final int[] array3 = new int[size];
        final long[] array4 = new long[size];
        final long[] array5 = new long[size];
        final Iterator iterator = mBindings.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<K, Object> entry = (Map.Entry<K, Object>)iterator.next();
            final Object value = entry.getValue();
            final Script$FieldID script$FieldID = (Script$FieldID)entry.getKey();
            array[n] = script$FieldID.getID(renderScript);
            this.retrieveValueAndDependenceInfo(renderScript, n, script$FieldID, value, array2, array3, array4, array5);
            ++n;
        }
        this.setID(renderScript.nInvokeClosureCreate(script$InvokeID.getID(renderScript), this.mFP.getData(), array, array2, array3));
    }
    
    public ScriptGroup$Closure(final RenderScript renderScript, final Script$KernelID script$KernelID, final Type type, final Object[] mArgs, final Map mBindings) {
        super(0L, renderScript);
        this.mArgs = mArgs;
        this.mReturnValue = Allocation.createTyped(renderScript, type);
        this.mBindings = mBindings;
        this.mGlobalFuture = new HashMap();
        final int n = mArgs.length + mBindings.size();
        final long[] array = new long[n];
        final long[] array2 = new long[n];
        final int[] array3 = new int[n];
        final long[] array4 = new long[n];
        final long[] array5 = new long[n];
        int i;
        for (i = 0; i < mArgs.length; ++i) {
            array[i] = 0L;
            this.retrieveValueAndDependenceInfo(renderScript, i, null, mArgs[i], array2, array3, array4, array5);
        }
        for (final Map.Entry<K, Object> entry : mBindings.entrySet()) {
            final Object value = entry.getValue();
            final Script$FieldID script$FieldID = (Script$FieldID)entry.getKey();
            array[i] = script$FieldID.getID(renderScript);
            this.retrieveValueAndDependenceInfo(renderScript, i, script$FieldID, value, array2, array3, array4, array5);
            ++i;
        }
        this.setID(renderScript.nClosureCreate(script$KernelID.getID(renderScript), this.mReturnValue.getID(renderScript), array, array2, array3, array4, array5));
    }
    
    private void retrieveValueAndDependenceInfo(final RenderScript renderScript, final int n, final Script$FieldID script$FieldID, Object value, final long[] array, final int[] array2, final long[] array3, final long[] array4) {
        if (value instanceof ScriptGroup$Future) {
            final ScriptGroup$Future scriptGroup$Future = (ScriptGroup$Future)value;
            value = scriptGroup$Future.getValue();
            array3[n] = scriptGroup$Future.getClosure().getID(renderScript);
            final Script$FieldID fieldID = scriptGroup$Future.getFieldID();
            long id;
            if (fieldID != null) {
                id = fieldID.getID(renderScript);
            }
            else {
                id = 0L;
            }
            array4[n] = id;
        }
        else {
            array4[n] = (array3[n] = 0L);
        }
        if (value instanceof ScriptGroup$Input) {
            final ScriptGroup$Input scriptGroup$Input = (ScriptGroup$Input)value;
            if (n < this.mArgs.length) {
                scriptGroup$Input.addReference(this, n);
            }
            else {
                scriptGroup$Input.addReference(this, script$FieldID);
            }
            array[n] = 0L;
            array2[n] = 0;
            return;
        }
        final ScriptGroup$Closure$ValueAndSize scriptGroup$Closure$ValueAndSize = new ScriptGroup$Closure$ValueAndSize(renderScript, value);
        array[n] = scriptGroup$Closure$ValueAndSize.value;
        array2[n] = scriptGroup$Closure$ValueAndSize.size;
    }
    
    public ScriptGroup$Future getGlobal(final Script$FieldID script$FieldID) {
        final ScriptGroup$Future scriptGroup$Future = this.mGlobalFuture.get(script$FieldID);
        ScriptGroup$Future scriptGroup$Future3;
        if (scriptGroup$Future == null) {
            Object o2;
            final Object o = o2 = this.mBindings.get(script$FieldID);
            if (o instanceof ScriptGroup$Future) {
                o2 = ((ScriptGroup$Future)o).getValue();
            }
            final ScriptGroup$Future scriptGroup$Future2 = new ScriptGroup$Future(this, script$FieldID, o2);
            this.mGlobalFuture.put(script$FieldID, scriptGroup$Future2);
            scriptGroup$Future3 = scriptGroup$Future2;
        }
        else {
            scriptGroup$Future3 = scriptGroup$Future;
        }
        return scriptGroup$Future3;
    }
    
    public ScriptGroup$Future getReturn() {
        if (this.mReturnFuture == null) {
            this.mReturnFuture = new ScriptGroup$Future(this, null, this.mReturnValue);
        }
        return this.mReturnFuture;
    }
    
    public void setArg(final int n, final Object o) {
        Object value = o;
        if (o instanceof ScriptGroup$Future) {
            value = ((ScriptGroup$Future)o).getValue();
        }
        this.mArgs[n] = value;
        final ScriptGroup$Closure$ValueAndSize scriptGroup$Closure$ValueAndSize = new ScriptGroup$Closure$ValueAndSize(this.mRS, value);
        final RenderScript mrs = this.mRS;
        mrs.nClosureSetArg(this.getID(mrs), n, scriptGroup$Closure$ValueAndSize.value, scriptGroup$Closure$ValueAndSize.size);
    }
    
    public void setGlobal(final Script$FieldID script$FieldID, final Object o) {
        Object value = o;
        if (o instanceof ScriptGroup$Future) {
            value = ((ScriptGroup$Future)o).getValue();
        }
        this.mBindings.put(script$FieldID, value);
        final ScriptGroup$Closure$ValueAndSize scriptGroup$Closure$ValueAndSize = new ScriptGroup$Closure$ValueAndSize(this.mRS, value);
        final RenderScript mrs = this.mRS;
        mrs.nClosureSetGlobal(this.getID(mrs), script$FieldID.getID(this.mRS), scriptGroup$Closure$ValueAndSize.value, scriptGroup$Closure$ValueAndSize.size);
    }
}
