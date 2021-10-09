/*
Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, 
omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
*/

public String minCat(String a, String b) {
  int a_len = a.length();
  int b_len = b.length();

  if (a_len > b_len) {
    return a.substring(a_len - b_len) + b;
  } else {
    return a + b.substring(b_len - a_len);
  }
}
