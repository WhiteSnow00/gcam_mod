// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.vision.opengl;

import java.nio.Buffer;
import android.opengl.GLUtils;
import android.opengl.GLES20;
import android.graphics.Bitmap;

public class Texture
{
    private boolean generated;
    private int height;
    private int name;
    private int type;
    private int width;
    
    public Texture(final int n, final int n2) {
        this(n, n2, 3553);
    }
    
    public Texture(final int width, final int height, final int type) {
        this.name = -1;
        this.type = -1;
        this.width = -1;
        this.height = -1;
        this.generated = false;
        this.name = createTexture(type);
        this.type = type;
        this.width = width;
        this.height = height;
        this.generated = true;
    }
    
    public Texture(final int width, final int height, final int type, final int name) {
        this.generated = false;
        this.name = name;
        this.type = type;
        this.width = width;
        this.height = height;
    }
    
    public Texture(final Bitmap bitmap) {
        this.name = -1;
        this.width = -1;
        this.height = -1;
        this.generated = false;
        this.type = 3553;
        this.width = bitmap.getWidth();
        this.height = bitmap.getHeight();
        final int texture = createTexture(this.type);
        this.name = texture;
        this.generated = true;
        GLES20.glBindTexture(this.type, texture);
        GLUtils.texImage2D(this.type, 0, bitmap, 0);
    }
    
    private static int createTexture(final int n) {
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        GLES20.glBindTexture(n, array[0]);
        GLES20.glTexParameteri(n, 10242, 33071);
        GLES20.glTexParameteri(n, 10243, 33071);
        GLES20.glTexParameteri(n, 10240, 9729);
        GLES20.glTexParameteri(n, 10241, 9729);
        return array[0];
    }
    
    public void allocate() {
        GLES20.glTexImage2D(this.type, 0, 6408, this.width, this.height, 0, 6408, 5121, (Buffer)null);
    }
    
    public void bind() {
        final int name = this.name;
        if (name < 0) {
            return;
        }
        GLES20.glBindTexture(this.type, name);
    }
    
    public void delete() {
        final int name = this.name;
        if (name >= 0 && this.generated) {
            GLES20.glDeleteTextures(1, new int[] { name }, 0);
            this.name = -1;
            this.width = -1;
            this.height = -1;
        }
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getName() {
        return this.name;
    }
    
    public int getType() {
        return this.type;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public void unbind() {
        GLES20.glBindTexture(this.type, 0);
    }
}
