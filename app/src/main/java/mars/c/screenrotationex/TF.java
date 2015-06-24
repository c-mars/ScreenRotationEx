package mars.c.screenrotationex;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;

/**
 * Created by mars on 6/24/15.
 */
public class TF extends Fragment {
    public  interface TC {
        void update(int p);
    }
    private TC tc;
    private T t;

    public static TF newI(){return new TF();}


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        t=new T();
        t.execute();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        tc= (TC) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        tc=null;
    }

    private class T extends AsyncTask<Void, Integer, Void>{

        @Override
        protected Void doInBackground(Void... params) {
            for(int i=0;i<100;i++){
                SystemClock.sleep(2000);
                publishProgress(i);
            }

            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            if(tc!=null){
                tc.update(values[0]);
            }
        }
    }

}
