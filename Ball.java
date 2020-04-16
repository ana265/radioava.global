package com.google.appinventor.components.runtime;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.Sprite;
import com.google.appinventor.components.runtime.util.PaintUtil;

@DesignerComponent(
   category = ComponentCategory.ANIMATION,
   description = "<p>A round \'sprite\' that can be placed on a <code>Canvas</code>, where it can react to touches and drags, interact with other sprites (<code>ImageSprite</code>s and other <code>Ball</code>s) and the edge of the Canvas, and move according to its property values.</p><p>For example, to have a <code>Ball</code> move 4 pixels toward the top of a <code>Canvas</code> every 500 milliseconds (half second), you would set the <code>Speed</code> property to 4 [pixels], the <code>Interval</code> property to 500 [milliseconds], the <code>Heading</code> property to 90 [degrees], and the <code>Enabled</code> property to <code>True</code>.</p><p>The difference between a <code>Ball</code> and an <code>ImageSprite</code> is that the latter can get its appearance from an image file, while a <code>Ball</code>\'s appearance can be changed only by varying its <code>PaintColor</code> and <code>Radius</code> properties.</p>",
   version = 6
)
@SimpleObject
public final class Ball extends Sprite {
   private int B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T;
   private int hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private Paint hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

   public Ball(ComponentContainer var1) {
      super(var1);
      Paint var2 = new Paint();
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var2;
      this.PaintColor(-16777216);
      this.Radius(5);
   }

   public final int Height() {
      return 2 * this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   }

   public final void Height(int var1) {
   }

   public final void HeightPercent(int var1) {
   }

   @SimpleFunction(
      description = "Sets the x and y coordinates of the Ball. If CenterAtOrigin is true, the center of the Ball will be placed here. Otherwise, the top left edge of the Ball will be placed at the specified coordinates."
   )
   public final void MoveTo(double var1, double var3) {
      super.MoveTo(var1, var3);
   }

   @DesignerProperty(
      defaultValue = "False",
      editorType = "boolean"
   )
   @SimpleProperty(
      description = "Whether the x- and y-coordinates should represent the center of the Ball (<code>true</code>) or its left and top edges (<code>false</code>).",
      userVisible = false
   )
   public final void OriginAtCenter(boolean var1) {
      super.OriginAtCenter(var1);
   }

   @SimpleProperty(
      description = "The color of the Ball."
   )
   public final int PaintColor() {
      return this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T;
   }

   @DesignerProperty(
      defaultValue = "&HFF000000",
      editorType = "color"
   )
   @SimpleProperty
   public final void PaintColor(int var1) {
      this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T = var1;
      if(var1 != 0) {
         PaintUtil.changePaint(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var1);
      } else {
         PaintUtil.changePaint(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, -16777216);
      }

      this.registerChange();
   }

   @SimpleProperty
   public final int Radius() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   }

   @DesignerProperty(
      defaultValue = "5",
      editorType = "non_negative_integer"
   )
   @SimpleProperty(
      description = "The distance from the edge of the Ball to its center."
   )
   public final void Radius(int var1) {
      int var2 = var1 - this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
      if(this.originAtCenter) {
         this.xLeft -= (double)var2;
         this.yTop -= (double)var2;
      }

      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var1;
      this.registerChange();
   }

   public final int Width() {
      return 2 * this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   }

   public final void Width(int var1) {
   }

   public final void WidthPercent(int var1) {
   }

   @SimpleProperty(
      description = "The horizontal coordinate of the Ball, increasing as the Ball moves right. If the property OriginAtCenter is true, the coodinate is for the center of the Ball; otherwise, it is for the leftmost point of the Ball."
   )
   public final double X() {
      return super.X();
   }

   @SimpleProperty(
      description = "The vertical coordinate of the Ball, increasing as the Ball moves down. If the property OriginAtCenter is true, the coodinate is for the center of the Ball; otherwise, it is for the uppermost point of the Ball."
   )
   public final double Y() {
      return super.Y();
   }

   public final boolean containsPoint(double var1, double var3) {
      return (var1 - this.xCenter) * (var1 - this.xCenter) + (var3 - this.yCenter) * (var3 - this.yCenter) <= (double)(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME * this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
   }

   protected final void onDraw(Canvas var1) {
      if(this.visible) {
         float var2 = (float)(this.xLeft * (double)this.form.deviceDensity());
         float var3 = (float)(this.yTop * (double)this.form.deviceDensity());
         float var4 = (float)this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME * this.form.deviceDensity();
         var1.drawCircle(var2 + var4, var3 + var4, var4, this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
      }

   }
}
