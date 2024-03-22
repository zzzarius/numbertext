/* See numbertext.org
 * 2009-2010 (c) László Németh
 * License: LGPL/BSD dual license */

package org.numbertext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;

public class Numbertext {
  static HashMap<String, Soros> modules = new HashMap<String, Soros>();

  private static Soros load(String lang) {
    try {
      URL url = Numbertext.class.getClassLoader().getResource("data/" + lang + ".sor");
      BufferedReader f = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
      StringBuffer st = new StringBuffer();
      String line = null;
      while ((line = f.readLine()) != null) {
        st.append(line);
        st.append(System.getProperty("line.separator"));
      }
      Soros s = new Soros(new String(st));
      if (modules != null && lang != null)
        modules.put(lang, s);
      return s;
    } catch (Exception e) {
      System.out.println("Problem: " + e);
    }
    return null;
  }

  public static String numbertext(String input, String lang) {
    Soros s = (Soros) modules.get(lang);
    if (s == null)
      s = load(lang);
    if (s == null)
      return null;
    return s.run(input);
  }

  public static String moneytext(String input, String money, String lang) {
    return numbertext(money + " " + input, lang);
  }

}
