import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nwu implements nwq
{
    final DataInput a;
    
    public nwu(final ByteArrayInputStream byteArrayInputStream) {
        this.a = new DataInputStream(byteArrayInputStream);
    }
    
    @Override
    public final boolean readBoolean() {
        try {
            return this.a.readBoolean();
        }
        catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public final byte readByte() {
        try {
            return this.a.readByte();
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
        catch (final EOFException ex2) {
            throw new IllegalStateException(ex2);
        }
    }
    
    @Override
    public final char readChar() {
        try {
            return this.a.readChar();
        }
        catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public final double readDouble() {
        try {
            return this.a.readDouble();
        }
        catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public final float readFloat() {
        try {
            return this.a.readFloat();
        }
        catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public final void readFully(final byte[] array) {
        try {
            this.a.readFully(array);
        }
        catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public final void readFully(final byte[] array, final int n, final int n2) {
        try {
            this.a.readFully(array, n, n2);
        }
        catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public final int readInt() {
        try {
            return this.a.readInt();
        }
        catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public final String readLine() {
        try {
            return this.a.readLine();
        }
        catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public final long readLong() {
        try {
            return this.a.readLong();
        }
        catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public final short readShort() {
        try {
            return this.a.readShort();
        }
        catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public final String readUTF() {
        try {
            return this.a.readUTF();
        }
        catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public final int readUnsignedByte() {
        try {
            return this.a.readUnsignedByte();
        }
        catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public final int readUnsignedShort() {
        try {
            return this.a.readUnsignedShort();
        }
        catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public final int skipBytes(int skipBytes) {
        try {
            skipBytes = this.a.skipBytes(skipBytes);
            return skipBytes;
        }
        catch (final IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
