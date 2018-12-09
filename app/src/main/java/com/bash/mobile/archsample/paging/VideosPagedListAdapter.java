package com.bash.mobile.archsample.paging;

import android.arch.paging.PagedListAdapter;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bash.mobile.archsample.VideosViewHolder;
import com.bash.mobile.archsample.databinding.VideoItemBinding;
import com.bash.mobile.archsample.response.VideoItem;

public class VideosPagedListAdapter extends PagedListAdapter<VideoItem,VideosViewHolder> {

    private static DiffUtil.ItemCallback<VideoItem> itemItemCallback = new DiffUtil.ItemCallback<VideoItem>() {
        @Override
        public boolean areItemsTheSame(@NonNull VideoItem videoItem, @NonNull VideoItem t1) {
            return videoItem.getId().getVideoId().equals(t1.getId().getVideoId());
        }

        @Override
        public boolean areContentsTheSame(@NonNull VideoItem videoItem, @NonNull VideoItem t1) {
            return videoItem.equals(t1);
        }
    };

    public VideosPagedListAdapter() {
        super(itemItemCallback);
    }

    @NonNull
    @Override
    public VideosViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        return new VideosViewHolder(VideoItemBinding.inflate(layoutInflater,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VideosViewHolder videosViewHolder, int i) {
        videosViewHolder.bind(getItem(i));
    }


}
