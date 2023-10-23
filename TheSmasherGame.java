package New_class_book.Methods;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class TheSmasherGame {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("""
                                                    ```````````````````````````````
                                                  |   Welcome to the Smasher Game   |
                                                    ..............................
                                                      
                """);
        do {
        String option = """
                                
                                Options
                  
                    1. Play 
                    2. Help 
                    3. About
                    4. Exit
                        
                """;
        System.out.print(option  + "\nEnter your Option: ") ;
        int playerOpiton = keyboard.nextInt();
        keyboard.nextLine();
        switch (playerOpiton){
            case 1 ->{
                boolean playAgain ;
                String playChoice = """
                               
                               Do you Wanna play Again 
                               
                                   yes -> Enter [y]
                                   No  -> Enter [n]
                                  
                               """;
                char answer;
                do{
                    playAgain = false;
                    play();
                    System.out.print(playChoice + "\nEnter your choice : ");

                    answer = keyboard.nextLine().charAt(0);
                    if (answer == 'y')
                        playAgain = true;

                }while (playAgain);

            }
            case 2 ->{
                help();
            }
            case 3 ->{
                about();
            }
            case 4 ->{
                System.exit(0);
            }
            default ->
                System.out.println("Invalid Input");
        }} while (true);




    }

    /**
     * this method is used to help player with rules of the game.
     */
    static void help(){
        String welcomeAndIntroduce = """
                                                    ```````````````````````````````
                                                  |   Welcome to the Smasher Game   |
                                                    ...............................
                                            
                                            Here are the Rules of the Game you need to know
                                          ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                                            
                                              # there are three Elements in the game\s
                                                            
                                                            1. Rock
                                                            2. Scissor
                                                            3. Paper
                                              
                                              
                              you'll select one of the elements and also does the computer.
                                   
                                   
                                   # if  Rock and  Scissor is selected, The Rock will Wins.
                                            => the Rock smashes the Scissor.
                                           
                                   # if Scissor and Paper are selected , The Scissor Wins.
                                            => the Scissor cuts the Paper.
                                            
                                   # if Rock and Paper selected, The Paper Wins.
                                            => the Paper Wraps the Rock.
                                                
                                  
                                            
                """;
        System.out.println(welcomeAndIntroduce);
    }
    static void play(){
        Scanner keyboard = new Scanner(System.in);
        Random rand =new Random();
        int computerChoice = rand.nextInt(0,3);
        System.out.println("""
                
                Rock
                Paper
                Scissor
                
                """);
        System.out.print("Enter your choice: ");
        String playerChoice = keyboard.nextLine();
        compare(playerChoice, computerChoice);

    }

    /**
     * This method shows information about the developer.
     */
    static void about(){
        System.out.println("""
                
                        Email:          fuadmuhe12@gmail.com
                        
                        Phone number :  0978060846
                        
                        telegram :      t.me/just_zbest
                        
                        
                        ~~  developed by Fuad Mohammed  ~~
                        
                """);

    }

    /**
     * This method compares the input of the computer and the player to decide who has won the game
     * @param player is the input of the player
     * @param computer is the random choice of the computer
     */
    static void compare(String player , int computer){
        ArrayList<String> elements = new ArrayList<>();
        elements.add("rock");
        elements.add("scissor");
        elements.add("paper");
        ArrayList<Integer> rockANDscissors = new ArrayList<>();
        rockANDscissors.add(1);
        rockANDscissors.add(0);
        ArrayList<Integer> rockANDpaper= new ArrayList<>();
        rockANDpaper.add(0);
        rockANDpaper.add(2);
        ArrayList<Integer> paperANDscissors = new ArrayList<>();
        paperANDscissors.add(1);
        paperANDscissors.add(2);
        if (elements.indexOf(player) == computer ){
            System.out.println("Draw, Don't give UP  there is allot to win");
            return;
        }else if (paperANDscissors.contains(elements.indexOf(player)) && paperANDscissors.contains(computer)){
            if (computer == 1){
                System.out.println("""
                        
                        
                                you have Lost,\s
                                
                                computer has cut your paper.
                                
                        
                         """);
            }else System.out.print("""
                    
                    
                            Congratulation, you have won.
                            
                            your Scissors have successfully cut the computer's paper
                    
                    
                    """);
        }else if (rockANDpaper.contains(elements.indexOf(player)) && rockANDpaper.contains(computer)){
            if (computer == 2){
                System.out.println("""
                            
                            
                                    you have Lost, 
                                    
                                    computer has wrapped your Rock with Paper.
                                    \n
                             """);
            }else System.out.println("""
                            
                            
                            Congratulation, you have won.
                            
                            your Paper have successfully wrapped the computer's Rock
                            
                            
                    """);
        }else if(rockANDscissors.contains(elements.indexOf(player)) & rockANDscissors.contains(computer)){
            if (computer == 0){
                System.out.println("""
                        
                                
                                you have Lost, 
                                
                                computer has smashed your Scissor with Rock.
                                
                                
                         """);
            }else System.out.println("""
                            
                            
                            Congratulation, you have won.
                            
                            your Rock have successfully smashed the computer's Scissor
                            
                            
                    """);
        }else System.out.println("\n\n\t\tInvalid input.\n\n");
    }
}
