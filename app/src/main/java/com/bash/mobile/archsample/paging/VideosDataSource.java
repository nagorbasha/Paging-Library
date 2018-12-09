package com.bash.mobile.archsample.paging;

import android.arch.paging.PageKeyedDataSource;
import android.support.annotation.NonNull;

import com.bash.mobile.archsample.AppUtils;
import com.bash.mobile.archsample.Constants;
import com.bash.mobile.archsample.response.SearchResponse;
import com.bash.mobile.archsample.response.VideoItem;
import com.bash.utility.RequestUtilsTask;
import com.google.gson.Gson;

public class VideosDataSource extends PageKeyedDataSource<String, VideoItem> {

    private String nextToken;

    private String prevToken;

    @Override
    public void loadInitial(@NonNull LoadInitialParams<String> params, @NonNull final LoadInitialCallback<String, VideoItem> callback) {

        RequestUtilsTask requestUtilsTask = new RequestUtilsTask(true,1);
        requestUtilsTask.setRequestListener(new RequestUtilsTask.RequestListener() {
            @Override
            public void onRequestProcessed(int requestCode, String message) {
                AppUtils.writeDebugLog("loadInitial",message+ " ");
                SearchResponse searchResponse = new Gson().fromJson(message,SearchResponse.class);
                nextToken = searchResponse.getNextPageToken();
                prevToken = searchResponse.getPrevPageToken();

                callback.onResult(searchResponse.getItems(),prevToken,nextToken);
            }
        });
        requestUtilsTask.execute(Constants.VIDEOS_LIST_URL);
    }

    @Override
    public void loadBefore(@NonNull LoadParams<String> params, @NonNull final LoadCallback<String, VideoItem> callback) {
        RequestUtilsTask requestUtilsTask = new RequestUtilsTask(true,1);
        requestUtilsTask.setRequestListener(new RequestUtilsTask.RequestListener() {
            @Override
            public void onRequestProcessed(int requestCode, String message) {
                AppUtils.writeDebugLog("loadInitial",message+ " ");
                SearchResponse searchResponse = new Gson().fromJson(message,SearchResponse.class);
                nextToken = searchResponse.getNextPageToken();
                prevToken = searchResponse.getPrevPageToken();

                callback.onResult(searchResponse.getItems(),prevToken);
            }
        });
        requestUtilsTask.execute(Constants.VIDEOS_LIST_URL);
    }

    @Override
    public void loadAfter(@NonNull LoadParams<String> params, @NonNull final LoadCallback<String, VideoItem> callback) {

        RequestUtilsTask requestUtilsTask = new RequestUtilsTask(true,1);
        requestUtilsTask.setRequestListener(new RequestUtilsTask.RequestListener() {
            @Override
            public void onRequestProcessed(int requestCode, String message) {
                AppUtils.writeDebugLog("loadAfter",message+ " ");
                SearchResponse searchResponse = new Gson().fromJson(message,SearchResponse.class);
                nextToken = searchResponse.getNextPageToken();
                callback.onResult(searchResponse.getItems(),nextToken);
            }
        });
        requestUtilsTask.execute(Constants.VIDEOS_LIST_TOKEN_URL.concat(nextToken));
    }
}
