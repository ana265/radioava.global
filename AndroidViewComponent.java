package com.google.appinventor.components.runtime;

import android.view.View;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.PropertyCategory;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.SimplePropertyCopier;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.VisibleComponent;
import com.google.appinventor.components.runtime.Form.PercentStorageRecord.Dim;

@SimpleObject
public abstract class AndroidViewComponent extends VisibleComponent {
   private int column = -1;
   protected final ComponentContainer container;
   private int lastSetHeight = -3;
   private int lastSetWidth = -3;
   private int percentHeightHolder = -3;
   private int percentWidthHolder = -3;
   private int row = -1;

   protected AndroidViewComponent(ComponentContainer var1) {
      this.container = var1;
   }

   @SimpleProperty(
      userVisible = false
   )
   public int Column() {
      return this.column;
   }

   @SimpleProperty(
      userVisible = false
   )
   public void Column(int var1) {
      this.column = var1;
   }

   @SimplePropertyCopier
   public void CopyHeight(AndroidViewComponent var1) {
      this.Height(var1.lastSetHeight);
   }

   @SimplePropertyCopier
   public void CopyWidth(AndroidViewComponent var1) {
      this.Width(var1.lastSetWidth);
   }

   @SimpleProperty
   public int Height() {
      return (int)((float)this.getView().getHeight() / this.container.$form().deviceDensity());
   }

   @SimpleProperty
   public void Height(int var1) {
      this.container.setChildHeight(this, var1);
      this.lastSetHeight = var1;
      if(var1 <= -1000) {
         this.container.$form().registerPercentLength(this, var1, Dim.HEIGHT);
      }

   }

   @SimpleProperty
   public void HeightPercent(int var1) {
      if(var1 >= 0 && var1 <= 100) {
         this.Height(-1000 + -var1);
      } else {
         Form var2 = this.container.$form();
         Object[] var3 = new Object[]{Integer.valueOf(var1)};
         var2.dispatchErrorOccurredEvent(this, "HeightPercent", 2801, var3);
      }
   }

   @SimpleProperty(
      userVisible = false
   )
   public int Row() {
      return this.row;
   }

   @SimpleProperty(
      userVisible = false
   )
   public void Row(int var1) {
      this.row = var1;
   }

   @DesignerProperty(
      defaultValue = "True",
      editorType = "visibility"
   )
   @SimpleProperty(
      description = "Specifies whether the component should be visible on the screen. Value is true if the component is showing and false if hidden."
   )
   public void Visible(boolean var1) {
      View var2 = this.getView();
      byte var3;
      if(var1) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var2.setVisibility(var3);
   }

   @SimpleProperty(
      category = PropertyCategory.APPEARANCE
   )
   public boolean Visible() {
      return this.getView().getVisibility() == 0;
   }

   @SimpleProperty
   public int Width() {
      return (int)((float)this.getView().getWidth() / this.container.$form().deviceDensity());
   }

   @SimpleProperty
   public void Width(int var1) {
      this.container.setChildWidth(this, var1);
      this.lastSetWidth = var1;
      if(var1 <= -1000) {
         this.container.$form().registerPercentLength(this, var1, Dim.WIDTH);
      }

   }

   @SimpleProperty
   public void WidthPercent(int var1) {
      if(var1 >= 0 && var1 <= 100) {
         this.Width(-1000 + -var1);
      } else {
         Form var2 = this.container.$form();
         Object[] var3 = new Object[]{Integer.valueOf(var1)};
         var2.dispatchErrorOccurredEvent(this, "WidthPercent", 2801, var3);
      }
   }

   public HandlesEventDispatching getDispatchDelegate() {
      return this.container.$form();
   }

   public int getSetHeight() {
      return this.percentHeightHolder == -3?this.Height():this.percentHeightHolder;
   }

   public int getSetWidth() {
      return this.percentWidthHolder == -3?this.Width():this.percentWidthHolder;
   }

   public abstract View getView();

   public void setLastHeight(int var1) {
      this.percentHeightHolder = var1;
   }

   public void setLastWidth(int var1) {
      this.percentWidthHolder = var1;
   }
}
