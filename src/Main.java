public class Main {

    public static void main(String[] args) {
        MusicStore store = new MusicStore();

        store.printCatalogue();

        store.addToCart("G","1111001");
        store.replaceStrings(0);

        store.addToCart("P","1112001");
        store.replaceStrings(1);
    }
}
