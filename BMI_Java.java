import java.util.Scanner;

class BMI{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height(cm) : ");
        int h = sc.nextInt();
        System.out.print("Enter the Weight(kg) : ");
        int m = sc.nextInt();
        float index = m/(h*h/10000);
        System.out.println("BMI : " + index);
        if(index<18.5){
            System.out.println("UNDERWEIGHT");
        }
        else if(index>18.5 && index<24.5){
            System.out.println("HEALTHY!");
        }
        else if(index>24.5 && index<29.5){
            System.out.println("OVERWEIGHT");
        }
        else{
            System.out.println("EXTREME OBESE");
        } 
    }
}
