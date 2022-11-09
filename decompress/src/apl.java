import java.io.Reader;
import java.io.PushbackReader;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apl extends PushbackReader
{
    private int a;
    private int b;
    private int c;
    
    public apl(final Reader reader) {
        super(reader, 8);
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    
    @Override
    public final int read(final char[] array, int a, final int n) {
        final char[] array2 = new char[8];
        int n2 = 1;
        int n3 = 0;
        int n4 = 0;
        int n5 = a;
        while (n2 != 0 && n3 < n) {
            if (super.read(array2, n4, 1) == 1) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                final char c = array2[n4];
                a = this.a;
                char c2 = '\0';
                Label_0561: {
                    switch (a) {
                        default: {
                            this.a = 0;
                            a = 0;
                            c2 = c;
                            break Label_0561;
                        }
                        case 4: {
                            if (c < '0' || c > '9') {
                                if ((a = c) == 59) {
                                    if (apn.d((char)this.b)) {
                                        this.a = 0;
                                        final char c3 = (char)this.b;
                                        a = 0;
                                        c2 = c3;
                                        break Label_0561;
                                    }
                                    a = 59;
                                }
                                this.a = 5;
                                final int n6 = 5;
                                c2 = (char)a;
                                a = n6;
                                break Label_0561;
                            }
                            this.b = this.b * 10 + Character.digit(c, 10);
                            a = this.c + 1;
                            if ((this.c = a) <= 5) {
                                this.a = 4;
                                a = 4;
                                c2 = c;
                                break Label_0561;
                            }
                            this.a = 5;
                            a = 5;
                            c2 = c;
                            break Label_0561;
                        }
                        case 3: {
                            if ((c < '0' || c > '9') && (c < 'a' || c > 'f') && (c < 'A' || c > 'F')) {
                                char c4;
                                if ((c4 = c) == ';') {
                                    if (apn.d((char)this.b)) {
                                        this.a = 0;
                                        final char c5 = (char)this.b;
                                        a = 0;
                                        c2 = c5;
                                        break Label_0561;
                                    }
                                    c4 = ';';
                                }
                                this.a = 5;
                                a = 5;
                                c2 = c4;
                                break Label_0561;
                            }
                            this.b = this.b * 16 + Character.digit(c, 16);
                            a = this.c + 1;
                            if ((this.c = a) <= 4) {
                                this.a = 3;
                                a = 3;
                                c2 = c;
                                break Label_0561;
                            }
                            this.a = 5;
                            a = 5;
                            c2 = c;
                            break Label_0561;
                        }
                        case 2: {
                            if (c == 'x') {
                                this.b = 0;
                                this.c = 0;
                                this.a = 3;
                                a = 3;
                                c2 = c;
                                break Label_0561;
                            }
                            if (c >= '0' && c <= '9') {
                                this.b = Character.digit(c, 10);
                                this.c = 1;
                                this.a = 4;
                                a = 4;
                                c2 = c;
                                break Label_0561;
                            }
                            break;
                        }
                        case 1: {
                            if (c == '#') {
                                this.a = 2;
                                a = 2;
                                c2 = c;
                                break Label_0561;
                            }
                            break;
                        }
                        case 0: {
                            c2 = c;
                            if (c == '&') {
                                this.a = 1;
                                final char c6 = '&';
                                a = 1;
                                c2 = c6;
                            }
                            break Label_0561;
                        }
                    }
                    this.a = 5;
                    a = 5;
                    c2 = c;
                }
                if (a == 0) {
                    if (!apn.d(c2)) {
                        a = c2;
                    }
                    else {
                        a = 32;
                    }
                    array[n5] = (char)a;
                    ++n3;
                    ++n5;
                    a = 0;
                }
                else if (a == 5) {
                    this.unread(array2, 0, n4 + 1);
                    a = 0;
                }
                else {
                    a = n4 + 1;
                }
                n4 = a;
            }
            else {
                if (n4 <= 0) {
                    continue;
                }
                this.unread(array2, 0, n4);
                this.a = 5;
                n2 = 1;
                n4 = 0;
            }
        }
        if (n3 <= 0 && n2 == 0) {
            return -1;
        }
        return n3;
    }
}
