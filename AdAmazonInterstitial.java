package com.google.appinventor.components.runtime;

import android.os.Handler;
import android.util.Log;
import com.amazon.device.ads.Ad;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdProperties;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.AdTargetingOptions;
import com.amazon.device.ads.DefaultAdListener;
import com.amazon.device.ads.InterstitialAd;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.UsesLibraries;
import com.google.appinventor.components.annotations.UsesPermissions;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.PermissionResultHandler;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.util.KodularAdsCommission;
import com.google.appinventor.components.runtime.util.KodularContentProtection;
import com.google.appinventor.components.runtime.util.KodularContentProtection$OnValidationResultListener;
import com.google.appinventor.components.runtime.util.ads.KodularInterstitial;
import com.google.appinventor.components.runtime.util.ads.KodularInterstitial$OnAdsSwitcherListener;
import java.util.Random;

@DesignerComponent(
   category = ComponentCategory.ADVERTISING,
   description = "An interstitial ad is a full-page ad. AdAmazonInterstitial component allows you to monetize your app. You must have a valid Amazon Application Key. If your application key is invalid, the ad will not display on the emulator or the device. Warning: Make sure you\'re in test mode during development to avoid being disabled for clicking your own ads. ",
   helpUrl = "https://docs.kodular.io/components/monetization/amazon-interstitial/",
   iconName = "images/amazon.png",
   nonVisible = true,
   version = 2
)
@SimpleObject
@UsesLibraries(
   libraries = "amazon-ads.jar,unity-ads.aar, unity-ads.jar"
)
@UsesPermissions(
   permissionNames = "android.permission.INTERNET,android.permission.ACCESS_COARSE_LOCATION,android.permission.ACCESS_FINE_LOCATION,android.permission.ACCESS_NETWORK_STATE,android.permission.ACCESS_WIFI_STATE"
)
public class AdAmazonInterstitial extends AndroidNonvisibleComponent implements Component {
   private String F0SK4gPRNmAI2jCyU6DpJpRxlfo5Y8j9ZujjeLuDeDzReJBeSNN2RZtCnkXv1dho = "";
   private final Handler androidUIHandler;
   private ComponentContainer container;
   private Form form;
   private boolean hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO = false;
   private boolean havePermission;
   private InterstitialAd hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private KodularInterstitial hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private KodularAdsCommission kodularAdsCommission;
   private KodularContentProtection kodularContentProtection;
   private boolean qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE;
   private int targetAge;
   private boolean vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq = true;
   private boolean vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R;
   private boolean wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou = true;

   public AdAmazonInterstitial(ComponentContainer var1) {
      super(var1.$form());
      Handler var2 = new Handler();
      this.androidUIHandler = var2;
      this.havePermission = false;
      this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = false;
      this.form = var1.$form();
      this.container = var1;
      KodularAdsCommission var3 = new KodularAdsCommission(var1.$context(), this.form);
      this.kodularAdsCommission = var3;
      InterstitialAd var4 = new InterstitialAd(var1.$context());
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var4;
      InterstitialAd var5 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
      AdAmazonInterstitial.a var6 = new AdAmazonInterstitial.a();
      var5.setListener(var6);
      KodularInterstitial var7 = new KodularInterstitial(var1.$context());
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var7;
      KodularInterstitial var8 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
      KodularInterstitial$OnAdsSwitcherListener var9 = new KodularInterstitial$OnAdsSwitcherListener() {
         // $FF: synthetic field
         private AdAmazonInterstitial hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AdAmazonInterstitial.this;

         public final void onAdsClick() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdExpanded();
         }

         public final void onAdsClosed() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdCollapsed();
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdClosed();
         }

         public final void onAdsError(String var1) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdFailedToLoad("401", var1);
         }

         public final void onAdsReady() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdLoaded();
         }
      };
      var8.setOnAdsSwitcherListener(var9);
      KodularContentProtection var10 = new KodularContentProtection(var1.$context());
      this.kodularContentProtection = var10;
      KodularContentProtection var11 = this.kodularContentProtection;
      KodularContentProtection$OnValidationResultListener var12 = new KodularContentProtection$OnValidationResultListener() {
         public final void onResult(boolean var1, boolean var2, String var3) {
            if(var1 && var2) {
               Random var4 = new Random();
               if(var4.nextFloat() > AdAmazonInterstitial.this.kodularAdsCommission.getCommision("amazon", "interstitial") && !AdAmazonInterstitial.this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE) {
                  AdAmazonInterstitial.this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = false;
                  if(!AdAmazonInterstitial.this.havePermission && AdAmazonInterstitial.this.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R) {
                     Handler var7 = AdAmazonInterstitial.this.androidUIHandler;
                     Runnable var8 = new Runnable() {
                        public final void run() {
                           Form var1 = AdAmazonInterstitial.this.form;
                           PermissionResultHandler var2 = new PermissionResultHandler() {
                              // $FF: synthetic field
                              private <undefinedtype> hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = <VAR_NAMELESS_ENCLOSURE>;

                              public final void HandlePermissionResponse(String var1, boolean var2) {
                                 if(var2) {
                                    AdAmazonInterstitial.this.havePermission = true;
                                    AdAmazonInterstitial.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(AdAmazonInterstitial.this);
                                 } else {
                                    AdAmazonInterstitial.this.havePermission = false;
                                    AdAmazonInterstitial.this.form.dispatchPermissionDeniedEvent(AdAmazonInterstitial.this, "LoadAd", "android.permission.ACCESS_FINE_LOCATION");
                                 }
                              }
                           };
                           var1.askPermission("android.permission.ACCESS_FINE_LOCATION", var2);
                        }
                     };
                     var7.post(var8);
                  } else {
                     AdAmazonInterstitial.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(AdAmazonInterstitial.this);
                  }
               } else {
                  AdAmazonInterstitial.this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = true;
                  AdAmazonInterstitial.this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.loadAd(AdAmazonInterstitial.this.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq);
               }
            } else if(var1 && !var2) {
               AdAmazonInterstitial.this.AdFailedToLoad("101", var3);
            } else if(!var1) {
               AdAmazonInterstitial.this.AdFailedToLoad("102", var3);
            } else {
               AdAmazonInterstitial.this.AdFailedToLoad("103", var3);
            }
         }
      };
      var11.setOnValidationResultListener(var12);
   }

   // $FF: synthetic method
   static void hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(AdAmazonInterstitial var0) {
      if(!var0.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO) {
         AdRegistration.enableTesting(var0.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq);

         try {
            AdRegistration.setAppKey(var0.F0SK4gPRNmAI2jCyU6DpJpRxlfo5Y8j9ZujjeLuDeDzReJBeSNN2RZtCnkXv1dho);
            if(!var0.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R && var0.targetAge <= 0) {
               var0.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.loadAd();
               return;
            }

            AdTargetingOptions var5 = new AdTargetingOptions();
            if(var0.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R) {
               var5.enableGeoLocation(var0.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R);
            }

            if(var0.targetAge > 0) {
               var5.setAge(var0.targetAge);
            }

            var0.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.loadAd(var5);
            return;
         } catch (PermissionException var6) {
            var0.form.dispatchPermissionDeniedEvent(var0, "LoadAd", var6);
            var0.AdFailedToLoad("PERMISSION_ERROR", "Permission \"android.permission.ACCESS_FINE_LOCATION\" was denied but needed.");
            return;
         } catch (Exception var7) {
            StringBuilder var2 = new StringBuilder("Exception thrown: ");
            Log.e("AdAmazonInterstitial", var2.append(var7.toString()).toString());
         }
      }

   }

   @SimpleEvent(
      description = "Triggered when the close button of the interstitial ad is clicked. It\'s important to remember only one interstitial ad can be shown at a time. The previous ad has to be dismissed before a new ad can be shown."
   )
   public void AdClosed() {
      EventDispatcher.dispatchEvent(this, "AdClosed", new Object[0]);
   }

   @SimpleEvent(
      description = "After a user clicks on the close ad button on an expanded ad, this callback is called immediately after collapsing the ad. This callback can be used to do things like resume your app or restart audio."
   )
   public void AdCollapsed() {
      EventDispatcher.dispatchEvent(this, "AdCollapsed", new Object[0]);
   }

   @SimpleEvent(
      description = "This callback is called each time an ad is successfully loaded. You can use this to log metrics on ad views and assist with initial integration. Detailed information about the ad that loaded can be obtained from the AdProperties object."
   )
   public void AdExpanded() {
      EventDispatcher.dispatchEvent(this, "AdExpanded", new Object[0]);
   }

   @SimpleEvent(
      description = "Whenever an ad fails to be retrieved, the event is called, returning the error message."
   )
   public void AdFailedToLoad(String var1, String var2) {
      EventDispatcher.dispatchEvent(this, "AdFailedToLoad", new Object[]{var1, var2});
   }

   @SimpleEvent(
      description = "Called when an an attempt was made to display the ad, but the ad was not ready to display"
   )
   public void AdFailedToShow(String var1) {
      EventDispatcher.dispatchEvent(this, "AdFailedToShow", new Object[]{var1});
   }

   @SimpleEvent(
      description = "Triggered each time an ad is successfully loaded. But you don\'t have to display the ad right after it\'s loaded. For example, set a flag to true and then at a transition point, if flag=true, then display the ad."
   )
   public void AdLoaded() {
      EventDispatcher.dispatchEvent(this, "AdLoaded", new Object[0]);
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR,
      userVisible = false
   )
   public String ApplicationKey() {
      return this.F0SK4gPRNmAI2jCyU6DpJpRxlfo5Y8j9ZujjeLuDeDzReJBeSNN2RZtCnkXv1dho;
   }

   @DesignerProperty(
      defaultValue = "ApplicationKey",
      editorType = "string"
   )
   @SimpleProperty(
      description = "Enter Application Key. Go to Amazon Developer Portal and sign-in for your ApplicationKey",
      userVisible = false
   )
   public void ApplicationKey(String var1) {
      this.F0SK4gPRNmAI2jCyU6DpJpRxlfo5Y8j9ZujjeLuDeDzReJBeSNN2RZtCnkXv1dho = var1;
   }

   @DesignerProperty(
      defaultValue = "unity",
      editorType = "commission_interstitial_ads_network"
   )
   @SimpleProperty(
      description = "Sets the ad network used to take the commission."
   )
   public void CommissionInterstitialAdsNetwork(String var1) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.updateNetwork(var1);
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "boolean"
   )
   @SimpleProperty(
      userVisible = true
   )
   public void EnableDebug(boolean var1) {
      this.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou = var1;
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public boolean EnableDebug() {
      return this.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou;
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "If set to true, uses latitude and longitude coordinates as part of an ad request",
      userVisible = true
   )
   public void EnableGeoLocationTargeting(boolean var1) {
      this.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R = var1;
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public boolean EnableGeoLocationTargeting() {
      return this.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R;
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "For debugging / development purposes flag all ad requests as tests, but set to false for production builds",
      userVisible = true
   )
   public void EnableTesting(boolean var1) {
      this.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq = var1;
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public boolean EnableTesting() {
      return this.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq;
   }

   @SimpleFunction(
      description = "Loads a new ad."
   )
   public void LoadAd() {
      this.kodularContentProtection.startContentValidation(this.form.getAppId());
   }

   @SimpleFunction(
      description = "It will show the Interstitial Ad"
   )
   public void ShowInterstitialAd() {
      if(!this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE) {
         if(this.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO) {
            this.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO = false;
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.showAd();
            return;
         }
      } else if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.showAd()) {
         this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = false;
         return;
      }

      Log.d("AdAmazonInterstitial", "Interstitial ad was not ready to be shown. Make sure you have set ad AppKey and you invoke this after LoadAd");
      this.AdFailedToShow("Interstitial ad was not ready to be shown. Make sure you have set ad AppKey and you invoke this after LoadAd");
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "boolean"
   )
   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public int TargetAge() {
      return this.targetAge;
   }

   @DesignerProperty(
      defaultValue = "0",
      editorType = "integer"
   )
   @SimpleProperty(
      description = "You can pass age information to the Amazon Mobile Ad Network to target specific age groups. If set as 0, Age Targetting will not be used"
   )
   public void TargetAge(int var1) {
      this.targetAge = var1;
   }

   final class a extends DefaultAdListener {
      // $FF: synthetic field
      private AdAmazonInterstitial hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

      a() {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AdAmazonInterstitial.this;
         super();
      }

      public final void onAdCollapsed(Ad var1) {
         Log.i("AdAmazonInterstitial", "Ad collapsed.");
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdCollapsed();
      }

      public final void onAdDismissed(Ad var1) {
         Log.i("AdAmazonInterstitial", "Ad onAdDismissed finished");
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdClosed();
      }

      public final void onAdExpanded(Ad var1) {
         Log.i("AdAmazonInterstitial", "Ad expanded.");
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdExpanded();
      }

      public final void onAdFailedToLoad(Ad var1, AdError var2) {
         StringBuilder var3 = new StringBuilder("Ad failed to load. Code: ");
         Log.w("AdAmazonInterstitial", var3.append(var2.getCode()).append(", Message: ").append(var2.getMessage()).toString());
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO = false;
         String var6 = var2.getMessage();
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdFailedToLoad(var2.getCode().toString(), var6);
      }

      public final void onAdLoaded(Ad var1, AdProperties var2) {
         StringBuilder var3 = new StringBuilder();
         Log.i("AdAmazonInterstitial", var3.append(var2.getAdType().toString()).append(" ad loaded successfully.").toString());
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO = true;
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdLoaded();
      }
   }
}
