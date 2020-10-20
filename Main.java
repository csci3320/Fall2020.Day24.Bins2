public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        int start = 10000;
        int inc = 10000;
        int incCount = 10;
        for (int n = start; n < start + inc * incCount; n += inc) {
            System.out.print("" + n + ",");
            long startTime;
            long endTime;

            startTime = System.nanoTime();

            IIntCollection bin = new BinIntCollection(100);
            for (int i = 0; i < n; i++) {
                bin.add(14);
                bin.add(22);
                bin.remove(22);
                bin.add(38);
            }

            endTime = System.nanoTime();

            System.out.print((endTime - startTime) / 1000000000.0);
            System.out.print(",");

            startTime = System.nanoTime();

            bin = new LinkedListIntCollection();
            for (int i = 0; i < n; i++) {
                bin.add(14);
                bin.add(22);
                bin.remove(22);
                bin.add(38);
            }

            endTime = System.nanoTime();
            System.out.print((endTime - startTime) / 1000000000.0);
            System.out.print(",");

            
            startTime = System.nanoTime();

            bin = new ArrayListIntCollection();
            for (int i = 0; i < n; i++) {
                bin.add(14);
                bin.add(22);
                bin.remove(22);
                bin.add(38);
            }

            endTime = System.nanoTime();


            System.out.println((endTime - startTime) / 1000000000.0);
        }

    }

}