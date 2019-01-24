package innobi.ru.townweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import innobi.ru.townweather.dummy.DummyContent;

public class MainActivity extends AppCompatActivity
        implements TownFragment.OnListFragmentInteractionListener{

    private final String TAG = "MESSAGE (" + this.getClass().getSimpleName() + "): ";

    public static final String KEY_TOWN = "KeyTown";
    public static final String KEY_WET = "KeyWet";
    public static final String KEY_WIND = "KeyWind";
    public static final String KEY_PRESSURE = "KeyPressure";
    public static final String KEY_VALUE_TEMPERATURE = "KeyValueTemperature";
    public static final String KEY_VALUE_WET = "KeyValueWet";
    public static final String KEY_VALUE_WIND = "KeyValueWind";
    public static final String KEY_VALUE_PRESSURE = "KeyValuePressure";
    public static final String KEY_VALUE_CLOUDY = "KeyValueCloudy";
    public static final String KEY_VALUE_RAIN = "KeyValueRain";
    public static final String KEY_VALUE_SNOW = "KeyValueSnow";

    CheckBox chekBoxWind;
    CheckBox chekBoxWet;
    CheckBox chekBoxPressure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        chekBoxWind = findViewById(R.id.checkBoxWind);
        chekBoxWet = findViewById(R.id.checkBoxWet);
        chekBoxPressure = findViewById(R.id.checkBoxPressure);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {
        Intent intent = new Intent(getApplicationContext(), TheWeatherActivity.class);
        intent.putExtra(KEY_TOWN, item.content);
        intent.putExtra(KEY_WIND, chekBoxWind.isChecked());
        intent.putExtra(KEY_WET, chekBoxWet.isChecked());
        intent.putExtra(KEY_PRESSURE, chekBoxPressure.isChecked());
        intent.putExtra(KEY_VALUE_TEMPERATURE, item.temperature);
        intent.putExtra(KEY_VALUE_WET, item.wet);
        intent.putExtra(KEY_VALUE_WIND, item.wind);
        intent.putExtra(KEY_VALUE_PRESSURE, item.pressure);
        intent.putExtra(KEY_VALUE_CLOUDY, item.cloudy);
        intent.putExtra(KEY_VALUE_RAIN, item.rain);
        intent.putExtra(KEY_VALUE_SNOW, item.snow);
        startActivity(intent);

        /*        Log.d("TAG1", "onListFragmentInteraction: " + item + ": " + item.temperature);
        if (temperature != null && temperature.isVisible()) {
            temperature.changeTemperature(item.content, item.temperature);
        } else {
            Intent intent = new Intent(getApplicationContext(), TemperatureActivity.class);
            intent.putExtra(KEY_CITY, item.content);
            intent.putExtra(KEY_TEMPERATURE, item.temperature);
            startActivity(intent);
        }*/
    }
}
