package com.google.appinventor.components.annotations;

import com.google.appinventor.components.annotations.androidmanifest.ActivityElement;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface UsesActivities {
   ActivityElement[] activities();
}
