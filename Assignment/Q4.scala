package Assignment 

object Q4 extends App
{
 var bank:List[Account]=List(new Account("Sandaruwan",1201,24760.90),new Account("Gamage",1202,68500.50),new Account("Wikum",1203,-8500.50))
    def isoverDraft=(x:Account)=>x.balance<0
    def overDraft=bank.filter(isoverDraft)
    def balance = (x:Account)=>x.balance
    var total = bank.map(balance).reduce((a,b)=>(a+b))
    val interest=(x:Account)=>if (x.balance<0) x.balance=x.balance-x.balance*0.1/100 else x.balance=x.balance+x.balance*0.05/100
    val a=bank.map(interest)
    
    println(bank)
    
}
class  Account(id:String,n:Int,b:Double){
    var nic:String=id
    var acnumber:Int=n
    var balance:Double=b

    override def toString="["+nic+":"+acnumber+":"+balance+"]"

    def withdraw(a:Double)
    {
        this.balance=this.balance-a
    }

    def deposit(a:Double)
    {
        this.balance=this.balance+a
    }

}
