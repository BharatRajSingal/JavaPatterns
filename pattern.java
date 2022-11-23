import java.util.*;
public class Pattern{


        public static void hollow_rectangle(int rows, int columns){
            //outer loop
    for(int i = 1 ; i<= rows ; i++){
            //inner loop - column
        for(int j=1; j<= columns;j++){
            // cell = (i,j)
    if(i == 1 || i == rows || j == 1 || j == columns){
        System.out.print("*");
    }else{
        System.out.print(" ");
    }
    }
    System.out.println();    
    }
    }
    
    public static void inverted_rotated_halfpyramid(int rows , int columns){
        for(int i = 1; i<=rows ; i++){
            for (int j =1; j<= rows-i; j++){
            System.out.print(" ");
        }
        for(int j = 1; j<= i ; j++){
            System.out.print("*");
    }
    System.out.println();
    }
    }

    public static void inverted_halfpyramid_numbers(int rows , int columns){
        for(int i = 1; i <= rows ; i++){
            for(int j =1 ; j<=rows - i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int rows,int columns){
        int counter = 1;
        for(int i = 1; i <= rows; i++ ){
            for(int j = 1; j <= i ; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int rows, int columns){
        for(int i = 1; i<= rows; i++){
            for(int j= 1; j<=i ; j++){
                if((i + j)% 2 == 0 ){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly_pattern(int rows,int columns){
        // upper half
        for(int i =1 ; i <= rows; i++){
            //stars - i
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //spaces - 2(n-i)
            for(int j=1; j<= 2 * (rows-i); j++){
            System.out.print(" ");
            }
            //stars - i
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i = rows; i>=1;i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j=1; j<= 2 * (rows-i); j++){
            System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int rows , int columns){
        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1; j<= (rows - i); j++){
                System.out.print(" ");
            }
            for(int j = 1;j<= rows;j++){
                System.out.print("*");
            }
            for(int j = 1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int rows , int columns){
        for(int i = 1 ; i<=rows; i ++){
            for(int j = 1; j<= (rows - i); j++){
                System.out.print(" ");
               } 
               for(int j=1; j<= rows;j++){
                // cell = (i,j)
            if(i == 1 || i == rows || j == 1 || j == rows){
            System.out.print("*");
            }else{
            System.out.print(" ");
        }
        }
            System.out.println(); 
        }
         
    }

    public static void diamond(int rows , int columns){
        //upper half
        for(int i =1 ; i<= rows ; i++){
            for(int j = 1; j<= (rows - i); j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (2* i - 1 ); j ++){
                System.out.print("*");
            }
           System.out.println();
        }
        //lower half
        for(int i =rows ; i>= 1 ; i--){
            for(int j = 1; j<= (rows - i); j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (2* i - 1 ); j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

        System.out.println("Choose your pattern : ");
        System.out.println(" 1 : Hollow Rectangle");
        System.out.println(" 2 : Inverted and Rotated Half Pyramid");
        System.out.println(" 3 : Inverted Half Pyramid with Numbers");
        System.out.println(" 4 : Floyd Triangle");
        System.out.println(" 5 : Zero One Binary Triangle");
        System.out.println(" 6 : Hollow Rhombus");
        System.out.println(" 7 : Solid Rhombus");
        System.out.println(" 8 : Butterfly Pattern");
        System.out.println(" 9 : Diamond Pattern");
        int pat = sc.nextInt();

    System.out.print("Enter the number of your rows: ");
    int a = sc.nextInt();
    System.out.print("Enter the number of your columns: ");
    int b = sc.nextInt();


    switch (pat){
        case 1:
        hollow_rectangle(a,b);
        break;
        case 2:
        inverted_rotated_halfpyramid(a, b);
        break;
        case 3:
        inverted_halfpyramid_numbers(a, b);
        break;
        case 4:
        floyd_triangle(a, b);
        break;
        case 5:
        zero_one_triangle(a, b);
        break;
        case 6:
        hollow_rhombus(a, b);
        break;
        case 7:
        solid_rhombus(a, b);
        break;
        case 8:
        butterfly_pattern(a, b);
        break;
        case 9:
        diamond(a, b);
        break;
        default:
        System.out.println("Please enter a correct number associated with the patterns!");
    }
    sc.close();
    }
}

