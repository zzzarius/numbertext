# Number Text
## Description from https://www.numbertext.org/
The NUMBERTEXT/MONEYTEXT functions originally developed for the generalization of the BAHTTEXT spreadsheet function, a function of Microsoft Excel for number to Thai number name and currency conversion, standardized by the ECMA–376 and ISO/IEC 29 500:2008 Office Open XML format. This development can help the upcoming OpenFormula to be top-compliant with the ECMA/ISO BAHTTEXT without degrading its high requirements for an international standard.

## Getting Started
```
Numbertext.numbertext("1016.22", "en_US"); // one thousand and sixteen point two two
Numbertext.moneytext("1016.22", "USD", "en_US"); // one thousand and sixteen U.S. dollars and twenty-two cents

Numbertext.numbertext("1016.22", "th_TH"); // หนึ่งพันสิบหกจุดสองสอง
Numbertext.moneytext("1016.22", "THB", "th_TH"); // หนึ่งพันสิบหกบาทยี่สิบสองสตางค์
Numbertext.moneytext("1016.22", "THB", "en_US"); // one thousand and sixteen baht and twenty-two satang
```

## Acknowledgments
This project convert numbertext jar file from http://www.numbertext.org/ to maven project.
