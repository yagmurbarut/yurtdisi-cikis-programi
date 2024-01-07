public class main {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("------------------------------");
        System.out.println("Elazig Havaalanina Hosgeldiniz");
        System.out.println("------------------------------");
        
        String sartlar= "yurtdisina cikis kurallari...\n"
                +"herhangi bir siyasi yasaginizin bulunmamasi gerekiyor \n"
                +"harc bedelinin yatirilmis olmasi gerekiyor \n"
                +"gideceginiz ulkeye vizenizin buulunmasi gerekiyor \n";
        
        String message= "yurtdisi sartlarindan hepsini saglamaniz gerekiyor!";
               
        while(true){
            System.out.println("------------------------------");
             System.out.println(sartlar);
            System.out.println("------------------------------");  
           

            yolcu yolcu=new yolcu();
            
            System.out.println("harc bedeli kontrol ediliyor...");
            Thread.sleep(3000);
            
            if(yolcu.harckontrol()==false){
                System.out.println(message);
                continue;
                
            }
            System.out.println("vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            
            if(yolcu.vizekontrol()==false){
                System.out.println(message);
                continue;
            }
            System.out.println("siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            
            if(yolcu.siyasiyasakkontrol()==true){
                System.out.println(message);
                continue;
            }
            System.out.println("islemleriniz tamamlandi yurt disina cikabilirsiniz!");
            break;
        }
        
    }
}
