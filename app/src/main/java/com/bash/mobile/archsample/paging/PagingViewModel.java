package com.bash.mobile.archsample.paging;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;

import com.bash.mobile.archsample.response.VideoItem;

public class PagingViewModel extends ViewModel {

    private LiveData<PagedList<VideoItem>> videoItems;

    public PagingViewModel() {
        VideosDataSourceFactory videosDataSourceFactory = new VideosDataSourceFactory();

        PagedList.Config config =new PagedList.Config.Builder().setPageSize(10).build();

        videoItems = new LivePagedListBuilder<>(videosDataSourceFactory,config).build();

    }

    public LiveData<PagedList<VideoItem>> getVideoItems() {
        return videoItems;
    }
}
