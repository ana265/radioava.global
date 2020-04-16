package com.google.appinventor.components.runtime;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
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
import com.google.appinventor.components.runtime.OnDestroyListener;
import com.google.appinventor.components.runtime.OnPauseListener;
import com.google.appinventor.components.runtime.OnResumeListener;
import com.google.appinventor.components.runtime.util.KodularAdsCommission;
import com.google.appinventor.components.runtime.util.KodularAdsUtil;
import com.google.appinventor.components.runtime.util.KodularContentProtection;
import com.google.appinventor.components.runtime.util.KodularContentProtection$OnValidationResultListener;
import com.google.appinventor.components.runtime.util.MakeroidDataProtection;
import com.google.appinventor.components.runtime.util.MakeroidDataProtection$OnConsentListener;
import java.util.Random;

@DesignerComponent(
   category = ComponentCategory.ADVERTISING,
   description = "add description in OdeMessage ",
   iconName = "images/admob.png",
   nonVisible = true,
   version = 3
)
@SimpleObject
@UsesLibraries(
   libraries = "play-services-ads.jar, play-services-ads.aar,customtabs.jar, customtabs.aar,play-services-ads-base.jar, play-services-ads-base.aar,play-services-ads-identifier.jar, play-services-ads-identifier.aar,play-services-ads-lite.jar, play-services-ads-lite.aar,play-services-basement.jar, play-services-basement.aar,play-services-gass.jar, play-services-gass.aar"
)
@UsesPermissions(
   permissionNames = "android.permission.INTERNET, android.permission.ACCESS_NETWORK_STATE, android.permission.ACCESS_COARSE_LOCATION, android.permission.ACCESS_FINE_LOCATION"
)
public class AdmobRewardedVideo extends AndroidNonvisibleComponent implements RewardedVideoAdListener, Component, OnDestroyListener, OnPauseListener, OnResumeListener {
   private boolean Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB = true;
   private Activity activity;
   public String adUnitId;
   protected final ComponentContainer container;
   private Context context;
   private Form form;
   private RewardedVideoAd hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private MakeroidDataProtection hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private boolean isCompanion = false;
   private KodularAdsCommission kodularAdsCommission;
   private KodularContentProtection kodularContentProtection;
   private boolean testMode = false;

   public AdmobRewardedVideo(ComponentContainer var1) {
      super(var1.$form());
      this.container = var1;
      this.activity = var1.$context();
      this.context = var1.$context();
      this.form = var1.$form();
      this.form.registerForOnDestroy(this);
      this.form.registerForOnPause(this);
      this.form.registerForOnResume(this);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = MobileAds.getRewardedVideoAdInstance(this.activity);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setRewardedVideoAdListener(this);
      this.adUnitId = "ca-app-pub-3940256099942544/5224354917";
      KodularAdsCommission var2 = new KodularAdsCommission(this.context, this.form);
      this.kodularAdsCommission = var2;
      MakeroidDataProtection var3 = new MakeroidDataProtection(this.context, MakeroidDataProtection.TYPE_AD_MOB_REWARDED_VIDEO);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var3;
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setRewardedVideoAd(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
      MakeroidDataProtection var4 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
      MakeroidDataProtection$OnConsentListener var5 = new MakeroidDataProtection$OnConsentListener() {
         // $FF: synthetic field
         private AdmobRewardedVideo hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AdmobRewardedVideo.this;

         public final void result(boolean var1, boolean var2) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.OnConsentChanged(var2);
         }
      };
      var4.setOnConsentListener(var5);
      KodularContentProtection var6 = new KodularContentProtection(this.activity);
      this.kodularContentProtection = var6;
      KodularContentProtection var7 = this.kodularContentProtection;
      KodularContentProtection$OnValidationResultListener var8 = new KodularContentProtection$OnValidationResultListener() {
         // $FF: synthetic field
         private AdmobRewardedVideo hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AdmobRewardedVideo.this;

         public final void onResult(boolean var1, boolean var2, String var3) {
            if(var1 && var2) {
               Random var4 = new Random();
               if(var4.nextFloat() <= this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.kodularAdsCommission.getCommision("admob", "video")) {
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setRewardedOptions(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.adUnitId);
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.Start();
               } else {
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setRewardedOptions(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.adUnitId);
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
      var7.setOnValidationResultListener(var8);
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
   public String AdUnitId() {
      return this.adUnitId;
   }

   @DesignerProperty(
      defaultValue = "ca-app-pub-3940256099942544/5224354917",
      editorType = "string"
   )
   @SimpleProperty(
      userVisible = false
   )
   public void AdUnitId(String var1) {
      this.adUnitId = var1;
   }

   @SimpleEvent(
      description = "Called when an video ad was completed."
   )
   public void AdVideoCompleted() {
      EventDispatcher.dispatchEvent(this, "AdVideoCompleted", new Object[0]);
   }

   @SimpleEvent(
      description = "Called when an video ad started to show content."
   )
   public void AdVideoStarted() {
      EventDispatcher.dispatchEvent(this, "AdVideoStarted", new Object[0]);
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
      description = "Load a new AdMob Rewarded Video ad."
   )
   public void LoadAd() {
      if(!this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB) {
         this.AdFailedToLoad(404, "Make sure you enabled the ad in the component properties.");
      } else if(this.testMode) {
         Builder var1 = new Builder();
         var1.addTestDevice("B3EEABB8EE11C2BE770B684D95219ECB");
         var1.addTestDevice(KodularAdsUtil.guessSelfDeviceId(this.context));
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.loadAd("ca-app-pub-3940256099942544/5224354917", var1.build());
      } else {
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

   @SimpleEvent(
      description = "User watched video and should be rewarded."
   )
   public void Rewarded(String var1, int var2) {
      Object[] var3 = new Object[]{var1, Integer.valueOf(var2)};
      EventDispatcher.dispatchEvent(this, "Rewarded", var3);
   }

   @SimpleFunction(
      description = "It will show the Video"
   )
   public void ShowAd() {
      if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.isLoaded()) {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.show();
      } else {
         this.LoadAd();
      }
   }

   @DesignerProperty(
      defaultValue = "False",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "If you want to test the component, that this property to true. After it you will receive test ads.",
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

   public void onDestroy() {
      if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME != null) {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.destroy();
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = null;
      }

   }

   public void onPause() {
      if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME != null) {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.pause();
      }

   }

   public void onResume() {
      if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME != null) {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.resume();
      }

   }

   public void onRewarded(RewardItem var1) {
      this.Rewarded(var1.getType(), var1.getAmount());
      StringBuilder var2 = new StringBuilder("Admob Rewarded Video: Rewarded type: ");
      Log.i("AdmobRewardedVideo", var2.append(var1.getType()).append(", Rewarded amount: ").append(var1.getAmount()).toString());
   }

   public void onRewardedVideoAdClosed() {
      this.AdClosed();
      Log.i("AdmobRewardedVideo", "Admob Rewarded Video: Video ad closed");
   }

   public void onRewardedVideoAdFailedToLoad(int var1) {
      String var2;
      if(var1 == 0) {
         var2 = "Something happened internally; for instance, an invalid response was received from the ad server.";
      } else if(var1 == 1) {
         var2 = "The ad request was invalid; for instance, the ad unit ID was incorrect.";
      } else if(var1 == 2) {
         var2 = "The ad request was unsuccessful due to network connectivity.";
      } else if(var1 == 3) {
         var2 = "The ad request was successful, but no ad was returned due to lack of ad inventory.";
      } else {
         var2 = "No error message found.";
      }

      this.AdFailedToLoad(var1, var2);
      StringBuilder var4 = new StringBuilder("Admob Rewarded Video: Video failed to load: Error code: ");
      Log.w("AdmobRewardedVideo", var4.append(var1).append(" ,Error message: ").append(var2).toString());
   }

   public void onRewardedVideoAdLeftApplication() {
      this.AdLeftApplication();
      Log.i("AdmobRewardedVideo", "Admob Rewarded Video: LeftApplication");
   }

   public void onRewardedVideoAdLoaded() {
      this.AdLoaded();
      Log.i("AdmobRewardedVideo", "Admob Rewarded Video: Video ad loaded");
   }

   public void onRewardedVideoAdOpened() {
      this.AdOpened();
      Log.i("AdmobRewardedVideo", "Admob Rewarded Video: Video ad opened");
   }

   public void onRewardedVideoCompleted() {
      this.AdVideoCompleted();
      Log.i("AdmobRewardedVideo", "Admob Rewarded Video: Video completed");
   }

   public void onRewardedVideoStarted() {
      this.AdVideoStarted();
      Log.i("AdmobRewardedVideo", "Admob Rewarded Video: Video started");
   }
}
