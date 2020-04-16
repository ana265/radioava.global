package com.google.appinventor.components.annotations.androidmanifest;

import com.google.appinventor.components.annotations.androidmanifest.IntentFilterElement;
import com.google.appinventor.components.annotations.androidmanifest.MetaDataElement;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface ReceiverElement {
   String enabled() default "";

   String exported() default "";

   String icon() default "";

   IntentFilterElement[] intentFilters() default {};

   String label() default "";

   MetaDataElement[] metaDataElements() default {};

   String name();

   String permission() default "";

   String process() default "";
}
