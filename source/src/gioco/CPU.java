package gioco;

import static gioco.Gioco.*;
import java.util.*;

/**
 * @author NICOLA
 */
public class CPU {
         
    double[] imp=new double[12];
    public Set<String> carteAndate=new HashSet<>();
          
    public String scegliCarta2(String[] carteCorrenti, String avversario, int cRimaste)
    {
        char seme=avversario.charAt(1);
        int nBriscola=0;
        
        double[] scartini = {3, 1.8, 3, 3.2, 3.4, 1.6, 1.5, 1.4, 0, 3.8, 4, 1.6, 1.3, 1.2, 1.1, 1};     // 2 scartini, 3 vestiti (vedono), vestito non vede, carico vede/non vede
        double[] vestiti = {2.5, 2.8, 2, 1.8, 1.6, 1, 3.8, 4, 2.2, 1.7, 1.5, 1.3, 1};                   //vestito non vede, vede e maggiore, 3 vestiti briscola
        double[] carichi = {0.8, 0.7, 0.6, 0.5, 0, 4, 3, 2, 1.8, 1.6, 1};                               //carico ><, 3 vestiti briscola
        double[] scartiniB = {4, 2.8, 2.6, 2.4, 1, 2.7, 2, 1.8, 1.6, 0};                                //3 vestiti e 3 vestiti briscola
        double[] vestitiB = {4, 3.4, 3.2, 3, 0, 3.3, 2, 2.5, 1};                                        //3 vestiti, vestibo b><
        double[] tre = {3.8, 3.4, 3.2, 3, 0.2, 3.1, 0.8, 0.6, 0.4, 0, 4};                               //tre vestiti, tre vestiti briscola, 3 e 1         
        
        if(!carteAndate.contains(carteCorrenti[3]))carteAndate.add(carteCorrenti[3]);
        if(!carteAndate.contains(carteCorrenti[4]))carteAndate.add(carteCorrenti[4]);
        if(!carteAndate.contains(carteCorrenti[5]))carteAndate.add(carteCorrenti[5]);
        
        if(difficile==true)
        {
            if(((briscola.charAt(0)=='1')||(briscola.charAt(0)=='3'))&&(cRimaste==2))
            {
                scartini[2]=0; scartini[3]=0; scartini[4]=0; scartini[9]=1.6; scartini[10]=1.7;
                vestiti[1]=1.7; vestiti[6]=2.2; vestiti[7]=1.7;
                carichi[0]=3.4; carichi[1]=3.5; carichi[2]=3.6; carichi[3]=3.7; carichi[6]=2.1;
            }
            
            for(int i=0;i<3;i++)
                if(carteCorrenti[i].charAt(1)==briscola.charAt(1)) nBriscola++;
            
            if(nBriscola==1)
            {
                scartini[11]=1.5;  
                vestiti[8]=1.5; vestiti[9]=1.4; vestiti[10]=1.3; vestiti[11]=1.2;
                scartiniB[5]=2.5; 
                vestitiB[5]=2.8;
            }
        }
        
        for(int i=3;i<6;i++)
            {
                if (carteCorrenti[i].equals("00")) imp[i]=-1;
                else{
                
                //-----------------Scartino------------------------------- 
                
                if(((avversario.charAt(0)=='2')||(avversario.charAt(0)=='4')||(avversario.charAt(0)=='5')||(avversario.charAt(0)=='6')||(avversario.charAt(0)=='7'))&&(seme!=briscola.charAt(1)))
                {                    
                    if((carteCorrenti[i].charAt(0)=='2')||(carteCorrenti[i].charAt(0)=='4')||(carteCorrenti[i].charAt(0)=='5')||(carteCorrenti[i].charAt(0)=='6')||(carteCorrenti[i].charAt(0)=='7'))
                    {
                        if((carteCorrenti[i].charAt(1)==seme)&&(carteCorrenti[i].charAt(0)>avversario.charAt(0)))
                        {imp[i]=scartini[1];}
                        else if (carteCorrenti[i].charAt(1)==briscola.charAt(1)){imp[i]=scartini[11];}
                        else {imp[i]=scartini[0];}                        
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='J')
                    {
                        if(carteCorrenti[i].charAt(1)==seme)
                        {
                            imp[i]=scartini[2];                            
                        }
                        else if (carteCorrenti[i].charAt(1)==briscola.charAt(1)){imp[i]=scartini[12];}
                        else {imp[i]=scartini[5];}
                    }
                                                                                               
                    else if(carteCorrenti[i].charAt(0)=='Q')
                    {
                        if(carteCorrenti[i].charAt(1)==seme)               
                        {
                            imp[i]=scartini[3];                            
                        }
                        else if (carteCorrenti[i].charAt(1)==briscola.charAt(1)){imp[i]=scartini[13];}
                        else {imp[i]=scartini[6];}
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='K')
                    {
                        if(carteCorrenti[i].charAt(1)==seme) 
                        {
                            imp[i]=scartini[4];
                        }
                        else if (carteCorrenti[i].charAt(1)==briscola.charAt(1)){imp[i]=scartini[14];}
                        else {imp[i]=scartini[7];}
                    }
                    
                    else if((carteCorrenti[i].charAt(0)=='1')||(carteCorrenti[i].charAt(0)=='3'))
                    {
                        if(carteCorrenti[i].charAt(1)==seme)
                        {if(carteCorrenti[i].charAt(0)=='3')imp[i]=scartini[9]; else imp[i]=scartini[10];}  
                        else if (carteCorrenti[i].charAt(1)==briscola.charAt(1)){imp[i]=scartini[15];}
                        else {imp[i]=scartini[8];} 
                    }              
                    else{imp[i]=-1;}
                }
                
                //-----------------Vestito-------------------------------                
                
                else if(((avversario.charAt(0)=='J')||(avversario.charAt(0)=='Q')||(avversario.charAt(0)=='K'))&&(seme!=briscola.charAt(1)))           
                {
                    if((carteCorrenti[i].charAt(0)=='2')||(carteCorrenti[i].charAt(0)=='4')||(carteCorrenti[i].charAt(0)=='5')||(carteCorrenti[i].charAt(0)=='6')||(carteCorrenti[i].charAt(0)=='7'))
                    {
                        if(carteCorrenti[i].charAt(1)!=briscola.charAt(1))
                        {imp[i]=vestiti[0];}
                        else {imp[i]=vestiti[8];}
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='J')
                    {
                        if(carteCorrenti[i].charAt(1)==briscola.charAt(1))imp[i]=vestiti[9]; //{2.5, 2.8, 1.8, 1.4, 1.2, 1, 3.8, 4, 2.4, 1.5, 1.3, 1.1, 1};
                        else imp[i]=vestiti[2];                                                    
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='Q')
                    {                                                                              
                        if(carteCorrenti[i].charAt(1)==seme)
                        {
                            if(avversario.charAt(0)=='J'){imp[i]=vestiti[1];}         
                            else{imp[i]=vestiti[3];}
                        }
                        else if (carteCorrenti[i].charAt(1)==briscola.charAt(1)){imp[i]=vestiti[10];}
                        else {imp[i]=vestiti[3];}
                    }
                    
                    else if(carteCorrenti[i].charAt(0)=='K')
                    {
                        if(carteCorrenti[i].charAt(1)==seme)
                        {
                            imp[i]=vestiti[1];
                        }
                        else if (carteCorrenti[i].charAt(1)==briscola.charAt(1)){imp[i]=vestiti[11];}
                        else {imp[i]=vestiti[4];}
                    }
                    
                    else if((carteCorrenti[i].charAt(0)=='1')||(carteCorrenti[i].charAt(0)=='3'))
                    {
                        if(carteCorrenti[i].charAt(1)==seme)
                        {if(carteCorrenti[i].charAt(0)=='3')imp[i]=vestiti[6]; else imp[i]=vestiti[7];}
                        else if (carteCorrenti[i].charAt(1)==briscola.charAt(1)){imp[i]=vestiti[12];}
                        else {imp[i]=vestiti[5];} 
                    }
                    else{imp[i]=-1;}
                }   
                
                //------------------------Carico-------------------------------
                
                else if(((avversario.charAt(0)=='3')||(avversario.charAt(0)=='1'))&&(seme!=briscola.charAt(1)))
                {
                    if((carteCorrenti[i].charAt(0)=='2')||(carteCorrenti[i].charAt(0)=='4')||(carteCorrenti[i].charAt(0)=='5')||(carteCorrenti[i].charAt(0)=='6')||(carteCorrenti[i].charAt(0)=='7'))
                    {
                        if(carteCorrenti[i].charAt(1)!=briscola.charAt(1))
                        {imp[i]=carichi[0];}
                        else {imp[i]=carichi[6];}
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='J')
                    {
                        if(carteCorrenti[i].charAt(1)!=briscola.charAt(1))
                        {
                            imp[i]=carichi[1];
                        }
                        else {imp[i]=carichi[7];}                        
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='Q')    //    {0.8, 0.7, 0.6, 0.5, 0, 4, 3, 2, 1.8, 1.6, 1};          
                    {
                        if(carteCorrenti[i].charAt(1)!=briscola.charAt(1))
                        {
                            imp[i]=carichi[2];
                        }
                        else {imp[i]=carichi[8];}                        
                    }
                    
                    else if(carteCorrenti[i].charAt(0)=='K')
                    {
                        if(carteCorrenti[i].charAt(1)!=briscola.charAt(1))
                        {
                            imp[i]=carichi[3];
                        }
                        else {imp[i]=carichi[9];}                        
                    }
                    
                    else if((carteCorrenti[i].charAt(0)=='1')||(carteCorrenti[i].charAt(0)=='3'))     
                    {
                        if(carteCorrenti[i].charAt(1)==briscola.charAt(1)) imp[i]=carichi[10];
                        else if ((carteCorrenti[i].charAt(0)==1)&&(carteCorrenti[i].charAt(1)==seme)) imp[i]=carichi[5];
                        else imp[i]=carichi[4];
                    }   
                    else{imp[i]=-1;}
                }
                
                //-------------------Briscola-Bassa-----------------------------------
                
                else if(((avversario.charAt(0)=='2')||(avversario.charAt(0)=='4')||(avversario.charAt(0)=='5')||(avversario.charAt(0)=='6')||(avversario.charAt(0)=='7'))&&(seme==briscola.charAt(1)))
                {
                    if((carteCorrenti[i].charAt(0)=='2')||(carteCorrenti[i].charAt(0)=='4')||(carteCorrenti[i].charAt(0)=='5')||(carteCorrenti[i].charAt(0)=='6')||(carteCorrenti[i].charAt(0)=='7'))
                    {                        
                        if (carteCorrenti[i].charAt(1)!=briscola.charAt(1)){imp[i]=scartiniB[0];}
                        else {imp[i]=scartiniB[5];}                        
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='J')
                    {
                        if (carteCorrenti[i].charAt(1)!=briscola.charAt(1)){imp[i]=scartiniB[1];}
                        else {imp[i]=scartiniB[6];}
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='Q')
                    {
                        if (carteCorrenti[i].charAt(1)!=briscola.charAt(1)){imp[i]=scartiniB[2];}
                        else {imp[i]=scartiniB[7];}
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='K')
                    {
                        if (carteCorrenti[i].charAt(1)!=briscola.charAt(1)){imp[i]=scartiniB[3];}
                        else {imp[i]=scartiniB[8];}
                    }
                    
                    else if((carteCorrenti[i].charAt(0)=='1')||(carteCorrenti[i].charAt(0)=='3'))
                    {
                        if (carteCorrenti[i].charAt(1)!=briscola.charAt(1)){imp[i]=scartiniB[4];}
                        else {imp[i]=scartiniB[9];}
                    }
                    else{imp[i]=-1;}
                }
                
                //------------------------Vestiti-Briscola--------------------------
                
                else if(((avversario.charAt(0)=='J')||(avversario.charAt(0)=='Q')||(avversario.charAt(0)=='K'))&&(seme==briscola.charAt(1)))
                {
                    if((carteCorrenti[i].charAt(0)=='2')||(carteCorrenti[i].charAt(0)=='4')||(carteCorrenti[i].charAt(0)=='5')||(carteCorrenti[i].charAt(0)=='6')||(carteCorrenti[i].charAt(0)=='7'))
                    {                        
                        if (carteCorrenti[i].charAt(1)!=briscola.charAt(1)){imp[i]=vestitiB[0];}
                        else {imp[i]=vestitiB[5];}                        
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='J')
                    {
                        if (carteCorrenti[i].charAt(1)!=briscola.charAt(1)){imp[i]=vestitiB[1];}             
                        else {imp[i]=vestitiB[6];}
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='Q')
                    {
                        if (carteCorrenti[i].charAt(1)!=briscola.charAt(1)){imp[i]=vestitiB[2];}
                        else if (avversario.charAt(0)=='J'){imp[i]=vestitiB[7];}
                        else{imp[i]=vestitiB[6];}
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='K')
                    {
                        if (carteCorrenti[i].charAt(1)!=briscola.charAt(1)){imp[i]=vestitiB[3];}              
                        else {imp[i]=vestitiB[7];}
                    }
                    
                    else if((carteCorrenti[i].charAt(0)=='1')||(carteCorrenti[i].charAt(0)=='3'))
                    {
                        if (carteCorrenti[i].charAt(1)!=briscola.charAt(1)){imp[i]=vestitiB[4];}
                        else {imp[i]=vestitiB[8];}
                    }
                    else{imp[i]=-1;}
                }
                
                //----------------------1-3-Briscola--------------------------------------
                
                else if(((avversario.charAt(0)=='3')||(avversario.charAt(0)=='1'))&&(seme==briscola.charAt(1)))
                {
                    if((carteCorrenti[i].charAt(0)=='2')||(carteCorrenti[i].charAt(0)=='4')||(carteCorrenti[i].charAt(0)=='5')||(carteCorrenti[i].charAt(0)=='6')||(carteCorrenti[i].charAt(0)=='7'))
                    {                        
                        if (carteCorrenti[i].charAt(1)!=briscola.charAt(1)){imp[i]=tre[0];}
                        else {imp[i]=tre[5];}                        
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='J')
                    {
                        if (carteCorrenti[i].charAt(1)!=briscola.charAt(1)){imp[i]=tre[1];}             
                        else {imp[i]=tre[6];}
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='Q')
                    {
                        if (carteCorrenti[i].charAt(1)!=briscola.charAt(1)){imp[i]=tre[2];}          
                        else {imp[i]=tre[7];}                        
                    }
                                        
                    else if(carteCorrenti[i].charAt(0)=='K')
                    {
                        if (carteCorrenti[i].charAt(1)!=briscola.charAt(1)){imp[i]=tre[3];}          
                        else {imp[i]=tre[8];}   
                    }
                    
                    else if(((carteCorrenti[i].charAt(0)=='3')||(carteCorrenti[i].charAt(0)=='1'))&&(carteCorrenti[i].charAt(1)!=briscola.charAt(1)))
                    {
                        imp[i]=tre[4];
                    }
                    
                    else if((carteCorrenti[i].charAt(0)=='3')&&(carteCorrenti[i].charAt(1)==briscola.charAt(1)))
                    {
                        imp[i]=tre[9];
                    }
                    
                    else if((carteCorrenti[i].charAt(0)=='1')&&(carteCorrenti[i].charAt(1)==briscola.charAt(1)))
                    {
                        imp[i]=tre[10];
                    }
                }                
            }}
               
        carteAndate.add(avversario);
        
        /*for(int i=3;i<6;i++)
            System.out.println(imp[i]);
        System.out.print("\n");*/
        
        if((imp[3]>=imp[4])&&(imp[3]>=imp[5])) {carteAndate.add(carteCorrenti[3]); return carteCorrenti[3];}
        if((imp[4]>=imp[3])&&(imp[4]>=imp[5])) {carteAndate.add(carteCorrenti[4]); return carteCorrenti[4];}
        if((imp[5]>=imp[4])&&(imp[5]>=imp[3])) {carteAndate.add(carteCorrenti[5]); return carteCorrenti[5];}
        
        return null;
    }
    
    public String scegliCarta1 (String carteCorrenti[], int cRimaste)
    {
        //scartini 4 segni SBDC, vestiti j>k, scartini b, vestiti b, 1/3
        double[] inizio={4,4,4,4,   4,4,4,4,   3.6,3.6,3.6,3.6,   3.5,3.5,3.5,3.5,   0, 0.1, 3.25, 2.4, 2.3, 2.2, 0.5};
        int nBriscola=0;
        
        if(difficile==true)
        {
            if((!carteAndate.contains("1S"))||(!carteAndate.contains("3S")))
            {
                inizio[0]=3.5;
                inizio[4]=3.4;
                inizio[8]=3.3;
                inizio[12]=3.2;     
                
                if((!carteAndate.contains("1S"))&&(!carteAndate.contains("3S")))
                {
                    inizio[0]=3.3;
                    inizio[4]=3.2;
                    inizio[8]=3.1;
                    inizio[12]=3;
                }
            }
            
            if((!carteAndate.contains("1B"))||(!carteAndate.contains("3B")))
            {
                inizio[1]=3.5;
                inizio[5]=3.4;
                inizio[9]=3.3;
                inizio[13]=3.2;
                
                if((!carteAndate.contains("1B"))&&(!carteAndate.contains("3B")))
                {
                    inizio[1]=3.3;
                    inizio[5]=3.2;
                    inizio[9]=3.1;
                    inizio[13]=3;
                }
            }
            
            if((!carteAndate.contains("1D"))||(!carteAndate.contains("3D")))
            {
                inizio[2]=3.5;
                inizio[6]=3.4;
                inizio[10]=3.3;
                inizio[14]=3.2;
                
                if((!carteAndate.contains("1D"))&&(!carteAndate.contains("3D")))
                {
                    inizio[2]=3.3;
                    inizio[6]=3.2;
                    inizio[10]=3.1;
                    inizio[14]=3;
                }
            }
            
            if((!carteAndate.contains("1C"))||(!carteAndate.contains("3C")))
            {
                inizio[3]=3.5;
                inizio[7]=3.4;
                inizio[11]=3.3;
                inizio[15]=3.2;
                
                if((!carteAndate.contains("1C"))&&(!carteAndate.contains("3C")))
                {
                    inizio[3]=3.3;
                    inizio[7]=3.2;
                    inizio[11]=3.1;
                    inizio[15]=3;
                }
            }
            
            if(((briscola.charAt(0)==1)||(briscola.charAt(0)==3))&&(cRimaste==2)) 
            {
                for(int j=0;j<4;j++)
                {
                    inizio[j]=3.7;
                }
                inizio[16]=3.8;
                inizio[17]=4;
            }
            
            for(int i=0;i<3;i++)           
                if(carteCorrenti[i].charAt(1)==briscola.charAt(1)) nBriscola++;
            
            if(nBriscola==1)
            {
                inizio[18]=3.15;
            }
        }
        
        int i=3;
        if(inizia==1) i=9; 
        else if(inizia==3) i=6;
        int k=i+3;
        
        for(i=i;i<k;i++)
        {    
            if (carteCorrenti[i].equals("00")) imp[i]=-1;
            else {
            if(carteCorrenti[i].charAt(1)=='S')
            {
                if((carteCorrenti[i].charAt(0)=='2')||(carteCorrenti[i].charAt(0)=='4')||(carteCorrenti[i].charAt(0)=='5')||(carteCorrenti[i].charAt(0)=='6')||(carteCorrenti[i].charAt(0)=='7'))
                {
                    imp[i]=inizio[0];
                    if(briscola.charAt(1)=='S') imp[i]=inizio[18];
                }
                
                else if(carteCorrenti[i].charAt(0)=='J')
                {
                    imp[i]=inizio[4];
                    if(briscola.charAt(1)=='S') imp[i]=inizio[19];    
                }                                                       
                    
                else if(carteCorrenti[i].charAt(0)=='Q')
                {
                    imp[i]=inizio[8];
                    if(briscola.charAt(1)=='S') imp[i]=inizio[20];
                }
                
                else if(carteCorrenti[i].charAt(0)=='K')
                {
                    imp[i]=inizio[12];
                    if(briscola.charAt(1)=='S') imp[i]=inizio[21];
                }
            }
                   
            if(carteCorrenti[i].charAt(1)=='B')
            {
                if((carteCorrenti[i].charAt(0)=='2')||(carteCorrenti[i].charAt(0)=='4')||(carteCorrenti[i].charAt(0)=='5')||(carteCorrenti[i].charAt(0)=='6')||(carteCorrenti[i].charAt(0)=='7'))
                {
                    imp[i]=inizio[1];
                    if(briscola.charAt(1)=='B') imp[i]=inizio[18];
                }
                
                else if(carteCorrenti[i].charAt(0)=='J')
                {
                    imp[i]=inizio[5];
                    if(briscola.charAt(1)=='B') imp[i]=inizio[19];
                }
                    
                else if(carteCorrenti[i].charAt(0)=='Q')
                {
                    imp[i]=inizio[9];
                    if(briscola.charAt(1)=='B') imp[i]=inizio[20];
                }
                
                else if(carteCorrenti[i].charAt(0)=='K')
                {
                    imp[i]=inizio[13];
                    if(briscola.charAt(1)=='B') imp[i]=inizio[21];
                }
            }
            
            if(carteCorrenti[i].charAt(1)=='D')
            {
                if((carteCorrenti[i].charAt(0)=='2')||(carteCorrenti[i].charAt(0)=='4')||(carteCorrenti[i].charAt(0)=='5')||(carteCorrenti[i].charAt(0)=='6')||(carteCorrenti[i].charAt(0)=='7'))
                {
                    imp[i]=inizio[2];
                    if(briscola.charAt(1)=='D') imp[i]=inizio[18];
                }
                
                else if(carteCorrenti[i].charAt(0)=='J')
                {
                    imp[i]=inizio[6];
                    if(briscola.charAt(1)=='D') imp[i]=inizio[19];
                }
                    
                else if(carteCorrenti[i].charAt(0)=='Q')
                {
                    imp[i]=inizio[10];
                    if(briscola.charAt(1)=='D') imp[i]=inizio[20];
                }
                
                else if(carteCorrenti[i].charAt(0)=='K')
                {
                    imp[i]=inizio[14];
                    if(briscola.charAt(1)=='D') imp[i]=inizio[21];
                }
            }
            
            if(carteCorrenti[i].charAt(1)=='C')
            {
                if((carteCorrenti[i].charAt(0)=='2')||(carteCorrenti[i].charAt(0)=='4')||(carteCorrenti[i].charAt(0)=='5')||(carteCorrenti[i].charAt(0)=='6')||(carteCorrenti[i].charAt(0)=='7'))
                {
                    imp[i]=inizio[3];
                    if(briscola.charAt(1)=='C') imp[i]=inizio[18];  
                }
                
                else if(carteCorrenti[i].charAt(0)=='J')
                {
                    imp[i]=inizio[7];
                    if(briscola.charAt(1)=='C') imp[i]=inizio[19];
                }
                    
                else if(carteCorrenti[i].charAt(0)=='Q')
                {
                    imp[i]=inizio[11];
                    if(briscola.charAt(1)=='C') imp[i]=inizio[20];
                }
                
                else if(carteCorrenti[i].charAt(0)=='K')
                {
                    imp[i]=inizio[15];
                    if(briscola.charAt(1)=='C') imp[i]=inizio[21];
                }
            }
            
            if((carteCorrenti[i].charAt(0)=='1')||(carteCorrenti[i].charAt(0)=='3'))
                {
                    if(carteCorrenti[i].charAt(0)=='1') imp[i]=inizio[17];
                    else imp[i]=inizio[16];
                    if(carteCorrenti[i].charAt(1)==briscola.charAt(1)) imp[i]=inizio[22];
                }
        }
        } 
        
        if((imp[k-3]>=imp[k-2])&&(imp[k-3]>=imp[k-1])) {carteAndate.add(carteCorrenti[k-3]); return carteCorrenti[k-3];} 
        if((imp[k-2]>=imp[k-3])&&(imp[k-2]>=imp[k-1])) {carteAndate.add(carteCorrenti[k-2]); return carteCorrenti[k-2];} 
        if((imp[k-1]>=imp[k-2])&&(imp[k-1]>=imp[k-3])) {carteAndate.add(carteCorrenti[k-1]); return carteCorrenti[k-1];} 
        
        return null;
    }  

public String scegliCarta22(String carteCorrenti[], int cRimaste)
    {
        int i=3;
        if(inizia==0) i=9;
        else if(inizia==2) i=6;
        int k=i+3;
        
        Set<String> carteCompagno=new HashSet<>();
        char seme=situazione[inizia].charAt(1);
        String avversario=situazione[inizia];
        
        double[] imp2=new double[12];
        double[] imp3=new double[12];
        
        if(inizia==0) carteCompagno.addAll(carteCompagno2);
        else if(inizia==2) carteCompagno.addAll(carteCompagno1);
        
        double[] caricare1={2, 2.2, 2.4, 2.6, 3.8, 4, 1.8, 1.6, 1.4, 1.2, 1};
        double[] passaC={3, 2.8, 3.2, 3.4, 3.6, 2.6, 2.4, 2.2, 0, 2.3, 1.6, 1.4, 1.2, 1};
        double[] passaC4={2, 1.8, 1.6, 1.4, 0, 0, 1.5, 1.3, 1.2, 1.1, 1}; //lascia
        double[] passaC2={2, 1.8, 1.6, 1.4, 0, 0, 2.4, 2.6, 2.8, 3, 1}; //cerca di prendere lui
        double[] passaC3={3, 3.2, 3.4, 3.6, 4, 4, 1.4, 1.6, 1.8, 2, 1}; //di sicuro prende compagno
        
        for(i=i;i<k;i++)
        {  
            imp3[i]=-1;
            if((seme!=briscola.charAt(1))&&(avversario.charAt(0)!='1')&&(avversario.charAt(0)!='3'))
            {
                if((carteCompagno.contains("Re"))||(carteCompagno.contains("Asso"))||(carteCompagno.contains("Tre"))&&(cRimaste>10))
                {
                    imp3[i]=assegnaImp(caricare1, carteCorrenti[i], seme);
                }
                    
                    //-----------------------------IMP2----------------------
                    
                if((carteCorrenti[i].charAt(0)=='2')||(carteCorrenti[i].charAt(0)=='4')||(carteCorrenti[i].charAt(0)=='5')||(carteCorrenti[i].charAt(0)=='6')||(carteCorrenti[i].charAt(0)=='7'))
                {
                    if (carteCorrenti[i].charAt(1)==briscola.charAt(1)) imp2[i]=passaC[9];
                    else if(vince(carteCorrenti[i], situazione[inizia])==true)
                        imp2[i]=passaC[1];
                    else imp2[i]=passaC[0];                       
                }                 
                else if(carteCorrenti[i].charAt(0)=='J')
                {
                    if (carteCorrenti[i].charAt(1)==briscola.charAt(1)) imp2[i]=passaC[10];
                    else if(vince(carteCorrenti[i], situazione[inizia])==true) imp2[i]=passaC[2]; 
                    else imp2[i]=passaC[5];
                }
                else if(carteCorrenti[i].charAt(0)=='Q')
                {
                    if (carteCorrenti[i].charAt(1)==briscola.charAt(1)) imp2[i]=passaC[11];
                    else if(vince(carteCorrenti[i], situazione[inizia])==true) imp2[i]=passaC[3]; 
                    else imp2[i]=passaC[6];
                }          
                else if(carteCorrenti[i].charAt(0)=='K')
                {
                    if (carteCorrenti[i].charAt(1)==briscola.charAt(1)) imp2[i]=passaC[12];
                    else if(vince(carteCorrenti[i], situazione[inizia])==true) imp2[i]=passaC[4]; 
                    else imp2[i]=passaC[7];
                }  
                else if((carteCorrenti[i].charAt(0)=='1')||(carteCorrenti[i].charAt(0)=='3'))
                {
                    if (carteCorrenti[i].charAt(1)==briscola.charAt(1)) imp2[i]=passaC[13];
                    else imp2[i]=passaC[8];
                }              
                else imp2[i]=-1;
            }
            else if(seme==briscola.charAt(1))
            {
                imp2[i]=assegnaImp(passaC4, carteCorrenti[i], seme);
                if((carteCorrenti[i].charAt(1)==seme)&&(carteCorrenti[i].charAt(0)=='1')&&(avversario.charAt(0)=='3')) imp2[i]=4;
            }
            else if((avversario.charAt(0)!='1')||avversario.charAt(0)!='3')
            {
                if((carteCompagno.contains("asso"))||(carteCompagno.contains("tre"))||(carteCompagno.contains("re"))) imp2[i]=assegnaImp(passaC3, carteCorrenti[i], seme);
                else imp2[i]=assegnaImp(passaC2, carteCorrenti[i], seme);
            }
            else imp2[i]=-1;
               
            if(imp3[i]>imp2[i]) imp[i]=imp3[i];
            else imp[i]=imp2[i];
        }
     
        if((imp[k-3]>=imp[k-2])&&(imp[k-3]>=imp[k-1])) {carteAndate.add(carteCorrenti[k-3]); return carteCorrenti[k-3];} 
        if((imp[k-2]>=imp[k-3])&&(imp[k-2]>=imp[k-1])) {carteAndate.add(carteCorrenti[k-2]); return carteCorrenti[k-2];} 
        if((imp[k-1]>=imp[k-2])&&(imp[k-1]>=imp[k-3])) {carteAndate.add(carteCorrenti[k-1]); return carteCorrenti[k-1];} 
        
        return null;
    }    
    
     public String scegliCarta3(String carteCorrenti[])
    {
        double[] Prende1={2, 2.2, 2.3, 2.4, 0, 0, 1.7, 1.6, 1.4, 1.2, 1};
        double[] Prende2={2, 1.8, 1.6, 1.4, 0, 0, 3, 3.2, 3.4, 3.6, 1};
        double[] Perde1={3, 2.8, 2.6, 2.4, 0.1, 0.1, 3.2, 3.4, 3.6, 3.2, 3.1};  
        double[] Perde11={2, 1.8, 1.6, 1.4, 0.1, 0.1, 1.5, 1.3, 1.1, 0.9, 0};//cerca di prendere
        double[] Perde2={3, 2.8, 2.7, 2.6, 0, 0, 1.8, 1.6, 1.4, 1.2, 1};  //lascia
        
        int i=3;
        if(inizia==1) i=6; 
        else if(inizia==3) i=9;
        int k=i+3;
        
        int secondo=1;
        if(inizia==1) secondo=2; 
        if(inizia==2) secondo=3; 
        if(inizia==3) secondo=0; 
        
        if(prende()==true)
        {
            if(contaPunti()>=10)
            {  
                for(int j=i;j<k;j++)
                {
                    if((situazione[inizia].charAt(0)=='1')&&(situazione[inizia].charAt(1)==briscola.charAt(1))){Prende2[4]=4; Prende2[5]=4;}
                    imp[j]=assegnaImp(Prende2, carteCorrenti[j], situazione[inizia].charAt(1));
                }  
            }
            else    
            {
                for(int j=i;j<k;j++)
                {
                    imp[j]=assegnaImp(Prende1, carteCorrenti[j], situazione[inizia].charAt(1));
                }
            }
        }    
        else 
        {
            if(contaPunti()>=10)
            {
                for(int j=i;j<k;j++)
                {
                    if(vince3(situazione[inizia], situazione[secondo], carteCorrenti[j])==true)
                        imp[j]=assegnaImp(Perde1, carteCorrenti[j], situazione[inizia].charAt(1));  
                    else imp[j]=assegnaImp(Perde11, carteCorrenti[j], situazione[inizia].charAt(1));  
                }
            }
            else 
            {
                for(int j=i;j<k;j++)
                {
                    imp[j]=assegnaImp(Perde2, carteCorrenti[j], situazione[inizia].charAt(1));
                }
            }    
        }
        
        if((imp[k-3]>=imp[k-2])&&(imp[k-3]>=imp[k-1])) {carteAndate.add(carteCorrenti[k-3]); return carteCorrenti[k-3];} 
        if((imp[k-2]>=imp[k-3])&&(imp[k-2]>=imp[k-1])) {carteAndate.add(carteCorrenti[k-2]); return carteCorrenti[k-2];} 
        if((imp[k-1]>=imp[k-2])&&(imp[k-1]>=imp[k-3])) {carteAndate.add(carteCorrenti[k-1]); return carteCorrenti[k-1];} 
        
        return null;
    }
    
    public String scegliCarta4(String carteCorrenti[])
    {
        double[] Prende={2, 2.2, 2.4, 2.6, 4, 4, 1.8, 1.6, 1.4, 1.2, 1};
        double[] Perde1={2, 3, 3.2, 3.4, 3.6, 1.8, 1.6, 1.2, 0, 4, 2.8, 2.6, 2.4, 2.2, 1.3, 1.1, 1, 0.9, 0.8};
        double[] Perde2={2, 1.8, 2.2, 2.4, 2.6, 1.6, 1.4, 1.2, 0, 4, 1.4, 1.2, 1, 0.8, 0.5};
        
        int j=0;
        String carta1=null, carta2=null, carta3=null;
        if(inizia==0) {j=6; carta1=situazione[0]; carta2=situazione[1]; carta3=situazione[2];}
        if(inizia==2) {j=9; carta1=situazione[2]; carta2=situazione[3]; carta3=situazione[0];}
        if(inizia==3) {j=3; carta1=situazione[3]; carta2=situazione[0]; carta3=situazione[1];}
        int k=j+3;
        
        if(prende()==true)
        {
            for(int i=j;i<k;i++)
            {
                imp[i]=assegnaImp(Prende, carteCorrenti[i], situazione[inizia].charAt(1));
            }
        }    
        else 
        {
            if(contaPunti()>=10)
            {
                for(int i=j;i<k;i++)
                {
                    if((carteCorrenti[i].charAt(0)=='2')||(carteCorrenti[i].charAt(0)=='4')||(carteCorrenti[i].charAt(0)=='5')||(carteCorrenti[i].charAt(0)=='6')||(carteCorrenti[i].charAt(0)=='7'))
                    {
                        if ((carteCorrenti[i].charAt(1)==briscola.charAt(1))&&(vince4(carta1, carta2, carta3, carteCorrenti[i])==true)) imp[i]=Perde1[10];
                        else if ((carteCorrenti[i].charAt(1)==briscola.charAt(1))&&(vince4(carta1, carta2, carta3, carteCorrenti[i])==false)) imp[i]=Perde1[14];
                        else if(vince4(carta1, carta2, carta3, carteCorrenti[i])==true) imp[i]=Perde1[1];
                        else imp[i]=Perde1[0];                       
                    }                 
                    else if(carteCorrenti[i].charAt(0)=='J')
                    {
                        if ((carteCorrenti[i].charAt(1)==briscola.charAt(1))&&(vince4(carta1, carta2, carta3, carteCorrenti[i])==true)) imp[i]=Perde1[11];
                        else if ((carteCorrenti[i].charAt(1)==briscola.charAt(1))&&(vince4(carta1, carta2, carta3, carteCorrenti[i])==false)) imp[i]=Perde1[15];
                        else if(vince4(carta1, carta2, carta3, carteCorrenti[i])==true) imp[i]=Perde1[2]; 
                        else imp[i]=Perde1[5];              
                    }
                    else if(carteCorrenti[i].charAt(0)=='Q')
                    {
                        if ((carteCorrenti[i].charAt(1)==briscola.charAt(1))&&(vince4(carta1, carta2, carta3, carteCorrenti[i])==true)) imp[i]=Perde1[12];
                        else if ((carteCorrenti[i].charAt(1)==briscola.charAt(1))&&(vince4(carta1, carta2, carta3, carteCorrenti[i])==false)) imp[i]=Perde1[16];
                        else if(vince4(carta1, carta2, carta3, carteCorrenti[i])==true) imp[i]=Perde1[3]; 
                        else imp[i]=Perde1[6];
                    }           
                    else if(carteCorrenti[i].charAt(0)=='K')
                    {
                        if ((carteCorrenti[i].charAt(1)==briscola.charAt(1))&&(vince4(carta1, carta2, carta3, carteCorrenti[i])==true)) imp[i]=Perde1[13];
                        else if ((carteCorrenti[i].charAt(1)==briscola.charAt(1))&&(vince4(carta1, carta2, carta3, carteCorrenti[i])==false)) imp[i]=Perde1[17];
                        else if(vince4(carta1, carta2, carta3, carteCorrenti[i])==true) imp[i]=Perde1[4]; 
                        else imp[i]=Perde1[7];
                    } 
                    else if((carteCorrenti[i].charAt(0)=='1')||(carteCorrenti[i].charAt(0)=='3'))
                    {
                        if ((carteCorrenti[i].charAt(1)==briscola.charAt(1))&&(vince4(carta1, carta2, carta3, carteCorrenti[i])==true))  imp[i]=Perde1[19];
                        else if ((carteCorrenti[i].charAt(1)==briscola.charAt(1))&&(vince4(carta1, carta2, carta3, carteCorrenti[i])==false)) imp[i]=Perde1[18];
                        else if(vince4(carta1, carta2, carta3, carteCorrenti[i])==true) imp[i]=Perde1[9]; 
                        else imp[i]=Perde1[8];
                    }              
                    else imp[i]=-1;
                }
            }
            else 
            {
                for(int i=j;i<k;i++)
                {           
                    if((carteCorrenti[i].charAt(0)=='2')||(carteCorrenti[i].charAt(0)=='4')||(carteCorrenti[i].charAt(0)=='5')||(carteCorrenti[i].charAt(0)=='6')||(carteCorrenti[i].charAt(0)=='7'))
                    {
                        if (carteCorrenti[i].charAt(1)==briscola.charAt(1)) imp[i]=Perde2[10];
                        else if(vince4(carta1, carta2, carta3, carteCorrenti[i])==true) imp[i]=Perde2[1];
                        else imp[i]=Perde2[0];                       
                    }                 
                    else if(carteCorrenti[i].charAt(0)=='J')
                    {
                        if (carteCorrenti[i].charAt(1)==briscola.charAt(1)) imp[i]=Perde2[11];
                        else if(vince4(carta1, carta2, carta3, carteCorrenti[i])==true) imp[i]=Perde2[2]; 
                        else imp[i]=Perde2[5];
                    }
                    else if(carteCorrenti[i].charAt(0)=='Q')
                    {
                        if (carteCorrenti[i].charAt(1)==briscola.charAt(1)) imp[i]=Perde2[12];
                        else if(vince4(carta1, carta2, carta3, carteCorrenti[i])==true) imp[i]=Perde2[3]; 
                        else imp[i]=Perde2[6];
                    }           
                    else if(carteCorrenti[i].charAt(0)=='K')
                    {
                        if (carteCorrenti[i].charAt(1)==briscola.charAt(1)) imp[i]=Perde2[13];
                        else if(vince4(carta1, carta2, carta3, carteCorrenti[i])==true) imp[i]=Perde2[4]; 
                        else imp[i]=Perde2[7];
                    } 
                    else if((carteCorrenti[i].charAt(0)=='1')||(carteCorrenti[i].charAt(0)=='3'))
                    {
                        if (carteCorrenti[i].charAt(1)==briscola.charAt(1)) imp[i]=Perde2[14];
                        else if(vince4(carta1, carta2, carta3, carteCorrenti[i])==true) imp[i]=Perde2[9]; 
                        else imp[i]=Perde2[8];
                    }              
                    else imp[i]=-1;
                }
            }
        }
        
        int p=3;
        if(inizia==2) p=9; 
        else if(inizia==0) p=6;
        
        for(int l=p;l<k;l++)
            System.out.println(imp[l]);
        System.out.print("\n");
        
        
        if((imp[k-3]>=imp[k-2])&&(imp[k-3]>=imp[k-1])) {carteAndate.add(carteCorrenti[k-3]); return carteCorrenti[k-3];} 
        if((imp[k-2]>=imp[k-3])&&(imp[k-2]>=imp[k-1])) {carteAndate.add(carteCorrenti[k-2]); return carteCorrenti[k-2];} 
        if((imp[k-1]>=imp[k-2])&&(imp[k-1]>=imp[k-3])) {carteAndate.add(carteCorrenti[k-1]); return carteCorrenti[k-1];} 
        
        return null;
    }
    
    public double assegnaImp(double[] importanza, String cartaCorrente, char seme)
    {
        if((cartaCorrente.charAt(0)=='2')||(cartaCorrente.charAt(0)=='4')||(cartaCorrente.charAt(0)=='5')||(cartaCorrente.charAt(0)=='6')||(cartaCorrente.charAt(0)=='7'))
        {
            if (cartaCorrente.charAt(1)==briscola.charAt(1)) return importanza[6]; 
            else return importanza[0];
        }
        else if(cartaCorrente.charAt(0)=='J')
        {
            if (cartaCorrente.charAt(1)==briscola.charAt(1)) return importanza[7]; 
            else return importanza[1];
        }
        else if(cartaCorrente.charAt(0)=='Q')
        {
            if (cartaCorrente.charAt(1)==briscola.charAt(1)) return importanza[8]; 
            else return importanza[2];
        }
        else if(cartaCorrente.charAt(0)=='K')
        {
            if (cartaCorrente.charAt(1)==briscola.charAt(1)) return importanza[9]; 
            else return importanza[3];
        }
        else if((cartaCorrente.charAt(0)=='1')||(cartaCorrente.charAt(0)=='3'))
        {
           if (cartaCorrente.charAt(1)==briscola.charAt(1)) return importanza[10]; 
           else if(cartaCorrente.charAt(1)==seme) return importanza[5];
           else return importanza[4];
        }
        else return -1;
    }
   
    private int cercaIndice(char Carta)
    {         
        char Ordine[]={'2','4','5','6','7','J','Q','K','3','1'};
        
        for(int i=0;i<10;i++)
            if(Ordine[i]==Carta) return i;
        return 0;
    }
    
    private boolean prende()    //vuole sapere chi ha iniziato, in base alla situazione sa chi gli ha chiesto e gli dice se la sua squadra sta prendendo
    {
        if(inizia==0)    
        {
            if(situazione[2]==null) return !vince(situazione[1], situazione[0]);
            else return !vince3(situazione[0], situazione[1], situazione[2]);
        }
        if(inizia==1)    
        {
            if(situazione[3]==null) return !vince(situazione[2], situazione[1]);
        }
        if(inizia==2)    
        {
            if(situazione[1]==null) return !vince3(situazione[2], situazione[3], situazione[0]);
        }
        if(inizia==3)    
        {
            if(situazione[1]==null) return !vince(situazione[0], situazione[3]);
            else return !vince3(situazione[3], situazione[0], situazione[1]);
        }
        return false;
    }
    
     public boolean vince (String cartaCorrente, String avversario)       // È MAGGIORE UGUALE A 2 SE CARTA CORRENTE VINCE SU AVVERSARIO
    {
        char seme=avversario.charAt(1);
        
        if(seme!=briscola.charAt(1))
        {
            if(cartaCorrente.charAt(1)==briscola.charAt(1)) return true;
            else return ((cartaCorrente.charAt(1)==seme)&&(cercaIndice(cartaCorrente.charAt(0))>cercaIndice(avversario.charAt(0))));
        }
        else return ((cercaIndice(cartaCorrente.charAt(0))>cercaIndice(avversario.charAt(0)))&&(cartaCorrente.charAt(1)==briscola.charAt(1)));
    }
    
    private boolean vince3(String carta, String carta1, String carta2)
    {
        char seme=situazione[inizia].charAt(1);
        char semeBriscola=briscola.charAt(1);
        int vince=-1;
        int primo=0, secondo=1, terzo=2;
        if(inizia==2) {primo=2; secondo=3; terzo=0;}
        if(inizia==3) {primo=3; secondo=0; terzo=1;}
        
        String[] carte=new String[4];
        carte[primo]=carta;
        carte[secondo]=carta1;
        carte[terzo]=carta2;
        
        int[] indici=new int[4];
        indici[primo]=cercaIndice(carte[primo].charAt(0));
        indici[secondo]=cercaIndice(carte[secondo].charAt(0));
        indici[terzo]=cercaIndice(carte[terzo].charAt(0));
        
        int maggioreBriscola=-1;
        if((carte[primo].charAt(1)==semeBriscola)&&(indici[primo]>maggioreBriscola)){maggioreBriscola=indici[primo];  vince=primo;}
        if((carte[secondo].charAt(1)==semeBriscola)&&(indici[secondo]>maggioreBriscola)){maggioreBriscola=indici[secondo]; vince=secondo;} 
        if((carte[terzo].charAt(1)==semeBriscola)&&(indici[terzo]>maggioreBriscola)){maggioreBriscola=indici[terzo]; vince=terzo;}   
        
        if(maggioreBriscola!=-1)
        {
            if((vince==primo)||(vince==terzo)) return true;
            if(vince==secondo) return false; 
        }
        
        int maggioreSeme=-1;
        if((carte[primo].charAt(1)==seme)&&(indici[primo]>maggioreSeme)){maggioreSeme=indici[primo]; vince=primo;}
        if((carte[secondo].charAt(1)==seme)&&(indici[secondo]>maggioreSeme)){maggioreSeme=indici[secondo]; vince=secondo;}
        if((carte[terzo].charAt(1)==seme)&&(indici[terzo]>maggioreSeme))vince=terzo;
        
        if((vince==primo)||(vince==terzo)) return true;
        if(vince==secondo) return false;
        
        return true;
    }
    
    private boolean vince4(String carta, String carta1, String carta2, String carta3)
    {   
        char seme=situazione[inizia].charAt(1);
        char semeBriscola=briscola.charAt(1);
        int vince=-1;
        int primo=0, secondo=1, terzo=2, quarto=3;
        if(inizia==2) {primo=2; secondo=3; terzo=0; quarto=1;}
        if(inizia==3) {primo=3; secondo=0; terzo=1; quarto=2;}
        
        String[] carte=new String[4];
        carte[primo]=carta;
        carte[secondo]=carta1;
        carte[terzo]=carta2;
        carte[quarto]=carta3;
        
        int[] indici=new int[4];
        indici[primo]=cercaIndice(carte[primo].charAt(0));
        indici[secondo]=cercaIndice(carte[secondo].charAt(0));
        indici[terzo]=cercaIndice(carte[terzo].charAt(0));
        indici[quarto]=cercaIndice(carte[quarto].charAt(0));
        
        int maggioreBriscola=-1;
        if((carte[primo].charAt(1)==semeBriscola)&&(indici[primo]>maggioreBriscola)){maggioreBriscola=indici[primo]; vince=primo;}
        if((carte[secondo].charAt(1)==semeBriscola)&&(indici[secondo]>maggioreBriscola)){maggioreBriscola=indici[secondo]; vince=secondo;}
        if((carte[terzo].charAt(1)==semeBriscola)&&(indici[terzo]>maggioreBriscola)){maggioreBriscola=indici[terzo]; vince=terzo;}   
        if((carte[quarto].charAt(1)==semeBriscola)&&(indici[quarto]>maggioreBriscola)) {maggioreBriscola=indici[quarto]; vince=terzo;}  
        
        if(maggioreBriscola!=-1)
        {
            if((vince==primo)||(vince==terzo)) return false;
            if((vince==secondo)||(vince==quarto)) return true;
        }
        
        System.out.println("non ha preso una briscola");
        
        int maggioreSeme=-1;
        if((carte[primo].charAt(1)==seme)&&(indici[primo]>maggioreSeme)){maggioreSeme=indici[primo];  vince=primo;}
        if((carte[secondo].charAt(1)==seme)&&(indici[secondo]>maggioreSeme)){maggioreSeme=indici[secondo];  vince=secondo;}
        if((carte[terzo].charAt(1)==seme)&&(indici[terzo]>maggioreSeme)){maggioreSeme=indici[terzo];  vince=terzo;} 
        if((carte[quarto].charAt(1)==seme)&&(indici[quarto]>maggioreSeme)) vince=quarto;
        
        if((vince==primo)||(vince==terzo)) return false;
        if((vince==secondo)||(vince==quarto)) return true;
        
        System.out.println("qualquadra non cosa");
        
        return true;
    }
    
    private int contaPunti()
    {
        char c0=0, c1=0, c2=0;
        
        if(inizia==0) { c0=situazione[0].charAt(0); c1=situazione[1].charAt(0); }
        if(inizia==1) { c0=situazione[1].charAt(0); c1=situazione[2].charAt(0); }
        if(inizia==2) { c0=situazione[2].charAt(0); c1=situazione[3].charAt(0); }
        if(inizia==3) { c0=situazione[3].charAt(0); c1=situazione[0].charAt(0); }
        
        int p;        
        if(c0=='1')p=11;
        else if(c0=='3')p=10;
        else if(c0=='K')p=4;
        else if(c0=='Q')p=3;
        else if(c0=='J')p=2;
        else p=0;
        
        if(c1=='1')p+=11;
        else if(c1=='3')p+=10;
        else if(c1=='K')p+=4;
        else if(c1=='Q')p+=3;
        else if(c1=='J')p+=2;
        else p+=0;
        
        if(((inizia==0)&&(situazione[2]!=null))||((inizia==1)&&(situazione[3]!=null))||((inizia==2)&&(situazione[0]!=null))||((inizia==3)&&(situazione[1]!=null)))
        {    
            if(inizia==0) c2=situazione[2].charAt(0); 
            if(inizia==1) c2=situazione[3].charAt(0); 
            if(inizia==2) c2=situazione[0].charAt(0); 
            if(inizia==3) c2=situazione[1].charAt(0); 
            
            if(c2=='1')p+=11;
            else if(c2=='3')p+=10;
            else if(c2=='K')p+=4;
            else if(c2=='Q')p+=3;
            else if(c2=='J')p+=2;
            else p+=0;
        } 
        return p;
    }
}