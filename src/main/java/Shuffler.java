import java.util.Random;

public class Shuffler {
  //creating field when type random, hit alt enter to add the import up top. Random is type,
  // rng is random number generator .  (RAND)
  private final Random rng;

  //created constructor with 1 parameter.
  public Shuffler(Random rng) {
    this.rng = rng;
  }

  //creating method to shuffle array in place. shuffle name takes an int array called data. Parameter is (int[] data)
  public void shuffle(int[] data) {
    // for loop has to be in method. for loop has own braces. Inside () is the counter. data.length is the position or index.
    // i greater than or equal to 1. i-- is to subtract 1 from i.
    for (int i = data.length-1; i >=1; i--) {
    int t = rng.nextInt(i + 1);
    if (t != i) {
      //copy position t into temp , then place i into position t(both boxes now read i), then position i recieves the temp (t)
      int temp = data [t];
      data [t] = data[i];
      data [i] = temp;
    }
    }
  }

}
