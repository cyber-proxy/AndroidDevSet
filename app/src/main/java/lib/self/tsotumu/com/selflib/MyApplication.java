package lib.self.tsotumu.com.selflib;

import android.app.Application;
import android.content.Context;

/**
 * Created by LC on 2019/1/15.
 */
public class MyApplication extends Application {
    public static Application sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static Context getContext(){
        return sInstance.getApplicationContext();
    }
}
