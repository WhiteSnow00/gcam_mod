import java.util.Iterator;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import java.text.Format;
import java.io.IOException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class br
{
    public final Appendable a;
    public int b;
    public List c;
    
    public br(final StringBuffer a) {
        this.a = a;
        this.b = a.length();
        this.c = null;
    }
    
    public br(final StringBuilder a) {
        this.a = a;
        this.b = a.length();
        this.c = null;
    }
    
    public final void a(final CharSequence charSequence) {
        try {
            this.a.append(charSequence);
            this.b += charSequence.length();
        }
        catch (final IOException ex) {
            throw new co(ex);
        }
    }
    
    public final void b(final Format format, final Object o) {
        if (this.c == null) {
            this.a(format.format(o));
            return;
        }
        final AttributedCharacterIterator formatToCharacterIterator = format.formatToCharacterIterator(o);
        final int b = this.b;
        final Appendable a = this.a;
        try {
            final int beginIndex = formatToCharacterIterator.getBeginIndex();
            final int endIndex = formatToCharacterIterator.getEndIndex();
            if (beginIndex < endIndex) {
                a.append(formatToCharacterIterator.first());
                int n = beginIndex;
                while (++n < endIndex) {
                    a.append(formatToCharacterIterator.next());
                }
            }
            this.b = endIndex - beginIndex + b;
            formatToCharacterIterator.first();
            int i = formatToCharacterIterator.getIndex();
            final int endIndex2 = formatToCharacterIterator.getEndIndex();
            final int n2 = b - i;
            while (i < endIndex2) {
                final Map<AttributedCharacterIterator.Attribute, Object> attributes = formatToCharacterIterator.getAttributes();
                final int runLimit = formatToCharacterIterator.getRunLimit();
                if (attributes.size() != 0) {
                    for (final Map.Entry entry : attributes.entrySet()) {
                        this.c.add(new bs((AttributedCharacterIterator.Attribute)entry.getKey(), entry.getValue(), n2 + i, n2 + runLimit));
                    }
                }
                formatToCharacterIterator.setIndex(runLimit);
                i = runLimit;
            }
        }
        catch (final IOException ex) {
            throw new co(ex);
        }
    }
    
    public final void c(final Format format, final Object o, final String s) {
        if (this.c == null && s != null) {
            this.a(s);
            return;
        }
        this.b(format, o);
    }
}
