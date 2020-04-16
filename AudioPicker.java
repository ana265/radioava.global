package com.google.appinventor.components.runtime;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore.Audio.Media;
import android.util.Log;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.UsesPermissions;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.ActivityResultListener;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.PermissionResultHandler;
import com.google.appinventor.components.runtime.Picker;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.util.AnimationUtil;

@DesignerComponent(
   category = ComponentCategory.MEDIA,
   description = "A special-purpose button. When the user taps an audio picker, the device\'s audio gallery appears, and the user can choose an audio file.",
   version = 6
)
@SimpleObject
@UsesPermissions(
   permissionNames = "android.permission.READ_EXTERNAL_STORAGE"
)
public class AudioPicker extends Picker implements ActivityResultListener {
   private Context context;
   private Form form;
   private String oDikMCstR6tlR2dTNi9SmHhjXnOW8gvVc7RVCpamOJDxjRqCmBMqmRVoMYhtpjS = "";

   public AudioPicker(ComponentContainer var1) {
      super(var1);
      this.context = var1.$context();
      this.form = var1.$form();
      Log.d("AudioPicker", "AudioPicker Created");
   }

   private String hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(Uri param1) {
      // $FF: Couldn't be decompiled
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR,
      description = "Path to the file containing the audio file that was selected."
   )
   public String Selection() {
      return this.oDikMCstR6tlR2dTNi9SmHhjXnOW8gvVc7RVCpamOJDxjRqCmBMqmRVoMYhtpjS;
   }

   public void click() {
      Form var1 = this.form;
      PermissionResultHandler var2 = new PermissionResultHandler() {
         // $FF: synthetic field
         private AudioPicker hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AudioPicker.this;

         public final void HandlePermissionResponse(String var1, boolean var2) {
            if(var2) {
               try {
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.BeforePicking();
                  if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.requestCode == 0) {
                     this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.requestCode = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.container.$form().registerForActivityResult(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
                  }

                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.container.$context().startActivityForResult(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getIntent(), this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.requestCode);
                  String var6 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.container.$form().getOpenAnimType();
                  AnimationUtil.ApplyOpenScreenAnimation(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.container.$context(), var6);
               } catch (PermissionException var7) {
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.form.dispatchPermissionDeniedEvent(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, "Open", var7);
               } catch (Exception var8) {
                  Log.e("AudioPicker", String.valueOf(var8));
               }
            } else {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.form.dispatchPermissionDeniedEvent(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, "Open", var1);
            }
         }
      };
      var1.askPermission("android.permission.READ_EXTERNAL_STORAGE", var2);
   }

   protected Intent getIntent() {
      Intent var1 = new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI);
      return var1;
   }

   public void resultReturned(int var1, int var2, Intent var3) {
      if(var1 == this.requestCode && var2 == -1) {
         this.oDikMCstR6tlR2dTNi9SmHhjXnOW8gvVc7RVCpamOJDxjRqCmBMqmRVoMYhtpjS = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(var3.getData());
         this.AfterPicking(this.oDikMCstR6tlR2dTNi9SmHhjXnOW8gvVc7RVCpamOJDxjRqCmBMqmRVoMYhtpjS);
      }

   }
}
