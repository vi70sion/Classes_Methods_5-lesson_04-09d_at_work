public class Darbuotojas {
    private String vardas, pavarde, asmensKodas;
    private int amzius;
    private String pareigos;
    private int darboPatirtis;

    public Darbuotojas(String vardas, String pavarde, String asmensKodas){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.asmensKodas = asmensKodas;
        this.amzius = suraskAmziu();
    }

    public String getVardas() {
        return vardas;
    }
    public String getAsmensKodas() {
        return asmensKodas;
    }
    public void setPareigos(String pareigos){
        this.pareigos = pareigos;
    }
    public void setDarboPatirtis(int darboPatirtis){
        this.darboPatirtis = darboPatirtis;
    }

    private int suraskAmziu(){
        int amzius;
        System.out.println(Integer.parseInt(getAsmensKodas().substring(1, 3)));
        if(getAsmensKodas().charAt(0) == '3' || getAsmensKodas().charAt(0) == '4'){
            amzius = 2024 - 1900 - Integer.parseInt(getAsmensKodas().substring(1, 3));
        } else amzius = 2024 - 2000 - Integer.parseInt(getAsmensKodas().substring(1, 3));
        return amzius;
    }

    public String toString(){
        return vardas + " " + pavarde + " " + pareigos + " " + amzius + " " + darboPatirtis;
    }
}


