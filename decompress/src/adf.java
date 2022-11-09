import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adf extends ade
{
    private final ViewGroup b;
    
    public adf(final ei ei, final ViewGroup b) {
        super(ei);
        this.b = b;
    }
    
    @Override
    public final String getMessage() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Attempting to add fragment ");
        sb.append(this.a);
        sb.append(" to container ");
        sb.append(this.b);
        sb.append(" which is not a FragmentContainerView");
        return sb.toString();
    }
}
