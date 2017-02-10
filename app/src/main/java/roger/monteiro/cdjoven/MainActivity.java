package roger.monteiro.cdjoven;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Context context = this;
    MediaPlayer mp,mp2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(context, R.raw.sound);
        mp2 = MediaPlayer.create(context, R.raw.sound2);
        final Button b = (Button) findViewById(R.id.Button);
        final Button c = (Button) findViewById(R.id.Button2);
        final Button stop = (Button) findViewById(R.id.stop);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                        mp = MediaPlayer.create(context, R.raw.sound);
                    } mp.start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (mp2.isPlaying()) {
                        mp2.stop();
                        mp2.release();
                        mp2 = MediaPlayer.create(context, R.raw.sound2);
                    } mp2.start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if (mp2.isPlaying()||mp.isPlaying()) {
                        mp.stop();
                        mp2.stop();
                        mp.release();
                        mp2.release();
                        mp = MediaPlayer.create(context, R.raw.sound);
                        mp2 = MediaPlayer.create(context, R.raw.sound2);
                    }
            }
        });
    }
}
