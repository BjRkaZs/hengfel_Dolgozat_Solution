/*
* File: Solution.java
* Author: Bajusz Réka Zsófi
* Copyright: 2024, Bajusz Réka Zsófi
* Group: Szoft I-2-N
* Date: 2024-12-19
* Github: https://github.com/BjRkaZs/hengfel_Dolgozat_Solution
* Licenc: MIT
*/

import java.util.Scanner;

public class Solution {
   public void startCalc(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Sugár: ");
    String radiusStr = sc.nextLine();
    Double radius = Double.parseDouble(radiusStr);

    System.out.print("Hossz: ");
    String heightStr = sc.nextLine();
    Double height = Double.parseDouble(heightStr);

    Double area = 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
      
    System.out.printf("Felszín: "+ area);
    sc.close();
   } 
}
