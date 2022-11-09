// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.lens.lenslite.api;

import android.media.Image;
import android.graphics.Bitmap;

public final class LinkImage
{
    private niz bitmap;
    private final niz height;
    private niz image;
    private niz imageProxy;
    private final int linkImageType;
    private final niz rotation;
    private final niz width;
    
    private LinkImage(final niz width, final niz height, final niz rotation, final int linkImageType) {
        this.bitmap = nii.a;
        this.image = nii.a;
        this.imageProxy = nii.a;
        this.width = width;
        this.height = height;
        this.rotation = rotation;
        this.linkImageType = linkImageType;
    }
    
    public static LinkImage create(final Bitmap bitmap, final int n) {
        final LinkImage linkImage = new LinkImage(niz.i(bitmap.getWidth()), niz.i(bitmap.getHeight()), niz.i(n), 1);
        linkImage.bitmap = niz.i(bitmap);
        return linkImage;
    }
    
    public static LinkImage create(final Image image, final int n) {
        final LinkImage linkImage = new LinkImage(niz.i(image.getWidth()), niz.i(image.getHeight()), niz.i(n), 2);
        linkImage.image = niz.i(image);
        return linkImage;
    }
    
    public static LinkImage create(final ImageProxy imageProxy, final int n) {
        final LinkImage linkImage = new LinkImage(niz.i(imageProxy.getWidth()), niz.i(imageProxy.getHeight()), niz.i(n), 3);
        linkImage.imageProxy = niz.i(imageProxy);
        return linkImage;
    }
    
    public void close() {
        if (this.image.g()) {
            ((Image)this.image.c()).close();
            return;
        }
        if (this.imageProxy.g()) {
            ((ImageProxy)this.imageProxy.c()).close();
        }
    }
    
    public niz getBitmap() {
        return this.bitmap;
    }
    
    public int getHeight() {
        njo.o(this.height.g());
        return (int)this.height.c();
    }
    
    public niz getImage() {
        return this.image;
    }
    
    public niz getImageProxy() {
        return this.imageProxy;
    }
    
    public int getRotation() {
        njo.o(this.height.g());
        return (int)this.rotation.c();
    }
    
    public int getType() {
        return this.linkImageType;
    }
    
    public int getWidth() {
        njo.o(this.width.g());
        return (int)this.width.c();
    }
}
