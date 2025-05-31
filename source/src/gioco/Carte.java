package gioco;

import java.util.*;

/**
 *
 * @author NICOLA
 */
public class Carte {
    
    Random random = new Random();
    
    String[] Spade={"2S","4S","5S","6S","7S","JS","QS","KS","3S","1S"};
    String[] Bastoni={"2B","4B","5B","6B","7B","JB","QB","KB","3B","1B"};
    String[] Denari={"2D","4D","5D","6D","7D","JD","QD","KD","3D","1D"};
    String[] Coppe={"2C","4C","5C","6C","7C","JC","QC","KC","3C","1C"};
        
    public Carte() {}
    
    public String creaMazzo()
    {
        String[][] mazzo = new String[40][4];        
                
        for(int i=0;i<10;i++)
        {         
            mazzo[i][0]=Spade[i];
            mazzo[i][1]=Bastoni[i];
            mazzo[i][2]=Denari[i];
            mazzo[i][3]=Coppe[i];
        }
         
        Set<Integer> mazzoRandom = new LinkedHashSet<>();
        while (mazzoRandom.size() < 40)
        {
            Integer next = random.nextInt(40);
            mazzoRandom.add(next);
        }
        
        String n=mazzoRandom.toString();
        return n;
    }
    
    public String[] corrispondenzaNomi (String[] n1)
    {
        String[] n2=new String[40];
        for(int i=0;i<40;i++)
        {   
            int n=Integer.valueOf(n1[i]);
            String nome;
            if(n<10){nome=Spade[n];}
            else if((n>=10)&&(n<20)){nome=Bastoni[n-10];}
            else if((n>=20)&&(n<30)){nome=Denari[n-20];}
            else{nome=Coppe[n-30];}
            n2[i]=nome;
        }        
        return n2;
    }  
}