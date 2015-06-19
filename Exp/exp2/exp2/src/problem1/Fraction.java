/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

/**
 *
 * @author Duan
 */
class Fraction {
    private int denominater;
    private int numerator;
    public Fraction(){
        setFrac(0,1);
    }
    public Fraction(Fraction a){
        setFrac(a.getFracNum(),a.getFracDen());
    }
    public Fraction(int numer,int denom){
        setFrac(numer,denom);
    }
    public void setFrac(int numer,int denom){
        if(denom==0){
            System.out.println("!!!");
            denominater=1;
            numerator=0;
        }else{
            denominater=denom;
            numerator=numer;
            splFrac();
        }
    }
    public void setFrac(Fraction a){
        setFrac(a.getFracNum(),a.getFracDen());
    }
    public void normFrac(){
        if(denominater<0){
            denominater=-denominater;
            numerator=-numerator;
        }
    }
    public void splFrac(){//simplified
        int maxgbd=1;
        normFrac();
        if(numerator>0)
            maxgbd=getGbd(denominater,numerator);
        else if(numerator<0)
            maxgbd=getGbd(denominater,-numerator);
        else
            denominater=1;
        if(maxgbd>1){
            denominater/=maxgbd;
            numerator/=maxgbd;
        }
    }
    public int getFracDen(){
        return denominater;
    }
    public int getFracNum(){
        return numerator;
    }
    public String getFrac(){
        return toString();
    }
    public int getGbd(int a,int b){
        int maxgbd=1;
        if(a<b){
            maxgbd=a;
            a=b;
            b=maxgbd;
        }else if(a==b){
            return a;
        }
        if(a%b==0){
            maxgbd=b;
        }else{
            while(a%b!=0){
                maxgbd=a-b;
                a=b;
                b=maxgbd;
            }
        }
        return maxgbd;
    }
    public void add(Fraction a){
        if(a.getFracNum()!=0){
            if(a.getFracDen()==denominater){
                numerator+=a.getFracNum();
            }else{
                numerator=numerator*a.getFracDen()+a.getFracNum()*denominater;
                denominater*=a.getFracDen();
            }
            splFrac();
        }
    }
    public static Fraction add(Fraction a,Fraction b){
        Fraction addtion=new Fraction(a);
        addtion.add(b);
        return addtion;
    }
    public void sub(Fraction a){
        Fraction subst=new Fraction(-a.getFracNum(),a.getFracDen());
        add(subst);
    }
    public static Fraction sub(Fraction a,Fraction b){
        Fraction subst=new Fraction(a);
        subst.sub(b);
        return subst;
    }
    public void multi(Fraction a){
        numerator*=a.getFracNum();
        denominater*=a.getFracDen();
        splFrac();
    }
    public static Fraction multi(Fraction a,Fraction b){
        Fraction multip=new Fraction(a);
        multip.multi(b);
        return multip;
    }
    public void divid(Fraction a){
        if(a.getFracNum()==0){
            System.out.println("");

        }else{
            denominater*=a.getFracNum();
            numerator*=a.getFracDen();
            splFrac();
        }
    }
    public static Fraction divid(Fraction a,Fraction b){
        Fraction divide=new Fraction(a);
        divide.divid(b);
        return divide;
    }
    
    @Override
    public String toString(){
        if(denominater==1)
            return numerator+"";
        else
            return numerator+"/"+denominater;
    }
}
