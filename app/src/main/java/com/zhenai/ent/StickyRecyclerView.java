package com.zhenai.ent;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * 请添加注释说明
 *
 * @author dengqu
 * @date 2018/12/24.
 */

public class StickyRecyclerView extends RecyclerView {
    public StickyRecyclerView(Context context) {
        super(context);
    }

    public StickyRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public StickyRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public DispatchTouchEventListener mListener;

    public void setListener(DispatchTouchEventListener listener) {
        mListener = listener;
    }

    public interface DispatchTouchEventListener {
        public void dispatchTouchEvent(MotionEvent ev);
    }
}
