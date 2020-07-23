package junit5.tdd;

public class fizzBuzzWhizz {
    public String play(int number){
         String result ="";
         if (number%3==0){
             result+="Fizz";
         }else if(number%5==0){
             result+="Buzz";
         }else if(number%7==0){
             result+="Whizz";
         }

        if (result.equals("")) {
            result = String.valueOf(number);
        }
    return result;
    }
}
