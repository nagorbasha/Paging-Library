package com.bash.mobile.archsample.paging;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.DataSource;

import com.bash.mobile.archsample.response.VideoItem;

public class VideosDataSourceFactory extends DataSource.Factory<String, VideoItem> {

    public MutableLiveData<VideosDataSource> getDataSourceMutableLiveData() {
        return dataSourceMutableLiveData;
    }

    private MutableLiveData<VideosDataSource> dataSourceMutableLiveData;

    public VideosDataSourceFactory() {
        dataSourceMutableLiveData = new MutableLiveData<>();
    }

    @Override
    public DataSource<String, VideoItem> create() {
        VideosDataSource videosDataSource = new VideosDataSource();
        dataSourceMutableLiveData.postValue(videosDataSource);
        return videosDataSource;
    }
}
