package com.bash.mobile.archsample;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class VideoItemDecorator extends RecyclerView.ItemDecoration {

    int bottomMargin  = 10;

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
       try{
           if(parent.getAdapter()!=null)
            if(parent.getAdapter().getItemCount() -1 != parent.getChildAdapterPosition(view)) {
                             outRect.bottom = bottomMargin;
            }
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}
