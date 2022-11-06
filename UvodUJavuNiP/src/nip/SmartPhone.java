package nip;

class SmartPhone implements Phone, Camera, Player {
	
	@Override
    public void zovi(String broj) {
        System.out.println("Pozovi " + broj);
    }
    
    @Override
    public void play() {
        System.out.println("Pusti pesmu");
    }
    
    @Override
    public void stop() {
        System.out.println("Zaustavi pesmu");
    }
    
    @Override
    public void takePicture()  {
        System.out.println("Slikaj");
    }
    
    @Override
    public void takeVideo() {
        System.out.println("Snimi video");
    }


}
