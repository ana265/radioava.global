package com.google.appinventor.components.runtime;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.StrictMode;
import android.os.StrictMode.VmPolicy.Builder;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import android.util.Log;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.ActivityResultListener;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.Deleteable;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.AnimationUtil;
import com.google.appinventor.components.runtime.util.YailList;
import java.io.File;

@DesignerComponent(
   category = ComponentCategory.CONNECTIVITY,
   description = "A component that can launch an activity using the <code>StartActivity</code> method. \n<p>Activities that can be launched include:<ul> <li> Starting another App Inventor for Android app. \n To do so, first      find out the <em>class</em> of the other application by      downloading the source code and using a file explorer or unzip      utility to find a file named      \"youngandroidproject/project.properties\".  \n The first line of      the file will start with \"main=\" and be followed by the class      name; for example,      <code>main=com.gmail.Bitdiddle.Ben.HelloPurr.Screen1</code>.       (The first components indicate that it was created by      Ben.Bitdiddle@gmail.com.)  \n To make your      <code>ActivityStarter</code> launch this application, set the      following properties: <ul>\n      <li> <code>ActivityPackage</code> to the class name, dropping the           last component (for example,           <code>com.gmail.Bitdiddle.Ben.HelloPurr</code>)</li>\n      <li> <code>ActivityClass</code> to the entire class name (for           example,           <code>com.gmail.Bitdiddle.Ben.HelloPurr.Screen1</code>)</li>      </ul></li> \n<li> Starting the camera application by setting the following      properties:<ul> \n     <li> <code>Action: android.intent.action.MAIN</code> </li> \n     <li> <code>ActivityPackage: com.android.camera</code> </li> \n     <li> <code>ActivityClass: com.android.camera.Camera</code></li>\n      </ul></li>\n<li> Performing web search.  Assuming the term you want to search      for is \"vampire\" (feel free to substitute your own choice), \n     set the properties to:\n<ul><code>     <li>Action: android.intent.action.WEB_SEARCH</li>      <li>ExtraKey: query</li>      <li>ExtraValue: vampire</li>      <li>ActivityPackage: com.google.android.providers.enhancedgooglesearch</li>     <li>ActivityClass: com.google.android.providers.enhancedgooglesearch.Launcher</li>      </code></ul></li> \n<li> Opening a browser to a specified web page.  Assuming the page you      want to go to is \"www.facebook.com\" (feel free to substitute      your own choice), set the properties to:\n<ul><code>      <li>Action: android.intent.action.VIEW</li>      <li>DataUri: http://www.facebook.com</li> </code> </ul> </li> </ul></p>",
   designerHelpDescription = "A component that can launch an activity using the <code>StartActivity</code> method.<p>Activities that can be launched include: <ul> \n<li> starting other App Inventor for Android apps </li> \n<li> starting the camera application </li> \n<li> performing web search </li> \n<li> opening a browser to a specified web page</li> \n<li> opening the map application to a specified location</li></ul> \nYou can also launch activities that return text data.  See the documentation on using the Activity Starter for examples.</p>",
   iconName = "images/activityStarter.png",
   nonVisible = true,
   version = 6
)
@SimpleObject
public class ActivityStarter extends AndroidNonvisibleComponent implements ActivityResultListener, Component, Deleteable {
   private String Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB;
   private final ComponentContainer container;
   private String hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO;
   private Intent hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private YailList hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private String l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j;
   private String mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT;
   private String qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE;
   private int requestCode;
   private String sSQuIBUVrx5rcdxHqHgqC6bPLuuDnxnBF7e7BJeOxmxr54l6ArzFZvC3SGBTuUdt;
   private String vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq;
   private String vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R;
   private String wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou;

   public ActivityStarter(ComponentContainer var1) {
      super(var1.$form());
      Builder var2 = new Builder();
      StrictMode.setVmPolicy(var2.build());
      this.container = var1;
      this.l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j = "";
      this.Action("android.intent.action.MAIN");
      this.ActivityPackage("");
      this.ActivityClass("");
      this.DataUri("");
      this.DataType("");
      this.ExtraKey("");
      this.ExtraValue("");
      YailList var3 = new YailList();
      this.Extras(var3);
      this.ResultName("");
   }

   private Intent hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME() {
      Uri var1;
      if(this.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq.length() != 0) {
         var1 = Uri.parse(this.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq);
      } else {
         var1 = null;
      }

      Uri var2 = var1;
      Intent var3 = new Intent(this.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou);
      Intent var4 = var3;
      if(var1 != null && this.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq.toLowerCase().startsWith("file://")) {
         Log.d("ActivityStarter", "Usng file://");
         File var23 = new File(var1.getPath());
         if(var23.isFile()) {
            Log.d("ActivityStarter", "It\'s a file");
            String var25;
            if(this.form.isCustomPackage()) {
               var25 = this.form.getKodularPackageName();
            } else {
               var25 = this.form.$context().getPackageName();
            }

            Activity var27 = this.form.$context();
            StringBuilder var28 = new StringBuilder();
            var2 = FileProvider.getUriForFile(var27, var28.append(var25).append(".provider").toString(), var23);
            Intent var29 = new Intent(this.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou);
            var4 = var29;
            var29.setFlags(1);
            Log.d("ActivityStarter", "added permissions");
         }
      }

      if(TextUtils.isEmpty(this.Action())) {
         return null;
      } else {
         if(this.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO.length() != 0) {
            if(var2 != null) {
               var4.setDataAndType(var2, this.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO);
            } else {
               var4.setType(this.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO);
            }
         } else {
            var4.setData(var2);
         }

         if(this.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R.length() == 0 && this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE.length() == 0) {
            if(this.Action().equals("android.intent.action.MAIN")) {
               return null;
            }
         } else {
            ComponentName var6 = new ComponentName(this.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R, this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE);
            var4.setComponent(var6);
         }

         if(this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB.length() != 0 && this.sSQuIBUVrx5rcdxHqHgqC6bPLuuDnxnBF7e7BJeOxmxr54l6ArzFZvC3SGBTuUdt.length() != 0) {
            StringBuilder var17 = new StringBuilder("Adding extra, key = ");
            Log.i("ActivityStarter", var17.append(this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB).append(" value = ").append(this.sSQuIBUVrx5rcdxHqHgqC6bPLuuDnxnBF7e7BJeOxmxr54l6ArzFZvC3SGBTuUdt).toString());
            var4.putExtra(this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB, this.sSQuIBUVrx5rcdxHqHgqC6bPLuuDnxnBF7e7BJeOxmxr54l6ArzFZvC3SGBTuUdt);
         }

         Object[] var8 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.toArray();
         int var9 = var8.length;

         for(int var10 = 0; var10 < var9; ++var10) {
            YailList var11 = (YailList)var8[var10];
            String var12 = var11.getString(0);
            String var13 = var11.getString(1);
            if(var12.length() != 0 && var13.length() != 0) {
               StringBuilder var14 = new StringBuilder("Adding extra (pairs), key = ");
               Log.i("ActivityStarter", var14.append(var12).append(" value = ").append(var13).toString());
               var4.putExtra(var12, var13);
            }
         }

         return var4;
      }
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public String Action() {
      return this.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou;
   }

   @DesignerProperty(
      defaultValue = "",
      editorType = "string"
   )
   @SimpleProperty
   public void Action(String var1) {
      this.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou = var1.trim();
   }

   @SimpleEvent(
      description = "Event raised if this ActivityStarter returns because the activity was canceled."
   )
   public void ActivityCanceled() {
      EventDispatcher.dispatchEvent(this, "ActivityCanceled", new Object[0]);
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public String ActivityClass() {
      return this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE;
   }

   @DesignerProperty(
      defaultValue = "",
      editorType = "string"
   )
   @SimpleProperty
   public void ActivityClass(String var1) {
      this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = var1.trim();
   }

   @SimpleEvent(
      description = "The ActivityError event is no longer used. Please use the Screen.ErrorOccurred event instead.",
      userVisible = false
   )
   public void ActivityError(String var1) {
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public String ActivityPackage() {
      return this.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R;
   }

   @DesignerProperty(
      defaultValue = "",
      editorType = "string"
   )
   @SimpleProperty
   public void ActivityPackage(String var1) {
      this.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R = var1.trim();
   }

   @SimpleEvent(
      description = "Event raised after this ActivityStarter returns."
   )
   public void AfterActivity(String var1) {
      EventDispatcher.dispatchEvent(this, "AfterActivity", new Object[]{var1});
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public String DataType() {
      return this.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO;
   }

   @DesignerProperty(
      defaultValue = "",
      editorType = "string"
   )
   @SimpleProperty
   public void DataType(String var1) {
      this.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO = var1.trim();
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public String DataUri() {
      return this.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq;
   }

   @DesignerProperty(
      defaultValue = "",
      editorType = "string"
   )
   @SimpleProperty
   public void DataUri(String var1) {
      this.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq = var1.trim();
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR,
      description = "Returns the extra key that will be passed to the activity.\nDEPRECATED: New code should use Extras property instead."
   )
   public String ExtraKey() {
      return this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB;
   }

   @DesignerProperty(
      defaultValue = "",
      editorType = "string"
   )
   @SimpleProperty
   public void ExtraKey(String var1) {
      this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB = var1.trim();
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR,
      description = "Returns the extra value that will be passed to the activity.\nDEPRECATED: New code should use Extras property instead."
   )
   public String ExtraValue() {
      return this.sSQuIBUVrx5rcdxHqHgqC6bPLuuDnxnBF7e7BJeOxmxr54l6ArzFZvC3SGBTuUdt;
   }

   @DesignerProperty(
      defaultValue = "",
      editorType = "string"
   )
   @SimpleProperty
   public void ExtraValue(String var1) {
      this.sSQuIBUVrx5rcdxHqHgqC6bPLuuDnxnBF7e7BJeOxmxr54l6ArzFZvC3SGBTuUdt = var1.trim();
   }

   @SimpleProperty
   public YailList Extras() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   }

   @SimpleProperty
   public void Extras(YailList var1) {
      Object[] var2 = var1.toArray();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Object var5 = var2[var4];
         boolean var6 = var5 instanceof YailList;
         boolean var7;
         if(var6) {
            if(((YailList)var5).size() == 2) {
               var7 = true;
            } else {
               var7 = false;
            }
         } else {
            var7 = false;
         }

         if(!var6 || !var7) {
            YailRuntimeError var9 = new YailRuntimeError("Argument to Extras should be a list of pairs", "ActivityStarter Error");
            throw var9;
         }
      }

      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var1;
   }

   @SimpleFunction(
      description = "Returns the name of the activity that corresponds to this ActivityStarter, or an empty string if no corresponding activity can be found."
   )
   public String ResolveActivity() {
      Intent var1 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME();
      ResolveInfo var2 = this.container.$context().getPackageManager().resolveActivity(var1, 0);
      return var2 != null && var2.activityInfo != null?var2.activityInfo.name:"";
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public String Result() {
      return this.l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j;
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public String ResultName() {
      return this.mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT;
   }

   @DesignerProperty(
      defaultValue = "",
      editorType = "string"
   )
   @SimpleProperty
   public void ResultName(String var1) {
      this.mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT = var1.trim();
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public String ResultType() {
      if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME != null) {
         String var1 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getType();
         if(var1 != null) {
            return var1;
         }
      }

      return "";
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR
   )
   public String ResultUri() {
      if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME != null) {
         String var1 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getDataString();
         if(var1 != null) {
            return var1;
         }
      }

      return "";
   }

   @SimpleFunction(
      description = "Start the activity corresponding to this ActivityStarter."
   )
   public void StartActivity() {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = null;
      this.l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j = "";
      Intent var1 = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME();
      if(this.requestCode == 0) {
         this.requestCode = this.form.registerForActivityResult(this);
      }

      if(var1 == null) {
         this.form.dispatchErrorOccurredEvent(this, "StartActivity", 602, new Object[0]);
      } else {
         try {
            this.container.$context().startActivityForResult(var1, this.requestCode);
            String var3 = this.container.$form().getOpenAnimType();
            AnimationUtil.ApplyOpenScreenAnimation(this.container.$context(), var3);
         } catch (ActivityNotFoundException var4) {
            this.form.dispatchErrorOccurredEvent(this, "StartActivity", 601, new Object[0]);
         }
      }
   }

   public void onDelete() {
      this.form.unregisterForActivityResult(this);
   }

   public void resultReturned(int var1, int var2, Intent var3) {
      if(var1 == this.requestCode) {
         Log.i("ActivityStarter", "resultReturned - resultCode = ".concat(String.valueOf(var2)));
         if(var2 == -1) {
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var3;
            if(this.mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT.length() != 0 && this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME != null && this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.hasExtra(this.mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT)) {
               this.l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getStringExtra(this.mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT);
            } else {
               this.l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j = "";
            }

            this.AfterActivity(this.l557Ll1q9gLt3cEfyQaLTgWgvIutpQIPuKKLXX2glk42j33zjQ1xoBSDeCkOGk6j);
            return;
         }

         if(var2 == 0) {
            this.ActivityCanceled();
         }
      }

   }
}
