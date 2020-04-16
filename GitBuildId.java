package com.google.appinventor.common.version;

public final class GitBuildId {
   public static final String ANT_BUILD_DATE = "April 5 2020";
   public static final String GIT_BUILD_FINGERPRINT = "e447b80132684ed3aeaaa3722a0e4a7942d95fad";
   public static final String GIT_BUILD_VERSION = "1.4C.1-Eagle";

   public static String getDate() {
      return "April 5 2020";
   }

   public static String getFingerprint() {
      return "e447b80132684ed3aeaaa3722a0e4a7942d95fad";
   }

   public static String getVersion() {
      return "1.4C.1-Eagle" != "" && !"1.4C.1-Eagle".contains(" ")?"1.4C.1-Eagle":"none";
   }
}
