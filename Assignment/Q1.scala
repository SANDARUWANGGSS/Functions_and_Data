package Assignment

object Q1 extends App
{
    val r=new Rational(2,3)
    val x=r.neg
    println(x)
  
  class Rational(n:Int,d:Int)
  {
    def number=n
    def denom=d
    def +(r:Rational)=new Rational(this.number*r.denom+r.number*this.denom,denom*r.denom)
    def neg=new Rational(-this.number,this.denom)
    def -(r:Rational)=this+r.neg
    override def toString=number+"/"+denom
  }
}