package com.google.appinventor.components.runtime;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.google.appinventor.components.runtime.Billing;
import java.util.List;

final class Billing$2 implements SkuDetailsResponseListener {
   // $FF: synthetic field
   private Billing hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

   Billing$2(Billing var1) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var1;
      super();
   }

   public final void onSkuDetailsResponse(BillingResult var1, List var2) {
      if(var2 != null && var2.size() > 0) {
         SkuDetails var3 = (SkuDetails)var2.get(0);
         Billing.access$200(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME).put(var3.getSku(), var3);
         Billing.access$300(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var3);
      }

   }
}
