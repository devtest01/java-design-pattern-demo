package patterns.others.compositeentitypattern;

public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.printf("Data : %s\n", compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1,String data2) {
        compositeEntity.setData(data1, data2);
    }
}
