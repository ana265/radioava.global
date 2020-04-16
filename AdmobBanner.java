package com.google.appinventor.components.runtime;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
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
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.OnDestroyListener;
import com.google.appinventor.components.runtime.OnPauseListener;
import com.google.appinventor.components.runtime.OnResumeListener;
import com.google.appinventor.components.runtime.ReplForm;
import com.google.appinventor.components.runtime.util.KodularAdsCommission;
import com.google.appinventor.components.runtime.util.KodularAdsUtil;
import com.google.appinventor.components.runtime.util.KodularContentProtection;
import com.google.appinventor.components.runtime.util.KodularContentProtection$OnValidationResultListener;
import com.google.appinventor.components.runtime.util.MakeroidDataProtection;
import com.google.appinventor.components.runtime.util.MakeroidDataProtection$OnConsentListener;
import com.google.appinventor.components.runtime.util.ads.KodularBanner;
import com.google.appinventor.components.runtime.util.ads.KodularBanner$OnAdsSwitcherListener;
import java.util.Random;

@DesignerComponent(
   category = ComponentCategory.ADVERTISING,
   description = "AdMob Banner component",
   iconName = "images/admob.png",
   nonVisible = false,
   version = 3
)
@SimpleObject
@UsesLibraries(
   libraries = "play-services-ads.jar, play-services-ads.aar,customtabs.jar, customtabs.aar,play-services-ads-base.jar, play-services-ads-base.aar,play-services-ads-identifier.jar, play-services-ads-identifier.aar,play-services-ads-lite.jar, play-services-ads-lite.aar,play-services-basement.jar, play-services-basement.aar,play-services-gass.jar, play-services-gass.aar"
)
@UsesPermissions(
   permissionNames = "android.permission.INTERNET, android.permission.ACCESS_NETWORK_STATE, android.permission.ACCESS_COARSE_LOCATION, android.permission.ACCESS_FINE_LOCATION"
)
public final class AdmobBanner extends AndroidViewComponent implements OnDestroyListener, OnPauseListener, OnResumeListener {
   private boolean Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB = true;
   private Activity activity;
   private String adUnitId;
   private ComponentContainer container;
   private Context context;
   private Form form;
   private AdView hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private MakeroidDataProtection hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private KodularBanner hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private boolean isCompanion = false;
   private KodularAdsCommission kodularAdsCommission;
   private KodularContentProtection kodularContentProtection;
   private boolean l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j = false;
   private LinearLayout linearLayout;
   private boolean mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT = false;
   private boolean qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = false;
   private boolean testMode = false;

   public AdmobBanner(ComponentContainer var1) {
      super(var1);
      this.container = var1;
      this.context = var1.$context();
      this.activity = var1.$context();
      this.form = var1.$form();
      this.form.registerForOnDestroy(this);
      this.form.registerForOnPause(this);
      this.form.registerForOnResume(this);
      this.adUnitId = "ca-app-pub-3940256099942544/6300978111";
      KodularAdsCommission var2 = new KodularAdsCommission(this.context, this.form);
      this.kodularAdsCommission = var2;
      KodularBanner var3 = new KodularBanner(this.context);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var3;
      KodularBanner var4 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
      KodularBanner$OnAdsSwitcherListener var5 = new KodularBanner$OnAdsSwitcherListener() {
         // $FF: synthetic field
         private AdmobBanner hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AdmobBanner.this;

         public final void onAdsClick() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdOpened();
         }

         public final void onAdsError(String var1) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdFailedToLoad(401, var1);
         }

         public final void onAdsReady() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdLoaded();
         }
      };
      var4.setOnAdsSwitcherListener(var5);
      MakeroidDataProtection var6 = new MakeroidDataProtection(this.context, MakeroidDataProtection.TYPE_AD_MOB_BANNER);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var6;
      MakeroidDataProtection var7 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
      MakeroidDataProtection$OnConsentListener var8 = new MakeroidDataProtection$OnConsentListener() {
         // $FF: synthetic field
         private AdmobBanner hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AdmobBanner.this;

         public final void result(boolean var1, boolean var2) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.OnConsentChanged(var2);
         }
      };
      var7.setOnConsentListener(var8);
      KodularContentProtection var9 = new KodularContentProtection(this.activity);
      this.kodularContentProtection = var9;
      KodularContentProtection var10 = this.kodularContentProtection;
      KodularContentProtection$OnValidationResultListener var11 = new KodularContentProtection$OnValidationResultListener() {
         // $FF: synthetic field
         private AdmobBanner hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AdmobBanner.this;

         public final void onResult(boolean var1, boolean var2, String var3) {
            if(var1 && var2) {
               AdmobBanner.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME();
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.Start();
            } else if(var1 && !var2) {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdFailedToLoad(101, var3);
            } else if(!var1) {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdFailedToLoad(102, var3);
            } else {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdFailedToLoad(103, var3);
            }
         }
      };
      var10.setOnValidationResultListener(var11);
      if(this.form instanceof ReplForm) {
         this.isCompanion = true;
      }

      LinearLayout var12 = new LinearLayout(this.context);
      this.linearLayout = var12;
      this.linearLayout.setOrientation(0);
      LinearLayout var13 = this.linearLayout;
      LayoutParams var14 = new LayoutParams(-1, -2);
      var13.setLayoutParams(var14);
      AdView var15 = new AdView(this.context);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var15;
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setAdSize(AdSize.SMART_BANNER);
      android.widget.RelativeLayout.LayoutParams var16 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
      var16.addRule(12);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setLayoutParams(var16);
      AdView var17 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
      AdListener var18 = new AdListener() {
         // $FF: synthetic field
         private AdmobBanner hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = AdmobBanner.this;

         public final void onAdClosed() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdClosed();
            Log.i("AdMob Banner", "onAdClosed");
         }

         public final void onAdFailedToLoad(int var1) {
            String var2 = AdmobBanner.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(var1);
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdFailedToLoad(var1, var2);
            StringBuilder var3 = new StringBuilder("Admob Banner: Ad failed to load - Error code: ");
            Log.e("AdMob Banner", var3.append(var1).append(" , Error message: ").append(var2).toString());
         }

         public final void onAdLoaded() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdLoaded();
            Log.i("AdMob Banner", "Admob Banner: Ad loaded");
         }

         public final void onAdOpened() {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.AdOpened();
            Log.i("AdMob Banner", "Admob Banner: Ad opened");
         }
      };
      var17.setAdListener(var18);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setAdView(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
      this.linearLayout.addView(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
      this.container.$add(this);
   }

   // $FF: synthetic method
   static String B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(int var0) {
      return var0 == 0?"Something happened internally; for instance, an invalid response was received from the ad server.":(var0 == 1?"The ad request was invalid; for instance, the ad unit ID was incorrect.":(var0 == 2?"The ad request was unsuccessful due to network connectivity.":(var0 == 3?"The ad request was successful, but no ad was returned due to lack of ad inventory.":"No error message found.")));
   }

   // $FF: synthetic method
   static boolean hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME() {
      return false;
   }

   @SimpleEvent(
      description = "Called when an ad was closed."
   )
   public final void AdClosed() {
      EventDispatcher.dispatchEvent(this, "AdClosed", new Object[0]);
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "This property must be set to true to receive ads."
   )
   public final void AdEnabled(boolean var1) {
      this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB = var1;
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public final boolean AdEnabled() {
      return this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB;
   }

   @SimpleEvent(
      description = "Called when an ad request failed to load. The message will display the error code and error message."
   )
   public final void AdFailedToLoad(int var1, String var2) {
      Object[] var3 = new Object[]{Integer.valueOf(var1), var2};
      EventDispatcher.dispatchEvent(this, "AdFailedToLoad", var3);
   }

   @SimpleEvent(
      description = "Called when an ad request was loaded."
   )
   public final void AdLoaded() {
      EventDispatcher.dispatchEvent(this, "AdLoaded", new Object[0]);
   }

   @SimpleEvent(
      description = "Called when an ad was opened."
   )
   public final void AdOpened() {
      EventDispatcher.dispatchEvent(this, "AdOpened", new Object[0]);
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR,
      description = "Set Ad Unit ID"
   )
   public final String AdUnitId() {
      return this.adUnitId;
   }

   @DesignerProperty(
      defaultValue = "ca-app-pub-3940256099942544/6300978111",
      editorType = "string"
   )
   @SimpleProperty(
      userVisible = false
   )
   public final void AdUnitId(String var1) {
      this.adUnitId = var1;
   }

   @DesignerProperty(
      defaultValue = "False",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "If enabled you will see the consent dialog no matter if you are located in Europe or not. Please use this option only in development.  If this setting is enabled ALL taken consents will not be saved."
   )
   public final void ConsentDevelopmentMode(boolean var1) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setDevelopmentMode(var1);
   }

   @SimpleProperty
   public final boolean ConsentDevelopmentMode() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getDevelopmentMode();
   }

   @SimpleProperty
   public final String ConsentMessage() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getMessage();
   }

   @DesignerProperty(
      defaultValue = "Can we continue to use your data to tailor ads for you?",
      editorType = "string"
   )
   @SimpleProperty(
      description = "The message for the consent dialog."
   )
   public final void ConsentMessage(String var1) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setMessage(var1);
   }

   @SimpleProperty
   public final String ConsentTitle() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getTitle();
   }

   @DesignerProperty(
      defaultValue = "Data Protection",
      editorType = "string"
   )
   @SimpleProperty(
      description = "The title for the consent dialog."
   )
   public final void ConsentTitle(String var1) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setTitle(var1);
   }

   public final int Height() {
      return this.getView().getHeight();
   }

   public final void Height(int var1) {
      this.container.setChildHeight(this, var1);
   }

   public final void HeightPercent(int var1) {
   }

   @SimpleFunction(
      description = "Load a new AdMob Banner ad."
   )
   public final void LoadAd() {
      if(!this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB) {
         this.AdFailedToLoad(404, "Make sure you enabled the ad in the component properties.");
      } else if(this.testMode) {
         Builder var1 = new Builder();
         var1.addTestDevice("B3EEABB8EE11C2BE770B684D95219ECB");
         var1.addTestDevice(KodularAdsUtil.guessSelfDeviceId(this.context));
         if(!this.l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setAdUnitId("ca-app-pub-3940256099942544/6300978111");
            this.l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j = true;
         }

         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.loadAd(var1.build());
      } else {
         if(!this.mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setAdUnitId(this.adUnitId);
            this.mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT = true;
         }

         Random var4 = new Random();
         var4.nextFloat();
         this.kodularAdsCommission.getCommision("admob", "banner");
         this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = false;
         this.kodularContentProtection.startContentValidation(this.form.getAppId());
      }
   }

   @SimpleEvent(
      description = "Event triggered when the consent was changed."
   )
   public final void OnConsentChanged(boolean var1) {
      Object[] var2 = new Object[]{Boolean.valueOf(var1)};
      EventDispatcher.dispatchEvent(this, "OnConsentChanged", var2);
   }

   @SimpleProperty(
      description = "Returns the current personalized consent. If true user has consent to personalized ads."
   )
   public final boolean PersonalizedResult() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getPersonalizedResult();
   }

   @SimpleFunction(
      description = "Deletes the user\'s consent. Useful if you want to test the consent dialog in development."
   )
   public final void RevokeConsent() {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.RevokeConsent();
   }

   @DesignerProperty(
      defaultValue = "False",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "If you want to test the component then that this property to true. Then you will receive test ads.",
      userVisible = false
   )
   public final void TestMode(boolean var1) {
      this.testMode = var1;
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public final boolean TestMode() {
      return this.testMode;
   }

   public final int Width() {
      return this.getView().getWidth();
   }

   public final void Width(int var1) {
      this.container.setChildWidth(this, var1);
   }

   public final void WidthPercent(int var1) {
   }

   public final View getView() {
      return this.linearLayout;
   }

   public final void onDestroy() {
      if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME != null) {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.destroy();
      }

   }

   public final void onPause() {
      if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME != null) {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.pause();
      }

   }

   public final void onResume() {
      if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME != null) {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.resume();
      }

   }
}
