import java.util.List;

public abstract class AIntListCollection extends AIntCollection {
  List<Integer> list;

  @Override
  public int size() {
    return list.size();
  }

  @Override
  public void add(int i) {
    list.add(i);

  }

  @Override
  public void remove(int i) {
    list.remove(Integer.valueOf(i));
  }

  @Override
  public boolean contains(int i) {
    return list.contains(i);
  }

  @Override
  public int count(int search) {
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == search) {
        sum++;
      }
    }
    return sum;
  }
}
