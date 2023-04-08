interface Member
{
    void callback();
}

class Store
{
    Member[] mem=new Member[100];
    int count=0;

    void rigister(Member m)
    {
        mem[count++]=m;
    }

    void invatesell()
    {
        for(int i=0;i<count;i++)
        {
            mem[i].callback();
        }
    }
}

class Customer implements Member
{
    String name;
    Customer(String n)
    {
        name=n;
    }

    public void callback()
    {
        System.out.println("Ok,I will visit - "+ name);
    }
}


class InterfaceChallange {
        public static void main(String[] args)
        {
            Store s=new Store();
            Customer c1=new Customer("Ayush Ginoya");
            Customer c2=new Customer("Deep Ginoya");
            s.rigister(c1);
            s.rigister(c2);
            s.invatesell();
        }   
}
