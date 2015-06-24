package mars.c.screenrotationex;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;


/**
 * A placeholder fragment containing a simple view.
 */
public class F extends Fragment {

    @InjectView(R.id.t)
    TextView t;

    public F() {
    }

    public F newI(){
        return new F();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rv= inflater.inflate(R.layout.fragment_, container, false);
        ButterKnife.inject(this, rv);
        return rv;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void update(String s){
        t.setText(s);
    }
}
