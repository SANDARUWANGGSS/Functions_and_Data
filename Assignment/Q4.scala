package Assignment
import Q3.Account

object Q4 extends App
{
    var bank:List[Account] = List()
    var Print = (a:List[Account])=>(a.map(x => println(x)));
    val Find=(n:String,b:List[Account])=>b.filter(x=>x.nic.equals(n))
    val OverDraft = (b:List[Account])=>b.filter(x => (x.balance < 0))
    val Total  = (b:List[Account])=> b.reduce((x,y) => new Account("",0,"",x.balance + y.balance)).balance
    val Calculate =(x:Account)=>if(x.balance < 0) x.balance *0.1  else x.balance*0.05
    val Interest=(b:List[Account])=>b.map(x => x.deposit(Calculate(x)))
    
    var customer1 = new Account("984582675v",4567432,"Sandaruwan",6785.70)
    var customer2 = new Account("997580435v",523655899,"Dammika",-78)  
    var customer3 = new Account("968687535v",325423565,"Sumal",190.86)
    var customer4 = new Account("884587475v",112565985,"Sanjaya",-32.80)
    var customer5 = new Account("894586592v",112565985,"Janaka",67540.78)
    
    bank = List(customer1,customer2,customer3,customer4,customer5)
    Interest(bank)
    println("Account Details That Have Negative Balances : " + OverDraft(bank)) 
    println("Sum Of All Account Balances : " + Total(bank))
    println("Updated Account Details")
    Print(bank)
}
