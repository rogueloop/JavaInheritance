class B extends A
{
    public int z;
    //child class object initialisation
    publick B(int x,int y int z)
    {
        super(x,y); // if not mentioned java will insert super()
        this.z= z;
        // super.x=x
        // super.y=y
    }
    public void printsum(){
        System.out.println(x+y+z);
    }
}