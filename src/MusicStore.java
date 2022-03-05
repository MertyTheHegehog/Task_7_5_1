public class MusicStore {
    private Object[][] sections;
    private Object[] cart;
    private int numberOfGoods = 0, total = 0;

    MusicStore() {
        cart = new Object[20];
        sections = new Object[3][];
        loadBase();
    }

    public int getTotal() {
        return total;
    }

    public void printCatalogue() {
        int i = 0, j = 0;

        while (i < sections.length && sections[i][j] != null) {
            while (j < sections[i].length && sections[i][j] != null) {
                System.out.println(sections[i][j]);
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }
    }

    public void addToCart(String type, String code) {
        int section;
        switch (type) {
            case "G":
                section = 0;
                break;
            case "P":
                section = 1;
                break;
            case "C":
                section = 2;
                break;
            default:
                System.out.println("wrong typed section, please enter G, P or C");
                return;
        }

        int i = 0;
        while (i < sections[section].length && sections[section][i] != null) {
            if (((MusicalInstrument) sections[section][i]).code.equals(code)) {
                numberOfGoods++;
                cart[numberOfGoods - 1] = sections[section][i];
                System.out.printf("Product %s added to cart\n", ((MusicalInstrument) sections[section][i]).code);
                total += ((MusicalInstrument) cart[numberOfGoods - 1]).price;
                System.out.printf("Total account is %d now\n", total);
                break;
            }
            i++;
        }
    }

    public void replaceStrings(int i) {
        if (cart[i] instanceof Stringed) {
            ((Guitar) cart[i]).replaceStrings();
            System.out.printf("Product %s has good strings now \n", ((MusicalInstrument) cart[i]).code);
            total += 300;
            System.out.printf("Total account is %d now\n", total);
        } else
            System.out.printf("Can't replace strings: product %s is not stringed\n", ((MusicalInstrument) cart[i]).code);
    }

    private void loadBase() {
        BaseLoader base = new BaseLoader();
        sections = base.loadBase();
    }
}
