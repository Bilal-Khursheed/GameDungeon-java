
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Game {

    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);

    /*Player status*/
    int playerHP;           /*Player health*/
    String player_name;      /*Player name*/
    String player_weapon;    /*Player weapon*/
    int choice;             /*Player choice*/
    int max_health = 20;    /*Max health for player*/
    int weapon_damage = 1;  /*Initial weapon damage*/

    /*Available weapons*/
    String Weapon1 = "Sword";
    String Weapon2 = "Nunchaku";
    String Weapon3 = " Silver Sword ";

    /*Oppenent status*/
    int enemyHP = 40;          /*Oppenent health*/
    String enemy_name = "ZEDKIN";

    /*Paths*/
    int[] map = {0,0,0,0};

    /*The lost ring*/
    int magic_ring = 0;

    public static void main(String[] args) {

        Game game;
        game = new Game();	/*Create a new game*/

        game.init();          /*Player setup*/
        game.Offer();         /*Game begins*/
    }

    public void init(){
        System.out.println("*******GAME STARTS*******\n\n");

        /*Your initial status*/
        playerHP = 10;
        player_weapon = "Spoon";     /*Start weapon*/

        System.out.println("[YOUR INITIAL STATUS IS]");
        System.out.println("--------------------------------");
        System.out.println("Your HP is: "+ playerHP);
        System.out.println("Your starter Weapon is: "+ player_weapon);
        System.out.println("--------------------------------");

        System.out.println("Now, tell me your name:");

        player_name = myScanner.nextLine();

        System.out.println("\nHello " + player_name + ", my name is JEFF");
        System.out.println("We don't have time, follow me!");

        /*A small delay */
        try {
            TimeUnit.SECONDS.sleep(4);
        }
        catch (InterruptedException ex)
        {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void Offer()
    {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("I have a mission for you " +player_name);
        System.out.println("If you accomplice it, i will give you the map you want, but remember there is no back");
        System.out.println("The mission is to find my magic ring");
        System.out.println("To take it back you have to fight with one of my biggest enemies, his name is: "+ enemy_name);
        System.out.println("He is very powerfull, so you have to be very carefull");
        System.out.println("\nNow tell me, do you accept the offer?");

        /*DECISION*/
        System.out.println("1: Yes");
        System.out.println("2: No");

        choice = myScanner.nextInt();

        if(choice==1){
            System.out.println("Great, you are a brave man.Now let's go to the town ");
            /*A small delay */
            try {
                TimeUnit.SECONDS.sleep(2);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }

            townGate();
        }
        else if(choice==2){
            System.out.println("Then go away and don't comeback again!!  ");
        }
    }

    public void townGate(){
        System.out.println("\n------------------------------------------------------------------\n");

        System.out.println("This is the town of MALDASAR "+ player_name);
        System.out.println("I will wait you until you bring me back the ring");
        System.out.println("");
        System.out.println("What do you want to do?");
        System.out.println("");
        System.out.println("1: Talk to JEFF");
        System.out.println("2: Go to find the ring");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        switch (choice) {
            case 1:
                if(magic_ring==1){
                    ending();       /*In case i found the ring*/
                }
                else{
                    System.out.println("You have to find my ring, come back when you do it");
                    enterScanner.nextLine();    /*Enters a delay, till player type something*/
                    townGate();
                }
                break;
            case 2:
                crossRoad();
                break;
            default:
                townGate();
                break;
        }
    }

    public void crossRoad(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Select your path. \nIf you go south, you will go back to the town.\n\n");

        System.out.println("1: Go north");
        System.out.println("2: Go east");
        System.out.println("3: Go south");
        System.out.println("4: Go west");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        switch (choice) {
            case 1:
                north();
                break;
            case 2:
                east();
                break;
            case 3:
                townGate();
                break;
            case 4:
                west();
                break;
            default:
                crossRoad();
                break;
        }
    }


    public void north(){

        System.out.println("\n------------------------------------------------------------------\n");

        System.out.println("Welcome to the castle of north "+ player_name);
        /*Long description*/
        if(map[0]==0)
        {



            System.out.println("************************************************************************************");

            System.out.println("Long description\n\n");

            System.out.println("Originally built in the 12th century as a monastery");
            System.out.println("it Became a military stronghold in the medieval battles between the four nations.");
            System.out.println("Most visitors claim that it is the most haunted castle in the world");
            System.out.println("There is a myth that a dragon lives in the hood");

            System.out.println("************************************************************************************");

            map[0]++;

            /*A small delay */
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            System.out.println("************************************************************************************");

            System.out.println("short description\n");


            System.out.println("There are many shops in which you can buy things");

            System.out.println("************************************************************************************");

            /*A small delay */
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }

        }




        System.out.println("Hey stranger Welcome to my shop. ");
        System.out.println("Mmm do you want a new weapon? \n");


        /*DECISION*/
        System.out.println("1: Yes, but i don't have money.");
        System.out.println("2: No, i don't need any other weapon.");

        /*A small delay */
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }


        choice = myScanner.nextInt();
        if(choice==1){
            System.out.println("Don't worry , i know your reason that you are here you can select  any weapon you want\n\n");
            System.out.println("*****************************************");
            System.out.println("1."+ Weapon1 +" :Damage per hit 2");
            System.out.println("2."+ Weapon2 +" :Damage per hit 3");
            System.out.println("3."+ Weapon3 +" :Damage per hit 5");
            System.out.println("*****************************************\n");


            /*Choose a new weapon*/
            choice = myScanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(Weapon1+" is yours..\n");
                    weapon_damage=2;
                    break;
                case 2:
                    System.out.println(Weapon2+" is yours..\n");
                    weapon_damage=3;
                    break;
                case 3:
                    System.out.println(Weapon3+" is yours..\n");
                    weapon_damage = 5;
                    break;
                default:
                    break;
            }

        }
        else if(choice==2){
            System.out.println("Ok then good luck");
        }


        /*A small delay */
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*Decision part*/
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice==1){
            crossRoad();
        }
        else{
            north();
        }
    }

    public void east(){

        System.out.println("\n------------------------------------------------------------------\n");

        System.out.println("Welcome to the castle of east "+ player_name);
        /*Long description*/
        if(map[1]==0)
        {
            System.out.println("************************************************************************************");

            System.out.println("[Long description]\n\n");

            System.out.println("Originally built in the 10th century");
            System.out.println("It is surrounded by a wall of green earth and a ditch or a moat called the Deep Gen. ");
            System.out.println("The city is a host of Mallorn trees where the elves live in flets atop the trees. Located in the city's center");


            System.out.println("************************************************************************************");

            map[1]++;

            /*A small delay */
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            System.out.println("************************************************************************************");

            System.out.println("[short description]\n");


            System.out.println("The world of Mallorn trees and elves");

            System.out.println("************************************************************************************");

            /*A small delay */
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("I am aphrodite, the healing elve  ");
        System.out.println("Do you need a rest? \n");


        /*DECISION*/
        System.out.println("1: Yes, please");
        System.out.println("2: No, i am fine");

        /*A small delay */
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }


        choice = myScanner.nextInt();


        if(choice==1)
        {
            if(playerHP <= max_health)
            {
                System.out.println("Good");
                System.out.println("Your HP is recovered.");
                playerHP = playerHP + 3;
                System.out.println("Your HP is: " + playerHP);
            }
            else       System.out.println("Sorry, but i can't heal you more");
        }
        else if(choice==2)
        {
            System.out.println("Ok, i hope to find your way");
        }

        /*A small delay */
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice==1){
            crossRoad();
        }
        else{
            east();
        }
    }

    public void west(){

        System.out.println("\n------------------------------------------------------------------\n");

        System.out.println("Welcome to the castle of west "+ player_name);
        /*Long description*/
        if(map[3]==0)
        {
            System.out.println("************************************************************************************");

            System.out.println("[Long description]\n\n");

            System.out.println("The castle was held together by dark magic and was the greatest fortress in Middle-earth of its time");
            System.out.println("The tower itself slowly became a stronghold of the enemy and was commanded by " + enemy_name);
            System.out.println("He is the powerfull magician ");
            System.out.println("He is one of the most powerfull men in the MALDASAR");


            System.out.println("************************************************************************************");

            map[3]++;

            /*A small delay */
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            System.out.println("************************************************************************************");

            System.out.println("[short description]\n");


            System.out.println("This the castle of "+enemy_name);

            System.out.println("************************************************************************************");

            /*A small delay */
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }




        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Who is there ??\n");
        System.out.println("Wait a minute you are "+ player_name);
        System.out.println("You want the magic ring right? \n");
        System.out.println("Then you have to take it my little friend\n\n\n");


        System.out.println("1: Fight");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice==1){
            System.out.println("\nLet's see your power my little friend");
            fight();
        }
        else if(choice==2){
            System.out.println("Do you think that you can escape?\n I will find you..");
            crossRoad();
        }
        else{
            west();
        }
    }

    public void fight(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Your HP: "+ playerHP);
        System.out.println(enemy_name+ " HP: " + enemyHP);

        /*Choose*/
        System.out.println("\n1: Attack");
        System.out.println("2: Run");
        System.out.println("\n------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice==1){
            attack();
        }
        else if(choice==2){
            crossRoad();
        }
        else{
            fight();
        }
    }

    public void attack(){



        System.out.println("You attacked JEFF with your waepon and gave him [" + weapon_damage + "] damage!");

        enemyHP = enemyHP - weapon_damage;

        System.out.println("JEFF HP: " + enemyHP);

        if(enemyHP<1)
        {
            win();
        }
        else if(enemyHP>0){
            int enemy_damage =0;

            enemy_damage = new java.util.Random().nextInt(4);

            System.out.println("JEFF attacked with his sword  [" + enemy_damage + "] damage!");

            playerHP = playerHP - enemy_damage;

            System.out.println("Player HP is: " + playerHP);

            /*Message to the player*/
            if(playerHP<3)
            {
                System.out.println("\n\n*******************************");
                System.out.println("[MESSAGE]");
                System.out.println(player_name+" , your life is too slow");
                System.out.println("I suggest you, to rest");
                System.out.println("*******************************");

            }

            if(playerHP<1)
            {
                dead();
            }
            else if(playerHP>0){
                fight();
            }
        }


    }

    public void dead(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("JEFF defeated you");
        System.out.println("\n\nGAME OVER");
        System.out.println("\n------------------------------------------------------------------\n");

    }

    public void win(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You defeat me, you are the strongest man i've ever face!");
        System.out.println("\nThe ring is yours");

        System.out.println("*****************************************");
        System.out.println("Congratulations "+player_name+ ", you get the magic ring back!\n\n");
        System.out.println("*****************************************");
        System.out.println("1: Go east");
        System.out.println("\n------------------------------------------------------------------\n");

        magic_ring = 1;

        choice = myScanner.nextInt();
        if(choice==1){
            crossRoad();
        }
        else{
            win();
        }

    }

    public void ending(){
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You did it!!");
        System.out.println("You defeated ZEDKIN, and bring back the ring");
        System.out.println("Thank you so much "+player_name);
        System.out.println("You can take the map");
        System.out.println("\n\n           END OF THE GAME               ");
        System.out.println("\n------------------------------------------------------------------\n");
    }
}
