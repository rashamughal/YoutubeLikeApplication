package com.example.rashatube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView VeniceVideo = findViewById(R.id.viniceVideo1);
        //setVideoPath is a function which helps in attaching an  android resource to this videoview
        VeniceVideo.setVideoPath("android.resource://" + getPackageName() + "/" +R.raw.vinice);//R.raw is a resource type in android , it is used for raw asset files
        // this is a path for videoview, this is a way to reference a video file stored in the raw resources of android application.

        //MediaController is a UI component that provides playback controls for media players.
        //for having media controls, this is a media controller object.
        //The constructor takes a Context parameter, and in this case, this is passed, assuming that the code is within an Activity class or another class that extends Context
        MediaController mediaController=new MediaController(this);

        //By associating a MediaController with a VideoView, you provide a user interface for controlling video
        // playback, such as play, pause, seek, and volume controls.The setMediaController method of the VideoView class
        // is used for this purpose.
        VeniceVideo.setMediaController(mediaController);

        //this media controller will control our video
        //AnchorView is the view around which the media controller will be positioned/anchored
        // In this case, the anchor view is the VeniceVideo (presumably a VideoView).
        mediaController.setAnchorView(VeniceVideo);

        // these lines are creating a media controller and attaching it to the VideoView to enhance
        // the user experience by providing playback controls for the video.

        //now for stating the videoview
        VeniceVideo.start();
    }
}