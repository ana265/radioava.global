package com.google.appinventor.components.runtime;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.google.appinventor.components.runtime.Billing;
import java.util.Iterator;
import java.util.List;

final class Billing$8 implements SkuDetailsResponseListener {
   // $FF: synthetic field
   private Billing hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

   Billing$8(Billing var1) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var1;
      super();
   }

   public final void onSkuDetailsResponse(BillingResult var1, List var2) {
      if(Billing.access$000(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var1) && var2 != null) {
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            SkuDetails var4 = (SkuDetails)var3.next();
            Billing.access$200(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME).put(var4.getSku(), var4);
         }
      }

   }
}
