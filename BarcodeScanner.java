package com.google.appinventor.components.runtime;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.UsesActivities;
import com.google.appinventor.components.annotations.UsesLibraries;
import com.google.appinventor.components.annotations.UsesPermissions;
import com.google.appinventor.components.annotations.androidmanifest.ActivityElement;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.ActivityResultListener;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.PermissionResultHandler;
import com.google.appinventor.components.runtime.util.SdkLevel;

@DesignerComponent(
   category = ComponentCategory.SENSORS,
   description = "Component for using the Barcode Scanner to read a barcode",
   iconName = "images/barcodeScanner.png",
   nonVisible = true,
   version = 2
)
@SimpleObject
@UsesActivities(
   activities = {      @ActivityElement(
         configChanges = "orientation|keyboardHidden",
         name = "com.google.zxing.client.android.AppInvCaptureActivity",
         screenOrientation = "landscape",
         stateNotNeeded = "true",
         theme = "@android:style/Theme.NoTitleBar.Fullscreen",
         windowSoftInputMode = "stateAlwaysHidden"
      )}
)
@UsesLibraries(
   libraries = "Barcode.jar,core.jar"
)
@UsesPermissions(
   permissionNames = "android.permission.CAMERA"
)
public class BarcodeScanner extends AndroidNonvisibleComponent implements ActivityResultListener, Component {
   private boolean F0SK4gPRNmAI2jCyU6DpJpRxlfo5Y8j9ZujjeLuDeDzReJBeSNN2RZtCnkXv1dho = false;
   private final ComponentContainer container;
   private boolean havePermission = false;
   private String l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j = "";
   private int requestCode;

   public BarcodeScanner(ComponentContainer var1) {
      super(var1.$form());
      this.container = var1;
   }

   // $FF: synthetic method
   static boolean hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(BarcodeScanner var0) {
      var0.havePermission = true;
      return true;
   }

   @SimpleEvent
   public void AfterScan(String var1) {
      EventDispatcher.dispatchEvent(this, "AfterScan", new Object[]{var1});
   }

   @SimpleFunction(
      description = "Begins a barcode scan, using the camera. When the scan is complete, the AfterScan event will be raised."
   )
   public void DoScan() {
      Intent var1 = new Intent("com.google.zxing.client.android.SCAN");
      if(!this.F0SK4gPRNmAI2jCyU6DpJpRxlfo5Y8j9ZujjeLuDeDzReJBeSNN2RZtCnkXv1dho && SdkLevel.getLevel() >= 5) {
         if(!this.havePermission) {
            Form var6 = this.container.$form();
            PermissionResultHandler var7 = new PermissionResultHandler() {
               // $FF: synthetic field
               private BarcodeScanner hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = BarcodeScanner.this;

               public final void HandlePermissionResponse(String var1, boolean var2) {
                  if(var2) {
                     BarcodeScanner.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
                     this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.DoScan();
                  } else {
                     this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.form.dispatchPermissionDeniedEvent(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, "DoScan", "android.permission.CAMERA");
                  }
               }
            };
            var6.askPermission("android.permission.CAMERA", var7);
            return;
         }

         String var3 = this.container.$form().getPackageName();
         ComponentName var4 = new ComponentName(var3, "com.google.zxing.client.android.AppInvCaptureActivity");
         var1.setComponent(var4);
      }

      if(this.requestCode == 0) {
         this.requestCode = this.form.registerForActivityResult(this);
      }

      try {
         this.container.$context().startActivityForResult(var1, this.requestCode);
      } catch (ActivityNotFoundException var8) {
         this.container.$form().dispatchErrorOccurredEvent(this, "BarcodeScanner", 1501, new Object[]{""});
      }
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR,
      description = "Text result of the previous scan."
   )
   public String Result() {
      return this.l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j;
   }

   @DesignerProperty(
      defaultValue = "False",
      editorType = "boolean"
   )
   @SimpleProperty
   public void UseExternalScanner(boolean var1) {
      this.F0SK4gPRNmAI2jCyU6DpJpRxlfo5Y8j9ZujjeLuDeDzReJBeSNN2RZtCnkXv1dho = var1;
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR,
      description = "If true App Inventor will look for and use an external scanning program such as \"Bar Code Scanner.\""
   )
   public boolean UseExternalScanner() {
      return this.F0SK4gPRNmAI2jCyU6DpJpRxlfo5Y8j9ZujjeLuDeDzReJBeSNN2RZtCnkXv1dho;
   }

   public void resultReturned(int var1, int var2, Intent var3) {
      if(var1 == this.requestCode && var2 == -1) {
         if(var3.hasExtra("SCAN_RESULT")) {
            this.l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j = var3.getStringExtra("SCAN_RESULT");
         } else {
            this.l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j = "";
         }

         this.AfterScan(this.l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j);
      }

   }
}
