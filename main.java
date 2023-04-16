class Main {
  public static void main(String[] args) {
    //creating an array with the type
    String[] inventory = new String[5];
    //setting whats in the array
    inventory[0] = "Attack";
    inventory[1] = "Health";
    inventory[2] = "Poison";
    inventory[3] = "Love";
    inventory[4] = "Defence";

  //System.out.println(inventory[0]); - tedious

  // create a for loop for iterating array but not out of bounds
  for (int i = 0; i < inventory.length; i++ ){
    System item = inventory[i];
    if(item != null && item.equals("Key")) {
      System.out.println("You have a key in your inventory");
      break;
    }
  }
    


  }
}
