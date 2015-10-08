package com.neerajweb.mygcmproject;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

	ShareExternalServer appUtil;
	String regId;
	public static final String REG_ID = "regId";
	AsyncTask<Void, Void, String> shareRegidTask;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		appUtil = new ShareExternalServer();

		regId = getIntent().getStringExtra("regId");
		Log.d("MainActivity", "regId: " + regId);

		if (regId=="" || regId==null) {
			SharedPreferences prefs = getSharedPreferences(MainActivity.class.getSimpleName(),
					Context.MODE_PRIVATE);
			String registrationId = prefs.getString(REG_ID, "");
			regId= registrationId;
		}


		final Context context = this;
		shareRegidTask = new AsyncTask<Void, Void, String>() {
			@Override
			protected String doInBackground(Void... params) {
				String result = appUtil.shareRegIdWithAppServer(context, regId);
				return result;
			}

			@Override
			protected void onPostExecute(String result) {
				shareRegidTask = null;
				Toast.makeText(getApplicationContext(), result,
						Toast.LENGTH_LONG).show();
			}

		};
		shareRegidTask.execute(null, null, null);
	}

}
