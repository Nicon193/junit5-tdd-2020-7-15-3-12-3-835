package junit5.tdd;

public class fizzBuzzWhizz {
    public String play(int number){
         String result ="";
         if (number%3==0){
             result+="Fizz";
         }

        if (result.equals("")) {
            result = String.valueOf(number);
        }
    return result;
    }
}
