class A {
    protected int x;
    protected int y;

    // protecter variables can be accesssed
    PUBLIC A() {
        x = 10;
        y = 20;

    }

    // no argument cunstructor returns default values
    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }
}