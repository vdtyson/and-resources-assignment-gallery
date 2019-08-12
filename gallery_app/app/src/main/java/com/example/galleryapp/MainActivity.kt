package com.example.galleryapp

import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val views = mutableListOf<ImageView>()
    val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        for(i in 0 until 12) {
            views.add(i, ImageView(this))
        }
        views[0].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
        views[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.adventure_automobile_classic_2533092))
        views[2].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.aerial_photography_aerial_shot_aerial_view_2583847))
        views[3].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.afterglow_beach_cliff_2555285))
        views[4].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.alley_architecture_buildings_2526517))
        views[5].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.architectural_design_architecture_bridge_2540653))
        views[6].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.beautiful_breathtaking_canada_day_2526105))
        views[7].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011))
        views[8].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.close_up_colorful_colors_2529148))
        views[9].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.clouds_coconut_trees_daylight_2486168))
        views[10].setImageDrawable(ContextCompat.getDrawable(this,R.drawable.colorful_colourful_houses_2501965))
        views[11].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.wallpaper_astronomy_astrophotography_2538107))

       /* <style name="ImageView">
        <item name="android:adjustViewBounds">true</item>
        <item name="android:layout_width">match_parent</item>
        <item name="android:layout_height">wrap_content</item>
        <item name="android:padding">10dp</item> */



        ViewsArray()


    }
    fun ViewsArray() {
        for (i in 0 until views.size) {
            views[i].layoutParams = layoutParams
            views[i].adjustViewBounds = true
            views[i].setPadding(10, 10, 10, 10 )
            if(i % 2 == 0) {
                left_column.addView(views[i])
            } else {
                right_column.addView(views[i])
            }
        }
    }
}
