package com.google.appinventor.components.annotations.androidmanifest;

import com.google.appinventor.components.annotations.androidmanifest.ActionElement;
import com.google.appinventor.components.annotations.androidmanifest.CategoryElement;
import com.google.appinventor.components.annotations.androidmanifest.DataElement;

public @interface IntentFilterElement {
   ActionElement[] actionElements();

   CategoryElement[] categoryElements() default {};

   DataElement[] dataElements() default {};

   String icon() default "";

   String label() default "";

   String priority() default "";
}
