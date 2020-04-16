package com.google.appinventor.components.annotations;

public enum PropertyCategory {
   APPEARANCE,
   BEHAVIOR,
   DEPRECATED,
   UNSET;

   private String hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

   static {
      PropertyCategory var0 = new PropertyCategory("BEHAVIOR", 0, "Behavior");
      BEHAVIOR = var0;
      PropertyCategory var1 = new PropertyCategory("APPEARANCE", 1, "Appearance");
      APPEARANCE = var1;
      PropertyCategory var2 = new PropertyCategory("DEPRECATED", 2, "Deprecated");
      DEPRECATED = var2;
      PropertyCategory var3 = new PropertyCategory("UNSET", 3, "Unspecified");
      UNSET = var3;
      PropertyCategory[] var4 = new PropertyCategory[]{BEHAVIOR, APPEARANCE, DEPRECATED, UNSET};
   }

   private PropertyCategory(String var3) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var3;
   }

   public final String getName() {
      return this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   }
}
