package com.mobility.iz.retrofitdemo;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.mobility.iz.retrofitdemo.webservices.Greeting;
import com.mobility.iz.retrofitdemo.webservices.UserData;

import butterknife.ButterKnife;
import butterknife.InjectView;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Path;


public class TestActivity extends ActionBarActivity{

    private static final String GITHUB_API = "https://api.github.com";

    @InjectView(R.id.tvGreeting)
    TextView tvGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.inject(this);

        new GetGreetingTask().execute();
    }

    private class GetGreetingTask extends AsyncTask<Void, Void, UserData> {

        @Override
        protected UserData doInBackground(Void... params) {

            RestAdapter restAdapter = new RestAdapter.Builder().
                    setEndpoint(GITHUB_API).build();

            ConnectionService mCallBack = restAdapter.create(ConnectionService.class);
            UserData mResponse = mCallBack.getUserData("iZBasit");
            System.out.println(mResponse.toString());
            return mResponse;
        }

        @Override
        protected void onPostExecute(UserData mResponse) {
            super.onPostExecute(mResponse);

            tvGreeting.setText(mResponse.toString());
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    interface ConnectionService {
        @GET("/users/{username}")
        UserData getUserData(@Path("username") String username);
    }
}
