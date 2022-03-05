public class BaseLoader {

    public Object[][] loadBase() {
        Object[][] base = new Object[3][];
        base[0] = loadGuitars();
        base[1] = loadPianos();
        base[2] = loadContrabasses();
        return base;
    }

    private Object[] loadGuitars() {
        Object[] guitars = new Guitar[5];

        guitars[0] = new Guitar("1111001", 1000);
        guitars[1] = new Guitar("1211002", 1100);
        guitars[2] = new Guitar("1311003", 1300);
        guitars[3] = new Guitar("1411004", 2000);
        guitars[4] = new Guitar("1511005", 5000);

        return guitars;
    }

    private Object[] loadPianos() {
        Object[] pianos = new Piano[5];

        pianos[0] = new Piano("1112001", 1000);
        pianos[1] = new Piano("1212002", 1100);
        pianos[2] = new Piano("1312003", 1300);
        pianos[3] = new Piano("1412004", 2000);
        pianos[4] = new Piano("1512005", 5000);

        return pianos;
    }

    private Object[] loadContrabasses() {
        Object[] contrabasses = new Contrabass[5];

        contrabasses[0] = new Contrabass("1113001", 1000);
        contrabasses[1] = new Contrabass("1213002", 1100);
        contrabasses[2] = new Contrabass("1313003", 1300);
        contrabasses[3] = new Contrabass("1413004", 2000);
        contrabasses[4] = new Contrabass("1513005", 5000);

        return contrabasses;
    }
}
