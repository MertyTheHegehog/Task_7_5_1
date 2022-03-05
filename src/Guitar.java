public class Guitar extends MusicalInstrument implements Stringed {
    boolean stringsAreReplaced = false;

    Guitar(String code, int price) {
        super(code, price);
        super.sizeX = 150;
        super.sizeY = 40;
        super.sizeZ = 10;
    }

    @Override
    public void replaceStrings() {
        stringsAreReplaced = true;
    }
}
