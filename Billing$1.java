package com.google.appinventor.components.runtime;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.google.appinventor.components.runtime.Billing;
import com.google.appinventor.components.runtime.Billing$1$1;
import java.util.Iterator;
import java.util.List;

final class Billing$1 implements PurchaseHistoryResponseListener {
   // $FF: synthetic field
   final List B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T;
   // $FF: synthetic field
   final Billing hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;
   // $FF: synthetic field
   final List hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME;

   Billing$1(Billing var1, List var2, List var3) {
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var1;
      this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME = var2;
      this.B8WBXPBCF2jGfUDZZU2zV5EYdqbUBu0lAZ0THCEqYyuE8VACR9dY7rDnwBIqh64T = var3;
   }

   public final void onPurchaseHistoryResponse(BillingResult var1, List var2) {
      if(Billing.access$000(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME, var1) && var2 != null) {
         Iterator var5 = var2.iterator();

         while(var5.hasNext()) {
            PurchaseHistoryRecord var6 = (PurchaseHistoryRecord)var5.next();
            this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME.add(var6.getSku());
         }
      }

      BillingClient var3 = Billing.access$100(this.hxYOFxFjLpN1maJuWNxUV40nExCGxsxkDPOTgtzMu4zlZCQb3bPlKsXo1SYJg6ME);
      Billing$1$1 var4 = new Billing$1$1(this);
      var3.queryPurchaseHistoryAsync("subs", var4);
   }
}
