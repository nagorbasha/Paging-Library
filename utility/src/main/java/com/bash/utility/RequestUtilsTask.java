package com.bash.utility;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@SuppressWarnings("unused")
public class RequestUtilsTask extends AsyncTask<String, Void, String> {

    public interface RequestListener {
        void onRequestProcessed(int requestCode, String message);
    }

    private RequestListener requestListener;

    public RequestUtilsTask(boolean isDebug, int requestCode) {
        this.isDebug = isDebug;
        this.requestCode = requestCode;
    }

    public void setDebug(boolean debug) {
        isDebug = debug;
    }

    private boolean isDebug = false;



    public void setRequestCode(int requestCode) {
        this.requestCode = requestCode;
    }

    public RequestUtilsTask(int requestCode) {
        this.requestCode = requestCode;
    }

    private int requestCode;

    public void setRequestListener(RequestListener requestListener) {
        this.requestListener = requestListener;
    }


    @Override
    protected String doInBackground(String... args) {
        HttpURLConnection urlConnection;
        try {
            StringBuilder stringBuilder = new StringBuilder();

            if(isDebug){
                Log.e("URL",args[0]);
            }
            urlConnection = (HttpURLConnection) (new URL(args[0])).openConnection();

            urlConnection.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;

            while ((line = br.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }

            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        if (requestListener != null) {
            requestListener.onRequestProcessed(requestCode, s);
        }
        super.onPostExecute(s);
    }
}
