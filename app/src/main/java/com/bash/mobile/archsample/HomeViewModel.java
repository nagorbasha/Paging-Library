package com.bash.mobile.archsample;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PageKeyedDataSource;
import android.arch.paging.PagedList;

import com.bash.mobile.archsample.paging.VideosDataSource;
import com.bash.mobile.archsample.paging.VideosDataSourceFactory;
import com.bash.mobile.archsample.response.SearchResponse;
import com.bash.mobile.archsample.response.VideoItem;
import com.bash.utility.RequestUtilsTask;
import com.google.gson.Gson;

import java.util.List;

@SuppressWarnings("WeakerAccess")
public class HomeViewModel extends ViewModel {


    public MutableLiveData<List<VideoItem>> getVideosList() {
        if (videosList == null) {
            videosList = new MutableLiveData<>();
            fetchVideosList();
        }
        return videosList;
    }

    private void fetchVideosList() {
        RequestUtilsTask requestUtilsTask = new RequestUtilsTask(true, 1);
        requestUtilsTask.setRequestListener(new RequestUtilsTask.RequestListener() {
            @Override
            public void onRequestProcessed(int requestCode, String message) {
                AppUtils.writeErrorLog("Videos", message + " ");
                SearchResponse searchResponse = new Gson().fromJson(message, SearchResponse.class);
                videosList.setValue(searchResponse.getItems());
            }
        });

        requestUtilsTask.execute(Constants.VIDEOS_LIST_URL);
    }

    private MutableLiveData<List<VideoItem>> videosList;



}
