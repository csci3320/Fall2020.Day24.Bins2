
public class BinIntCollection extends AIntCollection{

    int maxSize;
    int[] bin;

    public BinIntCollection(int maxSize){
        this.maxSize  = maxSize;
        bin = new int[maxSize];
        for(int i = 0; i < maxSize; i++){
            bin[i] = 0;
        }
    }

    @Override
    public int size() {
         int sum = 0;
         for(int i = 0; i < maxSize; i++){
             sum+=bin[i];
         }
         return sum;
    }

    @Override
    public void add(int i) {
        bin[i]++;
    }

    @Override
    public void remove(int i) {
        // What if I go below 0?
        bin[i]--;
    }

    @Override
    public boolean contains(int i) {
        return bin[i] > 0;
    }

    @Override
    public int count(int i) {
        return bin[i];
    }

}