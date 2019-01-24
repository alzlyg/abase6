package innobi.ru.townweather;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TheWeatherActivity extends AppCompatActivity {
    TextView textView;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theweather);

        imageView = (ImageView) findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        String town = getIntent().getExtras().getString(MainActivity.KEY_TOWN);
        Boolean booleanWind = getIntent().getExtras().getBoolean(MainActivity.KEY_WIND);
        Boolean booleanWet = getIntent().getExtras().getBoolean(MainActivity.KEY_WET);
        Boolean booleanPressure = getIntent().getExtras().getBoolean(MainActivity.KEY_PRESSURE);
        int temperature = getIntent().getExtras().getInt(MainActivity.KEY_VALUE_TEMPERATURE);;
        int wet = getIntent().getExtras().getInt(MainActivity.KEY_VALUE_WET);
        int wind = getIntent().getExtras().getInt(MainActivity.KEY_VALUE_WIND);
        int pressure = getIntent().getExtras().getInt(MainActivity.KEY_VALUE_PRESSURE);
        int cloudy = getIntent().getExtras().getInt(MainActivity.KEY_VALUE_CLOUDY);
        int rain = getIntent().getExtras().getInt(MainActivity.KEY_VALUE_RAIN);
        int snow = getIntent().getExtras().getInt(MainActivity.KEY_VALUE_SNOW);

        String res;
        if (!town.isEmpty()) {
            res = "Погода в городе - " + town + "\n";
            res += "Температура " + temperature+ " C°\n";
            if (booleanWind) res += "Ветер " + wind + " м/с\n";
            if (booleanWet) res += "Относительная влажность " + wet + "%\n";
            if (booleanPressure) res += "Давление " + pressure + " мм рт. ст.";
        //    res += "Пасмурно, небольшой снег\n";
            showWeatherImage(cloudy, rain, snow);
        } else res = "Пожалуйста укажите город";
        textView.setText(res);
    }

    private void showWeatherImage(int cloudy, int rain, int snow) {
        if (cloudy == 2) {
            if (rain==2) {
                if (snow>0) {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.oblakarainsnow2));
                } else {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.oblakarain2));
                }
            }
            if (rain==1) {
                if (snow==2) {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.oblakarainsnow2));
                } else if (snow==1) {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.oblakarainsnow));
                } else if (snow==0) {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.oblakarain));
                }
            }
            if (rain==0) {
                if (snow==2) {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.oblakasnow2));
                } else if (snow==1) {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.oblakasnow));
                } else if (snow==0) {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.oblaka));
                }
            }
        }
        if (cloudy == 1) {
            if (rain==2) {
                if (snow>0) {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.sunoblrainsnow2));
                } else {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.sunoblrain2));
                }
            }
            if (rain==1) {
                if (snow==2) {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.sunoblrainsnow2));
                } else if (snow==1) {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.sunoblrainsnow));
                } else if (snow==0) {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.sunoblrain));
                }
            }
            if (rain==0) {
                if (snow==2) {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.sunoblsnow2));
                } else if (snow==1) {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.sunoblsnow));
                } else if (snow==0) {
                    imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.sunobl));
                }
            }
        }
        if (cloudy == 0) {
            imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.sun));
        }
    }






}
