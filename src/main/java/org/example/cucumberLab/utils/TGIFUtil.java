package org.example.cucumberLab.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TGIFUtil {

  public static String isFriday(LocalDate today) {

    if (today.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
      return "TGIF";
    } else {
      return "Nope";
    }
  }
}
