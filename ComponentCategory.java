package com.google.appinventor.components.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum ComponentCategory {
   ADVERTISING,
   ANIMATION,
   CONNECTIVITY,
   DEPRECATED,
   DYNAMIC,
   EV3,
   EXPERIMENTAL,
   EXTENSION,
   GOOGLE,
   INTERNAL,
   LAYOUT,
   LAYOUT_GENERAL,
   LEGOMINDSTORMS,
   LISTVIEWS,
   MAPS,
   MEDIA,
   MONETIZATION,
   MONETIZATION_GENERAL,
   NAVIGATION,
   NXT,
   SENSORS,
   SOCIAL,
   STORAGE,
   UNINITIALIZED,
   USERINTERFACE,
   UTILITIES,
   VIEWS;

   private static final Map hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private Boolean B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T;
   private String B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T;
   private ComponentCategory hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private Boolean hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   private String hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

   static {
      ComponentCategory var0 = new ComponentCategory("USERINTERFACE", 0, "User Interface", "devices_other");
      USERINTERFACE = var0;
      ComponentCategory var1 = new ComponentCategory("LAYOUT", 1, "Layout", Boolean.TRUE, "table_chart");
      LAYOUT = var1;
      ComponentCategory var2 = new ComponentCategory("LAYOUT_GENERAL", 2, "General", Boolean.FALSE, LAYOUT, Boolean.FALSE, "dashboard");
      LAYOUT_GENERAL = var2;
      ComponentCategory var3 = new ComponentCategory("LISTVIEWS", 3, "Listviews", Boolean.FALSE, LAYOUT, Boolean.FALSE, "dns");
      LISTVIEWS = var3;
      ComponentCategory var4 = new ComponentCategory("NAVIGATION", 4, "Navigation", Boolean.FALSE, LAYOUT, Boolean.FALSE, "control_camera");
      NAVIGATION = var4;
      ComponentCategory var5 = new ComponentCategory("VIEWS", 5, "Views", Boolean.FALSE, LAYOUT, Boolean.FALSE, "view_array");
      VIEWS = var5;
      ComponentCategory var6 = new ComponentCategory("MEDIA", 6, "Media", "camera");
      MEDIA = var6;
      ComponentCategory var7 = new ComponentCategory("ANIMATION", 7, "Drawing and Animation", "color_lens");
      ANIMATION = var7;
      ComponentCategory var8 = new ComponentCategory("MAPS", 8, "Maps", "map");
      MAPS = var8;
      ComponentCategory var9 = new ComponentCategory("SENSORS", 9, "Sensors", "explore");
      SENSORS = var9;
      ComponentCategory var10 = new ComponentCategory("SOCIAL", 10, "Social", "supervised_user_circle");
      SOCIAL = var10;
      ComponentCategory var11 = new ComponentCategory("STORAGE", 11, "Storage", "file_copy");
      STORAGE = var11;
      ComponentCategory var12 = new ComponentCategory("UTILITIES", 12, "Utilities", "work_outline");
      UTILITIES = var12;
      ComponentCategory var13 = new ComponentCategory("DYNAMIC", 13, "Dynamic", "code");
      DYNAMIC = var13;
      ComponentCategory var14 = new ComponentCategory("CONNECTIVITY", 14, "Connectivity", "rss_feed");
      CONNECTIVITY = var14;
      ComponentCategory var15 = new ComponentCategory("GOOGLE", 15, "Google", "mdi-google");
      GOOGLE = var15;
      ComponentCategory var16 = new ComponentCategory("MONETIZATION", 16, "Monetization", Boolean.TRUE, "monetization_on");
      MONETIZATION = var16;
      ComponentCategory var17 = new ComponentCategory("MONETIZATION_GENERAL", 17, "General", Boolean.FALSE, MONETIZATION, Boolean.FALSE, "shopping_cart");
      MONETIZATION_GENERAL = var17;
      ComponentCategory var18 = new ComponentCategory("ADVERTISING", 18, "Advertising", Boolean.FALSE, MONETIZATION, Boolean.FALSE, "branding_watermark");
      ADVERTISING = var18;
      ComponentCategory var19 = new ComponentCategory("LEGOMINDSTORMS", 19, "LEGO® MINDSTORMS®", Boolean.TRUE, "widgets");
      LEGOMINDSTORMS = var19;
      ComponentCategory var20 = new ComponentCategory("EV3", 20, "LEGO® EV3", Boolean.FALSE, LEGOMINDSTORMS, Boolean.FALSE, "gamepad");
      EV3 = var20;
      ComponentCategory var21 = new ComponentCategory("NXT", 21, "LEGO® NXT", Boolean.FALSE, LEGOMINDSTORMS, Boolean.FALSE, "gamepad");
      NXT = var21;
      ComponentCategory var22 = new ComponentCategory("EXPERIMENTAL", 22, "Experimental", "new_releases");
      EXPERIMENTAL = var22;
      ComponentCategory var23 = new ComponentCategory("DEPRECATED", 23, "Deprecated", "format_line_spacing");
      DEPRECATED = var23;
      ComponentCategory var24 = new ComponentCategory("EXTENSION", 24, "Extension", "extension");
      EXTENSION = var24;
      ComponentCategory var25 = new ComponentCategory("INTERNAL", 25, "For internal use only");
      INTERNAL = var25;
      ComponentCategory var26 = new ComponentCategory("UNINITIALIZED", 26, "Uninitialized");
      UNINITIALIZED = var26;
      ComponentCategory[] var27 = new ComponentCategory[]{USERINTERFACE, LAYOUT, LAYOUT_GENERAL, LISTVIEWS, NAVIGATION, VIEWS, MEDIA, ANIMATION, MAPS, SENSORS, SOCIAL, STORAGE, UTILITIES, DYNAMIC, CONNECTIVITY, GOOGLE, MONETIZATION, MONETIZATION_GENERAL, ADVERTISING, LEGOMINDSTORMS, EV3, NXT, EXPERIMENTAL, DEPRECATED, EXTENSION, INTERNAL, UNINITIALIZED};
      HashMap var28 = new HashMap();
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var28;
      var28.put("User Interface", "user-interface");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Layout", "layout");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("LayoutGeneral", "layout/general");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Listviews", "layout/listviews");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Views", "layout/views");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Navigation", "layout/navigation");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Media", "media");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Drawing and Animation", "drawing-and-animation");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Maps", "maps");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Sensors", "sensors");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Social", "social");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Storage", "storage");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Device", "device");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Dynamic", "dynamic");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Connectivity", "connectivity");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Google", "google");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("LEGO® MINDSTORMS®", "lego-mindstorms");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("LEGO® EV3", "lego-mindstorms/ev3");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("LEGO® NXT", "lego-mindstorms/nxt");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Monetization", "monetization");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("MonetizationGeneral", "monetization/general");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Advertising", "monetization/advertising");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Utilities", "utilities");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Experimental", "experimental");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Deprecated", "deprecated");
      hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.put("Extension", "extension");
   }

   private ComponentCategory(String var3) {
      this(var3, Boolean.TRUE, (ComponentCategory)null, Boolean.FALSE, "offline_bolt");
   }

   private ComponentCategory(String var3, Boolean var4, ComponentCategory var5, Boolean var6, String var7) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var3;
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var4;
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var5;
      this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T = var6;
      this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T = var7;
   }

   private ComponentCategory(String var3, Boolean var4, String var5) {
      this(var3, Boolean.TRUE, (ComponentCategory)null, var4, var5);
   }

   private ComponentCategory(String var3, String var4) {
      this(var3, Boolean.TRUE, (ComponentCategory)null, Boolean.FALSE, var4);
   }

   public final List getChildren() {
      ArrayList var1 = new ArrayList();
      if(!this.hasChildCategories().booleanValue()) {
         return var1;
      } else {
         ComponentCategory[] var2 = values();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            ComponentCategory var5 = var2[var4];
            if(var5.getParentCategory() == this) {
               var1.add(var5);
            }
         }

         return var1;
      }
   }

   public final String getDocName() {
      return "LAYOUT_GENERAL".equals(this.name())?(String)hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.get("LayoutGeneral"):("MONETIZATION_GENERAL".equals(this.name())?(String)hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.get("MonetizationGeneral"):(String)hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.get(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME));
   }

   public final String getIcon() {
      return this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T;
   }

   public final String getName() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   }

   public final ComponentCategory getParentCategory() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   }

   public final Boolean hasChildCategories() {
      return this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T;
   }

   public final Boolean isParentCategory() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   }
}
