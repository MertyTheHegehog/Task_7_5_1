public abstract class MusicalInstrument {
    String code;
    int price;
    int sizeX, sizeY, sizeZ;

    public MusicalInstrument(String code, int price) {
        this.code = code;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("A %s with id '%s' has price '%d' and sizes: %d on %d on %d",
                this.getClass().getSimpleName(), code, price, sizeX, sizeY, sizeZ);
    }
}
