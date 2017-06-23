package chickenzero.ht.com.imagefilter;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by QuyDV on 6/22/17.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
