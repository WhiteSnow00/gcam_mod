import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nwv implements nwr
{
    final DataOutput a;
    
    public nwv(final ByteArrayOutputStream byteArrayOutputStream) {
        this.a = new DataOutputStream(byteArrayOutputStream);
    }
    
    @Override
    public final void write(final int n) {
        try {
            this.a.write(n);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final void write(final byte[] array) {
        try {
            this.a.write(array);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final void write(final byte[] array, final int n, final int n2) {
        try {
            this.a.write(array, n, n2);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final void writeBoolean(final boolean b) {
        try {
            this.a.writeBoolean(b);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final void writeByte(final int n) {
        try {
            this.a.writeByte(n);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final void writeBytes(final String s) {
        try {
            this.a.writeBytes(s);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final void writeChar(final int n) {
        try {
            this.a.writeChar(n);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final void writeChars(final String s) {
        try {
            this.a.writeChars(s);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final void writeDouble(final double n) {
        try {
            this.a.writeDouble(n);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final void writeFloat(final float n) {
        try {
            this.a.writeFloat(n);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final void writeInt(final int n) {
        try {
            this.a.writeInt(n);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final void writeLong(final long n) {
        try {
            this.a.writeLong(n);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final void writeShort(final int n) {
        try {
            this.a.writeShort(n);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final void writeUTF(final String s) {
        try {
            this.a.writeUTF(s);
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
}
