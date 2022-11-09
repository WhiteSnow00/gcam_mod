// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

import android.util.Log;

class RenderScript$MessageThread extends Thread
{
    static final int RS_ERROR_FATAL_UNKNOWN = 4096;
    static final int RS_MESSAGE_TO_CLIENT_ERROR = 3;
    static final int RS_MESSAGE_TO_CLIENT_EXCEPTION = 1;
    static final int RS_MESSAGE_TO_CLIENT_NONE = 0;
    static final int RS_MESSAGE_TO_CLIENT_RESIZE = 2;
    static final int RS_MESSAGE_TO_CLIENT_USER = 4;
    int[] mAuxData;
    RenderScript mRS;
    boolean mRun;
    
    public RenderScript$MessageThread(final RenderScript mrs) {
        super("RSMessageThread");
        this.mRun = true;
        this.mAuxData = new int[2];
        this.mRS = mrs;
    }
    
    @Override
    public void run() {
        int[] array = new int[16];
        final RenderScript mrs = this.mRS;
        mrs.nContextInitToClient(mrs.mContext);
        while (this.mRun) {
            array[0] = 0;
            final RenderScript mrs2 = this.mRS;
            final int nContextPeekMessage = mrs2.nContextPeekMessage(mrs2.mContext, this.mAuxData);
            final int[] mAuxData = this.mAuxData;
            final int mLength = mAuxData[1];
            final int n = mAuxData[0];
            if (nContextPeekMessage == 4) {
                int[] mData = array;
                if (mLength >> 2 >= array.length) {
                    mData = new int[mLength + 3 >> 2];
                }
                final RenderScript mrs3 = this.mRS;
                if (mrs3.nContextGetUserMessage(mrs3.mContext, mData) != 4) {
                    throw new RSDriverException("Error processing message from RenderScript.");
                }
                final RenderScript$RSMessageHandler mMessageCallback = this.mRS.mMessageCallback;
                if (mMessageCallback == null) {
                    throw new RSInvalidStateException("Received a message from the script with no message handler installed.");
                }
                mMessageCallback.mData = mData;
                mMessageCallback.mID = n;
                mMessageCallback.mLength = mLength;
                mMessageCallback.run();
                array = mData;
            }
            else if (nContextPeekMessage == 3) {
                final RenderScript mrs4 = this.mRS;
                final String nContextGetErrorMessage = mrs4.nContextGetErrorMessage(mrs4.mContext);
                if (n >= 4096) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Fatal error ");
                    sb.append(n);
                    sb.append(", details: ");
                    sb.append(nContextGetErrorMessage);
                    throw new RSRuntimeException(sb.toString());
                }
                final RenderScript$RSErrorHandler mErrorCallback = this.mRS.mErrorCallback;
                if (mErrorCallback != null) {
                    mErrorCallback.mErrorMessage = nContextGetErrorMessage;
                    mErrorCallback.mErrorNum = n;
                    mErrorCallback.run();
                }
                else {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("non fatal RS error, ");
                    sb2.append(nContextGetErrorMessage);
                    Log.e("RenderScript_jni", sb2.toString());
                }
            }
            else {
                try {
                    Thread.sleep(1L, 0);
                }
                catch (final InterruptedException ex) {}
            }
        }
    }
}
