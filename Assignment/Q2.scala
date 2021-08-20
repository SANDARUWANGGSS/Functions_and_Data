package Assignment

object Q2 extends App
{
  val r1=new Rational(3,4)
  val r2=new Rational(1,4)
  val r3=new Rational(1,3)
  val x=r1+r2.neg+r3.neg
  println(r1)
  println(r2)
  println(r3)
  print("Answer : ")
  print(x)
  
  class Rational(n:Int,d:Int)
  {
    private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b)
    def number=n/gcd(n,d)
    def denom=d/gcd(n,d)
    def this(n:Int)=this(n,1)
    
    def +(r:Rational)=new Rational(this.number*r.denom+this.denom*r.number,this.denom*r.denom)
    def neg=new Rational(-this.number,this.denom)
    def -(r:Rational)=this+r.neg
    override def toString=number+"/"+denom
  }
}