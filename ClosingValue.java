import java.util.*;
class Bid{
    Integer id;
    String type;
    String name;
    Integer presentP;
    Integer quantity;

    public Bid(Integer id,String type,String name,Integer presentP ,Integer quantity){
        this.id=id;
        this.type=type;
        this.name=name;
        this.presentP=presentP;
        this.quantity=quantity;

    }
}
class TestTcs{

    
    public static void main(String []  args){
        Scanner sc=new Scanner(System.in);

        ArrayList<Bid> a=new ArrayList<Bid>();
        Bid b=new Bid(1, "SELL", "ABC", 1876, 173);
        Bid b1=new Bid(2,"SELL","DEF",7160,221);
        Bid b2=new Bid(3,"BUY","ABC",6986,864);

        a.add(b);
        a.add(b1);
        a.add(b2);
        // int n=sc.nextInt();

        // while(n--!=0){
        //     System.out.println("The Pattern should be ID ,TYPE, NAME, PRICE, QUANTITY " );
        //     Integer id=sc.nextInt();
        //     String type=sc.next();
        //     String name=sc.next();
        //     Integer priceP=sc.nextInt();
        //     Integer quantity=sc.nextInt();

        //    Bid b=  new Bid(id, type, name, priceP,quantity);
         
        //     a.add(b);
        // }


        Map <String,Integer> sell=new TreeMap<String,Integer>();
        Map <String,Integer> buy=new TreeMap<String,Integer>();


        for(Bid p:a){
            if(p.type=="SELL"){
                sell.put(p.name,p.presentP);

            }
            if(p.type=="BUY"){
            buy.put(p.name,p.presentP);
            }
        }
        Map <String,Integer> fina=new TreeMap<String,Integer>();

        // Set <String> se=sell.keySet();
        Set <String> bu=buy.keySet();
        while(!buy.isEmpty()){
            for(String l:bu){
                while(sell.containsKey(l)){
                    Integer ist=buy.get(l);
                    Integer sec=sell.get(l);
                    if(ist>=sec){
                        fina.put(l, sec);
                        sell.remove(l);
                    }

                }
            }
            buy.clear();
            
        }
        if(!fina.isEmpty())
       fina.forEach((k,v)->System.out.println(k +" : "+v));
        
        else
        System.out.println("Stocks not traded ");


         
           
        



    }
}