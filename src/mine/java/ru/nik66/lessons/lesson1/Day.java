package ru.nik66.lessons.lesson1;

public enum Day {

    MONDAY(1), FRIDAY(5), SATURDAY(6);

    private int numbet;

    private Day(int number) {
        setNumbet(number);
    }

    @Override
    public String toString() {
        return "Day{" +
                "name=" + name() +
                ", numbet=" + numbet +
                '}';
    }

    public int getNumbet() {
        return numbet;
    }

    public void setNumbet(int numbet) {
        this.numbet = numbet;
    }
}
