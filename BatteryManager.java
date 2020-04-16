package com.google.appinventor.components.runtime;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.OnDestroyListener;
import com.google.appinventor.components.runtime.OnResumeListener;
import com.google.appinventor.components.runtime.OnStopListener;
import com.google.appinventor.components.runtime.util.YailList;
import java.util.ArrayList;
import java.util.Collections;

@DesignerComponent(
   category = ComponentCategory.UTILITIES,
   description = "",
   iconName = "images/batterymanager.png",
   nonVisible = true,
   version = 1
)
@SimpleObject
public class BatteryManager extends AndroidNonvisibleComponent implements Component, OnDestroyListener, OnResumeListener, OnStopListener {
   private String ANz72NxTeEmYo9CF87MXRUuH7WvE4u0mpZwxffTnyiMdygEQRKvmdTCHaXqAvud = "";
   private float B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T = 0.0F;
   private boolean LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn = false;
   private String PpoaLB2hgzDTOuqu9FkRmbGOAi4DOSz44cSb2WOQzHfJN0AfA0f9dWyZXVLXkHHC;
   private String TAG = "BatteryManager";
   private final ComponentContainer container;
   private float hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = 0.0F;
   private BroadcastReceiver hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private String moH2L3ThNq0Qhevz3oD0wpnUoXefdMi3gJ5JHfEbjrtgsvRvpM1e34BZQYI4s5i0 = "";
   private String tee1T53LBirhPaiZzuBv7do2U2eC3n16AtczACNW2pKYEGgDhkkMv1hGUupyoKZE;
   private boolean vOibdtOfNxMVixWab9VDGgvD9L4Kqb2ZDQBius3PMdhiP1dPN68Z9GzWJA49TUbE;
   private int vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq = 0;
   private int wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou = 0;

   public BatteryManager(ComponentContainer var1) {
      super(var1.$form());
      BroadcastReceiver var2 = new BroadcastReceiver() {
         // $FF: synthetic field
         private BatteryManager hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = BatteryManager.this;

         public final void onReceive(Context var1, Intent var2) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.moH2L3ThNq0Qhevz3oD0wpnUoXefdMi3gJ5JHfEbjrtgsvRvpM1e34BZQYI4s5i0 = BatteryManager.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou(var2.getIntExtra("health", 0));
            int var4 = var2.getIntExtra("plugged", 0);
            if(var4 == 2) {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.tee1T53LBirhPaiZzuBv7do2U2eC3n16AtczACNW2pKYEGgDhkkMv1hGUupyoKZE = "USB";
            } else if(var4 == 1) {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.tee1T53LBirhPaiZzuBv7do2U2eC3n16AtczACNW2pKYEGgDhkkMv1hGUupyoKZE = "AC";
            } else {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.tee1T53LBirhPaiZzuBv7do2U2eC3n16AtczACNW2pKYEGgDhkkMv1hGUupyoKZE = "UNKNOWN";
            }

            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn = var2.getExtras().getBoolean("present");
            int var7 = var2.getIntExtra("scale", 0);
            BatteryManager var8 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
            int var9 = 100 * var2.getIntExtra("level", 0);
            int var10;
            if(var7 == 0) {
               var10 = 1;
            } else {
               var10 = var7;
            }

            var8.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou = var9 / var10;
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq = var2.getIntExtra("status", 0);
            BatteryManager var13 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
            String var14;
            if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq != 2 && this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq != 5) {
               var14 = "NOT_CHARGING";
            } else {
               var14 = "IS_CHARGING";
            }

            var13.PpoaLB2hgzDTOuqu9FkRmbGOAi4DOSz44cSb2WOQzHfJN0AfA0f9dWyZXVLXkHHC = var14;
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.ANz72NxTeEmYo9CF87MXRUuH7WvE4u0mpZwxffTnyiMdygEQRKvmdTCHaXqAvud = var2.getExtras().getString("technology");
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = (float)var2.getIntExtra("temperature", 0) / 10.0F;
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T = (float)var2.getIntExtra("voltage", 0) / 1000.0F;
         }
      };
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var2;
      this.form.registerForOnStop(this);
      this.form.registerForOnResume(this);
      this.form.registerForOnDestroy(this);
      this.container = var1;
   }

   private void hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME() {
      this.vOibdtOfNxMVixWab9VDGgvD9L4Kqb2ZDQBius3PMdhiP1dPN68Z9GzWJA49TUbE = false;
      if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME != null) {
         try {
            this.container.$context().unregisterReceiver(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
            return;
         } catch (Exception var2) {
            ;
         }
      }

   }

   // $FF: synthetic method
   static String wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou(int var0) {
      switch(var0) {
      case 1:
         return "UNKNOWN";
      case 2:
         return "GOOD";
      case 3:
         return "OVERHEAT";
      case 4:
         return "DEAD";
      case 5:
         return "OVER_VOLTAGE";
      case 6:
         return "UNSPECIFIED_FAILURE";
      case 7:
         return "COLD";
      default:
         return "UNKNOWN";
      }
   }

   @SimpleProperty(
      description = "Returns battery health. It can be: COLD, DEAD, GOOD, OVERHEAT, OVER_VOLTAGE, UNKNOWN"
   )
   public String BatteryHealth() {
      return this.moH2L3ThNq0Qhevz3oD0wpnUoXefdMi3gJ5JHfEbjrtgsvRvpM1e34BZQYI4s5i0;
   }

   @SimpleProperty(
      description = "Returns battery percentage level"
   )
   public int BatteryLevel() {
      return this.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou;
   }

   @SimpleProperty(
      description = "Indicating whether the device is plugged in to a power source. Can be USB, AC or UNKNOWN"
   )
   public String BatteryPlugged() {
      return this.tee1T53LBirhPaiZzuBv7do2U2eC3n16AtczACNW2pKYEGgDhkkMv1hGUupyoKZE;
   }

   @SimpleProperty(
      description = "Indicating whether a battery is present"
   )
   public boolean BatteryPresent() {
      return this.LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn;
   }

   @SimpleProperty(
      description = "Indicating battery temperature in Centigrade"
   )
   public float BatteryTemperature() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   }

   @SimpleProperty(
      description = "Indicating battery voltage in Volts"
   )
   public float BatteryVoltage() {
      return this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T;
   }

   @SimpleFunction(
      description = "Returns a list showing battery info for the specified key. Key can be: HEALTH, LEVEL, PLUGGED, PRESENT, STATUS, CHARGE_STATUS, TECHNOLOGY, TEMPERATURE, VOLTAGE. If key is empty, then all battery info is returned."
   )
   public YailList GetBatteryInfo(String var1) {
      String var2 = var1.toLowerCase().trim();
      String var3;
      if(var2.equals("")) {
         var3 = "all";
      } else {
         var3 = var2;
      }

      ArrayList var5 = new ArrayList();
      if(var3.equals("all") || var3.equals("health")) {
         StringBuilder var6 = new StringBuilder("HEALTH=");
         var5.add(var6.append(this.moH2L3ThNq0Qhevz3oD0wpnUoXefdMi3gJ5JHfEbjrtgsvRvpM1e34BZQYI4s5i0).toString());
      }

      if(var3.equals("all") || var3.equals("level")) {
         StringBuilder var8 = new StringBuilder("LEVEL=");
         var5.add(var8.append(this.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou).toString());
      }

      if(var3.equals("all") || var3.equals("plugged")) {
         StringBuilder var10 = new StringBuilder("PLUGGED=");
         var5.add(var10.append(this.tee1T53LBirhPaiZzuBv7do2U2eC3n16AtczACNW2pKYEGgDhkkMv1hGUupyoKZE).toString());
      }

      if(var3.equals("all") || var3.equals("present")) {
         StringBuilder var12 = new StringBuilder("PRESENT=");
         var5.add(var12.append(this.LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn).toString());
      }

      if(var3.equals("all") || var3.equals("status")) {
         StringBuilder var14 = new StringBuilder("STATUS=");
         var5.add(var14.append(this.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq).toString());
      }

      if(var3.equals("all") || var3.equals("charge_status")) {
         StringBuilder var16 = new StringBuilder("CHARGE_STATUS=");
         var5.add(var16.append(this.PpoaLB2hgzDTOuqu9FkRmbGOAi4DOSz44cSb2WOQzHfJN0AfA0f9dWyZXVLXkHHC).toString());
      }

      if(var3.equals("all") || var3.equals("technology")) {
         StringBuilder var18 = new StringBuilder("TECHNOLOGY=");
         var5.add(var18.append(this.ANz72NxTeEmYo9CF87MXRUuH7WvE4u0mpZwxffTnyiMdygEQRKvmdTCHaXqAvud).toString());
      }

      if(var3.equals("all") || var3.equals("temperature")) {
         StringBuilder var20 = new StringBuilder("TEMPERATURE=");
         var5.add(var20.append(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME).toString());
      }

      if(var3.equals("all") || var3.equals("voltage")) {
         StringBuilder var22 = new StringBuilder("VOLTAGE=");
         var5.add(var22.append(this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T).toString());
      }

      Collections.sort(var5);
      return YailList.makeList(var5);
   }

   @DesignerProperty(
      defaultValue = "False",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "Starts or stops monitoring battery data. StartMonitoring only when you need to get information."
   )
   public void StartMonitoring(boolean var1) {
      this.vOibdtOfNxMVixWab9VDGgvD9L4Kqb2ZDQBius3PMdhiP1dPN68Z9GzWJA49TUbE = var1;
      if(this.vOibdtOfNxMVixWab9VDGgvD9L4Kqb2ZDQBius3PMdhiP1dPN68Z9GzWJA49TUbE) {
         IntentFilter var2 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
         this.container.$context().registerReceiver(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var2);
      } else {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME();
      }
   }

   public void onDestroy() {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME();
   }

   public void onResume() {
      this.StartMonitoring(this.vOibdtOfNxMVixWab9VDGgvD9L4Kqb2ZDQBius3PMdhiP1dPN68Z9GzWJA49TUbE);
   }

   public void onStop() {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME();
   }
}
