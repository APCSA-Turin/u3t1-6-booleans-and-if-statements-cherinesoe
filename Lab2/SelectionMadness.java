public class SelectionMadness {

    // no instance variables //
    
    public SelectionMadness() { }
  
    /* Returns 1 of 5 randomly generated fortunes as a string;
       you should write your own 5 fortunes! (see output for examples)
     */
    public String fortune() {
        /* implement this method */
        int result = (int) (Math.random() * 5);
        if (result == 0) {
            return "today will be a good day";
        } else if (result == 1) {
            return "something odd will happen today";
        } else if (result == 2) {
            return "do what you have been thinking about";
        } else if (result == 3) {
            return "your dream will come true";
        } else {
            return "it will rain today";
        }
    }
  
    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
        /* implement this method */
        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        } else if (num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

    /* Returns true if the three provided lengths create a right triangle, in
     other words, a2 + b2 = c2, where c is the longest side; returns false
     Otherwise (hint: use the largest() method that you wrote).
     Note the "largest" side could be any of the 3 numbers, i.e. your method
     should work if side1 = 3, side2 = 4, and side3 = 5 and also if
     side1 = 5, side2 = 4, and side3 = 3
    */
    public boolean rightTriangle(int side1, int side2, int side3) {
        /* implement this method */
        int hypSide = largest(side1, side2, side3);
        int hypLength = hypSide * hypSide;
        if (hypSide == side1) {
            side2 *= side2;
            side3 *= side3;
            if ((side2 + side3) == hypLength) {
                return true;
            } else {
                return false;
            }
        }
        if (hypSide == side2) {
            side1 *= side1;
            side3 *= side3;
            if ((side1 + side3) == hypLength) {
                return true;
            } else {
                return false;
            }
        }
        if (hypSide == side3) {
            side1 *= side1;
            side2 *= side2;
            if ((side1 + side2) == hypLength) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}  