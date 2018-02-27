
package a;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class register extends JFrame implements ActionListener{
    
     private final JButton buton1=new JButton("Kaydet");
     private final JLabel metin1=new JLabel("İsim");
     private final JLabel metin2=new JLabel("Soyisim");
     private final JLabel metin3=new JLabel("Yaş");
     private final JLabel metin4=new JLabel("Telefon");
     private final JLabel metin5=new JLabel("Email");
     private final JTextField textalani1=new JTextField();
     private final JTextField textalani2=new JTextField();
     private final JTextField textalani3=new JTextField();
     private final JTextField textalani4=new JTextField();
     private final JTextField textalani5=new JTextField();
    
     private String msj1=null,msj2=null,msj3=null,msj4=null,msj5=null;    
     private int kontrol1=0,kontrol2=0,kontrol3=0,kontrol4=0,kontrol5=0;    // Eğer textalanları hata içermiyorsa(doğruysa)  1 döndersin.
     private int y;
     private int t;
    
     private final  Container con;
     static boolean durum=false;
    //yapıcı
    
     
     
     
    public register()
    {
       
        
        setTitle("KAYIT");
        setSize(425,450);
        setLayout(null);
        setAlwaysOnTop(true);
        //setBackground(Color.red);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        con=getContentPane();
    
        
        //metin1
        metin1.setBounds(25,25,100,25);
        metin1.setBorder(BorderFactory.createLineBorder(Color.red));
        con.add(metin1);
      
        //metin2
        metin2.setBounds(25,95,100,25);
        metin2.setBorder(BorderFactory.createLineBorder(Color.red));
        con.add(metin2);
        
        //metin3
        metin3.setBounds(25,165,100,25);
        metin3.setBorder(BorderFactory.createLineBorder(Color.red));
        con.add(metin3);
        
        //metin4
        metin4.setBounds(25,235,100,25);
        metin4.setBorder(BorderFactory.createLineBorder(Color.red));
        con.add(metin4);
        
        //metin5
        metin5.setBounds(25,305,100,25);
        metin5.setBorder(BorderFactory.createLineBorder(Color.red));
        con.add(metin5);
        
        //textalani1
        textalani1.setBounds(25,60,375,25);
        con.add(textalani1);
        
        //textalani2
        textalani2.setBounds(25,130,375,25);
        con.add(textalani2);
        
        //textalani3        
        textalani3.setBounds(25,200,375,25);
        con.add(textalani3);
        //textalani4    
        
        textalani4.setBounds(25,270,375,25);
        con.add(textalani4);
       
        //textalani5
        textalani5.setBounds(25,340,375,25);
        con.add(textalani5);
        
        //JButton
        buton1.setBounds(125, 375, 175, 25);
        con.add(buton1);
        
        
        //buton1 listener
        buton1.addActionListener(this);
        buton1.setActionCommand("x");
        
        
    }
    
     static boolean eMail(String msj) //E-Mail Kontrolu
    {
        durum=false;
        
        String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
        durum=msj.matches(emailregex);
       
        return durum;
        
    }
    
    
    @Override
    
    public void actionPerformed(ActionEvent a)
    {
        if(buton1.getActionCommand().equals("x"))
        {   
            //textalani1
            
            if(!textalani1.getText().isEmpty())
            {
             msj1=textalani1.getText();
            char [] msjd=new char[msj1.length()];
            
            
                 for(int i=0;i<msj1.length();i++)
                 {
                  msjd[i]=msj1.charAt(i);
                   
                  if(Character.isAlphabetic(msjd[i]) || Character.isWhitespace(msjd[i]) )                   
                     {  
                        kontrol1=1;
                          if(msj1.length()>=32)
                           { 
                           JOptionPane.showMessageDialog(null,"AD KISMINDA 32 HARFTEN FAZLA GİRDİNİZ!","HATA",JOptionPane.ERROR_MESSAGE); 
                            kontrol1=0;
                            break;
                             
                           }
                   
                                
                     }
                
                  else
                     {
                     JOptionPane.showMessageDialog(null,"AD KISMINDA SAYISAL VEYA SEMBOLİK VERİ GİRDİNİZ.\nLÜTFEN HARF HARİCİNDE BİR DEĞER GİRMEYİNİZ!","HATA",JOptionPane.ERROR_MESSAGE); 
                     kontrol1=0;
                     break;
                      
                     }
                    
                }
           
               
            }
            else
            {
                JOptionPane.showMessageDialog(null,"AD KISMINI GIRMEDINIZ!","HATA",JOptionPane.ERROR_MESSAGE); 
                kontrol1=0;
                
            }
            
                 //textalani2 
            
            if(!textalani2.getText().isEmpty())
            {
             msj2=textalani2.getText();
            char [] msjd=new char[msj2.length()];
            
            
                 for(int i=0;i<msj2.length();i++)
                 {
                  msjd[i]=msj2.charAt(i);
                   
                  if(Character.isAlphabetic(msjd[i]))                   
                     {  
                        kontrol2=1;
                        if(msj2.length()>=32)
                           { 
                           JOptionPane.showMessageDialog(null,"SOYADI KISMINDA 32 HARFTEN FAZLA KARAKTER GIRDINIZ!","HATA",JOptionPane.ERROR_MESSAGE); 
                            kontrol1=0;
                            break;
                             
                           }
                        
                                
                     }
                  else
                     {
                     JOptionPane.showMessageDialog(null,"SOYADI KISMINDA SAYISAL VEYA SEMBOLIK VERI GIRDINIZ!","HATA",JOptionPane.ERROR_MESSAGE);
                     kontrol2=0;
                     break;
                      
                     }
                    
                }
              
                 
                
            }
          else
             {
                    JOptionPane.showMessageDialog(null,"SOYADI GIRMEDINIZ!","HATA",JOptionPane.ERROR_MESSAGE); 
                    kontrol2=0;
                    
             }
            
            //textalani3
            
            if(!textalani3.getText().isEmpty())
            {
             msj3=textalani3.getText();
         
                 
              try
              
              {
                  y=Integer.parseInt(msj3);
                 
                  if(msj3.length()<=3 && y>0 && y<128)
                  {   
                      kontrol3=1;
                      
                  }
                  else{
                      
                      JOptionPane.showMessageDialog(null,"YAS KISMINA 0-127 ARASI DEGER GIRINIZ!","HATA",JOptionPane.ERROR_MESSAGE);
                      kontrol3=0;
                  }
              }
            
              catch(NumberFormatException ka)
              
              {  
                  JOptionPane.showMessageDialog(null,"YAS KISMINA STRING VEYA ÇOK YUKSEK SAYISAL VERI GIRDINIZ!","HATA",JOptionPane.ERROR_MESSAGE);
                  kontrol3=0;
                       
              }  
          
             
            }
          else
             {
                JOptionPane.showMessageDialog(null,"YAS GIRMEDINIZ!","HATA",JOptionPane.ERROR_MESSAGE); 
                kontrol3=0;
                    
             }
            
            //textalani4
           
            if(!textalani4.getText().isEmpty())
            {
             msj4=textalani4.getText();
         
                 
              try
              
              {
                 
                 t=Integer.parseInt(msj4);
                  
                 if(msj4.length()==7)
                  {   
                      kontrol4=1;
                      
                  }
                  else
                  {
                      
                      JOptionPane.showMessageDialog(null,"TELEFON KISMINA LUTFEN 7 KARAKTER GIRINIZ!","HATA",JOptionPane.ERROR_MESSAGE);
                      kontrol4=0;
                      
                  }
              }
            
              catch(NumberFormatException ka)
              
              {  
                  JOptionPane.showMessageDialog(null,"TELEFON KISMINA STRING VERI GIRDINIZ!","HATA",JOptionPane.ERROR_MESSAGE);
                  kontrol4=0;
                  
                  
              }  
          
             
                
            }
          else
            {
                JOptionPane.showMessageDialog(null,"TELEFON GIRMEDINIZ!","HATA",JOptionPane.ERROR_MESSAGE); 
                kontrol4=0;
                    
            }
            
            //textalani5
            
            
            
            if(!textalani5.getText().isEmpty())
            {
             msj5=textalani5.getText();
               if(eMail(msj5)==true){
                   
                   
                   kontrol5=1;
                   
               }
               else{
                   
                   
                  JOptionPane.showMessageDialog(null, "EMAILINIZ HATALI!","HATA",JOptionPane.ERROR_MESSAGE);
                   kontrol5=0;
                   
                   
               }
                if(msj5.length()<=32)
                  {   
                      kontrol5=1;
                      
                  }
                  else
                  {
                      
                      JOptionPane.showMessageDialog(null,"EMAIL KISMINA LUTFEN 32 KARAKTERTER AZ DEGER GIRINIZ!","HATA",JOptionPane.ERROR_MESSAGE);
                      kontrol5=0;
                      
                  }
                
            }
          else
             {
                    JOptionPane.showMessageDialog(null,"E-MAIL GIRMEDINIZ!","HATA",JOptionPane.ERROR_MESSAGE); 
                    kontrol5=0;
                    
             }
            
            
          if(kontrol1==1 && kontrol2==1 && kontrol3==1 && kontrol4==1 && kontrol5==1)
          {
              SQL baglan=new SQL();
              baglan.baglanti(msj1,msj2,y,t,msj5);
              
              JOptionPane.showMessageDialog(null,"BASARIYLA KAYDEDILDI","SONUC",JOptionPane.INFORMATION_MESSAGE);
            
             sifirla();
              
             
}
          else
          {
              
            JOptionPane.showMessageDialog(null, "KAYDEDILEMEDI", "HATA", JOptionPane.ERROR_MESSAGE);
            
          }
         
          
        }
        
        
    }
    
    
    public void sifirla()
    {
    
              textalani1.setText("");
              textalani2.setText("");
              textalani3.setText("");
              textalani4.setText("");
              textalani5.setText("");
    
    }
   
    public static void main(String [] arg)
    {
      
        register y=new register();
        
        
        
    }        
    

}

