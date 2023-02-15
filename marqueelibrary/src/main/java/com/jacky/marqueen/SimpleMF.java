package com.jacky.marqueen;

import android.content.Context;
import android.widget.TextView;

/**
 * 默认轮播子视图为一个TextView
 * Created by GongWen on 17/9/15.
 */
public class SimpleMF<E extends CharSequence> extends MarqueeFactory<TextView, E> {
    public SimpleMF(Context mContext) {
        super(mContext);
    }

    @Override
    public TextView generateMarqueeItemView(E data) {
        TextView mView = new TextView(mContext);
        mView.setText(data);
        return mView;
    }
}