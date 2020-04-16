package com.google.appinventor.components.runtime;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.UsesLibraries;
import com.google.appinventor.components.annotations.UsesPermissions;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.util.KitkatUtil;
import com.google.appinventor.components.runtime.util.KodularHelper;
import com.google.appinventor.components.runtime.util.MediaUtil;
import com.google.appinventor.components.runtime.util.ProgressHelper;
import com.google.appinventor.components.runtime.util.TextViewUtil;
import com.google.appinventor.components.runtime.util.ViewUtil;

@SimpleObject
@UsesLibraries(
   libraries = "spinkit.jar"
)
@UsesPermissions(
   permissionNames = "android.permission.INTERNET"
)
public abstract class ButtonBase extends AndroidViewComponent implements OnClickListener, OnFocusChangeListener, OnLongClickListener, OnTouchListener {
   private static final float[] hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = new float[]{10.0F, 10.0F, 10.0F, 10.0F, 10.0F, 10.0F, 10.0F, 10.0F};
   private static int mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT = 0;
   private static int sSQuIBUVrx5rcdxHqHgqC6bPLuuDnxnBF7e7BJeOxmxr54l6ArzFZvC3SGBTuUdt = 0;
   private boolean ANz72NxTeEmYo9CF87MXRUuH7WvE4u0mpZwxffTnyiMdygEQRKvmdTCHaXqAvud = true;
   private AlphaAnimation B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T;
   private Button B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T;
   private int Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB = -6381922;
   private boolean PpoaLB2hgzDTOuqu9FkRmbGOAi4DOSz44cSb2WOQzHfJN0AfA0f9dWyZXVLXkHHC = false;
   private int backgroundColor = -12303292;
   private Drawable backgroundImageDrawable;
   private Context context;
   private int fontTypeface = 0;
   private ColorStateList hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private Drawable hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private AlphaAnimation hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private final Button hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private String imagePath = "";
   private boolean moH2L3ThNq0Qhevz3oD0wpnUoXefdMi3gJ5JHfEbjrtgsvRvpM1e34BZQYI4s5i0 = true;
   private int qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = 0;
   private double rotationAngle = 0.0D;
   private boolean tee1T53LBirhPaiZzuBv7do2U2eC3n16AtczACNW2pKYEGgDhkkMv1hGUupyoKZE = false;
   private int textColor = -1;
   private int vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R = 1;
   private boolean wGMjbGuJ9Yk6s2LaEm8v1pEJlXt36TYBWZSsia0LUgb1yMdHNGB7uRz3VqnF79D0;

   public ButtonBase(ComponentContainer var1) {
      super(var1);
      this.context = var1.$context();
      Button var2 = new Button(this.context);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var2;
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setAllCaps(false);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getBackground();
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getTextColors();
      sSQuIBUVrx5rcdxHqHgqC6bPLuuDnxnBF7e7BJeOxmxr54l6ArzFZvC3SGBTuUdt = KitkatUtil.getMinWidth(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
      mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT = KitkatUtil.getMinHeight(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
      this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
      AlphaAnimation var3 = new AlphaAnimation(1.0F, 0.9F);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var3;
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setDuration(350L);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setFillAfter(true);
      AlphaAnimation var4 = new AlphaAnimation(0.9F, 1.0F);
      this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T = var4;
      this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T.setDuration(350L);
      this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T.setFillAfter(true);
      var1.$add(this);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setOnClickListener(this);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setOnFocusChangeListener(this);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setOnLongClickListener(this);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setOnTouchListener(this);
      this.TextAlignment(1);
      this.BackgroundColor(-12303292);
      this.Image("");
      this.Enabled(true);
      TextViewUtil.setContext(this.context);
      TextViewUtil.setFontTypeface(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, this.fontTypeface, this.PpoaLB2hgzDTOuqu9FkRmbGOAi4DOSz44cSb2WOQzHfJN0AfA0f9dWyZXVLXkHHC, this.tee1T53LBirhPaiZzuBv7do2U2eC3n16AtczACNW2pKYEGgDhkkMv1hGUupyoKZE);
      this.FontSize(14.0F);
      this.Text("");
      this.TextColor(-1);
      this.Shape(0);
      this.TouchColor(-3355444);
      this.RotationAngle(0.0D);
      this.BorderShadow(true);
      this.FontBold(false);
      this.FontItalic(false);
      this.FontTypeface(0);
      this.FontTypefaceImport("");
      this.Width(-1);
      this.Height(-1);
   }

   private void hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO() {
      ShapeDrawable var1 = new ShapeDrawable();
      int var2;
      if(this.backgroundColor != -12303292 && this.backgroundColor != 0) {
         var2 = this.backgroundColor;
      } else {
         var2 = Color.parseColor("#5a595b");
      }

      var1.getPaint().setColor(var2);
      switch(this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE) {
      case 1:
         RoundRectShape var5 = new RoundRectShape(hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, (RectF)null, (float[])null);
         var1.setShape(var5);
         break;
      case 2:
         RectShape var4 = new RectShape();
         var1.setShape(var4);
         break;
      case 3:
         OvalShape var3 = new OvalShape();
         var1.setShape(var3);
         break;
      default:
         IllegalArgumentException var6 = new IllegalArgumentException();
         throw var6;
      }

      if(VERSION.SDK_INT >= 21) {
         if(this.ShowFeedback()) {
            KodularHelper.setRippleDrawable(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var1, this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB);
            this.setMargin();
         } else {
            ViewUtil.setBackgroundDrawable(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var1);
            this.setMargin();
         }
      } else {
         ViewUtil.setBackgroundDrawable(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var1);
         this.setMargin();
      }
   }

   private static void hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(Button var0, String var1, Drawable var2, int var3) {
      if(var1.equalsIgnoreCase("Left")) {
         var0.setCompoundDrawables(var2, (Drawable)null, (Drawable)null, (Drawable)null);
         var0.setCompoundDrawablePadding(var3);
      } else if(var1.equalsIgnoreCase("Top")) {
         var0.setCompoundDrawables((Drawable)null, var2, (Drawable)null, (Drawable)null);
         var0.setCompoundDrawablePadding(var3);
      } else if(var1.equalsIgnoreCase("Right")) {
         var0.setCompoundDrawables((Drawable)null, (Drawable)null, var2, (Drawable)null);
         var0.setCompoundDrawablePadding(var3);
      } else {
         if(var1.equalsIgnoreCase("Bottom")) {
            var0.setCompoundDrawables((Drawable)null, (Drawable)null, (Drawable)null, var2);
            var0.setCompoundDrawablePadding(var3);
         }

      }
   }

   private void updateAppearance() {
      if(this.backgroundImageDrawable != null) {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setBackground(this.backgroundImageDrawable);
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.invalidate();
         TextViewUtil.setMinSize(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, 0, 0);
      } else {
         if(this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE == 0) {
            if(this.backgroundColor != -12303292 && this.backgroundColor != 0) {
               if(this.backgroundColor != 16777215 && this.backgroundColor != 16777215) {
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setBackground((Drawable)null);
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setBackground(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getBackground().setColorFilter(this.backgroundColor, Mode.SRC_ATOP);
               } else {
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setBackground((Drawable)null);
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setBackground(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getBackground().setAlpha(0);
               }
            } else {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setBackground(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
            }

            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.invalidate();
         } else {
            this.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO();
         }

         TextViewUtil.setMinSize(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, sSQuIBUVrx5rcdxHqHgqC6bPLuuDnxnBF7e7BJeOxmxr54l6ArzFZvC3SGBTuUdt, mBLKdPlRolYfdtud5Z8giGWyhURWoCw9yHsOv08fUnIBAM4MuKAWkHVD8nEhBmIT);
      }
   }

   @SimpleFunction(
      description = "Allows you to set animation style. Valid (case-insensitive) values are: ChasingDots, Circle, CubeGrid, DoubleBounce, FadingCircle, FoldingCube, Pulse, RotatingCircle, RotatingPlane, ThreeBounce, WanderingCubes, Wave. If invalid style is used, animation will be removed.Position can be: top, left, right, bottom. Size can be 100. "
   )
   public void AnimationStyle(String var1, String var2, int var3, int var4) {
      ProgressHelper.setButtonProgressAnimation(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var1, var2, var3, var4);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setVisibility(8);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setVisibility(0);
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.invalidate();
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "Returns the button\'s background color"
   )
   public int BackgroundColor() {
      return this.backgroundColor;
   }

   @DesignerProperty(
      defaultValue = "&HFF444444",
      editorType = "color"
   )
   @SimpleProperty(
      description = "Specifies the button\'s background color. The background color will not be visible if an Image is being displayed."
   )
   public void BackgroundColor(int var1) {
      this.backgroundColor = var1;
      this.updateAppearance();
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "boolean",
      propertyType = "advanced"
   )
   @SimpleProperty(
      userVisible = false
   )
   public void BorderShadow(boolean var1) {
      if(VERSION.SDK_INT >= 21) {
         if(var1) {
            try {
               if(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getStateListAnimator() == null) {
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setStateListAnimator(this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T.getStateListAnimator());
                  this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.invalidate();
                  this.ANz72NxTeEmYo9CF87MXRUuH7WvE4u0mpZwxffTnyiMdygEQRKvmdTCHaXqAvud = true;
               }

            } catch (Exception var6) {
               Log.e("ButtonBase", String.valueOf(var6));
            }
         } else {
            try {
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setStateListAnimator((StateListAnimator)null);
               this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.invalidate();
               this.ANz72NxTeEmYo9CF87MXRUuH7WvE4u0mpZwxffTnyiMdygEQRKvmdTCHaXqAvud = false;
            } catch (Exception var7) {
               Log.e("ButtonBase", String.valueOf(var7));
            }
         }
      } else {
         Log.i("ButtonBase", "Can not change button border shadows property. The api level of the device is <= 21.");
      }
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "Returns true if the button have a outside border shadow on click."
   )
   public boolean BorderShadow() {
      return this.ANz72NxTeEmYo9CF87MXRUuH7WvE4u0mpZwxffTnyiMdygEQRKvmdTCHaXqAvud;
   }

   @SimpleFunction(
      description = "Perform a button click as function."
   )
   public void ButtonClick() {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.performClick();
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "boolean"
   )
   @SimpleProperty
   public void Enabled(boolean var1) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setEnabled(var1);
   }

   @SimpleProperty(
      category = PropertyCategory.BEHAVIOR,
      description = "If set, user can tap check box to cause action."
   )
   public boolean Enabled() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.isEnabled();
   }

   @DesignerProperty(
      defaultValue = "False",
      editorType = "boolean"
   )
   @SimpleProperty(
      category = PropertyCategory.APPEARANCE
   )
   public void FontBold(boolean var1) {
      this.PpoaLB2hgzDTOuqu9FkRmbGOAi4DOSz44cSb2WOQzHfJN0AfA0f9dWyZXVLXkHHC = var1;
      TextViewUtil.setFontTypeface(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, this.fontTypeface, this.PpoaLB2hgzDTOuqu9FkRmbGOAi4DOSz44cSb2WOQzHfJN0AfA0f9dWyZXVLXkHHC, this.tee1T53LBirhPaiZzuBv7do2U2eC3n16AtczACNW2pKYEGgDhkkMv1hGUupyoKZE);
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "If set, button text is displayed in bold."
   )
   public boolean FontBold() {
      return this.PpoaLB2hgzDTOuqu9FkRmbGOAi4DOSz44cSb2WOQzHfJN0AfA0f9dWyZXVLXkHHC;
   }

   @DesignerProperty(
      defaultValue = "False",
      editorType = "boolean"
   )
   @SimpleProperty(
      category = PropertyCategory.APPEARANCE
   )
   public void FontItalic(boolean var1) {
      this.tee1T53LBirhPaiZzuBv7do2U2eC3n16AtczACNW2pKYEGgDhkkMv1hGUupyoKZE = var1;
      TextViewUtil.setFontTypeface(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, this.fontTypeface, this.PpoaLB2hgzDTOuqu9FkRmbGOAi4DOSz44cSb2WOQzHfJN0AfA0f9dWyZXVLXkHHC, this.tee1T53LBirhPaiZzuBv7do2U2eC3n16AtczACNW2pKYEGgDhkkMv1hGUupyoKZE);
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "If set, button text is displayed in italics."
   )
   public boolean FontItalic() {
      return this.tee1T53LBirhPaiZzuBv7do2U2eC3n16AtczACNW2pKYEGgDhkkMv1hGUupyoKZE;
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "Point size for button text."
   )
   public float FontSize() {
      return TextViewUtil.getFontSize(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, this.context);
   }

   @DesignerProperty(
      defaultValue = "14.0",
      editorType = "non_negative_float"
   )
   @SimpleProperty(
      category = PropertyCategory.APPEARANCE
   )
   public void FontSize(float var1) {
      TextViewUtil.setFontSize(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var1);
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "Font family for button text.",
      userVisible = false
   )
   public int FontTypeface() {
      return this.fontTypeface;
   }

   @DesignerProperty(
      defaultValue = "0",
      editorType = "typeface"
   )
   @SimpleProperty(
      userVisible = false
   )
   public void FontTypeface(int var1) {
      this.fontTypeface = var1;
      TextViewUtil.setFontTypeface(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, this.fontTypeface, this.PpoaLB2hgzDTOuqu9FkRmbGOAi4DOSz44cSb2WOQzHfJN0AfA0f9dWyZXVLXkHHC, this.tee1T53LBirhPaiZzuBv7do2U2eC3n16AtczACNW2pKYEGgDhkkMv1hGUupyoKZE);
   }

   @DesignerProperty(
      defaultValue = "",
      editorType = "font_asset",
      propertyType = "advanced"
   )
   @SimpleProperty(
      description = "Set a custom font."
   )
   public void FontTypefaceImport(String var1) {
      if(var1 != null) {
         TextViewUtil.setCustomFontTypeface(this.container.$form(), this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var1, this.PpoaLB2hgzDTOuqu9FkRmbGOAi4DOSz44cSb2WOQzHfJN0AfA0f9dWyZXVLXkHHC, this.tee1T53LBirhPaiZzuBv7do2U2eC3n16AtczACNW2pKYEGgDhkkMv1hGUupyoKZE);
      }

   }

   @SimpleEvent(
      description = "Indicates the cursor moved over the button so it is now possible to click it."
   )
   public void GotFocus() {
      EventDispatcher.dispatchEvent(this, "GotFocus", new Object[0]);
   }

   @DesignerProperty(
      defaultValue = "False",
      editorType = "boolean",
      propertyType = "advanced"
   )
   @SimpleProperty(
      userVisible = false
   )
   public void HTMLFormat(boolean var1) {
      this.wGMjbGuJ9Yk6s2LaEm8v1pEJlXt36TYBWZSsia0LUgb1yMdHNGB7uRz3VqnF79D0 = var1;
      this.Text(this.Text());
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "If true, then this button will show html text else it will show plain text. Note: Not all HTML is supported."
   )
   public boolean HTMLFormat() {
      return this.wGMjbGuJ9Yk6s2LaEm8v1pEJlXt36TYBWZSsia0LUgb1yMdHNGB7uRz3VqnF79D0;
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "Image to display on button."
   )
   public String Image() {
      return this.imagePath;
   }

   @DesignerProperty(
      defaultValue = "",
      editorType = "image_asset"
   )
   @SimpleProperty(
      description = "Specifies the path of the button\'s image.  If there is both an Image and a BackgroundColor, only the Image will be visible."
   )
   public void Image(String var1) {
      if(!var1.equals(this.imagePath) || this.backgroundImageDrawable == null) {
         String var2;
         if(var1 == null) {
            var2 = "";
         } else {
            var2 = var1;
         }

         this.imagePath = var2;
         this.backgroundImageDrawable = null;
         if(this.imagePath.length() > 0) {
            try {
               this.backgroundImageDrawable = MediaUtil.getBitmapDrawable(this.container.$form(), this.imagePath);
            } catch (Exception var5) {
               StringBuilder var4 = new StringBuilder("Unable to load ");
               Log.e("ButtonBase", var4.append(this.imagePath).toString());
            }
         }

         this.updateAppearance();
      }
   }

   @SimpleEvent(
      description = "Indicates the cursor moved away from the button so it is now no longer possible to click it."
   )
   public void LostFocus() {
      EventDispatcher.dispatchEvent(this, "LostFocus", new Object[0]);
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "Sets the degrees that the button is rotated around the pivot point. Increasing values result in clockwise rotation."
   )
   public double RotationAngle() {
      return this.rotationAngle;
   }

   @DesignerProperty(
      defaultValue = "0.0",
      editorType = "float",
      propertyType = "advanced"
   )
   @SimpleProperty
   public void RotationAngle(double var1) {
      this.rotationAngle = var1;
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setRotation((float)this.rotationAngle);
   }

   @SimpleFunction(
      description = "Place a blurred shadow of text underneath the text, drawn with the specified x, y, radius, color (e.g. -11, 12, 13, black."
   )
   public void SetShadow(float var1, float var2, float var3, int var4) {
      KodularHelper.setShadow(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var1, var2, var3, var4);
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      userVisible = false
   )
   public int Shape() {
      return this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE;
   }

   @DesignerProperty(
      defaultValue = "0",
      editorType = "button_shape"
   )
   @SimpleProperty(
      description = "Specifies the button\'s shape (default, rounded, rectangular, oval). The shape will not be visible if an Image is being displayed.",
      userVisible = false
   )
   public void Shape(int var1) {
      this.qPeHJnCLP0dAOwDPeFIn82vcSIsCMh6KFFn3o4kyIe0RhQKOQXDeyY2LFwPu2GbE = var1;
      this.updateAppearance();
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "boolean",
      propertyType = "advanced"
   )
   @SimpleProperty(
      description = "Specifies if a visual feedback should be shown for a button that as an image as background."
   )
   public void ShowFeedback(boolean var1) {
      this.moH2L3ThNq0Qhevz3oD0wpnUoXefdMi3gJ5JHfEbjrtgsvRvpM1e34BZQYI4s5i0 = var1;
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "Returns the button\'s visual feedback state"
   )
   public boolean ShowFeedback() {
      return this.moH2L3ThNq0Qhevz3oD0wpnUoXefdMi3gJ5JHfEbjrtgsvRvpM1e34BZQYI4s5i0;
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "Text to display on button."
   )
   public String Text() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.getText().toString();
   }

   @DesignerProperty(
      editorType = "string"
   )
   @SimpleProperty
   public void Text(String var1) {
      if(this.wGMjbGuJ9Yk6s2LaEm8v1pEJlXt36TYBWZSsia0LUgb1yMdHNGB7uRz3VqnF79D0) {
         TextViewUtil.setTextHTML(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var1);
      } else {
         TextViewUtil.setText(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var1);
      }
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "Left, center, or right.",
      userVisible = false
   )
   public int TextAlignment() {
      return this.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R;
   }

   @DesignerProperty(
      defaultValue = "1",
      editorType = "textalignment"
   )
   @SimpleProperty(
      userVisible = false
   )
   public void TextAlignment(int var1) {
      this.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R = var1;
      TextViewUtil.setAlignment(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, this.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R, true);
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "Color for button text."
   )
   public int TextColor() {
      return this.textColor;
   }

   @DesignerProperty(
      defaultValue = "&HFFFFFFFF",
      editorType = "color"
   )
   @SimpleProperty
   public void TextColor(int var1) {
      this.textColor = var1;
      if(var1 != 0) {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setTextColor(var1);
      } else {
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.setTextColor(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
      }
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE,
      description = "Returns the buttons touch color."
   )
   public int TouchColor() {
      return this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB;
   }

   @DesignerProperty(
      defaultValue = "&HFFCCCCCC",
      editorType = "color",
      propertyType = "advanced"
   )
   @SimpleProperty(
      description = "Set the buttons touch color."
   )
   public void TouchColor(int var1) {
      if(var1 != 0) {
         this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB = var1;
      } else {
         this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB = -3355444;
      }
   }

   @SimpleEvent(
      description = "Indicates that the button was pressed down."
   )
   public void TouchDown() {
      EventDispatcher.dispatchEvent(this, "TouchDown", new Object[0]);
   }

   @SimpleEvent(
      description = "Indicates that a button has been released."
   )
   public void TouchUp() {
      EventDispatcher.dispatchEvent(this, "TouchUp", new Object[0]);
   }

   @SimpleFunction(
      description = "Show an image on the given position near to the button. You can use following words for the position: \'Left\', \'Right\', \'Top\' or \'Bottom\'. Use the padding to add space between the icon and text. Use a material icon as the button icon without uploading a image resource into your project. You can find the icon name (or code) here at https://fontawesome.com/cheatsheet Use as example for a heart icon just \'f004\'."
   )
   public void WithIconFromFontAwesome(String var1, String var2, int var3, int var4, float var5) {
      String var6 = var2;
      float var7 = var5;
      if(var5 == 0.0F) {
         var7 = 80.0F;
      }

      int var8 = (int)var7;
      String var9 = var2;

      BitmapDrawable var13;
      try {
         if(!var9.startsWith("&#x")) {
            var6 = "&#x".concat(String.valueOf(var6));
         }

         if(!var6.endsWith(";")) {
            StringBuilder var12 = new StringBuilder();
            var6 = var12.append(var6).append(";").toString();
         }

         var13 = new BitmapDrawable(KodularHelper.textToBitmap(this.context, "font_awesome", var6, var3, var7));
         var13.setBounds(0, 0, var8, var8);
      } catch (Exception var14) {
         Log.e("ButtonBase", "Unable to load the material icon font.");
         return;
      }

      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var1, var13, var4);
   }

   @SimpleFunction(
      description = "Show an image on the given position near to the button. You can use following words for the position: \'Left\', \'Right\', \'Top\' or \'Bottom\'. Use the padding to add space between the icon and text. Use a material icon as the button icon without uploading a image resource into your project. You can find the icon name (or code) here at https://material.io/icons"
   )
   public void WithIconFromMaterialFont(String var1, String var2, int var3, int var4, float var5) {
      float var6 = var5;
      if(var5 == 0.0F) {
         var6 = 80.0F;
      }

      int var7 = (int)var6;

      BitmapDrawable var8;
      try {
         var8 = new BitmapDrawable(KodularHelper.textToBitmap(this.context, "material", var2, var3, var6));
         var8.setBounds(0, 0, var7, var7);
      } catch (Exception var10) {
         Log.e("ButtonBase", "Unable to load the material icon font.");
         return;
      }

      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var1, var8, var4);
   }

   @SimpleFunction(
      description = "Show an image on the given position near to the button. You can use following words for the position: \'Left\', \'Right\', \'Top\' or \'Bottom\'. Use the padding to add space between the icon and text."
   )
   public void WithIconFromPicture(String param1, String param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public abstract void click();

   public View getView() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   }

   public boolean longClick() {
      return false;
   }

   public void onClick(View var1) {
      this.click();
   }

   public void onFocusChange(View var1, boolean var2) {
      if(var2) {
         this.GotFocus();
      } else {
         this.LostFocus();
      }
   }

   public boolean onLongClick(View var1) {
      return this.longClick();
   }

   public boolean onTouch(View var1, MotionEvent var2) {
      if(VERSION.SDK_INT >= 21 && this.ShowFeedback() && this.backgroundImageDrawable == null) {
         KodularHelper.prepareRippleDrawable(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var2, this.Co1rSUoyBoOJ9n0NOgrpxvTYmRPklnETeodUBiQlSBK151C8PCv1Q1Pl4SUa1qxB);
      }

      if(var2.getAction() == 0) {
         if(this.ShowFeedback()) {
            if(VERSION.SDK_INT < 21) {
               var1.startAnimation(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
               var1.invalidate();
            } else if(this.backgroundImageDrawable != null) {
               var1.startAnimation(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
               var1.invalidate();
            }
         }

         try {
            this.TouchDown();
         } catch (Exception var7) {
            Log.e("ButtonBase", String.valueOf(var7));
         }
      } else if(var2.getAction() == 1 || var2.getAction() == 3) {
         if(this.ShowFeedback()) {
            if(VERSION.SDK_INT < 21) {
               var1.startAnimation(this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T);
               var1.invalidate();
            } else if(this.backgroundImageDrawable != null) {
               var1.startAnimation(this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T);
               var1.invalidate();
            }
         }

         try {
            this.TouchUp();
         } catch (Exception var6) {
            Log.e("ButtonBase", String.valueOf(var6));
         }
      }

      return false;
   }

   public void setMargin() {
      KodularHelper.setMarginToButton(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, this.context, 4, 2, 4, 2);
   }
}
