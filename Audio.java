package com.google.appinventor.components.runtime;

import android.content.Context;
import android.media.AudioManager;
import android.util.Log;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.UsesPermissions;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;

@DesignerComponent(
   category = ComponentCategory.UTILITIES,
   description = "",
   iconName = "images/audio.png",
   nonVisible = true,
   version = 3
)
@SimpleObject
@UsesPermissions(
   permissionNames = "android.permission.MODIFY_AUDIO_SETTINGS"
)
public class Audio extends AndroidNonvisibleComponent implements Component {
   private boolean KbzcIEn6WDqjdY1QBot1TMrBwhEYy4xAUKG2cbzQ22VNohlOtuBGKUJsEeMNZyEH = false;
   private ComponentContainer container;
   private Context context;
   private AudioManager hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

   public Audio(ComponentContainer var1) {
      super(var1.$form());
      this.container = var1;
      this.context = var1.$context();
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = (AudioManager)this.context.getSystemService("audio");
      Log.d("Audio", "Audio Created");
   }

   @SimpleEvent(
      description = "Event triggered when a error occurred."
   )
   public void ErrorOccurred(String var1) {
      EventDispatcher.dispatchEvent(this, "ErrorOccurred", new Object[]{var1});
   }

   @SimpleProperty(
      description = "Returns the current audio mode as string. Possible returns are \"NORMAL\", \"RINGTONE\", \"CALL\" or \"COMMUNICATION\"."
   )
   public String GetAudioMode() {
      int var1 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getMode();
      String var2 = "Not found";
      switch(var1) {
      case 0:
         var2 = "NORMAL";
         break;
      case 1:
         var2 = "RINGTONE";
         break;
      case 2:
         var2 = "CALL";
         break;
      case 3:
         var2 = "COMMUNICATION";
      }

      return var2;
   }

   @SimpleFunction(
      description = "Returns true whether a component should have sound effects enabled for events such as clicking and touching."
   )
   public boolean IsSoundEffectsEnabled(AndroidViewComponent var1) {
      return var1.getView().isSoundEffectsEnabled();
   }

   @SimpleFunction(
      description = "Sets the ringer mode to \"normal\"."
   )
   public void RingerModeNormal() {
      try {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setRingerMode(2);
      } catch (Exception var4) {
         Log.e("Audio", String.valueOf(var4));
         StringBuilder var3 = new StringBuilder();
         this.ErrorOccurred(var3.append(var4.getMessage()).toString());
      }
   }

   @SimpleFunction(
      description = "Sets the ringer mode to \"silent\"."
   )
   public void RingerModeSilent() {
      try {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setRingerMode(0);
      } catch (Exception var4) {
         Log.e("Audio", String.valueOf(var4));
         StringBuilder var3 = new StringBuilder();
         this.ErrorOccurred(var3.append(var4.getMessage()).toString());
      }
   }

   @SimpleFunction(
      description = "Sets the ringer mode to \"vibrate\"."
   )
   public void RingerModeVibrate() {
      try {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setRingerMode(1);
      } catch (Exception var4) {
         Log.e("Audio", String.valueOf(var4));
         StringBuilder var3 = new StringBuilder();
         this.ErrorOccurred(var3.append(var4.getMessage()).toString());
      }
   }

   @DesignerProperty(
      defaultValue = "False",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "If set to true you will see system ui."
   )
   public void ShowUI(boolean var1) {
      this.KbzcIEn6WDqjdY1QBot1TMrBwhEYy4xAUKG2cbzQ22VNohlOtuBGKUJsEeMNZyEH = var1;
   }

   @SimpleProperty
   public boolean ShowUI() {
      return this.KbzcIEn6WDqjdY1QBot1TMrBwhEYy4xAUKG2cbzQ22VNohlOtuBGKUJsEeMNZyEH;
   }

   @SimpleFunction(
      description = "Set whether a component should have sound effects enabled for events such as clicking and touching."
   )
   public void SoundEffectsEnabled(AndroidViewComponent var1, boolean var2) {
      var1.getView().setSoundEffectsEnabled(var2);
   }

   @SimpleProperty(
      description = "Returns the current volume index in percent."
   )
   public int VolumeAlarm() {
      int var1 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getStreamVolume(4);
      int var2 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getStreamMaxVolume(4);
      return var1 * 100 / var2;
   }

   @SimpleProperty(
      description = "Sets the volume index for a particular stream in percent."
   )
   public void VolumeAlarm(int var1) {
      byte var2 = 1;
      if(!this.KbzcIEn6WDqjdY1QBot1TMrBwhEYy4xAUKG2cbzQ22VNohlOtuBGKUJsEeMNZyEH) {
         var2 = 0;
      }

      int var3 = var1 * this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getStreamMaxVolume(4) / 100;
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setStreamVolume(4, var3, var2);
   }

   @SimpleProperty(
      description = "Returns the current volume index in percent."
   )
   public int VolumeMusic() {
      int var1 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getStreamVolume(3);
      int var2 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getStreamMaxVolume(3);
      return var1 * 100 / var2;
   }

   @SimpleProperty(
      description = "Sets the volume index for a particular stream in percent."
   )
   public void VolumeMusic(int var1) {
      byte var2 = 1;
      if(!this.KbzcIEn6WDqjdY1QBot1TMrBwhEYy4xAUKG2cbzQ22VNohlOtuBGKUJsEeMNZyEH) {
         var2 = 0;
      }

      int var3 = var1 * this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getStreamMaxVolume(3) / 100;
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setStreamVolume(3, var3, var2);
   }

   @SimpleProperty(
      description = "Returns the current volume index in percent."
   )
   public int VolumeRing() {
      int var1 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getStreamVolume(2);
      int var2 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getStreamMaxVolume(2);
      return var1 * 100 / var2;
   }

   @SimpleProperty(
      description = "Sets the volume index for a particular stream in percent."
   )
   public void VolumeRing(int var1) {
      byte var2 = 1;
      if(!this.KbzcIEn6WDqjdY1QBot1TMrBwhEYy4xAUKG2cbzQ22VNohlOtuBGKUJsEeMNZyEH) {
         var2 = 0;
      }

      int var3 = var1 * this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getStreamMaxVolume(2) / 100;
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setStreamVolume(2, var3, var2);
   }
}
