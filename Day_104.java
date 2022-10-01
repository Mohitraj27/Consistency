// Program to find all interleavings of given strings.
import java.util.HashSet;
import java.util.Set;
import java.util.*;
class Day_104 {
 public static void allInterleavings(String res, String P, String Q, Set < String > out) {
  if (P.length() == 0 && Q.length() == 0) {
   out.add(res);
   return;
  }
  if (P.length() > 0) {
   allInterleavings(res + P.charAt(0), P.substring(1), Q, out);
  }
  if (Q.length() > 0) {
   allInterleavings(res + Q.charAt(0), P, Q.substring(1), out);
  }
 }

 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
  String P = sc.next();
  String Q = sc.next()
  ;
  System.out.println("The given strings are: " + P + "  " + Q);
  System.out.println("The interleavings strings are: ");
  Set < String > out = new HashSet < > ();
  allInterleavings("", P, Q, out);

  out.stream().forEach(System.out::println);
 }
}
/*
 
The given strings are: Mohit  Raj
The interleavings strings are: 
MohRiatj
MRohiatj
RMohiajt
MRoahitj
MRaohitj
RMaohijt
RaMohitj
RMoahijt
MRaohjit
MRoahjit
MRohaitj
MRohajit
RMajohit
MoRhiajt
MRohitaj
MoRahijt
RMaojhit
MohRaijt
MRoahijt
RMoahjit
MRaojhit
MohRiajt
RaMojhit
MohiRtaj
MohiRatj
MoRahjit
MoRhiatj
RMohaitj
MohitRaj
MoRhitaj
MoRahitj
MRoajhit
MoRhajit
MRaohijt
RMaohitj
RaMohijt
MoRhaitj
RMoahitj
RMohiatj
RMohajit
RajMohit
MRajohit
RaMjohit
RMohitaj
RMoajhit
RMaohjit
MohiRajt
MoRhaijt
MRohiajt
RaMohjit
MohRajit
RMohaijt
MRohaijt
MohRitaj
MohRaitj
MoRajhit

 */