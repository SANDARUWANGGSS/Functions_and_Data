package Assignment

object Q3 extends App
{
   val x=new Account(4567432,12000);
   val y=new Account(3217864,9000);
   x.Transfer(y,1500);
   class Account(a:Int,b:Int){
    val acnum:Int=a;
    var amount:Int=b;
    
    def NewValues( a:Account,sender:Int,receiver:Int) {
      new Account(this.acnum,sender);
      new Account(a.acnum,receiver);
      println("Account No: "+this.acnum,"Amount: "+this.amount);
      println("Account No: "+a.acnum,"Ammount: "+a.amount);
    }
    
    
    def Transfer(a:Account,value:Int) {
      this.amount=this.amount-value;
      a.amount=a.amount+value;
      NewValues(a,this.amount,a.amount);
    }
    
  }
}

