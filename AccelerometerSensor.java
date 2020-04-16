package com.google.appinventor.components.runtime;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.Deleteable;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.OnPauseListener;
import com.google.appinventor.components.runtime.OnResumeListener;
import com.google.appinventor.components.runtime.SensorComponent;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

@DesignerComponent(
   category = ComponentCategory.SENSORS,
   description = "Non-visible component that can detect shaking and measure acceleration approximately in three dimensions using SI units (m/s<sup>2</sup>).  The components are: <ul>\n<li> <strong>xAccel</strong>: 0 when the phone is at rest on a flat      surface, positive when the phone is tilted to the right (i.e.,      its left side is raised), and negative when the phone is tilted      to the left (i.e., its right size is raised).</li>\n <li> <strong>yAccel</strong>: 0 when the phone is at rest on a flat      surface, positive when its bottom is raised, and negative when      its top is raised. </li>\n <li> <strong>zAccel</strong>: Equal to -9.8 (earth\'s gravity in meters per      second per second when the device is at rest parallel to the ground      with the display facing up,      0 when perpendicular to the ground, and +9.8 when facing down.       The value can also be affected by accelerating it with or against      gravity. </li></ul>",
   helpUrl = "https://docs.kodular.io/components/sensors/accelerometer/",
   iconName = "images/accelerometersensor.png",
   nonVisible = true,
   version = 4
)
@SimpleObject
public class AccelerometerSensor extends AndroidNonvisibleComponent implements SensorEventListener, Deleteable, OnPauseListener, OnResumeListener, SensorComponent {
   private static final boolean DEBUG = true;
   private static final String LOG_TAG = "AccelerometerSensor";
   private static final int SENSOR_CACHE_SIZE = 10;
   private static final double moderateShakeThreshold = 13.0D;
   private static final double strongShakeThreshold = 20.0D;
   private static final double weakShakeThreshold = 5.0D;
   private final Queue X_CACHE;
   private final Queue Y_CACHE;
   private final Queue Z_CACHE;
   private Sensor accelerometerSensor;
   private int accuracy;
   private final Handler androidUIHandler;
   private volatile int deviceDefaultOrientation;
   private boolean enabled;
   private boolean legacyMode;
   private int minimumInterval;
   private final Resources resources;
   private int sensitivity;
   private final SensorManager sensorManager;
   private long timeLastShook;
   private final WindowManager windowManager;
   private float xAccel;
   private float yAccel;
   private float zAccel;

   public AccelerometerSensor(ComponentContainer var1) {
      super(var1.$form());
      LinkedList var2 = new LinkedList();
      this.X_CACHE = var2;
      LinkedList var3 = new LinkedList();
      this.Y_CACHE = var3;
      LinkedList var4 = new LinkedList();
      this.Z_CACHE = var4;
      this.legacyMode = false;
      this.form.registerForOnResume(this);
      this.form.registerForOnPause(this);
      this.enabled = true;
      this.resources = var1.$context().getResources();
      this.windowManager = (WindowManager)var1.$context().getSystemService("window");
      this.sensorManager = (SensorManager)var1.$context().getSystemService("sensor");
      this.accelerometerSensor = this.sensorManager.getDefaultSensor(1);
      Handler var5 = new Handler();
      this.androidUIHandler = var5;
      this.startListening();
      this.MinimumInterval(400);
      this.Sensitivity(2);
   }

   private void addToSensorCache(Queue var1, float var2) {
      if(var1.size() >= 10) {
         var1.remove();
      }

      var1.add(Float.valueOf(var2));
   }

   private boolean isShaking(Queue var1, float var2) {
      float var3 = 0.0F;

      for(Iterator var4 = var1.iterator(); var4.hasNext(); var3 += ((Float)var4.next()).floatValue()) {
         ;
      }

      float var5 = var3 / (float)var1.size();
      return this.Sensitivity() == 1?(double)Math.abs(var5 - var2) > 20.0D:(this.Sensitivity() == 2?(double)Math.abs(var5 - var2) > 13.0D && (double)Math.abs(var5 - var2) < 20.0D:(double)Math.abs(var5 - var2) > 5.0D && (double)Math.abs(var5 - var2) < 13.0D);
   }

   private void startListening() {
      Handler var1 = this.androidUIHandler;
      Runnable var2 = new Runnable() {
         // $FF: synthetic field
         private AccelerometerSensor hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AccelerometerSensor.this;

         public final void run() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.deviceDefaultOrientation = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getDeviceDefaultOrientation();
            StringBuilder var2 = new StringBuilder("deviceDefaultOrientation = ");
            Log.d("AccelerometerSensor", var2.append(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.deviceDefaultOrientation).toString());
            Log.d("AccelerometerSensor", "Configuration.ORIENTATION_LANDSCAPE = 2");
            Log.d("AccelerometerSensor", "Configuration.ORIENTATION_PORTRAIT = 1");
         }
      };
      var1.postDelayed(var2, 32L);
      this.sensorManager.registerListener(this, this.accelerometerSensor, 1);
   }

   private void stopListening() {
      this.sensorManager.unregisterListener(this);
   }

   @SimpleEvent
   public void AccelerationChanged(float var1, float var2, float var3) {
      this.xAccel = var1;
      this.yAccel = var2;
      this.zAccel = var3;
      this.addToSensorCache(this.X_CACHE, var1);
      this.addToSensorCache(this.Y_CACHE, var2);
      this.addToSensorCache(this.Z_CACHE, var3);
      long var4 = System.currentTimeMillis();
      if((this.isShaking(this.X_CACHE, var1) || this.isShaking(this.Y_CACHE, var2) || this.isShaking(this.Z_CACHE, var3)) && (this.timeLastShook == 0L || var4 >= this.timeLastShook + (long)this.minimumInterval)) {
         this.timeLastShook = var4;
         this.Shaking();
      }

      Object[] var6 = new Object[]{Float.valueOf(var1), Float.valueOf(var2), Float.valueOf(var3)};
      EventDispatcher.dispatchEvent(this, "AccelerationChanged", var6);
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public boolean Available() {
      return this.sensorManager.getSensorList(1).size() > 0;
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "boolean"
   )
   @SimpleProperty
   public void Enabled(boolean var1) {
      if(this.enabled != var1) {
         this.enabled = var1;
         if(var1) {
            this.startListening();
         } else {
            this.stopListening();
         }
      }
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public boolean Enabled() {
      return this.enabled;
   }

   @DesignerProperty(
      defaultValue = "False",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "Prior to the release that added this property the AccelerometerSensor component passed through sensor values directly as received from the Android system. However these values do not compensate for tablets that default to Landscape mode, requiring the MIT App Inventor programmer to compensate. However compensating would result in incorrect results in Portrait mode devices such as phones. We now detect Landscape mode tablets and perform the compensation. However if your project is already compensating for the change, you will now get incorrect results. Although our preferred solution is for you to update your project, you can also just set this property to “true” and our compensation code will be deactivated. Note: We recommend that you update your project as we may remove this property in a future release.",
      userVisible = false
   )
   public void LegacyMode(boolean var1) {
      this.legacyMode = var1;
   }

   public boolean LegacyMode() {
      return this.legacyMode;
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR,
      description = "The minimum interval, in milliseconds, between phone shakes"
   )
   public int MinimumInterval() {
      return this.minimumInterval;
   }

   @DesignerProperty(
      defaultValue = "400",
      editorType = "non_negative_integer"
   )
   @SimpleProperty
   public void MinimumInterval(int var1) {
      this.minimumInterval = var1;
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "A number that encodes how sensitive the accelerometer is. The choices are: 1 = weak, 2 = moderate,  3 = strong."
   )
   public int Sensitivity() {
      return this.sensitivity;
   }

   @DesignerProperty(
      defaultValue = "2",
      editorType = "accelerometer_sensitivity"
   )
   @SimpleProperty
   public void Sensitivity(int var1) {
      if(var1 != 1 && var1 != 2 && var1 != 3) {
         Form var2 = this.form;
         Object[] var3 = new Object[]{Integer.valueOf(var1)};
         var2.dispatchErrorOccurredEvent(this, "Sensitivity", 1901, var3);
      } else {
         this.sensitivity = var1;
      }
   }

   @SimpleEvent
   public void Shaking() {
      EventDispatcher.dispatchEvent(this, "Shaking", new Object[0]);
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public float XAccel() {
      return this.xAccel;
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public float YAccel() {
      return this.yAccel;
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public float ZAccel() {
      return this.zAccel;
   }

   public int getDeviceDefaultOrientation() {
      Configuration var1 = this.resources.getConfiguration();
      int var2 = this.windowManager.getDefaultDisplay().getRotation();
      Log.d("AccelerometerSensor", "rotation = ".concat(String.valueOf(var2)));
      StringBuilder var4 = new StringBuilder("config.orientation = ");
      Log.d("AccelerometerSensor", var4.append(var1.orientation).toString());
      return (var2 != 0 && var2 != 2 || var1.orientation != 2) && (var2 != 1 && var2 != 3 || var1.orientation != 1)?1:2;
   }

   public void onAccuracyChanged(Sensor var1, int var2) {
   }

   public void onDelete() {
      if(this.enabled) {
         this.stopListening();
      }

   }

   public void onPause() {
      if(this.enabled) {
         this.stopListening();
      }

   }

   public void onResume() {
      if(this.enabled) {
         this.startListening();
      }

   }

   public void onSensorChanged(SensorEvent var1) {
      if(this.enabled) {
         float[] var2 = var1.values;
         if(this.deviceDefaultOrientation == 2 && !this.legacyMode) {
            this.xAccel = var2[1];
            this.yAccel = -var2[0];
         } else {
            this.xAccel = var2[0];
            this.yAccel = var2[1];
         }

         this.zAccel = var2[2];
         this.accuracy = var1.accuracy;
         this.AccelerationChanged(this.xAccel, this.yAccel, this.zAccel);
      }

   }
}
