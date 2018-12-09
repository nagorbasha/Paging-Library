package com.bash.mobile.archsample;

import android.content.Intent;
import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

import com.bash.mobile.archsample.databinding.VideoItemBinding;
import com.bash.mobile.archsample.response.VideoItem;
import com.google.android.youtube.player.YouTubeIntents;
import com.squareup.picasso.Picasso;

@SuppressWarnings("WeakerAccess")
public class VideosViewHolder extends RecyclerView.ViewHolder {


    private VideoItemBinding videoItemBinding;

    public VideosViewHolder(VideoItemBinding videoItemBinding) {
        super(videoItemBinding.getRoot());
        this.videoItemBinding = videoItemBinding;
        videoItemBinding.setViewHolder(this);
    }

    public void bind(VideoItem videoItem) {
        videoItemBinding.setVideoItem(videoItem);
        videoItemBinding.executePendingBindings();
    }

    @BindingAdapter({"android:src", "placeHolder", "height"})
    public static void setImage(ImageView imageView, VideoItem.SnippetBean.ThumbnailsBean thumbnailsBean, Drawable placeHolder, int height) {
        String imageUrl = "N_A";

        if (thumbnailsBean.getHigh() != null) {
            imageUrl = thumbnailsBean.getHigh().getUrl();
        } else if (thumbnailsBean.getMedium() != null) {
            imageUrl = thumbnailsBean.getMedium().getUrl();
        } else if (thumbnailsBean.getDefaultX() != null) {
            imageUrl = thumbnailsBean.getDefaultX().getUrl();
        }

        DisplayMetrics displayMetrics = imageView.getContext().getResources().getDisplayMetrics();

        imageView.getLayoutParams().height = (int) (displayMetrics.heightPixels * 0.5);

        Picasso.with(imageView.getContext()).load(imageUrl).placeholder(placeHolder).into(imageView);

    }

}
