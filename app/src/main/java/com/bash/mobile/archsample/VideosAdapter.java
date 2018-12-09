package com.bash.mobile.archsample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bash.mobile.archsample.databinding.VideoItemBinding;
import com.bash.mobile.archsample.response.VideoItem;

import java.util.ArrayList;
import java.util.List;

public class VideosAdapter extends RecyclerView.Adapter {

    private List<VideoItem> videoItems;

    public void setVideoItems(List<VideoItem> videoItems) {
        this.videoItems = videoItems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        return new VideosViewHolder(VideoItemBinding.inflate(layoutInflater,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        VideosViewHolder videosViewHolder = (VideosViewHolder) viewHolder;
        videosViewHolder.bind(videoItems.get(i));
    }

    @Override
    public int getItemCount() {
        return videoItems == null ? 0 : videoItems.size();
    }
}
