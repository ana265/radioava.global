package com.google.appinventor.components.runtime;

import android.os.Handler;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.runtime.AlarmHandler;
import com.google.appinventor.components.runtime.Canvas;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.Deleteable;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.OnDestroyListener;
import com.google.appinventor.components.runtime.VisibleComponent;
import com.google.appinventor.components.runtime.Sprite.1;
import com.google.appinventor.components.runtime.errors.IllegalArgumentError;
import com.google.appinventor.components.runtime.util.BoundingBox;
import com.google.appinventor.components.runtime.util.TimerInternal;
import java.util.HashSet;
import java.util.Set;

@SimpleObject
public abstract class Sprite extends VisibleComponent implements AlarmHandler, Deleteable, OnDestroyListener {
   protected static final boolean DEFAULT_ORIGIN_AT_CENTER;
   private final Handler androidUIHandler;
   protected final Canvas canvas;
   protected Form form;
   protected double heading;
   protected double headingCos;
   protected double headingRadians;
   protected double headingSin;
   private final TimerInternal hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   protected boolean initialized;
   protected int interval;
   protected boolean originAtCenter;
   protected float speed;
   protected double userHeading;
   private final Set vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq;
   protected boolean visible;
   protected double xCenter;
   protected double xLeft;
   protected double yCenter;
   protected double yTop;
   protected double zLayer;

   protected Sprite(ComponentContainer var1) {
      Handler var2 = new Handler();
      this(var1, var2);
   }

   protected Sprite(ComponentContainer var1, Handler var2) {
      this.initialized = false;
      this.visible = true;
      this.androidUIHandler = var2;
      if(!(var1 instanceof Canvas)) {
         IllegalArgumentError var3 = new IllegalArgumentError("Sprite constructor called with container ".concat(String.valueOf(var1)));
         throw var3;
      } else {
         this.canvas = (Canvas)var1;
         this.canvas.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this);
         HashSet var4 = new HashSet();
         this.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq = var4;
         TimerInternal var5 = new TimerInternal(this, true, 100, var2);
         this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var5;
         this.form = var1.$form();
         this.OriginAtCenter(false);
         this.Heading(0.0D);
         this.Enabled(true);
         this.Interval(100);
         this.Speed(0.0F);
         this.Visible(true);
         this.Z(1.0D);
         var1.$form().registerForOnDestroy(this);
      }
   }

   private double B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(double var1) {
      return var1 + (double)(this.Width() / 2);
   }

   private void B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(double var1) {
      if(this.originAtCenter) {
         this.yCenter = var1;
         this.yTop = var1 - (double)(this.Width() / 2);
      } else {
         this.yTop = var1;
         this.yCenter = this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(var1);
      }
   }

   private final boolean B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(int var1) {
      return this.xLeft + (double)this.Width() > (double)var1;
   }

   public static boolean colliding(Sprite var0, Sprite var1) {
      BoundingBox var2 = var0.getBoundingBox(1);
      if(!var2.intersectDestructively(var1.getBoundingBox(1))) {
         return false;
      } else {
         for(double var3 = var2.getLeft(); var3 <= var2.getRight(); ++var3) {
            for(double var5 = var2.getTop(); var5 <= var2.getBottom(); ++var5) {
               if(var0.containsPoint(var3, var5) && var1.containsPoint(var3, var5)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private final boolean hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO() {
      return this.xLeft < 0.0D;
   }

   private double hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(double var1) {
      return var1 + (double)(this.Width() / 2);
   }

   private void hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(double var1) {
      if(this.originAtCenter) {
         this.xCenter = var1;
         this.xLeft = var1 - (double)(this.Width() / 2);
      } else {
         this.xLeft = var1;
         this.xCenter = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(var1);
      }
   }

   private final boolean vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R() {
      return this.yTop < 0.0D;
   }

   private final boolean wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou(int var1) {
      return this.yTop + (double)this.Height() > (double)var1;
   }

   @SimpleFunction(
      description = "Makes the %type% bounce, as if off a wall. For normal bouncing, the edge argument should be the one returned by EdgeReached."
   )
   public void Bounce(int var1) {
      this.MoveIntoBounds();
      double var2 = this.userHeading % 360.0D;
      double var4 = var2;
      if(var2 < 0.0D) {
         var4 = 360.0D + var2;
      }

      if(var1 == 3 && (var4 < 90.0D || var4 > 270.0D) || var1 == -3 && var4 > 90.0D && var4 < 270.0D) {
         this.Heading(180.0D - var4);
      } else if(var1 == 1 && var4 > 0.0D && var4 < 180.0D || var1 == -1 && var4 > 180.0D) {
         this.Heading(360.0D - var4);
      } else {
         if(var1 == 2 && var4 > 0.0D && var4 < 90.0D || var1 == -4 && var4 > 90.0D && var4 < 180.0D || var1 == -2 && var4 > 180.0D && var4 < 270.0D || var1 == 4 && var4 > 270.0D) {
            this.Heading(180.0D + var4);
         }

      }
   }

   @SimpleEvent
   public void CollidedWith(Sprite var1) {
      if(!this.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq.contains(var1)) {
         this.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq.add(var1);
         this.postEvent(this, "CollidedWith", new Object[]{var1});
      }

   }

   @SimpleFunction(
      description = "Indicates whether a collision has been registered between this %type% and the passed sprite (Ball or ImageSprite)."
   )
   public boolean CollidingWith(Sprite var1) {
      return this.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq.contains(var1);
   }

   @SimpleEvent(
      description = "Event handler called when a %type% is dragged. On all calls, the starting coordinates are where the screen was first touched, and the \"current\" coordinates describe the endpoint of the current line segment. On the first call within a given drag, the \"previous\" coordinates are the same as the starting coordinates; subsequently, they are the \"current\" coordinates from the prior call. Note that the %type% won\'t actually move anywhere in response to the Dragged event unless MoveTo is explicitly called. For smooth movement, each of its coordinates should be set to the sum of its initial value and the difference between its current and previous values."
   )
   public void Dragged(float var1, float var2, float var3, float var4, float var5, float var6) {
      Object[] var7 = new Object[]{Float.valueOf(var1), Float.valueOf(var2), Float.valueOf(var3), Float.valueOf(var4), Float.valueOf(var5), Float.valueOf(var6)};
      this.postEvent(this, "Dragged", var7);
   }

   @SimpleEvent(
      description = "Event handler called when the %type% reaches an edge of the screen. If Bounce is then called with that edge, the %type% will appear to bounce off of the edge it reached. Edge here is represented as an integer that indicates one of eight directions north (1), northeast (2), east (3), southeast (4), south (-1), southwest (-2), west (-3), and northwest (-4)."
   )
   public void EdgeReached(int var1) {
      if(var1 != 0 && var1 >= -4 && var1 <= 4) {
         Object[] var2 = new Object[]{Integer.valueOf(var1)};
         this.postEvent(this, "EdgeReached", var2);
      }
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "boolean"
   )
   @SimpleProperty
   public void Enabled(boolean var1) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.Enabled(var1);
   }

   @SimpleProperty(
      description = "Controls whether the %type% moves and can be interacted with through collisions, dragging, touching, and flinging."
   )
   public boolean Enabled() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.Enabled();
   }

   @SimpleEvent(
      description = "Event handler called when a fling gesture (quick swipe) is made on an enabled %type%. This provides the x and y coordinates of the start of the fling (relative to the upper left of the canvas), the speed (pixels per millisecond), the heading (0-360 degrees), and the x and y velocity components of the fling\'s vector."
   )
   public void Flung(float var1, float var2, float var3, float var4, float var5, float var6) {
      Object[] var7 = new Object[]{Float.valueOf(var1), Float.valueOf(var2), Float.valueOf(var3), Float.valueOf(var4), Float.valueOf(var5), Float.valueOf(var6)};
      this.postEvent(this, "Flung", var7);
   }

   @SimpleProperty(
      description = "Returns the %type%\'s heading in degrees above the positive x-axis.  Zero degrees is toward the right of the screen; 90 degrees is toward the top of the screen."
   )
   public double Heading() {
      return this.userHeading;
   }

   @DesignerProperty(
      defaultValue = "0",
      editorType = "float"
   )
   @SimpleProperty
   public void Heading(double var1) {
      this.userHeading = var1;
      this.heading = -var1;
      this.headingRadians = Math.toRadians(this.heading);
      this.headingCos = Math.cos(this.headingRadians);
      this.headingSin = Math.sin(this.headingRadians);
      this.registerChange();
   }

   public void Initialize() {
      this.initialized = true;
      this.canvas.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou(this);
   }

   @SimpleProperty(
      description = "The interval in milliseconds at which the %type%\'s position is updated.  For example, if the interval is 50 and the speed is 10, then every 50 milliseconds the sprite will move 10 pixels in the heading direction."
   )
   public int Interval() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.Interval();
   }

   @DesignerProperty(
      defaultValue = "100",
      editorType = "non_negative_integer"
   )
   @SimpleProperty
   public void Interval(int var1) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.Interval(var1);
   }

   @SimpleFunction(
      description = "Moves the %type% back in bounds if part of it extends out of bounds, having no effect otherwise. If the %type% is too wide to fit on the canvas, this aligns the left side of the %type% with the left side of the canvas. If the %type% is too tall to fit on the canvas, this aligns the top side of the %type% with the top side of the canvas."
   )
   public void MoveIntoBounds() {
      this.moveIntoBounds(this.canvas.Width(), this.canvas.Height());
   }

   public void MoveTo(double var1, double var3) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(var1);
      this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(var3);
      this.registerChange();
   }

   @SimpleEvent(
      description = "Event handler called when a pair of sprites (Balls and ImageSprites) are no longer colliding."
   )
   public void NoLongerCollidingWith(Sprite var1) {
      this.vSp02fkBXgM8EI0gm0rKWXHQ6wdQINJBQuAtCR15YU8g4XNqVKV8r32SYxkQYxkq.remove(var1);
      this.postEvent(this, "NoLongerCollidingWith", new Object[]{var1});
   }

   protected void OriginAtCenter(boolean var1) {
      this.originAtCenter = var1;
   }

   @SimpleFunction(
      description = "Sets the heading of the %type% toward the point with the coordinates (x, y)."
   )
   public void PointInDirection(double var1, double var3) {
      this.Heading(-Math.toDegrees(Math.atan2(var3 - this.yCenter, var1 - this.xCenter)));
   }

   @SimpleFunction(
      description = "Turns the %type% to point towards a designated target sprite (Ball or ImageSprite). The new heading will be parallel to the line joining the centerpoints of the two sprites."
   )
   public void PointTowards(Sprite var1) {
      this.Heading(-Math.toDegrees(Math.atan2(var1.yCenter - this.yCenter, var1.xCenter - this.xCenter)));
   }

   @SimpleProperty(
      description = "The speed at which the %type% moves. The %type% moves this many pixels every interval if enabled."
   )
   public float Speed() {
      return this.speed;
   }

   @DesignerProperty(
      defaultValue = "0.0",
      editorType = "float"
   )
   @SimpleProperty(
      description = "The number of pixels that the %type% should move every interval, if enabled."
   )
   public void Speed(float var1) {
      this.speed = var1;
   }

   @SimpleEvent(
      description = "Event handler called when the user begins touching an enabled %type% (placing their finger on a %type% and leaving it there). This provides the x and y coordinates of the touch, relative to the upper left of the canvas."
   )
   public void TouchDown(float var1, float var2) {
      Object[] var3 = new Object[]{Float.valueOf(var1), Float.valueOf(var2)};
      this.postEvent(this, "TouchDown", var3);
   }

   @SimpleEvent(
      description = "Event handler called when the user stops touching an enabled %type% (lifting their finger after a TouchDown event). This provides the x and y coordinates of the touch, relative to the upper left of the canvas."
   )
   public void TouchUp(float var1, float var2) {
      Object[] var3 = new Object[]{Float.valueOf(var1), Float.valueOf(var2)};
      this.postEvent(this, "TouchUp", var3);
   }

   @SimpleEvent(
      description = "Event handler called when the user touches an enabled %type% and then immediately lifts their finger. The provided x and y coordinates are relative to the upper left of the canvas."
   )
   public void Touched(float var1, float var2) {
      Object[] var3 = new Object[]{Float.valueOf(var1), Float.valueOf(var2)};
      this.postEvent(this, "Touched", var3);
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "boolean"
   )
   @SimpleProperty
   public void Visible(boolean var1) {
      this.visible = var1;
      this.registerChange();
   }

   @SimpleProperty(
      description = "Whether the %type% is visible."
   )
   public boolean Visible() {
      return this.visible;
   }

   public double X() {
      return this.originAtCenter?this.xCenter:this.xLeft;
   }

   @DesignerProperty(
      defaultValue = "0.0",
      editorType = "float"
   )
   @SimpleProperty(
      category = PropertyCategory.APPEARANCE
   )
   public void X(double var1) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(var1);
      this.registerChange();
   }

   public double Y() {
      return this.originAtCenter?this.yCenter:this.yTop;
   }

   @DesignerProperty(
      defaultValue = "0.0",
      editorType = "float"
   )
   @SimpleProperty
   public void Y(double var1) {
      this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(var1);
      this.registerChange();
   }

   @SimpleProperty(
      description = "How the %type% should be layered relative to other Balls and ImageSprites, with higher-numbered layers in front of lower-numbered layers."
   )
   public double Z() {
      return this.zLayer;
   }

   @DesignerProperty(
      defaultValue = "1.0",
      editorType = "float"
   )
   @SimpleProperty
   public void Z(double var1) {
      this.zLayer = var1;
      Canvas var3 = this.canvas;
      var3.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(this);
      var3.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this);
      var3.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.invalidate();
   }

   public void alarm() {
      if(this.initialized && this.speed != 0.0F) {
         this.updateCoordinates();
         this.registerChange();
      }

   }

   public boolean containsPoint(double var1, double var3) {
      return var1 >= this.xLeft && var1 < this.xLeft + (double)this.Width() && var3 >= this.yTop && var3 < this.yTop + (double)this.Height();
   }

   public BoundingBox getBoundingBox(int var1) {
      BoundingBox var2 = new BoundingBox(this.xLeft - (double)var1, this.yTop - (double)var1, this.xLeft + (double)this.Width() - 1.0D + (double)var1, this.yTop + (double)this.Height() - 1.0D + (double)var1);
      return var2;
   }

   public HandlesEventDispatching getDispatchDelegate() {
      return this.canvas.$form();
   }

   protected int hitEdge() {
      return !this.canvas.ready()?0:this.hitEdge(this.canvas.Width(), this.canvas.Height());
   }

   protected int hitEdge(int var1, int var2) {
      boolean var3 = this.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO();
      boolean var4 = this.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R();
      boolean var5 = this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(var1);
      boolean var6 = this.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou(var2);
      if(!var4 && !var6 && !var5 && !var3) {
         return 0;
      } else {
         this.MoveIntoBounds();
         return var3?(var4?-4:(var6?-2:-3)):(var5?(var4?2:(var6?4:3)):(var4?1:(var6?-1:0)));
      }
   }

   public boolean intersectsWith(BoundingBox var1) {
      BoundingBox var2 = this.getBoundingBox(0);
      if(!var2.intersectDestructively(var1)) {
         return false;
      } else {
         for(double var3 = var2.getLeft(); var3 < var2.getRight(); ++var3) {
            for(double var5 = var2.getTop(); var5 < var2.getBottom(); ++var5) {
               if(this.containsPoint(var3, var5)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected final void moveIntoBounds(int var1, int var2) {
      boolean var4;
      if(this.Width() > var1) {
         double var6;
         int var5 = (var6 = this.xLeft - 0.0D) == 0.0D?0:(var6 < 0.0D?-1:1);
         var4 = false;
         if(var5 != 0) {
            this.xLeft = 0.0D;
            this.xCenter = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.xLeft);
            var4 = true;
         }
      } else if(this.hR11jdqaRrvBRiBFd4KN6gI7d8MNQVP5Yc7fufDZjGGTeTxaualejjrhiR1Iz2xO()) {
         this.xLeft = 0.0D;
         this.xCenter = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.xLeft);
         var4 = true;
      } else {
         boolean var3 = this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(var1);
         var4 = false;
         if(var3) {
            this.xLeft = (double)(var1 - this.Width());
            this.xCenter = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.xLeft);
            var4 = true;
         }
      }

      if(this.Height() > var2) {
         if(this.yTop != 0.0D) {
            this.yTop = 0.0D;
            this.yCenter = this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(this.yTop);
            var4 = true;
         }
      } else if(this.vwEpIRqEf6xdtwTR9dehwBO7JUhyLV6iEzEK2WqfPN10eUMQDPn3AUmqAFfsnr6R()) {
         this.yTop = 0.0D;
         this.yCenter = this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(this.yTop);
         var4 = true;
      } else if(this.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou(var2)) {
         this.yTop = (double)(var2 - this.Height());
         this.yCenter = this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(this.yTop);
         var4 = true;
      }

      if(var4) {
         this.registerChange();
      }

   }

   public void onDelete() {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.Enabled(false);
      this.canvas.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(this);
   }

   public void onDestroy() {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.Enabled(false);
   }

   protected abstract void onDraw(android.graphics.Canvas var1);

   protected void postEvent(Sprite var1, String var2, Object... var3) {
      Handler var4 = this.androidUIHandler;
      1 var5 = new 1(this, var1, var2, var3);
      var4.post(var5);
   }

   protected void registerChange() {
      if(!this.initialized) {
         this.canvas.getView().invalidate();
      } else {
         int var1 = this.hitEdge();
         if(var1 != 0) {
            this.EdgeReached(var1);
         }

         this.canvas.wq07duYRO6iFAgWM70EZOSvbCMKs1QznMRJKrct0XuHOBYqCk3XqOKtSBGIpDou(this);
      }
   }

   protected void updateCoordinates() {
      this.xLeft += (double)this.speed * this.headingCos;
      this.xCenter = this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME(this.xLeft);
      this.yTop += (double)this.speed * this.headingSin;
      this.yCenter = this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T(this.yTop);
   }
}
