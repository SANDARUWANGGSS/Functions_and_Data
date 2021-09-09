package Assignment

object Q3 extends App
{
   val x=new Account("972381870v",4567432,"Sandaruwan",12000);
   val y=new Account("993421675v",3217864,"Gamage",9000);
   println("Account Details : "+x+"\t"+y)
   x.transfer(y,1000);
   println("Updated Account Details : "+x+"\t"+y)
   class Account(a:String,b:Int,c:String,d:Double)
   {
    val nic=a
    val acnum:Int=b;
    val name=c;
    var balance:Double=d;
    
    def withdraw(a:Double) = (this.balance = this.balance-a)
    def deposit(a:Double) = (this.balance = this.balance+a)
    def transfer(a:Account,b:Double) = 
    {
      this.withdraw(b) 
      a.deposit(b)
    }
    override def toString = "[" + nic + "," + acnum + "," + name + "," + balance + "]"
   }
}

