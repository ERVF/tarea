public class Car {
    
    //Estos Fields o atributos representan el estado del objeto.
    private final String brand;
    private final int gears;
    private final String Transmision;
    private final String hp;
    
    public Car (String aBrand, int aGear, String aTr, String aHp){
        this.brand = aBrand;
        this.gears = aGear;
        this.Transmision = aTr;
        this.hp = aHp;
    }
    
    //El comportamiento se representa a través de métodos.
    public String stop(){
        return "Vamos frenando...";        
    }
    
    public String accelerate(){
        return "Vamos acelerando...";
    }
    
    public String showState(){
        return "Marca: "+ brand + " Velocidades: "+ gears + " Transmision: " + Transmision + " HP: "+hp;
    }

}
