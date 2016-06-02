package tutorial.com.helloworld;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

/**
 * Created by sh-a- on 26/02/2016.
 */
public class SensorActivity extends Activity {
    private SensorManager mSensorManager;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> sensorList = mSensorManager.getSensorList(Sensor.TYPE_ALL);

        for(Sensor sensor : sensorList){
            Log.d("Sensor",sensor.getName());
        }
    }
}
