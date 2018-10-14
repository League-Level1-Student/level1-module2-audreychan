
public class TeaMakerRunner {
public static void main(String[] args) {
	TeaBag teaBag = new TeaBag(TeaBag.PASSION_FRUIT);
	Kettle kettle = new Kettle();
	Kettle.Water water = kettle.getWater();
	kettle.boil();
	Cup cup = new Cup();
	cup.makeTea(teaBag, water);
 }
}
