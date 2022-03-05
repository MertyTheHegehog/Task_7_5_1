public class Contrabass extends MusicalInstrument implements Stringed {
    boolean stringsAreReplaced = false;

    public Contrabass(String id, int price) {
        super(id, price);
        super.sizeX = 160;
        super.sizeY = 40;
        super.sizeZ = 30;
    }

    @Override
    public void replaceStrings() {
        stringsAreReplaced = true;
    }
}
