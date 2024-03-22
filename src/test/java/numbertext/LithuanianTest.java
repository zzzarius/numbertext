package numbertext;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.numbertext.Numbertext;

public class LithuanianTest {

  @Test
  public void testMoneytext() {
    assertEquals("nulis eurų", money("0"));
    assertEquals("vienas euras", money("1"));
    assertEquals("du eurai", money("2"));
    assertEquals("trys eurai", money("3"));
    assertEquals("keturi eurai", money("4"));
    assertEquals("penki eurai", money("5"));
    assertEquals("šeši eurai", money("6"));
    assertEquals("septyni eurai", money("7"));
    assertEquals("aštuoni eurai", money("8"));
    assertEquals("devyni eurai", money("9"));
    assertEquals("vienuolika eurų", money("11"));
    assertEquals("dvylika eurų", money("12"));
    assertEquals("trylika eurų", money("13"));
    assertEquals("keturiolika eurų", money("14"));
    assertEquals("penkiolika eurų", money("15"));
    assertEquals("šešiolika eurų", money("16"));
    assertEquals("septyniolika eurų", money("17"));
    assertEquals("aštuoniolika eurų", money("18"));
    assertEquals("devyniolika eurų", money("19"));
    assertEquals("dešimt eurų", money("10"));
    assertEquals("dvidešimt eurų", money("20"));
    assertEquals("trisdešimt eurų", money("30"));
    assertEquals("keturiasdešimt eurų", money("40"));
    assertEquals("penkiasdešimt eurų", money("50"));
    assertEquals("šešiasdešimt eurų", money("60"));
    assertEquals("septyniasdešimt eurų", money("70"));
    assertEquals("aštuoniasdešimt eurų", money("80"));
    assertEquals("devyniasdešimt eurų", money("90"));
    assertEquals("dvidešimt vienas euras", money("21"));
    assertEquals("trisdešimt septyni eurai", money("37"));
    assertEquals("keturiasdešimt trys eurai", money("43"));
    assertEquals("penkiasdešimt aštuoni eurai", money("58"));
    assertEquals("šešiasdešimt devyni eurai", money("69"));
    assertEquals("septyniasdešimt šeši eurai", money("76"));
    assertEquals("aštuoniasdešimt du eurai", money("82"));
    assertEquals("devyniasdešimt penki eurai", money("95"));
    assertEquals("šimtas eurų", money("100"));
    assertEquals("du šimtai eurų", money("200"));
    assertEquals("trys šimtai eurų", money("300"));
    assertEquals("keturi šimtai eurų", money("400"));
    assertEquals("penki šimtai eurų", money("500"));
    assertEquals("šeši šimtai eurų", money("600"));
    assertEquals("septyni šimtai eurų", money("700"));
    assertEquals("aštuoni šimtai eurų", money("800"));
    assertEquals("devyni šimtai eurų", money("900"));
    assertEquals("šimtas vienuolika eurų", money("111"));
    assertEquals("du šimtai septyniasdešimt du eurai", money("272"));
    assertEquals("trys šimtai aštuoniasdešimt septyni eurai", money("387"));
    assertEquals("keturi šimtai keturiasdešimt aštuoni eurai", money("448"));
    assertEquals("penki šimtai šešiasdešimt devyni eurai", money("569"));
    assertEquals("šeši šimtai dvidešimt penki eurai", money("625"));
    assertEquals("septyni šimtai septyniasdešimt septyni eurai", money("777"));
    assertEquals("septyni šimtai aštuoniasdešimt du eurai", money("782"));
    assertEquals("aštuoni šimtai devyniasdešimt penki eurai", money("895"));
    assertEquals("devyni šimtai devyniasdešimt devyni eurai", money("999"));
    assertEquals("tūkstantis eurų", money("1000"));
    assertEquals("du tūkstančiai eurų", money("2000"));
    assertEquals("trys tūkstančiai eurų", money("3000"));
    assertEquals("keturi tūkstančiai eurų", money("4000"));
    assertEquals("penki tūkstančiai eurų", money("5000"));
    assertEquals("septyni tūkstančiai šeši šimtai trisdešimt keturi eurai", money("7634"));
    assertEquals("vienuolika tūkstančių eurų", money("11000"));
    assertEquals("penkiolika tūkstančių eurų", money("15000"));
    assertEquals("dvidešimt vienas tūkstantis eurų", money("21000"));
    assertEquals("dvidešimt du tūkstančiai eurų", money("22000"));
    assertEquals("dvidešimt keturi tūkstančiai šimtas devyniasdešimt eurų", money("24190"));
    assertEquals("šeši šimtai penkiasdešimt trys tūkstančiai eurų", money("653000"));
    assertEquals("du šimtai vienuolika tūkstančių eurų", money("211000"));
    assertEquals("šimtas dvidešimt trys tūkstančiai keturi šimtai penkiasdešimt keturi eurai", money("123454"));
    assertEquals("septyni šimtai tūkstančių eurų", money("700000"));
    assertEquals("septyni šimtai penkiasdešimt vienas tūkstantis du šimtai dvidešimt vienas euras", money("751221"));
    assertEquals("devyni šimtai devyniasdešimt devyni tūkstančiai devyni šimtai devyniasdešimt devyni eurai", money("999999"));
    assertEquals("vienas milijonas eurų", money("1000000"));
    assertEquals("du milijonai eurų", money("2000000"));
    assertEquals("penki milijonai eurų", money("5000000"));
    assertEquals("septyni milijonai du šimtai vienuolika tūkstančių eurų", money("7211000"));
    assertEquals("dvidešimt trys milijonai keturi šimtai trisdešimt septyni tūkstančiai du šimtai devyniolika eurų", money("23437219"));
    assertEquals("šimtas milijonų eurų", money("100000000"));
    assertEquals("šimtas dvidešimt trys milijonai keturi šimtai penkiasdešimt šeši tūkstančiai septyni šimtai aštuoniasdešimt devyni eurai", money("123456789"));
    assertEquals("trys šimtai dvidešimt du milijonai aštuoniasdešimt devyni tūkstančiai aštuoni šimtai devyniasdešimt eurų", money("322089890"));
    assertEquals("vienas milijardas eurų", money("1000000000"));
    assertEquals("du milijardai šimtas keturiasdešimt septyni milijonai keturi šimtai aštuoniasdešimt trys tūkstančiai šeši šimtai keturiasdešimt septyni eurai", money("2147483647"));
    assertEquals("vienas euras penkiasdešimt centų", money("1.5"));
    assertEquals("vienas euras penkiasdešimt vienas centas", money("1.51"));
    assertEquals("nulis eurų devyniasdešimt devyni centai", money("0.99"));
    assertEquals("nulis eurų devyniasdešimt devyni centai", money("00.99"));
    assertEquals("", money("0.991"));
  }

  @Test
  public void testNumbertext() {
    assertEquals("nulis", number("0"));
    assertEquals("nulis", number("00"));
    assertEquals("vienas", number("1"));
    assertEquals("du", number("2"));
    assertEquals("trys", number("3"));
    assertEquals("keturi", number("4"));
    assertEquals("penki", number("5"));
    assertEquals("šeši", number("6"));
    assertEquals("septyni", number("7"));
    assertEquals("aštuoni", number("8"));
    assertEquals("devyni", number("9"));
    assertEquals("vienuolika", number("11"));
    assertEquals("dvylika", number("12"));
    assertEquals("trylika", number("13"));
    assertEquals("keturiolika", number("14"));
    assertEquals("penkiolika", number("15"));
    assertEquals("šešiolika", number("16"));
    assertEquals("septyniolika", number("17"));
    assertEquals("aštuoniolika", number("18"));
    assertEquals("devyniolika", number("19"));
    assertEquals("dešimt", number("10"));
    assertEquals("dvidešimt", number("20"));
    assertEquals("trisdešimt", number("30"));
    assertEquals("keturiasdešimt", number("40"));
    assertEquals("penkiasdešimt", number("50"));
    assertEquals("šešiasdešimt", number("60"));
    assertEquals("septyniasdešimt", number("70"));
    assertEquals("aštuoniasdešimt", number("80"));
    assertEquals("devyniasdešimt", number("90"));
    assertEquals("dvidešimt vienas", number("21"));
    assertEquals("trisdešimt septyni", number("37"));
    assertEquals("keturiasdešimt trys", number("43"));
    assertEquals("penkiasdešimt aštuoni", number("58"));
    assertEquals("šešiasdešimt devyni", number("69"));
    assertEquals("septyniasdešimt šeši", number("76"));
    assertEquals("aštuoniasdešimt du", number("82"));
    assertEquals("devyniasdešimt penki", number("95"));
    assertEquals("šimtas", number("100"));
    assertEquals("du šimtai", number("200"));
    assertEquals("trys šimtai", number("300"));
    assertEquals("keturi šimtai", number("400"));
    assertEquals("penki šimtai", number("500"));
    assertEquals("šeši šimtai", number("600"));
    assertEquals("septyni šimtai", number("700"));
    assertEquals("aštuoni šimtai", number("800"));
    assertEquals("devyni šimtai", number("900"));
    assertEquals("šimtas vienuolika", number("111"));
    assertEquals("du šimtai septyniasdešimt du", number("272"));
    assertEquals("trys šimtai aštuoniasdešimt septyni", number("387"));
    assertEquals("keturi šimtai keturiasdešimt aštuoni", number("448"));
    assertEquals("penki šimtai šešiasdešimt devyni", number("569"));
    assertEquals("šeši šimtai dvidešimt penki", number("625"));
    assertEquals("septyni šimtai septyniasdešimt septyni", number("777"));
    assertEquals("septyni šimtai aštuoniasdešimt du", number("782"));
    assertEquals("aštuoni šimtai devyniasdešimt penki", number("895"));
    assertEquals("devyni šimtai devyniasdešimt devyni", number("999"));
    assertEquals("tūkstantis", number("1000"));
    assertEquals("du tūkstančiai", number("2000"));
    assertEquals("trys tūkstančiai", number("3000"));
    assertEquals("keturi tūkstančiai", number("4000"));
    assertEquals("penki tūkstančiai", number("5000"));
    assertEquals("septyni tūkstančiai šeši šimtai trisdešimt keturi", number("7634"));
    assertEquals("vienuolika tūkstančių", number("11000"));
    assertEquals("penkiolika tūkstančių", number("15000"));
    assertEquals("dvidešimt vienas tūkstantis", number("21000"));
    assertEquals("dvidešimt du tūkstančiai", number("22000"));
    assertEquals("dvidešimt keturi tūkstančiai šimtas devyniasdešimt", number("24190"));
    assertEquals("šeši šimtai penkiasdešimt trys tūkstančiai", number("653000"));
    assertEquals("du šimtai vienuolika tūkstančių", number("211000"));
    assertEquals("šimtas dvidešimt trys tūkstančiai keturi šimtai penkiasdešimt keturi", number("123454"));
    assertEquals("septyni šimtai tūkstančių", number("700000"));
    assertEquals("septyni šimtai penkiasdešimt vienas tūkstantis du šimtai dvidešimt vienas", number("751221"));
    assertEquals("devyni šimtai devyniasdešimt devyni tūkstančiai devyni šimtai devyniasdešimt devyni", number("999999"));
    assertEquals("vienas milijonas", number("1000000"));
    assertEquals("du milijonai", number("2000000"));
    assertEquals("penki milijonai", number("5000000"));
    assertEquals("septyni milijonai du šimtai vienuolika tūkstančių", number("7211000"));
    assertEquals("dvidešimt trys milijonai keturi šimtai trisdešimt septyni tūkstančiai du šimtai devyniolika", number("23437219"));
    assertEquals("šimtas milijonų", number("100000000"));
    assertEquals("šimtas dvidešimt trys milijonai keturi šimtai penkiasdešimt šeši tūkstančiai septyni šimtai aštuoniasdešimt devyni", number("123456789"));
    assertEquals("trys šimtai dvidešimt du milijonai aštuoniasdešimt devyni tūkstančiai aštuoni šimtai devyniasdešimt", number("322089890"));
    assertEquals("vienas milijardas", number("1000000000"));
    assertEquals("du milijardai šimtas keturiasdešimt septyni milijonai keturi šimtai aštuoniasdešimt trys tūkstančiai šeši šimtai keturiasdešimt septyni", number("2147483647"));
    assertEquals("vienas taškas penki", number("1.5"));
    assertEquals("vienas taškas penki vienas du", number("1.512"));
  }

  public static String number(String number) {
    return Numbertext.numbertext(number, "lt_LT");
  }

  public static String money(String money) {
    return Numbertext.moneytext(money, "EUR", "lt_LT");
  }

}
