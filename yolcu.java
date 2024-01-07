public class yolcu implements Yurtdisikurallar {
    
    private int harc;
    private boolean vize;
    private boolean siyasiyasak;
    
    public yolcu(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("yatirdiginiz harc bedeli: ");
        this.harc= scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("herhangi bir siyasi yasaginiz bulunuyor mu?(evet-hayir)");
        String cevap= scanner.nextLine();
        
        if(cevap.equals("evet")){
            this.siyasiyasak=true;
        }
        else{
            this.siyasiyasak=false;
        }
        System.out.println("vizeniz bulunuyor mu? (evet-hayir)");
        String cevap2= scanner.nextLine();
        
        if(cevap2.equals("evet")){
            this.vize=true;
        }
        else{
            this.vize=false;
        }
    }

    @Override
    public boolean harckontrol() {
        if(this.harc<200){
            System.out.println("lutfen yurtdisi harcinizi yatirin!");
            return false;
        }
        else{
            System.out.println("yurtdisi harc islemi onaylandi!");
            return true;
        }
    }

    @Override
    public boolean vizekontrol() {
        
        if(vize==true){
            System.out.println("vizeniz aktif yurtdisina cikabilirsiniz!");
            return true;
        }
        else{
            System.out.println("vizeniz yok ya da zamani dolmus, yurtdisina cikamazsiniz!");
            return false;
        }
        
        
    }

    @Override
    public boolean siyasiyasakkontrol() {
        
        if(this.siyasiyasak==true){
            System.out.println("siyasi yasaginiz bulunmakta yurtdisina cikamazsiniz!");
            return true;
        }
        
        else{
            System.out.println("herhangi bir siyasi yasaginiz bulunmamakta,yurtdisina cikabilirsiniz");
        return false;
        }
       
    }

    
}
