/**
 * The Calculator class performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division.
 */
class Calculator extends ExtendedClass{

    float Addition(float  operand_1, float operand_2){
        return(operand_1 + operand_2);
    }
    float Substraction(float  operand_1, float operand_2){
        return(operand_1 - operand_2);
    }
    float Multiplication(float  operand_1, float operand_2){
        return(operand_1 * operand_2);
    }
    float Division(float  operand_1, float operand_2){
        return(operand_1 / operand_2);
    }
    float Square(float operand_1){
        return(operand_1*operand_1);
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();
        float operand_1 = 8;
        float operand_2 = 4;
        
       float add_result = calc.Addition(operand_1, operand_2);
       System.out.println("Addition of 8 and 4 ="+add_result);

       float sub_result = calc.Substraction(operand_1, operand_2);
       System.out.println("Substraction of 8 and 4 =="+sub_result);

       float mult_result = calc.Multiplication(operand_1, operand_2);
       System.out.println("Multiplication of 8 and 4 =="+mult_result);


       float div_result = calc.Division(operand_1, operand_2);
       System.out.println("Division of 8 and 4 =="+div_result);

       float sq_result = calc.Square(operand_1);
       System.out.println("Squared of 8="+sq_result);

       float square_result = calc.Square(2);
       System.out.println("Squared no of 2.="+square_result);

       float cube_result= calc.Cube(5);
       System.out.println("Cube no of 5.="+cube_result);

       float mod_result= calc.Mod(10, 20);
       System.out.println("Mod of 10 and 20="+mod_result);
    }

}