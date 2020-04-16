package com.google.appinventor.components.runtime;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdRequest.Builder;
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
import com.google.appinventor.components.runtime.ReplForm;
import com.google.appinventor.components.runtime.util.KodularAdsCommission;
import com.google.appinventor.components.runtime.util.KodularAdsUtil;
import com.google.appinventor.components.runtime.util.KodularContentProtection;
import com.google.appinventor.components.runtime.util.KodularContentProtection$OnValidationResultListener;
import com.google.appinventor.components.runtime.util.MakeroidDataProtection;
import com.google.appinventor.components.runtime.util.MakeroidDataProtection$OnConsentListener;
import com.google.appinventor.components.runtime.util.ads.KodularInterstitial;
import com.google.appinventor.components.runtime.util.ads.KodularInterstitial$OnAdsSwitcherListener;
import java.util.Random;

@DesignerComponent(
   category = ComponentCategory.ADVERTISING,
   description = "An interstitial ad is a full-page ad. AdMobInterstitial component allows you to monetize your app. You must have a valid AdMob account and AdUnitId that can be obtained from http://www.google.com/AdMob . If your id is invalid, the AdMobInterstitial will not display on the emulator or the device. Warning: Make sure you\'re in test mode during development to avoid being disabled for clicking your own ads. ",
   helpUrl = "https://docs.kodular.io/components/monetization/admob-interstitial/",
   iconName = "images/admob.png",
   nonVisible = true,
   version = 4
)
@SimpleObject
@UsesLibraries(
   libraries = "play-services-ads.jar, play-services-ads.aar,customtabs.jar, customtabs.aar,play-services-ads-base.jar, play-services-ads-base.aar,play-services-ads-identifier.jar, play-services-ads-identifier.aar,play-services-ads-lite.jar, play-services-ads-lite.aar,play-services-basement.jar, play-services-basement.aar,play-services-gass.jar, play-services-gass.aar,unity-ads.aar, unity-ads.jar"
)
@UsesPermissions(
   permissionNames = "android.permission.INTERNET, android.permission.ACCESS_NETWORK_STATE, android.permission.ACCESS_COARSE_LOCATION, android.permission.ACCESS_FINE_LOCATION"
)
public class AdMobInterstitial extends AndroidNonvisibleComponent implements Component {
   private boolean Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB = true;
   private String LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn;
   private Activity activity;
   private String adUnitId;
   private ComponentContainer container;
   private Context context;
   private Form form;
   private InterstitialAd hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private MakeroidDataProtection hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private KodularInterstitial hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private boolean isCompanion = false;
   private KodularAdsCommission kodularAdsCommission;
   private KodularContentProtection kodularContentProtection;
   private boolean l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j = false;
   private boolean mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT = false;
   private boolean qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = false;
   private boolean sSQuIBUVrx5rcdxHqHgqC6bPLuuDnxnBF7e7BJeOxmxr54l6ArzFZvC3SGBTuUdt = false;
   public int targetAge = 0;
   private boolean testMode = false;
   private String vOibdtOfNxMVixWab9VDGgvD9L4Kqb2ZDQBius3PMdhiP1dPN68Z9GzWJA49TUbE;
   private String yKzj3OK1ig8r7pqFZ5OXQyoqJiWnRvwjZPZ1kORJGZPQRb8FuKJuM2qAKu5QCSLT = "";

   public AdMobInterstitial(ComponentContainer var1) {
      super(var1.$form());
      this.form = var1.$form();
      this.container = var1;
      this.context = var1.$context();
      this.activity = var1.$context();
      InterstitialAd var2 = new InterstitialAd(this.context);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var2;
      this.adUnitId = "ca-app-pub-3940256099942544/1033173712";
      KodularAdsCommission var3 = new KodularAdsCommission(this.context, this.form);
      this.kodularAdsCommission = var3;
      MakeroidDataProtection var4 = new MakeroidDataProtection(this.context, MakeroidDataProtection.TYPE_AD_MOB_INTERSTITIAL);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var4;
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setInterstitialAd(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
      MakeroidDataProtection var5 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
      MakeroidDataProtection$OnConsentListener var6 = new MakeroidDataProtection$OnConsentListener() {
         // $FF: synthetic field
         private AdMobInterstitial hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AdMobInterstitial.this;

         public final void result(boolean var1, boolean var2) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.OnConsentChanged(var2);
         }
      };
      var5.setOnConsentListener(var6);
      KodularInterstitial var7 = new KodularInterstitial(this.context);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var7;
      KodularInterstitial var8 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
      KodularInterstitial$OnAdsSwitcherListener var9 = new KodularInterstitial$OnAdsSwitcherListener() {
         // $FF: synthetic field
         private AdMobInterstitial hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AdMobInterstitial.this;

         public final void onAdsClick() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdOpened();
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdLeftApplication();
         }

         public final void onAdsClosed() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdClosed();
         }

         public final void onAdsError(String var1) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdFailedToLoad(401, var1);
         }

         public final void onAdsReady() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdLoaded();
         }
      };
      var8.setOnAdsSwitcherListener(var9);
      KodularContentProtection var10 = new KodularContentProtection(this.activity);
      this.kodularContentProtection = var10;
      KodularContentProtection var11 = this.kodularContentProtection;
      KodularContentProtection$OnValidationResultListener var12 = new KodularContentProtection$OnValidationResultListener() {
         // $FF: synthetic field
         private AdMobInterstitial hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AdMobInterstitial.this;

         public final void onResult(boolean var1, boolean var2, String var3) {
            if(var1 && var2) {
               Log.d("AdMobInterstitial", "Serving real ads; production non-Test mode");
               if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE) {
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.loadAd(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.testMode);
               } else {
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setInterstitialAd(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setInterstitialOptions(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.sSQuIBUVrx5rcdxHqHgqC6bPLuuDnxnBF7e7BJeOxmxr54l6ArzFZvC3SGBTuUdt, this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.yKzj3OK1ig8r7pqFZ5OXQyoqJiWnRvwjZPZ1kORJGZPQRb8FuKJuM2qAKu5QCSLT, this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.targetAge);
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.Start();
               }
            } else if(var1 && !var2) {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdFailedToLoad(101, var3);
            } else if(!var1) {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdFailedToLoad(102, var3);
            } else {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdFailedToLoad(103, var3);
            }
         }
      };
      var11.setOnValidationResultListener(var12);
      if(this.form instanceof ReplForm) {
         this.isCompanion = true;
      }

      InterstitialAd var13 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
      AdListener var14 = new AdListener() {
         // $FF: synthetic field
         private AdMobInterstitial hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AdMobInterstitial.this;

         public final void onAdClosed() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdClosed();
            Log.i("AdMobInterstitial", "Admob Interstitial: Ad closed");
         }

         public final void onAdFailedToLoad(int var1) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn = AdMobInterstitial.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(var1);
            AdMobInterstitial var3 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
            var3.AdFailedToLoad(var1, var3.LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn);
            StringBuilder var4 = new StringBuilder("Admob Interstitial: Ad failed to load: Error code: ");
            Log.w("AdMobInterstitial", var4.append(var1).append(" , Error message: ").append(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.LYVRHQlR5uMq9RmVQLgPQwQp4HVKuBDt7Jnpu0jTztYClgnk53NSpkUmjjPPbYn).toString());
         }

         public final void onAdLeftApplication() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdLeftApplication();
            Log.i("AdMobInterstitial", "Admob Interstitial: Ad left application");
         }

         public final void onAdLoaded() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdLoaded();
            Log.i("AdMobInterstitial", "Admob Interstitial: Ad loaded");
         }

         public final void onAdOpened() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdOpened();
            Log.i("AdMobInterstitial", "Admob Interstitial: Ad opened");
         }
      };
      var13.setAdListener(var14);
   }

   // $FF: synthetic method
   static String hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(int var0) {
      return var0 == 0?"Something happened internally; for instance, an invalid response was received from the ad server.":(var0 == 1?"The ad request was invalid; for instance, the ad unit ID was incorrect.":(var0 == 2?"The ad request was unsuccessful due to network connectivity.":(var0 == 3?"The ad request was successful, but no ad was returned due to lack of ad inventory.":"No error message found.")));
   }

   @SimpleEvent(
      description = "Called when an ad was closed."
   )
   public void AdClosed() {
      EventDispatcher.dispatchEvent(this, "AdClosed", new Object[0]);
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "This property must be set to true to receive ads."
   )
   public void AdEnabled(boolean var1) {
      this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB = var1;
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public boolean AdEnabled() {
      return this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB;
   }

   @SimpleEvent(
      description = "Called when an ad request failed to load. The message will display the error code and error message."
   )
   public void AdFailedToLoad(int var1, String var2) {
      Object[] var3 = new Object[]{Integer.valueOf(var1), var2};
      EventDispatcher.dispatchEvent(this, "AdFailedToLoad", var3);
   }

   @SimpleEvent(
      description = "Called when an an attempt was made to display the ad, but the ad was not ready to display."
   )
   public void AdFailedToShow(String var1) {
      EventDispatcher.dispatchEvent(this, "AdFailedToShow", new Object[]{var1});
   }

   @SimpleEvent(
      description = "Called when an ad leaves the application (e.g., to go to the browser)."
   )
   public void AdLeftApplication() {
      EventDispatcher.dispatchEvent(this, "AdLeftApplication", new Object[0]);
   }

   @SimpleEvent(
      description = "Called when an ad request was loaded."
   )
   public void AdLoaded() {
      EventDispatcher.dispatchEvent(this, "AdLoaded", new Object[0]);
   }

   @SimpleEvent(
      description = "Called when an ad was opened."
   )
   public void AdOpened() {
      EventDispatcher.dispatchEvent(this, "AdOpened", new Object[0]);
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR,
      userVisible = false
   )
   public String AdUnitID() {
      return this.adUnitId;
   }

   @DesignerProperty(
      defaultValue = "ca-app-pub-3940256099942544/1033173712",
      editorType = "string"
   )
   @SimpleProperty(
      userVisible = false
   )
   public void AdUnitID(String var1) {
      this.adUnitId = var1;
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
      defaultValue = "False",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "If enabled you will see the consent dialog no matter if you are located in Europe or not. Please use this option only in development.  If this setting is enabled ALL taken consents will not be saved."
   )
   public void ConsentDevelopmentMode(boolean var1) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setDevelopmentMode(var1);
   }

   @SimpleProperty
   public boolean ConsentDevelopmentMode() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getDevelopmentMode();
   }

   @SimpleProperty
   public String ConsentMessage() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getMessage();
   }

   @DesignerProperty(
      defaultValue = "Can we continue to use your data to tailor ads for you?",
      editorType = "string"
   )
   @SimpleProperty(
      description = "The message for the consent dialog."
   )
   public void ConsentMessage(String var1) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setMessage(var1);
   }

   @SimpleProperty
   public String ConsentTitle() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getTitle();
   }

   @DesignerProperty(
      defaultValue = "Data Protection",
      editorType = "string"
   )
   @SimpleProperty(
      description = "The title for the consent dialog."
   )
   public void ConsentTitle(String var1) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setTitle(var1);
   }

   @SimpleFunction(
      description = "Load a new AdMob Interstitial ad."
   )
   public void LoadAd() {
      if(!this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB) {
         this.AdFailedToLoad(404, "Make sure you enabled the ad in the component properties.");
      } else if(this.testMode) {
         Builder var1 = new Builder();
         var1.addTestDevice("B3EEABB8EE11C2BE770B684D95219ECB");
         var1.addTestDevice(KodularAdsUtil.guessSelfDeviceId(this.context));
         if(!this.l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
            this.l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j = true;
         }

         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.loadAd(var1.build());
      } else {
         if(!this.mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setAdUnitId(this.adUnitId);
            this.mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT = true;
         }

         Random var4 = new Random();
         if(var4.nextFloat() > this.kodularAdsCommission.getCommision("admob", "interstitial") && !this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE) {
            this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = false;
         } else {
            this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = true;
         }

         this.kodularContentProtection.startContentValidation(this.form.getAppId());
      }
   }

   @SimpleEvent(
      description = "Event triggered when the consent was changed."
   )
   public void OnConsentChanged(boolean var1) {
      Object[] var2 = new Object[]{Boolean.valueOf(var1)};
      EventDispatcher.dispatchEvent(this, "OnConsentChanged", var2);
   }

   @SimpleProperty(
      description = "Returns the current personalized consent. If true user has consent to personalized ads."
   )
   public boolean PersonalizedResult() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getPersonalizedResult();
   }

   @SimpleFunction(
      description = "Deletes the user\'s consent. Useful if you want to test the consent dialog in development."
   )
   public void RevokeConsent() {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.RevokeConsent();
   }

   @SimpleFunction(
      description = "It will show the Interstitial Ad"
   )
   public void ShowInterstitialAd() {
      if(!this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE) {
         if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.isLoaded()) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.show();
            return;
         }
      } else if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.showAd()) {
         this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = false;
         return;
      }

      this.vOibdtOfNxMVixWab9VDGgvD9L4Kqb2ZDQBius3PMdhiP1dPN68Z9GzWJA49TUbE = "Interstitial ad was not ready to be shown. Make sure you have set AdUnitId and you invoke this after LoadAd";
      Log.d("AdMobInterstitial", this.vOibdtOfNxMVixWab9VDGgvD9L4Kqb2ZDQBius3PMdhiP1dPN68Z9GzWJA49TUbE);
      this.AdFailedToShow(this.vOibdtOfNxMVixWab9VDGgvD9L4Kqb2ZDQBius3PMdhiP1dPN68Z9GzWJA49TUbE);
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public int TargetAge() {
      return this.targetAge;
   }

   @DesignerProperty(
      defaultValue = "0",
      editorType = "non_negative_integer"
   )
   @SimpleProperty(
      description = "Leave 0 for targeting ALL ages"
   )
   public void TargetAge(int var1) {
      this.targetAge = var1;
   }

   @DesignerProperty(
      defaultValue = "False",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "Indicate whether you want Google to treat your content as child-directed when you make an ad request. Info here: https://developers.google.com/mobile-ads-sdk/docs/admob/android/targeting#child-directed_setting"
   )
   public void TargetForChildren(boolean var1) {
      this.sSQuIBUVrx5rcdxHqHgqC6bPLuuDnxnBF7e7BJeOxmxr54l6ArzFZvC3SGBTuUdt = var1;
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public boolean TargetForChildren() {
      return this.sSQuIBUVrx5rcdxHqHgqC6bPLuuDnxnBF7e7BJeOxmxr54l6ArzFZvC3SGBTuUdt;
   }

   @DesignerProperty(
      defaultValue = "ALL",
      editorType = "gender_options"
   )
   @SimpleProperty
   public void TargetGender(String var1) {
      this.yKzj3OK1ig8r7pqFZ5OXQyoqJiWnRvwjZPZ1kORJGZPQRb8FuKJuM2qAKu5QCSLT = var1;
   }

   @DesignerProperty(
      defaultValue = "False",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "If you want to test the component then that this property to true. Then you will receive test ads.",
      userVisible = false
   )
   public void TestMode(boolean var1) {
      this.testMode = var1;
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public boolean TestMode() {
      return this.testMode;
   }
}
