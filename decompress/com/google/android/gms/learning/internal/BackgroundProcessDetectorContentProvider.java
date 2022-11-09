// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.learning.internal;

import android.database.Cursor;
import android.content.ContentValues;
import android.net.Uri;
import android.content.ContentProvider;

public class BackgroundProcessDetectorContentProvider extends ContentProvider
{
    public final int delete(final Uri uri, final String s, final String[] array) {
        return 0;
    }
    
    public final String getType(final Uri uri) {
        return "";
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        return null;
    }
    
    public final boolean onCreate() {
        synchronized (jyu.a) {
            return jyu.b = true;
        }
    }
    
    public final Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        return null;
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        return 0;
    }
}
