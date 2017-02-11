package roger.monteiro.cdjoven;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Context context = this;
    MediaPlayer EuCreio,Consagracao,UltimoConvite,MinhaFortaleza,Orando,DocePaz,OucoSuaVoz;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EuCreio=MediaPlayer.create(context,R.raw.eucreio);
        Consagracao=MediaPlayer.create(context,R.raw.consagracao);
        UltimoConvite=MediaPlayer.create(context,R.raw.ultimoconvite);
        MinhaFortaleza=MediaPlayer.create(context,R.raw.minhafortaleza);
        Orando=MediaPlayer.create(context,R.raw.orando);
        DocePaz=MediaPlayer.create(context,R.raw.docepaz);
        OucoSuaVoz=MediaPlayer.create(context,R.raw.oucosuavoz);


        final ImageButton btnEuCreio = (ImageButton) findViewById(R.id.eucreio);
        final ImageButton btnConsagracao = (ImageButton) findViewById(R.id.consagracao);
        final ImageButton btnUltimoConvite = (ImageButton) findViewById(R.id.ultimoconvite);
        final ImageButton btnMinhaFortaleza = (ImageButton) findViewById(R.id.minhafortaleza);
        final ImageButton btnOrando = (ImageButton) findViewById(R.id.orando);
        final ImageButton btnDocePaz = (ImageButton) findViewById(R.id.docepaz);
        final ImageButton btnOucoSuaVoz = (ImageButton) findViewById(R.id.oucosuavoz);
        final Button stop =(Button)findViewById(R.id.stop);

        btnEuCreio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (EuCreio.isPlaying()) {
                        EuCreio.stop();
                        EuCreio.release();
                        EuCreio=MediaPlayer.create(context,R.raw.eucreio);
                    } EuCreio.start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
        btnConsagracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (Consagracao.isPlaying()) {
                        Consagracao.stop();
                        Consagracao.release();
                        Consagracao=MediaPlayer.create(context,R.raw.consagracao);
                    } Consagracao.start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
        btnUltimoConvite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (UltimoConvite.isPlaying()) {
                        UltimoConvite.stop();
                        UltimoConvite.release();
                        UltimoConvite=MediaPlayer.create(context,R.raw.ultimoconvite);
                    } UltimoConvite.start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
        btnMinhaFortaleza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (MinhaFortaleza.isPlaying()) {
                        MinhaFortaleza.stop();
                        MinhaFortaleza.release();
                        MinhaFortaleza=MediaPlayer.create(context,R.raw.minhafortaleza);
                    } MinhaFortaleza.start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
        btnOrando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (Orando.isPlaying()) {
                        Orando.stop();
                        Orando.release();
                        Orando=MediaPlayer.create(context,R.raw.orando);
                    } Orando.start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
        btnDocePaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (DocePaz.isPlaying()) {
                        DocePaz.stop();
                        DocePaz.release();
                        DocePaz=MediaPlayer.create(context,R.raw.docepaz);
                    } DocePaz.start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });
        btnOucoSuaVoz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (OucoSuaVoz.isPlaying()) {
                        OucoSuaVoz.stop();
                        OucoSuaVoz.release();
                        OucoSuaVoz=MediaPlayer.create(context,R.raw.oucosuavoz);
                    } OucoSuaVoz.start();
                } catch(Exception e) { e.printStackTrace(); }
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EuCreio.stop();EuCreio.release();EuCreio=MediaPlayer.create(context,R.raw.eucreio);
                Consagracao.stop();Consagracao.release();Consagracao=MediaPlayer.create(context,R.raw.consagracao);
                UltimoConvite.stop();UltimoConvite.release();UltimoConvite=MediaPlayer.create(context,R.raw.ultimoconvite);
                MinhaFortaleza.stop();MinhaFortaleza.release();MinhaFortaleza=MediaPlayer.create(context,R.raw.minhafortaleza);
                Orando.stop();Orando.release();Orando=MediaPlayer.create(context,R.raw.orando);
                DocePaz.stop();DocePaz.release();DocePaz=MediaPlayer.create(context,R.raw.docepaz);
                OucoSuaVoz.stop();OucoSuaVoz.release();OucoSuaVoz=MediaPlayer.create(context,R.raw.oucosuavoz);
            }
        });

    }
}
