package apps.gdtidm.networkimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imgPicasso, imgGlide;

    String contentImgPicasso    =   "https://cdn.pixabay.com/photo/2019/09/23/16/18/sunset-4499023_960_720.jpg";
    String contentImgGlide      =   "https://cdn.pixabay.com/photo/2018/10/28/09/56/mountains-3778244_960_720.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPicasso  =   findViewById(R.id.imagePicasso);
        Picasso.get().load(contentImgPicasso).into(imgPicasso);

        imgGlide    =   findViewById(R.id.imageGlide);
        Glide.with(this).load(contentImgGlide).into(imgGlide);
    }
}