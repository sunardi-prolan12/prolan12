package sunardigeneric;


class parkir<T>{
    private T jam;

    public parkir(T jam) {

        this.jam = jam;

    }

    public void setJam(T jam) {
        this.jam = jam;
    }

    public T getJam() {
        return jam;
    }

    public void getType() {
        System.out.println("Tipe awalnya " + jam.getClass().getName());
    }
}
