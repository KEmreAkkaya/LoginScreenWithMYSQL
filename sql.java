package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class sql {
    
    private final String kadi="root";
    private final String sifre="1234";
    //register javadaki her bir TextField alanindaki veriyi alip ,veritabaninda işliyor.
    public void baglanti(String m1,String m2,int m3,int m4,String m5)
    {
        
            try

            {   
                 //Driver sinifinin yüklenmesi (Connector.jar dosyasinin içinde)
                Class.forName("com.mysql.jdbc.Driver");
                 //veritabani ile baglanti
                try (Connection baglanti = DriverManager.getConnection("jdbc:mysql://localhost:3306/veritabani?useSSL=false",kadi,sifre)) {
                  
                     
                    //Veritabani güncelleme
                    final String sorgu="INSERT INTO tablo (ad,soyad,yas,telefon,email) VALUES (?,?,?,?,?);
                    PreparedStatement p1=baglanti.prepareStatement(sorgu);
                    p1.setString(1, m1);
                    p1.setString(2, m2);
                    p1.setInt(3,m3);
                    p1.setInt(4,m4);
                    p1.setString(5, m5);
                    
                    int sonuc2=p1.executeUpdate();
                    
                    if(sonuc2==1)
                    {System.out.println("Veritabani Guncellendi\n\n");
                    }
                    else
                    {
                        
                       System.out.println("Guncelleme Hatasi\n\n");
                       
                    }
                     
                    
                //Veritabaninin gösterme
                  Statement baglantidurum=baglanti.createStatement();
                   
                  final String sorgu2="SELECT * FROM tablo";
                  
                  ResultSet sonuc=baglantidurum.executeQuery(sorgu2);
                   
                    while(sonuc.next())
                    {
                        
                        System.out.println("Ad="+sonuc.getString("ad")+"  \nSoyad="+sonuc.getString("soyad") +"\nYas="+sonuc.getString("yas")+"\nTelefon="+sonuc.getString("telefon")+"\nEmail="+sonuc.getString("email")+"\n----------------------------------------------------");

                    }
                    
                   
                    baglanti.close();
                    
                }
                
            }
            catch(ClassNotFoundException|SQLException e)
            {

                e.printStackTrace();
            }
    }
}
