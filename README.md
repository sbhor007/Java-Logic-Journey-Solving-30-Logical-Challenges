# Java-Logic-Journey-Solving-30-Logical-Challenges

## Q. Solution-1 - Swap Two numbers using third variable

## Q. Swapping2 - Swap two numberse without third variable
  - Use Addition / Substraction method
     ```
     no1 = 10, no2 = 20
     
     no1 = no1 + no2;  no1 = 10 + 20;     no1 = 30
		 no2 = no1 - no2;  no2 = 30 - 20;     no2 = 10
		 no1 = no1 - no2;  no1 = 30 - 10;     no1 = 20
     ```
  - Using XOR operator
      ```
      no1 = 10, no2 = 20
      no1 = no1 ^ no2; 10 ^ 20
            01010
          ^ 10100
      ----------------
            11110       
      no1 = 30
      
		  no2 = no1 ^ no2; 30 ^ 20
            11110
          ^ 10100
      ----------------
            01010
      no2 = 10

		  no1 = no1 ^ no2;  30 ^ 10
            11110
          ^ 01010
      ----------------
            10100
      no1 = 20

      RESULT : no1 = 20, no2 = 10
      ```

