package com.google.appinventor.components.runtime;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import com.amazon.device.ads.Ad;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdLayout;
import com.amazon.device.ads.AdListener;
import com.amazon.device.ads.AdProperties;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.AdSize;
import com.amazon.device.ads.AdTargetingOptions;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.UsesLibraries;
import com.google.appinventor.components.annotations.UsesPermissions;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.OnDestroyListener;
import com.google.appinventor.components.runtime.PermissionResultHandler;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.util.KodularContentProtection;
import com.google.appinventor.components.runtime.util.KodularContentProtection$OnValidationResultListener;

@DesignerComponent(
   category = ComponentCategory.ADVERTISING,
   description = "AdAmazon component allows you to monetize your app. You must have a valid publisher id that can be obtained from https://developer.amazon.com. If your publisher id is invalid, the AdAmazon banner will not display on the emulator or the device.",
   helpUrl = "https://docs.kodular.io/components/monetization/amazon-banner/",
   iconName = "images/amazon.png",
   version = 1
)
@SimpleObject
@UsesLibraries(
   libraries = "amazon-ads.jar"
)
@UsesPermissions(
   permissionNames = "android.permission.INTERNET, android.permission.ACCESS_NETWORK_STATE, android.permission.ACCESS_FINE_LOCATION, android.permission.ACCESS_COARSE_LOCATION, android.permission.ACCESS_WIFI_STATE"
)
public class AdAmazon extends AndroidViewComponent implements AdListener, OnDestroyListener {
   private boolean B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T;
   private String KbzcIEn6WDqjdY1QBot1TMrBwhEYy4xAUKG2cbzQ22VNohlOtuBGKUJsEeMNZyEH = "AmazonPublisherId";
   private String TAG = "AdAmazon";
   private final Handler androidUIHandler;
   private Form form;
   private boolean havePermission;
   private AdLayout hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private boolean hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = true;
   private KodularContentProtection kodularContentProtection;

   public AdAmazon(ComponentContainer var1) {
      super(var1);
      Handler var2 = new Handler();
      this.androidUIHandler = var2;
      this.havePermission = false;
      this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T = true;
      this.form = var1.$form();
      AdLayout var3 = new AdLayout(var1.$context(), AdSize.SIZE_320x50);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var3;
      AdLayout var4 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
      LayoutParams var5 = new LayoutParams(-1, -2);
      var4.setLayoutParams(var5);
      var1.$add(this);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setListener(this);
      this.TestMode(true);
      this.RefreshAd(true);
      KodularContentProtection var6 = new KodularContentProtection(var1.$context());
      this.kodularContentProtection = var6;
      KodularContentProtection var7 = this.kodularContentProtection;
      KodularContentProtection$OnValidationResultListener var8 = new KodularContentProtection$OnValidationResultListener() {
         // $FF: synthetic field
         private AdAmazon hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AdAmazon.this;

         public final void onResult(boolean var1, boolean var2, String var3) {
            if(var1 && var2) {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T);
            } else if(var1 && !var2) {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdFailedToLoad("101", var3);
            } else if(!var1) {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdFailedToLoad("102", var3);
            } else {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdFailedToLoad("103", var3);
            }
         }
      };
      var7.setOnValidationResultListener(var8);
   }

   private void hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(boolean var1) {
      if(var1) {
         try {
            AdTargetingOptions var2 = new AdTargetingOptions();
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.loadAd(var2);
            return;
         } catch (PermissionException var7) {
            this.form.dispatchPermissionDeniedEvent(this, "RefreshAd", var7);
            this.AdFailedToLoad("PERMISSION_ERROR", "Permission \"android.permission.ACCESS_FINE_LOCATION\" was denied but needed.");
            return;
         } catch (Exception var8) {
            StringBuilder var4 = new StringBuilder();
            Log.e("AdAmazon", var4.append(var8.getMessage()).toString());
         }
      }

   }

   @SimpleEvent(
      description = "Event to detect that a ad was dismissed."
   )
   public void AdDismissed() {
      EventDispatcher.dispatchEvent(this, "AdDismissed", new Object[0]);
   }

   @SimpleEvent(
      description = "Event to detect that a ad was expanded."
   )
   public void AdExpanded() {
      EventDispatcher.dispatchEvent(this, "AdExpanded", new Object[0]);
   }

   @SimpleEvent(
      description = "Event to detect that the try to load a ad was not successful."
   )
   public void AdFailedToLoad(String var1, String var2) {
      EventDispatcher.dispatchEvent(this, "AdFailedToLoad", new Object[]{var1, var2});
   }

   @SimpleEvent(
      description = "Event to detect that a ad was loaded."
   )
   public void AdLoaded() {
      EventDispatcher.dispatchEvent(this, "AdLoaded", new Object[0]);
   }

   public int Height() {
      return this.getView().getHeight();
   }

   public void Height(int var1) {
      this.container.setChildHeight(this, var1);
   }

   public void HeightPercent(int var1) {
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public String PublisherId() {
      return this.KbzcIEn6WDqjdY1QBot1TMrBwhEYy4xAUKG2cbzQ22VNohlOtuBGKUJsEeMNZyEH;
   }

   @DesignerProperty(
      defaultValue = "AmazonPublisherId",
      editorType = "string"
   )
   @SimpleProperty(
      description = "Sets the Amazon Ad Publisher Id and refreshes the ad."
   )
   public void PublisherId(String var1) {
      String var2 = var1.trim();
      this.KbzcIEn6WDqjdY1QBot1TMrBwhEYy4xAUKG2cbzQ22VNohlOtuBGKUJsEeMNZyEH = var2;
      AdRegistration.setAppKey(var2);
      this.RefreshAd(true);
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "Refreshes the ad."
   )
   public void RefreshAd(boolean var1) {
      this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T = var1;
      if(!this.havePermission) {
         Handler var2 = this.androidUIHandler;
         Runnable var3 = new Runnable() {
            public final void run() {
               Form var1 = AdAmazon.this.form;
               PermissionResultHandler var2 = new PermissionResultHandler() {
                  // $FF: synthetic field
                  private <undefinedtype> hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = <VAR_NAMELESS_ENCLOSURE>;

                  public final void HandlePermissionResponse(String var1, boolean var2) {
                     if(var2) {
                        AdAmazon.this.havePermission = true;
                        AdAmazon.this.kodularContentProtection.startContentValidation(AdAmazon.this.form.getAppId());
                     } else {
                        AdAmazon.this.havePermission = false;
                        AdAmazon.this.form.dispatchPermissionDeniedEvent(AdAmazon.this, "RefreshAd", "android.permission.ACCESS_FINE_LOCATION");
                     }
                  }
               };
               var1.askPermission("android.permission.ACCESS_FINE_LOCATION", var2);
            }
         };
         var2.post(var3);
      } else {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(var1);
      }
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "boolean"
   )
   @SimpleProperty
   public void TestMode(boolean var1) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var1;
      AdRegistration.enableLogging(var1);
      AdRegistration.enableTesting(var1);
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public boolean TestMode() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   }

   public int Width() {
      return this.getView().getWidth();
   }

   public void Width(int var1) {
      this.container.setChildWidth(this, var1);
   }

   public void WidthPercent(int var1) {
   }

   public View getView() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   }

   public void onAdCollapsed(Ad var1) {
      Log.i(this.TAG, "Ad collapsed.");
      this.AdDismissed();
   }

   public void onAdDismissed(Ad var1) {
      Log.i(this.TAG, "Ad Dismissed.");
      this.AdDismissed();
   }

   public void onAdExpanded(Ad var1) {
      Log.i(this.TAG, "Ad expanded.");
      this.AdExpanded();
   }

   public void onAdFailedToLoad(Ad var1, AdError var2) {
      StringBuilder var3 = new StringBuilder("Ad failed to load. Code: ");
      Log.w("AmazonInterstitialAds", var3.append(var2.getCode()).append(", Message: ").append(var2.getMessage()).toString());
      this.AdFailedToLoad(var2.getCode().toString(), var2.getMessage());
   }

   public void onAdLoaded(Ad var1, AdProperties var2) {
      String var3 = this.TAG;
      StringBuilder var4 = new StringBuilder();
      Log.i(var3, var4.append(var2.getAdType().toString()).append(" ad loaded successfully.").toString());
      this.AdLoaded();
   }

   public void onDestroy() {
      if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME != null) {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.destroy();
      }

   }
}
