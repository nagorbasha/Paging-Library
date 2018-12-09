package com.bash.mobile.archsample;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.paging.PagedList;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bash.mobile.archsample.databinding.MainBinding;
import com.bash.mobile.archsample.paging.PagingViewModel;
import com.bash.mobile.archsample.paging.VideosPagedListAdapter;
import com.bash.mobile.archsample.response.SearchResponse;
import com.bash.mobile.archsample.response.VideoItem;
import com.bash.utility.RequestUtilsTask;
import com.google.android.youtube.player.YouTubeIntents;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubeStandalonePlayer;
import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    HomeViewModel homeViewModel;
    MainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainBinding = DataBindingUtil.setContentView(this, R.layout.main);
        mainBinding.setHome(this);

        RecyclerView recyclerView = mainBinding.recyclerView;


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);


/*        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);


        final VideosAdapter videosAdapter = new VideosAdapter();

        recyclerView.setAdapter(videosAdapter);

        homeViewModel.getVideosList().observe(this, new Observer<List<VideoItem>>() {
            @Override
            public void onChanged(@Nullable List<VideoItem> videoItems) {
                AppUtils.writeErrorLog("Videos", (videoItems != null ? videoItems.size() : 0) + " ");
                videosAdapter.setVideoItems(videoItems);
                videosAdapter.notifyDataSetChanged();
            }
        });*/

        PagingViewModel viewModel = ViewModelProviders.of(this).get(PagingViewModel.class);

        final VideosPagedListAdapter videosPagedListAdapter = new VideosPagedListAdapter();

        VideoItemDecorator videoItemDecorator = new VideoItemDecorator();
        recyclerView.addItemDecoration(videoItemDecorator);
        recyclerView.setAdapter(videosPagedListAdapter);

        viewModel.getVideoItems().observe(this, new Observer<PagedList<VideoItem>>() {
            @Override
            public void onChanged(@Nullable PagedList<VideoItem> videoItems) {
                videosPagedListAdapter.submitList(videoItems);
            }
        });
    }
}
