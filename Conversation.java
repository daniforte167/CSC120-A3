import java.util.Scanner;
import java.util.ArrayList;

class Conversation {

  public static void main(String[] arguments) {    
    // You will start the conversation 
    Scanner input = new Scanner(System.in);

      
      ArrayList<String> responses = new ArrayList<String>();
      responses.add("Wow");
      responses.add("Cool");
      responses.add("Oh, yeah, definitely");
      responses.add("Uh, huh");
      
  

    ArrayList<String> user_inputs_responses = new ArrayList<String>(); 
    //variable named
    //this is what's storing all the above randomized responses


        
        System.out.println("Enter an integer: ");
        int numRounds = input.nextInt();
        System.out.println("Hi! What's on your mind!");
        input.nextLine();
        for (int i=0; i<numRounds; i++) {
            //this asks for the number of rounds and asks for the loop to start
            String user_inputs = input.nextLine(); 
            //this prompts the response
            //System.out.println(user_inputs);4

            //this prints the response
            user_inputs_responses.add(user_inputs);
            //this calls in and storess the users responses 
            if (user_inputs.contains("me")) {
                String mirrored_phrase = wordMirror2(user_inputs);
                System.out.println(mirrored_phrase + "?");
                user_inputs_responses.add(mirrored_phrase);}
              else if (user_inputs.contains("you")){
                String mirrored_phrase = wordMirror2(user_inputs);
                System.out.println(mirrored_phrase + "?");
                user_inputs_responses.add(mirrored_phrase);}
              else if (user_inputs.contains("I")){
                String mirrored_phrase = wordMirror2(user_inputs);
                System.out.println(mirrored_phrase + "?");
                user_inputs_responses.add(mirrored_phrase);}
              else if (user_inputs.contains("am")){
                String mirrored_phrase = wordMirror2(user_inputs);
                System.out.println(mirrored_phrase +"?");
                user_inputs_responses.add(mirrored_phrase);}
              else if (user_inputs.contains("my")){
                String mirrored_phrase = wordMirror2(user_inputs);
                System.out.println(mirrored_phrase + "?");
                user_inputs_responses.add(mirrored_phrase);}
              else if (user_inputs.contains("your")){
                String mirrored_phrase = wordMirror2(user_inputs);
              System.out.println(mirrored_phrase + "?");
              user_inputs_responses.add(mirrored_phrase);}              
              else System.out.println(responses.get(i));
            




//queues so it's ready for input response
          }input.close();
  // this should ask how many rounds there are
  System.out.println("Goodbye now, friend!");

        System.out.println(user_inputs_responses);

  }

  public static String wordMirror2(String phrase) {
    String mirrored_phrase = phrase.replace("I", "you");
    mirrored_phrase = mirrored_phrase.replace("me", "you");
    mirrored_phrase = mirrored_phrase.replace("am", "are");
    mirrored_phrase = mirrored_phrase.replace("my", "your");

    return mirrored_phrase;
  }
  public static String wordMirror3(String phrase_2) {
    String mirrored_phrase_2 = phrase_2.replace("you", "I");
    mirrored_phrase_2 = mirrored_phrase_2.replace("your", "my");
  
    return mirrored_phrase_2;
  }
}

// (can use same scanner - don’t need new one every input from user)"""

// needed so you declare the string
// that is what's prompting the users to respon
// adding to a list so we can print later
// this does it
// this is for later step where we print out the list
