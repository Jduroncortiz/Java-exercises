class Dog extends Animal { // Subclass (child)
  
    public void doSomething(){
      //super.animalSound();
      System.out.println("Something done");
    }
    public void animalSound() {
      //super.animalSound(); // Call the superclass method
      System.out.println("The dog says: bow wow");
    }
}