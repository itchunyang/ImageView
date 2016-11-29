package com.itchunyang.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * scaleType
 * center : Center the image in the view, but perform no scaling.
 *          先把当前的图片放置到ImageView的中间，不执行缩放，如果图片小，那么就会有空白区域，如果图片大，那么便会被裁减
 *
 * centerCrop: Scale the image uniformly (maintain the image's aspect ratio) so that both dimensions (width and height) of the image will be equal to or larger than the corresponding dimension of the view (minus padding).
 *          以填满整个ImageView为目的，将原图的中心对准ImageView的中心，等比例放大(缩小)原图，直到!刚好!填满ImageView为止（宽度大于或者等于ImageView的宽度，同时高度大于或者等于ImageView的高度），原图超过ImageView的部分作裁剪处理。
 *
 * centerInside:
 *          以原图完全显示为目的，将图片的内容完整居中显示，通过按比例缩小原图的size宽(高)等于或小于ImageView的宽(高)。如果原图的size本身就小于ImageView的size，则原图的size不作任何处理，居中显示在ImageView。
 *
 * fitCenter:
 *          1.保持图片的宽高比
 *          2.将图片放置到ImagetView的中心，然后进行向外按比例放大或者缩小，直到一个方向已经适应
 *          centerInside和fitCenter区别
 *          其实两者的区别很简单。fitxx开头的都是填充视图的意思，当视图View的大小比图片小时两者使用的效果是一样；而当View大小比图片大时，fitCenter会保持原图比例放大图片去填充View，而CenterInside会保持原图大小
 *
 * fitStart:
 *          将图片放置到ImagetView的左上角，然后进行向外按比例放大或者缩小，直到一个方向已经适应
 *
 * fitEnd  :将图片放置到ImageView的右下角，保持图片的宽高比，图片由小变大一部一部扩大，直到一个方向已经适配
 *
 * FIT_XY  :不保持图片的宽高比进行伸缩，从ImageView的中心，由小到大，一部一部扩大，直到两个方向都已经适配
 */
public class ImageScaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_scale);
    }
}
