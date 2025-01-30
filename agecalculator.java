// Source code is decompiled from a .class file using FernFlower decompiler.
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class agecalculator {
   public agecalculator() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter your birth date (YYYY-MM-DD): ");
      String var2 = var1.nextLine();
      String[] var3 = var2.split("-");
      int var4 = Integer.parseInt(var3[0]);
      int var5 = Integer.parseInt(var3[1]);
      int var6 = Integer.parseInt(var3[2]);
      LocalDate var7 = LocalDate.of(var4, var5, var6);
      LocalDate var8 = LocalDate.now();
      Period var9 = Period.between(var7, var8);
      int var10 = var9.getYears();
      int var11 = var9.getMonths();
      int var12 = var9.getDays();
      System.out.println("Your age is: " + var10 + " years, " + var11 + " months, and " + var12 + " days.");
      var1.close();
   }
}
