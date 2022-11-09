import android.graphics.Bitmap;
import java.io.FileNotFoundException;
import java.io.IOException;
import android.media.ExifInterface;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class esr implements Runnable
{
    final /* synthetic */ byte[] a;
    final /* synthetic */ ess b;
    
    public esr(final ess b, final byte[] a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            final String s = this.b.F.remove(0);
            final FileOutputStream fileOutputStream = new FileOutputStream(s);
            final File file = new File(s);
            String.valueOf(String.valueOf(file)).length();
            if (ese.b()) {
                final byte[] a = this.a;
                final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a, 0, a.length);
                decodeByteArray.compress(Bitmap$CompressFormat.JPEG, 100, (OutputStream)fileOutputStream);
                decodeByteArray.recycle();
            }
            else {
                fileOutputStream.write(this.a);
            }
            fileOutputStream.close();
            final ess b = this.b;
            if (b.n < b.D.size()) {
                final ess b2 = this.b;
                ((euf)b2.D.get(b2.n)).b = file.getAbsolutePath();
            }
            final int length = this.a.length;
            final ess b3 = this.b;
            b3.m.get(b3.n);
            this.b.E.remove(0);
            final esg b4 = this.b.B;
            final String absolutePath = file.getAbsolutePath();
            final String value = String.valueOf(absolutePath);
            if (value.length() != 0) {
                "alignNextImage called for ".concat(value);
            }
            else {
                new String("alignNextImage called for ");
            }
            try {
                b4.a.put(absolutePath);
                final ess b5 = this.b;
                ++b5.n;
                final esx g = b5.G;
                final String absolutePath2 = file.getAbsolutePath();
                double double1;
                try {
                    final String attribute = new ExifInterface(absolutePath2).getAttribute("ExposureTime");
                    if (attribute != null) {
                        try {
                            double1 = Double.parseDouble(attribute);
                        }
                        catch (final NumberFormatException ex) {
                            double1 = -2.0;
                        }
                    }
                    else {
                        double1 = -1.0;
                    }
                }
                catch (final IOException ex2) {
                    double1 = -3.0;
                }
                g.b = double1;
                g.a();
            }
            catch (final InterruptedException ex3) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Unexpected interruption");
            }
        }
        catch (final IndexOutOfBoundsException ex4) {
            ex4.printStackTrace();
        }
        catch (final IOException ex5) {
            ex5.printStackTrace();
        }
        catch (final FileNotFoundException ex6) {
            ex6.printStackTrace();
        }
    }
}
