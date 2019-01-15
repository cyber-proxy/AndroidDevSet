package lib.self.tsotumu.com.selflib.proxy;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

/**
 * Created by LC on 2019/1/15.
 */
public class ProxyActivity extends Activity {
    private static final String TAG = "ProxyActivity";
    private static final int REQUEST_CODE = 100;
    public static final String RESPONSE_INTENT = "INTENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PendingIntent pendingIntent = getIntent().getParcelableExtra(RESPONSE_INTENT);

        try {
            startIntentSenderForResult(
                    pendingIntent.getIntentSender(), REQUEST_CODE, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            broadcastResult("error", null);
            finish();
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == REQUEST_CODE) {
            if (resultCode != RESULT_OK) {
                Log.d(TAG,
                        "Got purchases updated result with resultCode "
                                + resultCode);
            }
            broadcastResult("", data == null ? null : data.getExtras());
        } else {
            Log.d(TAG, "Got onActivityResult with wrong requestCode: " + requestCode + "; skipping...");
        }
        // Need to finish this invisible activity once we sent back the result
        finish();
    }


    private void broadcastResult(String string, Bundle resultBundle) {
        Intent intent = new Intent("");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }
}
